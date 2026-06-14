package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzegf implements zzgzl {
    final /* synthetic */ zzbzd zza;
    final /* synthetic */ zzbzm zzb;

    zzegf(zzegw zzegwVar, zzbzm zzbzmVar, zzbzd zzbzdVar) {
        this.zzb = zzbzmVar;
        this.zza = zzbzdVar;
        Objects.requireNonNull(zzegwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th2));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
