package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes6.dex */
@com.bytedance.adsdk.ugeno.yoga.qdl.qdl
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);


    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final int f16276wd;

    YogaLogLevel(int i10) {
        this.f16276wd = i10;
    }

    @com.bytedance.adsdk.ugeno.yoga.qdl.qdl
    public static YogaLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return ERROR;
        }
        if (i10 == 1) {
            return WARN;
        }
        if (i10 == 2) {
            return INFO;
        }
        if (i10 == 3) {
            return DEBUG;
        }
        if (i10 == 4) {
            return VERBOSE;
        }
        if (i10 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }
}
