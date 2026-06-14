package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
public class tvp {
    public static long qdl(float f10, float f11) {
        return ((long) Float.floatToRawIntBits(f11)) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static long qdl(int i10, int i11) {
        return qdl(i10, i11);
    }
}
