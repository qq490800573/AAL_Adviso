package com.iitp.signagekiosk;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/iitp/signagekiosk/ConnectionStatus;", "", "(Ljava/lang/String;I)V", "CONNECT", "NETWORK_DISCONNECT", "SENSOR_DISCONNECT", "appkiosk_debug"})
public enum ConnectionStatus {
    /*public static final*/ CONNECT /* = new CONNECT() */,
    /*public static final*/ NETWORK_DISCONNECT /* = new NETWORK_DISCONNECT() */,
    /*public static final*/ SENSOR_DISCONNECT /* = new SENSOR_DISCONNECT() */;
    
    ConnectionStatus() {
    }
}