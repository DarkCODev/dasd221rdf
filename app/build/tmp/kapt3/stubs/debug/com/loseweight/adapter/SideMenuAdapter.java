package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fJ\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010!\u001a\u00020\u00162\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/loseweight/adapter/SideMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/loseweight/adapter/SideMenuAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "()V", "getContext", "()Landroid/content/Context;", "setContext", "data", "", "Lcom/loseweight/objects/SideMenuItem;", "isSelected", "", "isSelected$app_debug", "()Z", "setSelected$app_debug", "(Z)V", "mEventListener", "Lcom/loseweight/adapter/SideMenuAdapter$EventListener;", "add", "", "mData", "addAll", "", "getItem", "pos", "", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEventListener", "eventListener", "EventListener", "ViewHolder", "app_debug"})
public final class SideMenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.loseweight.adapter.SideMenuAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.loseweight.objects.SideMenuItem> data;
    private com.loseweight.adapter.SideMenuAdapter.EventListener mEventListener;
    private boolean isSelected = false;
    public android.content.Context context;
    
    public SideMenuAdapter() {
        super();
    }
    
    public final boolean isSelected$app_debug() {
        return false;
    }
    
    public final void setSelected$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    public SideMenuAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.loseweight.objects.SideMenuItem> mData) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.SideMenuItem mData) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.SideMenuItem getItem(int pos) {
        return null;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.SideMenuAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.SideMenuAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.SideMenuAdapter.EventListener eventListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/loseweight/adapter/SideMenuAdapter$EventListener;", "", "onItemClick", "", "pos", "", "app_debug"})
    public static abstract interface EventListener {
        
        public abstract void onItemClick(int pos);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/loseweight/adapter/SideMenuAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/loseweight/adapter/SideMenuAdapter;Landroid/view/View;)V", "container", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "setContainer", "(Landroid/widget/FrameLayout;)V", "imgMenuIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "getImgMenuIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "setImgMenuIcon", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "tvMenuName", "Landroid/widget/TextView;", "getTvMenuName", "()Landroid/widget/TextView;", "setTvMenuName", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView tvMenuName;
        @org.jetbrains.annotations.NotNull
        private androidx.appcompat.widget.AppCompatImageView imgMenuIcon;
        @org.jetbrains.annotations.NotNull
        private android.widget.FrameLayout container;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvMenuName() {
            return null;
        }
        
        public final void setTvMenuName(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.appcompat.widget.AppCompatImageView getImgMenuIcon() {
            return null;
        }
        
        public final void setImgMenuIcon(@org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.FrameLayout getContainer() {
            return null;
        }
        
        public final void setContainer(@org.jetbrains.annotations.NotNull
        android.widget.FrameLayout p0) {
        }
    }
}