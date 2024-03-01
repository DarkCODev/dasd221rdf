package com.stretching.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001cB\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/stretching/utils/CountDownAnimation;", "", "textView", "Landroid/widget/TextView;", "startCount", "", "(Landroid/widget/TextView;I)V", "mAnimation", "Landroid/view/animation/Animation;", "mCountDown", "Ljava/lang/Runnable;", "mCurrentCount", "mHandler", "Landroid/os/Handler;", "mListener", "Lcom/stretching/utils/CountDownAnimation$CountDownListener;", "mStartCount", "mTextView", "cancel", "", "getAnimation", "getStartCount", "setAnimation", "animation", "setCountDownListener", "listener", "setStartCount", "start", "CountDownListener", "app_debug"})
public final class CountDownAnimation {
    @org.jetbrains.annotations.Nullable
    private android.widget.TextView mTextView;
    @org.jetbrains.annotations.Nullable
    private android.view.animation.Animation mAnimation;
    private int mStartCount = 0;
    private int mCurrentCount = 0;
    @org.jetbrains.annotations.Nullable
    private com.stretching.utils.CountDownAnimation.CountDownListener mListener;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler mHandler = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable mCountDown = null;
    
    /**
     * Creates a count down animation in the <var>textView</var>, starting from
     * <var>startCount</var>.
     *
     *
     *
     * By default, the class defines a fade out animation, which uses
     * [AlphaAnimation] from 1 to 0.
     *
     *
     * @param textView
     * The view where the count down will be shown
     * @param startCount
     * The starting count number
     */
    public CountDownAnimation(@org.jetbrains.annotations.Nullable
    android.widget.TextView textView, int startCount) {
        super();
    }
    
    /**
     * Starts the count down animation.
     */
    public final void start() {
    }
    
    /**
     * Cancels the count down animation.
     */
    public final void cancel() {
    }
    
    /**
     * Sets the animation used during the count down. If the duration of the
     * animation for each number is not set, one second will be defined.
     */
    public final void setAnimation(@org.jetbrains.annotations.Nullable
    android.view.animation.Animation animation) {
    }
    
    /**
     * Returns the animation used during the count down.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.animation.Animation getAnimation() {
        return null;
    }
    
    /**
     * Sets a new starting count number for the count down animation.
     *
     * @param startCount
     * The starting count number
     */
    public final void setStartCount(int startCount) {
    }
    
    /**
     * Returns the starting count number for the count down animation.
     */
    public final int getStartCount() {
        return 0;
    }
    
    /**
     * Binds a listener to this count down animation. The count down listener is
     * notified of events such as the end of the animation.
     *
     * @param listener
     * The count down listener to be notified
     */
    public final void setCountDownListener(@org.jetbrains.annotations.Nullable
    com.stretching.utils.CountDownAnimation.CountDownListener listener) {
    }
    
    /**
     * A count down listener receives notifications from a count down animation.
     * Notifications indicate count down animation related events, such as the
     * end of the animation.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stretching/utils/CountDownAnimation$CountDownListener;", "", "onCountDownEnd", "", "animation", "Lcom/stretching/utils/CountDownAnimation;", "app_debug"})
    public static abstract interface CountDownListener {
        
        /**
         * Notifies the end of the count down animation.
         *
         * @param animation
         * The count down animation which reached its end.
         */
        public abstract void onCountDownEnd(@org.jetbrains.annotations.Nullable
        com.stretching.utils.CountDownAnimation animation);
    }
}