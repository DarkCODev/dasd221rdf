package com.loseweight.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020#J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/loseweight/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "ad", "Lcom/loseweight/utils/RetrofitProgressDialog;", "getAd$app_debug", "()Lcom/loseweight/utils/RetrofitProgressDialog;", "setAd$app_debug", "(Lcom/loseweight/utils/RetrofitProgressDialog;)V", "context", "Landroid/content/Context;", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "(Landroid/content/Context;)V", "dbHelper", "Lcom/utillity/db/DataHelper;", "getDbHelper", "()Lcom/utillity/db/DataHelper;", "setDbHelper", "(Lcom/utillity/db/DataHelper;)V", "toast", "Landroid/widget/Toast;", "getToast$app_debug", "()Landroid/widget/Toast;", "setToast$app_debug", "(Landroid/widget/Toast;)V", "dismissDialog", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "setMessage", "msg", "", "showDialog", "showToast", "text", "duration", "", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    public android.widget.Toast toast;
    public android.content.Context context;
    public com.utillity.db.DataHelper dbHelper;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.utils.RetrofitProgressDialog ad;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Toast getToast$app_debug() {
        return null;
    }
    
    public final void setToast$app_debug(@org.jetbrains.annotations.NotNull
    android.widget.Toast p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.utillity.db.DataHelper getDbHelper() {
        return null;
    }
    
    public final void setDbHelper(@org.jetbrains.annotations.NotNull
    com.utillity.db.DataHelper p0) {
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    java.lang.String text, int duration) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.utils.RetrofitProgressDialog getAd$app_debug() {
        return null;
    }
    
    public final void setAd$app_debug(@org.jetbrains.annotations.Nullable
    com.loseweight.utils.RetrofitProgressDialog p0) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void dismissDialog() {
    }
}