package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfmz implements zzikg {
    private final zzikp zza;

    private zzfmz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfmz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfmz(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfmy((ScheduledExecutorService) this.zza.zzb(), zzfmk.zzc());
    }
}
