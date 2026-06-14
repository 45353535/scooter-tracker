package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public final class Logging {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    private static String b(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void d(String str, String str2) {
        String strB = b(str);
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        String strB = b(str);
        if (Log.isLoggable(strB, 6)) {
            Log.e(strB, str2, th2);
        }
    }

    public static void i(String str, String str2, Object obj) {
        String strB = b(str);
        if (Log.isLoggable(strB, 4)) {
            Log.i(strB, String.format(str2, obj));
        }
    }

    public static void w(String str, String str2, Object obj) {
        String strB = b(str);
        if (Log.isLoggable(strB, 5)) {
            Log.w(strB, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj) {
        String strB = b(str);
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, String.format(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        String strB = b(str);
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, String.format(str2, obj, obj2));
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        String strB = b(str);
        if (Log.isLoggable(strB, 3)) {
            Log.d(strB, String.format(str2, objArr));
        }
    }
}
