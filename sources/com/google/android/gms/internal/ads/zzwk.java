package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwk {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzwk(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwk)) {
            return false;
        }
        zzwk zzwkVar = (zzwk) obj;
        return this.zza.equals(zzwkVar.zza) && this.zzb == zzwkVar.zzb && this.zzc == zzwkVar.zzc && this.zzd == zzwkVar.zzd && this.zze == zzwkVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzwk zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzwk(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzwk(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzwk(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzwk(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
