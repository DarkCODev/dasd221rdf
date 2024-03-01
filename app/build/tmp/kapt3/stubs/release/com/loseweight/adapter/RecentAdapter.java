package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u001e\u0010\u0017\u001a\u00020\u00152\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0019j\b\u0012\u0004\u0012\u00020\u000b`\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u001c\u0010 \u001a\u00020\u00152\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u000e\u0010\'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006+"}, d2 = {"Lcom/loseweight/adapter/RecentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/loseweight/adapter/RecentAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$app_release", "()Landroid/content/Context;", "setContext$app_release", "data", "", "Lcom/loseweight/objects/HistoryDetailsClass;", "dbHelper", "Lcom/utillity/db/DataHelper;", "mEventListener", "Lcom/loseweight/adapter/RecentAdapter$EventListener;", "getMEventListener$app_release", "()Lcom/loseweight/adapter/RecentAdapter$EventListener;", "setMEventListener$app_release", "(Lcom/loseweight/adapter/RecentAdapter$EventListener;)V", "add", "", "item", "addAll", "mData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "clear", "getItem", "pos", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEventListener", "eventListener", "EventListener", "MyViewHolder", "app_release"})
public final class RecentAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.loseweight.adapter.RecentAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.loseweight.objects.HistoryDetailsClass> data = null;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.RecentAdapter.EventListener mEventListener;
    @org.jetbrains.annotations.NotNull
    private final com.utillity.db.DataHelper dbHelper = null;
    
    public RecentAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext$app_release() {
        return null;
    }
    
    public final void setContext$app_release(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.RecentAdapter.EventListener getMEventListener$app_release() {
        return null;
    }
    
    public final void setMEventListener$app_release(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.RecentAdapter.EventListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.HistoryDetailsClass getItem(int pos) {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> mData) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.HistoryDetailsClass item) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.RecentAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.RecentAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.RecentAdapter.EventListener eventListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/adapter/RecentAdapter$EventListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_release"})
    public static abstract interface EventListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/adapter/RecentAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowSideMenuBinding", "Lcom/loseweight/databinding/ItemRecentBinding;", "(Lcom/loseweight/adapter/RecentAdapter;Lcom/loseweight/databinding/ItemRecentBinding;)V", "getRowSideMenuBinding$app_release", "()Lcom/loseweight/databinding/ItemRecentBinding;", "setRowSideMenuBinding$app_release", "(Lcom/loseweight/databinding/ItemRecentBinding;)V", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.loseweight.databinding.ItemRecentBinding rowSideMenuBinding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemRecentBinding rowSideMenuBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.databinding.ItemRecentBinding getRowSideMenuBinding$app_release() {
            return null;
        }
        
        public final void setRowSideMenuBinding$app_release(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemRecentBinding p0) {
        }
    }
}