package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class zzav {
    public static final zzav zza = new zzav(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzav(@FloatRange(from = 0.0d, fromInclusive = false) float f10, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        zzgrc.zza(f10 > 0.0f);
        zzgrc.zza(f11 > 0.0f);
        this.zzb = f10;
        this.zzc = f11;
        this.zzd = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzav.class == obj.getClass()) {
            zzav zzavVar = (zzav) obj;
            if (this.zzb == zzavVar.zzb && this.zzc == zzavVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.zzb), Float.valueOf(this.zzc)};
        String str = zzfj.zza;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public final long zza(long j10) {
        return j10 * ((long) this.zzd);
    }
}
