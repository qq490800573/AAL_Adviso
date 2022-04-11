package com.iitp.signagekiosk

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class NavGraphDirections private constructor() {
  private data class ActionGlobalDisconnectionDialog(
    public val connection: ConnectionStatus
  ) : NavDirections {
    public override val actionId: Int = R.id.action_global_disconnectionDialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionGlobalIntroFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_introFragment)

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        ActionGlobalDisconnectionDialog(connection)
  }
}
