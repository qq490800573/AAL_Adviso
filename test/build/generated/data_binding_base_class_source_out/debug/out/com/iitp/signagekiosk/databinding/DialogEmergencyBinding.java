// Generated by data binding compiler. Do not edit!
package com.iitp.signagekiosk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.iitp.signagekiosk.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogEmergencyBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView5;

  @Bindable
  protected String mText;

  protected DialogEmergencyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout frameLayout, ImageView imageView15, ImageView imageView16,
      ImageView imageView17, TextView textView25, TextView textView26, TextView textView5) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameLayout = frameLayout;
    this.imageView15 = imageView15;
    this.imageView16 = imageView16;
    this.imageView17 = imageView17;
    this.textView25 = textView25;
    this.textView26 = textView26;
    this.textView5 = textView5;
  }

  public abstract void setText(@Nullable String text);

  @Nullable
  public String getText() {
    return mText;
  }

  @NonNull
  public static DialogEmergencyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_emergency, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogEmergencyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogEmergencyBinding>inflateInternal(inflater, R.layout.dialog_emergency, root, attachToRoot, component);
  }

  @NonNull
  public static DialogEmergencyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_emergency, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogEmergencyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogEmergencyBinding>inflateInternal(inflater, R.layout.dialog_emergency, null, false, component);
  }

  public static DialogEmergencyBinding bind(@NonNull View view) {
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
  public static DialogEmergencyBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogEmergencyBinding)bind(component, view, R.layout.dialog_emergency);
  }
}
