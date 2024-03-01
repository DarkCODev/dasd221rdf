package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogHeightWeightBindingImpl extends DialogHeightWeightBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.editWeight, 1);
        sViewsWithIds.put(R.id.tvKG, 2);
        sViewsWithIds.put(R.id.tvLB, 3);
        sViewsWithIds.put(R.id.editHeightCM, 4);
        sViewsWithIds.put(R.id.llInch, 5);
        sViewsWithIds.put(R.id.editHeightFT, 6);
        sViewsWithIds.put(R.id.editHeightIn, 7);
        sViewsWithIds.put(R.id.tvCM, 8);
        sViewsWithIds.put(R.id.tvIN, 9);
        sViewsWithIds.put(R.id.btnCancel, 10);
        sViewsWithIds.put(R.id.btnNext, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogHeightWeightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogHeightWeightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (com.common.view.CEditTextView) bindings[4]
            , (com.common.view.CEditTextView) bindings[6]
            , (com.common.view.CEditTextView) bindings[7]
            , (com.common.view.CEditTextView) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (com.common.view.CTextView) bindings[8]
            , (com.common.view.CTextView) bindings[9]
            , (com.common.view.CTextView) bindings[2]
            , (com.common.view.CTextView) bindings[3]
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
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}