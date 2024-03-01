package com.loseweight.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006\u00a8\u0006\r"}, d2 = {"Lcom/loseweight/viewmodel/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getEmptyResult", "Lcom/loseweight/objects/ResultModel;", "getError", "Lcom/loseweight/objects/BaseModel;", "getErrorResult", "getExistsResult", "getNotExistsResult", "getSuccessResult", "app_release"})
public abstract class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.BaseModel getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ResultModel getErrorResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ResultModel getEmptyResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ResultModel getExistsResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ResultModel getNotExistsResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.ResultModel getSuccessResult() {
        return null;
    }
}