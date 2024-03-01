package com.loseweight.utils.reminder;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020#H\u0003J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0002J\u0010\u0010+\u001a\u00020#2\u0006\u0010(\u001a\u00020\'H\u0002J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'H\u0002J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u000201H\u0016J\u001e\u00102\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u0010\u001f\u001a\u00020 J&\u00105\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u0010\u001f\u001a\u00020 2\u0006\u00106\u001a\u000207R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00068"}, d2 = {"Lcom/loseweight/utils/reminder/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "dataBaseHelper", "Lcom/utillity/db/DataHelper;", "getDataBaseHelper", "()Lcom/utillity/db/DataHelper;", "setDataBaseHelper", "(Lcom/utillity/db/DataHelper;)V", "mAlarmManager", "Landroid/app/AlarmManager;", "getMAlarmManager", "()Landroid/app/AlarmManager;", "setMAlarmManager", "(Landroid/app/AlarmManager;)V", "mPendingIntent", "Landroid/app/PendingIntent;", "getMPendingIntent", "()Landroid/app/PendingIntent;", "setMPendingIntent", "(Landroid/app/PendingIntent;)V", "reminderClass", "Lcom/loseweight/objects/ReminderTableClass;", "getReminderClass", "()Lcom/loseweight/objects/ReminderTableClass;", "setReminderClass", "(Lcom/loseweight/objects/ReminderTableClass;)V", "cancelAlarm", "", "context", "Landroid/content/Context;", "ID", "", "fireNotification", "getCurrentDate", "", "getCurrentDayName", "getCurrentFullDayName", "getDate", "Ljava/util/Date;", "date", "getDayNumber", "dayName", "getEndDate", "isDateBetweenStartEndDate", "", "max", "onReceive", "intent", "Landroid/content/Intent;", "setAlarm", "calendar", "Ljava/util/Calendar;", "setRepeatAlarm", "RepeatTime", "", "app_debug"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.Nullable
    private android.app.AlarmManager mAlarmManager;
    @org.jetbrains.annotations.Nullable
    private android.app.PendingIntent mPendingIntent;
    public com.utillity.db.DataHelper dataBaseHelper;
    public com.loseweight.objects.ReminderTableClass reminderClass;
    
    public AlarmReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.AlarmManager getMAlarmManager() {
        return null;
    }
    
    public final void setMAlarmManager(@org.jetbrains.annotations.Nullable
    android.app.AlarmManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.PendingIntent getMPendingIntent() {
        return null;
    }
    
    public final void setMPendingIntent(@org.jetbrains.annotations.Nullable
    android.app.PendingIntent p0) {
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
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    public final void setAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.Calendar calendar, int ID) {
    }
    
    public final void setRepeatAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.Calendar calendar, int ID, long RepeatTime) {
    }
    
    public final void cancelAlarm(@org.jetbrains.annotations.NotNull
    android.content.Context context, int ID) {
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