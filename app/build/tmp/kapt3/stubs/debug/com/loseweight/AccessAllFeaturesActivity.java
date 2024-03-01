package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/loseweight/AccessAllFeaturesActivity;", "Lcom/loseweight/BaseActivity;", "()V", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "binding", "Lcom/loseweight/databinding/ActivityAccessAllFeatureBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityAccessAllFeatureBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityAccessAllFeatureBinding;)V", "purchaseUpdateListener", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "skuDetail", "", "checkSubscriptionList", "", "getSKUDetails", "init", "initInAppPurchase", "initIntentParam", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPurchaseClick", "SKU", "onResume", "ClickHandler", "app_debug"})
public final class AccessAllFeaturesActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityAccessAllFeatureBinding binding;
    @org.jetbrains.annotations.NotNull
    private java.lang.String skuDetail = "monthly_sub";
    @org.jetbrains.annotations.Nullable
    private com.android.billingclient.api.BillingClient billingClient;
    @org.jetbrains.annotations.NotNull
    private final com.android.billingclient.api.PurchasesUpdatedListener purchaseUpdateListener = null;
    
    public AccessAllFeaturesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityAccessAllFeatureBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityAccessAllFeatureBinding p0) {
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
    
    private final void onPurchaseClick(java.lang.String SKU) {
    }
    
    private final void initInAppPurchase() {
    }
    
    private final void checkSubscriptionList() {
    }
    
    private final void getSKUDetails() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/AccessAllFeaturesActivity$ClickHandler;", "", "(Lcom/loseweight/AccessAllFeaturesActivity;)V", "onBackClick", "", "onContinueClick", "onPerMonthClick", "onYearlyClick", "app_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onBackClick() {
        }
        
        public final void onYearlyClick() {
        }
        
        public final void onPerMonthClick() {
        }
        
        public final void onContinueClick() {
        }
    }
}