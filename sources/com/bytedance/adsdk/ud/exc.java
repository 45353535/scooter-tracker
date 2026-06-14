package com.bytedance.adsdk.ud;

/* JADX INFO: loaded from: classes6.dex */
public enum exc {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.exc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[exc.values().length];
            qdl = iArr;
            try {
                iArr[exc.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[exc.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[exc.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean qdl(int i10, boolean z10, int i11) {
        int i12 = AnonymousClass1.qdl[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
