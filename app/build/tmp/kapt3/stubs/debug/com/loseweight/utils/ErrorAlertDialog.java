package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u001e\u001a\u00020\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/loseweight/utils/ErrorAlertDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "dialogButtonClick", "Lcom/loseweight/utils/ErrorAlertDialog$DialogButtonClick;", "getDialogButtonClick", "()Lcom/loseweight/utils/ErrorAlertDialog$DialogButtonClick;", "setDialogButtonClick", "(Lcom/loseweight/utils/ErrorAlertDialog$DialogButtonClick;)V", "isNoShow", "", "isYesShow", "message", "", "negativeButtonLabel", "positiveButtonLabel", "title", "setMessage", "setNegativeButton", "setOnButtonClickListener", "setPositiveButton", "setTitle", "show", "", "DialogButtonClick", "app_debug"})
public final class ErrorAlertDialog {
    private boolean isYesShow = false;
    private boolean isNoShow = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String positiveButtonLabel;
    @org.jetbrains.annotations.Nullable
    private java.lang.String negativeButtonLabel;
    @org.jetbrains.annotations.Nullable
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable
    private androidx.appcompat.app.AlertDialog alertDialog;
    private java.lang.String title;
    private java.lang.String message;
    public com.loseweight.utils.ErrorAlertDialog.DialogButtonClick dialogButtonClick;
    
    @org.jetbrains.annotations.Nullable
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog.DialogButtonClick getDialogButtonClick() {
        return null;
    }
    
    public final void setDialogButtonClick(@org.jetbrains.annotations.NotNull
    com.loseweight.utils.ErrorAlertDialog.DialogButtonClick p0) {
    }
    
    public ErrorAlertDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog setPositiveButton(@org.jetbrains.annotations.NotNull
    java.lang.String positiveButtonLabel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog setNegativeButton(@org.jetbrains.annotations.NotNull
    java.lang.String negativeButtonLabel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.utils.ErrorAlertDialog setOnButtonClickListener(@org.jetbrains.annotations.NotNull
    com.loseweight.utils.ErrorAlertDialog.DialogButtonClick dialogButtonClick) {
        return null;
    }
    
    public final void show() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/loseweight/utils/ErrorAlertDialog$DialogButtonClick;", "", "onNegativeClick", "", "onPositiveClick", "app_debug"})
    public static abstract interface DialogButtonClick {
        
        public abstract void onPositiveClick();
        
        public abstract void onNegativeClick();
    }
}