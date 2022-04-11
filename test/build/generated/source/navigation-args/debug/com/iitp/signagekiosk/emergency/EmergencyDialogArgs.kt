package com.iitp.signagekiosk.emergency

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class EmergencyDialogArgs(
  public val text: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("text", this.text)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("text", this.text)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): EmergencyDialogArgs {
      bundle.setClassLoader(EmergencyDialogArgs::class.java.classLoader)
      val __text : String?
      if (bundle.containsKey("text")) {
        __text = bundle.getString("text")
        if (__text == null) {
          throw IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value.")
        }
      } else {
        __text = ""
      }
      return EmergencyDialogArgs(__text)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): EmergencyDialogArgs {
      val __text : String?
      if (savedStateHandle.contains("text")) {
        __text = savedStateHandle["text"]
        if (__text == null) {
          throw IllegalArgumentException("Argument \"text\" is marked as non-null but was passed a null value")
        }
      } else {
        __text = ""
      }
      return EmergencyDialogArgs(__text)
    }
  }
}
