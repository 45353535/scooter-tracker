package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzlo {
    public final zzwk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    zzlo(zzwk zzwkVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zzgrc.zza(!z14 || z12);
        if (z13 && !z12) {
            z15 = false;
        }
        zzgrc.zza(z15);
        this.zza = zzwkVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = z14;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlo.class == obj.getClass()) {
            zzlo zzloVar = (zzlo) obj;
            if (this.zzb == zzloVar.zzb && this.zzc == zzloVar.zzc && this.zzd == zzloVar.zzd && this.zze == zzloVar.zze && this.zzh == zzloVar.zzh && this.zzi == zzloVar.zzi && this.zzj == zzloVar.zzj && Objects.equals(this.zza, zzloVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j10 = this.zze;
        long j11 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzlo zza(long j10) {
        return j10 == this.zzb ? this : new zzlo(this.zza, j10, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzlo zzb(long j10) {
        return j10 == this.zzc ? this : new zzlo(this.zza, this.zzb, j10, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
