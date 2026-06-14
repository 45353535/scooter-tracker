package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzapu implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;

    public zzapu(zzapx zzapxVar) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        if (zzerVar.zzs() == 0 && (zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(6);
            int iZzd = zzerVar.zzd() / 4;
            for (int i10 = 0; i10 < iZzd; i10++) {
                zzeq zzeqVar = this.zzb;
                zzerVar.zzl(zzeqVar, 4);
                int iZzj = zzeqVar.zzj(16);
                zzeqVar.zzh(3);
                if (iZzj == 0) {
                    zzeqVar.zzh(13);
                } else {
                    int iZzj2 = zzeqVar.zzj(13);
                    zzapx zzapxVar = this.zza;
                    if (zzapxVar.zzj().get(iZzj2) == null) {
                        zzapxVar.zzj().put(iZzj2, new zzapo(new zzapv(zzapxVar, iZzj2)));
                        zzapxVar.zzo(zzapxVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
