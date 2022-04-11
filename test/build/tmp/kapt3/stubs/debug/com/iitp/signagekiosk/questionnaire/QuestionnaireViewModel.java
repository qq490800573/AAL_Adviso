package com.iitp.signagekiosk.questionnaire;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HJ\u0010\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020\u00102\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010M\u001a\u00020\u00102\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010N\u001a\u00020\u0010H\u0002J\b\u0010O\u001a\u00020\u0010H\u0002J\b\u0010P\u001a\u00020\u0010H\u0014J\u0006\u0010Q\u001a\u00020\u0010J\u0010\u0010R\u001a\u00020\u00102\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010S\u001a\u00020\u00102\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010T\u001a\u00020\u0010H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u001b\u0010&\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u001b\u0010.\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\'\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\'\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00130!\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010#R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0!\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010#R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0!\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006U"}, d2 = {"Lcom/iitp/signagekiosk/questionnaire/QuestionnaireViewModel;", "Landroidx/lifecycle/ViewModel;", "talkBot", "Lcom/iitp/saltlux_talkbot/TalkBot;", "talkReader", "Lcom/iitp/saltlux_talkbot/TalkReader;", "sensor", "Lcom/iitp/signagekiosk/vital_sensor/Sensor;", "(Lcom/iitp/saltlux_talkbot/TalkBot;Lcom/iitp/saltlux_talkbot/TalkReader;Lcom/iitp/signagekiosk/vital_sensor/Sensor;)V", "_answerType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/iitp/saltlux_talkbot/AnswerType;", "_canGoPrevious", "", "_dismissEmergencyDialogEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lcom/iitp/signagekiosk/Event;", "_heartRate", "", "_navigateToIntroEvent", "_onStep3", "_prevAnswer", "_question", "_respiration", "_resultAbnormal", "_resultAbnormalContent", "_resultNormal", "_showEmergencyDialogEvent", "_temperature", "_voiceVolume", "", "answerType", "Lkotlinx/coroutines/flow/StateFlow;", "getAnswerType", "()Lkotlinx/coroutines/flow/StateFlow;", "canGoPrevious", "getCanGoPrevious", "dismissEmergencyDialogEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getDismissEmergencyDialogEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "heartRate", "getHeartRate", "motion", "getMotion", "navigateToIntroEvent", "getNavigateToIntroEvent", "onStep3", "getOnStep3", "prevAnswer", "getPrevAnswer", "question", "getQuestion", "respiration", "getRespiration", "resultAbnormal", "getResultAbnormal", "resultAbnormalContent", "getResultAbnormalContent", "resultNormal", "getResultNormal", "showEmergencyDialogEvent", "getShowEmergencyDialogEvent", "temperature", "getTemperature", "voiceOn", "getVoiceOn", "voiceVolume", "getVoiceVolume", "abnormalFinishTalk", "text", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayInformation", "talk", "Lcom/iitp/saltlux_talkbot/Talk;", "displayTalk", "emergencyTalk", "measureTemperature", "normalFinishTalk", "onCleared", "onClickToHome", "readTalk", "sensorTalk", "startSensorMeasurement", "appkiosk_debug"})
public final class QuestionnaireViewModel extends androidx.lifecycle.ViewModel {
    private final com.iitp.saltlux_talkbot.TalkBot talkBot = null;
    private final com.iitp.saltlux_talkbot.TalkReader talkReader = null;
    private final com.iitp.signagekiosk.vital_sensor.Sensor sensor = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _question = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> question = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.iitp.saltlux_talkbot.AnswerType> _answerType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.AnswerType> answerType = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _canGoPrevious = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> canGoPrevious = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _prevAnswer = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> prevAnswer = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _voiceVolume = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> voiceVolume = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> voiceOn = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _temperature = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> temperature = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _respiration = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> respiration = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _heartRate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> heartRate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> motion = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _navigateToIntroEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> navigateToIntroEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _onStep3 = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> onStep3 = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _resultNormal = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> resultNormal = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> _showEmergencyDialogEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.String> showEmergencyDialogEvent = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _dismissEmergencyDialogEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> dismissEmergencyDialogEvent = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _resultAbnormal = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> resultAbnormal = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _resultAbnormalContent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> resultAbnormalContent = null;
    
    @javax.inject.Inject()
    public QuestionnaireViewModel(@org.jetbrains.annotations.NotNull()
    com.iitp.saltlux_talkbot.TalkBot talkBot, @org.jetbrains.annotations.NotNull()
    com.iitp.saltlux_talkbot.TalkReader talkReader, @org.jetbrains.annotations.NotNull()
    com.iitp.signagekiosk.vital_sensor.Sensor sensor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.iitp.saltlux_talkbot.AnswerType> getAnswerType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getCanGoPrevious() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getPrevAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getVoiceVolume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getVoiceOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getRespiration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getHeartRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getMotion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getNavigateToIntroEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getOnStep3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getResultNormal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.String> getShowEmergencyDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getDismissEmergencyDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getResultAbnormal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getResultAbnormalContent() {
        return null;
    }
    
    private final void readTalk(com.iitp.saltlux_talkbot.Talk talk) {
    }
    
    private final void normalFinishTalk() {
    }
    
    private final void displayTalk(com.iitp.saltlux_talkbot.Talk talk) {
    }
    
    private final void displayInformation(com.iitp.saltlux_talkbot.Talk talk) {
    }
    
    private final void emergencyTalk(com.iitp.saltlux_talkbot.Talk talk) {
    }
    
    private final java.lang.Object abnormalFinishTalk(java.lang.String text, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void sensorTalk(com.iitp.saltlux_talkbot.Talk talk) {
    }
    
    private final void measureTemperature() {
    }
    
    private final void startSensorMeasurement() {
    }
    
    public final void onClickToHome() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}