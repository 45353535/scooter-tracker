package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzerw implements zzese {
    final /* synthetic */ zzerx zza;

    zzerw(zzerx zzerxVar) {
        Objects.requireNonNull(zzerxVar);
        this.zza = zzerxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzerx zzerxVar = this.zza;
        synchronized (zzerxVar) {
            zzerxVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzerx zzerxVar = this.zza;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzerxVar) {
            zzerxVar.zzM(zzdknVar);
            zzerxVar.zzL().zzj();
        }
    }
}
