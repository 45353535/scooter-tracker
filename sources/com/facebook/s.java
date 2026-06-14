package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.appevents.o;
import com.facebook.internal.b;
import com.facebook.internal.e;
import com.facebook.internal.r;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import v2.i;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Executor f20027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile String f20028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile String f20029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile String f20030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Boolean f20031h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile boolean f20033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f20034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static com.facebook.internal.q f20035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Context f20036m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f20040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f20041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f20042s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f20047x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f20024a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20025b = s.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashSet f20026c = SetsKt.hashSetOf(d0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static AtomicLong f20032i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20037n = 64206;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final ReentrantLock f20038o = new ReentrantLock();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f20039p = com.facebook.internal.v.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AtomicBoolean f20043t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static volatile String f20044u = "instagram.com";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static volatile String f20045v = "facebook.com";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static a f20046w = new a() { // from class: com.facebook.j
        @Override // com.facebook.s.a
        public final GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
            return s.A(accessToken, str, jSONObject, bVar);
        }
    };

    public interface a {
        GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar);
    }

    public interface b {
        void onInitialized();
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GraphRequest A(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
        return GraphRequest.f19547n.A(accessToken, str, jSONObject, bVar);
    }

    public static final boolean B() {
        return f20033j;
    }

    public static final synchronized boolean C() {
        return f20047x;
    }

    public static final boolean D() {
        return f20043t.get();
    }

    public static final boolean E() {
        return f20034k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean F(com.facebook.d0 r2) {
        /*
            java.lang.String r0 = "behavior"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.HashSet r0 = com.facebook.s.f20026c
            monitor-enter(r0)
            boolean r1 = B()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L16:
            r2 = move-exception
            goto L1b
        L18:
            r2 = 0
        L19:
            monitor-exit(r0)
            return r2
        L1b:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.s.F(com.facebook.d0):boolean");
    }

    public static final void G(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f20028e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.a0(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f20028e = strSubstring;
                    } else {
                        f20028e = str;
                    }
                } else if (obj instanceof Number) {
                    throw new i("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f20029f == null) {
                f20029f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f20030g == null) {
                f20030g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f20037n == 64206) {
                f20037n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f20031h == null) {
                f20031h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void H(Context context, String str) {
        try {
            if (e3.a.d(this)) {
                return;
            }
            try {
                com.facebook.internal.a aVarE = com.facebook.internal.a.f19837f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j10 = sharedPreferences.getLong(str2, 0L);
                try {
                    JSONObject jSONObjectA = v2.i.a(i.a.MOBILE_INSTALL_EVENT, aVarE, com.facebook.appevents.o.f19698b.b(context), x(context), context);
                    String strL = com.facebook.appevents.r.f19718c.l();
                    if (strL != null) {
                        jSONObjectA.put(Constants.INSTALL_REFERRER, strL);
                    }
                    a1 a1Var = a1.f93282a;
                    String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                    GraphRequest graphRequestA = f20046w.a(null, str3, jSONObjectA, null);
                    if (j10 == 0 && graphRequestA.k().b() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str2, System.currentTimeMillis());
                        editorEdit.apply();
                        r.a aVar = com.facebook.internal.r.f19964e;
                        d0 d0Var = d0.APP_EVENTS;
                        String TAG = f20025b;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        aVar.b(d0Var, TAG, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e10) {
                    throw new i("An error occurred while publishing install.", e10);
                }
            } catch (Exception e11) {
                com.facebook.internal.z.Z("Facebook-publish", e11);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public static final void I(Context context, final String applicationId) {
        if (e3.a.d(s.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            if (!com.facebook.internal.h.d("app_events_killswitch", n(), false)) {
                t().execute(new Runnable() { // from class: com.facebook.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.J(applicationContext, applicationId);
                    }
                });
            }
            if (com.facebook.internal.e.g(e.b.OnDeviceEventProcessing) && x2.c.d()) {
                x2.c.g(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            e3.a.b(th2, s.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Context applicationContext, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        f20024a.H(applicationContext, applicationId);
    }

    public static final synchronized void K(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        L(applicationContext, null);
    }

    public static final synchronized void L(Context applicationContext, final b bVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        AtomicBoolean atomicBoolean = f20043t;
        if (atomicBoolean.get()) {
            if (bVar != null) {
                bVar.onInitialized();
            }
            return;
        }
        com.facebook.internal.a0.b(applicationContext, false);
        com.facebook.internal.a0.c(applicationContext, false);
        Context applicationContext2 = applicationContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext.applicationContext");
        f20036m = applicationContext2;
        com.facebook.appevents.o.f19698b.b(applicationContext);
        Context context = f20036m;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        G(context);
        String str = f20028e;
        if (str == null || str.length() == 0) {
            throw new i("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = f20030g;
        if (str2 == null || str2.length() == 0) {
            throw new i("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (p()) {
            k();
        }
        Context context3 = f20036m;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && l0.f()) {
            Context context4 = f20036m;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context4 = null;
            }
            v2.g.z((Application) context4, f20028e);
        } else {
            t2.r.i();
        }
        v2.j jVarA = v2.j.f105705b.a();
        if (jVarA != null) {
            Context context5 = f20036m;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context5 = null;
            }
            jVarA.i((Application) context5);
        }
        com.facebook.internal.m.h();
        com.facebook.internal.t.i();
        b.a aVar = com.facebook.internal.b.f19851b;
        Context context6 = f20036m;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context2 = context6;
        }
        aVar.a(context2);
        f20035l = new com.facebook.internal.q(new Callable() { // from class: com.facebook.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.M();
            }
        });
        com.facebook.internal.e.a(e.b.Instrument, new e.a() { // from class: com.facebook.l
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                s.N(z10);
            }
        });
        com.facebook.internal.e.a(e.b.AppEvents, new e.a() { // from class: com.facebook.m
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                s.O(z10);
            }
        });
        com.facebook.internal.e.a(e.b.ChromeCustomTabsPrefetching, new e.a() { // from class: com.facebook.n
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                s.P(z10);
            }
        });
        com.facebook.internal.e.a(e.b.IgnoreAppSwitchToLoggedOut, new e.a() { // from class: com.facebook.o
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                s.Q(z10);
            }
        });
        com.facebook.internal.e.a(e.b.BypassAppSwitch, new e.a() { // from class: com.facebook.p
            @Override // com.facebook.internal.e.a
            public final void a(boolean z10) {
                s.R(z10);
            }
        });
        t().execute(new FutureTask(new Callable(bVar) { // from class: com.facebook.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.S(null);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File M() {
        Context context = f20036m;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(boolean z10) {
        if (z10) {
            b3.g.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(boolean z10) {
        if (z10) {
            com.facebook.appevents.i0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(boolean z10) {
        if (z10) {
            f20040q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(boolean z10) {
        if (z10) {
            f20041r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(boolean z10) {
        if (z10) {
            f20042s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void S(b bVar) {
        f.f19786f.e().j();
        f0.f19802d.a().d();
        if (AccessToken.INSTANCE.g()) {
            Profile.Companion bVar2 = Profile.INSTANCE;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.onInitialized();
        }
        o.a aVar = com.facebook.appevents.o.f19698b;
        aVar.e(m(), f20028e);
        l0.n();
        Context applicationContext = m().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        aVar.f(applicationContext).a();
        return null;
    }

    public static final void T(boolean z10) {
        f20033j = z10;
    }

    private final void U() {
        HashSet hashSet = f20026c;
        if (hashSet.contains(d0.GRAPH_API_DEBUG_INFO)) {
            d0 d0Var = d0.GRAPH_API_DEBUG_WARNING;
            if (hashSet.contains(d0Var)) {
                return;
            }
            hashSet.add(d0Var);
        }
    }

    public static final void j(d0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet hashSet = f20026c;
        synchronized (hashSet) {
            hashSet.add(behavior);
            f20024a.U();
            Unit unit = Unit.f93236a;
        }
    }

    public static final void k() {
        f20047x = true;
    }

    public static final boolean l() {
        return l0.d();
    }

    public static final Context m() {
        com.facebook.internal.a0.i();
        Context context = f20036m;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    public static final String n() {
        com.facebook.internal.a0.i();
        String str = f20028e;
        if (str != null) {
            return str;
        }
        throw new i("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String o() {
        com.facebook.internal.a0.i();
        return f20029f;
    }

    public static final boolean p() {
        return l0.e();
    }

    public static final boolean q() {
        return l0.f();
    }

    public static final String r() {
        com.facebook.internal.a0.i();
        String str = f20030g;
        if (str != null) {
            return str;
        }
        throw new i("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return l0.g();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f20038o;
        reentrantLock.lock();
        try {
            if (f20027d == null) {
                f20027d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.f93236a;
            reentrantLock.unlock();
            Executor executor = f20027d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String u() {
        return f20045v;
    }

    public static final String v() {
        String str = f20025b;
        a1 a1Var = a1.f93282a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f20039p}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        com.facebook.internal.z.a0(str, str2);
        return f20039p;
    }

    public static final String w() {
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        return com.facebook.internal.z.C(accessTokenE != null ? accessTokenE.getGraphDomain() : null);
    }

    public static final boolean x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.facebook.internal.a0.i();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long y() {
        com.facebook.internal.a0.i();
        return f20032i.get();
    }

    public static final String z() {
        return "18.0.3";
    }
}
