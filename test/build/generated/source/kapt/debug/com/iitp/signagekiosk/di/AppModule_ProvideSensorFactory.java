// Generated by Dagger (https://dagger.dev).
package com.iitp.signagekiosk.di;

import com.iitp.signagekiosk.vital_sensor.Sensor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSensorFactory implements Factory<Sensor> {
  @Override
  public Sensor get() {
    return provideSensor();
  }

  public static AppModule_ProvideSensorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Sensor provideSensor() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSensor());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideSensorFactory INSTANCE = new AppModule_ProvideSensorFactory();
  }
}
