package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/loseweight/RecentActivity;", "Lcom/loseweight/BaseActivity;", "()V", "binding", "Lcom/loseweight/databinding/ActivityRecentBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityRecentBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityRecentBinding;)V", "listRecentPlan", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/HistoryDetailsClass;", "getListRecentPlan", "()Ljava/util/ArrayList;", "setListRecentPlan", "(Ljava/util/ArrayList;)V", "recentAdapter", "Lcom/loseweight/adapter/RecentAdapter;", "getRecentAdapter", "()Lcom/loseweight/adapter/RecentAdapter;", "setRecentAdapter", "(Lcom/loseweight/adapter/RecentAdapter;)V", "fillData", "", "init", "initIntentParam", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "ClickHandler", "TopClickListener", "app_release"})
public final class RecentActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityRecentBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.RecentAdapter recentAdapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> listRecentPlan;
    
    public RecentActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityRecentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityRecentBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.RecentAdapter getRecentAdapter() {
        return null;
    }
    
    public final void setRecentAdapter(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.RecentAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> getListRecentPlan() {
        return null;
    }
    
    public final void setListRecentPlan(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void fillData() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loseweight/RecentActivity$ClickHandler;", "", "(Lcom/loseweight/RecentActivity;)V", "app_release"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/RecentActivity$TopClickListener;", "Lcom/loseweight/interfaces/TopBarClickListener;", "(Lcom/loseweight/RecentActivity;)V", "onTopBarClickListener", "", "view", "Landroid/view/View;", "value", "", "app_release"})
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