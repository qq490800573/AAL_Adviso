package com.iitp.signagekiosk

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DisconnectionDialogArgs(
  public val connection: ConnectionStatus
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
      result.putParcelable("connection", this.connection as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
      result.putSerializable("connection", this.connection as Serializable)
    } else {
      throw UnsupportedOperationException(ConnectionStatus::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
      result.set("connection", this.connection as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
      result.set("connection", this.connection as Serializable)
    } else {
      throw UnsupportedOperationException(ConnectionStatus::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DisconnectionDialogArgs {
      bundle.setClassLoader(DisconnectionDialogArgs::class.java.classLoader)
      val __connection : ConnectionStatus?
      if (bundle.containsKey("connection")) {
        if (Parcelable::class.java.isAssignableFrom(ConnectionStatus::class.java) ||
            Serializable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
          __connection = bundle.get("connection") as ConnectionStatus?
        } else {
          throw UnsupportedOperationException(ConnectionStatus::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__connection == null) {
          throw IllegalArgumentException("Argument \"connection\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"connection\" is missing and does not have an android:defaultValue")
      }
      return DisconnectionDialogArgs(__connection)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DisconnectionDialogArgs {
      val __connection : ConnectionStatus?
      if (savedStateHandle.contains("connection")) {
        if (Parcelable::class.java.isAssignableFrom(ConnectionStatus::class.java) ||
            Serializable::class.java.isAssignableFrom(ConnectionStatus::class.java)) {
          __connection = savedStateHandle.get<ConnectionStatus?>("connection")
        } else {
          throw UnsupportedOperationException(ConnectionStatus::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__connection == null) {
          throw IllegalArgumentException("Argument \"connection\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"connection\" is missing and does not have an android:defaultValue")
      }
      return DisconnectionDialogArgs(__connection)
    }
  }
}
