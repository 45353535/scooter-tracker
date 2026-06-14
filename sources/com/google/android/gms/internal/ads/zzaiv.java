package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaiv {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzaiv(long j10, long j11, int i10) {
        zzgrc.zza(j10 < j11);
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiv.class == obj.getClass()) {
            zzaiv zzaivVar = (zzaiv) obj;
            if (this.zza == zzaivVar.zza && this.zzb == zzaivVar.zzb && this.zzc == zzaivVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzfj.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
