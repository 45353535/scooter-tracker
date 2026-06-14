package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.appevents.o;
import com.facebook.appevents.r;
import com.facebook.internal.e;
import com.facebook.internal.n;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f19718c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f19719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f19720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static o.b f19721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f19722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f19723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f19724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f19725j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.appevents.a f19727b;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.appevents.r$a$a, reason: collision with other inner class name */
        public static final class C0331a implements n.a {
            C0331a() {
            }

            @Override // com.facebook.internal.n.a
            public void a(String str) {
                r.f19718c.u(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(Context context, r logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            for (int i11 = 0; i11 < 11; i11++) {
                String str = strArr[i11];
                String str2 = strArr2[i11];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i10 |= 1 << i11;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i10) {
                sharedPreferences.edit().putInt("kitsBitmask", i10).apply();
                logger.p("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p() {
            synchronized (r.e()) {
                if (r.b() != null) {
                    return;
                }
                r.i(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.f93236a;
                Runnable runnable = new Runnable() { // from class: com.facebook.appevents.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.q();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = r.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorB.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q() {
            HashSet hashSet = new HashSet();
            Iterator it = m.p().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.facebook.appevents.a) it.next()).g());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                com.facebook.internal.m.u((String) it2.next(), true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(d dVar, com.facebook.appevents.a aVar) {
            m.g(aVar, dVar);
            if (com.facebook.internal.e.g(e.b.OnDevicePostInstallEventProcessing) && x2.c.d()) {
                x2.c.e(aVar.g(), dVar);
            }
            if (com.facebook.internal.e.g(e.b.GPSARATriggers)) {
                q2.b.f98680a.i(aVar.g(), dVar);
            }
            if (com.facebook.internal.e.g(e.b.GPSPACAProcessing)) {
                r2.e.f99213a.d(aVar.g(), dVar);
            }
            if (dVar.g() || r.f()) {
                return;
            }
            if (Intrinsics.areEqual(dVar.k(), "fb_mobile_activate_app")) {
                r.g(true);
            } else {
                com.facebook.internal.r.f19964e.b(com.facebook.d0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s(String str) {
            com.facebook.internal.r.f19964e.b(com.facebook.d0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void f(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!com.facebook.s.D()) {
                throw new com.facebook.i("The Facebook sdk must be initialized before calling activateApp");
            }
            c.d();
            t0.e();
            if (str == null) {
                str = com.facebook.s.n();
            }
            com.facebook.s.I(application, str);
            v2.g.z(application, str);
            if (com.facebook.internal.e.g(e.b.GPSPACAProcessing)) {
                r2.e.f99213a.e(str, "fb_mobile_app_install");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.Pair g(android.os.Bundle r14, com.facebook.appevents.n0 r15, boolean r16) {
            /*
                r13 = this;
                boolean r0 = v2.k.g()
                java.lang.String r1 = "0"
                java.lang.String r2 = "1"
                if (r0 == 0) goto Lc
                r6 = r2
                goto Ld
            Lc:
                r6 = r1
            Ld:
                com.facebook.appevents.n0$a r7 = com.facebook.appevents.n0.f19693b
                com.facebook.appevents.o0 r8 = com.facebook.appevents.o0.IAPParameters
                java.lang.String r5 = "is_implicit_purchase_logging_enabled"
                r3 = r7
                r4 = r8
                r7 = r14
                r8 = r15
                kotlin.Pair r0 = r3.b(r4, r5, r6, r7, r8)
                r8 = r4
                java.lang.String r4 = "fb_iap_product_id"
                java.lang.Object r4 = r3.c(r8, r4, r14, r15)
                boolean r5 = r4 instanceof java.lang.String
                r6 = 0
                if (r5 == 0) goto L2b
                java.lang.String r4 = (java.lang.String) r4
                r10 = r4
                goto L2c
            L2b:
                r10 = r6
            L2c:
                if (r16 != 0) goto L5a
                if (r14 == 0) goto L36
                java.lang.String r4 = "fb_content_id"
                java.lang.String r6 = r14.getString(r4)
            L36:
                if (r6 != 0) goto L5a
                if (r10 == 0) goto L5a
                java.lang.String r9 = "fb_content_id"
                r11 = r14
                r12 = r15
                r7 = r3
                kotlin.Pair r14 = r7.b(r8, r9, r10, r11, r12)
                java.lang.Object r0 = r14.getFirst()
                r11 = r0
                android.os.Bundle r11 = (android.os.Bundle) r11
                java.lang.Object r14 = r14.getSecond()
                r12 = r14
                com.facebook.appevents.n0 r12 = (com.facebook.appevents.n0) r12
                java.lang.String r9 = "android_dynamic_ads_content_id"
                java.lang.String r10 = "client_manual"
                kotlin.Pair r0 = r7.b(r8, r9, r10, r11, r12)
                goto L5b
            L5a:
                r7 = r3
            L5b:
                java.lang.Object r14 = r0.getFirst()
                r11 = r14
                android.os.Bundle r11 = (android.os.Bundle) r11
                java.lang.Object r14 = r0.getSecond()
                r12 = r14
                com.facebook.appevents.n0 r12 = (com.facebook.appevents.n0) r12
                boolean r14 = com.facebook.l0.f()
                if (r14 == 0) goto L71
                r10 = r2
                goto L72
            L71:
                r10 = r1
            L72:
                java.lang.String r9 = "is_autolog_app_events_enabled"
                kotlin.Pair r14 = r7.b(r8, r9, r10, r11, r12)
                java.lang.Object r0 = r14.getFirst()
                android.os.Bundle r0 = (android.os.Bundle) r0
                java.lang.Object r14 = r14.getSecond()
                com.facebook.appevents.n0 r14 = (com.facebook.appevents.n0) r14
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r0, r14)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.r.a.g(android.os.Bundle, com.facebook.appevents.n0, boolean):kotlin.Pair");
        }

        public final void h() {
            if (k() != o.b.EXPLICIT_ONLY) {
                m.l(j0.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor i() {
            if (r.b() == null) {
                p();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = r.b();
            if (scheduledThreadPoolExecutorB != null) {
                return scheduledThreadPoolExecutorB;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final String j(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (r.a() == null) {
                synchronized (r.e()) {
                    try {
                        if (r.a() == null) {
                            r.h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (r.a() == null) {
                                r.h("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", r.a()).apply();
                            }
                        }
                        Unit unit = Unit.f93236a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String strA = r.a();
            if (strA != null) {
                return strA;
            }
            throw new IllegalStateException("Required value was null.");
        }

        public final o.b k() {
            o.b bVarC;
            synchronized (r.e()) {
                bVarC = r.c();
            }
            return bVarC;
        }

        public final String l() {
            com.facebook.internal.n.d(new C0331a());
            return com.facebook.s.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
        }

        public final String m() {
            String strD;
            synchronized (r.e()) {
                strD = r.d();
            }
            return strD;
        }

        public final void n(final Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (com.facebook.s.q()) {
                final r rVar = new r(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = r.b();
                if (scheduledThreadPoolExecutorB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorB.execute(new Runnable() { // from class: com.facebook.appevents.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.o(context, rVar);
                    }
                });
            }
        }

        public final void t() {
            m.s();
        }

        public final void u(String str) {
            SharedPreferences sharedPreferences = com.facebook.s.m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString(Constants.INSTALL_REFERRER, str).apply();
            }
        }

        private a() {
        }
    }

    static {
        String canonicalName = r.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f19719d = canonicalName;
        f19721f = o.b.AUTO;
        f19722g = new Object();
    }

    public r(String activityName, String str, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        com.facebook.internal.a0.i();
        this.f19726a = activityName;
        accessToken = accessToken == null ? AccessToken.INSTANCE.e() : accessToken;
        if (accessToken == null || accessToken.n() || !(str == null || Intrinsics.areEqual(str, accessToken.getApplicationId()))) {
            str = str == null ? com.facebook.internal.z.H(com.facebook.s.m()) : str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.f19727b = new com.facebook.appevents.a(null, str);
        } else {
            this.f19727b = new com.facebook.appevents.a(accessToken);
        }
        f19718c.p();
    }

    public static final /* synthetic */ String a() {
        if (e3.a.d(r.class)) {
            return null;
        }
        try {
            return f19723h;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (e3.a.d(r.class)) {
            return null;
        }
        try {
            return f19720e;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ o.b c() {
        if (e3.a.d(r.class)) {
            return null;
        }
        try {
            return f19721f;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (e3.a.d(r.class)) {
            return null;
        }
        try {
            return f19725j;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (e3.a.d(r.class)) {
            return null;
        }
        try {
            return f19722g;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (e3.a.d(r.class)) {
            return false;
        }
        try {
            return f19724i;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            f19724i = z10;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            f19723h = str;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (e3.a.d(r.class)) {
            return;
        }
        try {
            f19720e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public static /* synthetic */ void n(r rVar, String str, Double d10, Bundle bundle, boolean z10, UUID uuid, n0 n0Var, int i10, Object obj) {
        if (e3.a.d(r.class)) {
            return;
        }
        if ((i10 & 32) != 0) {
            n0Var = null;
        }
        try {
            rVar.m(str, d10, bundle, z10, uuid, n0Var);
        } catch (Throwable th2) {
            e3.a.b(th2, r.class);
        }
    }

    public final void j() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            m.l(j0.EXPLICIT);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void k(String str, double d10, Bundle bundle) {
        if (e3.a.d(this)) {
            return;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            n(this, str, Double.valueOf(d10), bundle, false, v2.g.n(), null, 32, null);
        } catch (Throwable th3) {
            th = th3;
            e3.a.b(th, this);
        }
    }

    public final void l(String str, Bundle bundle) {
        if (e3.a.d(this)) {
            return;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            n(this, str, null, bundle, false, v2.g.n(), null, 32, null);
        } catch (Throwable th3) {
            th = th3;
            e3.a.b(th, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r17, java.lang.Double r18, android.os.Bundle r19, boolean r20, java.util.UUID r21, com.facebook.appevents.n0 r22) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.r.m(java.lang.String, java.lang.Double, android.os.Bundle, boolean, java.util.UUID, com.facebook.appevents.n0):void");
    }

    public final void o(String str, String str2) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void p(String str, Double d10, Bundle bundle) {
        if (e3.a.d(this)) {
            return;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            n(this, str, d10, bundle, true, v2.g.n(), null, 32, null);
        } catch (Throwable th3) {
            th = th3;
            e3.a.b(th, this);
        }
    }

    public final void q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, n0 n0Var) {
        Throwable th2;
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                com.facebook.internal.z.a0(f19719d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (Throwable th3) {
                    th2 = th3;
                    e3.a.b(th2, this);
                }
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, v2.g.n(), n0Var);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                e3.a.b(th2, this);
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10, n0 n0Var) {
        Throwable th2;
        if (e3.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f19718c.s("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f19718c.s("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            try {
                bundle2.putString("fb_currency", currency.getCurrencyCode());
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z10, v2.g.n(), n0Var);
                f19718c.h();
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                e3.a.b(th2, this);
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public final void s(BigDecimal bigDecimal, Currency currency, Bundle bundle, n0 n0Var) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            r(bigDecimal, currency, bundle, true, n0Var);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public r(Context context, String str, AccessToken accessToken) {
        this(com.facebook.internal.z.s(context), str, accessToken);
    }
}
