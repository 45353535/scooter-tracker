package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62037a = 504;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f62038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f62039c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f62040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f62041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f62042f;

    public static void a(Context context, String str) {
        if (f62042f == null) {
            f62042f = context;
        }
        int i10 = f62037a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        f62041e = System.currentTimeMillis();
        f62040d = false;
        f62038b = str;
        f62037a = 102;
        ar.b(new ao(context, 301, null));
    }

    public static void b() {
        Context context = f62042f;
        if (context != null) {
            ar.b(new ao(context, 301, null));
            f62037a = 102;
            com.pgl.ssdk.ces.b bVarE = com.pgl.ssdk.ces.b.e();
            if (bVarE != null) {
                bVarE.a("");
            }
        }
    }

    public static synchronized String a() {
        try {
            if (TextUtils.isEmpty(f62039c)) {
                f62039c = (String) com.pgl.ssdk.ces.a.meta(303, f62042f, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f62039c;
    }

    public static synchronized Object a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return com.pgl.ssdk.ces.a.meta(302, f62042f, bArr);
    }
}
