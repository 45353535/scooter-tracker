package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes8.dex */
public final class zzban {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static String zza(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            char[] cArr2 = zzb;
            int i11 = i10 + i10;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static byte[] zzb(String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length >> 1];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean zzd() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long zzf(double d10, int i10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }
}
