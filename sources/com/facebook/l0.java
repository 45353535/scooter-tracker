package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.m0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f20008a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20009b = l0.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f20010c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f20011d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f20012e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f20013f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f20014g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f20015h = new a(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f20016i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static SharedPreferences f20017j;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f20020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20021d;

        public a(boolean z10, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f20018a = z10;
            this.f20019b = key;
        }

        public final boolean a() {
            return this.f20018a;
        }

        public final String b() {
            return this.f20019b;
        }

        public final long c() {
            return this.f20021d;
        }

        public final Boolean d() {
            return this.f20020c;
        }

        public final boolean e() {
            Boolean bool = this.f20020c;
            return bool != null ? bool.booleanValue() : this.f20018a;
        }

        public final void f(long j10) {
            this.f20021d = j10;
        }

        public final void g(Boolean bool) {
            this.f20020c = bool;
        }
    }

    private l0() {
    }

    private final boolean b() {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            Map mapG = com.facebook.internal.m.g();
            if (mapG != null && !mapG.isEmpty()) {
                Boolean bool = (Boolean) mapG.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapG.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean boolC = c();
                if (boolC != null) {
                    return boolC.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return f20013f.e();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final Boolean c() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Boolean boolQ = q();
            if (boolQ != null) {
                return boolQ;
            }
            Boolean boolL = l();
            if (boolL != null) {
                return boolL;
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final boolean d() {
        if (e3.a.d(l0.class)) {
            return false;
        }
        try {
            f20008a.j();
            return f20014g.e();
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
            return false;
        }
    }

    public static final boolean e() {
        if (e3.a.d(l0.class)) {
            return false;
        }
        try {
            f20008a.j();
            return f20012e.e();
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
            return false;
        }
    }

    public static final boolean f() {
        if (e3.a.d(l0.class)) {
            return false;
        }
        try {
            l0 l0Var = f20008a;
            l0Var.j();
            return l0Var.b();
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
            return false;
        }
    }

    public static final boolean g() {
        if (e3.a.d(l0.class)) {
            return false;
        }
        try {
            f20008a.j();
            return f20015h.e();
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
            return false;
        }
    }

    private final void h() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            a aVar = f20015h;
            r(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || jCurrentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f20011d.compareAndSet(false, true)) {
                    s.t().execute(new Runnable() { // from class: com.facebook.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            l0.i(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(long j10) {
        com.facebook.internal.i iVarU;
        if (e3.a.d(l0.class)) {
            return;
        }
        try {
            if (f20014g.e() && (iVarU = com.facebook.internal.m.u(s.n(), false)) != null && iVarU.d()) {
                com.facebook.internal.a aVarE = com.facebook.internal.a.f19837f.e(s.m());
                String strH = (aVarE == null || aVarE.h() == null) ? null : aVarE.h();
                if (strH != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strH);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestX = GraphRequest.f19547n.x(null, "app", null);
                    graphRequestX.G(bundle);
                    JSONObject jSONObjectC = graphRequestX.k().c();
                    if (jSONObjectC != null) {
                        a aVar = f20015h;
                        aVar.g(Boolean.valueOf(jSONObjectC.optBoolean("auto_event_setup_enabled", false)));
                        aVar.f(j10);
                        f20008a.t(aVar);
                    }
                }
            }
            f20011d.set(false);
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
        }
    }

    private final void j() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (s.D() && f20010c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = s.m().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                f20017j = sharedPreferences;
                k(f20013f, f20014g, f20012e);
                h();
                p();
                o();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void k(a... aVarArr) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            for (a aVar : aVarArr) {
                if (aVar == f20015h) {
                    h();
                } else if (aVar.d() == null) {
                    r(aVar);
                    if (aVar.d() == null) {
                        m(aVar);
                    }
                } else {
                    t(aVar);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final Boolean l() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            s();
            try {
                Context contextM = s.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = f20013f;
                    if (bundle.containsKey(aVar.b())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                com.facebook.internal.z.Z(f20009b, e10);
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    private final void m(a aVar) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                Context contextM = s.m();
                ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
                return;
            } catch (PackageManager.NameNotFoundException e10) {
                com.facebook.internal.z.Z(f20009b, e10);
                return;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
        e3.a.b(th2, this);
    }

    public static final void n() {
        if (e3.a.d(l0.class)) {
            return;
        }
        try {
            Context contextM = s.m();
            ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            m0 m0Var = new m0(contextM);
            Bundle bundle2 = new Bundle();
            if (!com.facebook.internal.z.S()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f20009b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            m0Var.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
        }
    }

    private final void o() {
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (f20010c.get() && s.D()) {
                Context contextM = s.m();
                int i12 = 0;
                int i13 = (f20012e.e() ? 1 : 0) | ((f20013f.e() ? 1 : 0) << 1) | ((f20014g.e() ? 1 : 0) << 2) | ((f20016i.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f20017j;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences3 = f20017j;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i10 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i11 = 0;
                        m0 m0Var = new m0(contextM);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i12);
                        bundle.putInt("initial", i11);
                        bundle.putInt("previous", i14);
                        bundle.putInt("current", i13);
                        m0Var.b(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i11 = 0;
                    i10 = 0;
                    while (i12 < 4) {
                        try {
                            i10 |= (applicationInfo.metaData.containsKey(strArr[i12]) ? 1 : 0) << i12;
                            i11 |= (applicationInfo.metaData.getBoolean(strArr[i12], zArr[i12]) ? 1 : 0) << i12;
                            i12++;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i12 = i11;
                        }
                    }
                    i12 = i10;
                    m0 m0Var2 = new m0(contextM);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i12);
                    bundle2.putInt("initial", i11);
                    bundle2.putInt("previous", i14);
                    bundle2.putInt("current", i13);
                    m0Var2.b(bundle2);
                    i11 = i12;
                    i12 = i10;
                    m0 m0Var22 = new m0(contextM);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i12);
                    bundle22.putInt("initial", i11);
                    bundle22.putInt("previous", i14);
                    bundle22.putInt("current", i13);
                    m0Var22.b(bundle22);
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void p() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Context contextM = s.m();
            ApplicationInfo applicationInfo = contextM.getPackageManager().getApplicationInfo(contextM.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f20009b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (d()) {
                    return;
                }
                Log.w(f20009b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private static final Boolean q() {
        String str = "";
        if (e3.a.d(l0.class)) {
            return null;
        }
        try {
            f20008a.s();
            try {
                SharedPreferences sharedPreferences = f20017j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(f20013f.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e10) {
                com.facebook.internal.z.Z(f20009b, e10);
            }
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, l0.class);
            return null;
        }
    }

    private final void r(a aVar) {
        String str = "";
        if (e3.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                SharedPreferences sharedPreferences = f20017j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                com.facebook.internal.z.Z(f20009b, e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void s() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (f20010c.get()) {
            } else {
                throw new t("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final void t(a aVar) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f20017j;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                o();
            } catch (Exception e10) {
                com.facebook.internal.z.Z(f20009b, e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
