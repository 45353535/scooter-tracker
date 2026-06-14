package com.mbridge.msdk.tracker.network;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f51865a = "TrackManager_Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51866b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th2, String str, Object... objArr) {
        Log.e(f51865a, a(str, objArr), th2);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f51865a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f51865a, a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i10].getClassName().equals(f51866b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            }
            i10++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
