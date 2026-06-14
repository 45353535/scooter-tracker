package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgyk extends AbstractExecutorService implements zzgzy {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhan.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final ListenableFuture zza(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final ListenableFuture zzb(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final ListenableFuture zzc(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new zzhan(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgzy
    public final /* synthetic */ Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }
}
