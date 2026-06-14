package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfnb implements ListenableFuture {
    private final Object zza;
    private final String zzb;
    private final ListenableFuture zzc;

    @VisibleForTesting(otherwise = 3)
    public zzfnb(Object obj, String str, ListenableFuture listenableFuture) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.zzc.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zzc.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzc.get(j10, timeUnit);
    }
}
