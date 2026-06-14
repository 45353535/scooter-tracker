package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzevi {
    public final ListenableFuture zza;
    private final long zzb;
    private final Clock zzc;

    public zzevi(ListenableFuture listenableFuture, long j10, Clock clock) {
        this.zza = listenableFuture;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j10;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
