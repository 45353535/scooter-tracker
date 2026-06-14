package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzmy {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;

    @Nullable
    public final zzwk zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;

    @Nullable
    public final zzwk zzh;
    public final long zzi;
    public final long zzj;

    public zzmy(long j10, zzbf zzbfVar, int i10, @Nullable zzwk zzwkVar, long j11, zzbf zzbfVar2, int i11, @Nullable zzwk zzwkVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzbfVar;
        this.zzc = i10;
        this.zzd = zzwkVar;
        this.zze = j11;
        this.zzf = zzbfVar2;
        this.zzg = i11;
        this.zzh = zzwkVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmy.class == obj.getClass()) {
            zzmy zzmyVar = (zzmy) obj;
            if (this.zza == zzmyVar.zza && this.zzc == zzmyVar.zzc && this.zze == zzmyVar.zze && this.zzg == zzmyVar.zzg && this.zzi == zzmyVar.zzi && this.zzj == zzmyVar.zzj && Objects.equals(this.zzb, zzmyVar.zzb) && Objects.equals(this.zzd, zzmyVar.zzd) && Objects.equals(this.zzf, zzmyVar.zzf) && Objects.equals(this.zzh, zzmyVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
