package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReportBindingImpl extends FragmentReportBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvWorkOuts, 8);
        sViewsWithIds.put(R.id.tvCalorie, 9);
        sViewsWithIds.put(R.id.tvMinutes, 10);
        sViewsWithIds.put(R.id.tvMinutesTitle, 11);
        sViewsWithIds.put(R.id.rvWeekGoal, 12);
        sViewsWithIds.put(R.id.tvDayInRow, 13);
        sViewsWithIds.put(R.id.chartWeight, 14);
        sViewsWithIds.put(R.id.tvCurrentWeight, 15);
        sViewsWithIds.put(R.id.tvHeaviestWeight, 16);
        sViewsWithIds.put(R.id.tvLightestWeight, 17);
        sViewsWithIds.put(R.id.tvBMI, 18);
        sViewsWithIds.put(R.id.clBMIGraphView, 19);
        sViewsWithIds.put(R.id.rlBMI, 20);
        sViewsWithIds.put(R.id.lnyBmiGraph, 21);
        sViewsWithIds.put(R.id.blankView1, 22);
        sViewsWithIds.put(R.id.txtBmiGrade, 23);
        sViewsWithIds.put(R.id.BmiPosition, 24);
        sViewsWithIds.put(R.id.blankView3, 25);
        sViewsWithIds.put(R.id.llBmiNumberGraph, 26);
        sViewsWithIds.put(R.id.tvWeightString, 27);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    @NonNull
    private final com.common.view.CTextView mboundView3;
    @NonNull
    private final com.common.view.CTextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback92;
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReportBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentReportBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[25]
            , (com.charting.charts.CombinedChart) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (com.common.view.CEditTextView) bindings[5]
            , (com.common.view.CEditTextView) bindings[6]
            , (com.common.view.CEditTextView) bindings[7]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (com.common.view.CBTextView) bindings[18]
            , (com.common.view.CBTextView) bindings[9]
            , (com.common.view.CTextView) bindings[15]
            , (com.common.view.CBTextView) bindings[13]
            , (com.common.view.CTextView) bindings[16]
            , (com.common.view.CTextView) bindings[17]
            , (com.common.view.CBTextView) bindings[10]
            , (com.common.view.CTextView) bindings[11]
            , (com.common.view.CTextView) bindings[27]
            , (com.common.view.CBTextView) bindings[8]
            , (com.common.view.CTextView) bindings[23]
            );
        this.editCurrHeightCM.setTag(null);
        this.editCurrHeightFT.setTag(null);
        this.editCurrHeightIn.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.common.view.CTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.common.view.CTextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback89 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback94 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback92 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback90 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback88 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback93 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback91 = new com.loseweight.generated.callback.OnClickListener(this, 4);
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
            setHandler((com.loseweight.fragments.ReportsFragment.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.fragments.ReportsFragment.ClickHandler Handler) {
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
        com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.editCurrHeightCM.setOnClickListener(mCallback92);
            this.editCurrHeightFT.setOnClickListener(mCallback93);
            this.editCurrHeightIn.setOnClickListener(mCallback94);
            this.mboundView1.setOnClickListener(mCallback88);
            this.mboundView2.setOnClickListener(mCallback89);
            this.mboundView3.setOnClickListener(mCallback90);
            this.mboundView4.setOnClickListener(mCallback91);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAddWeightClick();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRecordsClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.ReportsFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onEditBMIClick();
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