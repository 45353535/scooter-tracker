package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes10.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f49045a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f49046b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f49047c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f49048d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f49049e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f49050f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f49051g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f49052h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f49051g = false;
        f49045a = false;
        f49047c = false;
        f49052h = false;
        f49046b = false;
        f49050f = false;
        f49049e = false;
        f49048d = false;
    }

    public static void a(String str, String str2) {
        if (!f49045a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f49046b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f49047c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f49052h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f49046b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f49052h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f49045a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f49052h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
