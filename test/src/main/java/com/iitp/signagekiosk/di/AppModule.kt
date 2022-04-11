package com.iitp.signagekiosk.di

import android.content.Context
import com.iitp.saltlux_talkbot.util.ServerStatusChecker
import com.iitp.signagekiosk.vital_sensor.Sensor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideServerStatusChecker(@ApplicationContext applicationContext: Context) =
        ServerStatusChecker(context = applicationContext)

    @Provides
    @Singleton
    fun provideSensor() = Sensor()

}