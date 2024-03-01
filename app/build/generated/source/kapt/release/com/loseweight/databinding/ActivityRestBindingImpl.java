package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRestBindingImpl extends ActivityRestBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rcyWorkoutStatus, 4);
        sViewsWithIds.put(R.id.progressBarTop, 5);
        sViewsWithIds.put(R.id.llReadyToGo, 6);
        sViewsWithIds.put(R.id.progressBarReadyToGo, 7);
        sViewsWithIds.put(R.id.tvCountDownReadyToGO, 8);
        sViewsWithIds.put(R.id.tvTotalEx, 9);
        sViewsWithIds.put(R.id.tvName, 10);
        sViewsWithIds.put(R.id.tvTime, 11);
        sViewsWithIds.put(R.id.viewFlipper, 12);
        sViewsWithIds.put(R.id.llAdView, 13);
        sViewsWithIds.put(R.id.llAdViewFacebook, 14);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityRestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityRestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBTextView) bindings[1]
            , (com.common.view.CBButtonView) bindings[2]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (com.mikhaellopez.circularprogressbar.CircularProgressBar) bindings[7]
            , (android.widget.ProgressBar) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.common.view.CBTextView) bindings[8]
            , (com.common.view.CMTextView) bindings[10]
            , (com.common.view.CTextView) bindings[11]
            , (com.common.view.CTextView) bindings[9]
            , (android.widget.ViewFlipper) bindings[12]
            );
        this.btnContinue.setTag(null);
        this.btnSkip.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback58 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback59 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback60 = new com.loseweight.generated.callback.OnClickListener(this, 3);
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
            setHandler((com.loseweight.RestActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.RestActivity.ClickHandler Handler) {
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
        com.loseweight.RestActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnContinue.setOnClickListener(mCallback58);
            this.btnSkip.setOnClickListener(mCallback59);
            this.mboundView3.setOnClickListener(mCallback60);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.RestActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPlusTimeClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.RestActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onSkipClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.RestActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onExerciseInfoClick();
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