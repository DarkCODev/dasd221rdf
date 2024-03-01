package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002/0B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011J\u001e\u0010\u001f\u001a\u00020\u001d2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`!J\u0006\u0010\"\u001a\u00020\u001dJ\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u00020\u0007H\u0016J\u001c\u0010&\u001a\u00020\u001d2\n\u0010\'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020\u0007H\u0016J\u001c\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/loseweight/adapter/ReportWeekGoalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/loseweight/adapter/ReportWeekGoalAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "completedCount", "", "getCompletedCount", "()I", "setCompletedCount", "(I)V", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "data", "Ljava/util/ArrayList;", "", "dbHelper", "Lcom/utillity/db/DataHelper;", "getDbHelper", "()Lcom/utillity/db/DataHelper;", "mEventListener", "Lcom/loseweight/adapter/ReportWeekGoalAdapter$EventListener;", "getMEventListener$app_debug", "()Lcom/loseweight/adapter/ReportWeekGoalAdapter$EventListener;", "setMEventListener$app_debug", "(Lcom/loseweight/adapter/ReportWeekGoalAdapter$EventListener;)V", "add", "", "item", "addAll", "mData", "Lkotlin/collections/ArrayList;", "clear", "getItem", "pos", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setEventListener", "eventListener", "EventListener", "MyViewHolder", "app_debug"})
public final class ReportWeekGoalAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.loseweight.adapter.ReportWeekGoalAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.String> data = null;
    @org.jetbrains.annotations.NotNull
    private final com.utillity.db.DataHelper dbHelper = null;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.ReportWeekGoalAdapter.EventListener mEventListener;
    private int completedCount = 0;
    
    public ReportWeekGoalAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.utillity.db.DataHelper getDbHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.ReportWeekGoalAdapter.EventListener getMEventListener$app_debug() {
        return null;
    }
    
    public final void setMEventListener$app_debug(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.ReportWeekGoalAdapter.EventListener p0) {
    }
    
    public final int getCompletedCount() {
        return 0;
    }
    
    public final void setCompletedCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItem(int pos) {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> mData) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    java.lang.String item) {
    }
    
    public final void clear() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.ReportWeekGoalAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.ReportWeekGoalAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.ReportWeekGoalAdapter.EventListener eventListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/adapter/ReportWeekGoalAdapter$EventListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface EventListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/adapter/ReportWeekGoalAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowSideMenuBinding", "Lcom/loseweight/databinding/ItemReportWeekDayBinding;", "(Lcom/loseweight/adapter/ReportWeekGoalAdapter;Lcom/loseweight/databinding/ItemReportWeekDayBinding;)V", "getRowSideMenuBinding$app_debug", "()Lcom/loseweight/databinding/ItemReportWeekDayBinding;", "setRowSideMenuBinding$app_debug", "(Lcom/loseweight/databinding/ItemReportWeekDayBinding;)V", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.loseweight.databinding.ItemReportWeekDayBinding rowSideMenuBinding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemReportWeekDayBinding rowSideMenuBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.databinding.ItemReportWeekDayBinding getRowSideMenuBinding$app_debug() {
            return null;
        }
        
        public final void setRowSideMenuBinding$app_debug(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemReportWeekDayBinding p0) {
        }
    }
}