package com.common.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\tR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/common/view/CustomViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPagerAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "getMPagerAdapter", "()Landroidx/viewpager/widget/PagerAdapter;", "setMPagerAdapter", "(Landroidx/viewpager/widget/PagerAdapter;)V", "onAttachedToWindow", "", "setAdapter", "adapter", "storeAdapter", "pagerAdapter", "app_debug"})
public final class CustomViewPager extends androidx.viewpager.widget.ViewPager {
    @org.jetbrains.annotations.Nullable
    private androidx.viewpager.widget.PagerAdapter mPagerAdapter;
    
    @org.jetbrains.annotations.Nullable
    public final androidx.viewpager.widget.PagerAdapter getMPagerAdapter() {
        return null;
    }
    
    public final void setMPagerAdapter(@org.jetbrains.annotations.Nullable
    androidx.viewpager.widget.PagerAdapter p0) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    public void setAdapter(@org.jetbrains.annotations.Nullable
    androidx.viewpager.widget.PagerAdapter adapter) {
    }
    
    public final void storeAdapter(@org.jetbrains.annotations.Nullable
    androidx.viewpager.widget.PagerAdapter pagerAdapter) {
    }
    
    public CustomViewPager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public CustomViewPager(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
}