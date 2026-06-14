package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzabx implements zzado {
    final /* synthetic */ zzacc zza;

    zzabx(zzacc zzaccVar) {
        Objects.requireNonNull(zzaccVar);
        this.zza = zzaccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zza() {
        zzmk zzmkVarZzaY = this.zza.zzaY();
        if (zzmkVarZzaY != null) {
            zzmkVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzb() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzbj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzc() {
        zzacc zzaccVar = this.zza;
        if (zzaccVar.zzbk() != null) {
            zzaccVar.zzaw(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void zzd(zzbv zzbvVar) {
    }
}
