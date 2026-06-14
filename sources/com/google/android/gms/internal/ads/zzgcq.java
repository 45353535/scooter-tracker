package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgcq implements zzgcl {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgcq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j10) {
        this.zza.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
    }
}
