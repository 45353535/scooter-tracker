package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes8.dex */
final class zzup {
    private static Boolean zza;

    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = zza;
        if (bool == null || !bool.booleanValue()) {
            return zzuo.zza(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
