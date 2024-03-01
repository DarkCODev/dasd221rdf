package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H&J0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/loseweight/utils/EndlessParentScrollListener;", "Landroidx/core/widget/NestedScrollView$OnScrollChangeListener;", "mLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "currentPage", "", "loading", "", "getMLayoutManager$app_debug", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setMLayoutManager$app_debug", "previousTotalItemCount", "startingPageIndex", "visibleThresholdDistance", "onLoadMore", "", "page", "totalItemsCount", "onScrollChange", "scrollView", "Landroidx/core/widget/NestedScrollView;", "x", "y", "oldx", "oldy", "app_debug"})
public abstract class EndlessParentScrollListener implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
    @org.jetbrains.annotations.NotNull
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private int currentPage = 0;
    private int previousTotalItemCount = 0;
    private boolean loading = true;
    private final int startingPageIndex = 0;
    private final int visibleThresholdDistance = 300;
    
    public EndlessParentScrollListener(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getMLayoutManager$app_debug() {
        return null;
    }
    
    public final void setMLayoutManager$app_debug(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    @java.lang.Override
    public void onScrollChange(@org.jetbrains.annotations.NotNull
    androidx.core.widget.NestedScrollView scrollView, int x, int y, int oldx, int oldy) {
    }
    
    public abstract void onLoadMore(int page, int totalItemsCount);
}