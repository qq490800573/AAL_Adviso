package com.iitp.signagekiosk.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001aY\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u001021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u0011H\r\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u001aY\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\r*\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u001021\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u0011H\r\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u001a\u0012\u0010\u001a\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"fullScreen", "", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "Landroid/app/Activity;", "Landroidx/fragment/app/DialogFragment;", "logD", "", "message", "", "repeatOnStarted", "T", "Landroidx/fragment/app/Fragment;", "flow", "Lkotlinx/coroutines/flow/Flow;", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "(Landroidx/fragment/app/Fragment;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "toast", "Landroid/content/Context;", "resId", "", "appkiosk_debug"})
public final class ExtensionsKt {
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @androidx.annotation.StringRes()
    int resId) {
    }
    
    private static final void fullScreen(android.view.Window window, android.view.View view) {
    }
    
    public static final void fullScreen(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fullScreen, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final void fullScreen(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment $this$fullScreen, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final <T extends java.lang.Object>void repeatOnStarted(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$repeatOnStarted, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> flow, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    public static final <T extends java.lang.Object>void repeatOnStarted(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$repeatOnStarted, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> flow, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    public static final void logD(@org.jetbrains.annotations.NotNull()
    java.lang.Object $this$logD, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}