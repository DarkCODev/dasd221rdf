package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020#H\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0014J\b\u0010*\u001a\u00020#H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/loseweight/WaterTrackerActivity;", "Lcom/loseweight/BaseActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "binding", "Lcom/loseweight/databinding/ActivityWaterTrackerBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityWaterTrackerBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityWaterTrackerBinding;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "handler", "Landroid/os/Handler;", "isTimerRested", "", "()Z", "setTimerRested", "(Z)V", "maxCup", "getMaxCup", "setMaxCup", "timer", "Ljava/util/Timer;", "timerTask", "Ljava/util/TimerTask;", "waterProgress", "doing", "", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "resetTimer", "app_debug"})
public final class WaterTrackerActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityWaterTrackerBinding binding;
    private int count = 0;
    private int maxCup = 8;
    private int waterProgress = 1;
    private boolean isTimerRested = false;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.Nullable
    private java.util.TimerTask timerTask;
    @org.jetbrains.annotations.Nullable
    private java.util.Timer timer;
    
    public WaterTrackerActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityWaterTrackerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityWaterTrackerBinding p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int getMaxCup() {
        return 0;
    }
    
    public final void setMaxCup(int p0) {
    }
    
    public final boolean isTimerRested() {
        return false;
    }
    
    public final void setTimerRested(boolean p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    public final void doing() {
    }
    
    private final void resetTimer() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}