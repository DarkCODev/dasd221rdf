package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomSheetExDetailBindingImpl extends BottomSheetExDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.peekView, 1);
        sViewsWithIds.put(R.id.tabTransit, 2);
        sViewsWithIds.put(R.id.pagerFragment, 3);
        sViewsWithIds.put(R.id.tvExerciesName, 4);
        sViewsWithIds.put(R.id.tvExerciesUnit, 5);
        sViewsWithIds.put(R.id.imgMinus, 6);
        sViewsWithIds.put(R.id.tvTime, 7);
        sViewsWithIds.put(R.id.imgAdd, 8);
        sViewsWithIds.put(R.id.tvDes, 9);
        sViewsWithIds.put(R.id.tvCommonQuestion, 10);
        sViewsWithIds.put(R.id.llPrevNext, 11);
        sViewsWithIds.put(R.id.imgPrev, 12);
        sViewsWithIds.put(R.id.tvCurrPosition, 13);
        sViewsWithIds.put(R.id.imgNext, 14);
        sViewsWithIds.put(R.id.btnCancel, 15);
        sViewsWithIds.put(R.id.llReplace, 16);
        sViewsWithIds.put(R.id.btnCancel_, 17);
        sViewsWithIds.put(R.id.btnReplace, 18);
        sViewsWithIds.put(R.id.llSave, 19);
        sViewsWithIds.put(R.id.btnReset, 20);
        sViewsWithIds.put(R.id.btnSave, 21);
        sViewsWithIds.put(R.id.btnContinue, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomSheetExDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private BottomSheetExDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBButtonView) bindings[15]
            , (com.common.view.CBButtonView) bindings[17]
            , (com.common.view.CBButtonView) bindings[22]
            , (com.common.view.CBButtonView) bindings[18]
            , (com.common.view.CBButtonView) bindings[20]
            , (com.common.view.CBButtonView) bindings[21]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (androidx.viewpager.widget.ViewPager) bindings[3]
            , (android.view.View) bindings[1]
            , (com.common.view.CustomTabLayout) bindings[2]
            , (com.common.view.CTextView) bindings[10]
            , (com.common.view.CBTextView) bindings[13]
            , (com.common.view.CTextView) bindings[9]
            , (com.common.view.CBTextView) bindings[4]
            , (com.common.view.CTextView) bindings[5]
            , (com.common.view.CBTextView) bindings[7]
            );
        this.container.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isLoading
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}