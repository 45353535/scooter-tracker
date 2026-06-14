package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes6.dex */
public class aaj {
    private static boolean qdl = false;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static String f16721ud = "";

    public static void lnr(String str, String str2) {
        if (qdl && str2 != null) {
            Log.e(ud(str), str2);
        }
    }

    public static void qdl() {
        qdl = true;
    }

    public static void ud() {
        qdl = false;
    }

    public static void qdl(String str, String str2) {
        if (qdl && str2 != null) {
            Log.d(ud(str), str2);
        }
    }

    public static void ud(String str, String str2) {
        if (qdl && str2 != null) {
            Log.i(ud(str), str2);
        }
    }

    public static void lnr(String str, Object... objArr) {
        if (qdl && objArr != null) {
            Log.e(ud(str), qdl(objArr));
        }
    }

    public static void qdl(String str, Object... objArr) {
        if (qdl && objArr != null) {
            Log.d(ud(str), qdl(objArr));
        }
    }

    public static void ud(String str, Object... objArr) {
        if (qdl && objArr != null) {
            Log.i(ud(str), qdl(objArr));
        }
    }

    public static void qdl(String str, String str2, Throwable th2) {
        if (qdl) {
            if (str2 == null && th2 == null) {
                return;
            }
            Log.e(ud(str), str2, th2);
        }
    }

    private static String ud(String str) {
        if (TextUtils.isEmpty(f16721ud)) {
            return str;
        }
        return qdl(C4240b4.j.f42672d + f16721ud + "]-[" + str + C4240b4.j.f42674e);
    }

    public static void qdl(String str) {
        f16721ud = str;
    }

    private static String qdl(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
