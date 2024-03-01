package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TopbarBindingImpl extends TopbarBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvTitleText_, 7);
        sViewsWithIds.put(R.id.imgMenu, 8);
        sViewsWithIds.put(R.id.imgSearch, 9);
        sViewsWithIds.put(R.id.imgSync, 10);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView1;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView3;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TopbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private TopbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (com.common.view.CMTextView) bindings[6]
            , (com.common.view.CMTextView) bindings[7]
            );
        this.imgBack.setTag(null);
        this.imgInternet.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (androidx.appcompat.widget.AppCompatImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (androidx.appcompat.widget.AppCompatImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.toolbar.setTag(null);
        this.tvReset.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback65 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback64 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback66 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback63 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
        if (BR.isLogoutShow == variableId) {
            setIsLogoutShow((java.lang.Boolean) variable);
        }
        else if (BR.topBarClickListener == variableId) {
            setTopBarClickListener((com.loseweight.interfaces.TopBarClickListener) variable);
        }
        else if (BR.isInterNetAvailableShow == variableId) {
            setIsInterNetAvailableShow((java.lang.Boolean) variable);
        }
        else if (BR.isResetShow == variableId) {
            setIsResetShow((java.lang.Boolean) variable);
        }
        else if (BR.isInterNetAvailable == variableId) {
            setIsInterNetAvailable((java.lang.Boolean) variable);
        }
        else if (BR.isBackShow == variableId) {
            setIsBackShow((java.lang.Boolean) variable);
        }
        else if (BR.isSyncingShow == variableId) {
            setIsSyncingShow((java.lang.Boolean) variable);
        }
        else if (BR.isHomeShow == variableId) {
            setIsHomeShow((java.lang.Boolean) variable);
        }
        else if (BR.isMoreShow == variableId) {
            setIsMoreShow((java.lang.Boolean) variable);
        }
        else if (BR.isReScanShow == variableId) {
            setIsReScanShow((java.lang.Boolean) variable);
        }
        else if (BR.isRefreshShow == variableId) {
            setIsRefreshShow((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLogoutShow(@Nullable java.lang.Boolean IsLogoutShow) {
        this.mIsLogoutShow = IsLogoutShow;
    }
    public void setTopBarClickListener(@Nullable com.loseweight.interfaces.TopBarClickListener TopBarClickListener) {
        this.mTopBarClickListener = TopBarClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.topBarClickListener);
        super.requestRebind();
    }
    public void setIsInterNetAvailableShow(@Nullable java.lang.Boolean IsInterNetAvailableShow) {
        this.mIsInterNetAvailableShow = IsInterNetAvailableShow;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isInterNetAvailableShow);
        super.requestRebind();
    }
    public void setIsResetShow(@Nullable java.lang.Boolean IsResetShow) {
        this.mIsResetShow = IsResetShow;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isResetShow);
        super.requestRebind();
    }
    public void setIsInterNetAvailable(@Nullable java.lang.Boolean IsInterNetAvailable) {
        this.mIsInterNetAvailable = IsInterNetAvailable;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.isInterNetAvailable);
        super.requestRebind();
    }
    public void setIsBackShow(@Nullable java.lang.Boolean IsBackShow) {
        this.mIsBackShow = IsBackShow;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.isBackShow);
        super.requestRebind();
    }
    public void setIsSyncingShow(@Nullable java.lang.Boolean IsSyncingShow) {
        this.mIsSyncingShow = IsSyncingShow;
    }
    public void setIsHomeShow(@Nullable java.lang.Boolean IsHomeShow) {
        this.mIsHomeShow = IsHomeShow;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.isHomeShow);
        super.requestRebind();
    }
    public void setIsMoreShow(@Nullable java.lang.Boolean IsMoreShow) {
        this.mIsMoreShow = IsMoreShow;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.isMoreShow);
        super.requestRebind();
    }
    public void setIsReScanShow(@Nullable java.lang.Boolean IsReScanShow) {
        this.mIsReScanShow = IsReScanShow;
    }
    public void setIsRefreshShow(@Nullable java.lang.Boolean IsRefreshShow) {
        this.mIsRefreshShow = IsRefreshShow;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.isRefreshShow);
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
        com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
        int isBackShowViewVISIBLEViewGONE = 0;
        java.lang.Boolean isInterNetAvailableShow = mIsInterNetAvailableShow;
        int isRefreshShowViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsResetShow = false;
        java.lang.Boolean isResetShow = mIsResetShow;
        java.lang.Boolean isInterNetAvailable = mIsInterNetAvailable;
        java.lang.Boolean isBackShow = mIsBackShow;
        android.graphics.drawable.Drawable isInterNetAvailableImgInternetAndroidDrawableIcInternetConnectedImgInternetAndroidDrawableIcInternetNotConnected = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsHomeShow = false;
        int isMoreShowViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsMoreShow = false;
        java.lang.Boolean isHomeShow = mIsHomeShow;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailableShow = false;
        int isResetShowViewVISIBLEViewGONE = 0;
        java.lang.Boolean isMoreShow = mIsMoreShow;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsRefreshShow = false;
        int isHomeShowViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsBackShow = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailable = false;
        int isInterNetAvailableShowViewVISIBLEViewGONE = 0;
        java.lang.Boolean isRefreshShow = mIsRefreshShow;

        if ((dirtyFlags & 0x804L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailableShow)
                androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailableShow = androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailableShow);
            if((dirtyFlags & 0x804L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailableShow) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailableShow) ? View.VISIBLE : View.GONE
                isInterNetAvailableShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailableShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x808L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isResetShow)
                androidxDatabindingViewDataBindingSafeUnboxIsResetShow = androidx.databinding.ViewDataBinding.safeUnbox(isResetShow);
            if((dirtyFlags & 0x808L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsResetShow) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isResetShow) ? View.VISIBLE : View.GONE
                isResetShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsResetShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x810L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailable)
                androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailable = androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailable);
            if((dirtyFlags & 0x810L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailable) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailable) ? @android:drawable/ic_internet_connected : @android:drawable/ic_internet_not_connected
                isInterNetAvailableImgInternetAndroidDrawableIcInternetConnectedImgInternetAndroidDrawableIcInternetNotConnected = ((androidxDatabindingViewDataBindingSafeUnboxIsInterNetAvailable) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgInternet.getContext(), R.drawable.ic_internet_connected)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgInternet.getContext(), R.drawable.ic_internet_not_connected)));
        }
        if ((dirtyFlags & 0x820L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isBackShow)
                androidxDatabindingViewDataBindingSafeUnboxIsBackShow = androidx.databinding.ViewDataBinding.safeUnbox(isBackShow);
            if((dirtyFlags & 0x820L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsBackShow) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isBackShow) ? View.VISIBLE : View.GONE
                isBackShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsBackShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x880L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isHomeShow)
                androidxDatabindingViewDataBindingSafeUnboxIsHomeShow = androidx.databinding.ViewDataBinding.safeUnbox(isHomeShow);
            if((dirtyFlags & 0x880L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsHomeShow) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isHomeShow) ? View.VISIBLE : View.GONE
                isHomeShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsHomeShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x900L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isMoreShow)
                androidxDatabindingViewDataBindingSafeUnboxIsMoreShow = androidx.databinding.ViewDataBinding.safeUnbox(isMoreShow);
            if((dirtyFlags & 0x900L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsMoreShow) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isMoreShow) ? View.VISIBLE : View.GONE
                isMoreShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsMoreShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xc00L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isRefreshShow)
                androidxDatabindingViewDataBindingSafeUnboxIsRefreshShow = androidx.databinding.ViewDataBinding.safeUnbox(isRefreshShow);
            if((dirtyFlags & 0xc00L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsRefreshShow) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isRefreshShow) ? View.VISIBLE : View.GONE
                isRefreshShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsRefreshShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.imgBack.setOnClickListener(mCallback64);
            this.mboundView1.setOnClickListener(mCallback63);
            this.mboundView3.setOnClickListener(mCallback65);
            this.mboundView5.setOnClickListener(mCallback66);
            this.tvReset.setOnClickListener(mCallback67);
        }
        if ((dirtyFlags & 0x820L) != 0) {
            // api target 1

            this.imgBack.setVisibility(isBackShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x810L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgInternet, isInterNetAvailableImgInternetAndroidDrawableIcInternetConnectedImgInternetAndroidDrawableIcInternetNotConnected);
        }
        if ((dirtyFlags & 0x804L) != 0) {
            // api target 1

            this.imgInternet.setVisibility(isInterNetAvailableShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x880L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(isHomeShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(isRefreshShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(isMoreShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x808L) != 0) {
            // api target 1

            this.tvReset.setVisibility(isResetShowViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // topBarClickListener
                com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
                // topBarClickListener != null
                boolean topBarClickListenerJavaLangObjectNull = false;



                topBarClickListenerJavaLangObjectNull = (topBarClickListener) != (null);
                if (topBarClickListenerJavaLangObjectNull) {




                    topBarClickListener.onTopBarClickListener(callbackArg_0, tvReset.getResources().getString(R.string.reset));
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // topBarClickListener
                com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
                // topBarClickListener != null
                boolean topBarClickListenerJavaLangObjectNull = false;



                topBarClickListenerJavaLangObjectNull = (topBarClickListener) != (null);
                if (topBarClickListenerJavaLangObjectNull) {




                    topBarClickListener.onTopBarClickListener(callbackArg_0, mboundView3.getResources().getString(R.string.refresh));
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // topBarClickListener
                com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
                // topBarClickListener != null
                boolean topBarClickListenerJavaLangObjectNull = false;



                topBarClickListenerJavaLangObjectNull = (topBarClickListener) != (null);
                if (topBarClickListenerJavaLangObjectNull) {




                    topBarClickListener.onTopBarClickListener(callbackArg_0, imgBack.getResources().getString(R.string.back));
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // topBarClickListener
                com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
                // topBarClickListener != null
                boolean topBarClickListenerJavaLangObjectNull = false;



                topBarClickListenerJavaLangObjectNull = (topBarClickListener) != (null);
                if (topBarClickListenerJavaLangObjectNull) {




                    topBarClickListener.onTopBarClickListener(callbackArg_0, mboundView5.getResources().getString(R.string.more));
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // topBarClickListener
                com.loseweight.interfaces.TopBarClickListener topBarClickListener = mTopBarClickListener;
                // topBarClickListener != null
                boolean topBarClickListenerJavaLangObjectNull = false;



                topBarClickListenerJavaLangObjectNull = (topBarClickListener) != (null);
                if (topBarClickListenerJavaLangObjectNull) {




                    topBarClickListener.onTopBarClickListener(callbackArg_0, mboundView1.getResources().getString(R.string.home));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isLogoutShow
        flag 1 (0x2L): topBarClickListener
        flag 2 (0x3L): isInterNetAvailableShow
        flag 3 (0x4L): isResetShow
        flag 4 (0x5L): isInterNetAvailable
        flag 5 (0x6L): isBackShow
        flag 6 (0x7L): isSyncingShow
        flag 7 (0x8L): isHomeShow
        flag 8 (0x9L): isMoreShow
        flag 9 (0xaL): isReScanShow
        flag 10 (0xbL): isRefreshShow
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(isBackShow) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(isBackShow) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(isRefreshShow) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(isRefreshShow) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailable) ? @android:drawable/ic_internet_connected : @android:drawable/ic_internet_not_connected
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailable) ? @android:drawable/ic_internet_connected : @android:drawable/ic_internet_not_connected
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(isMoreShow) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(isMoreShow) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(isResetShow) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(isResetShow) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(isHomeShow) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(isHomeShow) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailableShow) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(isInterNetAvailableShow) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}