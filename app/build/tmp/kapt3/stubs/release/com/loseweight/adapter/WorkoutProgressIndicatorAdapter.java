package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&\'B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0016J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b\u00a8\u0006("}, d2 = {"Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "completedEx", "", "getCompletedEx", "()I", "setCompletedEx", "(I)V", "getContext$app_release", "()Landroid/content/Context;", "setContext$app_release", "mEventListener", "Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$EventListener;", "getMEventListener$app_release", "()Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$EventListener;", "setMEventListener$app_release", "(Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$EventListener;)V", "totalEx", "getTotalEx", "setTotalEx", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCompletedExercise", "count", "setEventListener", "eventListener", "setTotalExercise", "EventListener", "MyViewHolder", "app_release"})
public final class WorkoutProgressIndicatorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.loseweight.adapter.WorkoutProgressIndicatorAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    private int totalEx = 10;
    private int completedEx = 0;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.WorkoutProgressIndicatorAdapter.EventListener mEventListener;
    
    public WorkoutProgressIndicatorAdapter(@org.jetbrains.annotations.NotNull
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
    
    public final int getTotalEx() {
        return 0;
    }
    
    public final void setTotalEx(int p0) {
    }
    
    public final int getCompletedEx() {
        return 0;
    }
    
    public final void setCompletedEx(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.WorkoutProgressIndicatorAdapter.EventListener getMEventListener$app_release() {
        return null;
    }
    
    public final void setMEventListener$app_release(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.WorkoutProgressIndicatorAdapter.EventListener p0) {
    }
    
    public final void setTotalExercise(int totalEx) {
    }
    
    public final void setCompletedExercise(int count) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.WorkoutProgressIndicatorAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.WorkoutProgressIndicatorAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setEventListener(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.WorkoutProgressIndicatorAdapter.EventListener eventListener) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$EventListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_release"})
    public static abstract interface EventListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rowSideMenuBinding", "Lcom/loseweight/databinding/ItemWorkoutStatusIndicatorBinding;", "(Lcom/loseweight/adapter/WorkoutProgressIndicatorAdapter;Lcom/loseweight/databinding/ItemWorkoutStatusIndicatorBinding;)V", "getRowSideMenuBinding$app_release", "()Lcom/loseweight/databinding/ItemWorkoutStatusIndicatorBinding;", "setRowSideMenuBinding$app_release", "(Lcom/loseweight/databinding/ItemWorkoutStatusIndicatorBinding;)V", "app_release"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.loseweight.databinding.ItemWorkoutStatusIndicatorBinding rowSideMenuBinding;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemWorkoutStatusIndicatorBinding rowSideMenuBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.databinding.ItemWorkoutStatusIndicatorBinding getRowSideMenuBinding$app_release() {
            return null;
        }
        
        public final void setRowSideMenuBinding$app_release(@org.jetbrains.annotations.NotNull
        com.loseweight.databinding.ItemWorkoutStatusIndicatorBinding p0) {
        }
    }
}