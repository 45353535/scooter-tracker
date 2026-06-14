package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
final class zzalh implements zzafy {
    final /* synthetic */ zzali zza;

    /* synthetic */ zzalh(zzali zzaliVar, byte[] bArr) {
        Objects.requireNonNull(zzaliVar);
        this.zza = zzaliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        zzali zzaliVar = this.zza;
        return zzaliVar.zzf().zzh(zzaliVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzali zzaliVar = this.zza;
        long jZzd = zzaliVar.zzd() + BigInteger.valueOf(zzaliVar.zzf().zzi(j10)).multiply(BigInteger.valueOf(zzaliVar.zze() - zzaliVar.zzd())).divide(BigInteger.valueOf(zzaliVar.zzg())).longValue();
        String str = zzfj.zza;
        zzafz zzafzVar = new zzafz(j10, Math.max(zzaliVar.zzd(), Math.min(jZzd - 30000, zzaliVar.zze() - 1)));
        return new zzafw(zzafzVar, zzafzVar);
    }
}
