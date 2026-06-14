package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzakr {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = ((zzalf) it.next()).zza.zzg.zzo;
            if (zzas.zzb(str2)) {
                return "video/mp4";
            }
            if (zzas.zza(str2)) {
                z10 = true;
            } else if (zzas.zzc(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
