package com.loseweight.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u000212B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0010H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\"H\u0016J\u001a\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u000e\u00100\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u00063"}, d2 = {"Lcom/loseweight/fragments/VideoFragment;", "Lcom/loseweight/fragments/BaseFragment;", "()V", "binding", "Lcom/loseweight/databinding/FragmentVideoBinding;", "getBinding", "()Lcom/loseweight/databinding/FragmentVideoBinding;", "setBinding", "(Lcom/loseweight/databinding/FragmentVideoBinding;)V", "player", "Lcom/google/android/youtube/player/YouTubePlayer;", "getPlayer", "()Lcom/google/android/youtube/player/YouTubePlayer;", "setPlayer", "(Lcom/google/android/youtube/player/YouTubePlayer;)V", "rootContext", "Landroid/content/Context;", "getRootContext", "()Landroid/content/Context;", "setRootContext", "(Landroid/content/Context;)V", "videoId", "", "getVideoId", "()Ljava/lang/String;", "setVideoId", "(Ljava/lang/String;)V", "youTubePlayerFragment", "Landroidx/fragment/app/Fragment;", "getYouTubePlayerFragment", "()Landroidx/fragment/app/Fragment;", "setYouTubePlayerFragment", "(Landroidx/fragment/app/Fragment;)V", "init", "", "onAttach", "context", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setVideo", "ClickHandler", "Companion", "app_debug"})
public final class VideoFragment extends com.loseweight.fragments.BaseFragment {
    public com.loseweight.databinding.FragmentVideoBinding binding;
    @org.jetbrains.annotations.Nullable
    private java.lang.String videoId;
    @org.jetbrains.annotations.Nullable
    private android.content.Context rootContext;
    @org.jetbrains.annotations.Nullable
    private com.google.android.youtube.player.YouTubePlayer player;
    @org.jetbrains.annotations.Nullable
    private androidx.fragment.app.Fragment youTubePlayerFragment;
    @org.jetbrains.annotations.NotNull
    public static final com.loseweight.fragments.VideoFragment.Companion Companion = null;
    
    public VideoFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.loseweight.databinding.FragmentVideoBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.loseweight.databinding.FragmentVideoBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVideoId() {
        return null;
    }
    
    public final void setVideoId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.Context getRootContext() {
        return null;
    }
    
    public final void setRootContext(@org.jetbrains.annotations.Nullable
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.youtube.player.YouTubePlayer getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.Nullable
    com.google.android.youtube.player.YouTubePlayer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.fragment.app.Fragment getYouTubePlayerFragment() {
        return null;
    }
    
    public final void setYouTubePlayerFragment(@org.jetbrains.annotations.Nullable
    androidx.fragment.app.Fragment p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    public final void setVideo(@org.jetbrains.annotations.NotNull
    java.lang.String videoId) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/loseweight/fragments/VideoFragment$ClickHandler;", "", "(Lcom/loseweight/fragments/VideoFragment;)V", "app_debug"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/loseweight/fragments/VideoFragment$Companion;", "", "()V", "newInstance", "Lcom/loseweight/fragments/VideoFragment;", "videoId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.loseweight.fragments.VideoFragment newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String videoId) {
            return null;
        }
    }
}