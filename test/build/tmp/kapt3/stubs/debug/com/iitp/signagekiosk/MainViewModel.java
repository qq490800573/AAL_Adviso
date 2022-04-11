package com.iitp.signagekiosk;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/iitp/signagekiosk/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "serverStateChecker", "Lcom/iitp/saltlux_talkbot/util/ServerStatusChecker;", "sensor", "Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "(Lcom/iitp/saltlux_talkbot/util/ServerStatusChecker;Lcom/iitp/signagekiosk/vital_sensor/Sensor;)V", "connectionStatus", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/iitp/signagekiosk/ConnectionStatus;", "getConnectionStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "detection", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/iitp/signagekiosk/vital_sensor/Detection;", "getDetection", "()Lkotlinx/coroutines/flow/SharedFlow;", "sensorConnection", "", "serverConnection", "Lcom/iitp/saltlux_talkbot/util/NetworkStatus;", "resetSensorState", "", "appkiosk_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.iitp.signagekiosk.vital_sensor.Sensor sensor = null;
    private final kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.util.NetworkStatus> serverConnection = null;
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> sensorConnection = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.iitp.signagekiosk.ConnectionStatus> connectionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.Detection> detection = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.iitp.saltlux_talkbot.util.ServerStatusChecker serverStateChecker, @org.jetbrains.annotations.NotNull()
    com.iitp.signagekiosk.vital_sensor.Sensor sensor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.iitp.signagekiosk.ConnectionStatus> getConnectionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.Detection> getDetection() {
        return null;
    }
    
    public final void resetSensorState() {
    }
}