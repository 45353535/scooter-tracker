package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.v2;
import com.applovin.impl.x4;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes6.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10916b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10917a;

    o(k kVar) {
        this.f10917a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f10916b = z10;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f10916b || a()) {
            Log.e("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2, th2);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f10916b || a()) {
            Log.d("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f10916b || a()) {
            Log.i("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f10916b || a()) {
            Log.w("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        k kVar = k.C0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.C0.O().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f10917a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f10917a.a(x4.f11407r)).intValue()) > 0) {
            int length = str2.length();
            int i10 = ((length + iIntValue) - 1) / iIntValue;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * iIntValue;
                a(str, str2.substring(i12, Math.min(length, i12 + iIntValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        v2 v2Var = new v2();
        v2Var.a().a(str).a();
        g("AppLovinSdk", v2Var.toString());
    }

    public static void b(String str, String str2, Throwable th2) {
        k kVar = k.C0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.C0.O().a(str, str2, th2);
        }
    }

    public void d(String str, String str2, Throwable th2) {
        Log.w("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2, th2);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public void a(String str, Throwable th2) {
        for (Throwable th3 : th2.getSuppressed()) {
            b(str, th3.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th2) {
        Log.e("AppLovinSdk", C4240b4.j.f42672d + str + "] " + str2, th2);
    }

    public static boolean a() {
        return a(k.C0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.o0().c();
    }
}
