package com.admision.apputils.permission;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/admision/apputils/permission/PermissionHelper;", "", "()V", "Companion", "app_debug"})
public final class PermissionHelper {
    private static final int permissionsRequestCode = 123;
    private static com.loseweight.utils.permission.ManagePermissionsImp managePermissions;
    private static com.loseweight.utils.permission.ManagePermissionsImp.IPermission iPermission;
    @org.jetbrains.annotations.NotNull
    public static final com.admision.apputils.permission.PermissionHelper.Companion Companion = null;
    
    public PermissionHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0004J)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/admision/apputils/permission/PermissionHelper$Companion;", "", "()V", "iPermission", "Lcom/loseweight/utils/permission/ManagePermissionsImp$IPermission;", "managePermissions", "Lcom/loseweight/utils/permission/ManagePermissionsImp;", "permissionsRequestCode", "", "checkPermissions", "", "activity", "Landroid/app/Activity;", "list", "", "", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void checkPermissions(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull
        com.loseweight.utils.permission.ManagePermissionsImp.IPermission iPermission) {
        }
        
        public final void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
        java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
        int[] grantResults) {
        }
    }
}