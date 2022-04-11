package com.iitp.signagekiosk

import androidx.annotation.Keep
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iitp.saltlux_talkbot.util.NetworkStatus
import com.iitp.saltlux_talkbot.util.ServerStatusChecker
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    serverStateChecker: ServerStatusChecker,
    private val sensor: Sensor,
) : ViewModel() {

    private val serverConnection = serverStateChecker.isAlive

    private val sensorConnection = sensor.isConnected

    val connectionStatus = serverConnection.combine(sensorConnection) { server, sensor ->
        when {
            server == NetworkStatus.CONNECTED && sensor -> ConnectionStatus.CONNECT
            server == NetworkStatus.CONNECTED && !sensor -> ConnectionStatus.SENSOR_DISCONNECT
            else -> ConnectionStatus.NETWORK_DISCONNECT
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = ConnectionStatus.NETWORK_DISCONNECT
    )

    val detection = sensor.detection

    fun resetSensorState() {
        sensor.resetState()
    }

}

@Keep
enum class ConnectionStatus {
    CONNECT, NETWORK_DISCONNECT, SENSOR_DISCONNECT
}