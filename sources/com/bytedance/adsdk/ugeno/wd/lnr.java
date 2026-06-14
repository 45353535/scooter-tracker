package com.bytedance.adsdk.ugeno.wd;

/* JADX INFO: loaded from: classes6.dex */
public final class lnr {
    public static float qdl(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int qdl(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static long qdl(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static double qdl(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static boolean qdl(String str, boolean z10) {
        try {
            return Boolean.parseBoolean(str);
        } catch (NumberFormatException unused) {
            return z10;
        }
    }
}
