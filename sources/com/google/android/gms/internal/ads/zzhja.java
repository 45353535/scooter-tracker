package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhja {
    public static boolean zza(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static zzhyl zzb(String str) throws IOException {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhzqVar.zza(zzhyq.LEGACY_STRICT);
            return zzhiy.zzb(zzhzqVar);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhiz) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
