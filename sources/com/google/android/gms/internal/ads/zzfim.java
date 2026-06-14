package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfim implements zzese {
    final /* synthetic */ zzfio zza;

    zzfim(zzfio zzfioVar) {
        Objects.requireNonNull(zzfioVar);
        this.zza = zzfioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfio zzfioVar = this.zza;
        synchronized (zzfioVar) {
            zzfioVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfio zzfioVar = this.zza;
        zzdtz zzdtzVar = (zzdtz) obj;
        synchronized (zzfioVar) {
            try {
                zzfioVar.zzx(zzdtzVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzet)).booleanValue()) {
                    zzdtzVar.zzh().zza = zzfioVar.zzv();
                }
                zzfioVar.zzw().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
