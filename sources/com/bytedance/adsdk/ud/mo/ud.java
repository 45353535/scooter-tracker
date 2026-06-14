package com.bytedance.adsdk.ud.mo;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private static float qdl(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float ud(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int qdl(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fUd = ud(((i10 >> 16) & 255) / 255.0f);
        float fUd2 = ud(((i10 >> 8) & 255) / 255.0f);
        float fUd3 = ud((i10 & 255) / 255.0f);
        float fUd4 = ud(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fUd5 = fUd2 + ((ud(((i11 >> 8) & 255) / 255.0f) - fUd2) * f10);
        float fUd6 = fUd3 + (f10 * (ud((i11 & 255) / 255.0f) - fUd3));
        return (Math.round(qdl(fUd + ((fUd4 - fUd) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(qdl(fUd5) * 255.0f) << 8) | Math.round(qdl(fUd6) * 255.0f);
    }
}
