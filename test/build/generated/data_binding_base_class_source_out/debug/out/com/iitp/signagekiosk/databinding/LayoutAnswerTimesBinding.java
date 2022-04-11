// Generated by data binding compiler. Do not edit!
package com.iitp.signagekiosk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iitp.signagekiosk.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutAnswerTimesBinding extends ViewDataBinding {
  @NonNull
  public final TextView textView34;

  @NonNull
  public final TextView textView35;

  @NonNull
  public final TextView textView36;

  @NonNull
  public final TextView textView37;

  @Bindable
  protected boolean mIsVisible;

  protected LayoutAnswerTimesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textView34, TextView textView35, TextView textView36, TextView textView37) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textView34 = textView34;
    this.textView35 = textView35;
    this.textView36 = textView36;
    this.textView37 = textView37;
  }

  public abstract void setIsVisible(boolean isVisible);

  public boolean getIsVisible() {
    return mIsVisible;
  }

  @NonNull
  public static LayoutAnswerTimesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_answer_times, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutAnswerTimesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutAnswerTimesBinding>inflateInternal(inflater, R.layout.layout_answer_times, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutAnswerTimesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_answer_times, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutAnswerTimesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutAnswerTimesBinding>inflateInternal(inflater, R.layout.layout_answer_times, null, false, component);
  }

  public static LayoutAnswerTimesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutAnswerTimesBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutAnswerTimesBinding)bind(component, view, R.layout.layout_answer_times);
  }
}
