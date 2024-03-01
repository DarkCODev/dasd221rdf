package com.utillity.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Jf\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\bJ\u000e\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\bJ\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\b0)j\b\u0012\u0004\u0012\u00020\b`*J\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0)j\b\u0012\u0004\u0012\u00020,`*2\u0006\u0010\'\u001a\u00020\bJ\u0010\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\'\u001a\u00020\bJ\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u0002000)j\b\u0012\u0004\u0012\u000200`*J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u00020\u0006J\u0006\u00104\u001a\u00020\u0006J\u001e\u00105\u001a\u0012\u0012\u0004\u0012\u00020,0)j\b\u0012\u0004\u0012\u00020,`*2\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u0002070)j\b\u0012\u0004\u0012\u000207`*2\u0006\u00108\u001a\u00020\bJ\u001e\u00109\u001a\u0012\u0012\u0004\u0012\u0002070)j\b\u0012\u0004\u0012\u000207`*2\u0006\u0010:\u001a\u00020\bJ\u0006\u0010;\u001a\u00020\bJ\u0006\u0010<\u001a\u00020\bJ\u0010\u0010=\u001a\u0004\u0018\u00010\b2\u0006\u0010>\u001a\u00020\u0006J\u0010\u0010?\u001a\u0004\u0018\u00010\b2\u0006\u0010>\u001a\u00020\u0006J\u0010\u0010@\u001a\u0004\u0018\u0001072\u0006\u0010A\u001a\u00020\u0006J\u000e\u0010B\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\u000e\u0010C\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bJ\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u0004\u0018\u00010GJ\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020G0)j\b\u0012\u0004\u0012\u00020G`*J\u000e\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\bJ\u0016\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00160)j\b\u0012\u0004\u0012\u00020\u0016`*J\u0006\u0010L\u001a\u00020\bJ\u001e\u0010M\u001a\u0012\u0012\u0004\u0012\u00020N0)j\b\u0012\u0004\u0012\u00020N`*2\u0006\u0010O\u001a\u00020\bJ\u0016\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bJ\u0016\u0010S\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bJ>\u0010T\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0U0)j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0Uj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`V`*J\u0016\u0010W\u001a\u0012\u0012\u0004\u0012\u00020X0)j\b\u0012\u0004\u0012\u00020X`*J(\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020.0)j\b\u0012\u0004\u0012\u00020.`*2\u0006\u0010Z\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0002J&\u0010[\u001a\u0012\u0012\u0004\u0012\u00020G0)j\b\u0012\u0004\u0012\u00020G`*2\u0006\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bJ\u000e\u0010\\\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bJ\u0016\u0010]\u001a\u0012\u0012\u0004\u0012\u00020^0)j\b\u0012\u0004\u0012\u00020^`*J&\u0010_\u001a\u0012\u0012\u0004\u0012\u00020`0)j\b\u0012\u0004\u0012\u00020``*2\u0006\u0010a\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bJ\u000e\u0010b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010c\u001a\u00020d2\u0006\u0010\'\u001a\u00020\bJ\u001e\u0010e\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020\b2\u0006\u0010O\u001a\u00020\b2\u0006\u0010g\u001a\u00020\bJ\u001e\u0010h\u001a\u00020d2\u0016\u0010i\u001a\u0012\u0012\u0004\u0012\u00020,0)j\b\u0012\u0004\u0012\u00020,`*J\u001e\u0010j\u001a\u00020d2\u0016\u0010i\u001a\u0012\u0012\u0004\u0012\u00020,0)j\b\u0012\u0004\u0012\u00020,`*J\u000e\u0010k\u001a\u00020d2\u0006\u0010A\u001a\u00020\bJ\u0006\u0010l\u001a\u00020dJ\u000e\u0010m\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\bJ\u000e\u0010n\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\bJ\u000e\u0010o\u001a\u00020\u001c2\u0006\u0010p\u001a\u00020,J\u000e\u0010q\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\bJ\u000e\u0010r\u001a\u00020\u001c2\u0006\u0010p\u001a\u00020,J\u0016\u0010s\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\bJ\u0016\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\b2\u0006\u0010v\u001a\u00020\bJ\u0016\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bJ\u0016\u0010y\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\b2\u0006\u0010z\u001a\u00020\bJ\u001e\u0010{\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010|\u001a\u00020\bJ\u000e\u0010}\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Lcom/utillity/db/DataHelper;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addHistory", "", "strPlanId", "", "strPlanName", "strDateTime", "strCompletionTime", "strBurnKcal", "strTotalWorkout", "strKg", "strFeet", "strInch", "strFeelRate", "strDayName", "dayId", "addReminder", "reminderClass", "Lcom/loseweight/objects/ReminderTableClass;", "addUserWeight", "strWeightKG", "strDate", "strweightLB", "checkDBExist", "", "copyDatabase", "dbFile", "Ljava/io/File;", "deleteHistory", "historyId", "deleteReminder", "id", "getCompleteDayCountByPlanId", "strId", "getCompleteDayExList", "strDayId", "getCompleteExerciseDate", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDayExList", "Lcom/loseweight/objects/HomeExTableClass;", "getDaysPlanData", "Lcom/loseweight/objects/PWeekDayData;", "getHistoryList", "Lcom/loseweight/objects/HistoryTableClass;", "getHistoryTotalKCal", "", "getHistoryTotalMinutes", "getHistoryTotalWorkout", "getHomeDetailExList", "getHomePlanList", "Lcom/loseweight/objects/HomePlanTableClass;", "strPlanType", "getHomeSubPlanList", "parentPlanId", "getMaxWeight", "getMinWeight", "getOriginalPlanExID", "dayExId", "getOriginalPlanExTime", "getPlanByPlanId", "planId", "getPlanDayNameByDayId", "getPlanNameByPlanId", "getReadWriteDB", "Landroid/database/sqlite/SQLiteDatabase;", "getRecentHistory", "Lcom/loseweight/objects/HistoryDetailsClass;", "getRecentHistoryList", "getReminderById", "mid", "getRemindersList", "getRemindersListString", "getReplaceExList", "Lcom/loseweight/objects/ExTableClass;", "strExId", "getTotBurnWeekKcal", "strWeekStart", "strWeekEnd", "getTotWeekWorkoutTime", "getUserWeightData", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getWeekDayOfHistory", "Lcom/loseweight/objects/HistoryWeekDataClass;", "getWeekDaysData", "strWeekName", "getWeekHistoryData", "getWeightForDate", "getWeightList", "Lcom/loseweight/objects/WeightTableClass;", "getWorkoutWeeklyData", "Lcom/loseweight/objects/PWeeklyDayData;", "strCategoryName", "isHistoryAvailable", "reStartPlanDay", "", "replaceExercise", "strDayExId", "strExTime", "resetPlanDay", "ExcList", "resetPlanExc", "restartDayPlan", "restartProgress", "updateCompleteExByDayExId", "updateCompleteHomeExByDayExId", "updateDayPlanEx", "item", "updatePlanDayCompleteByDayId", "updatePlanEx", "updatePlanExTime", "updateReminder", "strReminderId", "strIsActive", "updateReminderDays", "strDays", "updateReminderTimes", "strTime", "updateWeight", "strWeightLB", "weightExistOrNot", "app_debug"})
public final class DataHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    
    public DataHelper(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    public final boolean checkDBExist() {
        return false;
    }
    
    private final android.database.sqlite.SQLiteDatabase getReadWriteDB() {
        return null;
    }
    
    private final boolean copyDatabase(java.io.File dbFile) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HomePlanTableClass> getHomePlanList(@org.jetbrains.annotations.NotNull
    java.lang.String strPlanType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HomePlanTableClass> getHomeSubPlanList(@org.jetbrains.annotations.NotNull
    java.lang.String parentPlanId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.HomePlanTableClass getPlanByPlanId(int planId) {
        return null;
    }
    
    public final void resetPlanDay(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HomeExTableClass> ExcList) {
    }
    
    public final void reStartPlanDay(@org.jetbrains.annotations.NotNull
    java.lang.String strDayId) {
    }
    
    public final void resetPlanExc(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HomeExTableClass> ExcList) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.ExTableClass> getReplaceExList(@org.jetbrains.annotations.NotNull
    java.lang.String strExId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalPlanExTime(int dayExId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOriginalPlanExID(int dayExId) {
        return null;
    }
    
    public final boolean updatePlanExTime(int dayExId, @org.jetbrains.annotations.NotNull
    java.lang.String strExTime) {
        return false;
    }
    
    public final boolean updatePlanEx(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.HomeExTableClass item) {
        return false;
    }
    
    public final boolean updateDayPlanEx(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.HomeExTableClass item) {
        return false;
    }
    
    public final boolean replaceExercise(@org.jetbrains.annotations.NotNull
    java.lang.String strDayExId, @org.jetbrains.annotations.NotNull
    java.lang.String strExId, @org.jetbrains.annotations.NotNull
    java.lang.String strExTime) {
        return false;
    }
    
    public final int getCompleteDayCountByPlanId(@org.jetbrains.annotations.NotNull
    java.lang.String strId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlanNameByPlanId(@org.jetbrains.annotations.NotNull
    java.lang.String strId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HomeExTableClass> getHomeDetailExList(@org.jetbrains.annotations.NotNull
    java.lang.String strPlanId) {
        return null;
    }
    
    public final int updateCompleteHomeExByDayExId(@org.jetbrains.annotations.NotNull
    java.lang.String strDayExId) {
        return 0;
    }
    
    public final int updateCompleteExByDayExId(@org.jetbrains.annotations.NotNull
    java.lang.String strDayExId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.ReminderTableClass> getRemindersList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRemindersListString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ReminderTableClass getReminderById(@org.jetbrains.annotations.NotNull
    java.lang.String mid) {
        return null;
    }
    
    public final int addReminder(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.ReminderTableClass reminderClass) {
        return 0;
    }
    
    public final boolean deleteReminder(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return false;
    }
    
    public final int updateReminder(@org.jetbrains.annotations.NotNull
    java.lang.String strReminderId, @org.jetbrains.annotations.NotNull
    java.lang.String strIsActive) {
        return 0;
    }
    
    public final int updateReminderDays(@org.jetbrains.annotations.NotNull
    java.lang.String strReminderId, @org.jetbrains.annotations.NotNull
    java.lang.String strDays) {
        return 0;
    }
    
    public final int updateReminderTimes(@org.jetbrains.annotations.NotNull
    java.lang.String strReminderId, @org.jetbrains.annotations.NotNull
    java.lang.String strTime) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.WeightTableClass> getWeightList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMaxWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMinWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> getUserWeightData() {
        return null;
    }
    
    public final boolean updateWeight(@org.jetbrains.annotations.NotNull
    java.lang.String strDate, @org.jetbrains.annotations.NotNull
    java.lang.String strWeightKG, @org.jetbrains.annotations.NotNull
    java.lang.String strWeightLB) {
        return false;
    }
    
    public final int addUserWeight(@org.jetbrains.annotations.NotNull
    java.lang.String strWeightKG, @org.jetbrains.annotations.NotNull
    java.lang.String strDate, @org.jetbrains.annotations.NotNull
    java.lang.String strweightLB) {
        return 0;
    }
    
    public final boolean weightExistOrNot(@org.jetbrains.annotations.NotNull
    java.lang.String strDate) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWeightForDate(@org.jetbrains.annotations.NotNull
    java.lang.String strDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HistoryTableClass> getHistoryList() {
        return null;
    }
    
    public final int getHistoryTotalMinutes() {
        return 0;
    }
    
    public final int getHistoryTotalWorkout() {
        return 0;
    }
    
    public final float getHistoryTotalKCal() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.String> getCompleteExerciseDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HistoryWeekDataClass> getWeekDayOfHistory() {
        return null;
    }
    
    public final int getTotBurnWeekKcal(@org.jetbrains.annotations.NotNull
    java.lang.String strWeekStart, @org.jetbrains.annotations.NotNull
    java.lang.String strWeekEnd) {
        return 0;
    }
    
    public final int getTotWeekWorkoutTime(@org.jetbrains.annotations.NotNull
    java.lang.String strWeekStart, @org.jetbrains.annotations.NotNull
    java.lang.String strWeekEnd) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> getWeekHistoryData(@org.jetbrains.annotations.NotNull
    java.lang.String strWeekStart, @org.jetbrains.annotations.NotNull
    java.lang.String strWeekEnd) {
        return null;
    }
    
    public final boolean isHistoryAvailable(@org.jetbrains.annotations.NotNull
    java.lang.String strDate) {
        return false;
    }
    
    public final int addHistory(@org.jetbrains.annotations.NotNull
    java.lang.String strPlanId, @org.jetbrains.annotations.NotNull
    java.lang.String strPlanName, @org.jetbrains.annotations.NotNull
    java.lang.String strDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String strCompletionTime, @org.jetbrains.annotations.NotNull
    java.lang.String strBurnKcal, @org.jetbrains.annotations.NotNull
    java.lang.String strTotalWorkout, @org.jetbrains.annotations.NotNull
    java.lang.String strKg, @org.jetbrains.annotations.NotNull
    java.lang.String strFeet, @org.jetbrains.annotations.NotNull
    java.lang.String strInch, @org.jetbrains.annotations.NotNull
    java.lang.String strFeelRate, @org.jetbrains.annotations.NotNull
    java.lang.String strDayName, @org.jetbrains.annotations.NotNull
    java.lang.String dayId) {
        return 0;
    }
    
    public final boolean deleteHistory(@org.jetbrains.annotations.NotNull
    java.lang.String historyId) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlanDayNameByDayId(@org.jetbrains.annotations.NotNull
    java.lang.String strId) {
        return null;
    }
    
    public final int updatePlanDayCompleteByDayId(@org.jetbrains.annotations.NotNull
    java.lang.String strDayId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.HistoryDetailsClass getRecentHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HistoryDetailsClass> getRecentHistoryList() {
        return null;
    }
    
    public final void restartProgress() {
    }
    
    public final void restartDayPlan(@org.jetbrains.annotations.NotNull
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.PWeeklyDayData> getWorkoutWeeklyData(@org.jetbrains.annotations.NotNull
    java.lang.String strCategoryName, @org.jetbrains.annotations.NotNull
    java.lang.String planId) {
        return null;
    }
    
    private final java.util.ArrayList<com.loseweight.objects.PWeekDayData> getWeekDaysData(java.lang.String strWeekName, java.lang.String planId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.PWeekDayData getDaysPlanData(@org.jetbrains.annotations.NotNull
    java.lang.String strDayId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HomeExTableClass> getDayExList(@org.jetbrains.annotations.NotNull
    java.lang.String strDayId) {
        return null;
    }
    
    public final int getCompleteDayExList(@org.jetbrains.annotations.NotNull
    java.lang.String strDayId) {
        return 0;
    }
}