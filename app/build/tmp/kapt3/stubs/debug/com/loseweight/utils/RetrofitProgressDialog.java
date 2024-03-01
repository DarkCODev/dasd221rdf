package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/loseweight/utils/RetrofitProgressDialog;", "Ljava/lang/Thread;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "msg", "", "(Landroid/app/Activity;Ljava/lang/String;)V", "getContext$app_debug", "()Landroid/app/Activity;", "setContext$app_debug", "isShowing", "", "()Z", "pd", "Landroid/app/Dialog;", "getPd$app_debug", "()Landroid/app/Dialog;", "setPd$app_debug", "(Landroid/app/Dialog;)V", "dismiss", "", "run", "setMessage", "message", "show", "Companion", "app_debug"})
public final class RetrofitProgressDialog extends java.lang.Thread {
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog pd;
    @org.jetbrains.annotations.NotNull
    private android.app.Activity context;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.RetrofitProgressDialog.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable
    public final android.app.Dialog getPd$app_debug() {
        return null;
    }
    
    public final void setPd$app_debug(@org.jetbrains.annotations.Nullable
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Activity getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.NotNull
    android.app.Activity p0) {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public RetrofitProgressDialog(@org.jetbrains.annotations.NotNull
    android.app.Activity context) {
        super();
    }
    
    public RetrofitProgressDialog(@org.jetbrains.annotations.NotNull
    android.app.Activity context, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
        super();
    }
    
    @java.lang.Override
    public void run() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void dismiss() {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/utils/RetrofitProgressDialog$Companion;", "", "()V", "getInstant", "Lcom/loseweight/utils/RetrofitProgressDialog;", "context", "Landroid/app/Activity;", "msg", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.utils.RetrofitProgressDialog getInstant(@org.jetbrains.annotations.NotNull
        android.app.Activity context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.utils.RetrofitProgressDialog getInstant(@org.jetbrains.annotations.NotNull
        android.app.Activity context, @org.jetbrains.annotations.NotNull
        java.lang.String msg) {
            return null;
        }
    }
}