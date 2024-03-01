package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFastWorkoutDetailBindingImpl extends ActivityFastWorkoutDetailBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content, 5);
        sViewsWithIds.put(R.id.appbar, 6);
        sViewsWithIds.put(R.id.collapsing_toolbar, 7);
        sViewsWithIds.put(R.id.title_image, 8);
        sViewsWithIds.put(R.id.tvTitle, 9);
        sViewsWithIds.put(R.id.tv_des, 10);
        sViewsWithIds.put(R.id.toolbar, 11);
        sViewsWithIds.put(R.id.llTopTitle, 12);
        sViewsWithIds.put(R.id.tvTitleText_, 13);
        sViewsWithIds.put(R.id.nestedScrollView, 14);
        sViewsWithIds.put(R.id.imgBeginer, 15);
        sViewsWithIds.put(R.id.tvName, 16);
        sViewsWithIds.put(R.id.tvMinutes, 17);
        sViewsWithIds.put(R.id.imgIntermediate, 18);
        sViewsWithIds.put(R.id.tvIntermediateMin, 19);
        sViewsWithIds.put(R.id.imgAdvance, 20);
        sViewsWithIds.put(R.id.tvAdvancedMinutes, 21);
        sViewsWithIds.put(R.id.llAdView, 22);
        sViewsWithIds.put(R.id.llAdViewFacebook, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFastWorkoutDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityFastWorkoutDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[15]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[18]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[12]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (android.widget.ImageView) bindings[8]
            , (androidx.appcompat.widget.Toolbar) bindings[11]
            , (com.common.view.CTextView) bindings[21]
            , (com.common.view.CTextView) bindings[10]
            , (com.common.view.CTextView) bindings[19]
            , (com.common.view.CTextView) bindings[17]
            , (com.common.view.CMTextView) bindings[16]
            , (com.common.view.CBTextView) bindings[9]
            , (com.common.view.CBTextView) bindings[13]
            );
        this.imgBack.setTag(null);
        this.llAdvanced.setTag(null);
        this.llBeginner.setTag(null);
        this.llIntermediate.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback55 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback56 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback54 = new com.loseweight.generated.callback.OnClickListener(this, 1);
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
            setHandler((com.loseweight.FastWorkOutDetailActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.FastWorkOutDetailActivity.ClickHandler Handler) {
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
        com.loseweight.FastWorkOutDetailActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback54);
            this.llAdvanced.setOnClickListener(mCallback57);
            this.llBeginner.setOnClickListener(mCallback55);
            this.llIntermediate.setOnClickListener(mCallback56);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.FastWorkOutDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAdvanceClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.FastWorkOutDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onBeginnerClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.FastWorkOutDetailActivity.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onIntermediateClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.FastWorkOutDetailActivity.ClickHandler handler = mHandler;
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