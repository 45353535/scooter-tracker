package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgxq {
    static long zza(double d10) {
        zzgrc.zzb(zzb(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean zzb(double d10) {
        return Math.getExponent(d10) <= 1023;
    }
}
