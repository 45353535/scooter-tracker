package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
public enum exu {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);

    private final int mml;

    exu(int i10) {
        this.mml = i10;
    }

    public int qdl() {
        return this.mml;
    }

    public static exu qdl(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static exu qdl(String str) {
        str.getClass();
        switch (str) {
            case "static":
                return STATIC;
            case "relative":
                return RELATIVE;
            case "absolute":
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
