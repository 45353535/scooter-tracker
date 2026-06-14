package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public interface zzgzy extends ExecutorService {
    /* bridge */ /* synthetic */ Future submit(Runnable runnable);

    /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj);

    /* bridge */ /* synthetic */ Future submit(Callable callable);

    ListenableFuture zza(Runnable runnable);

    ListenableFuture zzb(Runnable runnable, Object obj);

    ListenableFuture zzc(Callable callable);
}
