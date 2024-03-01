package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000201B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aJ\u0006\u0010\"\u001a\u00020\u001eJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001aJ\b\u0010$\u001a\u00020\u001aH\u0016J\u000e\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001aJ\u001c\u0010&\u001a\u00020\u001e2\n\u0010\'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001aH\u0016J\u001c\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001aH\u0016J\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0012J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00062"}, d2 = {"Lcom/loseweight/adapter/ImageListRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/loseweight/adapter/ImageListRecyclerAdapter$VerticalItemHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "data", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/CustomGallery;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "<set-?>", "", "isMultiSelected", "()Z", "mEventListener", "Lcom/loseweight/adapter/ImageListRecyclerAdapter$EventListener;", "getMEventListener", "()Lcom/loseweight/adapter/ImageListRecyclerAdapter$EventListener;", "setMEventListener", "(Lcom/loseweight/adapter/ImageListRecyclerAdapter$EventListener;)V", "selected", "getSelected", "totalSelected", "", "getTotalSelected", "()I", "addAll", "", "files", "changeSelection", "position", "clear", "getItem", "getItemCount", "isSelected", "onBindViewHolder", "holder", "onCreateViewHolder", "container", "Landroid/view/ViewGroup;", "viewType", "setEventListner", "eventListner", "setMultiplePick", "isMultiplePick", "EventListener", "VerticalItemHolder", "app_release"})
public final class ImageListRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.loseweight.adapter.ImageListRecyclerAdapter.VerticalItemHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.loseweight.objects.CustomGallery> data;
    private boolean isMultiSelected = false;
    @org.jetbrains.annotations.Nullable
    private com.loseweight.adapter.ImageListRecyclerAdapter.EventListener mEventListener;
    
    public ImageListRecyclerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.CustomGallery> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.CustomGallery> p0) {
    }
    
    public final boolean isMultiSelected() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.adapter.ImageListRecyclerAdapter.EventListener getMEventListener() {
        return null;
    }
    
    public final void setMEventListener(@org.jetbrains.annotations.Nullable
    com.loseweight.adapter.ImageListRecyclerAdapter.EventListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.loseweight.objects.CustomGallery> getSelected() {
        return null;
    }
    
    public final int getTotalSelected() {
        return 0;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.CustomGallery> files) {
    }
    
    public final boolean isSelected(int position) {
        return false;
    }
    
    public final void changeSelection(int position) {
    }
    
    public final void clear() {
    }
    
    public final void setMultiplePick(boolean isMultiplePick) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.adapter.ImageListRecyclerAdapter.VerticalItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup container, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.ImageListRecyclerAdapter.VerticalItemHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.objects.CustomGallery getItem(int position) {
        return null;
    }
    
    public final void setEventListner(@org.jetbrains.annotations.NotNull
    com.loseweight.adapter.ImageListRecyclerAdapter.EventListener eventListner) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/loseweight/adapter/ImageListRecyclerAdapter$EventListener;", "", "onItemClickListener", "", "position", "", "app_release"})
    public static abstract interface EventListener {
        
        public abstract void onItemClickListener(int position);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/loseweight/adapter/ImageListRecyclerAdapter$VerticalItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/loseweight/adapter/ImageListRecyclerAdapter;Landroid/view/View;)V", "container", "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "setContainer", "(Landroid/widget/FrameLayout;)V", "imgImage", "Landroidx/appcompat/widget/AppCompatImageView;", "getImgImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "setImgImage", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "imgSelected", "getImgSelected", "setImgSelected", "setImage", "", "url", "", "app_release"})
    public final class VerticalItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private androidx.appcompat.widget.AppCompatImageView imgImage;
        @org.jetbrains.annotations.NotNull
        private androidx.appcompat.widget.AppCompatImageView imgSelected;
        @org.jetbrains.annotations.NotNull
        private android.widget.FrameLayout container;
        
        public VerticalItemHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.appcompat.widget.AppCompatImageView getImgImage() {
            return null;
        }
        
        public final void setImgImage(@org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.appcompat.widget.AppCompatImageView getImgSelected() {
            return null;
        }
        
        public final void setImgSelected(@org.jetbrains.annotations.NotNull
        androidx.appcompat.widget.AppCompatImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.FrameLayout getContainer() {
            return null;
        }
        
        public final void setContainer(@org.jetbrains.annotations.NotNull
        android.widget.FrameLayout p0) {
        }
        
        public final void setImage(@org.jetbrains.annotations.NotNull
        java.lang.String url) {
        }
    }
}