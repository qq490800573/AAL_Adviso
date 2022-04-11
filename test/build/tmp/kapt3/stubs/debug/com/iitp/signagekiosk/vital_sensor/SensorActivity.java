package com.iitp.signagekiosk.vital_sensor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/iitp/signagekiosk/vital_sensor/SensorActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "binding", "Lcom/iitp/signagekiosk/databinding/ActivitySensorBinding;", "sensor", "Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "getSensor", "()Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "setSensor", "(Lcom/iitp/signagekiosk/vital_sensor/Sensor;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "appkiosk_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SensorActivity extends androidx.fragment.app.FragmentActivity {
    private com.iitp.signagekiosk.databinding.ActivitySensorBinding binding;
    @javax.inject.Inject()
    public com.iitp.signagekiosk.vital_sensor.Sensor sensor;
    
    public SensorActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iitp.signagekiosk.vital_sensor.Sensor getSensor() {
        return null;
    }
    
    public final void setSensor(@org.jetbrains.annotations.NotNull()
    com.iitp.signagekiosk.vital_sensor.Sensor p0) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}