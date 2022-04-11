package com.iitp.signagekiosk.di

import android.content.Context
import com.iitp.saltlux_talkbot.TalkBot
import com.iitp.saltlux_talkbot.TalkReader
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TalkBotModule {

    @Provides
    @ViewModelScoped
    fun provideTalkBot(@ApplicationContext applicationContext: Context) =
        TalkBot.getInstance(context = applicationContext)

    @Provides
    @ViewModelScoped
    fun provideTalkReader() = TalkReader()

}