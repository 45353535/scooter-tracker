package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(0, 0, 1.0f);

    @IntRange(from = 0)
    public final int zzb;

    @IntRange(from = 0)
    public final int zzc;

    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(@IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zzc == zzbvVar.zzc && this.zzd == zzbvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.zzc) * 31) + Float.floatToRawIntBits(this.zzd);
    }
}
