package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
public enum mzz {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);

    private final int mzz;

    mzz(int i10) {
        this.mzz = i10;
    }

    public int qdl() {
        return this.mzz;
    }

    public static mzz qdl(int i10) {
        if (i10 == 0) {
            return COLUMN;
        }
        if (i10 == 1) {
            return COLUMN_REVERSE;
        }
        if (i10 == 2) {
            return ROW;
        }
        if (i10 == 3) {
            return ROW_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static mzz qdl(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return COLUMN_REVERSE;
            case "column":
                return COLUMN;
            case "row_reverse":
                return ROW_REVERSE;
            case "row":
                return ROW;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
