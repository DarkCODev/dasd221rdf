package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/loseweight/VoiceOptionActivity;", "Lcom/loseweight/BaseActivity;", "()V", "binding", "Lcom/loseweight/databinding/ActivityVoiceOptionsBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityVoiceOptionsBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityVoiceOptionsBinding;)V", "init", "", "initIntentParam", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showSelectTTSEngineDialog", "showTestVoiceFailDialog", "showVoiceConfirmationDialog", "ClickHandler", "TopClickListener", "app_debug"})
public final class VoiceOptionActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityVoiceOptionsBinding binding;
    
    public VoiceOptionActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityVoiceOptionsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityVoiceOptionsBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void showVoiceConfirmationDialog() {
    }
    
    private final void showTestVoiceFailDialog() {
    }
    
    private final void showSelectTTSEngineDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/VoiceOptionActivity$ClickHandler;", "", "(Lcom/loseweight/VoiceOptionActivity;)V", "onDeviceTTSSettingClick", "", "onDownloadTTsEngineClick", "onSelectTTsEngineClick", "onTestVoiceClick", "app_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onTestVoiceClick() {
        }
        
        public final void onSelectTTsEngineClick() {
        }
        
        public final void onDownloadTTsEngineClick() {
        }
        
        public final void onDeviceTTSSettingClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/VoiceOptionActivity$TopClickListener;", "Lcom/loseweight/interfaces/TopBarClickListener;", "(Lcom/loseweight/VoiceOptionActivity;)V", "onTopBarClickListener", "", "view", "Landroid/view/View;", "value", "", "app_debug"})
    public final class TopClickListener implements com.loseweight.interfaces.TopBarClickListener {
        
        public TopClickListener() {
            super();
        }
        
        @java.lang.Override
        public void onTopBarClickListener(@org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.Nullable
        java.lang.String value) {
        }
    }
}