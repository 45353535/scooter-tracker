package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyg extends zzbf {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzak zzf;

    @Nullable
    private final zzaf zzg;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("SinglePeriodTimeline");
        zzzVar.zzb(Uri.EMPTY);
        zzzVar.zzc();
    }

    public zzyg(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, @Nullable Object obj, zzak zzakVar, @Nullable zzaf zzafVar) {
        this.zzc = j13;
        this.zzd = j14;
        this.zze = z10;
        zzakVar.getClass();
        this.zzf = zzakVar;
        this.zzg = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        zzgrc.zzm(i10, 1, FirebaseAnalytics.Param.INDEX);
        boolean z10 = this.zze;
        zzbeVar.zza(zzbe.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z10, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzgrc.zzm(i10, 1, FirebaseAnalytics.Param.INDEX);
        zzbdVar.zza(null, z10 ? zzb : null, 0, this.zzc, 0L, zzc.zza, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        zzgrc.zzm(i10, 1, FirebaseAnalytics.Param.INDEX);
        return zzb;
    }
}
