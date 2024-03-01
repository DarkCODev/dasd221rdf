package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001cH\u0014J3\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010&\u001a\u00020\u00132\b\u0010\'\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006-"}, d2 = {"Lcom/loseweight/ReminderActivity;", "Lcom/loseweight/BaseActivity;", "()V", "arrReminder", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/ReminderTableClass;", "binding", "Lcom/loseweight/databinding/ActivityReminderBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityReminderBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityReminderBinding;)V", "reminderAdapter", "Lcom/loseweight/adapter/ReminderAdapter;", "getReminderAdapter", "()Lcom/loseweight/adapter/ReminderAdapter;", "setReminderAdapter", "(Lcom/loseweight/adapter/ReminderAdapter;)V", "confirmDeleteReminder", "", "content", "Landroid/content/Context;", "strTitle", "", "strMsg", "adapterPosition", "", "fillData", "", "init", "initIntentParam", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showDaySelectionDialog", "item", "isFromEdit", "hourOfDay", "minute", "(Lcom/loseweight/objects/ReminderTableClass;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "showPlaceHolder", "ClickHandler", "TopClickListener", "app_debug"})
public final class ReminderActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityReminderBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.ReminderAdapter reminderAdapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.loseweight.objects.ReminderTableClass> arrReminder;
    
    public ReminderActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityReminderBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityReminderBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.ReminderAdapter getReminderAdapter() {
        return null;
    }
    
    public final void setReminderAdapter(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.ReminderAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void fillData() {
    }
    
    private final void showPlaceHolder() {
    }
    
    private final boolean confirmDeleteReminder(android.content.Context content, java.lang.String strTitle, java.lang.String strMsg, int adapterPosition) {
        return false;
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void showDaySelectionDialog(com.loseweight.objects.ReminderTableClass item, boolean isFromEdit, java.lang.Integer hourOfDay, java.lang.Integer minute) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/loseweight/ReminderActivity$ClickHandler;", "", "(Lcom/loseweight/ReminderActivity;)V", "onAddReminderClick", "", "app_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onAddReminderClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/ReminderActivity$TopClickListener;", "Lcom/loseweight/interfaces/TopBarClickListener;", "(Lcom/loseweight/ReminderActivity;)V", "onTopBarClickListener", "", "view", "Landroid/view/View;", "value", "", "app_debug"})
    public final class TopClickListener implements com.loseweight.interfaces.TopBarClickListener {
        
        public TopClickListener() {
            super();
        }
        
        @java.lang.Override
        public void onTopBarClickListener(@org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.Nullable
        java.lang.String value) {
        }
    }
}