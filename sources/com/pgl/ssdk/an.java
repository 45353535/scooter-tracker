package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62095a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f62096b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f62097c = "api16-access-ttp.tiktokpangle.us";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f62098d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f62099e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f62100f = "";

    public static String a() {
        return f62095a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f62100f;
    }

    public static void a(int i10) {
        f62095a = i10;
    }

    public static void b(String str) {
        f62100f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f62096b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f62096b)) {
            au.a("updateIndex");
            int i10 = f62099e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f62099e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f62099e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f62096b)) {
            return f62096b;
        }
        try {
            if (f62099e == Integer.MIN_VALUE) {
                f62099e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f62098d;
            return strArr[f62099e % strArr.length];
        } catch (Throwable unused) {
            return f62097c;
        }
    }
}
