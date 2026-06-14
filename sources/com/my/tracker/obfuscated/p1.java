package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4257c4;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile p1 f61766b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f61767a;

    private p1(SharedPreferences sharedPreferences) {
        this.f61767a = sharedPreferences;
    }

    public static p1 a(Context context) {
        p1 p1Var;
        p1 p1Var2 = f61766b;
        if (p1Var2 != null) {
            return p1Var2;
        }
        synchronized (p1.class) {
            try {
                p1Var = f61766b;
                if (p1Var == null) {
                    p1Var = new p1(context.getSharedPreferences("mytracker_prefs", 0));
                    f61766b = p1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p1Var;
    }

    public void b(long j10) {
        a("installTimestamp", j10);
    }

    public String c() {
        return c(RemoteConfigConstants.RequestFieldKey.APP_ID);
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public void e(String str) {
        a(RemoteConfigConstants.RequestFieldKey.APP_ID, str);
    }

    public String f() {
        return c("appVersionName");
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a(C4257c4.f42799c, str);
    }

    public long j() {
        return b("installTimestamp");
    }

    public String k() {
        return c("instanceId");
    }

    public void l(String str) {
        a(Constants.REFERRER, str);
    }

    public String m() {
        return c(Constants.REFERRER);
    }

    public long n() {
        long jB = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return jB;
    }

    public boolean o() {
        return a("apiReferrerSent");
    }

    public boolean p() {
        return a("huaweiApiReferrerSent");
    }

    public boolean q() {
        return a("preinstallRead");
    }

    public boolean r() {
        return a("referrerSent");
    }

    public void s() {
        a("apiReferrerSent", true);
    }

    public void t() {
        a("huaweiApiReferrerSent", true);
    }

    public void u() {
        a("preinstallRead", true);
    }

    public void v() {
        a("referrerSent", true);
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public void c(long j10) {
        a("lastUpdateTimestamp", j10);
    }

    public String d() {
        return c("appSetId");
    }

    public int e() {
        return (int) b("appSetIdScope");
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public String g() {
        return c("appsHash");
    }

    public String h() {
        return c(C4257c4.f42799c);
    }

    public String i() {
        return c("firebaseAppInstanceId");
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public long l() {
        return b("lastUpdateTimestamp");
    }

    long b(String str) {
        try {
            return this.f61767a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    String c(String str) {
        try {
            return this.f61767a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(long j10) {
        a("lastStopTimeStampSec", j10);
    }

    public String a() {
        return c("appVersion");
    }

    public void a(int i10) {
        a("appSetIdScope", i10);
    }

    public void a(long j10) {
        a("appGalleryTrackedTime", j10);
    }

    boolean a(String str) {
        try {
            return this.f61767a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    void a(String str, long j10) {
        try {
            this.f61767a.edit().putLong(str, j10).commit();
        } catch (Throwable th2) {
            x2.a("PrefsCache error: ", th2);
        }
    }

    void a(String str, String str2) {
        try {
            this.f61767a.edit().putString(str, str2).commit();
        } catch (Throwable th2) {
            x2.a("PrefsCache error: ", th2);
        }
    }

    void a(String str, boolean z10) {
        try {
            this.f61767a.edit().putBoolean(str, z10).commit();
        } catch (Throwable th2) {
            x2.a("PrefsCache error: ", th2);
        }
    }
}
