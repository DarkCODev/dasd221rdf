package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlanBindingImpl extends FragmentPlanBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.llRecent, 9);
        sViewsWithIds.put(R.id.tvRecentTime, 10);
        sViewsWithIds.put(R.id.imgRecentWorkout, 11);
        sViewsWithIds.put(R.id.tvRecentWorkOutName, 12);
        sViewsWithIds.put(R.id.tvTime, 13);
        sViewsWithIds.put(R.id.imgRecentView, 14);
        sViewsWithIds.put(R.id.imgMainGoalPlan, 15);
        sViewsWithIds.put(R.id.tvPlanName, 16);
        sViewsWithIds.put(R.id.pbDay, 17);
        sViewsWithIds.put(R.id.tvDaysLeft, 18);
        sViewsWithIds.put(R.id.rvBodyFocus, 19);
        sViewsWithIds.put(R.id.linearLayout, 20);
        sViewsWithIds.put(R.id.tvWaterTrackerDes, 21);
        sViewsWithIds.put(R.id.llAfterWaterTrackerOn, 22);
        sViewsWithIds.put(R.id.tvWaterDrinked, 23);
        sViewsWithIds.put(R.id.flWaterProgress, 24);
        sViewsWithIds.put(R.id.circularProgressBar, 25);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView3;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback79;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlanBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentPlanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBButtonView) bindings[5]
            , (com.common.view.CBButtonView) bindings[7]
            , (com.common.view.CBButtonView) bindings[8]
            , (com.mikhaellopez.circularprogressbar.CircularProgressBar) bindings[25]
            , (android.widget.FrameLayout) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[17]
            , (androidx.recyclerview.widget.RecyclerView) bindings[19]
            , (com.common.view.CTextView) bindings[18]
            , (com.common.view.CBTextView) bindings[16]
            , (com.common.view.CMTextView) bindings[10]
            , (com.common.view.CMTextView) bindings[12]
            , (com.common.view.CTextView) bindings[13]
            , (com.common.view.CMTextView) bindings[1]
            , (com.common.view.CBTextView) bindings[23]
            , (com.common.view.CTextView) bindings[21]
            );
        this.btnDay.setTag(null);
        this.btnDrink.setTag(null);
        this.btnStartWaterTracker.setTag(null);
        this.imgChange.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (androidx.cardview.widget.CardView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvViewAll.setTag(null);
        setRootTag(root);
        // listeners
        mCallback79 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback84 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback82 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback80 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback78 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback85 = new com.loseweight.generated.callback.OnClickListener(this, 8);
        mCallback83 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback81 = new com.loseweight.generated.callback.OnClickListener(this, 4);
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
            setHandler((com.loseweight.fragments.PlanFragment.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.fragments.PlanFragment.ClickHandler Handler) {
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
        com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnDay.setOnClickListener(mCallback82);
            this.btnDrink.setOnClickListener(mCallback84);
            this.btnStartWaterTracker.setOnClickListener(mCallback85);
            this.imgChange.setOnClickListener(mCallback81);
            this.mboundView2.setOnClickListener(mCallback79);
            this.mboundView3.setOnClickListener(mCallback80);
            this.mboundView6.setOnClickListener(mCallback83);
            this.tvViewAll.setOnClickListener(mCallback78);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRecentViewClick();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onDrinkClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onDaysPlanClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onDaysPlanClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRecentViewAllClick();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onStartWaterClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onFastWorkoutClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.PlanFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPlanChangeClick();
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