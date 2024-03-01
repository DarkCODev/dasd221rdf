package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/loseweight/utils/ExitStrategy;", "", "()V", "h", "Landroid/os/Handler;", "isAbletoExit", "", "runnable", "Ljava/lang/Runnable;", "getRunnable$app_debug", "()Ljava/lang/Runnable;", "setRunnable$app_debug", "(Ljava/lang/Runnable;)V", "canExit", "shutDown", "", "startExitDelay", "delayMillis", "", "app_debug"})
public final class ExitStrategy {
    private static boolean isAbletoExit = false;
    @org.jetbrains.annotations.NotNull
    private static final android.os.Handler h = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.Runnable runnable;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.ExitStrategy INSTANCE = null;
    
    private ExitStrategy() {
        super();
    }
    
    public final boolean canExit() {
        return false;
    }
    
    public final void startExitDelay(long delayMillis) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable getRunnable$app_debug() {
        return null;
    }
    
    public final void setRunnable$app_debug(@org.jetbrains.annotations.NotNull
    java.lang.Runnable p0) {
    }
    
    public final void shutDown() {
    }
}