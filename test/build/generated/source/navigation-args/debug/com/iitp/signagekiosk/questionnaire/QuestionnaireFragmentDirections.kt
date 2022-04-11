package com.iitp.signagekiosk.questionnaire

import android.os.Bundle
import androidx.navigation.NavDirections
import com.iitp.signagekiosk.ConnectionStatus
import com.iitp.signagekiosk.NavGraphDirections
import com.iitp.signagekiosk.R
import kotlin.Int
import kotlin.String

public class QuestionnaireFragmentDirections private constructor() {
  private data class ActionQuestionnaireFragmentToEmergencyDialog(
    public val text: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_questionnaireFragment_to_emergencyDialog

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("text", this.text)
        return result
      }
  }

  public companion object {
    public fun actionQuestionnaireFragmentToEmergencyDialog(text: String = ""): NavDirections =
        ActionQuestionnaireFragmentToEmergencyDialog(text)

    public fun actionGlobalIntroFragment(): NavDirections =
        NavGraphDirections.actionGlobalIntroFragment()

    public fun actionGlobalDisconnectionDialog(connection: ConnectionStatus): NavDirections =
        NavGraphDirections.actionGlobalDisconnectionDialog(connection)
  }
}
