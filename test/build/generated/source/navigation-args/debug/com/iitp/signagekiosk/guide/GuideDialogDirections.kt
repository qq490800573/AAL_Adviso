package com.iitp.signagekiosk.guide

import androidx.navigation.NavDirections
import com.iitp.signagekiosk.ConnectionStatus
import com.iitp.signagekiosk.NavGraphDirections

public class GuideDialogDirections private constructor() {
  public companion object {
    public fun actionGlobalIntroFragment(): NavDirections =
        NavGraphDirections.actionGlobalIntroFragment()

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        NavGraphDirections.actionGlobalDisconnectionDialog(connection)
  }
}
