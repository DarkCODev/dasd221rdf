// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.common.view.CBTextView;
import com.common.view.CMTextView;
import com.common.view.CTextView;
import com.loseweight.R;
import com.scwang.wave.MultiWaveHeader;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityWaterTrackerBinding extends ViewDataBinding {
  @NonNull
  public final CMTextView CMTextView;

  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final MultiWaveHeader multiWaveHeader;

  @NonNull
  public final CTextView tvCups;

  @NonNull
  public final CBTextView tvPercentage;

  @Bindable
  protected Boolean mIsLoading;

  protected ActivityWaterTrackerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CMTextView CMTextView, AppCompatImageView imgBack, RelativeLayout llAdView,
      LinearLayout llAdViewFacebook, MultiWaveHeader multiWaveHeader, CTextView tvCups,
      CBTextView tvPercentage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.CMTextView = CMTextView;
    this.imgBack = imgBack;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.multiWaveHeader = multiWaveHeader;
    this.tvCups = tvCups;
    this.tvPercentage = tvPercentage;
  }

  public abstract void setIsLoading(@Nullable Boolean isLoading);

  @Nullable
  public Boolean getIsLoading() {
    return mIsLoading;
  }

  @NonNull
  public static ActivityWaterTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_water_tracker, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWaterTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityWaterTrackerBinding>inflateInternal(inflater, R.layout.activity_water_tracker, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityWaterTrackerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_water_tracker, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityWaterTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityWaterTrackerBinding>inflateInternal(inflater, R.layout.activity_water_tracker, null, false, component);
  }

  public static ActivityWaterTrackerBinding bind(@NonNull View view) {
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
  public static ActivityWaterTrackerBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityWaterTrackerBinding)bind(component, view, R.layout.activity_water_tracker);
  }
}
