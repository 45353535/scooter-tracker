package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd {
    public static final zzd zza = new zzd(0, 0, 1, 1, 0, false, true, null);

    @Nullable
    private AudioAttributes zzb;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    /* synthetic */ zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, byte[] bArr) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzd.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }

    public final AudioAttributes zza() {
        if (this.zzb == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i10 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.zzb = usage.build();
        }
        return this.zzb;
    }
}
