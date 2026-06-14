package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfnm {
    private static final ListenableFuture zza = zzgzo.zza(null);
    private final zzgzy zzb;
    private final ScheduledExecutorService zzc;
    private final zzfnn zzd;

    public zzfnm(zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzfnn zzfnnVar) {
        this.zzb = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnnVar;
    }

    public final zzfnl zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfnl(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfnd zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfnd(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    protected abstract String zzc(Object obj);

    final /* synthetic */ zzgzy zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzfnn zzg() {
        return this.zzd;
    }
}
