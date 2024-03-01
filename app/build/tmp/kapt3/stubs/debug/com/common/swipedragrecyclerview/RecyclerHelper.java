package com.common.swipedragrecyclerview;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010\'\u001a\u00020\nH\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"J \u0010,\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0016J\u0016\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"J\u0018\u00101\u001a\u00020)2\u0006\u0010%\u001a\u00020\u00072\u0006\u00102\u001a\u00020\"H\u0016J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u0014\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00106\u001a\u00020\nJ\u0014\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00108\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00069"}, d2 = {"Lcom/common/swipedragrecyclerview/RecyclerHelper;", "T", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "list", "Ljava/util/ArrayList;", "mAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Ljava/util/ArrayList;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "isItemDragEnabled", "", "isItemSwipeEnbled", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getMAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "onDragListener", "Lcom/common/swipedragrecyclerview/OnDragListener;", "getOnDragListener", "()Lcom/common/swipedragrecyclerview/OnDragListener;", "setOnDragListener", "(Lcom/common/swipedragrecyclerview/OnDragListener;)V", "onSwipeListener", "Lcom/common/swipedragrecyclerview/OnSwipeListener;", "getOnSwipeListener", "()Lcom/common/swipedragrecyclerview/OnSwipeListener;", "setOnSwipeListener", "(Lcom/common/swipedragrecyclerview/OnSwipeListener;)V", "getData", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "isItemViewSwipeEnabled", "isLongPressDragEnabled", "onItemMoved", "", "fromPosition", "toPosition", "onMove", "target", "onMoved", "fromPos", "toPos", "onSwiped", "direction", "setOnDragItemListener", "setOnSwipeItemListener", "setRecyclerItemDragEnabled", "isDragEnabled", "setRecyclerItemSwipeEnabled", "isSwipeEnabled", "app_debug"})
public final class RecyclerHelper<T extends java.lang.Object> extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<T> list;
    @org.jetbrains.annotations.NotNull
    private androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAdapter;
    @org.jetbrains.annotations.Nullable
    private com.common.swipedragrecyclerview.OnDragListener onDragListener;
    @org.jetbrains.annotations.Nullable
    private com.common.swipedragrecyclerview.OnSwipeListener onSwipeListener;
    private boolean isItemDragEnabled = false;
    private boolean isItemSwipeEnbled = false;
    
    public RecyclerHelper(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<T> list, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<T> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.common.swipedragrecyclerview.OnDragListener getOnDragListener() {
        return null;
    }
    
    public final void setOnDragListener(@org.jetbrains.annotations.Nullable
    com.common.swipedragrecyclerview.OnDragListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.common.swipedragrecyclerview.OnSwipeListener getOnSwipeListener() {
        return null;
    }
    
    public final void setOnSwipeListener(@org.jetbrains.annotations.Nullable
    com.common.swipedragrecyclerview.OnSwipeListener p0) {
    }
    
    public final void onMoved(int fromPos, int toPos) {
    }
    
    public final void onItemMoved(int fromPosition, int toPosition) {
    }
    
    @java.lang.Override
    public int getMovementFlags(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override
    public boolean onMove(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override
    public void onSwiped(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override
    public boolean isLongPressDragEnabled() {
        return false;
    }
    
    @java.lang.Override
    public boolean isItemViewSwipeEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.common.swipedragrecyclerview.RecyclerHelper<T> setRecyclerItemDragEnabled(boolean isDragEnabled) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.common.swipedragrecyclerview.RecyclerHelper<T> setRecyclerItemSwipeEnabled(boolean isSwipeEnabled) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.common.swipedragrecyclerview.RecyclerHelper<T> setOnDragItemListener(@org.jetbrains.annotations.NotNull
    com.common.swipedragrecyclerview.OnDragListener onDragListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.common.swipedragrecyclerview.RecyclerHelper<T> setOnSwipeItemListener(@org.jetbrains.annotations.NotNull
    com.common.swipedragrecyclerview.OnSwipeListener onSwipeListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<T> getData() {
        return null;
    }
}