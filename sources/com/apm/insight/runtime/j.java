package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MonitorCrash f8100a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8101b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8102c;

    public static MonitorCrash a() {
        if (f8100a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f8100a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f8100a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f8101b == -1) {
            f8101b = 5;
        }
        int i10 = f8102c;
        if (i10 < f8101b) {
            f8102c = i10 + 1;
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
