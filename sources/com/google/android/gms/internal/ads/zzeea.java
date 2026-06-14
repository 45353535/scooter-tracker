package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzeea implements zzgzl {
    final /* synthetic */ zzeeg zza;

    zzeea(zzeeg zzeegVar) {
        Objects.requireNonNull(zzeegVar);
        this.zza = zzeegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcP)).booleanValue()) {
            this.zza.zzf().zzdP(zzfjcVar);
        }
    }
}
