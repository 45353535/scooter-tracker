package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public final class zzwe extends zzbf {
    private final zzak zzb;

    public zzwe(zzak zzakVar) {
        this.zzb = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        zzbeVar.zza(zzbe.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzbdVar.zza(z10 ? 0 : null, z10 ? zzwd.zzc : null, 0, -9223372036854775807L, 0L, zzc.zza, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return obj == zzwd.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        return zzwd.zzc;
    }
}
