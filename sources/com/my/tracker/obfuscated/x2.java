package com.my.tracker.obfuscated;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f61895a;

    public static boolean a() {
        return f61895a;
    }

    public static void b(String str) {
        if (f61895a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str);
        }
    }

    public static void c(String str) {
        if (Log.isLoggable("[myTracker]", 4)) {
            if (str == null) {
                str = "null";
            }
            Log.i("[myTracker]", str);
        }
    }

    public static void a(boolean z10) {
        f61895a = z10;
    }

    public static void a(String str) {
        if (f61895a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str);
        }
    }

    public static void b(String str, Throwable th2) {
        if (f61895a) {
            if (str == null) {
                str = "null";
            }
            Log.e("[myTracker]", str, th2);
        }
    }

    public static void a(String str, Throwable th2) {
        if (f61895a) {
            if (str == null) {
                str = "null";
            }
            Log.d("[myTracker]", str, th2);
        }
    }
}
