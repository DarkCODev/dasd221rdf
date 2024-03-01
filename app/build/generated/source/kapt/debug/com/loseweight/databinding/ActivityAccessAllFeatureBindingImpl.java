package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAccessAllFeatureBindingImpl extends ActivityAccessAllFeatureBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_image, 5);
        sViewsWithIds.put(R.id.view_mask, 6);
        sViewsWithIds.put(R.id.tvDes, 7);
        sViewsWithIds.put(R.id.llPerMonth, 8);
        sViewsWithIds.put(R.id.tvMonthlyTitle, 9);
        sViewsWithIds.put(R.id.tvMonthlyPrice, 10);
        sViewsWithIds.put(R.id.imgCheckMonthly, 11);
        sViewsWithIds.put(R.id.llPerYear, 12);
        sViewsWithIds.put(R.id.tvYearlyTitle, 13);
        sViewsWithIds.put(R.id.tvYearlyPrice, 14);
        sViewsWithIds.put(R.id.imgCheckYearly, 15);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAccessAllFeatureBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityAccessAllFeatureBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBButtonView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.common.view.CTextView) bindings[7]
            , (com.common.view.CTextView) bindings[10]
            , (com.common.view.CBTextView) bindings[9]
            , (com.common.view.CTextView) bindings[14]
            , (com.common.view.CBTextView) bindings[13]
            , (android.view.View) bindings[6]
            );
        this.btnContinue.setTag(null);
        this.imgBack.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback28 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback29 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback30 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback31 = new com.loseweight.generated.callback.OnClickListener(this, 4);
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
            setHandler((com.loseweight.AccessAllFeaturesActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.AccessAllFeaturesActivity.ClickHandler Handler) {
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
        com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnContinue.setOnClickListener(mCallback31);
            this.imgBack.setOnClickListener(mCallback28);
            this.mboundView2.setOnClickListener(mCallback29);
            this.mboundView3.setOnClickListener(mCallback30);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBackClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPerMonthClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onYearlyClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.AccessAllFeaturesActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onContinueClick();
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