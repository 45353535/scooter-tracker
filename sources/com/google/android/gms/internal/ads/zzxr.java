package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzxr extends zzvy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzxr(zzxu zzxuVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        this.zzb.zzd(i10, zzbdVar, z10);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
