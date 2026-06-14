package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.lang.Thread;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class jh {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f64770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f64771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f64772w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SDKAdPreferences f64773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f64778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Application f64779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f64780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gh f64781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f64782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Activity f64783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f64785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f64786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TreeMap f64787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bundle f64788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f64789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f64790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w0 f64791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f64792t;

    public jh() {
        WeakHashMap weakHashMap = vi.f65408a;
        this.f64774b = true;
        this.f64775c = false;
        this.f64776d = false;
        this.f64777e = false;
        this.f64780h = new HashMap();
        this.f64782j = new AtomicBoolean();
        this.f64784l = false;
        this.f64785m = true;
        this.f64786n = false;
        this.f64788p = null;
    }

    public static void c(final Context context) {
        Context contextA = x0.a(context);
        if (contextA != null) {
            context = contextA;
        }
        m8 m8Var = (m8) com.startapp.sdk.components.a.a(context).f64198y.a();
        m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.em
            @Override // java.lang.Runnable
            public final void run() {
                jh.e(context);
            }
        });
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferences = (SharedPreferences) com.startapp.sdk.components.a.a(context).I.a();
        if (sharedPreferences.contains("isma")) {
            return sharedPreferences.getBoolean("isma", false) ? sharedPreferences.contains("iscd") && !sharedPreferences.getBoolean("iscd", false) : (sharedPreferences.contains("iscd") && sharedPreferences.getBoolean("iscd", false)) ? false : true;
        }
        if (sharedPreferences.contains("iscd")) {
            return !sharedPreferences.getBoolean("iscd", false);
        }
        return true;
    }

    public static void e(Context context) {
        ih.f64695a.a(context, null, null, null, null, true);
    }

    public final void a(Context context, final String str, final String str2, final SDKAdPreferences sDKAdPreferences, final Runnable runnable) {
        Context contextA = x0.a(context);
        final Context context2 = contextA != null ? contextA : context;
        try {
            ((sf) com.startapp.sdk.components.a.a(context2).f64194u.a()).a(256);
        } catch (Throwable unused) {
        }
        ((m8) com.startapp.sdk.components.a.a(context2).f64198y.a()).f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.fm
            @Override // java.lang.Runnable
            public final void run() {
                this.f64525b.b(context2, str, str2, sDKAdPreferences, runnable);
            }
        });
    }

    public final /* synthetic */ void b(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable) {
        a(context, str, str2, sDKAdPreferences, runnable, false);
    }

    public final void f(Context context) {
        vf vfVar = (vf) com.startapp.sdk.components.a.a(context).G.a();
        int i10 = vfVar.getInt("shared_prefs_app_version_id", -1);
        int iA = q0.a(context);
        if (i10 > 0 && iA > i10) {
            this.f64786n = true;
        }
        uf ufVarEdit = vfVar.edit();
        ufVarEdit.a("shared_prefs_app_version_id", Integer.valueOf(iA));
        ufVarEdit.f65346a.putInt("shared_prefs_app_version_id", iA);
        ufVarEdit.apply();
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        uf ufVarEdit = ((vf) aVarA.G.a()).edit();
        Boolean bool = Boolean.FALSE;
        ufVarEdit.a("periodicInfoEventPaused", bool);
        ufVarEdit.f65346a.putBoolean("periodicInfoEventPaused", false);
        ufVarEdit.a("periodicMetadataPaused", bool);
        ufVarEdit.f65346a.putBoolean("periodicMetadataPaused", false);
        ufVarEdit.apply();
        eh ehVar = new eh(this, context, aVarA);
        if (MetaData.E().n0()) {
            ehVar.a(null, false);
        } else {
            MetaData.E().a(ehVar);
        }
    }

    public final void b(Context context) {
        Context contextA = x0.a(context);
        Application application = contextA instanceof Application ? (Application) contextA : context instanceof Application ? (Application) context : context instanceof Activity ? ((Activity) context).getApplication() : context instanceof Service ? ((Service) context).getApplication() : null;
        if (application == null || this.f64791s != null) {
            return;
        }
        w0 w0Var = new w0(this);
        this.f64791s = w0Var;
        application.registerActivityLifecycleCallbacks(w0Var);
        try {
            nf nfVar = ((sf) com.startapp.sdk.components.a.a(context).f64194u.a()).f65263e;
            if (nfVar == null) {
                throw new RuntimeException();
            }
            application.registerActivityLifecycleCallbacks(nfVar);
        } catch (Throwable unused) {
        }
    }

    public final void a(final Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, final Runnable runnable, boolean z10) {
        boolean zA;
        MetaDataRequest$RequestReason metaDataRequest$RequestReason;
        boolean zA2;
        boolean z11;
        boolean zContains;
        WeakHashMap weakHashMap = vi.f65408a;
        int i10 = f64770u;
        boolean zA3 = false;
        if (i10 == 0 && z10) {
            hc hcVar = new hc(context);
            if (hcVar.f64627c != null || hcVar.f64628d != null) {
                uf ufVarEdit = ((vf) com.startapp.sdk.components.a.a(context).I.a()).edit();
                Boolean bool = hcVar.f64627c;
                if (bool != null) {
                    boolean zEquals = Boolean.TRUE.equals(bool);
                    ufVarEdit.a("isma", Boolean.valueOf(zEquals));
                    ufVarEdit.f65346a.putBoolean("isma", zEquals);
                }
                Boolean bool2 = hcVar.f64628d;
                if (bool2 != null) {
                    boolean zEquals2 = Boolean.TRUE.equals(bool2);
                    ufVarEdit.a("iscd", Boolean.valueOf(zEquals2));
                    ufVarEdit.f65346a.putBoolean("iscd", zEquals2);
                }
                ufVarEdit.apply();
            }
            StartAppSDK.enableConsent(context, hcVar.f64626b);
            str2 = hcVar.f64625a;
            if (TextUtils.isEmpty(str2)) {
                r0 r0Var = (r0) com.startapp.sdk.components.a.a(context).f64186m.a();
                synchronized (r0Var.f65176a) {
                    zContains = r0Var.f65177b.contains("2696a7f502faed4b");
                }
                if (zContains) {
                    str2 = r0Var.a();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                z10 = false;
            }
        }
        Runnable runnable2 = new Runnable() { // from class: com.startapp.sdk.internal.gm
            @Override // java.lang.Runnable
            public final void run() {
                jh.a(context, runnable);
            }
        };
        int i11 = f64771v;
        hh hhVar = new hh(context, runnable2, i11 == 1 || i11 == 2, i11 == 2);
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        MetaData.E().a(new dh(new Handler(looperMyLooper), hhVar));
        int i12 = z10 ? 1 : 2;
        if (i12 > i10) {
            f64770u = i12;
            if (z10) {
                metaDataRequest$RequestReason = MetaDataRequest$RequestReason.IMPLICIT_LAUNCH;
            } else {
                MetaDataRequest$RequestReason metaDataRequest$RequestReason2 = MetaDataRequest$RequestReason.LAUNCH;
                if (TextUtils.isEmpty(str2)) {
                    if (!vi.d(context)) {
                        int i13 = q0.f65128a;
                        try {
                            zA2 = v6.a(context);
                        } catch (Throwable unused) {
                            zA2 = false;
                        }
                        if (!zA2) {
                            Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                        }
                    }
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                ((r0) com.startapp.sdk.components.a.a(context).f64186m.a()).a(str, str2);
                this.f64773a = sDKAdPreferences;
                g7.b(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
                metaDataRequest$RequestReason = metaDataRequest$RequestReason2;
            }
            if (i10 == 0) {
                if (Math.random() < 0.0d) {
                    Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:5.2.4");
                }
                try {
                    com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
                    aVarA.L.a();
                    j0 j0Var = (j0) aVarA.J.a();
                    try {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        if (!(defaultUncaughtExceptionHandler instanceof j0)) {
                            Thread.setDefaultUncaughtExceptionHandler(j0Var);
                            j0Var.f64740a = defaultUncaughtExceptionHandler;
                        }
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                    v0 v0Var = (v0) aVarA.Q.a();
                    v0Var.f65363a.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    v0Var.f65366d = jElapsedRealtime;
                    v0Var.f65367e = jElapsedRealtime;
                    ((w9) aVarA.f64190q.a()).a();
                    ((k0) aVarA.f64174a.a()).a();
                    if (!q0.a(context, "android.permission.INTERNET") || !q0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        vi.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                    }
                    try {
                        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                        z11 = false;
                        int i14 = 0;
                        while (!z11) {
                            try {
                                if (i14 >= activityInfoArr.length) {
                                    break;
                                }
                                int i15 = i14 + 1;
                                ActivityInfo activityInfo = activityInfoArr[i14];
                                if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                                    if ((activityInfo.flags & 512) == 0) {
                                        z11 = true;
                                    } else {
                                        i14 = i15;
                                        z11 = false;
                                    }
                                }
                                i14 = i15;
                            } catch (PackageManager.NameNotFoundException | Exception unused2) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | Exception unused3) {
                        z11 = false;
                    }
                    this.f64785m = !z11;
                    ((com.startapp.sdk.common.advertisingid.b) aVarA.f64181h.a()).a(d(context));
                    b(context);
                    com.startapp.sdk.adsbase.g.c(context);
                    ((gi) aVarA.S.a()).b();
                    ((cd) aVarA.T.a()).a();
                    aVarA.H.a();
                    j6.f64749a = new CookieManager(new je(context), CookiePolicy.ACCEPT_ALL);
                    f(context);
                    a(context);
                    g(context);
                    if (context instanceof Application) {
                        Application application = (Application) context;
                        this.f64779g = application;
                        if (this.f64782j.compareAndSet(false, true) && this.f64781i == null) {
                            gh ghVar = new gh();
                            application.registerActivityLifecycleCallbacks(ghVar);
                            this.f64781i = ghVar;
                        }
                    }
                    MetaData.E().a((h6) aVarA.f64183j.a());
                    WeakHashMap weakHashMap2 = vi.f65408a;
                    if (MetaData.c(context)) {
                        AdsCommonMetaData.a(context);
                        BannerMetaData.a(context);
                        if (this.f64774b) {
                            CacheMetaData.a(context);
                        }
                        AdInformationMetaData.a(context);
                        zA3 = true;
                    }
                } catch (Throwable th3) {
                    g9.a(th3);
                }
                if (zA3 && f64771v == 0) {
                    f64771v = 1;
                }
                WeakHashMap weakHashMap3 = vi.f65408a;
                hhVar.f64648c = zA3;
            }
            pg.f65112d.a(context, metaDataRequest$RequestReason);
        } else if (!z10 && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                if (!vi.d(context)) {
                    int i16 = q0.f65128a;
                    try {
                        zA = v6.a(context);
                    } catch (Throwable unused4) {
                        zA = false;
                    }
                    if (!zA) {
                        Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                    }
                }
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
            zA3 = ((r0) com.startapp.sdk.components.a.a(context).f64186m.a()).a(str, str2);
            if (zA3) {
                pg.f65112d.a(context, MetaDataRequest$RequestReason.LAUNCH);
            }
        }
        hhVar.f64650e = true;
        WeakHashMap weakHashMap4 = vi.f65408a;
        if (!(hhVar.f64648c ? hhVar.f64649d : true) || hhVar.f64647b) {
            return;
        }
        hhVar.f64647b = true;
        h0.a(hhVar.f64646a);
    }

    public static void a(Context context, Runnable runnable) {
        if (!f64772w) {
            f64772w = true;
            String str = "StartApp SDK initialized, version " + StartAppSDK.getVersion();
            WeakHashMap weakHashMap = vi.f65408a;
            Log.println(4, "StartAppSDK", str);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[Catch: all -> 0x0023, EDGE_INSN: B:70:0x00be->B:47:0x00be BREAK  A[LOOP:1: B:29:0x008f->B:71:0x008f], TRY_LEAVE, TryCatch #1 {all -> 0x0023, blocks: (B:3:0x0007, B:5:0x001e, B:9:0x0027, B:10:0x0034, B:12:0x003a, B:14:0x0055, B:15:0x005d, B:18:0x0065, B:20:0x006b, B:21:0x0072, B:44:0x00b6, B:47:0x00be, B:43:0x00b3, B:23:0x0078, B:25:0x0084, B:28:0x008b, B:29:0x008f, B:31:0x0095, B:34:0x00a0, B:36:0x00a6, B:39:0x00ad), top: B:58:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.jh.a(android.content.Context):void");
    }
}
