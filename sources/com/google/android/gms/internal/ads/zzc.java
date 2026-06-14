package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc {
    public static final zzc zza = new zzc(null, new zza[0], 0, -9223372036854775807L, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        String str = zzfj.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzc(@Nullable Object obj, zza[] zzaVarArr, long j10, long j11, int i10) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.zzf, ((zzc) obj).zzf);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.zzf);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final zza zza(@IntRange(from = 0) int i10) {
        return i10 < 0 ? zze : this.zzf[i10];
    }

    public final boolean zzb(int i10) {
        zza(-1);
        return false;
    }
}
