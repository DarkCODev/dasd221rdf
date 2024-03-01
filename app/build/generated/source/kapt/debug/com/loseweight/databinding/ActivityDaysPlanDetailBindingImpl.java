package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDaysPlanDetailBindingImpl extends ActivityDaysPlanDetailBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content, 6);
        sViewsWithIds.put(R.id.appbar, 7);
        sViewsWithIds.put(R.id.collapsing_toolbar, 8);
        sViewsWithIds.put(R.id.imgCover, 9);
        sViewsWithIds.put(R.id.tvTitle, 10);
        sViewsWithIds.put(R.id.pbDay, 11);
        sViewsWithIds.put(R.id.tvDaysLeft, 12);
        sViewsWithIds.put(R.id.toolbar, 13);
        sViewsWithIds.put(R.id.llTopTitle, 14);
        sViewsWithIds.put(R.id.tvTitleText_, 15);
        sViewsWithIds.put(R.id.nestedScrollView, 16);
        sViewsWithIds.put(R.id.rvDays, 17);
        sViewsWithIds.put(R.id.llChangePlan, 18);
        sViewsWithIds.put(R.id.llAdView, 19);
        sViewsWithIds.put(R.id.llAdViewFacebook, 20);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final com.common.view.CTextView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView4;
    @NonNull
    private final com.common.view.CTextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDaysPlanDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityDaysPlanDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[16]
            , (android.widget.ProgressBar) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.appcompat.widget.Toolbar) bindings[13]
            , (com.common.view.CTextView) bindings[12]
            , (com.common.view.CBTextView) bindings[10]
            , (com.common.view.CBTextView) bindings[15]
            );
        this.imgBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.common.view.CTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.common.view.CTextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.handler == variableId) {
            setHandler((com.loseweight.DaysPlanDetailActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.DaysPlanDetailActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback6);
            this.mboundView2.setOnClickListener(mCallback7);
            this.mboundView3.setOnClickListener(mCallback8);
            this.mboundView4.setOnClickListener(mCallback9);
            this.mboundView5.setOnClickListener(mCallback10);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onReStartClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onReStartClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onChangePlanClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onChangePlanClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.DaysPlanDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBackClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}