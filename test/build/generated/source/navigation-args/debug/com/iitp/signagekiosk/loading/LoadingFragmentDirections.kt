package com.iitp.signagekiosk.loading

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.iitp.signagekiosk.ConnectionStatus
import com.iitp.signagekiosk.NavGraphDirections
import com.iitp.signagekiosk.R

public class LoadingFragmentDirections private constructor() {
  public companion object {
    public fun actionGuideFragmentToGuideDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.action_guideFragment_to_guideDialog)

    public fun actionGuideFragmentToQuestionnaireFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_guideFragment_to_questionnaireFragment)

    public fun actionGlobalIntroFragment(): NavDirections =
        NavGraphDirections.actionGlobalIntroFragment()

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        NavGraphDirections.actionGlobalDisconnectionDialog(connection)
  }
}
