package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcdq extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcdu zza;

    zzcdq(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcdu zzcduVar = this.zza;
        zzbhh zzbhhVar = new zzbhh(zzcduVar.zzz(), zzcduVar.zzA().afmaVersion);
        synchronized (zzcduVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbhk.zza(zzcduVar.zzB(), zzbhhVar);
            } catch (IllegalArgumentException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e10);
            }
        }
    }
}
