package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4386jf;
import com.ironsource.D0;
import com.ironsource.L8;
import com.ironsource.Q0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC4478p3<Listener extends Q0> implements NetworkInitializationListener, C4386jf.a, C0, AdapterAdListener, L8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C4405l0 f44604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Listener f44605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected BaseAdAdapter<?, AdapterAdListener> f44606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected D0 f44607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected h f44608e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected C4283dd f44610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected C4237b1 f44611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected JSONObject f44612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f44613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected AdData f44614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Long f44615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected C4360i5 f44616m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C4424m2 f44618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC4435md f44619p;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f44609f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C4386jf f44617n = new C4386jf(TimeUnit.SECONDS.toMillis(s()));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Object f44620q = new Object();

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    class a extends AbstractRunnableC4232ae {
        a() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.L();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$b */
    class b extends AbstractRunnableC4232ae {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.K();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$c */
    class c extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f44623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44624c;

        c(int i10, String str) {
            this.f44623b = i10;
            this.f44624c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.a(this.f44623b, this.f44624c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$d */
    class d extends AbstractRunnableC4232ae {
        d() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.I();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$e */
    class e extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdapterErrorType f44627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f44628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f44629d;

        e(AdapterErrorType adapterErrorType, int i10, String str) {
            this.f44627b = adapterErrorType;
            this.f44628c = i10;
            this.f44629d = str;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.a(this.f44627b, this.f44628c, this.f44629d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$f */
    class f extends AbstractRunnableC4232ae {
        f() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.J();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$g */
    class g extends AbstractRunnableC4232ae {
        g() {
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            AbstractC4478p3.this.H();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.p3$h */
    protected enum h {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC4478p3(InterfaceC4435md interfaceC4435md, C4405l0 c4405l0, BaseAdAdapter<?, ?> baseAdAdapter, C4237b1 c4237b1, C4424m2 c4424m2, Listener listener) {
        this.f44604a = c4405l0;
        this.f44605b = listener;
        this.f44607d = new D0(c4405l0.a(), D0.b.PROVIDER, this);
        this.f44611h = c4237b1;
        this.f44612i = c4237b1.c();
        this.f44606c = baseAdAdapter;
        this.f44618o = c4424m2;
        this.f44619p = interfaceC4435md;
        a(h.NONE);
    }

    private boolean D() {
        return this.f44608e == h.INIT_IN_PROGRESS;
    }

    private void F() {
        IronLog.INTERNAL.verbose(d());
        a(h.LOADING);
        a(false);
        try {
            this.f44617n.a((C4386jf.a) this);
            G();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "unexpected error while calling adapter.loadAd() - " + th2.getMessage() + " - state = " + this.f44608e;
            IronLog.INTERNAL.error(a(str));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.a(j());
        }
        this.f44605b.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        boolean zO = false;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4386jf c4386jf = this.f44617n;
        if (c4386jf != null) {
            c4386jf.e();
        }
        synchronized (this.f44620q) {
            try {
                h hVar = this.f44608e;
                if (hVar == h.LOADING) {
                    long jA = C4360i5.a(this.f44616m);
                    ironLog.verbose(a("Load duration = " + jA));
                    if (this.f44607d != null) {
                        if (v()) {
                            this.f44607d.f40512f.a(jA);
                        } else {
                            this.f44607d.f40512f.a(jA, false);
                        }
                    }
                    a(h.LOADED);
                    zO = O();
                } else if (hVar != h.FAILED) {
                    ironLog.error(a(String.format("unexpected load success for %s, state - %s", k(), this.f44608e)));
                    String str = String.format("unexpected load success, state - %s", this.f44608e);
                    if (this.f44607d != null) {
                        if (v()) {
                            this.f44607d.f40516j.s(str);
                        } else {
                            this.f44607d.f40516j.p(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zO) {
            this.f44605b.d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog.INTERNAL.verbose(d());
        a(h.SHOWING);
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.g(j());
        }
        this.f44605b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (D()) {
            C4386jf c4386jf = this.f44617n;
            if (c4386jf != null) {
                c4386jf.e();
            }
            a(h.READY_TO_LOAD);
            F();
            return;
        }
        if (this.f44608e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init success for %s, state - %s", k(), this.f44608e)));
        if (this.f44607d != null) {
            this.f44607d.f40516j.n(String.format("unexpected init success, state - %s", this.f44608e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        long jA = C4360i5.a(this.f44616m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", state = " + this.f44608e + ", isBidder = " + w()));
        synchronized (this.f44620q) {
            try {
                if (!z()) {
                    ironLog.error(a(String.format("unexpected timeout for %s, state - %s, error - %s", k(), this.f44608e, 1025)));
                    if (this.f44607d != null) {
                        this.f44607d.f40516j.u(String.format("unexpected timeout, state - %s, error - %s", this.f44608e, 1025));
                    }
                } else {
                    a(h.FAILED);
                    D0 d02 = this.f44607d;
                    if (d02 != null) {
                        d02.f40512f.a(jA, 1025, false);
                        this.f44607d.f40512f.a(jA, 1025, "time out", false);
                    }
                    this.f44605b.a(ErrorBuilder.buildLoadFailedError("time out"), this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int o() {
        return 1;
    }

    private int s() {
        C4424m2 c4424m2 = this.f44618o;
        if (c4424m2 == null) {
            return this.f44604a.f();
        }
        Integer numF = c4424m2.f();
        int iF = (numF == null || numF.intValue() <= 0) ? this.f44604a.f() : numF.intValue();
        IronLog.INTERNAL.verbose(a("Load timeout for " + this.f44618o.c() + " - " + iF + " seconds"));
        return iF;
    }

    public AtomicBoolean A() {
        return this.f44609f;
    }

    public boolean B() {
        return y();
    }

    public boolean C() {
        return this.f44608e == h.SHOWING;
    }

    public void E() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        C4424m2 c4424m2I = i();
        String strK = c4424m2I.k();
        Map<String, Object> mapA = C4365ia.a(c4424m2I.a());
        mapA.put("adUnit", this.f44604a.a());
        b(strK);
        try {
            boolean z10 = false;
            if (v()) {
                this.f44607d.f40512f.a();
            } else {
                this.f44607d.f40512f.a(false);
            }
            this.f44615l = null;
            this.f44616m = new C4360i5();
            this.f44614k = a(strK, mapA);
            synchronized (this.f44620q) {
                if (this.f44608e != h.NONE) {
                    z10 = true;
                } else {
                    a(h.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str = "loadAd - incorrect state while loading, state = " + this.f44608e;
                ironLog.error(a(str));
                this.f44607d.f40516j.g(str);
                onInitFailed(C4644z0.c(this.f44604a.a()), str);
                return;
            }
            this.f44617n.a((C4386jf.a) this);
            AdapterBaseInterface networkAdapter = this.f44606c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f44614k, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + k();
            ironLog.error(a(str2));
            onInitFailed(C4644z0.c(this.f44604a.a()), str2);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str3 = "loadAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            D0 d02 = this.f44607d;
            if (d02 != null) {
                d02.f40516j.g(str3);
            }
            onInitFailed(C4644z0.c(this.f44604a.a()), str3);
        }
    }

    protected void G() {
        Object obj = this.f44606c;
        if (obj instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) obj).loadAd(this.f44614k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: all -> 0x0009, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:14:0x0054, B:16:0x0058, B:17:0x005d, B:19:0x0061, B:20:0x0066, B:11:0x000c, B:13:0x004d), top: B:26:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x0009, TryCatch #1 {, blocks: (B:3:0x0001, B:6:0x0006, B:14:0x0054, B:16:0x0058, B:17:0x005d, B:19:0x0061, B:20:0x0066, B:11:0x000c, B:13:0x004d), top: B:26:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<?, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> r0 = r4.f44606c     // Catch: java.lang.Throwable -> L9
            r1 = 0
            if (r0 == 0) goto L54
            r4.f44606c = r1     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            goto L54
        L9:
            r0 = move-exception
            goto L68
        Lb:
            r0 = move-exception
            com.ironsource.o4 r2 = com.ironsource.C4462o4.d()     // Catch: java.lang.Throwable -> L9
            r2.a(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9
            r2.<init>()     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = "Exception while calling adapter.releaseMemory() from "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9
            com.ironsource.b1 r3 = r4.f44611h     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = r3.f()     // Catch: java.lang.Throwable -> L9
            r2.append(r3)     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = " - "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L9
            r2.append(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = " - state = "
            r2.append(r0)     // Catch: java.lang.Throwable -> L9
            com.ironsource.p3$h r0 = r4.f44608e     // Catch: java.lang.Throwable -> L9
            r2.append(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L9
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = r4.a(r0)     // Catch: java.lang.Throwable -> L9
            r2.error(r3)     // Catch: java.lang.Throwable -> L9
            com.ironsource.D0 r2 = r4.f44607d     // Catch: java.lang.Throwable -> L9
            if (r2 == 0) goto L54
            com.ironsource.D0 r2 = r4.f44607d     // Catch: java.lang.Throwable -> L9
            com.ironsource.Sf r2 = r2.f40516j     // Catch: java.lang.Throwable -> L9
            r2.g(r0)     // Catch: java.lang.Throwable -> L9
        L54:
            com.ironsource.D0 r0 = r4.f44607d     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L5d
            r0.f()     // Catch: java.lang.Throwable -> L9
            r4.f44607d = r1     // Catch: java.lang.Throwable -> L9
        L5d:
            com.ironsource.jf r0 = r4.f44617n     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L66
            r0.d()     // Catch: java.lang.Throwable -> L9
            r4.f44617n = r1     // Catch: java.lang.Throwable -> L9
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9
            return
        L68:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.AbstractC4478p3.M():void");
    }

    public void N() {
        IronLog.INTERNAL.verbose(d());
        D0 d02 = this.f44607d;
        if (d02 != null) {
            d02.f40515i.a();
        }
    }

    protected boolean O() {
        return true;
    }

    public String h() {
        return this.f44604a.c();
    }

    public C4424m2 i() {
        return this.f44618o;
    }

    protected String j() {
        C4283dd c4283dd = this.f44610g;
        return c4283dd == null ? "" : c4283dd.c();
    }

    public String k() {
        return String.format("%s %s", c(), Integer.valueOf(hashCode()));
    }

    public int l() {
        return this.f44611h.d();
    }

    public String m() {
        return this.f44611h.h().isMultipleInstances() ? this.f44611h.h().getProviderTypeForReflection() : this.f44611h.f();
    }

    public String n() {
        return this.f44611h.g();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdClicked(Map map) {
        p4.b.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str, Map map) {
        p4.b.b(this, adapterErrorType, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdLoadSuccess(Map map) {
        p4.b.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdOpened(Map map) {
        p4.b.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public /* synthetic */ void onAdShowFailed(int i10, String str, Map map) {
        p4.b.e(this, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitFailed(int i10, String str, Map map) {
        q4.a.a(this, i10, str, map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public /* synthetic */ void onInitSuccess(Map map) {
        q4.a.b(this, map);
    }

    public NetworkSettings p() {
        return this.f44604a.g();
    }

    protected Map<String, Object> q() {
        HashMap map = new HashMap();
        map.putAll(C4365ia.a(this.f44612i));
        return map;
    }

    public Integer r() {
        C4405l0 c4405l0 = this.f44604a;
        if (c4405l0 != null) {
            return Integer.valueOf(c4405l0.h());
        }
        return null;
    }

    public h t() {
        return this.f44608e;
    }

    protected InterfaceC4435md u() {
        return this.f44619p;
    }

    protected boolean v() {
        return false;
    }

    public boolean w() {
        return this.f44611h.j();
    }

    public boolean x() {
        return this.f44608e == h.FAILED;
    }

    public boolean y() {
        return this.f44608e == h.LOADED;
    }

    public boolean z() {
        h hVar = this.f44608e;
        return hVar == h.INIT_IN_PROGRESS || hVar == h.LOADING;
    }

    public Map<String, Object> a(A0 a02) {
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f44606c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f44606c;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(a("could not get adapter version for event data" + k()));
        }
        map.put("spId", this.f44611h.i());
        map.put(IronSourceConstants.EVENTS_PROVIDER, this.f44611h.a());
        map.put("instanceType", Integer.valueOf(l()));
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(o()));
        if (!TextUtils.isEmpty(this.f44613j)) {
            map.put("dynamicDemandSource", this.f44613j);
        }
        map.put("sessionDepth", r());
        if (this.f44604a.e() != null && this.f44604a.e().length() > 0) {
            map.put("genericParams", this.f44604a.e());
        }
        if (!TextUtils.isEmpty(this.f44604a.c())) {
            map.put("auctionId", this.f44604a.c());
        }
        if (b(a02)) {
            map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f44604a.d()));
            if (!TextUtils.isEmpty(this.f44604a.b())) {
                map.put(IronSourceConstants.AUCTION_FALLBACK, this.f44604a.b());
            }
        }
        if (!TextUtils.isEmpty(this.f44604a.g().getCustomNetwork())) {
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f44604a.g().getCustomNetwork());
        }
        return map;
    }

    public void b(String str) {
        this.f44613j = com.ironsource.mediationsdk.d.b().c(str);
    }

    @Override // com.ironsource.L8.b
    public String c() {
        return this.f44611h.f();
    }

    protected String d() {
        return a((String) null);
    }

    public Long e() {
        return this.f44615l;
    }

    public AdInfo f() {
        return new AdInfo(this.f44618o.a(j()), this.f44618o.d());
    }

    public IronSource.a g() {
        return this.f44604a.a();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        if (this.f44619p.e()) {
            this.f44619p.a(new g());
        } else {
            H();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str) {
        if (this.f44619p.e()) {
            this.f44619p.a(new e(adapterErrorType, i10, str));
        } else {
            a(adapterErrorType, i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        if (this.f44619p.e()) {
            this.f44619p.a(new d());
        } else {
            I();
        }
    }

    public void onAdOpened() {
        if (this.f44619p.e()) {
            this.f44619p.a(new f());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        if (this.f44619p.e()) {
            this.f44619p.a(new c(i10, str));
        } else {
            a(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        if (this.f44619p.e()) {
            this.f44619p.a(new b());
        } else {
            K();
        }
    }

    @Override // com.ironsource.L8.b
    public int b() {
        return this.f44611h.e();
    }

    private boolean b(A0 a02) {
        return new ArrayList(Arrays.asList(A0.LOAD_AD, A0.LOAD_AD_SUCCESS, A0.LOAD_AD_FAILED, A0.LOAD_AD_FAILED_WITH_REASON, A0.LOAD_AD_NO_FILL, A0.RELOAD_AD, A0.RELOAD_AD_SUCCESS, A0.RELOAD_AD_FAILED_WITH_REASON, A0.RELOAD_AD_NO_FILL, A0.DESTROY_AD, A0.AD_PRESENT_SCREEN, A0.AD_DISMISS_SCREEN, A0.AD_LEFT_APPLICATION, A0.AD_OPENED, A0.AD_CLOSED, A0.SHOW_AD, A0.SHOW_AD_FAILED, A0.AD_CLICKED, A0.AD_REWARDED)).contains(a02);
    }

    protected void a(h hVar) {
        IronLog.INTERNAL.verbose(d());
        this.f44608e = hVar;
    }

    public void a(boolean z10) {
        this.f44609f.set(z10);
    }

    protected Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("userId", this.f44604a.i());
        return map;
    }

    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    protected String a(String str) {
        String str2 = this.f44604a.a().name() + " - " + k() + " - state = " + this.f44608e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    @Override // com.ironsource.C4386jf.a
    public void a() {
        if (!this.f44619p.e()) {
            L();
        } else {
            this.f44619p.a(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        if (D()) {
            C4386jf c4386jf = this.f44617n;
            if (c4386jf != null) {
                c4386jf.e();
            }
            a(h.FAILED);
            a(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, i10, str, C4360i5.a(this.f44616m));
            this.f44605b.a(new IronSourceError(i10, str), this);
            return;
        }
        if (this.f44608e == h.FAILED) {
            return;
        }
        ironLog.error(a(String.format("unexpected init failed for %s, state - %s, error - %s, %s", k(), this.f44608e, Integer.valueOf(i10), str)));
        if (this.f44607d != null) {
            this.f44607d.f40516j.m(String.format("unexpected init failed, state - %s, error - %s, %s", this.f44608e, Integer.valueOf(i10), str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull AdapterErrorType adapterErrorType, int i10, String str) {
        long jA = C4360i5.a(this.f44616m);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("Load duration = " + jA + ", error = " + i10 + ", " + str));
        C4386jf c4386jf = this.f44617n;
        if (c4386jf != null) {
            c4386jf.e();
        }
        synchronized (this.f44620q) {
            h hVar = this.f44608e;
            if (hVar == h.LOADING) {
                a(adapterErrorType, i10, str, jA);
                a(h.FAILED);
                this.f44605b.a(new IronSourceError(i10, str), this);
                return;
            }
            if (hVar == h.FAILED) {
                a(adapterErrorType, i10, str, jA);
                return;
            }
            if (hVar == h.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f44615l = Long.valueOf(System.currentTimeMillis());
                ironLog.error(a(String.format("ad expired for %s, state = %s", this.f44611h.f(), this.f44608e)));
                D0 d02 = this.f44607d;
                if (d02 != null) {
                    d02.f40516j.a(String.format("ad expired, state = %s", this.f44608e));
                }
                return;
            }
            ironLog.error(a(String.format("unexpected load failed for %s, state - %s, error - %s, %s", k(), this.f44608e, Integer.valueOf(i10), str)));
            String str2 = String.format("unexpected load failed, state - %s, error - %s, %s", this.f44608e, Integer.valueOf(i10), str);
            if (this.f44607d != null) {
                if (v()) {
                    this.f44607d.f40516j.r(str2);
                } else if (this.f44604a.a() != IronSource.a.REWARDED_VIDEO || this.f44608e != h.SHOWING) {
                    this.f44607d.f40516j.o(str2);
                }
            }
        }
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        if (this.f44607d != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                if (v()) {
                    this.f44607d.f40512f.b(j10, i10);
                    return;
                } else {
                    this.f44607d.f40512f.a(j10, i10);
                    return;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (v()) {
                    this.f44607d.f40512f.a(j10, i10, str);
                    return;
                } else {
                    this.f44607d.f40512f.a(j10, i10, str, false);
                    return;
                }
            }
            this.f44607d.f40512f.a(j10, i10, false);
        }
    }
}
