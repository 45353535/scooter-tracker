package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y0;
import com.fyber.inneractive.sdk.web.a1;
import com.fyber.inneractive.sdk.web.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class IAConfigManager {
    public static long P;
    public final y0 A;
    public com.fyber.inneractive.sdk.network.v0 B;
    public com.fyber.inneractive.sdk.network.v0 C;
    public g D;
    public final com.fyber.inneractive.sdk.ignite.h E;
    public final com.fyber.inneractive.sdk.topics.b F;
    public final com.fyber.inneractive.sdk.dv.handler.a G;
    public final com.fyber.inneractive.sdk.cache.k H;
    public final com.fyber.inneractive.sdk.network.f I;
    public final HashMap J;
    public com.fyber.inneractive.sdk.measurement.e K;
    public WebView L;
    public final com.fyber.inneractive.sdk.config.global.r M;
    public com.fyber.inneractive.sdk.config.cellular.a N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f20295a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f20296b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f20300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f20301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f20303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InneractiveUserConfig f20304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InneractiveMediationName f20307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f20308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f20309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f20310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f20312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.l0 f20313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f20314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s f20315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f20316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t f20317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x0 f20318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s1 f20319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.a f20320z;
    public static final IAConfigManager O = new IAConfigManager();
    public static final g0 Q = new g0();

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc);
    }

    public IAConfigManager() {
        com.fyber.inneractive.sdk.dv.handler.a eVar;
        new HashSet();
        this.f20302h = false;
        this.f20303i = new k0();
        this.f20305k = false;
        this.f20311q = false;
        this.f20312r = new AtomicBoolean(false);
        this.f20313s = new com.fyber.inneractive.sdk.network.l0();
        this.f20314t = "";
        this.f20318x = new x0();
        this.A = new y0();
        this.E = new com.fyber.inneractive.sdk.ignite.h();
        this.F = new com.fyber.inneractive.sdk.topics.b();
        String[] strArr = {"com.google.android.gms.ads.MobileAds", "com.google.android.gms.ads.query.QueryInfoGenerationCallback"};
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
                eVar = new com.fyber.inneractive.sdk.dv.handler.f();
            }
        }
        eVar = new com.fyber.inneractive.sdk.dv.handler.e();
        this.G = eVar;
        this.H = new com.fyber.inneractive.sdk.cache.k();
        this.I = new com.fyber.inneractive.sdk.network.f();
        this.J = new HashMap();
        this.M = com.fyber.inneractive.sdk.config.global.r.a();
        this.f20301g = new CopyOnWriteArrayList();
    }

    public static void addListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f20301g.add(onConfigurationReadyAndValidListener);
    }

    public static void b() {
        s sVar;
        com.fyber.inneractive.sdk.topics.b bVar;
        IAConfigManager iAConfigManager = O;
        iAConfigManager.getClass();
        if (iAConfigManager.F.f23788i.get() || (sVar = iAConfigManager.f20315u) == null || sVar.f20484b == null) {
            return;
        }
        if (iAConfigManager.f20312r.compareAndSet(false, true)) {
            int iA = iAConfigManager.f20315u.f20484b.a("topics_enabled", 0, 0);
            int iA2 = iAConfigManager.f20315u.f20484b.a("e_topics_enabled", 0, 0);
            if (iA == 0 && iA2 == 0) {
                IAlog.a("Topics API feature disabled - topics_enabled & e_topics_enabled flags are 0", new Object[0]);
                return;
            }
            boolean z10 = iA != 0;
            boolean z11 = iA2 != 0;
            try {
                if (!f() || (bVar = iAConfigManager.F) == null) {
                    return;
                }
                bVar.a(z10, z11);
                iAConfigManager.F.c();
            } catch (Throwable th2) {
                IAlog.a("error while trying to init topics ", th2, new Object[0]);
            }
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(1000000) >= 11 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static boolean d() {
        g gVar = O.D;
        return gVar != null && gVar.e();
    }

    public static boolean e() {
        IAConfigManager iAConfigManager = O;
        boolean z10 = iAConfigManager.f20299e != null;
        int i10 = k.f20410a;
        boolean zBooleanValue = Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false))).booleanValue();
        if ((z10 && System.currentTimeMillis() - P > 3600000) || zBooleanValue) {
            if (zBooleanValue) {
                s sVar = iAConfigManager.f20315u;
                sVar.f20486d = false;
                com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.util.l(sVar.f20487e));
            }
            a();
            b1 b1Var = b1.f23931c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new a1(b1Var));
        }
        return z10;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(1000000) >= 4 && com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_ADSERVICES_TOPICS");
    }

    public static void g() {
        SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f23888a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static void removeListener(OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        O.f20301g.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(Exception exc) {
        for (OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener : this.f20301g) {
            if (onConfigurationReadyAndValidListener != null) {
                boolean z10 = O.f20299e != null;
                IAlog.e("notifying listener configuration state has been resolved", new Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z10, !z10 ? exc : null);
            }
        }
    }

    public static void a() {
        IAConfigManager iAConfigManager = O;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.B;
        if (v0Var != null) {
            iAConfigManager.f20313s.a(v0Var);
        }
        s sVar = iAConfigManager.f20315u;
        if (sVar.f20486d) {
            return;
        }
        iAConfigManager.f20313s.a(new com.fyber.inneractive.sdk.network.v0(new p(sVar), sVar.f20483a, sVar.f20487e));
    }
}
