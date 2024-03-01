package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChooseHeightBindingImpl extends ActivityChooseHeightBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgBack, 1);
        sViewsWithIds.put(R.id.tvSkip, 2);
        sViewsWithIds.put(R.id.llInFt, 3);
        sViewsWithIds.put(R.id.npFt, 4);
        sViewsWithIds.put(R.id.npIN, 5);
        sViewsWithIds.put(R.id.tvIn, 6);
        sViewsWithIds.put(R.id.tvFt, 7);
        sViewsWithIds.put(R.id.npCM, 8);
        sViewsWithIds.put(R.id.npHeightUnit, 9);
        sViewsWithIds.put(R.id.btnNext, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityChooseHeightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityChooseHeightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.common.view.CBButtonView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.common.view.numberpicker.NumberPicker) bindings[8]
            , (com.common.view.numberpicker.NumberPicker) bindings[4]
            , (com.common.view.numberpicker.NumberPicker) bindings[9]
            , (com.common.view.numberpicker.NumberPicker) bindings[5]
            , (com.common.view.CBTextView) bindings[7]
            , (com.common.view.CBTextView) bindings[6]
            , (com.common.view.CTextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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