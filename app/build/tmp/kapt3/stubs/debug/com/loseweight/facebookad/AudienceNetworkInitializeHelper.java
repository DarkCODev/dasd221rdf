package com.loseweight.facebookad;

/**
 * Sample class that shows how to call initialize() method of Audience Network SDK.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/facebookad/AudienceNetworkInitializeHelper;", "Lcom/facebook/ads/AudienceNetworkAds$InitListener;", "()V", "onInitialized", "", "result", "Lcom/facebook/ads/AudienceNetworkAds$InitResult;", "Companion", "app_debug"})
public final class AudienceNetworkInitializeHelper implements com.facebook.ads.AudienceNetworkAds.InitListener {
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.facebookad.AudienceNetworkInitializeHelper.Companion Companion = null;
    
    public AudienceNetworkInitializeHelper() {
        super();
    }
    
    @java.lang.Override
    public void onInitialized(@org.jetbrains.annotations.NotNull
    com.facebook.ads.AudienceNetworkAds.InitResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/facebookad/AudienceNetworkInitializeHelper$Companion;", "", "()V", "initialize", "", "context", "Landroid/content/Context;", "initialize$app_debug", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * It's recommended to call this method from Application.onCreate(). Otherwise you can call it
         * from all Activity.onCreate() methods for Activities that contain ads.
         *
         * @param context Application or Activity.
         */
        public final void initialize$app_debug(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}