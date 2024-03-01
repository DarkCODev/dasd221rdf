package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0003J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/loseweight/utils/LocaleManager;", "", "()V", "LANGUAGE_ENGLISH", "", "LANGUAGE_KEY", "getLanguage", "c", "Landroid/content/Context;", "getLocale", "Ljava/util/Locale;", "res", "Landroid/content/res/Resources;", "persistLanguage", "", "language", "setLocale", "setNewLocale", "updateResources", "context", "app_release"})
public final class LocaleManager {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LANGUAGE_ENGLISH = "en";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String LANGUAGE_KEY = "language_key";
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.LocaleManager INSTANCE = null;
    
    private LocaleManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context setLocale(@org.jetbrains.annotations.NotNull
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context setNewLocale(@org.jetbrains.annotations.NotNull
    android.content.Context c, @org.jetbrains.annotations.NotNull
    java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguage(@org.jetbrains.annotations.Nullable
    android.content.Context c) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    private final void persistLanguage(android.content.Context c, java.lang.String language) {
    }
    
    private final android.content.Context updateResources(android.content.Context context, java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Locale getLocale(@org.jetbrains.annotations.NotNull
    android.content.res.Resources res) {
        return null;
    }
}