package com.ironsource;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.AbstractC4478p3;
import com.ironsource.C4647z3;
import com.ironsource.D0;
import com.ironsource.M7;
import com.ironsource.M8;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4425m3<Smash extends AbstractC4478p3<?>, Listener extends AdapterAdListener> implements Q0, R1, C0, Db, InterfaceC4656zc, InterfaceC4457o, rg, InterfaceC4613x3, InterfaceC4435md {
    private AdInfo A;
    private C4432ma B;
    final M8 C;
    final M8.a D;
    protected final M7 E;
    private final M7.a F;
    private boolean G;
    private C4642yf H;
    private AtomicBoolean I;

    @Nullable
    private S9 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected qg<Smash> f43642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ConcurrentHashMap<String, h.a> f43643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.ironsource.mediationsdk.e f43644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.ironsource.mediationsdk.h f43645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f43646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f43647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected JSONObject f43648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected C4424m2 f43649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected C4283dd f43650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f43651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NetworkStateReceiver f43652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Ke f43653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected C4360i5 f43654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected C4360i5 f43655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected U f43656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected f f43657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected P0 f43658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected O5 f43659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected D0 f43660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected K0 f43661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected r f43662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected C4246ba f43663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected UUID f43664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final Object f43665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f43666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f43667z;

    /* JADX INFO: renamed from: com.ironsource.m3$a */
    class a extends AbstractRunnableC4232ae {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4425m3.this.B();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f43669a;

        b(NetworkSettings networkSettings) {
            this.f43669a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4425m3.this.c(this.f43669a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$c */
    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4425m3.this.D();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4425m3.this.f43648g = new JSONObject();
            AbstractC4425m3.this.f43660s.f40514h.a((Double) null);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            AbstractC4425m3.this.b(map, arrayList, sb2, arrayList2);
            AbstractC4425m3.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$e */
    class e implements C4647z3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f43673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f43674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f43675c;

        e(Map map, StringBuilder sb2, List list) {
            this.f43673a = map;
            this.f43674b = sb2;
            this.f43675c = list;
        }

        @Override // com.ironsource.C4647z3.b
        public void a(@NotNull List<A3> list, long j10, @NotNull List<String> list2) {
            AbstractC4425m3.this.f43660s.f40513g.a(j10);
            for (A3 a32 : list) {
                NetworkSettings networkSettingsA = AbstractC4425m3.this.f43656o.a(a32.c());
                Map<String, Object> mapB = AbstractC4425m3.this.b(networkSettingsA, com.ironsource.mediationsdk.c.b().b(networkSettingsA, AbstractC4425m3.this.f43656o.b(), AbstractC4425m3.this.k()));
                if (a32.a() != null) {
                    this.f43673a.put(a32.c(), a32.a());
                    StringBuilder sb2 = this.f43674b;
                    sb2.append(a32.d());
                    sb2.append(a32.c());
                    sb2.append(StringUtils.COMMA);
                    AbstractC4425m3.this.f43660s.f40513g.a(mapB, a32.e());
                } else {
                    AbstractC4425m3.this.f43660s.f40513g.a(mapB, a32.e(), a32.b());
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                NetworkSettings networkSettingsA2 = AbstractC4425m3.this.f43656o.a(it.next());
                AbstractC4425m3.this.f43660s.f40513g.b(AbstractC4425m3.this.b(networkSettingsA2, com.ironsource.mediationsdk.c.b().b(networkSettingsA2, AbstractC4425m3.this.f43656o.b(), AbstractC4425m3.this.k())), j10);
            }
            AbstractC4425m3.this.a((Map<String, Object>) this.f43673a, (List<String>) this.f43675c, this.f43674b.toString());
        }

        @Override // com.ironsource.C4647z3.b
        public void onFailure(String str) {
            AbstractC4425m3.this.f43660s.f40513g.a(str);
            AbstractC4425m3.this.a((Map<String, Object>) this.f43673a, (List<String>) this.f43675c, this.f43674b.toString());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$f */
    protected enum f {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public AbstractC4425m3(U u10, C4432ma c4432ma, C4246ba c4246ba) {
        this(Ib.U(), Ib.O(), u10, c4432ma, c4246ba);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        f fVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        synchronized (this.f43665x) {
            try {
                if (this.f43656o.h().e() && this.f43653l.a()) {
                    ironLog.verbose(b("all smashes are capped"));
                    a(C4644z0.a(this.f43656o.b()), "all smashes are capped", false);
                    return;
                }
                if (!t() && this.f43657p == f.SHOWING) {
                    IronLog.API.error(b("load cannot be invoked while showing an ad"));
                    a(new IronSourceError(C4644z0.d(this.f43656o.b()), "load cannot be invoked while showing an ad"));
                    return;
                }
                if (this.f43656o.h().a() != N0.a.AUTOMATIC_LOAD_WHILE_SHOW && this.f43656o.h().a() != N0.a.MANUAL_WITH_LOAD_ON_SHOW && (((fVar = this.f43657p) != f.READY_TO_LOAD && fVar != f.READY_TO_SHOW) || com.ironsource.mediationsdk.n.a().b(this.f43656o.b()))) {
                    IronLog.API.error(b("load is already in progress"));
                    return;
                }
                this.f43648g = new JSONObject();
                F();
                if (v()) {
                    this.f43660s.f40512f.a();
                } else {
                    this.f43660s.f40512f.a(q());
                }
                this.f43655n = new C4360i5();
                if (this.f43656o.q()) {
                    if (!this.f43643b.isEmpty()) {
                        this.f43645d.a(this.f43643b);
                        this.f43643b.clear();
                    }
                    K();
                } else {
                    a(f.LOADING);
                }
                if (this.f43656o.q()) {
                    return;
                }
                ironLog.verbose(b("auction disabled"));
                L();
                C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void C() {
        wg<Smash> wgVarE = E();
        if (wgVarE.c()) {
            a(509, "Mediation No fill", false);
        }
        Iterator<Smash> it = wgVarE.a().iterator();
        while (it.hasNext()) {
            it.next().E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        IronLog.INTERNAL.verbose(i());
        AsyncTask.execute(new d());
    }

    private wg<Smash> E() {
        IronLog.INTERNAL.verbose();
        return new vg(this.f43656o).d(this.f43642a.b());
    }

    private void F() {
        this.f43662u.a(this.f43656o.b(), false);
    }

    private void K() {
        IronLog.INTERNAL.verbose(i());
        synchronized (this.f43665x) {
            try {
                f fVar = this.f43657p;
                f fVar2 = f.AUCTION;
                if (fVar == fVar2) {
                    return;
                }
                a(fVar2);
                this.I.set(false);
                long jK = this.f43656o.d().k() - C4360i5.a(this.f43654m);
                if (jK > 0) {
                    new Timer().schedule(new c(), jK);
                } else {
                    D();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void L() {
        IronLog.INTERNAL.verbose(i());
        a(j(), m());
    }

    private List<C4424m2> j() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f43656o.j()) {
            if (!networkSettings.isBidder(this.f43656o.b()) && d(networkSettings)) {
                Je je2 = new Je(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f43656o.b()));
                if (!this.f43653l.b(je2)) {
                    copyOnWriteArrayList.add(new C4424m2(je2.c()));
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private int p() {
        return 1;
    }

    private void r() {
        IronLog.INTERNAL.verbose(i());
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f43656o.j()) {
            if (c(networkSettings, com.ironsource.mediationsdk.c.b().b(networkSettings, this.f43656o.b(), k()))) {
                arrayList.add(new b(networkSettings));
            }
        }
        IronSourceThreadManager.INSTANCE.executeTasks(this.f43656o.k(), this.f43656o.p(), arrayList);
    }

    private void s() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f43656o.j()) {
            arrayList.add(new Je(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f43656o.b())));
        }
        Ke ke2 = new Ke();
        this.f43653l = ke2;
        ke2.a(arrayList);
    }

    public void A() {
        if (e()) {
            a(new a());
        } else {
            B();
        }
    }

    protected void G() {
        com.ironsource.mediationsdk.n.a().a(this.f43656o.b(), this.f43656o.f());
    }

    protected boolean H() {
        return true;
    }

    protected boolean I() {
        return true;
    }

    public void J() {
        Iterator<NetworkSettings> it = this.f43656o.j().iterator();
        while (it.hasNext()) {
            com.ironsource.mediationsdk.c.b().b(it.next(), this.f43656o.b(), k());
        }
    }

    protected abstract Smash a(NetworkSettings networkSettings, BaseAdAdapter<?, Listener> baseAdAdapter, int i10, String str, C4424m2 c4424m2);

    protected abstract JSONObject b(NetworkSettings networkSettings);

    protected abstract K0 g();

    protected P0 h() {
        return new P0(this.f43656o.h(), this);
    }

    protected String i() {
        return b((String) null);
    }

    public UUID k() {
        return this.f43664w;
    }

    protected abstract String l();

    protected String m() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected String n() {
        C4283dd c4283dd = this.f43650i;
        return c4283dd == null ? "" : c4283dd.c();
    }

    abstract String o();

    protected boolean q() {
        return false;
    }

    protected boolean t() {
        return false;
    }

    protected boolean u() {
        return false;
    }

    protected abstract boolean v();

    protected boolean w() {
        boolean z10;
        synchronized (this.f43665x) {
            try {
                f fVar = this.f43657p;
                z10 = fVar == f.LOADING || fVar == f.READY_TO_SHOW;
            } finally {
            }
        }
        return z10;
    }

    protected boolean x() {
        boolean z10;
        synchronized (this.f43665x) {
            z10 = this.f43657p == f.READY_TO_SHOW;
        }
        return z10;
    }

    protected boolean y() {
        boolean z10;
        synchronized (this.f43665x) {
            z10 = this.f43657p == f.AUCTION;
        }
        return z10;
    }

    protected boolean z() {
        boolean z10;
        synchronized (this.f43665x) {
            z10 = this.f43657p == f.LOADING;
        }
        return z10;
    }

    private boolean c(boolean z10) {
        Boolean bool = this.f43667z;
        if (bool == null) {
            return false;
        }
        if (z10 && !bool.booleanValue() && u()) {
            return true;
        }
        return !z10 && this.f43667z.booleanValue();
    }

    private boolean d(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f43656o.b(), k());
        if (adapterBaseInterfaceB instanceof AdapterSettingsInterface) {
            return this.f43642a.a(this.f43656o.h().a(), networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), a(networkSettings, adapterBaseInterfaceB), adapterBaseInterfaceB, this.f43656o.b());
        }
        return false;
    }

    public void a(Context context, boolean z10) {
        IronLog.INTERNAL.verbose(b("track = " + z10));
        try {
            this.f43651j = z10;
            if (z10) {
                if (this.f43652k == null) {
                    this.f43652k = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f43652k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f43652k != null) {
                context.getApplicationContext().unregisterReceiver(this.f43652k);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    protected void b(boolean z10) {
        a(false, z10, (AbstractC4478p3<?>) null);
    }

    @Override // com.ironsource.Q0
    public void e(AbstractC4478p3<?> abstractC4478p3) {
        IronLog.INTERNAL.verbose(b(abstractC4478p3.k()));
        this.f43660s.f40515i.a(n());
        this.f43661t.a(this.f43650i, abstractC4478p3.f());
    }

    protected void g(AbstractC4478p3<?> abstractC4478p3) {
        this.f43661t.d(abstractC4478p3.f());
    }

    protected void h(AbstractC4478p3<?> abstractC4478p3) {
        if (this.f43656o.h().f()) {
            a(abstractC4478p3, abstractC4478p3.f());
        } else {
            a(true, false, abstractC4478p3);
        }
    }

    protected void i(AbstractC4478p3<?> abstractC4478p3) {
        if (this.f43656o.q() && this.I.compareAndSet(false, true)) {
            C4424m2 c4424m2I = abstractC4478p3.i();
            this.f43644c.a(c4424m2I, abstractC4478p3.l(), this.f43649h);
            ArrayList<String> arrayList = new ArrayList<>();
            ConcurrentHashMap<String, C4424m2> concurrentHashMap = new ConcurrentHashMap<>();
            for (Smash smash : this.f43642a.b()) {
                arrayList.add(smash.c());
                concurrentHashMap.put(smash.c(), smash.i());
            }
            this.f43644c.a(arrayList, concurrentHashMap, abstractC4478p3.l(), this.f43649h, c4424m2I);
        }
    }

    public void b() {
        IronLog.INTERNAL.verbose(i());
        A();
    }

    AbstractC4425m3(I7 i72, H7 h72, U u10, C4432ma c4432ma, C4246ba c4246ba) {
        this.f43647f = "";
        this.f43651j = false;
        this.f43665x = new Object();
        this.f43666y = 0L;
        this.I = new AtomicBoolean(false);
        this.f43664w = UUID.randomUUID();
        this.C = i72.s();
        this.D = h72.h();
        this.E = i72.w();
        this.F = h72.x();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + u10.b() + ", loading mode = " + u10.h().a());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u10.b());
        sb2.append(" initiated object per waterfall mode");
        IronSourceUtils.i(sb2.toString());
        C4360i5 c4360i5 = new C4360i5();
        this.J = a(u10);
        this.f43663v = c4246ba;
        this.f43656o = u10;
        this.f43660s = new D0(u10.b(), D0.b.MEDIATION, this);
        this.f43661t = g();
        this.f43658q = h();
        a(f.NONE);
        this.B = c4432ma;
        this.f43642a = new qg<>(this.f43656o.d().f(), this.f43656o.d().i(), this);
        this.f43660s.f40511e.a(o(), this.f43656o.h().a().toString());
        this.f43643b = new ConcurrentHashMap<>();
        this.f43650i = null;
        G();
        this.f43648g = new JSONObject();
        if (this.f43656o.q()) {
            this.f43644c = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(this.f43656o.d(), IronSourceUtils.d()));
        }
        this.f43645d = new com.ironsource.mediationsdk.h(this.f43656o.j(), this.f43656o.d().c());
        s();
        r();
        this.f43654m = new C4360i5();
        a(f.READY_TO_LOAD);
        this.f43659r = new O5(u10.a(), this);
        this.f43662u = new r();
        this.f43660s.f40511e.a(C4360i5.a(c4360i5));
        if (this.f43656o.h().e()) {
            ironLog.verbose("first automatic load");
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        for (NetworkSettings networkSettings : this.f43656o.j()) {
            C4642yf c4642yf = this.H;
            if (c4642yf == null || c4642yf.a(networkSettings, this.f43656o.b())) {
                if (!this.f43653l.b(new Je(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f43656o.b()))) && d(networkSettings)) {
                    AdData adDataA = a(networkSettings, (String) null);
                    if (networkSettings.isBidder(this.f43656o.b())) {
                        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f43656o.b(), k());
                        if (adapterBaseInterfaceB instanceof InterfaceC4630y3) {
                            list2.add(new CallableC4596w3(networkSettings.getInstanceType(this.f43656o.b()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC4630y3) adapterBaseInterfaceB, this, networkSettings));
                        } else {
                            this.f43660s.f40516j.g(adapterBaseInterfaceB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                        }
                    } else {
                        list.add(networkSettings.getProviderInstanceName());
                        sb2.append(networkSettings.getInstanceType(this.f43656o.b()));
                        sb2.append(networkSettings.getProviderInstanceName());
                        sb2.append(StringUtils.COMMA);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.verbose(b(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
        AdData adDataA = a(networkSettings, this.f43656o.o());
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f43656o.b(), k());
        if (adapterBaseInterfaceB != null) {
            try {
                adapterBaseInterfaceB.init(adDataA, ContextProvider.getInstance().getApplicationContext(), null);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                this.f43660s.f40516j.g("initProvider - exception while calling networkAdapter.init with " + networkSettings.getProviderName() + " - " + e10);
            }
        }
        IronLog.INTERNAL.verbose(b(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName())));
    }

    @Override // com.ironsource.InterfaceC4435md
    public boolean e() {
        S9 s92 = this.J;
        if (s92 == null || s92 == Thread.currentThread()) {
            return false;
        }
        return this.f43656o.l();
    }

    protected void a(f fVar) {
        synchronized (this.f43665x) {
            IronLog.INTERNAL.verbose("set current state to = " + fVar);
            this.f43657p = fVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:11:0x0096, B:13:0x009c, B:19:0x00af, B:16:0x00a2, B:18:0x00a8), top: B:37:0x0096 }] */
    @Override // com.ironsource.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.ironsource.AbstractC4478p3<?> r5) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC4425m3.d(com.ironsource.p3):void");
    }

    protected boolean a(f fVar, f fVar2) {
        boolean z10;
        synchronized (this.f43665x) {
            try {
                if (this.f43657p == fVar) {
                    IronLog.INTERNAL.verbose("expected state = " + fVar + ", state to set = " + fVar2);
                    this.f43657p = fVar2;
                    z10 = true;
                } else {
                    IronLog.INTERNAL.verbose("wrong state, current state = " + this.f43657p + ", expected state = " + fVar);
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Nullable
    private S9 a(U u10) {
        if (u10.l()) {
            return IronSourceThreadManager.INSTANCE.getSharedManagersThread();
        }
        return null;
    }

    private boolean c(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (this.f43642a.a(adapterBaseInterface, this.f43656o.b(), networkSettings.getProviderInstanceName())) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f43656o.b());
    }

    protected void a(K0 k02) {
        this.f43661t = k02;
    }

    protected BaseAdAdapter<?, Listener> a(NetworkSettings networkSettings, IronSource.a aVar) {
        BaseAdAdapter<?, Listener> baseAdAdapter = (BaseAdAdapter<?, Listener>) com.ironsource.mediationsdk.c.b().a(networkSettings, aVar, k());
        if (baseAdAdapter != null) {
            return baseAdAdapter;
        }
        return null;
    }

    protected void a(boolean z10, boolean z11, AbstractC4478p3<?> abstractC4478p3) {
        synchronized (this.f43665x) {
            try {
                Boolean bool = this.f43667z;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f43667z = Boolean.valueOf(z10);
                    long time = 0;
                    if (this.f43666y != 0) {
                        time = new Date().getTime() - this.f43666y;
                    }
                    this.f43666y = new Date().getTime();
                    this.f43660s.f40512f.a(z10, time, z11);
                    AdInfo adInfoF = abstractC4478p3 != null ? abstractC4478p3.f() : this.A;
                    this.A = adInfoF;
                    K0 k02 = this.f43661t;
                    if (!z10) {
                        adInfoF = null;
                    }
                    k02.a(z10, adInfoF);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(A0 a02) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.AUCTION_SUCCESS, A0.AUCTION_FAILED, A0.AUCTION_FAILED_NO_CANDIDATES, A0.AD_FORMAT_CAPPED, A0.AD_OPENED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_SUCCESS, A0.AD_LEFT_APPLICATION)).contains(a02);
    }

    private boolean b(A0 a02) {
        return !new ArrayList(Arrays.asList(A0.INIT_STARTED, A0.LOAD_AD, A0.AUCTION_REQUEST, A0.AUCTION_REQUEST_WATERFALL, A0.AUCTION_FAILED_NO_CANDIDATES, A0.COLLECT_TOKEN, A0.COLLECT_TOKENS_COMPLETED, A0.COLLECT_TOKENS_FAILED, A0.INSTANCE_COLLECT_TOKEN, A0.INSTANCE_COLLECT_TOKEN_SUCCESS, A0.INSTANCE_COLLECT_TOKEN_FAILED, A0.INSTANCE_COLLECT_TOKEN_TIMED_OUT)).contains(a02);
    }

    protected void b(C4424m2 c4424m2, String str) {
        if (c4424m2 != null) {
            W8 w8A = c4424m2.a(str);
            if (w8A != null) {
                for (ImpressionDataListener impressionDataListener : new HashSet(this.B.a())) {
                    IronLog.CALLBACK.info(b("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + w8A));
                    impressionDataListener.onImpressionSuccess(w8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.error(b("reportImpressionDataToPublisher - no auctionResponseItem or listener"));
        D0 d02 = this.f43660s;
        if (d02 != null) {
            d02.f40516j.g("reportImpressionDataToPublisher - no auctionResponseItem or listener");
        }
    }

    @Override // com.ironsource.InterfaceC4457o
    public void a() {
        if (this.f43656o.h().e()) {
            a(f.READY_TO_LOAD);
            b(true);
            A();
        }
    }

    @Override // com.ironsource.InterfaceC4656zc
    public void a(boolean z10) {
        if (!this.f43651j || this.f43656o.h().f()) {
            return;
        }
        IronLog.INTERNAL.verbose("network availability changed to - " + z10);
        if (c(z10)) {
            a(z10, false, (AbstractC4478p3<?>) null);
        }
    }

    protected LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.NONE;
    }

    private String a(List<C4424m2> list, String str) {
        IronLog.INTERNAL.verbose(b("waterfall.size() = " + list.size()));
        this.f43643b.clear();
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4424m2 c4424m2 = list.get(i10);
            AbstractC4478p3 abstractC4478p3A = a(c4424m2, str);
            if (abstractC4478p3A != null) {
                copyOnWriteArrayList.add(abstractC4478p3A);
                sb2.append(a(c4424m2, abstractC4478p3A.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        this.f43642a.a(this.f43656o.h().a(), (CopyOnWriteArrayList<Smash>) copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(b("updateWaterfall() - next waterfall is " + ((Object) sb2)));
        return sb2.toString();
    }

    private void b(JSONObject jSONObject) {
        int i10;
        if (jSONObject == null) {
            this.f43656o.b(false);
            IronLog.INTERNAL.verbose(b("loading configuration from auction response is null, using the following: " + this.f43656o.r()));
            return;
        }
        try {
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.f43835x) && (i10 = jSONObject.getInt(com.ironsource.mediationsdk.d.f43835x)) > 0) {
                    this.f43656o.a(i10);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.f43836y)) {
                    this.f43656o.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.f43836y));
                }
                this.f43656o.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f43837z, false));
                IronLog.INTERNAL.verbose(b(this.f43656o.r()));
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f43656o.b() + " Error: " + e10.getMessage());
                ironLog.verbose(b(this.f43656o.r()));
            }
        } catch (Throwable th2) {
            IronLog.INTERNAL.verbose(b(this.f43656o.r()));
            throw th2;
        }
    }

    @Override // com.ironsource.rg
    public void a(int i10) {
        this.f43660s.f40516j.v("waterfalls hold too many with size = " + i10);
    }

    private Smash a(C4424m2 c4424m2, String str) {
        NetworkSettings networkSettingsA = this.f43656o.a(c4424m2.c());
        if (networkSettingsA != null) {
            com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f43656o.b(), k());
            BaseAdAdapter<?, Listener> baseAdAdapterA = a(networkSettingsA, this.f43656o.b());
            if (baseAdAdapterA != null) {
                Smash smash = (Smash) a(networkSettingsA, baseAdAdapterA, this.C.a(this.f43656o.b()), str, c4424m2);
                this.f43643b.put(c4424m2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return smash;
            }
            IronLog.INTERNAL.error(b("addSmashToWaterfall - could not load ad adapter for " + networkSettingsA.getProviderInstanceName()));
            return null;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + c4424m2.c() + " state = " + this.f43657p;
        IronLog.INTERNAL.error(b(str2));
        this.f43660s.f40516j.i(str2);
        return null;
    }

    protected String b(String str) {
        String str2 = this.f43656o.b().name() + " state:" + this.f43657p;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        HashMap map = new HashMap();
        try {
            map.put(IronSourceConstants.EVENTS_PROVIDER, networkSettings.getProviderDefaultInstance());
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface.getAdapterVersion());
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface.getNetworkSDKVersion());
            map.put("spId", networkSettings.getSubProviderId());
            map.put("instanceType", Integer.valueOf(networkSettings.getInstanceType(this.f43656o.b())));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(p()));
            return map;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + networkSettings.getProviderDefaultInstance(), e10);
            return map;
        }
    }

    protected void a(int i10, String str, boolean z10) {
        int i11;
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        a(f.READY_TO_LOAD);
        ironLog.verbose(b("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f43656o.h().f()) {
            if (z10) {
                i11 = i10;
                str2 = str;
            } else {
                i11 = i10;
                str2 = str;
                this.f43660s.f40512f.a(C4360i5.a(this.f43655n), i11, str2, q());
            }
            a(new IronSourceError(i11, str2));
        } else {
            if (!z10) {
                this.f43660s.f40516j.b(i10, str);
            }
            b(false);
        }
        this.f43658q.e();
    }

    protected void a(AbstractC4478p3<?> abstractC4478p3, AdInfo adInfo) {
        this.f43661t.c(adInfo);
    }

    protected void a(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.n.a().b(this.f43656o.b(), ironSourceError);
    }

    protected AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f43656o.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        C4647z3 c4647z3 = new C4647z3();
        e eVar = new e(map, sb2, list);
        this.f43660s.f40513g.a();
        c4647z3.a(list2, eVar, this.f43656o.e(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b("auction waterfallString = " + str));
        boolean z10 = false;
        if (map.size() == 0 && list.size() == 0) {
            ironLog.verbose(b("auction failed - no candidates"));
            this.f43660s.f40514h.a(1005, "No candidates available for auctioning");
            a(C4644z0.e(this.f43656o.b()), "no available ad to load", false);
            return;
        }
        this.f43660s.f40514h.b(str);
        if (this.f43644c != null) {
            int iA = this.C.a(this.f43656o.b());
            com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f43656o.b());
            iVar.b(IronSourceUtils.g());
            iVar.a(map);
            iVar.a(list);
            iVar.a(this.f43645d);
            iVar.a(iA);
            iVar.a(this.f43663v);
            iVar.d(this.G);
            C4642yf c4642yf = this.H;
            if (c4642yf != null && c4642yf.b()) {
                z10 = true;
            }
            iVar.e(z10);
            a(ContextProvider.getInstance().getApplicationContext(), iVar, this);
            return;
        }
        ironLog.error(b("mAuctionHandler is null"));
    }

    protected void a(Context context, com.ironsource.mediationsdk.i iVar, R1 r12) {
        com.ironsource.mediationsdk.e eVar = this.f43644c;
        if (eVar != null) {
            eVar.a(context, iVar, r12);
        } else {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        }
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            this.f43647f = "";
            this.f43646e = i10;
            this.f43649h = c4424m2;
            this.f43648g = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                this.f43660s.f40516j.a(i11, str2);
            }
            a(jSONObject2);
            if (this.f43662u.a(this.f43656o.b())) {
                this.f43660s.f40514h.a(str);
                a(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped", true);
                return;
            }
            String strA = a(list, str);
            this.f43660s.f40514h.a(j10, this.f43656o.r() + ";wtf=" + list.size());
            this.f43660s.f40514h.c(strA);
            a(f.LOADING);
            C();
            return;
        }
        ironLog.error(b("unexpected auction success for auctionId - " + str + " state = " + this.f43657p));
        Sf sf2 = this.f43660s.f40516j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unexpected auction success, state = ");
        sb2.append(this.f43657p);
        sf2.k(sb2.toString());
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        if (y()) {
            String str3 = "Auction failed (error " + i10 + " - " + str + ")";
            ironLog.verbose(b(str3));
            IronSourceUtils.i(l() + ": " + str3);
            this.f43646e = i11;
            this.f43647f = str2;
            this.f43648g = new JSONObject();
            if (this.f43656o.d().n()) {
                ironLog.verbose(b("Moving to fallback waterfall"));
                L();
            }
            this.f43660s.f40514h.a(j10, i10, str);
            a(f.LOADING);
            C();
            return;
        }
        String str4 = "unexpected auction fail - error = " + i10 + ", " + str + " state = " + this.f43657p;
        ironLog.error(b(str4));
        this.f43660s.f40516j.j(str4);
    }

    @Override // com.ironsource.Q0
    public void a(IronSourceError ironSourceError, AbstractC4478p3<?> abstractC4478p3) {
        wg<Smash> wgVarE;
        AbstractC4478p3<?> abstractC4478p3C;
        synchronized (this.f43665x) {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(b(abstractC4478p3.k() + " - error = " + ironSourceError));
                if (abstractC4478p3.h().equals(this.f43642a.c()) && this.f43657p != f.AUCTION) {
                    this.f43643b.put(abstractC4478p3.c(), h.a.ISAuctionPerformanceFailedToLoad);
                    if (z() || x()) {
                        wgVarE = E();
                        if (wgVarE.c()) {
                            a(509, "Mediation No fill", false);
                            return;
                        }
                    } else {
                        wgVarE = null;
                    }
                    if (wgVarE == null) {
                        return;
                    }
                    if (this.f43656o.m()) {
                        synchronized (this.f43665x) {
                            try {
                                if (wgVarE.b() && w() && (abstractC4478p3C = new vg(this.f43656o).c(this.f43642a.b())) != null) {
                                    i(abstractC4478p3C);
                                }
                            } finally {
                            }
                        }
                    }
                    Iterator<Smash> it = wgVarE.a().iterator();
                    while (it.hasNext()) {
                        it.next().E();
                    }
                    return;
                }
                ironLog.error(b("onAdLoadFailed was invoked from " + abstractC4478p3.c() + " with state =" + this.f43657p + " auctionId: " + abstractC4478p3.h() + " and the current id is " + this.f43642a.c()));
                Sf sf2 = this.f43660s.f40516j;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onAdLoadFailed was invoked with state =");
                sb2.append(this.f43657p);
                sf2.o(sb2.toString());
            } finally {
            }
        }
    }

    @Override // com.ironsource.Q0
    public void a(AbstractC4478p3<?> abstractC4478p3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(b(abstractC4478p3.k()));
        this.f43660s.f40515i.g(n());
        this.f43642a.a(abstractC4478p3);
        this.f43642a.b(abstractC4478p3);
        this.f43653l.a(abstractC4478p3);
        if (this.f43653l.b(abstractC4478p3)) {
            ironLog.verbose(b(abstractC4478p3.c() + " was session capped"));
            abstractC4478p3.N();
            IronSourceUtils.i(abstractC4478p3.c() + " was session capped");
        }
        this.F.a(ContextProvider.getInstance().getApplicationContext(), n(), this.f43656o.b());
        if (this.E.c(ContextProvider.getInstance().getApplicationContext(), this.f43650i, this.f43656o.b())) {
            ironLog.verbose(b("placement " + n() + " is capped"));
            this.f43660s.f40515i.b(n(), null);
        }
        this.D.b(this.f43656o.b());
        if (this.f43656o.q()) {
            C4424m2 c4424m2I = abstractC4478p3.i();
            this.f43644c.a(c4424m2I, abstractC4478p3.l(), this.f43649h, n());
            this.f43643b.put(abstractC4478p3.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (H()) {
                b(c4424m2I, n());
            }
        }
        g(abstractC4478p3);
        if (this.f43656o.h().e()) {
            b(false);
        }
        this.f43658q.h();
    }

    public Map<String, Object> a(A0 a02) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        JSONObject jSONObject = this.f43648g;
        if (jSONObject != null && jSONObject.length() > 0) {
            map.put("genericParams", this.f43648g);
        }
        map.put("sessionDepth", Integer.valueOf(this.C.a(this.f43656o.b())));
        if (c(a02)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f43646e));
            if (!TextUtils.isEmpty(this.f43647f)) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f43647f);
            }
        }
        if (b(a02) && !TextUtils.isEmpty(this.f43642a.c())) {
            map.put("auctionId", this.f43642a.c());
        }
        return map;
    }

    public void a(C4246ba c4246ba) {
        this.f43663v = c4246ba;
    }

    private void a(JSONObject jSONObject) {
        this.f43662u.a(this.f43656o.b(), jSONObject != null ? jSONObject.optBoolean(com.ironsource.mediationsdk.d.f43817f, false) : false);
        b(jSONObject);
    }

    protected String a(C4424m2 c4424m2, int i10) {
        return String.format("%s%s", Integer.valueOf(i10), c4424m2.c());
    }

    public void a(C4642yf c4642yf) {
        this.H = c4642yf;
        if (c4642yf != null) {
            this.G = true;
        } else {
            this.G = false;
        }
        this.f43667z = null;
    }

    @Override // com.ironsource.InterfaceC4613x3
    public void a(NetworkSettings networkSettings) {
        AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettings, this.f43656o.b(), k());
        if (adapterBaseInterfaceB != null) {
            this.f43660s.f40513g.a(b(networkSettings, adapterBaseInterfaceB));
        }
    }

    @Override // com.ironsource.InterfaceC4613x3
    public void a(String str) {
        this.f43660s.f40516j.g(str);
    }

    @Override // com.ironsource.InterfaceC4435md
    public void a(Runnable runnable) {
        S9 s92 = this.J;
        if (s92 != null) {
            s92.a(runnable);
        }
    }
}
