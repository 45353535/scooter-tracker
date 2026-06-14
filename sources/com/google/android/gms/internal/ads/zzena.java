package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzena implements zzgzl {
    final /* synthetic */ zzfir zza;
    final /* synthetic */ zzenb zzb;

    zzena(zzenb zzenbVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        Objects.requireNonNull(zzenbVar);
        this.zzb = zzenbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        zzenb zzenbVar = this.zzb;
        synchronized (zzenbVar) {
            try {
                zzenc zzencVarZzc = zzenbVar.zzc();
                zzfir zzfirVar = this.zza;
                zzencVarZzc.zzc(th2, zzfirVar);
                zzfir zzfirVarZza = zzenbVar.zzc().zza();
                if (zzfirVar.zzav) {
                    while (zzfirVarZza != null) {
                        zzenbVar.zzb(zzfirVarZza);
                        zzfirVarZza = zzenbVar.zzc().zza();
                    }
                } else if (zzfirVarZza != null) {
                    zzenbVar.zzb(zzfirVarZza);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzenb zzenbVar = this.zzb;
        zzens zzensVar = (zzens) obj;
        synchronized (zzenbVar) {
            try {
                zzenbVar.zzc().zzb(zzensVar, this.zza);
                zzfir zzfirVarZza = zzenbVar.zzc().zza();
                if (zzfirVarZza != null) {
                    zzenbVar.zzb(zzfirVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
