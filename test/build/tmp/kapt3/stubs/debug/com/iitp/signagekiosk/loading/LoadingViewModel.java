package com.iitp.signagekiosk.loading;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010#\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/iitp/signagekiosk/loading/LoadingViewModel;", "Landroidx/lifecycle/ViewModel;", "sensor", "Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "(Lcom/iitp/signagekiosk/vital_sensor/Sensor;)V", "_guideCompleteEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lcom/iitp/signagekiosk/Event;", "_loadingCompleteEvent", "_progress", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_remainSecond", "guideCompleteEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getGuideCompleteEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "loadingCompleteEvent", "getLoadingCompleteEvent", "loadingSecond", "progress", "Lkotlinx/coroutines/flow/StateFlow;", "getProgress", "()Lkotlinx/coroutines/flow/StateFlow;", "progressMax", "getProgressMax", "()I", "remainSecond", "getRemainSecond", "sample", "waitingJob", "Lkotlinx/coroutines/Job;", "waitingTimeMillis", "", "startProgress", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitingForGuideComplete", "appkiosk_debug"})
public final class LoadingViewModel extends androidx.lifecycle.ViewModel {
    private final int sample = 100;
    private final int loadingSecond = 3;
    private final int progressMax = 0;
    private kotlinx.coroutines.Job waitingJob;
    private final long waitingTimeMillis = 4000L;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _guideCompleteEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> guideCompleteEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _progress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> progress = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _remainSecond = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> remainSecond = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _loadingCompleteEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> loadingCompleteEvent = null;
    
    @javax.inject.Inject()
    public LoadingViewModel(@org.jetbrains.annotations.NotNull()
    com.iitp.signagekiosk.vital_sensor.Sensor sensor) {
        super();
    }
    
    public final int getProgressMax() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getGuideCompleteEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getRemainSecond() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getLoadingCompleteEvent() {
        return null;
    }
    
    private final java.lang.Object waitingForGuideComplete(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object startProgress(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}