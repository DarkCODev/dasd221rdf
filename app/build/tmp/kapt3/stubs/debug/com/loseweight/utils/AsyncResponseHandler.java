package com.loseweight.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u0012"}, d2 = {"Lcom/loseweight/utils/AsyncResponseHandler;", "Lokhttp3/Callback;", "()V", "onFailure", "", "e", "", "content", "", "call", "Lokhttp3/Call;", "Ljava/io/IOException;", "onFinish", "onResponse", "response", "Lokhttp3/Response;", "onStart", "onSuccess", "app_debug"})
public abstract class AsyncResponseHandler implements okhttp3.Callback {
    
    public AsyncResponseHandler() {
        super();
    }
    
    public abstract void onStart();
    
    public abstract void onSuccess(@org.jetbrains.annotations.NotNull
    java.lang.String content);
    
    public abstract void onFinish();
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull
    java.lang.Throwable e, @org.jetbrains.annotations.NotNull
    java.lang.String content);
    
    @java.lang.Override
    public void onFailure(@org.jetbrains.annotations.NotNull
    okhttp3.Call call, @org.jetbrains.annotations.NotNull
    java.io.IOException e) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void onResponse(@org.jetbrains.annotations.NotNull
    okhttp3.Call call, @org.jetbrains.annotations.NotNull
    okhttp3.Response response) throws java.io.IOException {
    }
}