package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4500q8;

/* JADX INFO: loaded from: classes10.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f45402a;

    public static void d(String str, String str2) {
        if (f45402a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f45402a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        f45402a = C4500q8.d.MODE_0.b() != i10;
    }

    public static void i(String str, String str2) {
        if (f45402a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f45402a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f45402a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f45402a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f45402a) {
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f45402a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f45402a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f45402a) {
            Log.w(str, str2, th2);
        }
    }
}
