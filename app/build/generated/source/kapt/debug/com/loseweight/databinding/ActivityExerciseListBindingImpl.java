package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityExerciseListBindingImpl extends ActivityExerciseListBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content, 10);
        sViewsWithIds.put(R.id.appbar, 11);
        sViewsWithIds.put(R.id.collapsing_toolbar, 12);
        sViewsWithIds.put(R.id.imgCover, 13);
        sViewsWithIds.put(R.id.view_mask, 14);
        sViewsWithIds.put(R.id.tvTitle, 15);
        sViewsWithIds.put(R.id.tvShortDes, 16);
        sViewsWithIds.put(R.id.toolbar, 17);
        sViewsWithIds.put(R.id.llTopTitle, 18);
        sViewsWithIds.put(R.id.tvTitleText_, 19);
        sViewsWithIds.put(R.id.nestedScrollView, 20);
        sViewsWithIds.put(R.id.llIntroduction, 21);
        sViewsWithIds.put(R.id.tvName, 22);
        sViewsWithIds.put(R.id.imgInstructionArrow, 23);
        sViewsWithIds.put(R.id.llIntroductionDes, 24);
        sViewsWithIds.put(R.id.tvIntroductionDes, 25);
        sViewsWithIds.put(R.id.llWorkout, 26);
        sViewsWithIds.put(R.id.tvWorkoutTime, 27);
        sViewsWithIds.put(R.id.tvTotalWorkout, 28);
        sViewsWithIds.put(R.id.rvWorkOuts, 29);
        sViewsWithIds.put(R.id.llContinue, 30);
        sViewsWithIds.put(R.id.llAdView, 31);
        sViewsWithIds.put(R.id.llAdViewFacebook, 32);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityExerciseListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityExerciseListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[11]
            , (com.common.view.CBButtonView) bindings[7]
            , (com.common.view.CBButtonView) bindings[9]
            , (com.common.view.CBButtonView) bindings[6]
            , (com.common.view.CBButtonView) bindings[8]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[23]
            , (android.widget.RelativeLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[26]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[10]
            , (androidx.core.widget.NestedScrollView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[29]
            , (androidx.appcompat.widget.Toolbar) bindings[17]
            , (com.common.view.CTextView) bindings[1]
            , (com.common.view.CTextView) bindings[2]
            , (com.common.view.CBTextView) bindings[5]
            , (com.common.view.CTextView) bindings[25]
            , (com.common.view.CBTextView) bindings[22]
            , (com.common.view.CMTextView) bindings[16]
            , (com.common.view.CBTextView) bindings[15]
            , (com.common.view.CBTextView) bindings[19]
            , (com.common.view.CBTextView) bindings[28]
            , (com.common.view.CBTextView) bindings[27]
            , (android.view.View) bindings[14]
            );
        this.btnContinue.setTag(null);
        this.btnDoItAgain.setTag(null);
        this.btnRestart.setTag(null);
        this.btnStart.setTag(null);
        this.imgBack.setTag(null);
        this.llIntroductionTitle.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAbout.setTag(null);
        this.tvCommonQuestion.setTag(null);
        this.tvEdit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback37 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback35 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback33 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback40 = new com.loseweight.generated.callback.OnClickListener(this, 8);
        mCallback38 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback36 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback34 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback41 = new com.loseweight.generated.callback.OnClickListener(this, 9);
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
            setHandler((com.loseweight.ExercisesListActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.ExercisesListActivity.ClickHandler Handler) {
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
        com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnContinue.setOnClickListener(mCallback39);
            this.btnDoItAgain.setOnClickListener(mCallback41);
            this.btnRestart.setOnClickListener(mCallback38);
            this.btnStart.setOnClickListener(mCallback40);
            this.imgBack.setOnClickListener(mCallback35);
            this.llIntroductionTitle.setOnClickListener(mCallback36);
            this.tvAbout.setOnClickListener(mCallback33);
            this.tvCommonQuestion.setOnClickListener(mCallback34);
            this.tvEdit.setOnClickListener(mCallback37);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onContinueClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBackClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAboutClick();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onStartClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRestartClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onIntroductionClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onCommonQuestionClick();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handler
                com.loseweight.ExercisesListActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRestartClick();
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