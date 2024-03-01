package com.common.view;

/**
 * Maintains an aspect ratio based on either width or height. Disabled by default.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0014J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/common/view/AspectRatioImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "aspectRatio", "", "aspectRatioEnabled", "", "dominantMeasurement", "", "getAspectRatio", "getAspectRatioEnabled", "getDominantMeasurement", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setAspectRatio", "setAspectRatioEnabled", "setDominantMeasurement", "Companion", "app_release"})
public final class AspectRatioImageView extends androidx.appcompat.widget.AppCompatImageView {
    private float aspectRatio = 0.0F;
    private boolean aspectRatioEnabled = false;
    private int dominantMeasurement = 0;
    private static final int MEASUREMENT_WIDTH = 0;
    private static final int MEASUREMENT_HEIGHT = 1;
    private static final float DEFAULT_ASPECT_RATIO = 1.0F;
    private static final boolean DEFAULT_ASPECT_RATIO_ENABLED = false;
    private static final int DEFAULT_DOMINANT_MEASUREMENT = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.common.view.AspectRatioImageView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public AspectRatioImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    /**
     * Get the aspect ratio for this image view.
     */
    public final float getAspectRatio() {
        return 0.0F;
    }
    
    /**
     * Set the aspect ratio for this image view. This will update the view instantly.
     */
    public final void setAspectRatio(float aspectRatio) {
    }
    
    /**
     * Get whether or not forcing the aspect ratio is enabled.
     */
    public final boolean getAspectRatioEnabled() {
        return false;
    }
    
    /**
     * set whether or not forcing the aspect ratio is enabled. This will re-layout the view.
     */
    public final void setAspectRatioEnabled(boolean aspectRatioEnabled) {
    }
    
    /**
     * Get the dominant measurement for the aspect ratio.
     */
    public final int getDominantMeasurement() {
        return 0;
    }
    
    /**
     * Set the dominant measurement for the aspect ratio.
     *
     * @see .MEASUREMENT_WIDTH
     *
     * @see .MEASUREMENT_HEIGHT
     */
    public final void setDominantMeasurement(int dominantMeasurement) {
    }
    
    @kotlin.jvm.JvmOverloads
    public AspectRatioImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/common/view/AspectRatioImageView$Companion;", "", "()V", "DEFAULT_ASPECT_RATIO", "", "DEFAULT_ASPECT_RATIO_ENABLED", "", "DEFAULT_DOMINANT_MEASUREMENT", "", "MEASUREMENT_HEIGHT", "getMEASUREMENT_HEIGHT", "()I", "MEASUREMENT_WIDTH", "getMEASUREMENT_WIDTH", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getMEASUREMENT_WIDTH() {
            return 0;
        }
        
        public final int getMEASUREMENT_HEIGHT() {
            return 0;
        }
    }
}