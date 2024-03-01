package com.loseweight;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002=>B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0002J\"\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020)H\u0016J\b\u00104\u001a\u00020)H\u0016J\u0012\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\b\u00108\u001a\u00020)H\u0014J\b\u00109\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020)H\u0016J\b\u0010;\u001a\u00020)H\u0002J\b\u0010<\u001a\u00020)H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006?"}, d2 = {"Lcom/loseweight/EditPlanActivity;", "Lcom/loseweight/BaseActivity;", "Lcom/loseweight/interfaces/CallbackListener;", "()V", "binding", "Lcom/loseweight/databinding/ActivityEditPlanBinding;", "getBinding", "()Lcom/loseweight/databinding/ActivityEditPlanBinding;", "setBinding", "(Lcom/loseweight/databinding/ActivityEditPlanBinding;)V", "deletedEx", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/HomeExTableClass;", "getDeletedEx", "()Ljava/util/ArrayList;", "setDeletedEx", "(Ljava/util/ArrayList;)V", "editPlanAdapter", "Lcom/loseweight/adapter/EditPlanAdapter;", "getEditPlanAdapter", "()Lcom/loseweight/adapter/EditPlanAdapter;", "setEditPlanAdapter", "(Lcom/loseweight/adapter/EditPlanAdapter;)V", "isSaveDialogShow", "", "()Z", "setSaveDialogShow", "(Z)V", "touchHelper", "Lcom/common/swipedragrecyclerview/RecyclerHelper;", "getTouchHelper", "()Lcom/common/swipedragrecyclerview/RecyclerHelper;", "setTouchHelper", "(Lcom/common/swipedragrecyclerview/RecyclerHelper;)V", "workoutPlanData", "Lcom/loseweight/objects/HomePlanTableClass;", "getWorkoutPlanData", "()Lcom/loseweight/objects/HomePlanTableClass;", "setWorkoutPlanData", "(Lcom/loseweight/objects/HomePlanTableClass;)V", "fillData", "", "getExerciseData", "init", "initIntentParam", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCancel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onRetry", "onSuccess", "saveExercise", "showSaveConfirmationDialog", "ClickHandler", "TopClickListener", "app_release"})
public final class EditPlanActivity extends com.loseweight.BaseActivity implements com.loseweight.interfaces.CallbackListener {
    @org.jetbrains.annotations.Nullable
    private com.loseweight.databinding.ActivityEditPlanBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.EditPlanAdapter editPlanAdapter;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.objects.HomePlanTableClass workoutPlanData;
    private boolean isSaveDialogShow = false;
    @org.jetbrains.annotations.Nullable
    private com.common.swipedragrecyclerview.RecyclerHelper<?> touchHelper;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.loseweight.objects.HomeExTableClass> deletedEx;
    
    public EditPlanActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.databinding.ActivityEditPlanBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.loseweight.databinding.ActivityEditPlanBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.EditPlanAdapter getEditPlanAdapter() {
        return null;
    }
    
    public final void setEditPlanAdapter(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.EditPlanAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.HomePlanTableClass getWorkoutPlanData() {
        return null;
    }
    
    public final void setWorkoutPlanData(@org.jetbrains.annotations.Nullable
    com.loseweight.objects.HomePlanTableClass p0) {
    }
    
    public final boolean isSaveDialogShow() {
        return false;
    }
    
    public final void setSaveDialogShow(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.common.swipedragrecyclerview.RecyclerHelper<?> getTouchHelper() {
        return null;
    }
    
    public final void setTouchHelper(@org.jetbrains.annotations.Nullable
    com.common.swipedragrecyclerview.RecyclerHelper<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.HomeExTableClass> getDeletedEx() {
        return null;
    }
    
    public final void setDeletedEx(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.HomeExTableClass> p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void getExerciseData() {
    }
    
    private final void fillData() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    private final void showSaveConfirmationDialog() {
    }
    
    private final void saveExercise() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onSuccess() {
    }
    
    @java.lang.Override
    public void onCancel() {
    }
    
    @java.lang.Override
    public void onRetry() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/loseweight/EditPlanActivity$ClickHandler;", "", "(Lcom/loseweight/EditPlanActivity;)V", "onSaveClick", "", "app_release"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onSaveClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/EditPlanActivity$TopClickListener;", "Lcom/loseweight/interfaces/TopBarClickListener;", "(Lcom/loseweight/EditPlanActivity;)V", "onTopBarClickListener", "", "view", "Landroid/view/View;", "value", "", "app_release"})
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