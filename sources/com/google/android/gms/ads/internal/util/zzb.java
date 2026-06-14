package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcei;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcei.zza.zza(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
