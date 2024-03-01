package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J$\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/loseweight/utils/Debug;", "", "()V", "DEBUG", "", "getDEBUG", "()Z", "DEBUG_IS_HIDE_AD", "getDEBUG_IS_HIDE_AD", "DEBUG_IS_PURCHASE", "getDEBUG_IS_PURCHASE", "MAX_LOG_LENGTH", "", "d", "", "tag", "", "msg", "e", "i", "log", "message", "callback", "Lcom/loseweight/utils/Debug$LogCB;", "throwable", "", "v", "w", "LogCB", "app_release"})
public final class Debug {
    private static final boolean DEBUG = true;
    private static final boolean DEBUG_IS_HIDE_AD = false;
    private static final boolean DEBUG_IS_PURCHASE = false;
    private static final int MAX_LOG_LENGTH = 4000;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.Debug INSTANCE = null;
    
    private Debug() {
        super();
    }
    
    public final boolean getDEBUG() {
        return false;
    }
    
    public final boolean getDEBUG_IS_HIDE_AD() {
        return false;
    }
    
    public final boolean getDEBUG_IS_PURCHASE() {
        return false;
    }
    
    public final void e(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.Nullable
    java.lang.String msg) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull
    java.lang.String tag, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
    
    private final void log(java.lang.String message, com.loseweight.utils.Debug.LogCB callback) {
    }
    
    private final void log(java.lang.String message, java.lang.Throwable throwable, com.loseweight.utils.Debug.LogCB callback) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/loseweight/utils/Debug$LogCB;", "", "log", "", "message", "", "app_release"})
    static abstract interface LogCB {
        
        public abstract void log(@org.jetbrains.annotations.NotNull
        java.lang.String message);
    }
}