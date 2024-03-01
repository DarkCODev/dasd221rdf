package com.common.view;

/**
 * Constructor.
 *
 * @param horizontalDivider horizontal divider drawable
 * @param verticalDivider   vertical divider drawable
 * @param overlap           whether the divider is drawn overlapped on bottom (or right) of the item.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/common/view/SimpleListDividerDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "divider", "Landroid/graphics/drawable/Drawable;", "overlap", "", "(Landroid/graphics/drawable/Drawable;Z)V", "mHorizontalDrawable", "mVerticalDrawable", "mOverlap", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Z)V", "mHorizontalDividerHeight", "", "mVerticalDividerWidth", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "itemPosition", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "onDrawOver", "c", "Landroid/graphics/Canvas;", "app_debug"})
public final class SimpleListDividerDecorator extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    @org.jetbrains.annotations.Nullable
    private final android.graphics.drawable.Drawable mHorizontalDrawable = null;
    @org.jetbrains.annotations.Nullable
    private final android.graphics.drawable.Drawable mVerticalDrawable = null;
    private final boolean mOverlap = false;
    private final int mHorizontalDividerHeight = 0;
    private final int mVerticalDividerWidth = 0;
    
    public SimpleListDividerDecorator(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable mHorizontalDrawable, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable mVerticalDrawable, boolean mOverlap) {
        super();
    }
    
    /**
     * Constructor.
     *
     * @param divider horizontal divider drawable
     * @param overlap whether the divider is drawn overlapped on bottom of the item.
     */
    public SimpleListDividerDecorator(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable divider, boolean overlap) {
        super();
    }
    
    @java.lang.Override
    public void onDrawOver(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent) {
    }
    
    @java.lang.Override
    public void getItemOffsets(@org.jetbrains.annotations.NotNull
    android.graphics.Rect outRect, int itemPosition, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent) {
    }
}