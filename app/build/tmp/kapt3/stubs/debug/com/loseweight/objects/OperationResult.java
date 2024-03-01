package com.loseweight.objects;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/loseweight/objects/OperationResult;", "", "()V", "errorCode", "getErrorCode", "()Ljava/lang/Object;", "setErrorCode", "(Ljava/lang/Object;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "responseMessage", "getResponseMessage", "setResponseMessage", "app_debug"})
public final class OperationResult {
    @com.google.gson.annotations.SerializedName(value = "isSuccess")
    @com.google.gson.annotations.Expose
    private boolean isSuccess = false;
    @com.google.gson.annotations.SerializedName(value = "responseMessage")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private java.lang.String responseMessage;
    @com.google.gson.annotations.SerializedName(value = "errorCode")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private java.lang.Object errorCode;
    @com.google.gson.annotations.SerializedName(value = "errorMessage")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private java.lang.String errorMessage;
    
    public OperationResult() {
        super();
    }
    
    public final boolean isSuccess() {
        return false;
    }
    
    public final void setSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getResponseMessage() {
        return null;
    }
    
    public final void setResponseMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getErrorCode() {
        return null;
    }
    
    public final void setErrorCode(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}