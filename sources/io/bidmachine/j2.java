package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.AdRequest;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.g4;
import io.bidmachine.iab.mraid.r;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.protobuf.AdNetwork;
import io.bidmachine.protobuf.InitResponse;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
final class j2 {
    private static final AtomicBoolean D = new AtomicBoolean(false);
    private static volatile j2 E;
    long A;
    g4 B;
    private final g4.d C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f80454a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f80455b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f80456c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.e f80457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nd.f f80458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d6 f80459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PriceFloorParams f80460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppParams f80461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x3 f80462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w5 f80463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z3 f80464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f80465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f80466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a1 f80467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w1 f80468o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BidMachineAssetCacheInitializer f80469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InstallInfoProvider f80470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Context f80471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f80472s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TargetingParams f80473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CustomParams f80474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Publisher f80475v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f80476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f80477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f80478y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    String f80479z;

    class a extends de.a {
        a(String str) {
            super(str);
        }

        @Override // de.a
        protected String k(Object obj, String str, ce.b bVar, Throwable th2) {
            String strK = super.k(obj, str, bVar, th2);
            if (!j2.e().E()) {
                return strK;
            }
            return "(TEST MODE) " + strK;
        }
    }

    private class b implements g4.d {
        private b() {
        }

        @Override // io.bidmachine.g4.d
        public void a(g4.b bVar) {
            InitResponse initResponseA = bVar.a();
            j2.this.x(SessionManager.get().getSessionId(), initResponseA, bVar.b());
            if (j2.this.f80471r == null) {
                return;
            }
            ExtraParamsManager.get().setExtras(j2.this.f80471r, initResponseA.getExtras());
            j2 j2Var = j2.this;
            j2Var.z(j2Var.f80471r, initResponseA.getAdNetworksList());
        }

        @Override // io.bidmachine.g4.d
        public void b(g4.b bVar) {
            j2 j2Var = j2.this;
            Context context = j2Var.f80471r;
            if (context == null) {
                return;
            }
            j2Var.z(context, bVar.a().getAdNetworksList());
        }

        @Override // io.bidmachine.g4.d
        public void c(g4.b bVar) {
            j2.this.x(SessionManager.get().getSessionId(), bVar.a(), bVar.b());
        }

        /* synthetic */ b(j2 j2Var, a aVar) {
            this();
        }
    }

    static class c implements jd.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f80481a;

        public c(Context context) {
            this.f80481a = context.getApplicationContext();
        }

