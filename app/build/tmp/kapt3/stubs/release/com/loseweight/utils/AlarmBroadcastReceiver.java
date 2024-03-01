package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0003J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006#"}, d2 = {"Lcom/loseweight/utils/AlarmBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "dataBaseHelper", "Lcom/utillity/db/DataHelper;", "getDataBaseHelper", "()Lcom/utillity/db/DataHelper;", "setDataBaseHelper", "(Lcom/utillity/db/DataHelper;)V", "reminderClass", "Lcom/loseweight/objects/ReminderTableClass;", "getReminderClass", "()Lcom/loseweight/objects/ReminderTableClass;", "setReminderClass", "(Lcom/loseweight/objects/ReminderTableClass;)V", "fireNotification", "", "context", "Landroid/content/Context;", "getCurrentDate", "", "getCurrentDayName", "getCurrentFullDayName", "getDate", "Ljava/util/Date;", "date", "getDayNumber", "dayName", "getEndDate", "isDateBetweenStartEndDate", "", "max", "onReceive", "intent", "Landroid/content/Intent;", "app_release"})
public final class AlarmBroadcastReceiver extends android.content.BroadcastReceiver {
    public com.utillity.db.DataHelper dataBaseHelper;
    public com.loseweight.objects.ReminderTableClass reminderClass;
    
    public AlarmBroadcastReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.utillity.db.DataHelper getDataBaseHelper() {
        return null;
    }
    
    public final void setDataBaseHelper(@org.jetbrains.annotations.NotNull
    com.utillity.db.DataHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ReminderTableClass getReminderClass() {
        return null;
    }
    
    public final void setReminderClass(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.ReminderTableClass p0) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final void fireNotification(android.content.Context context, com.loseweight.objects.ReminderTableClass reminderClass) {
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final java.util.Date getDate(java.lang.String date) {
        return null;
    }
    
    private final boolean isDateBetweenStartEndDate(java.util.Date max, java.util.Date date) {
        return false;
    }
    
    private final java.lang.String getCurrentFullDayName() {
        return null;
    }
    
    private final java.lang.String getCurrentDayName() {
        return null;
    }
    
    private final java.lang.String getCurrentDate() {
        return null;
    }
    
    private final java.lang.String getEndDate(java.util.Date date) {
        return null;
    }
    
    private final java.lang.String getDayNumber(java.lang.String dayName) {
        return null;
    }
}