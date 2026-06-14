package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.ads.RequestConfiguration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f7744a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f7745b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f7746c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f7747d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f7748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f7749f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f7752i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f7757n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f7750g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f7751h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f7753j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f7754k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f7755l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f7756m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f7758o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f7759p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f7760q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f7761r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f7762s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f7763t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f7764u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f7749f == null) {
            f7749f = g.a(f7744a);
        }
        return f7749f;
    }

    public static a b() {
        return f7751h;
    }

    public static g c() {
        if (f7753j == null) {
            synchronized (e.class) {
                f7753j = new g();
            }
        }
        return f7753j;
    }

    public static void d(boolean z10) {
        f7762s = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f7754k == null) {
            synchronized (f7755l) {
                try {
                    if (f7754k == null) {
                        f7754k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } finally {
                }
            }
        }
        return f7754k;
    }

    public static Context g() {
        return f7744a;
    }

    public static Application h() {
        return f7745b;
    }

    public static ConfigManager i() {
        return f7750g;
    }

    public static long j() {
        return f7746c;
    }

    public static String k() {
        return f7747d;
    }

    public static void l() {
        f7758o = 1;
    }

    public static int m() {
        return f7758o;
    }

    public static boolean n() {
        return f7748e;
    }

    static void o() {
        f7748e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f7752i;
    }

    public static int q() {
        return f7756m;
    }

    public static String r() {
        return f7757n;
    }

    public static boolean s() {
        return f7759p;
    }

    public static boolean t() {
        return f7760q;
    }

    public static boolean u() {
        return f7761r;
    }

    public static boolean v() {
        return f7762s;
    }

    public static boolean w() {
        return f7764u;
    }

    public static boolean x() {
        return f7763t;
    }

    static void b(int i10, String str) {
        f7756m = i10;
        f7757n = str;
    }

    public static boolean d() {
        if (!f7750g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get(AppsFlyerProperties.CHANNEL);
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z10) {
        f7764u = z10;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f7749f = bVar;
    }

    public static void b(boolean z10) {
        f7760q = z10;
    }

    public static void a(Application application) {
        if (application != null) {
            f7745b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f7745b == null) {
            f7746c = System.currentTimeMillis();
            f7744a = context;
            f7745b = application;
            f7754k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void c(boolean z10) {
        f7761r = z10;
    }

    public static void f(boolean z10) {
        f7763t = z10;
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f7749f = new com.apm.insight.nativecrash.b(f7744a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f7746c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    static void a(String str) {
        f7747d = str;
    }

    static void a(int i10, String str) {
        if (f7752i == null) {
            synchronized (e.class) {
                try {
                    if (f7752i == null) {
                        f7752i = new ConcurrentHashMap<>();
                    }
                } finally {
                }
            }
        }
        f7752i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z10) {
        f7759p = z10;
    }
}
