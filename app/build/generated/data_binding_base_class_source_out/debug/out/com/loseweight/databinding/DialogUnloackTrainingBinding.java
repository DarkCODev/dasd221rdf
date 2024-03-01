// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogUnloackTrainingBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final LinearLayout llRemoveAds;

  @NonNull
  public final LinearLayout llUnlockOnce;

  protected DialogUnloackTrainingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgBack, LinearLayout llRemoveAds, LinearLayout llUnlockOnce) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgBack = imgBack;
    this.llRemoveAds = llRemoveAds;
    this.llUnlockOnce = llUnlockOnce;
  }

  @NonNull
  public static DialogUnloackTrainingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_unloack_training, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogUnloackTrainingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogUnloackTrainingBinding>inflateInternal(inflater, R.layout.dialog_unloack_training, root, attachToRoot, component);
  }

  @NonNull
  public static DialogUnloackTrainingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_unloack_training, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogUnloackTrainingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogUnloackTrainingBinding>inflateInternal(inflater, R.layout.dialog_unloack_training, null, false, component);
  }

  public static DialogUnloackTrainingBinding bind(@NonNull View view) {
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
  public static DialogUnloackTrainingBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogUnloackTrainingBinding)bind(component, view, R.layout.dialog_unloack_training);
  }
}
