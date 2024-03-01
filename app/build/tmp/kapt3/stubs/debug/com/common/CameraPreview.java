package com.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001cH\u0016R+\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00068B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/common/CameraPreview;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "camera", "Landroid/hardware/Camera;", "cameraInfo", "Landroid/hardware/Camera$CameraInfo;", "displayOrientation", "", "(Landroid/content/Context;Landroid/hardware/Camera;Landroid/hardware/Camera$CameraInfo;I)V", "<set-?>", "mCamera", "getMCamera", "()Landroid/hardware/Camera;", "setMCamera", "(Landroid/hardware/Camera;)V", "mCamera$delegate", "Lkotlin/properties/ReadWriteProperty;", "mCameraInfo", "getMCameraInfo", "()Landroid/hardware/Camera$CameraInfo;", "setMCameraInfo", "(Landroid/hardware/Camera$CameraInfo;)V", "mCameraInfo$delegate", "mDisplayOrientation", "mHolder", "Landroid/view/SurfaceHolder;", "setCamera", "", "surfaceChanged", "holder", "format", "w", "h", "surfaceCreated", "surfaceDestroyed", "Companion", "app_debug"})
public final class CameraPreview extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    @org.jetbrains.annotations.NotNull
    private final android.view.SurfaceHolder mHolder = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty mCamera$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadWriteProperty mCameraInfo$delegate = null;
    private int mDisplayOrientation = 0;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "CameraPreview";
    @org.jetbrains.annotations.NotNull
    public static final com.common.CameraPreview.Companion Companion = null;
    
    public CameraPreview(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.hardware.Camera camera, @org.jetbrains.annotations.NotNull
    android.hardware.Camera.CameraInfo cameraInfo, int displayOrientation) {
        super(null);
    }
    
    private final android.hardware.Camera getMCamera() {
        return null;
    }
    
    private final void setMCamera(android.hardware.Camera p0) {
    }
    
    private final android.hardware.Camera.CameraInfo getMCameraInfo() {
        return null;
    }
    
    private final void setMCameraInfo(android.hardware.Camera.CameraInfo p0) {
    }
    
    @java.lang.Override
    public void surfaceCreated(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override
    public void surfaceChanged(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder, int format, int w, int h) {
    }
    
    public final void setCamera(@org.jetbrains.annotations.NotNull
    android.hardware.Camera camera, @org.jetbrains.annotations.NotNull
    android.hardware.Camera.CameraInfo cameraInfo, int displayOrientation) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/common/CameraPreview$Companion;", "", "()V", "TAG", "", "calculatePreviewOrientation", "", "info", "Landroid/hardware/Camera$CameraInfo;", "rotation", "degrees", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Calculate the correct orientation for a [Camera] preview that is displayed on screen.
         * Implementation is based on the sample code provided in
         * [Camera.setDisplayOrientation].
         */
        public final int calculatePreviewOrientation(@org.jetbrains.annotations.NotNull
        android.hardware.Camera.CameraInfo info, int rotation) {
            return 0;
        }
        
        private final int degrees(int rotation) {
            return 0;
        }
    }
}