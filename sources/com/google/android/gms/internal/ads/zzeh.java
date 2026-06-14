package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeh {
    public static void zza(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 4);
            sb2.append("csd-");
            sb2.append(i10);
            mediaFormat.setByteBuffer(sb2.toString(), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
