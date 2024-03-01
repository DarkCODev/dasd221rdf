package com.loseweight.utils.permission;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u0006\u0010\u0015\u001a\u00020\bJ)\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/loseweight/utils/permission/ManagePermissionsImp;", "", "activity", "Landroid/app/Activity;", "list", "", "", "code", "", "(Landroid/app/Activity;Ljava/util/List;I)V", "getActivity", "()Landroid/app/Activity;", "getCode", "()I", "getList", "()Ljava/util/List;", "checkPermissions", "", "permissionable", "Lcom/loseweight/utils/permission/ManagePermissionsImp$IPermission;", "deniedPermission", "isPermissionsGranted", "processPermissionsResult", "", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "requestPermissions", "IPermission", "app_debug"})
public final class ManagePermissionsImp {
    @org.jetbrains.annotations.NotNull
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> list = null;
    private final int code = 0;
    
    public ManagePermissionsImp(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list, int code) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Activity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getList() {
        return null;
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void checkPermissions(@org.jetbrains.annotations.NotNull
    com.loseweight.utils.permission.ManagePermissionsImp.IPermission permissionable) {
    }
    
    public final int isPermissionsGranted() {
        return 0;
    }
    
    private final java.lang.String deniedPermission() {
        return null;
    }
    
    private final void requestPermissions() {
    }
    
    public final boolean processPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/loseweight/utils/permission/ManagePermissionsImp$IPermission;", "", "onPermissionDenied", "", "onPermissionGranted", "app_debug"})
    public static abstract interface IPermission {
        
        public abstract void onPermissionGranted();
        
        public abstract void onPermissionDenied();
    }
}