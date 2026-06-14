package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzfmx {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfmy zzd;

    zzfmx(zzfmy zzfmyVar, Runnable runnable, long j10) {
        Objects.requireNonNull(zzfmyVar);
        this.zzd = zzfmyVar;
        this.zza = runnable;
        this.zzb = j10;
    }
}
