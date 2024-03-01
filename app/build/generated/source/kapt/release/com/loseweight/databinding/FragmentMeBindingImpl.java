package com.loseweight.databinding;
import com.loseweight.R;
import com.loseweight.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMeBindingImpl extends FragmentMeBinding implements com.loseweight.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvReminders, 13);
        sViewsWithIds.put(R.id.SwitchTurnOnWater, 14);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentMeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Switch) bindings[14]
            , (android.widget.LinearLayout) bindings[3]
            , (com.common.view.CTextView) bindings[13]
            );
        this.llGoPremium.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new com.loseweight.generated.callback.OnClickListener(this, 8);
        mCallback47 = new com.loseweight.generated.callback.OnClickListener(this, 6);
        mCallback48 = new com.loseweight.generated.callback.OnClickListener(this, 7);
        mCallback45 = new com.loseweight.generated.callback.OnClickListener(this, 4);
        mCallback46 = new com.loseweight.generated.callback.OnClickListener(this, 5);
        mCallback43 = new com.loseweight.generated.callback.OnClickListener(this, 2);
        mCallback44 = new com.loseweight.generated.callback.OnClickListener(this, 3);
        mCallback52 = new com.loseweight.generated.callback.OnClickListener(this, 11);
        mCallback42 = new com.loseweight.generated.callback.OnClickListener(this, 1);
        mCallback53 = new com.loseweight.generated.callback.OnClickListener(this, 12);
        mCallback50 = new com.loseweight.generated.callback.OnClickListener(this, 9);
        mCallback51 = new com.loseweight.generated.callback.OnClickListener(this, 10);
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
            setHandler((com.loseweight.fragments.MeFragment.ClickHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.loseweight.fragments.MeFragment.ClickHandler Handler) {
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
        com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.llGoPremium.setOnClickListener(mCallback44);
            this.mboundView1.setOnClickListener(mCallback42);
            this.mboundView10.setOnClickListener(mCallback51);
            this.mboundView11.setOnClickListener(mCallback52);
            this.mboundView12.setOnClickListener(mCallback53);
            this.mboundView2.setOnClickListener(mCallback43);
            this.mboundView4.setOnClickListener(mCallback45);
            this.mboundView5.setOnClickListener(mCallback46);
            this.mboundView6.setOnClickListener(mCallback47);
            this.mboundView7.setOnClickListener(mCallback48);
            this.mboundView8.setOnClickListener(mCallback49);
            this.mboundView9.setOnClickListener(mCallback50);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onShareWithFriendClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRestartProgressClick();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onVoiceOptionClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onMyProfileClick();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onChangeLanguageClick();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onSoundOptionClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onGoPremiumClick();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onFeedBackClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onAddReminderClick();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onPrivacyPolicyClick();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onRatUsClick();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // handler
                com.loseweight.fragments.MeFragment.ClickHandler handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.onCommonQuestionClick();
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