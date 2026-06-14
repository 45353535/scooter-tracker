package com.bytedance.adsdk.ud;

/* JADX INFO: loaded from: classes6.dex */
class ud {
    static final int[] qdl = new int[0];

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    static final long[] f16136ud = new long[0];
    static final Object[] lnr = new Object[0];

    static int qdl(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
