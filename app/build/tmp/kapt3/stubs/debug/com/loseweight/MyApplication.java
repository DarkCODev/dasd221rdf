package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/loseweight/MyApplication;", "Landroid/app/Application;", "()V", "handler", "Landroid/os/Handler;", "getHandler$app_debug", "()Landroid/os/Handler;", "setHandler$app_debug", "(Landroid/os/Handler;)V", "onCreate", "", "Companion", "InternetConnectionReceiver", "app_debug"})
public final class MyApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    private android.os.Handler handler;
    @org.jetbrains.annotations.Nullable
    private static android.speech.tts.TextToSpeech textToSpeech;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.MyApplication.Companion Companion = null;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandler$app_debug() {
        return null;
    }
    
    public final void setHandler$app_debug(@org.jetbrains.annotations.NotNull
    android.os.Handler p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/loseweight/MyApplication$Companion;", "", "()V", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "getTextToSpeech", "()Landroid/speech/tts/TextToSpeech;", "setTextToSpeech", "(Landroid/speech/tts/TextToSpeech;)V", "checkVoiceOnOrOff", "", "context", "Landroid/content/Context;", "speechText", "", "strSpeechText", "", "fromTestTTS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.speech.tts.TextToSpeech getTextToSpeech() {
            return null;
        }
        
        public final void setTextToSpeech(@org.jetbrains.annotations.Nullable
        android.speech.tts.TextToSpeech p0) {
        }
        
        public final void speechText(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String strSpeechText, boolean fromTestTTS) {
        }
        
        public final boolean checkVoiceOnOrOff(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/MyApplication$InternetConnectionReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class InternetConnectionReceiver extends android.content.BroadcastReceiver {
        
        public InternetConnectionReceiver() {
            super();
        }
        
        @java.lang.Override
        public void onReceive(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.content.Intent intent) {
        }
    }
}