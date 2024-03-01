package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0019"}, d2 = {"Lcom/loseweight/utils/TaskHandler;", "", "()V", "isBeaconActivitySyncingFinished", "", "()Z", "setBeaconActivitySyncingFinished", "(Z)V", "isCellActivitySyncingFinished", "setCellActivitySyncingFinished", "isHeadCountSyncingFinished", "setHeadCountSyncingFinished", "isInamateActivitySyncingFinished", "setInamateActivitySyncingFinished", "taskObservable", "Landroidx/databinding/ObservableField;", "getTaskObservable", "()Landroidx/databinding/ObservableField;", "setTaskObservable", "(Landroidx/databinding/ObservableField;)V", "StartAllTask", "", "context", "Landroid/content/Context;", "onFinishAnyTask", "app_debug"})
public final class TaskHandler {
    @org.jetbrains.annotations.NotNull
    private androidx.databinding.ObservableField<java.lang.Boolean> taskObservable;
    private boolean isCellActivitySyncingFinished = false;
    private boolean isInamateActivitySyncingFinished = false;
    private boolean isHeadCountSyncingFinished = false;
    private boolean isBeaconActivitySyncingFinished = false;
    
    public TaskHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.databinding.ObservableField<java.lang.Boolean> getTaskObservable() {
        return null;
    }
    
    public final void setTaskObservable(@org.jetbrains.annotations.NotNull
    androidx.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    public final boolean isCellActivitySyncingFinished() {
        return false;
    }
    
    public final void setCellActivitySyncingFinished(boolean p0) {
    }
    
    public final boolean isInamateActivitySyncingFinished() {
        return false;
    }
    
    public final void setInamateActivitySyncingFinished(boolean p0) {
    }
    
    public final boolean isHeadCountSyncingFinished() {
        return false;
    }
    
    public final void setHeadCountSyncingFinished(boolean p0) {
    }
    
    public final boolean isBeaconActivitySyncingFinished() {
        return false;
    }
    
    public final void setBeaconActivitySyncingFinished(boolean p0) {
    }
    
    public final void StartAllTask(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void onFinishAnyTask() {
    }
}