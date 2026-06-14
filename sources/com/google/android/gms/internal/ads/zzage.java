package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzage extends zzafj {
    final /* synthetic */ zzafy zza;
    final /* synthetic */ zzagf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzage(zzagf zzagfVar, zzafy zzafyVar, zzafy zzafyVar2) {
        super(zzafyVar);
        this.zza = zzafyVar2;
        Objects.requireNonNull(zzagfVar);
        this.zzb = zzagfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafj, com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzafw zzafwVarZzc = this.zza.zzc(j10);
        zzafz zzafzVar = zzafwVarZzc.zza;
        long j11 = zzafzVar.zzb;
        zzagf zzagfVar = this.zzb;
        zzafz zzafzVar2 = new zzafz(j11, zzafzVar.zzc + zzagfVar.zza());
        zzafz zzafzVar3 = zzafwVarZzc.zzb;
        return new zzafw(zzafzVar2, new zzafz(zzafzVar3.zzb, zzafzVar3.zzc + zzagfVar.zza()));
    }
}
