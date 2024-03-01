// Generated by data binding compiler. Do not edit!
package com.loseweight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.common.view.CBButtonView;
import com.loseweight.CommonQuestionActivity;
import com.loseweight.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCommonQuestionBinding extends ViewDataBinding {
  @NonNull
  public final CBButtonView btnFeedBack;

  @NonNull
  public final LinearLayout llAdContainer;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final RecyclerView rvQuestions;

  @NonNull
  public final RecyclerView rvTitle;

  @NonNull
  public final TopbarBinding topbar;

  @Bindable
  protected CommonQuestionActivity.ClickHandler mHandler;

  protected ActivityCommonQuestionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CBButtonView btnFeedBack, LinearLayout llAdContainer,
      RelativeLayout llAdView, LinearLayout llAdViewFacebook, RecyclerView rvQuestions,
      RecyclerView rvTitle, TopbarBinding topbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnFeedBack = btnFeedBack;
    this.llAdContainer = llAdContainer;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.rvQuestions = rvQuestions;
    this.rvTitle = rvTitle;
    this.topbar = topbar;
  }

  public abstract void setHandler(@Nullable CommonQuestionActivity.ClickHandler handler);

  @Nullable
  public CommonQuestionActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityCommonQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_common_question, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCommonQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCommonQuestionBinding>inflateInternal(inflater, R.layout.activity_common_question, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCommonQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_common_question, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCommonQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCommonQuestionBinding>inflateInternal(inflater, R.layout.activity_common_question, null, false, component);
  }

  public static ActivityCommonQuestionBinding bind(@NonNull View view) {
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
  public static ActivityCommonQuestionBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCommonQuestionBinding)bind(component, view, R.layout.activity_common_question);
  }
}
