package com.loseweight.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/loseweight/interfaces/AdsCallback;", "", "adClose", "", "adLoadingFailed", "startNextScreen", "app_release"})
public abstract interface AdsCallback {
    
    public abstract void adLoadingFailed();
    
    public abstract void adClose();
    
    public abstract void startNextScreen();
}