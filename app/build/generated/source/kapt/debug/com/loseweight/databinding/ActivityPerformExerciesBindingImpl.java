package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPerformExerciesBindingImpl extends ActivityPerformExerciesBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewFlipper, 12);
        sViewsWithIds.put(R.id.tvAnimation, 13);
        sViewsWithIds.put(R.id.progressBarTop, 14);
        sViewsWithIds.put(R.id.tvTitleReadyToGo, 15);
        sViewsWithIds.put(R.id.tvExerciesName, 16);
        sViewsWithIds.put(R.id.llReadyToGo, 17);
        sViewsWithIds.put(R.id.tvCountDownReadyToGO, 18);
        sViewsWithIds.put(R.id.llAfterStartWithTime, 19);
        sViewsWithIds.put(R.id.tvSecond, 20);
        sViewsWithIds.put(R.id.tvPause, 21);
        sViewsWithIds.put(R.id.llAfterStartWithSteps, 22);
        sViewsWithIds.put(R.id.tvTotalStep, 23);
        sViewsWithIds.put(R.id.llPrevNext, 24);
        sViewsWithIds.put(R.id.imgPrev, 25);
        sViewsWithIds.put(R.id.tvPrev, 26);
        sViewsWithIds.put(R.id.imgSkip, 27);
        sViewsWithIds.put(R.id.tvSkip, 28);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback104;
    @Nullable
    private final android.view.View.OnClickListener mCallback102;
    @Nullable
    private final android.view.View.OnClickListener mCallback100;
    @Nullable
    private final android.view.View.OnClickListener mCallback99;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    @Nullable
    private final android.view.View.OnClickListener mCallback98;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPerformExerciesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityPerformExerciesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[27]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[11]
            , (com.mikhaellopez.circularprogressbar.CircularProgressBar) bindings[6]
            , (android.widget.ProgressBar) bindings[14]
            , (android.widget.ProgressBar) bindings[8]
            , (android.widget.TextView) bindings[13]
            , (com.common.view.CBTextView) bindings[18]
            , (com.common.view.CMTextView) bindings[16]
            , (com.common.view.CBTextView) bindings[21]
            , (com.common.view.CMTextView) bindings[26]
            , (com.common.view.CBTextView) bindings[20]
            , (com.common.view.CMTextView) bindings[28]
            , (com.common.view.CBTextView) bindings[15]
            , (com.common.view.CBTextView) bindings[23]
            , (android.widget.ViewFlipper) bindings[12]
            );
        this.imgBack.setTag(null);
        this.imgCommonQuestion.setTag(null);
        this.imgSound.setTag(null);
        this.imgVideo.setTag(null);
        this.llCompleteExce.setTag(null);
        this.llPrev.setTag(null);
        this.llSkip.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (androidx.appcompat.widget.AppCompatImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.progressBarReadyToGo.setTag(null);
        this.progressBarWorkOut.setTag(null);
        setRootTag(root);
        // listeners
        mCallback106 = new com.loseweight.generated.callback.OnClickListener(this, 10);
        mCallback104 = new com.loseweight.generated.callback.OnClickListener(this, 8);
        mCallback102 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback100 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback99 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback107 = new com.loseweight.generated.callback.OnClickListener(this, 11);
        mCallback105 = new com.loseweight.generated.callback.OnClickListener(this, 9);
        mCallback103 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback98 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback101 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback97 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.loseweight.PerformWorkOutActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
    }
    public void setHandler(@Nullable com.loseweight.PerformWorkOutActivity.ClickHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback97);
            this.imgCommonQuestion.setOnClickListener(mCallback100);
            this.imgSound.setOnClickListener(mCallback98);
            this.imgVideo.setOnClickListener(mCallback99);
            this.llCompleteExce.setOnClickListener(mCallback105);
            this.llPrev.setOnClickListener(mCallback106);
            this.llSkip.setOnClickListener(mCallback107);
            this.mboundView5.setOnClickListener(mCallback101);
            this.mboundView7.setOnClickListener(mCallback103);
            this.progressBarReadyToGo.setOnClickListener(mCallback102);
            this.progressBarWorkOut.setOnClickListener(mCallback104);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 10: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPrevExerciseClick();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onWorkOutInfoClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onReadyToGoClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onCommonQuestionClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onVideoClick();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onNextExerciseClick();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onNextExerciseClick();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onSkipReadyToGoClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onSoundClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onWorkOutInfoClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.PerformWorkOutActivity.ClickHandler handler = mHandler;
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
        flag 0 (0x1L): isLoading
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}