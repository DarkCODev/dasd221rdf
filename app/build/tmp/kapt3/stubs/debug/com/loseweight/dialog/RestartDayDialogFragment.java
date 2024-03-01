package com.loseweight.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u0001:\u000245B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J*\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\'2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0006J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020*H\u0002J\u000e\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u00066"}, d2 = {"Lcom/loseweight/dialog/RestartDayDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "mContext", "Lcom/loseweight/BaseActivity;", "(Lcom/loseweight/BaseActivity;)V", "dialogDismissListener", "Lcom/loseweight/dialog/RestartDayDialogFragment$DialogDismissListener;", "getDialogDismissListener", "()Lcom/loseweight/dialog/RestartDayDialogFragment$DialogDismissListener;", "setDialogDismissListener", "(Lcom/loseweight/dialog/RestartDayDialogFragment$DialogDismissListener;)V", "dialogRestartDayBinding", "Lcom/loseweight/databinding/BottomSheetRestartConfBinding;", "getDialogRestartDayBinding", "()Lcom/loseweight/databinding/BottomSheetRestartConfBinding;", "setDialogRestartDayBinding", "(Lcom/loseweight/databinding/BottomSheetRestartConfBinding;)V", "getMContext", "()Lcom/loseweight/BaseActivity;", "needToRestart", "", "getNeedToRestart", "()Z", "setNeedToRestart", "(Z)V", "fillData", "", "b", "init", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "setOnEventListener", "listener", "setupBottomSheet", "dialogInterface", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "Companion", "DialogDismissListener", "app_debug"})
public final class RestartDayDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull
    private final com.loseweight.BaseActivity mContext = null;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.BottomSheetRestartConfBinding dialogRestartDayBinding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.dialog.RestartDayDialogFragment.DialogDismissListener dialogDismissListener;
    private boolean needToRestart = false;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.dialog.RestartDayDialogFragment.Companion Companion = null;
    
    public RestartDayDialogFragment(@org.jetbrains.annotations.NotNull
    com.loseweight.BaseActivity mContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.BaseActivity getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.BottomSheetRestartConfBinding getDialogRestartDayBinding() {
        return null;
    }
    
    public final void setDialogRestartDayBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.BottomSheetRestartConfBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.dialog.RestartDayDialogFragment.DialogDismissListener getDialogDismissListener() {
        return null;
    }
    
    public final void setDialogDismissListener(@org.jetbrains.annotations.Nullable
    com.loseweight.dialog.RestartDayDialogFragment.DialogDismissListener p0) {
    }
    
    public final boolean getNeedToRestart() {
        return false;
    }
    
    public final void setNeedToRestart(boolean p0) {
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @androidx.annotation.Nullable
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @androidx.annotation.Nullable
    @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @androidx.annotation.Nullable
    @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupBottomSheet(android.content.DialogInterface dialogInterface) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void init() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @java.lang.Override
    public void onDismiss(@org.jetbrains.annotations.NotNull
    android.content.DialogInterface dialog) {
    }
    
    public final void setOnEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.dialog.RestartDayDialogFragment.DialogDismissListener listener) {
    }
    
    private final void fillData(boolean b) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/loseweight/dialog/RestartDayDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/loseweight/dialog/RestartDayDialogFragment;", "mContext", "Lcom/loseweight/BaseActivity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.dialog.RestartDayDialogFragment newInstance(@org.jetbrains.annotations.NotNull
        com.loseweight.BaseActivity mContext) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/loseweight/dialog/RestartDayDialogFragment$DialogDismissListener;", "", "onDismissListener", "", "needToClear", "", "app_debug"})
    public static abstract interface DialogDismissListener {
        
        public abstract void onDismissListener(boolean needToClear);
    }
}