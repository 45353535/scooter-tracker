package com.taurusx.tax.g;

/* JADX INFO: loaded from: classes11.dex */
public class x {
    public static float z(float f10, float f11) {
        return (Float.isInfinite(f10) || Float.isNaN(f10)) ? f11 : f10;
    }

    public static double z(double d10, double d11) {
        return (Double.isInfinite(d10) || Double.isNaN(d10)) ? d11 : d10;
    }

    public static double z(String str, double d10) {
        try {
            return z(Double.parseDouble(str), d10);
        } catch (Exception unused) {
            return d10;
        }
    }

    public static int z(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static long z(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j10;
        }
    }
}
