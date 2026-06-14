package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzetf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar3;
    }

    public static zzetf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzetf(zzikpVar, zzikpVar2, zzikpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetd((ListenableFuture) this.zza.zzb(), zzfmk.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
