package com.utillity.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\bE\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"CurrentTimeStamp", "", "DBName", "DayCount", "DayExId", "DayExTable", "DayId", "DayName", "DayProgress", "Days", "DefaultSort", "ExDescription", "ExId", "ExName", "ExPath", "ExReplaceTime", "ExTime", "ExUnit", "ExVideo", "ExerciseTable", "HBurnKcal", "HCompletionTime", "HDateTime", "HDayId", "HDayName", "HFeelRate", "HFeet", "HId", "HInch", "HKg", "HPlanId", "HPlanName", "HTotalEx", "HasSubPlan", "HistoryTable", "HomeExSingleTable", "Introduction", "IsActive", "IsCompleted", "IsDeleted", "IsPro", "ParentPlanId", "PlanDays", "PlanDaysTable", "PlanId", "PlanImage", "PlanLvl", "PlanMinutes", "PlanName", "PlanProgress", "PlanSort", "PlanTable", "PlanText", "PlanThumbnail", "PlanType", "PlanTypeImage", "PlanWorkouts", "RId", "RemindTime", "ReminderTable", "ReplaceExId", "ShortDes", "TestDes", "UpdatedExTime", "WeekName", "WeightDate", "WeightId", "WeightKg", "WeightLb", "WeightTable", "app_release"})
public final class DataHelperKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DBName = "LoseWeight.db";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanTable = "HomePlanTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanId = "PlanId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanName = "PlanName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanProgress = "PlanProgress";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanText = "PlanText";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanLvl = "PlanLvl";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanImage = "PlanImage";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanDays = "PlanDays";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayCount = "Days";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanType = "PlanType";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ShortDes = "ShortDes";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String Introduction = "Introduction";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanWorkouts = "PlanWorkouts";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanMinutes = "PlanMinutes";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IsPro = "IsPro";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HasSubPlan = "HasSubPlan";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TestDes = "TestDes";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanThumbnail = "PlanThumbnail";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanTypeImage = "PlanTypeImage";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ParentPlanId = "ParentPlanId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanSort = "sort";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DefaultSort = "DefaultSort";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PlanDaysTable = "PlanDaysTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayId = "DayId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayName = "DayName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeekName = "WeekName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IsCompleted = "IsCompleted";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayProgress = "DayProgress";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayExTable = "DayExTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HomeExSingleTable = "HomeExSingleTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DayExId = "Id";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExId = "ExId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExTime = "ExTime";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String UpdatedExTime = "UpdatedExTime";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ReplaceExId = "ReplaceExId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IsDeleted = "IsDeleted";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExerciseTable = "ExerciseTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExName = "ExName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExUnit = "ExUnit";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExPath = "ExPath";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExDescription = "ExDescription";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExVideo = "ExVideo";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ExReplaceTime = "ReplaceTime";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ReminderTable = "ReminderTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RId = "RId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RemindTime = "RemindTime";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String Days = "Days";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IsActive = "IsActive";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeightTable = "WeightTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeightId = "WeightId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeightKg = "WeightKg";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeightLb = "WeightLb";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String WeightDate = "WeightDate";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CurrentTimeStamp = "CurrentTimeStamp";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HistoryTable = "HistoryTable";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HId = "HId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HPlanName = "HPlanName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HPlanId = "HPlanId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HDayName = "HDayName";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HDayId = "HDayId";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HBurnKcal = "HBurnKcal";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HTotalEx = "HTotalEx";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HKg = "HKg";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HFeet = "HFeet";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HInch = "HInch";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HFeelRate = "HFeelRate";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HCompletionTime = "HCompletionTime";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String HDateTime = "HDateTime";
}