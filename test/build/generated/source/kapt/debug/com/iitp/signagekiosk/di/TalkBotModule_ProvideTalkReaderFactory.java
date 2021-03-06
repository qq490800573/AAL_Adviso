// Generated by Dagger (https://dagger.dev).
package com.iitp.signagekiosk.di;

import com.iitp.saltlux_talkbot.TalkReader;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TalkBotModule_ProvideTalkReaderFactory implements Factory<TalkReader> {
  @Override
  public TalkReader get() {
    return provideTalkReader();
  }

  public static TalkBotModule_ProvideTalkReaderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TalkReader provideTalkReader() {
    return Preconditions.checkNotNullFromProvides(TalkBotModule.INSTANCE.provideTalkReader());
  }

  private static final class InstanceHolder {
    private static final TalkBotModule_ProvideTalkReaderFactory INSTANCE = new TalkBotModule_ProvideTalkReaderFactory();
  }
}
