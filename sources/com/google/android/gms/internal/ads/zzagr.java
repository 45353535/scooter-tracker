package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    public zzagr(zzagt zzagtVar, long j10) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzagt zzagtVar = this.zza;
        zzafw zzafwVarZzg = zzagtVar.zzh()[0].zzg(j10);
        for (int i10 = 1; i10 < zzagtVar.zzh().length; i10++) {
            zzafw zzafwVarZzg2 = zzagtVar.zzh()[i10].zzg(j10);
            if (zzafwVarZzg2.zza.zzc < zzafwVarZzg.zza.zzc) {
                zzafwVarZzg = zzafwVarZzg2;
            }
        }
        return zzafwVarZzg;
    }
}
