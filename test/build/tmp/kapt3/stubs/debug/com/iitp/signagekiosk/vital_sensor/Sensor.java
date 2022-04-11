package com.iitp.signagekiosk.vital_sensor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000245B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0011\u00102\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020$0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u001c\u0010)\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "", "()V", "_motion", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "kotlin.jvm.PlatformType", "bluetoothSocket", "Landroid/bluetooth/BluetoothSocket;", "correction", "", "detectPredicate", "Lkotlin/Function2;", "Lcom/iitp/signagekiosk/vital_sensor/SensorData;", "Lkotlin/coroutines/Continuation;", "Lkotlin/jvm/functions/Function2;", "detectThreshold", "", "detection", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/iitp/signagekiosk/vital_sensor/Detection;", "getDetection", "()Lkotlinx/coroutines/flow/SharedFlow;", "device", "Landroid/bluetooth/BluetoothDevice;", "distance", "Lkotlinx/coroutines/flow/Flow;", "Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance;", "fallbackSensorData", "isConnected", "isDetected", "isMeasurable", "()Lkotlinx/coroutines/flow/Flow;", "measurablePositionState", "Lcom/iitp/signagekiosk/vital_sensor/PositionState;", "motion", "getMotion", "positionState", "getPositionState", "rawSensorData", "receiveSensorData", "getReceiveSensorData", "scope", "Lkotlinx/coroutines/CoroutineScope;", "state", "calibration", "", "resetState", "startSensorMeasurement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Distance", "RangeDataSet", "appkiosk_debug"})
public final class Sensor {
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter = null;
    private final android.bluetooth.BluetoothDevice device = null;
    private android.bluetooth.BluetoothSocket bluetoothSocket;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> isConnected = null;
    private com.iitp.signagekiosk.vital_sensor.SensorData fallbackSensorData;
    private final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.SensorData> rawSensorData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.SensorData> receiveSensorData = null;
    private final long detectThreshold = 3500L;
    private final kotlin.jvm.functions.Function2<com.iitp.signagekiosk.vital_sensor.SensorData, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> detectPredicate = null;
    private final double[] correction = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isDetected = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> _motion = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> motion = null;
    private com.iitp.signagekiosk.vital_sensor.Detection state = com.iitp.signagekiosk.vital_sensor.Detection.IDLE;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.Detection> detection = null;
    private final kotlinx.coroutines.flow.Flow<com.iitp.signagekiosk.vital_sensor.Sensor.Distance> distance = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.PositionState> positionState = null;
    private final com.iitp.signagekiosk.vital_sensor.PositionState measurablePositionState = com.iitp.signagekiosk.vital_sensor.PositionState.FIT;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isMeasurable = null;
    
    public Sensor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> isConnected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.SensorData> getReceiveSensorData() {
        return null;
    }
    
    public final void calibration() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> getMotion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object startSensorMeasurement(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.iitp.signagekiosk.vital_sensor.SensorData> continuation) {
        return null;
    }
    
    public final void resetState() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.Detection> getDetection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.iitp.signagekiosk.vital_sensor.PositionState> getPositionState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isMeasurable() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/iitp/signagekiosk/vital_sensor/Sensor$RangeDataSet;", "", "xRange", "", "", "yValue", "(Ljava/util/List;Ljava/util/List;)V", "peakDistance", "Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance;", "getPeakDistance", "()Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance;", "getXRange", "()Ljava/util/List;", "getYValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "appkiosk_debug"})
    static final class RangeDataSet {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Double> xRange = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Double> yValue = null;
        @org.jetbrains.annotations.NotNull()
        private final com.iitp.signagekiosk.vital_sensor.Sensor.Distance peakDistance = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.iitp.signagekiosk.vital_sensor.Sensor.RangeDataSet copy(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Double> xRange, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Double> yValue) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RangeDataSet(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Double> xRange, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Double> yValue) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Double> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Double> getXRange() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Double> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Double> getYValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iitp.signagekiosk.vital_sensor.Sensor.Distance getPeakDistance() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0082\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance;", "", "(Ljava/lang/String;I)V", "D50", "D60", "D70", "D80", "D90", "D100", "D110", "D120", "NONE", "Companion", "appkiosk_debug"})
    static enum Distance {
        /*public static final*/ D50 /* = new D50() */,
        /*public static final*/ D60 /* = new D60() */,
        /*public static final*/ D70 /* = new D70() */,
        /*public static final*/ D80 /* = new D80() */,
        /*public static final*/ D90 /* = new D90() */,
        /*public static final*/ D100 /* = new D100() */,
        /*public static final*/ D110 /* = new D110() */,
        /*public static final*/ D120 /* = new D120() */,
        /*public static final*/ NONE /* = new NONE() */;
        @org.jetbrains.annotations.NotNull()
        public static final com.iitp.signagekiosk.vital_sensor.Sensor.Distance.Companion Companion = null;
        
        Distance() {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance$Companion;", "", "()V", "fromDouble", "Lcom/iitp/signagekiosk/vital_sensor/Sensor$Distance;", "value", "", "appkiosk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.iitp.signagekiosk.vital_sensor.Sensor.Distance fromDouble(double value) {
                return null;
            }
        }
    }
}