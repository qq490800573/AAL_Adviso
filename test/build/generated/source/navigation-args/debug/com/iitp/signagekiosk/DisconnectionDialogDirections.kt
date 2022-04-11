package com.iitp.signagekiosk

import androidx.navigation.NavDirections

public class DisconnectionDialogDirections private constructor() {
  public companion object {
    public fun actionGlobalIntroFragment(): NavDirections =
        NavGraphDirections.actionGlobalIntroFragment()

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        NavGraphDirections.actionGlobalDisconnectionDialog(connection)
  }
}
