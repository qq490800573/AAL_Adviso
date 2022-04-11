// Generated by Dagger (https://dagger.dev).
package com.iitp.signagekiosk.vital_sensor;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SensorActivity_MembersInjector implements MembersInjector<SensorActivity> {
  private final Provider<Sensor> sensorProvider;

  public SensorActivity_MembersInjector(Provider<Sensor> sensorProvider) {
    this.sensorProvider = sensorProvider;
  }

  public static MembersInjector<SensorActivity> create(Provider<Sensor> sensorProvider) {
    return new SensorActivity_MembersInjector(sensorProvider);
  }

  @Override
  public void injectMembers(SensorActivity instance) {
    injectSensor(instance, sensorProvider.get());
  }

  @InjectedFieldSignature("com.iitp.signagekiosk.vital_sensor.SensorActivity.sensor")
  public static void injectSensor(SensorActivity instance, Sensor sensor) {
    instance.sensor = sensor;
  }
}