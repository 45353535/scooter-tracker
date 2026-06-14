package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgzi extends zzgtw implements Future {
    protected zzgzi() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zza().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    protected abstract Future zza();

    @Override // com.google.android.gms.internal.ads.zzgtw
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zza().get(j10, timeUnit);
    }
}
