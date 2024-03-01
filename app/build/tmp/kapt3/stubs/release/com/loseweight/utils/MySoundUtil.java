package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/loseweight/utils/MySoundUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SOUND_CHEER", "", "getSOUND_CHEER", "()I", "setSOUND_CHEER", "(I)V", "SOUND_DING", "getSOUND_DING", "setSOUND_DING", "SOUND_WHISTLE", "getSOUND_WHISTLE", "setSOUND_WHISTLE", "audioManager", "Landroid/media/AudioManager;", "soundMap", "", "soundPool", "Landroid/media/SoundPool;", "ttsSoundPool", "utils", "getInstance", "init", "", "playSound", "sound_index", "unInit", "app_release"})
public final class MySoundUtil {
    private int SOUND_DING = 1;
    private int SOUND_WHISTLE = 0;
    private int SOUND_CHEER = 2;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.Nullable
    private com.loseweight.utils.MySoundUtil utils;
    @org.jetbrains.annotations.Nullable
    private android.media.AudioManager audioManager;
    @org.jetbrains.annotations.Nullable
    private java.util.Map<java.lang.Integer, java.lang.Integer> soundMap;
    @org.jetbrains.annotations.Nullable
    private android.media.SoundPool soundPool;
    @org.jetbrains.annotations.Nullable
    private android.media.SoundPool ttsSoundPool;
    @org.jetbrains.annotations.Nullable
    private android.content.Context context;
    
    public final int getSOUND_DING() {
        return 0;
    }
    
    public final void setSOUND_DING(int p0) {
    }
    
    public final int getSOUND_WHISTLE() {
        return 0;
    }
    
    public final void setSOUND_WHISTLE(int p0) {
    }
    
    public final int getSOUND_CHEER() {
        return 0;
    }
    
    public final void setSOUND_CHEER(int p0) {
    }
    
    public MySoundUtil(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized com.loseweight.utils.MySoundUtil getInstance(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void playSound(int sound_index) {
    }
    
    public final void unInit() {
    }
}