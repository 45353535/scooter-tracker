package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(30)
final class zzacu {
    public static void zza(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e10) {
            zzee.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
