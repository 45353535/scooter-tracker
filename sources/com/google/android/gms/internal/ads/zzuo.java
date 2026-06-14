package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(29)
final class zzuo {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.m.a(i10, i11, (int) d10));
        boolean z10 = true;
        if (iZzc == 1 && zzup.zza == null) {
            int iZzb = Build.VERSION.SDK_INT >= 35 ? 2 : zzb(false);
            int iZzb2 = zzb(true);
            if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                z10 = false;
            }
            zzup.zza = Boolean.valueOf(z10);
            if (zzup.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzm("video/avc");
            zzv zzvVarZzM = zztVar.zzM();
            if (zzvVarZzM.zzo != null) {
                List listZzc = zzvg.zzc(zzuw.zzb, zzvVarZzM, z10, false);
                for (int i10 = 0; i10 < listZzc.size(); i10++) {
                    if (((zzun) listZzc.get(i10)).zzd != null && (videoCapabilities = ((zzun) listZzc.get(i10)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.media3.exoplayer.mediacodec.n.a();
                        return zzc(supportedPerformancePoints, androidx.media3.exoplayer.mediacodec.m.a(1280, 720, 60));
                    }
                }
            }
        } catch (zzuy unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (androidx.media3.exoplayer.mediacodec.k.a(list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
