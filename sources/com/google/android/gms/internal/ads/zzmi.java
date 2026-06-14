package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzmi extends zzvy {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmi(zzmj zzmjVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmjVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i10, zzbdVar, z10);
        if (zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
            return zzbdVarZzd;
        }
        zzbdVarZzd.zzf = true;
        return zzbdVarZzd;
    }
}
