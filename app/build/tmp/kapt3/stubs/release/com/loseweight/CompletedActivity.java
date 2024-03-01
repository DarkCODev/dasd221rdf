package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\b\u0010)\u001a\u00020\'H\u0002J\"\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\b\u00100\u001a\u00020\'H\u0016J\u0012\u00101\u001a\u00020\'2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020\'H\u0014J\b\u00105\u001a\u00020\'H\u0014J\u0010\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020\u0014H\u0002J\b\u00108\u001a\u00020\'H\u0002J\b\u00109\u001a\u00020\'H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006;"}, d2 = {"Lcom/loseweight/CompletedActivity;", "Lcom/loseweight/BaseActivity;", "()V", "binding", "Lcom/loseweight/databinding/ActivityCompletedBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityCompletedBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityCompletedBinding;)V", "exercisesList", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/HomeExTableClass;", "Lkotlin/collections/ArrayList;", "getExercisesList", "()Ljava/util/ArrayList;", "setExercisesList", "(Ljava/util/ArrayList;)V", "feelRate", "", "isDataSaved", "", "()Z", "setDataSaved", "(Z)V", "mySoundUtil", "Lcom/loseweight/utils/MySoundUtil;", "totalDuration", "", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "workoutPlanData", "Lcom/loseweight/objects/HomePlanTableClass;", "getWorkoutPlanData", "()Lcom/loseweight/objects/HomePlanTableClass;", "setWorkoutPlanData", "(Lcom/loseweight/objects/HomePlanTableClass;)V", "fillData", "", "init", "initIntentParam", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "saveData", "isGoToHistory", "setBmiCalculation", "setWeightValues", "ClickHandler", "app_release"})
public final class CompletedActivity extends com.loseweight.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityCompletedBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.objects.HomePlanTableClass workoutPlanData;
    @org.jetbrains.annotations.Nullable
    private java.util.ArrayList<com.loseweight.objects.HomeExTableClass> exercisesList;
    private long totalDuration = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String feelRate = "0";
    private boolean isDataSaved = false;
    private com.loseweight.utils.MySoundUtil mySoundUtil;
    
    public CompletedActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityCompletedBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityCompletedBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.HomePlanTableClass getWorkoutPlanData() {
        return null;
    }
    
    public final void setWorkoutPlanData(@org.jetbrains.annotations.Nullable
    com.loseweight.objects.HomePlanTableClass p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.loseweight.objects.HomeExTableClass> getExercisesList() {
        return null;
    }
    
    public final void setExercisesList(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.loseweight.objects.HomeExTableClass> p0) {
    }
    
    public final long getTotalDuration() {
        return 0L;
    }
    
    public final void setTotalDuration(long p0) {
    }
    
    public final boolean isDataSaved() {
        return false;
    }
    
    public final void setDataSaved(boolean p0) {
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
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void setBmiCalculation() {
    }
    
    private final void setWeightValues() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void saveData(boolean isGoToHistory) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/loseweight/CompletedActivity$ClickHandler;", "", "(Lcom/loseweight/CompletedActivity;)V", "onAddHeightClick", "", "onAddReminderClick", "onArrowUpClick", "onBackClick", "onDoItAgainClick", "onEditBMIClick", "onFeedBackClick", "onKGClick", "onLBClick", "onNextClick", "onSetFeel", "str", "", "onShareClick", "app_release"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onBackClick() {
        }
        
        public final void onAddReminderClick() {
        }
        
        public final void onEditBMIClick() {
        }
        
        public final void onAddHeightClick() {
        }
        
        public final void onShareClick() {
        }
        
        public final void onDoItAgainClick() {
        }
        
        public final void onNextClick() {
        }
        
        public final void onKGClick() {
        }
        
        public final void onLBClick() {
        }
        
        public final void onArrowUpClick() {
        }
        
        public final void onSetFeel(int str) {
        }
        
        public final void onFeedBackClick() {
        }
    }
}