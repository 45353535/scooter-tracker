package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzmd {
    private static final zzwk zzu = new zzwk(new Object(), -1);
    public final zzbf zza;
    public final zzwk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zziw zzf;
    public final boolean zzg;
    public final zzyn zzh;
    public final zzaak zzi;
    public final List zzj;
    public final zzwk zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmd(zzbf zzbfVar, zzwk zzwkVar, long j10, long j11, int i10, @Nullable zziw zziwVar, boolean z10, zzyn zzynVar, zzaak zzaakVar, List list, zzwk zzwkVar2, boolean z11, int i11, int i12, zzav zzavVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzbfVar;
        this.zzb = zzwkVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zziwVar;
        this.zzg = z10;
        this.zzh = zzynVar;
        this.zzi = zzaakVar;
        this.zzj = list;
        this.zzk = zzwkVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzavVar;
        this.zzq = j12;
        this.zzr = j13;
        this.zzs = j14;
        this.zzt = j15;
    }

    public static zzmd zza(zzaak zzaakVar) {
        zzbf zzbfVar = zzbf.zza;
        zzwk zzwkVar = zzu;
        return new zzmd(zzbfVar, zzwkVar, -9223372036854775807L, 0L, 1, null, false, zzyn.zza, zzaakVar, zzguf.zzi(), zzwkVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzwk zzb() {
        return zzu;
    }

    @CheckResult
    public final zzmd zzc(zzwk zzwkVar, long j10, long j11, long j12, long j13, zzyn zzynVar, zzaak zzaakVar, List list) {
        zzwk zzwkVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzav zzavVar = this.zzo;
        long j14 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmd(this.zza, zzwkVar, j11, j12, this.zze, this.zzf, this.zzg, zzynVar, zzaakVar, list, zzwkVar2, z10, i10, i11, zzavVar, j14, j13, j10, jElapsedRealtime, false);
    }

    @CheckResult
    public final zzmd zzd(zzbf zzbfVar) {
        return new zzmd(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zze(int i10) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzf(@Nullable zziw zziwVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziwVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzg(boolean z10) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z10, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzh(zzwk zzwkVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzwkVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzi(boolean z10, int i10, int i11) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
