package com.iitp.signagekiosk.intro

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.iitp.signagekiosk.ConnectionStatus
import com.iitp.signagekiosk.NavGraphDirections
import com.iitp.signagekiosk.R

public class IntroFragmentDirections private constructor() {
  public companion object {
    public fun actionIntroFragmentToGuideFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_introFragment_to_guideFragment)

    public fun actionGlobalIntroFragment(): NavDirections =
        NavGraphDirections.actionGlobalIntroFragment()

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        NavGraphDirections.actionGlobalDisconnectionDialog(connection)
  }
}
