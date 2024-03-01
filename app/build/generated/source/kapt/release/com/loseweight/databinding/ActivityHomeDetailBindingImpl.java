package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeDetailBindingImpl extends ActivityHomeDetailBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content, 2);
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.collapsing_toolbar, 4);
        sViewsWithIds.put(R.id.title_image, 5);
        sViewsWithIds.put(R.id.view_mask, 6);
        sViewsWithIds.put(R.id.tvTitle, 7);
        sViewsWithIds.put(R.id.tv_des, 8);
        sViewsWithIds.put(R.id.toolbar, 9);
        sViewsWithIds.put(R.id.llTopTitle, 10);
        sViewsWithIds.put(R.id.tvTitleText_, 11);
        sViewsWithIds.put(R.id.nestedScrollView, 12);
        sViewsWithIds.put(R.id.rvWorkOuts, 13);
        sViewsWithIds.put(R.id.llAdView, 14);
        sViewsWithIds.put(R.id.llAdViewFacebook, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHomeDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityHomeDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (android.widget.ImageView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (com.common.view.CTextView) bindings[8]
            , (com.common.view.CBTextView) bindings[7]
            , (com.common.view.CBTextView) bindings[11]
            , (android.view.View) bindings[6]
            );
        this.imgBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback108 = new com.loseweight.generated.callback.OnClickListener(this, 1);
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
            setHandler((com.loseweight.HomeDetailActivity.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.HomeDetailActivity.ClickHandler Handler) {
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
        com.loseweight.HomeDetailActivity.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback108);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.loseweight.HomeDetailActivity.ClickHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {


            handler.onBackClick();
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