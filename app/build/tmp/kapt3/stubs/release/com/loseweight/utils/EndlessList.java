package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001+B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020$J\u0006\u0010\'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u000e\u0010)\u001a\u00020$2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010*\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\u00a8\u0006,"}, d2 = {"Lcom/loseweight/utils/EndlessList;", "", "()V", "enable", "", "firstVisibleItem", "", "getFirstVisibleItem$app_release", "()I", "setFirstVisibleItem$app_release", "(I)V", "isLock", "loadMoreListener", "Lcom/loseweight/utils/EndlessList$OnLoadMoreListener;", "getLoadMoreListener$app_release", "()Lcom/loseweight/utils/EndlessList$OnLoadMoreListener;", "setLoadMoreListener$app_release", "(Lcom/loseweight/utils/EndlessList$OnLoadMoreListener;)V", "mLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getOnScrollListener$app_release", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "setOnScrollListener$app_release", "(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "stackFromEnd", "totalItemCount", "getTotalItemCount$app_release", "setTotalItemCount$app_release", "visibleItemCount", "getVisibleItemCount$app_release", "setVisibleItemCount$app_release", "EndlessList", "", "linearLayoutManager", "disableLoadMore", "lockMoreLoading", "releaseLock", "setOnLoadMoreListener", "setStackFromEnd", "OnLoadMoreListener", "app_release"})
@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
public final class EndlessList {
    private static boolean isLock = false;
    private static boolean enable = true;
    private static boolean stackFromEnd = false;
    private static int firstVisibleItem = 0;
    private static int visibleItemCount = 0;
    private static int totalItemCount = 0;
    @org.jetbrains.annotations.Nullable
    private static androidx.recyclerview.widget.LinearLayoutManager mLinearLayoutManager;
    @org.jetbrains.annotations.Nullable
    private static androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull
    private static androidx.recyclerview.widget.RecyclerView.OnScrollListener onScrollListener;
    @org.jetbrains.annotations.Nullable
    private static com.loseweight.utils.EndlessList.OnLoadMoreListener loadMoreListener;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.utils.EndlessList INSTANCE = null;
    
    private EndlessList() {
        super();
    }
    
    public final int getFirstVisibleItem$app_release() {
        return 0;
    }
    
    public final void setFirstVisibleItem$app_release(int p0) {
    }
    
    public final int getVisibleItemCount$app_release() {
        return 0;
    }
    
    public final void setVisibleItemCount$app_release(int p0) {
    }
    
    public final int getTotalItemCount$app_release() {
        return 0;
    }
    
    public final void setTotalItemCount$app_release(int p0) {
    }
    
    public final void EndlessList(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
    }
    
    public final void setStackFromEnd(boolean stackFromEnd) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getOnScrollListener$app_release() {
        return null;
    }
    
    public final void setOnScrollListener$app_release(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.OnScrollListener p0) {
    }
    
    public final void lockMoreLoading() {
    }
    
    public final void releaseLock() {
    }
    
    public final void disableLoadMore() {
    }
    
    public final void setOnLoadMoreListener(@org.jetbrains.annotations.NotNull
    com.loseweight.utils.EndlessList.OnLoadMoreListener loadMoreListener) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.utils.EndlessList.OnLoadMoreListener getLoadMoreListener$app_release() {
        return null;
    }
    
    public final void setLoadMoreListener$app_release(@org.jetbrains.annotations.Nullable
    com.loseweight.utils.EndlessList.OnLoadMoreListener p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/loseweight/utils/EndlessList$OnLoadMoreListener;", "", "onLoadMore", "", "app_release"})
    public static abstract interface OnLoadMoreListener {
        
        public abstract void onLoadMore();
    }
}