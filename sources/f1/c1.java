package f1;

import android.view.ViewGroup;
import f1.bf;
import f1.z2;
import g1.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c1 implements y6, d1, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f69490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5 f69491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f69492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f69493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s1 f69494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wc f69495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f69496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f69497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ag f69498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c1.a f69499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d1.a f69500l;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69501a;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.f72130r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.f72135w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.f72134v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f69501a = iArr;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function2 {
        public b(Object obj) {
            super(2, obj, c1.class, "onAdFailToLoad", "onAdFailToLoad(Ljava/lang/String;Lcom/chartboost/sdk/internal/Model/CBError$Type;)V", 0);
        }

        public final void a(String str, a.d p12) {
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((c1) this.receiver).a(str, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (a.d) obj2);
            return Unit.f93236a;
        }
    }

    public c1(m0 adUnitLoader, r5 adUnitRenderer, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, s1 adApiCallbackSender, wc session, y base64Wrapper, ag eventTracker, Function0 androidVersion) {
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f69490b = adUnitLoader;
        this.f69491c = adUnitRenderer;
        this.f69492d = sdkConfig;
        this.f69493e = backgroundExecutorService;
        this.f69494f = adApiCallbackSender;
        this.f69495g = session;
        this.f69496h = base64Wrapper;
        this.f69497i = androidVersion;
        this.f69498j = eventTracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(c1.a ad2, c1 this$0, String location, String str) {
        Intrinsics.checkNotNullParameter(ad2, "$ad");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(location, "$location");
        if (!(ad2 instanceof c1.b)) {
            m0.j(this$0.f69490b, location, this$0, str, null, 8, null);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) ad2;
        c1.b bVar = (c1.b) ad2;
        this$0.f69490b.x(location, this$0, str, new f1.a(viewGroup, bVar.getBannerWidth(), bVar.getBannerHeight()));
    }

    public static final void j(c1 this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i6 i6VarC = this$0.f69490b.c();
        if (i6VarC != null) {
            this$0.f69491c.N(i6VarC, this$0);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.j("Missing app request on render", null, 2, null);
        }
    }

    @Override // f1.d1
    public void a(String str, a.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        o(z2.a.f71695f, error.getName(), str);
        this.f69494f.e(str, v9.a(error), this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void b(String str) {
        this.f69494f.f(str, null, this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void c(String str) {
        o(z2.f.f71729g, "", str);
        this.f69494f.h(str, this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void d(String str) {
        this.f69494f.i(str, this.f69499k, this.f69500l);
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69498j.e(y0Var);
    }

    public final bf f(c1.a aVar) {
        if (aVar instanceof c1.c) {
            return bf.b.f69484g;
        }
        if (aVar instanceof c1.d) {
            return bf.c.f69485g;
        }
        if (aVar instanceof c1.b) {
            return bf.a.f69483g;
        }
        throw new lf.m();
    }

    public final void g() {
        if (s()) {
            this.f69490b.z();
        }
    }

    public final void h(c1.a ad2, d1.a callback) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f69499k = ad2;
        this.f69500l = callback;
        this.f69493e.execute(new Runnable() { // from class: f1.b1
            @Override // java.lang.Runnable
            public final void run() {
                c1.j(this.f69409b);
            }
        });
    }

    public final void k(z2 eventName, String message, bf adType, String location) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        e((y0) new l1(eventName, message, adType.b(), location, this.f69491c.F(), null, 32, null));
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f69498j.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f69498j.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f69498j.n(uVar);
    }

    public final void o(z2 z2Var, String str, String str2) {
        String strB;
        String location;
        bf bfVarF;
        c1.a aVar = this.f69499k;
        if (aVar == null || (bfVarF = f(aVar)) == null || (strB = bfVarF.b()) == null) {
            strB = "Unknown";
        }
        String str3 = strB;
        c1.a aVar2 = this.f69499k;
        if (aVar2 == null || (location = aVar2.getLocation()) == null) {
            location = "";
        }
        String str4 = location;
        e(z2Var == z2.b.f71706e ? new w3(z2Var, str, str3, str4, this.f69491c.F(), v(str2)) : new l1(z2Var, str, str3, str4, this.f69491c.F(), v(str2)));
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69498j.p(y0Var);
    }

    public final void q(a.b bVar, String str) {
        z2.i iVar;
        switch (a.f69501a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                iVar = z2.i.f71750f;
                break;
            case 4:
            case 5:
            case 6:
                iVar = z2.i.f71754j;
                break;
            default:
                iVar = z2.i.f71749e;
                break;
        }
        o(iVar, bVar.name(), str);
    }

    public final void r(final String location, final c1.a ad2, d1.a callback, String str) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f69499k = ad2;
        this.f69500l = callback;
        Object objA = b4.f69429a.a(str, this.f69496h, new b(this));
        if (Result.g(objA) == null) {
            final String str2 = (String) objA;
            this.f69493e.execute(new Runnable() { // from class: f1.a1
                @Override // java.lang.Runnable
                public final void run() {
                    c1.i(ad2, this, location, str2);
                }
            });
        }
    }

    public final boolean s() {
        i6 i6VarC = this.f69490b.c();
        return (i6VarC != null ? i6VarC.a() : null) != null;
    }

    public final void t() {
        bf bfVarF;
        c1.a aVar = this.f69499k;
        if (aVar == null || (bfVarF = f(aVar)) == null) {
            return;
        }
        this.f69495g.b(bfVarF);
        eg.m("Current session impression count: " + this.f69495g.d(bfVarF) + " in session: " + this.f69495g.c(), null, 2, null);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f69498j.u(y0Var);
    }

    public final xc v(String str) {
        if (str == null) {
            str = "";
        }
        return new xc(null, null, str, null, null, null, null, null, 251, null);
    }

    public final boolean w(String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (((Number) this.f69497i.invoke()).intValue() < 21) {
            return true;
        }
        ga gaVar = (ga) this.f69492d.get();
        if (gaVar == null || !gaVar.e()) {
            return location.length() == 0;
        }
        eg.j("Chartboost Integration Warning: your account has been disabled for this session. This app has no active publishing campaigns, please create a publishing campaign in the Chartboost dashboard and wait at least 30 minutes to re-enable. If you need assistance, please visit http://chartboo.st/publishing .", null, 2, null);
        return true;
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f69498j.mo4436e(event);
    }

    @Override // f1.y6
    public void e(String str) {
        o(z2.i.f71748d, "", str);
        t();
        this.f69494f.g(str, null, this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void b(String str, String str2, a.EnumC0885a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str3 = "Click error: " + error.name() + " url: " + str2;
        o(z2.b.f71706e, str3, str);
        this.f69494f.f(str, v9.b(error, str3), this.f69499k, this.f69500l);
    }

    @Override // f1.d1
    public void d(String str, z2 trackingEventName) {
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        o(trackingEventName, "", str);
        this.f69494f.e(str, null, this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void c(String str, a.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        q(error, str);
        this.f69494f.g(str, v9.c(error), this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void a(String str) {
        this.f69494f.c(str, this.f69499k, this.f69500l);
    }

    @Override // f1.y6
    public void a(String str, int i10) {
        this.f69494f.d(str, this.f69499k, this.f69500l, i10);
    }
}
