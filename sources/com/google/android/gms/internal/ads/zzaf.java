package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaf {
    public final long zza = -9223372036854775807L;
    public final long zzb = -9223372036854775807L;
    public final long zzc = -9223372036854775807L;
    public final float zzd = -3.4028235E38f;
    public final float zze = -3.4028235E38f;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    /* synthetic */ zzaf(zzae zzaeVar, byte[] bArr) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        long j10 = ((zzaf) obj).zza;
        return true;
    }

    public final int hashCode() {
        int i10 = (int) (-9223372034707292159L);
        return (((((((i10 * 31) + i10) * 31) + i10) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
