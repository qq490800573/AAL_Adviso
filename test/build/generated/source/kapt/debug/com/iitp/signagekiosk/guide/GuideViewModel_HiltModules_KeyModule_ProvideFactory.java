// Generated by Dagger (https://dagger.dev).
package com.iitp.signagekiosk.guide;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GuideViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static GuideViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(GuideViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final GuideViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new GuideViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
