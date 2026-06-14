package com.ironsource;

import android.content.Context;
import com.ironsource.C4231ad;
import com.ironsource.C4522re;
import com.ironsource.Ib;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4522re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Ie f44831b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private static C4284de f44837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static C4318fe f44838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f44839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f44840k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4522re f44830a = new C4522re();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Lazy f44832c = lf.i.a(a.f44841a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44833d = C4522re.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C4590ve f44834e = new C4590ve();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Ce f44835f = new Ce();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<InterfaceC4385je> f44836g = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.re$a */
    static final class a extends Lambda implements Function0<InterfaceC4412l7> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44841a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4412l7 invoke() {
            return Ib.f41088s.d().k();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.re$b */
    public static final class b implements InterfaceC4385je {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f44842a;

        b(Context context) {
            this.f44842a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(C4318fe error) {
            Intrinsics.checkNotNullParameter(error, "$error");
            C4522re.f44830a.a(error);
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4284de sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C4590ve c4590ve = C4522re.f44834e;
            final Context context = this.f44842a;
            c4590ve.a(new Runnable() { // from class: com.ironsource.yl
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C4522re.b.a(context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Context applicationContext, C4284de sdkConfig) throws JSONException {
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            C4522re c4522re = C4522re.f44830a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            c4522re.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC4385je
        public void a(@NotNull final C4318fe error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C4522re.f44834e.a(new Runnable() { // from class: com.ironsource.zl
                @Override // java.lang.Runnable
                public final void run() {
                    C4522re.b.b(error);
                }
            });
        }
    }

    private C4522re() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4436me serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        C4284de c4284de = new C4284de(serverResponse);
        C4522re c4522re = f44830a;
        c4522re.b(c4284de);
        c4522re.a(c4284de);
    }

    private final InterfaceC4412l7 c() {
        return (InterfaceC4412l7) f44832c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f() {
        f44830a.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "$error");
        f44830a.a(error);
    }

    private final void d() {
        if (Ib.f41088s.d().g().f()) {
            Td.i().a(new C4649z5(A5.EP_CONFIG_RECEIVED, (JSONObject) null));
        }
    }

    public final void e() {
        f44834e.c(new Runnable() { // from class: com.ironsource.ul
            @Override // java.lang.Runnable
            public final void run() {
                C4522re.f();
            }
        });
    }

    private final void a(Context context, U9 u92, Ee ee2) {
        u92.i(ee2.g().h());
        u92.c(ee2.g().d());
        C4645z1 c4645z1B = ee2.c().b();
        Intrinsics.checkNotNull(c4645z1B);
        u92.a(c4645z1B.a());
        u92.d(c4645z1B.c().b());
        u92.b(c4645z1B.k().b());
        u92.a(Boolean.valueOf(IronSourceUtils.c(context)));
        C4645z1 c4645z1B2 = ee2.c().b();
        Intrinsics.checkNotNull(c4645z1B2);
        u92.b(c4645z1B2.f().b());
    }

    public final void b(@NotNull final C4318fe error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f44834e.c(new Runnable() { // from class: com.ironsource.xl
            @Override // java.lang.Runnable
            public final void run() {
                C4522re.c(error);
            }
        });
    }

    private final void b(C4284de c4284de) {
        f44837h = c4284de;
        a(false);
    }

    private final EnumC4556te b() {
        if (f44837h != null) {
            return EnumC4556te.INITIATED;
        }
        if (f44838i != null) {
            return EnumC4556te.INIT_FAILED;
        }
        if (f44839j) {
            return EnumC4556te.INIT_IN_PROGRESS;
        }
        return EnumC4556te.NOT_INIT;
    }

    public final void a(@NotNull final Context context, @NotNull final C4419le initRequest, @NotNull final InterfaceC4385je listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Context applicationContext = context.getApplicationContext();
        f44834e.c(new Runnable() { // from class: com.ironsource.vl
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C4522re.a(listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4385je listener, C4284de sdkConfig) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4385je listener, Context context, C4419le initRequest, Context context2) throws Throwable {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        C4284de c4284de = f44837h;
        if (c4284de != null) {
            f44830a.a(listener, c4284de);
            return;
        }
        f44836g.add(listener);
        if (f44839j) {
            return;
        }
        f44838i = null;
        f44830a.a(true);
        f44840k = new Date().getTime();
        f44835f.a(context, initRequest, f44834e, new b(context2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(InterfaceC4385je listener, C4318fe error) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(error, "$error");
        listener.a(error);
    }

    private final void b(Context context, C4284de c4284de) {
        Context context2;
        G1 g1B;
        Nb nbE;
        G1 g1G;
        T2 t2C;
        G1 g1G2;
        E9 e9D;
        G1 g1I;
        Rd rdF;
        G1 g1M;
        G1 g1B2;
        Ee eeD = c4284de.d();
        C4645z1 c4645z1B = eeD.c().b();
        boolean zL = (c4645z1B == null || (g1B2 = c4645z1B.b()) == null) ? false : g1B2.l();
        S3 s3C = eeD.c();
        boolean zL2 = (s3C == null || (rdF = s3C.f()) == null || (g1M = rdF.m()) == null) ? false : g1M.l();
        S3 s3C2 = eeD.c();
        boolean zL3 = (s3C2 == null || (e9D = s3C2.d()) == null || (g1I = e9D.i()) == null) ? false : g1I.l();
        S3 s3C3 = eeD.c();
        boolean zL4 = (s3C3 == null || (t2C = s3C3.c()) == null || (g1G2 = t2C.g()) == null) ? false : g1G2.l();
        S3 s3C4 = eeD.c();
        boolean zL5 = (s3C4 == null || (nbE = s3C4.e()) == null || (g1G = nbE.g()) == null) ? false : g1G.l();
        if (zL) {
            C4645z1 c4645z1B2 = eeD.c().b();
            if (c4645z1B2 == null || (g1B = c4645z1B2.b()) == null) {
                context2 = context;
            } else {
                context2 = context;
                a(f44830a, Ib.f41088s.d().q(), g1B, context2, eeD, false, 16, null);
            }
        } else {
            context2 = context;
            Ib.f41088s.d().q().a(false);
        }
        if (zL2) {
            S3 s3C5 = eeD.c();
            Rd rdF2 = s3C5 != null ? s3C5.f() : null;
            Intrinsics.checkNotNull(rdF2);
            G1 rewardedVideoConfig = rdF2.m();
            Td tdI = Td.i();
            Intrinsics.checkNotNullExpressionValue(tdI, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, tdI, rewardedVideoConfig, context2, eeD, false, 16, null);
        } else {
            Td.i().a(false);
        }
        if (zL3) {
            S3 s3C6 = eeD.c();
            E9 e9D2 = s3C6 != null ? s3C6.d() : null;
            Intrinsics.checkNotNull(e9D2);
            G1 interstitialConfig = e9D2.i();
            G9 g9I = G9.i();
            Intrinsics.checkNotNullExpressionValue(g9I, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, g9I, interstitialConfig, context2, eeD, false, 16, null);
        } else if (zL4) {
            S3 s3C7 = eeD.c();
            T2 t2C2 = s3C7 != null ? s3C7.c() : null;
            Intrinsics.checkNotNull(t2C2);
            G1 bannerConfig = t2C2.g();
            G9 g9I2 = G9.i();
            Intrinsics.checkNotNullExpressionValue(g9I2, "getInstance()");
            Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, g9I2, bannerConfig, context2, eeD, false, 16, null);
        } else if (zL5) {
            S3 s3C8 = eeD.c();
            Nb nbE2 = s3C8 != null ? s3C8.e() : null;
            Intrinsics.checkNotNull(nbE2);
            G1 g1G3 = nbE2.g();
            G9 g9I3 = G9.i();
            Intrinsics.checkNotNullExpressionValue(g9I3, "getInstance()");
            a(this, g9I3, g1G3, context2, eeD, false, 16, null);
        } else {
            G9.i().a(false);
        }
        S3 s3C9 = eeD.c();
        C4645z1 c4645z1B3 = s3C9 != null ? s3C9.b() : null;
        Intrinsics.checkNotNull(c4645z1B3);
        C4249bd c4249bdI = c4645z1B3.i();
        boolean zA = c4249bdI.a();
        String strB = c4249bdI.b();
        boolean zC = c4249bdI.c();
        int iD = c4249bdI.d();
        int[] iArrE = c4249bdI.e();
        int[] iArrF = c4249bdI.f();
        C4231ad c4231ad = C4231ad.P;
        c4231ad.a(zA);
        if (zA) {
            c4231ad.b(strB, context2);
            c4231ad.b(iArrE, context2);
            c4231ad.c(iArrF, context2);
            c4231ad.b(zC);
            c4231ad.c(iD);
        }
    }

    public final void a(@NotNull final C4436me serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        f44834e.c(new Runnable() { // from class: com.ironsource.tl
            @Override // java.lang.Runnable
            public final void run() {
                C4522re.b(serverResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C4318fe c4318fe) {
        f44838i = c4318fe;
        a(false);
        Iterator<InterfaceC4385je> it = f44836g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4318fe);
        }
        f44836g.clear();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c4318fe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, C4284de c4284de) throws JSONException {
        b(c4284de);
        J1 j1A = c4284de.a();
        X4 x42 = X4.f42026a;
        x42.c(j1A.g());
        Ib.b bVar = Ib.f41088s;
        bVar.a().o().a(j1A.c());
        x42.a(j1A.f());
        x42.a(j1A.j());
        IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(j1A.h());
        c().a(j1A);
        C4590ve c4590ve = f44834e;
        a(context, c4590ve.c(), c4284de.d());
        c4590ve.a(new Date().getTime() - f44840k, c4284de.f());
        Ie ie2 = new Ie();
        f44831b = ie2;
        ie2.a(c());
        IronSourceUtils.e(context, c4284de.d().toString());
        bVar.d().q().c(true);
        G9.i().c(true);
        Td.i().c(true);
        C4231ad.P.c(true);
        b(context, c4284de);
        IronSourceLoggerManager.getLogger(0).setDebugLevel(c4284de.e().b());
        C1 c1B = c4284de.b();
        if (c1B.f()) {
            c4590ve.a(c1B);
        }
        a(c4284de);
        new C4231ad.a().a();
        d();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + Ge.a());
        ironLog.verbose("parameters for init POST data: " + Ge.b());
    }

    private final void a(C4284de c4284de) {
        Iterator<InterfaceC4385je> it = f44836g.iterator();
        while (it.hasNext()) {
            a(it.next(), c4284de);
        }
        f44836g.clear();
    }

    private final void a(boolean z10) {
        f44839j = z10;
        f44834e.a(b());
    }

    private final void a(final InterfaceC4385je interfaceC4385je, final C4284de c4284de) {
        f44834e.e(new Runnable() { // from class: com.ironsource.sl
            @Override // java.lang.Runnable
            public final void run() {
                C4522re.b(interfaceC4385je, c4284de);
            }
        });
    }

    private final void a(final InterfaceC4385je interfaceC4385je, final C4318fe c4318fe) {
        f44834e.e(new Runnable() { // from class: com.ironsource.wl
            @Override // java.lang.Runnable
            public final void run() {
                C4522re.b(interfaceC4385je, c4318fe);
            }
        });
    }

    static /* synthetic */ void a(C4522re c4522re, AbstractC4511r3 abstractC4511r3, G1 g12, Context context, Ee ee2, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        c4522re.a(abstractC4511r3, g12, context, ee2, z10);
    }

    private final void a(AbstractC4511r3 abstractC4511r3, G1 g12, Context context, Ee ee2, boolean z10) {
        abstractC4511r3.a(z10);
        abstractC4511r3.a(g12.c(), context);
        abstractC4511r3.b(g12.d(), context);
        abstractC4511r3.a(g12.f());
        abstractC4511r3.d(g12.e());
        abstractC4511r3.b(g12.a());
        abstractC4511r3.b(g12.i(), context);
        abstractC4511r3.c(g12.h(), context);
        abstractC4511r3.a(g12.j(), context);
        abstractC4511r3.d(g12.g(), context);
        C4645z1 c4645z1B = ee2.c().b();
        Intrinsics.checkNotNull(c4645z1B);
        abstractC4511r3.a(c4645z1B.j());
        abstractC4511r3.b(g12.k());
        abstractC4511r3.c(g12.b());
    }
}
