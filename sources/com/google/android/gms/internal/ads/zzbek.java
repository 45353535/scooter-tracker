package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbek {
    public static int zza(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] zzb(@androidx.annotation.Nullable java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbek.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
