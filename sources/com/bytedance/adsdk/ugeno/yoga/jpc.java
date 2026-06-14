package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
public enum jpc {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    private final int mml;

    jpc(int i10) {
        this.mml = i10;
    }

    public static jpc qdl(int i10) {
        if (i10 == 0) {
            return UNDEFINED;
        }
        if (i10 == 1) {
            return EXACTLY;
        }
        if (i10 == 2) {
            return AT_MOST;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