        @Override // jd.k
        public String getUserAgent() {
            return UserAgentManager.getUserAgent(this.f80481a);
        }
    }

    static {
        io.bidmachine.core.a.i(new a("BidMachineLog"));
    }

    j2() {
        nd.e eVar = new nd.e();
        this.f80457d = eVar;
        this.f80458e = new k2(eVar);
        this.f80459f = new d6();
        this.f80460g = new PriceFloorParams().m7757addPriceFloor(UUID.randomUUID().toString(), 0.01d);
        this.f80461h = new AppParams(new b1());
        this.f80462i = new x3(new y2());
        this.f80463j = new w5();
        this.f80464k = new a4();
        this.f80465l = new EnumMap(TrackEventType.class);
        this.f80466m = new CopyOnWriteArrayList();
        this.f80467n = new a1();
        this.f80468o = new w1();
        this.f80469p = new BidMachineAssetCacheInitializer();
        this.f80470q = new InstallInfoProvider();
        this.f80473t = new TargetingParams();
        this.f80474u = new CustomParams();
        this.f80477x = 0;
        this.f80478y = 0;
        this.A = 0L;
        this.C = new b(this, null);
    }

    static void I(final Context context) {
        if (D.compareAndSet(false, true)) {
            io.bidmachine.core.h.f0(new ae.l() { // from class: io.bidmachine.e2
                @Override // ae.l
                public final void run() {
                    n1.b(context);
                }
            });
            io.bidmachine.core.h.f0(new ae.l() { // from class: io.bidmachine.f2
                @Override // ae.l
                public final void run() {
                    w1.b(context);
                }
            });
        }
    }

    private static void K(final InitializationCallback initializationCallback) {
        if (initializationCallback == null) {
            return;
        }
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.i2
            @Override // java.lang.Runnable
            public final void run() {
                initializationCallback.onInitialized();
            }
        });
    }

    public static /* synthetic */ void b(j2 j2Var, String str, InitResponse initResponse, String str2, Context context) {
        j2Var.f80468o.a(context, str, initResponse, str2);
        j2Var.f80469p.configure(context, initResponse);
    }

    public static /* synthetic */ void c(j2 j2Var, Context context) {
        j2Var.getClass();
        try {
            Debugger.setup(context);
            j2Var.f80464k.initialize(context);
            j2Var.f80467n.d(context);
            j2Var.B.f();
            j2Var.H(context);
            j2Var.f80470q.initialize(context);
            j2Var.A(context, null);
            j2Var.F();
            j2Var.B.e();
            h9.c.a();
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    static j2 e() {
        j2 j2Var;
        j2 j2Var2 = E;
        if (j2Var2 != null) {
            return j2Var2;
        }
        synchronized (j2.class) {
            try {
                j2Var = E;
                if (j2Var == null) {
                    j2Var = new j2();
                    E = j2Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j2Var;
    }

    void A(Context context, NetworkRegistry.c cVar) {
        NetworkRegistry.registerCoreNetworks();
        NetworkRegistry.initializeNetworksAsync(context, cVar);
    }

    boolean B() {
        return D() || C();
    }

    boolean C() {
        return this.f80456c.get();
    }

    boolean D() {
        return this.f80455b.get();
    }

    boolean E() {
        return this.f80476w;
    }

    void F() {
        io.bidmachine.core.a.d("Notify initialization finished");
        this.f80456c.set(true);
        this.f80455b.set(false);
        Iterator it = this.f80454a.iterator();
        while (it.hasNext()) {
            K((InitializationCallback) it.next());
        }
        this.f80454a.clear();
    }

    String G(Context context) {
        if (!this.f80459f.i()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        if (!TextUtils.isEmpty(this.f80479z)) {
            return this.f80479z;
        }
        String strB = n2.B(context);
        this.f80479z = strB;
        return strB;
    }

    long H(Context context) {
        long j10 = this.A;
        if (j10 != 0) {
            return j10;
        }
        long jC = n2.C(context);
        this.A = jC;
        return jC;
    }

    void J(AdRequest.AdRequestListener adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.f80466m.add(adRequestListener);
    }

    void L(Publisher publisher) {
        this.f80475v = publisher;
    }

    void M(TargetingParams targetingParams) {
        if (targetingParams == null) {
            targetingParams = new TargetingParams();
        }
        this.f80473t = targetingParams;
    }

    void N(boolean z10) {
        this.f80476w = z10;
    }

    void O(AdRequest.AdRequestListener adRequestListener) {
        if (adRequestListener == null) {
            return;
        }
        this.f80466m.remove(adRequestListener);
    }

    List f() {
        return this.f80466m;
    }

    Context g() {
        return this.f80471r;
    }

    AppParams h() {
        return this.f80461h;
    }

    x3 i() {
        return this.f80462i;
    }

    String j() {
        return this.f80467n.c();
    }

    z3 k() {
        return this.f80464k;
    }

    InstallInfoProvider l() {
        return this.f80470q;
    }

    int m() {
        return this.f80478y;
    }

    PriceFloorParams n() {
        return this.f80460g;
    }

    Publisher o() {
        return this.f80475v;
    }

    int p() {
        return this.f80477x;
    }

    long q(Context context) {
        return n2.s(context);
    }

    String r() {
        return this.f80472s;
    }

    public w5 s() {
        return this.f80463j;
    }

    nd.f t() {
        return this.f80458e;
    }

    TargetingParams u() {
        return this.f80473t;
    }

    List v(TrackEventType trackEventType) {
        return (List) this.f80465l.get(trackEventType);
    }

    d6 w() {
        return this.f80459f;
    }

    void x(final String str, final InitResponse initResponse, final String str2) {
        UrlProvider.setAuctionUrlFromInit(initResponse.getEndpoint());
        this.f80465l.clear();
        ae.f.q(this.f80465l, initResponse.getEventList());
        this.f80457d.setDefaultEventConfiguration(initResponse.getEventConfiguration());
        SessionManager.get().setSessionResetAfter(initResponse.getSessionResetAfter());
        this.f80477x = initResponse.getAdRequestTmax();
        this.f80478y = initResponse.getAdNetworksLoadingTimeout();
        l2.b(initResponse.getShowWithoutInternet());
        u2.t(initResponse.getTokenConfigurationsList());
        Map<String, AdCachePlacementControl> adCachePlacementControlMap = initResponse.getAdCachePlacementControlMap();
        if (adCachePlacementControlMap != null) {
            w0.m(adCachePlacementControlMap);
            AdCachePlacementControl adCachePlacementControl = adCachePlacementControlMap.get(AdsType.Interstitial.getName());
            int maxCacheSize = adCachePlacementControl != null ? adCachePlacementControl.getMaxCacheSize() : 0;
            AdCachePlacementControl adCachePlacementControl2 = adCachePlacementControlMap.get(AdsType.Rewarded.getName());
            if (adCachePlacementControl2 != null) {
                maxCacheSize += adCachePlacementControl2.getMaxCacheSize();
            }
            if (maxCacheSize > 5) {
                c9.g.Y(maxCacheSize);
            }
        }
        r.f80263e = ae.g.a(initResponse.getExtras().getInternal(), "mraid_js");
        io.bidmachine.core.h.F(this.f80471r, new Executable() { // from class: io.bidmachine.h2
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                j2.b(this.f80118a, str, initResponse, str2, (Context) obj);
            }
        });
    }

    void y(Context context, String str, InitializationCallback initializationCallback) {
        I(context);
        if (C()) {
            K(initializationCallback);
            return;
        }
        if (context == null) {
            io.bidmachine.core.a.d("Initialization fail: Context is not provided");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            io.bidmachine.core.a.d("Initialization fail: Source id is not provided");
            return;
        }
        if (initializationCallback != null) {
            this.f80454a.add(initializationCallback);
        }
        if (this.f80455b.compareAndSet(false, true)) {
            final Context applicationContext = context.getApplicationContext();
            SessionManager sessionManager = SessionManager.get();
            sessionManager.attachContext(applicationContext);
            this.f80471r = applicationContext;
            this.f80472s = str;
            sessionManager.resume();
            ae.b.e(applicationContext);
            UserAgentManager.initialize(context);
            ec.a.f(new c(applicationContext));
            this.B = new g4(applicationContext, str, this.C);
            io.bidmachine.core.h.S(new Runnable() { // from class: io.bidmachine.g2
                @Override // java.lang.Runnable
                public final void run() {
                    j2.c(this.f80098b, applicationContext);
                }
            });
        }
    }

    void z(Context context, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NetworkRegistry.registerInitNetwork(context, (AdNetwork) it.next());
        }
    }
}
