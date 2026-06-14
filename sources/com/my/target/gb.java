package com.my.target;

import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f59768a;

    public static void a(String str) {
        b(null, str);
    }

    public static void b(String str, String str2) {
        if (f59768a) {
            Log.d("[myTarget]", a(str, str2));
        }
    }

    public static void c(String str, String str2) {
        if (f59768a) {
            Log.e("[myTarget]", a(str, str2));
        }
    }

    public static void d(String str) {
        e(null, str);
    }

    public static void e(String str, String str2) {
        if (f59768a) {
            Log.w("[myTarget]", a(str, str2));
        }
    }

    public static String a(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str + ": ";
        }
        sb2.append(str3);
        if (str2 == null) {
            str2 = "<empty log>";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static void d(String str, String str2) {
        Log.i("[myTarget]", a(str, str2));
    }

    public static void b(String str) {
        c(null, str);
    }

    public static void c(String str) {
        d(null, str);
    }
}
