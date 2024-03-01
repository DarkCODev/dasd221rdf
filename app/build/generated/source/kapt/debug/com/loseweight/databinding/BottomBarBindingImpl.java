package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomBarBindingImpl extends BottomBarBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearLayout2, 4);
        sViewsWithIds.put(R.id.imgPlan, 5);
        sViewsWithIds.put(R.id.tvPlan, 6);
        sViewsWithIds.put(R.id.imgReports, 7);
        sViewsWithIds.put(R.id.tvReports, 8);
        sViewsWithIds.put(R.id.imgMe, 9);
        sViewsWithIds.put(R.id.tvMe, 10);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback76;
    @Nullable
    private final android.view.View.OnClickListener mCallback77;
    @Nullable
    private final android.view.View.OnClickListener mCallback75;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomBarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private BottomBarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (com.common.view.CTextView) bindings[10]
            , (com.common.view.CTextView) bindings[6]
            , (com.common.view.CTextView) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback76 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback77 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback75 = new com.loseweight.generated.callback.OnClickListener(this, 1);
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
        if (BR.bottomClickListener == variableId) {
            setBottomClickListener((com.loseweight.interfaces.BottomBarClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBottomClickListener(@Nullable com.loseweight.interfaces.BottomBarClickListener BottomClickListener) {
        this.mBottomClickListener = BottomClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.bottomClickListener);
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
        com.loseweight.interfaces.BottomBarClickListener bottomClickListener = mBottomClickListener;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback75);
            this.mboundView2.setOnClickListener(mCallback76);
            this.mboundView3.setOnClickListener(mCallback77);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // bottomClickListener
                com.loseweight.interfaces.BottomBarClickListener bottomClickListener = mBottomClickListener;
                // bottomClickListener != null
                boolean bottomClickListenerJavaLangObjectNull = false;



                bottomClickListenerJavaLangObjectNull = (bottomClickListener) != (null);
                if (bottomClickListenerJavaLangObjectNull) {




                    bottomClickListener.onTopBarClickListener(callbackArg_0, mboundView2.getResources().getString(R.string.reports));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // bottomClickListener
                com.loseweight.interfaces.BottomBarClickListener bottomClickListener = mBottomClickListener;
                // bottomClickListener != null
                boolean bottomClickListenerJavaLangObjectNull = false;



                bottomClickListenerJavaLangObjectNull = (bottomClickListener) != (null);
                if (bottomClickListenerJavaLangObjectNull) {




                    bottomClickListener.onTopBarClickListener(callbackArg_0, mboundView3.getResources().getString(R.string.me));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // bottomClickListener
                com.loseweight.interfaces.BottomBarClickListener bottomClickListener = mBottomClickListener;
                // bottomClickListener != null
                boolean bottomClickListenerJavaLangObjectNull = false;



                bottomClickListenerJavaLangObjectNull = (bottomClickListener) != (null);
                if (bottomClickListenerJavaLangObjectNull) {




                    bottomClickListener.onTopBarClickListener(callbackArg_0, mboundView1.getResources().getString(R.string.plan));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bottomClickListener
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}