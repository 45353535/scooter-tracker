package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf {

    @VisibleForTesting
    final zzaw zza;

    @VisibleForTesting
    final zzg zzb;

    @VisibleForTesting
    final zzg zzc;

    @VisibleForTesting
    final zzj zzd;

    public zzf() {
        zzaw zzawVar = new zzaw();
        this.zza = zzawVar;
        zzg zzgVar = new zzg(null, zzawVar);
        this.zzc = zzgVar;
        this.zzb = zzgVar.zzc();
        zzj zzjVar = new zzj();
        this.zzd = zzjVar;
        zzgVar.zze("require", new zzw(zzjVar));
        zzjVar.zza("internal.platform", zze.zza);
        zzgVar.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzao zza(zzg zzgVar, zzje... zzjeVarArr) {
        zzao zzaoVarZzb = zzao.zzf;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVarZzb = zzi.zzb(zzjeVar);
            zzh.zzl(this.zzc);
            if ((zzaoVarZzb instanceof zzap) || (zzaoVarZzb instanceof zzan)) {
                zzaoVarZzb = this.zza.zzb(zzgVar, zzaoVarZzb);
            }
        }
        return zzaoVarZzb;
    }
}
