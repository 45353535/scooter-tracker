package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhzd {
    public static BigDecimal zza(String str) throws NumberFormatException {
        zzc(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger zzb(String str) throws NumberFormatException {
        zzc(str);
        return new BigInteger(str);
    }

    private static void zzc(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strSubstring).length() + 28);
        sb2.append("Number string too large: ");
        sb2.append(strSubstring);
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        throw new NumberFormatException(sb2.toString());
    }
}
