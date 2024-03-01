package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000234B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012J\u001e\u0010\u001e\u001a\u00020\u001c2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00120 j\b\u0012\u0004\u0012\u00020\u0012`!J\u0006\u0010\"\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\nJ\b\u0010%\u001a\u00020\nH\u0016J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\nH\u0016J\u001c\u0010,\u001a\u00060-R\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\nH\u0016J\u000e\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00065"}, d2 = {"Lcom/loseweight/adapter/WorkoutListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "continuePos", "", "getContinuePos", "()Ljava/lang/Integer;", "setContinuePos", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "data", "", "Lcom/loseweight/objects/HomeExTableClass;", "getData", "()Ljava/util/List;", "mEventListener", "Lcom/loseweight/adapter/WorkoutListAdapter$EventListener;", "getMEventListener$app_debug", "()Lcom/loseweight/adapter/WorkoutListAdapter$EventListener;", "setMEventListener$app_debug", "(Lcom/loseweight/adapter/WorkoutListAdapter$EventListener;)V", "add", "", "item", "addAll", "mData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "clear", "getItem", "pos", "getItemCount", "isAllCompleted", "", "isAnyCompleted", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "Lcom/loseweight/adapter/WorkoutListAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "setEventListener", "eventListener", "EventListener", "MyViewHolder", "app_debug"})
public final class WorkoutListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.loseweight.objects.HomeExTableClass> data = null;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.WorkoutListAdapter.EventListener mEventListener;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer continuePos;
    
    public WorkoutListAdapter(@org.jetbrains.annotations.NotNull
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
    public final java.util.List<com.loseweight.objects.HomeExTableClass> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.WorkoutListAdapter.EventListener getMEventListener$app_debug() {
        return null;
    }
    
    public final void setMEventListener$app_debug(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.WorkoutListAdapter.EventListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getContinuePos() {
        return null;
    }
    
    public final void setContinuePos(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.HomeExTableClass getItem(int pos) {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HomeExTableClass> mData) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.HomeExTableClass item) {
    }
    
    public final boolean isAnyCompleted() {
        return false;
    }
    
    public final boolean isAllCompleted() {
        return false;
    }
    
    public final void clear() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.WorkoutListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.WorkoutListAdapter.EventListener eventListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/adapter/WorkoutListAdapter$EventListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface EventListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/adapter/WorkoutListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowSideMenuBinding", "Lcom/loseweight/databinding/ItemWorkoutListBinding;", "(Lcom/loseweight/adapter/WorkoutListAdapter;Lcom/loseweight/databinding/ItemWorkoutListBinding;)V", "getRowSideMenuBinding$app_debug", "()Lcom/loseweight/databinding/ItemWorkoutListBinding;", "setRowSideMenuBinding$app_debug", "(Lcom/loseweight/databinding/ItemWorkoutListBinding;)V", "app_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.loseweight.databinding.ItemWorkoutListBinding rowSideMenuBinding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemWorkoutListBinding rowSideMenuBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.databinding.ItemWorkoutListBinding getRowSideMenuBinding$app_debug() {
            return null;
        }
        
        public final void setRowSideMenuBinding$app_debug(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemWorkoutListBinding p0) {
        }
    }
}