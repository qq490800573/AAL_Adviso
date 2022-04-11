package com.iitp.saltlux_talkbot.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import com.iitp.saltlux_talkbot.api_port
import com.iitp.saltlux_talkbot.api_url
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.*
import java.net.InetSocketAddress
import java.net.Socket

class ServerStatusChecker constructor(context: Context) {

    private val networkRequest = NetworkRequest.Builder()
        .addTransportType(NetworkCapabilities.TRANSPORT_ETHERNET)
        .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
        .build()

    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private val networkStatusFlow = callbackFlow {
        send(if (connectivityManager.isDefaultNetworkActive) NetworkStatus.CONNECTED else NetworkStatus.DISCONNECTED)
        val networkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                launch { send(NetworkStatus.CONNECTED) }
            }

            override fun onLost(network: Network) {
                launch { send(NetworkStatus.DISCONNECTED) }
            }
        }
        connectivityManager.registerNetworkCallback(networkRequest, networkCallback)
        awaitClose { connectivityManager.unregisterNetworkCallback(networkCallback) }
    }

    private val serverStatusFlow = callbackFlow {
        val inetSocketAddress = InetSocketAddress(api_url, api_port)
        while (isActive) {
            Socket().runCatching {
                connect(inetSocketAddress, 2000)
                close()
                send(NetworkStatus.CONNECTED)
            }.getOrElse {
                it.printStackTrace()
                send(NetworkStatus.DISCONNECTED)
            }
            delay(timeMillis = 1 * 60 * 1_000L)
        }
        awaitClose { }
    }

    val isAlive = combine(networkStatusFlow, serverStatusFlow) { networkStatus, serverStatus ->
        networkStatus and serverStatus
    }.distinctUntilChanged().stateIn(
        scope = CoroutineScope(context = Dispatchers.IO),
        started = SharingStarted.WhileSubscribed(),
        initialValue = NetworkStatus.DISCONNECTED
    )

}

enum class NetworkStatus {
    CONNECTED, DISCONNECTED;

    infix fun and(other: NetworkStatus): NetworkStatus {
        return if (this != other) DISCONNECTED
        else this
    }
}