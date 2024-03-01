package com.common.view.pinview;

/**
 * This class implements a pinview for android.
 * It can be used as a widget in android to take passwords/OTP/pins etc.
 * It is extended from a LinearLayout, implements TextWatcher, FocusChangeListener and OnKeyListener.
 * Supports drawableItem/selectors as a background for each pin box.
 * A listener is wired up to monitor complete data entry.
 * Can toggle cursor visibility.
 * Supports numpad and text keypad.
 * Flawless focus change to the consecutive pinbox.
 * Date : 11/01/17
 *
 * @author Krishanu
 * @author Pavan
 * @author Koushik
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0016J(\u0010c\u001a\u00020`2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\n2\u0006\u0010g\u001a\u00020\n2\u0006\u0010h\u001a\u00020\nH\u0016J\u0006\u0010i\u001a\u00020`J\b\u0010j\u001a\u00020`H\u0002J\u0018\u0010k\u001a\u00020`2\u0006\u0010l\u001a\u00020\u00162\u0006\u0010m\u001a\u00020#H\u0002J\u0006\u0010n\u001a\u00020-J\"\u0010o\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\"\u0010p\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010q\u001a\u00020`2\u0006\u0010r\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020 H\u0016J \u0010t\u001a\u00020 2\u0006\u0010r\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020\n2\u0006\u0010u\u001a\u00020vH\u0016J(\u0010w\u001a\u00020`2\u0006\u0010d\u001a\u00020e2\u0006\u0010x\u001a\u00020\n2\u0006\u0010g\u001a\u00020\n2\u0006\u0010y\u001a\u00020\nH\u0016J\u0006\u0010z\u001a\u00020`J\b\u0010{\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010|\u001a\u00020`2\u0006\u0010,\u001a\u00020-J\u0012\u0010}\u001a\u00020`2\b\u0010~\u001a\u0004\u0018\u000106H\u0016J\u0011\u0010\u007f\u001a\u00020`2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\nJ\u0010\u0010\u0081\u0001\u001a\u00020`2\u0007\u0010\u0082\u0001\u001a\u00020?J\t\u0010\u0083\u0001\u001a\u00020`H\u0002J\u000f\u0010\u0084\u0001\u001a\u00020`2\u0006\u0010=\u001a\u00020 J\t\u0010\u0085\u0001\u001a\u00020`H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018X\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0014\u0010)\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u0010+R\u001c\u00105\u001a\u0004\u0018\u000106X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n8G@BX\u0087\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010+R$\u0010O\u001a\u00020\n2\u0006\u0010O\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010+\"\u0004\bQ\u0010RR$\u0010S\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010+\"\u0004\bU\u0010RR$\u0010V\u001a\u00020\n2\u0006\u0010V\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010+\"\u0004\bX\u0010RR$\u0010Y\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010RR$\u0010\\\u001a\u00020#2\u0006\u0010\\\u001a\u00020#8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/common/view/pinview/PinView;", "Landroid/widget/LinearLayout;", "Landroid/text/TextWatcher;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/view/View$OnKeyListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DENSITY", "", "currentFocus", "Landroid/view/View;", "getCurrentFocus$app_debug", "()Landroid/view/View;", "setCurrentFocus$app_debug", "(Landroid/view/View;)V", "editTextList", "Ljava/util/ArrayList;", "Landroid/widget/EditText;", "filters", "", "Landroid/text/InputFilter;", "getFilters$app_debug", "()[Landroid/text/InputFilter;", "setFilters$app_debug", "([Landroid/text/InputFilter;)V", "[Landroid/text/InputFilter;", "finalNumberPin", "", "fromSetValue", "mHint", "", "hint", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "indexOfCurrentFocus", "getIndexOfCurrentFocus", "()I", "inputType", "Lcom/common/view/pinview/PinView$InputType;", "password", "isPassword", "()Z", "setPassword", "(Z)V", "keyboardInputType", "getKeyboardInputType", "mClickListener", "Landroid/view/View$OnClickListener;", "getMClickListener$app_debug", "()Landroid/view/View$OnClickListener;", "setMClickListener$app_debug", "(Landroid/view/View$OnClickListener;)V", "mCursorVisible", "mDelPressed", "mForceKeyboard", "mListener", "Lcom/common/view/pinview/PinView$PinViewEventListener;", "mPassword", "mPinHeight", "mPinLength", "mPinWidth", "mSplitWidth", "mTextSize", "params", "Landroid/widget/LinearLayout$LayoutParams;", "getParams$app_debug", "()Landroid/widget/LinearLayout$LayoutParams;", "setParams$app_debug", "(Landroid/widget/LinearLayout$LayoutParams;)V", "<set-?>", "pinBackground", "getPinBackground", "pinHeight", "getPinHeight", "setPinHeight", "(I)V", "pinLength", "getPinLength", "setPinLength", "pinWidth", "getPinWidth", "setPinWidth", "splitWidth", "getSplitWidth", "setSplitWidth", "value", "getValue", "setValue", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "i", "i1", "i2", "clearValue", "createEditTexts", "generateOneEditText", "styleEditText", "tag", "getInputType", "init", "initAttributes", "onFocusChange", "view", "isFocused", "onKey", "keyEvent", "Landroid/view/KeyEvent;", "onTextChanged", "start", "count", "openKeyboard", "requestPinEntryFocus", "setInputType", "setOnClickListener", "l", "setPinBackgroundRes", "res", "setPinViewEventListener", "listener", "setTransformation", "setmForceKeyboard", "updateEnabledState", "Companion", "InputType", "PinTransformationMethod", "PinViewEventListener", "app_debug"})
public final class PinView extends android.widget.LinearLayout implements android.text.TextWatcher, android.view.View.OnFocusChangeListener, android.view.View.OnKeyListener {
    private final float DENSITY = 0.0F;
    
    /**
     * Attributes
     */
    private int mPinLength = 4;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<android.widget.EditText> editTextList = null;
    private int mPinWidth = 50;
    private int mTextSize = 14;
    private int mPinHeight = 50;
    private int mSplitWidth = 10;
    private boolean mCursorVisible = false;
    private boolean mDelPressed = false;
    @androidx.annotation.DrawableRes
    private int pinBackground = com.loseweight.R.drawable.bg_pinview;
    private boolean mPassword = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String mHint = "*";
    @org.jetbrains.annotations.NotNull
    private com.common.view.pinview.PinView.InputType inputType = com.common.view.pinview.PinView.InputType.TEXT;
    private boolean finalNumberPin = false;
    @org.jetbrains.annotations.Nullable
    private com.common.view.pinview.PinView.PinViewEventListener mListener;
    private boolean fromSetValue = false;
    private boolean mForceKeyboard = true;
    @org.jetbrains.annotations.Nullable
    private android.view.View.OnClickListener mClickListener;
    @org.jetbrains.annotations.Nullable
    private android.view.View currentFocus;
    @org.jetbrains.annotations.NotNull
    private android.text.InputFilter[] filters;
    @org.jetbrains.annotations.Nullable
    private android.widget.LinearLayout.LayoutParams params;
    @org.jetbrains.annotations.NotNull
    public static final com.common.view.pinview.PinView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public PinView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @androidx.annotation.DrawableRes
    public final int getPinBackground() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View.OnClickListener getMClickListener$app_debug() {
        return null;
    }
    
    public final void setMClickListener$app_debug(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getCurrentFocus$app_debug() {
        return null;
    }
    
    public final void setCurrentFocus$app_debug(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.InputFilter[] getFilters$app_debug() {
        return null;
    }
    
    public final void setFilters$app_debug(@org.jetbrains.annotations.NotNull
    android.text.InputFilter[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.LinearLayout.LayoutParams getParams$app_debug() {
        return null;
    }
    
    public final void setParams$app_debug(@org.jetbrains.annotations.Nullable
    android.widget.LinearLayout.LayoutParams p0) {
    }
    
    private final int getKeyboardInputType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    private final int getIndexOfCurrentFocus() {
        return 0;
    }
    
    public final int getSplitWidth() {
        return 0;
    }
    
    public final void setSplitWidth(int splitWidth) {
    }
    
    public final int getPinHeight() {
        return 0;
    }
    
    public final void setPinHeight(int pinHeight) {
    }
    
    public final int getPinWidth() {
        return 0;
    }
    
    public final void setPinWidth(int pinWidth) {
    }
    
    public final int getPinLength() {
        return 0;
    }
    
    public final void setPinLength(int pinLength) {
    }
    
    public final boolean isPassword() {
        return false;
    }
    
    public final void setPassword(boolean password) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHint() {
        return null;
    }
    
    public final void setHint(@org.jetbrains.annotations.Nullable
    java.lang.String mHint) {
    }
    
    /**
     * A method to take care of all the initialisations.
     *
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    private final void init(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    /**
     * Creates editTexts and adds it to the pinview based on the pinLength specified.
     */
    private final void createEditTexts() {
    }
    
    /**
     * This method gets the attribute values from the XML, if not found it takes the default values.
     *
     * @param context
     * @param attrs
     * @param defStyleAttr
     */
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    private final void generateOneEditText(android.widget.EditText styleEditText, java.lang.String tag) {
    }
    
    /**
     * Requsets focus on current pin view and opens keyboard if forceKeyboard is enabled.
     *
     * @return the current focused pin view. It can be used to open softkeyboard manually.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View requestPinEntryFocus() {
        return null;
    }
    
    public final void setmForceKeyboard(boolean mForceKeyboard) {
    }
    
    public final void openKeyboard() {
    }
    
    /**
     * Clears the values in the Pinview
     */
    public final void clearValue() {
    }
    
    @java.lang.Override
    public void onFocusChange(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean isFocused) {
    }
    
    /**
     * Handles the character transformation for password inputs.
     */
    private final void setTransformation() {
    }
    
    @java.lang.Override
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence charSequence, int i, int i1, int i2) {
    }
    
    /**
     * Fired when text changes in the editTexts.
     * Backspace is also identified here.
     *
     * @param charSequence
     * @param start
     * @param i1
     * @param count
     */
    @java.lang.Override
    public void onTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence charSequence, int start, int i1, int count) {
    }
    
    /**
     * Disable views ahead of current focus, so a selector can change the drawing of those views.
     */
    private final void updateEnabledState() {
    }
    
    @java.lang.Override
    public void afterTextChanged(@org.jetbrains.annotations.NotNull
    android.text.Editable editable) {
    }
    
    /**
     * Monitors keyEvent.
     *
     * @param view
     * @param i
     * @param keyEvent
     * @return
     */
    @java.lang.Override
    public boolean onKey(@org.jetbrains.annotations.NotNull
    android.view.View view, int i, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent keyEvent) {
        return false;
    }
    
    public final void setPinBackgroundRes(@androidx.annotation.DrawableRes
    int res) {
    }
    
    @java.lang.Override
    public void setOnClickListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener l) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.common.view.pinview.PinView.InputType getInputType() {
        return null;
    }
    
    public final void setInputType(@org.jetbrains.annotations.NotNull
    com.common.view.pinview.PinView.InputType inputType) {
    }
    
    public final void setPinViewEventListener(@org.jetbrains.annotations.NotNull
    com.common.view.pinview.PinView.PinViewEventListener listener) {
    }
    
    @kotlin.jvm.JvmOverloads
    public PinView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public PinView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/common/view/pinview/PinView$Companion;", "", "()V", "setCursorColor", "", "view", "Landroid/widget/EditText;", "color", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Takes care of styling the editText passed in the param.
         * tag is the index of the editText.
         *
         * @param styleEditText
         * @param tag
         */
        public final void setCursorColor(@org.jetbrains.annotations.NotNull
        android.widget.EditText view, @androidx.annotation.ColorInt
        int color) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/common/view/pinview/PinView$InputType;", "", "(Ljava/lang/String;I)V", "TEXT", "NUMBER", "app_debug"})
    public static enum InputType {
        /*public static final*/ TEXT /* = new TEXT() */,
        /*public static final*/ NUMBER /* = new NUMBER() */;
        
        InputType() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.common.view.pinview.PinView.InputType> getEntries() {
            return null;
        }
    }
    
    /**
     * A class to implement the transformation mechanism
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J2\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/common/view/pinview/PinView$PinTransformationMethod;", "Landroid/text/method/TransformationMethod;", "(Lcom/common/view/pinview/PinView;)V", "BULLET", "", "getBULLET", "()C", "getTransformation", "", "source", "view", "Landroid/view/View;", "onFocusChanged", "", "sourceText", "focused", "", "direction", "", "previouslyFocusedRect", "Landroid/graphics/Rect;", "PasswordCharSequence", "app_debug"})
    final class PinTransformationMethod implements android.text.method.TransformationMethod {
        private final char BULLET = '\u2022';
        
        public PinTransformationMethod() {
            super();
        }
        
        public char getBULLET() {
            return '\u0000';
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.CharSequence getTransformation(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence source, @org.jetbrains.annotations.NotNull
        android.view.View view) {
            return null;
        }
        
        @java.lang.Override
        public void onFocusChanged(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.NotNull
        java.lang.CharSequence sourceText, boolean focused, int direction, @org.jetbrains.annotations.Nullable
        android.graphics.Rect previouslyFocusedRect) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0096\u0002J\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/common/view/pinview/PinView$PinTransformationMethod$PasswordCharSequence;", "", "source", "(Lcom/common/view/pinview/PinView$PinTransformationMethod;Ljava/lang/CharSequence;)V", "length", "", "getLength", "()I", "getSource", "()Ljava/lang/CharSequence;", "setSource", "(Ljava/lang/CharSequence;)V", "get", "", "index", "subSequence", "startIndex", "endIndex", "app_debug"})
        final class PasswordCharSequence implements java.lang.CharSequence {
            @org.jetbrains.annotations.NotNull
            private java.lang.CharSequence source;
            
            public PasswordCharSequence(@org.jetbrains.annotations.NotNull
            java.lang.CharSequence source) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.CharSequence getSource() {
                return null;
            }
            
            public final void setSource(@org.jetbrains.annotations.NotNull
            java.lang.CharSequence p0) {
            }
            
            @java.lang.Override
            public int getLength() {
                return 0;
            }
            
            @java.lang.Override
            public char get(int index) {
                return '\u0000';
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.CharSequence subSequence(int startIndex, int endIndex) {
                return null;
            }
            
            @java.lang.Override
            public final char charAt(int index) {
                return '\u0000';
            }
            
            @java.lang.Override
            public final int length() {
                return 0;
            }
        }
    }
    
    /**
     * Interface for onDataEntered event.
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/common/view/pinview/PinView$PinViewEventListener;", "", "onDataEntered", "", "pinView", "Lcom/common/view/pinview/PinView;", "fromUser", "", "app_debug"})
    public static abstract interface PinViewEventListener {
        
        public abstract void onDataEntered(@org.jetbrains.annotations.NotNull
        com.common.view.pinview.PinView pinView, boolean fromUser);
    }
}