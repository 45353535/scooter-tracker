package com.taurusx.tax.log;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4240b4;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.b;
import com.taurusx.tax.w.o.w;
import com.taurusx.tax.w.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class LogUtil {
    public static final String TAG = "taurusx";
    public static final String TAG_RELEASE = "taurusx";
    public static final String VERSION = "1.12.2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f66367a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f66368c = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f66369o = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f66370s = C4240b4.j.f42672d + "1.12.2".replace("-SNAPSHOT", "") + C4240b4.j.f42674e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f66371w = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f66372y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f66373z = 2;

    public static void d(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 3)) {
            Log.d(strZ, str4);
        }
    }

    public static void e(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 6)) {
            Log.e(strZ, str4);
        }
    }

    public static String getCallClassAndMethod() {
        return "";
    }

    public static void i(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 4)) {
            Log.i(strZ, str4);
        }
    }

    public static boolean isLogExpired() {
        return System.currentTimeMillis() - b.z().w(TaurusXAds.getContext(), b.f66094p) > ((long) (w.R() * 60000));
    }

    public static void sensitiveD(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 3) && w.U()) {
            Log.d(strZ, str4);
        }
    }

    public static void setLogEnable(boolean z10) {
        f66367a = z10;
    }

    public static void v(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 2)) {
            Log.v(strZ, str4);
        }
    }

    public static void w(String str, String str2) {
        String str3;
        if (TextUtils.equals(str, "taurusx")) {
            str3 = "";
        } else {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 5)) {
            Log.w(strZ, str4);
        }
    }

    public static boolean z(String str, int i10) {
        if (f66367a) {
            return true;
        }
        return Log.isLoggable(str, i10);
    }

    public static String z(String str) {
        return (str == null || str.length() <= 23) ? str : "taurusx";
    }

    public static String z() {
        String className;
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length < 4 || (className = stackTrace[5].getClassName()) == null) {
                return null;
            }
            int iLastIndexOf = className.lastIndexOf(".");
            if (iLastIndexOf != -1) {
                className = className.substring(iLastIndexOf + 1);
            }
            int iIndexOf = className.indexOf(36);
            return iIndexOf != -1 ? className.substring(0, iIndexOf) : className;
        } catch (Exception unused) {
        }
        return null;
    }

    public static void e(String str, String str2, Throwable th2) {
        String str3;
        if (!TextUtils.equals(str, "taurusx")) {
            str3 = C4240b4.j.f42672d + str + C4240b4.j.f42674e;
            str = "taurusx";
        } else {
            str3 = "";
        }
        String strZ = z(str);
        String str4 = f66370s + str3 + w() + str2;
        if (w.V() && z.t().a() != null && !isLogExpired()) {
            z.t().a().z("taurusx", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()), str4);
        }
        if (z(strZ, 6)) {
            Log.e(strZ, str4);
        }
    }

    public static String w() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null || stackTrace.length < 4) {
                return null;
            }
            return String.format(Locale.ENGLISH, "%s.%s : %d ---> ", z(), stackTrace[4].getMethodName(), Integer.valueOf(stackTrace[4].getLineNumber()));
        } catch (Exception unused) {
            return null;
        }
    }
}
