package com.taurusx.tax.g;

import com.taurusx.tax.log.LogUtil;
import java.util.IllegalFormatException;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f66312z = "";

    public static final class z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static volatile boolean f66313z;

        public static boolean z(Object obj) {
            return r.w(obj, f66313z, "Object can not be null.", "");
        }

        public static boolean z(Object obj, String str) {
            return r.w(obj, f66313z, str, "");
        }

        public static boolean z(Object obj, String str, Object... objArr) {
            return r.w(obj, f66313z, str, objArr);
        }
    }

    public static boolean w(Object obj, boolean z10, String str, Object... objArr) {
        if (obj != null) {
            return true;
        }
        String strZ = z(str, objArr);
        if (z10) {
            throw new NullPointerException(strZ);
        }
        LogUtil.d("taurusx", strZ);
        return false;
    }

    public static void z(Object obj) {
        w(obj, true, "Object can not be null.", "");
    }

    public static void z(Object obj, String str) {
        w(obj, true, str, "");
    }

    public static void z(Object obj, String str, Object... objArr) {
        w(obj, true, str, objArr);
    }

    public static String z(String str, Object... objArr) {
        String strValueOf = String.valueOf(str);
        try {
            return String.format(strValueOf, objArr);
        } catch (IllegalFormatException e10) {
            LogUtil.d("taurusx", "preconditions had a format exception: " + e10.getMessage());
            return strValueOf;
        }
    }
}
