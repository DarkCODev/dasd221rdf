package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCompletedBindingImpl extends ActivityCompletedBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_image, 18);
        sViewsWithIds.put(R.id.tvRock, 19);
        sViewsWithIds.put(R.id.tvWorkoutName, 20);
        sViewsWithIds.put(R.id.llExercises, 21);
        sViewsWithIds.put(R.id.tvTotalEx, 22);
        sViewsWithIds.put(R.id.llCalorie, 23);
        sViewsWithIds.put(R.id.tvCalorie, 24);
        sViewsWithIds.put(R.id.llDuration, 25);
        sViewsWithIds.put(R.id.tvDuration, 26);
        sViewsWithIds.put(R.id.llBtn, 27);
        sViewsWithIds.put(R.id.tvTitleReminder, 28);
        sViewsWithIds.put(R.id.tvReminders, 29);
        sViewsWithIds.put(R.id.editWeight, 30);
        sViewsWithIds.put(R.id.tvBMI, 31);
        sViewsWithIds.put(R.id.clBMIGraphView, 32);
        sViewsWithIds.put(R.id.rlBMI, 33);
        sViewsWithIds.put(R.id.lnyBmiGraph, 34);
        sViewsWithIds.put(R.id.blankView1, 35);
        sViewsWithIds.put(R.id.txtBmiGrade, 36);
        sViewsWithIds.put(R.id.BmiPosition, 37);
        sViewsWithIds.put(R.id.blankView3, 38);
        sViewsWithIds.put(R.id.llBmiNumberGraph, 39);
        sViewsWithIds.put(R.id.tvWeightString, 40);
        sViewsWithIds.put(R.id.rdgFeel, 41);
        sViewsWithIds.put(R.id.cvQuestion, 42);
        sViewsWithIds.put(R.id.llAdView, 43);
        sViewsWithIds.put(R.id.llAdViewFacebook, 44);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView16;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCompletedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }
    private ActivityCompletedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[37]
            , (android.view.View) bindings[35]
            , (android.view.View) bindings[38]
            , (com.common.view.CBButtonView) bindings[17]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[32]
            , (androidx.cardview.widget.CardView) bindings[42]
            , (com.common.view.CMEditTextView) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.RelativeLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[34]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (android.widget.RadioGroup) bindings[41]
            , (android.widget.RadioButton) bindings[15]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.RelativeLayout) bindings[33]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (com.common.view.CMTextView) bindings[31]
            , (com.common.view.CBTextView) bindings[24]
            , (com.common.view.CBTextView) bindings[26]
            , (com.common.view.CMTextView) bindings[5]
            , (com.common.view.CMTextView) bindings[6]
            , (com.common.view.CMTextView) bindings[29]
            , (com.common.view.CBTextView) bindings[19]
            , (com.common.view.CMTextView) bindings[28]
            , (com.common.view.CBTextView) bindings[22]
            , (com.common.view.CTextView) bindings[40]
            , (com.common.view.CBTextView) bindings[20]
            , (com.common.view.CTextView) bindings[36]
            );
        this.btnNext.setTag(null);
        this.btnShare.setTag(null);
        this.imgArrowUp.setTag(null);
        this.imgBack.setTag(null);
        this.imgEditTopBMI.setTag(null);
        this.llTapInputHeight.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView16 = (android.widget.LinearLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView9 = (androidx.appcompat.widget.AppCompatImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.nestedScrollView.setTag(null);
        this.rdoFeelFive.setTag(null);
        this.rdoFeelFour.setTag(null);
        this.rdoFeelOne.setTag(null);
        this.rdoFeelThree.setTag(null);
        this.rdoFeelTwo.setTag(null);
        this.tvKG.setTag(null);
        this.tvLB.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.loseweight.generated.callback.OnClickListener(this, 17);
        mCallback15 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback23 = new com.loseweight.generated.callback.OnClickListener(this, 13);
        mCallback11 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback19 = new com.loseweight.generated.callback.OnClickListener(this, 9);
        mCallback16 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback12 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback24 = new com.loseweight.generated.callback.OnClickListener(this, 14);
        mCallback17 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback25 = new com.loseweight.generated.callback.OnClickListener(this, 15);
        mCallback13 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback21 = new com.loseweight.generated.callback.OnClickListener(this, 11);
        mCallback20 = new com.loseweight.generated.callback.OnClickListener(this, 10);
        mCallback14 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback26 = new com.loseweight.generated.callback.OnClickListener(this, 16);
        mCallback22 = new com.loseweight.generated.callback.OnClickListener(this, 12);
        mCallback18 = new com.loseweight.generated.callback.OnClickListener(this, 8);
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
            setHandler((com.loseweight.CompletedActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.CompletedActivity.ClickHandler Handler) {
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
        com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnNext.setOnClickListener(mCallback27);
            this.btnShare.setOnClickListener(mCallback12);
            this.imgArrowUp.setOnClickListener(mCallback18);
            this.imgBack.setOnClickListener(mCallback13);
            this.imgEditTopBMI.setOnClickListener(mCallback17);
            this.llTapInputHeight.setOnClickListener(mCallback20);
            this.mboundView1.setOnClickListener(mCallback11);
            this.mboundView16.setOnClickListener(mCallback26);
            this.mboundView4.setOnClickListener(mCallback14);
            this.mboundView9.setOnClickListener(mCallback19);
            this.rdoFeelFive.setOnClickListener(mCallback25);
            this.rdoFeelFour.setOnClickListener(mCallback24);
            this.rdoFeelOne.setOnClickListener(mCallback21);
            this.rdoFeelThree.setOnClickListener(mCallback23);
            this.rdoFeelTwo.setOnClickListener(mCallback22);
            this.tvKG.setOnClickListener(mCallback15);
            this.tvLB.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 17: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onNextClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onKGClick();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onSetFeel(3);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onDoItAgainClick();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onLBClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onShareClick();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onSetFeel(4);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 15: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onSetFeel(5);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBackClick();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onSetFeel(1);
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAddHeightClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAddReminderClick();
                }
                break;
            }
            case 16: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onFeedBackClick();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {



                    handler.onSetFeel(2);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handler
                com.loseweight.CompletedActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onArrowUpClick();
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