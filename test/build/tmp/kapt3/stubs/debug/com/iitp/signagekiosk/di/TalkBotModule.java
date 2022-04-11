package com.iitp.signagekiosk.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/iitp/signagekiosk/di/TalkBotModule;", "", "()V", "provideTalkBot", "Lcom/iitp/saltlux_talkbot/TalkBot;", "applicationContext", "Landroid/content/Context;", "provideTalkReader", "Lcom/iitp/saltlux_talkbot/TalkReader;", "appkiosk_debug"})
@dagger.Module()
public final class TalkBotModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.iitp.signagekiosk.di.TalkBotModule INSTANCE = null;
    
    private TalkBotModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.iitp.saltlux_talkbot.TalkBot provideTalkBot(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context applicationContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @dagger.Provides()
    public final com.iitp.saltlux_talkbot.TalkReader provideTalkReader() {
        return null;
    }
}