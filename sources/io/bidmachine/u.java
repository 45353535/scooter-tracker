package io.bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ExpirationHandler;
import io.bidmachine.protobuf.AdCacheControl;
import io.bidmachine.protobuf.AdExtension;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class u implements ExpirationHandler.Listener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f81943y = TimeUnit.MINUTES.toSeconds(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ae.k f81944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f81945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdRequestParameters f81946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NetworkAdUnitManager f81947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Struct f81948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f81949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ad f81950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zb.c f81951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AdExtension.EventConfiguration f81952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AdCacheControl f81953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f81954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final BidMachineTrackingObject f81955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final NetworkAdUnit f81956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExpirationHandler f81957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final String f81958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Map f81959p = new EnumMap(TrackEventType.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicBoolean f81960q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final List f81961r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile x0 f81962s = x0.Idle;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final c f81963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile zb.a f81964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ExpirationHandler f81965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final boolean f81966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final AtomicBoolean f81967x;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                zb.a aVarA = u.this.A();
                if (aVarA != null) {
                    aVarA.onDestroy();
                }
            } catch (Throwable th2) {
                io.bidmachine.core.a.p(th2);
            }
            u.this.f81964u = null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81969a;

        static {
            int[] iArr = new int[io.bidmachine.core.k.values().length];
            f81969a = iArr;
            try {
                iArr[io.bidmachine.core.k.BidMachine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81969a[io.bidmachine.core.k.Network.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81969a[io.bidmachine.core.k.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static class c implements AdProcessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f81970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f81971b = new WeakHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f81972c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f81973d = new AtomicBoolean(false);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f81974e = new AtomicBoolean(false);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicBoolean f81975f = new AtomicBoolean(false);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AtomicBoolean f81976g = new AtomicBoolean(false);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final AtomicBoolean f81977h = new AtomicBoolean(false);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final AtomicBoolean f81978i = new AtomicBoolean(false);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final AtomicBoolean f81979j = new AtomicBoolean(false);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final AtomicBoolean f81980k = new AtomicBoolean(false);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private volatile boolean f81981l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private volatile io.bidmachine.core.k f81982m = io.bidmachine.core.k.Network;

        c(u uVar) {
            this.f81970a = new WeakReference(uVar);
        }

        private boolean r() {
            int i10 = b.f81969a[this.f81982m.ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 == 3 && w() && y() : y() : w();
        }

        private List u() {
            return new ArrayList(this.f81971b.keySet());
        }

        private u v() {
            return (u) this.f81970a.get();
        }

        private boolean w() {
            return !this.f81977h.get() || this.f81978i.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x() {
            return this.f81974e.get();
        }

        private boolean y() {
            return this.f81976g.get();
        }

        void A(AdProcessCallback adProcessCallback) {
            synchronized (this.f81972c) {
                this.f81971b.remove(adProcessCallback);
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void onBrokenCreativeEvent(Map map) {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.q0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("onBrokenCreativeEvent - %s", uVarV);
                    }
                });
                uVarV.v(TrackEventType.BrokenCreativeDetector, map);
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClicked() {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.d0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processClicked - %s", uVarV);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onClicked();
                }
                uVarV.s(TrackEventType.Click);
            }
            t(new Executable() { // from class: io.bidmachine.e0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processClicked();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processClosed() {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.k0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processClosed (%s) - %s", Boolean.valueOf(this.f80486a.f81981l), uVarV);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onClosed(this.f81981l);
                }
                uVarV.s(TrackEventType.Close);
            }
            t(new Executable() { // from class: io.bidmachine.l0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processClosed();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processDestroy() {
            t(new Executable() { // from class: io.bidmachine.x
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processDestroy();
                }
            });
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.y
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processDestroy - %s", uVarV);
                    }
                });
                uVarV.q();
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processExpired() {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.b0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processExpired - %s", uVarV);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onExpired();
                    uVarV.s(TrackEventType.Expired);
                }
            }
            t(new Executable() { // from class: io.bidmachine.c0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processExpired();
                }
            });
            if (uVarV != null) {
                uVarV.N(false);
            }
            processDestroy();
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFillAd() {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.m0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processFillAd - %s", uVarV);
                    }
                });
                if (uVarV.C().isFullscreen()) {
                    uVarV.P();
                }
                uVarV.s(TrackEventType.FillAd);
            }
            t(new Executable() { // from class: io.bidmachine.n0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processFillAd();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processFinished() {
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.o0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processFinished - %s", uVarV);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onFinished();
                }
                this.f81981l = true;
            }
            t(new Executable() { // from class: io.bidmachine.p0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processFinished();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadFail(final ae.a aVar) {
            if (this.f81975f.getAndSet(true)) {
                return;
            }
            this.f81973d.set(false);
            this.f81974e.set(false);
            u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.r0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processLoadFail - %s", aVar);
                    }
                });
                uVarV.o();
                uVarV.t(TrackEventType.Load, aVar);
            }
            t(new Executable() { // from class: io.bidmachine.w
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processLoadFail(aVar);
                }
            });
            processDestroy();
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processLoadSuccess() {
            if (this.f81975f.getAndSet(true)) {
                return;
            }
            this.f81973d.set(true);
            this.f81974e.set(false);
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.z
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processLoadSuccess - %s", uVarV);
                    }
                });
                uVarV.o();
                uVarV.s(TrackEventType.Load);
            }
            UserAgentManager.updateWebViewUserAgent();
            t(new Executable() { // from class: io.bidmachine.a0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processLoadSuccess();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShowFail(final ae.a aVar) {
            u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.i0
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processShowFail - %s", aVar);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onShowFailed();
                }
                uVarV.t(TrackEventType.Show, aVar);
            }
            t(new Executable() { // from class: io.bidmachine.j0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processShowFail(aVar);
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processShown() {
            this.f81976g.set(true);
            if (r()) {
                z();
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processStartVisibilityTracker() {
            this.f81977h.set(true);
        }

        @Override // io.bidmachine.AdProcessCallback
        public void processVisibilityTrackerImpression() {
            if (this.f81980k.getAndSet(true)) {
                return;
            }
            final u uVarV = v();
            if (uVarV != null) {
                io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.v
                    @Override // ce.b
                    public final Object get() {
                        return String.format("processImpression - %s", uVarV);
                    }
                });
                zb.a aVarA = uVarV.A();
                if (aVarA != null) {
                    aVarA.onImpression();
                }
                uVarV.s(TrackEventType.Impression);
            }
            t(new Executable() { // from class: io.bidmachine.g0
                @Override // io.bidmachine.Executable
                public final void execute(Object obj) {
                    ((AdProcessCallback) obj).processVisibilityTrackerImpression();
                }
            });
        }

        @Override // io.bidmachine.AdProcessCallback
        public boolean processVisibilityTrackerShown() {
            this.f81978i.set(true);
            if (!r()) {
                return false;
            }
            z();
            return true;
        }

        void q(AdProcessCallback adProcessCallback) {
            synchronized (this.f81972c) {
                this.f81971b.put(adProcessCallback, Boolean.TRUE);
            }
        }

        void s() {
            this.f81970a.clear();
            synchronized (this.f81972c) {
                this.f81971b.clear();
            }
        }

        @Override // io.bidmachine.AdProcessCallback
        public void setVisibilitySource(io.bidmachine.core.k kVar) {
            this.f81982m = kVar;
        }

        void t(Executable executable) {
            synchronized (this.f81972c) {
                try {
                    for (AdProcessCallback adProcessCallback : u()) {
                        if (adProcessCallback != null) {
                            executable.execute(adProcessCallback);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void z() {
            if (this.f81979j.compareAndSet(false, true)) {
                final u uVarV = v();
                if (uVarV != null) {
                    io.bidmachine.core.a.b(uVarV.f81944a, new ce.b() { // from class: io.bidmachine.f0
                        @Override // ce.b
                        public final Object get() {
                            return String.format("processShown - %s", uVarV);
                        }
                    });
                    uVarV.P();
                    zb.a aVarA = uVarV.A();
                    if (aVarA != null) {
                        aVarA.onShown();
                    }
                    uVarV.s(TrackEventType.Show);
                }
                t(new Executable() { // from class: io.bidmachine.h0
                    @Override // io.bidmachine.Executable
                    public final void execute(Object obj) {
                        ((AdProcessCallback) obj).processShown();
                    }
                });
            }
        }
    }

    static class d implements ExpirationHandler.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdProcessCallback f81983a;

        public d(AdProcessCallback adProcessCallback) {
            this.f81983a = adProcessCallback;
        }

        @Override // io.bidmachine.ExpirationHandler.Listener
        public void onExpired() {
            this.f81983a.processLoadFail(new ae.a(ae.a.f4236f, -1, "Creative loading timeout reached"));
        }
    }

    public u(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, Response.Seatbid seatbid, Response.Seatbid.Bid bid, Ad ad2, NetworkAdapter networkAdapter) {
        boolean z10 = false;
        c cVar = new c(this);
        this.f81963t = cVar;
        this.f81967x = new AtomicBoolean(false);
        this.f81944a = new ae.k("AdResponse");
        this.f81945b = System.currentTimeMillis();
        this.f81946c = adRequestParameters;
        this.f81947d = networkAdUnitManager;
        this.f81958o = response.getId();
        this.f81948e = seatbid.getExt();
        this.f81949f = bid.getId();
        this.f81950g = ad2;
        AdExtension adExtensionG = ae.f.g(ad2);
        zb.c c1Var = new c1(adRequestParameters.getAdsType(), seatbid, bid, ad2, networkAdapter, adExtensionG);
        this.f81951h = c1Var;
        this.f81952i = z(adExtensionG);
        this.f81953j = y(adExtensionG);
        long jZ = io.bidmachine.core.h.z(bid.getExp(), Response.Seatbid.Bid.getDefaultInstance().getExp(), f81943y) * 1000;
        this.f81954k = jZ;
        BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject(c1Var.getId());
        this.f81955l = bidMachineTrackingObject;
        bidMachineTrackingObject.setAdResponse(this);
        this.f81956m = networkAdUnitManager.findOrAddWinnerNetworkAdUnit(networkAdapter, adRequestParameters.getAdsFormat(), c1Var.a());
        this.f81957n = new ExpirationHandler(jZ, this);
        int creativeLoadingTimeout = adExtensionG != null ? adExtensionG.getCreativeLoadingTimeout() : 0;
        this.f81965v = creativeLoadingTimeout > 0 ? new ExpirationHandler(creativeLoadingTimeout, new d(cVar)) : null;
        if (adExtensionG != null && adExtensionG.getCridMonitoringEnabled()) {
            z10 = true;
        }
        this.f81966w = z10;
        x(bid);
        V();
    }

    private void V() {
        this.f81957n.start();
    }

    public static /* synthetic */ String a(u uVar) {
        uVar.getClass();
        return String.format("destroy - %s", uVar);
    }

    public static /* synthetic */ String b(u uVar) {
        uVar.getClass();
        return String.format("onLoadStart - %s", uVar);
    }

    public static /* synthetic */ void c(u uVar) {
        uVar.getClass();
        try {
            zb.a aVarA = uVar.A();
            if (aVarA != null) {
                aVarA.hide();
            }
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    public static /* synthetic */ String d(u uVar) {
        uVar.getClass();
        return String.format("notifyExpired - %s", uVar);
    }

    public static /* synthetic */ String e(u uVar) {
        uVar.getClass();
        return String.format("release - %s", uVar);
    }

    public static /* synthetic */ String f(u uVar) {
        uVar.getClass();
        return String.format("detachRequest - %s", uVar);
    }

    public static /* synthetic */ String g(u uVar) {
        uVar.getClass();
        return String.format("attachRequest - %s", uVar);
    }

    private boolean l() {
        return (X() || L()) ? false : true;
    }

    private void x(Response.Seatbid.Bid bid) {
        ae.f.a(this.f81959p, TrackEventType.MediationWin, bid.getPurl());
        ae.f.a(this.f81959p, TrackEventType.MediationLoss, bid.getLurl());
    }

    private AdCacheControl y(AdExtension adExtension) {
        AdCacheControl adCacheControl;
        if (adExtension == null || (adCacheControl = adExtension.getAdCacheControl()) == AdCacheControl.UNRECOGNIZED) {
            return null;
        }
        return adCacheControl;
    }

    public zb.a A() {
        return this.f81964u;
    }

    public AdRequestParameters B() {
        return this.f81946c;
    }

    public AdsType C() {
        return this.f81946c.getAdsType();
    }

    public zb.c D() {
        return this.f81951h;
    }

    public AdExtension.EventConfiguration E() {
        return this.f81952i;
    }

    public double F() {
        return this.f81951h.getPrice();
    }

    public synchronized x0 G() {
        return this.f81962s;
    }

    public List H(TrackEventType trackEventType) {
        return (List) this.f81959p.get(trackEventType);
    }

    public NetworkAdUnit I() {
        return this.f81956m;
    }

    public boolean J() {
        return A() != null && this.f81963t.f81973d.get();
    }

    public boolean K() {
        return this.f81967x.get();
    }

    public boolean L() {
        return this.f81960q.get();
    }

    public synchronized void M(ContextProvider contextProvider, AdRequest adRequest, BidMachineAd bidMachineAd, AdProcessCallback adProcessCallback) {
        NetworkAdapter networkAdapterFindNetworkAdapter;
        O(adRequest);
        this.f81963t.q(adProcessCallback);
        if (J()) {
            adProcessCallback.processLoadSuccess();
            return;
        }
        if (this.f81963t.f81974e.getAndSet(true)) {
            return;
        }
        this.f81955l.eventStart(TrackEventType.Load);
        if (L()) {
            this.f81963t.processLoadFail(ae.a.f4241k);
            return;
        }
        if (X()) {
            this.f81963t.processLoadFail(ae.a.f4242l);
            return;
        }
        try {
            networkAdapterFindNetworkAdapter = adRequest.getAdsType().findNetworkAdapter(this.f81950g);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
            this.f81963t.processLoadFail(ae.a.l("Exception processing response", th2));
        }
        if (networkAdapterFindNetworkAdapter == null) {
            this.f81963t.processLoadFail(ae.a.h("Failed to get adapter by response"));
            return;
        }
        zb.b bVarCreateAdObjectParams = adRequest.getAdsType().createAdObjectParams(this.f81950g);
        if (bVarCreateAdObjectParams != null && bVarCreateAdObjectParams.f()) {
            zb.a aVarCreateAdObject = bidMachineAd.createAdObject(contextProvider, adRequest, networkAdapterFindNetworkAdapter, bVarCreateAdObjectParams, this.f81963t);
            if (aVarCreateAdObject == null) {
                this.f81963t.processLoadFail(ae.a.h("Failed to create ad object by response"));
                return;
            }
            this.f81964u = aVarCreateAdObject;
            U();
            aVarCreateAdObject.load(contextProvider, adRequest.obtainUnifiedRequestParams(), this.f81956m);
            return;
        }
        this.f81963t.processLoadFail(ae.a.h("Failed to get parameters by response"));
    }

    void N(boolean z10) {
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.q
            @Override // ce.b
            public final Object get() {
                return u.d(this.f81892a);
            }
        });
        this.f81960q.set(true);
        W();
        w(null);
        if (z10) {
            q();
        }
    }

    public void O(AdRequest adRequest) {
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.m
            @Override // ce.b
            public final Object get() {
                return u.b(this.f80501a);
            }
        });
        w(adRequest);
    }

    void P() {
        W();
        w0.f().l(this);
    }

    void Q() {
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.n
            @Override // ce.b
            public final Object get() {
                return u.e(this.f81833a);
            }
        });
        w0 w0VarF = w0.f();
        if (!l() || !w0VarF.e(this)) {
            q();
            return;
        }
        n();
        T(x0.Idle);
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.o
            @Override // java.lang.Runnable
            public final void run() {
                u.c(this.f81874b);
            }
        });
    }

    public void R(AdProcessCallback adProcessCallback) {
        this.f81963t.A(adProcessCallback);
    }

    public synchronized void S(boolean z10) {
        this.f81967x.set(z10);
    }

    public synchronized void T(x0 x0Var) {
        this.f81962s = x0Var;
    }

    void U() {
        ExpirationHandler expirationHandler = this.f81965v;
        if (expirationHandler != null) {
            expirationHandler.start();
        }
    }

    void W() {
        this.f81957n.stop();
    }

    public boolean X() {
        return this.f81963t.f81979j.get();
    }

    public void j(AdRequest adRequest) {
        if (adRequest == null) {
            return;
        }
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.s
            @Override // ce.b
            public final Object get() {
                return u.g(this.f81918a);
            }
        });
        this.f81961r.add(new WeakReference(adRequest));
    }

    public long k() {
        return this.f81954k - (System.currentTimeMillis() - this.f81945b);
    }

    public boolean m() {
        return this.f81953j == AdCacheControl.AD_CACHE_CONTROL_ENABLED;
    }

    void n() {
        Iterator it = this.f81961r.iterator();
        while (it.hasNext()) {
            ((WeakReference) it.next()).clear();
        }
        this.f81961r.clear();
    }

    void o() {
        ExpirationHandler expirationHandler = this.f81965v;
        if (expirationHandler != null) {
            expirationHandler.stop();
        }
        this.f81965v = null;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.f81963t.processExpired();
    }

    Value p() {
        Struct.Builder builderPutFields = Struct.newBuilder().putFields("price", Value.newBuilder().setNumberValue(this.f81951h.getPrice()).build()).putFields("exp", Value.newBuilder().setNumberValue(k()).build()).putFields(CommonUrlParts.REQUEST_ID, Value.newBuilder().setStringValue(this.f81958o).build()).putFields("bid_id", Value.newBuilder().setStringValue(this.f81949f).build());
        if (this.f81948e.getFieldsCount() > 0) {
            builderPutFields.putFields("seat", Value.newBuilder().setStructValue(this.f81948e).build());
        }
        return Value.newBuilder().setStructValue(builderPutFields).build();
    }

    void q() {
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.t
            @Override // ce.b
            public final Object get() {
                return u.a(this.f81935a);
            }
        });
        w0.f().l(this);
        o();
        n();
        W();
        this.f81963t.s();
        this.f81959p.clear();
        this.f81947d.notifyNetworkClearAuction();
        if (this.f81963t.x()) {
            t(TrackEventType.Load, ae.a.f4245o);
        }
        if (this.f81964u != null) {
            s(TrackEventType.Destroy);
        }
        this.f81955l.clear();
        io.bidmachine.core.h.U(new a());
    }

    public void r(AdRequest adRequest) {
        if (adRequest == null) {
            return;
        }
        io.bidmachine.core.a.b(this.f81944a, new ce.b() { // from class: io.bidmachine.p
            @Override // ce.b
            public final Object get() {
                return u.f(this.f81888a);
            }
        });
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : this.f81961r) {
            AdRequest adRequest2 = (AdRequest) weakReference.get();
            if (adRequest2 == null || adRequest2 == adRequest) {
                arrayList.add(weakReference);
            }
        }
        this.f81961r.removeAll(arrayList);
        if (this.f81961r.isEmpty()) {
            Q();
        }
    }

    void s(TrackEventType trackEventType) {
        u(trackEventType, null, null);
    }

    void t(TrackEventType trackEventType, ae.a aVar) {
        u(trackEventType, aVar, null);
    }

    public String toString() {
        return this.f81951h.toString();
    }

    void u(TrackEventType trackEventType, ae.a aVar, Map map) {
        this.f81955l.eventFinish(trackEventType, C(), this, aVar, map);
    }

    void v(TrackEventType trackEventType, Map map) {
        u(trackEventType, null, map);
    }

    void w(AdRequest adRequest) {
        Iterator it = this.f81961r.iterator();
        while (it.hasNext()) {
            AdRequest adRequest2 = (AdRequest) ((WeakReference) it.next()).get();
            if (adRequest2 != null && adRequest2 != adRequest) {
                adRequest2.processExpired();
            }
        }
    }

    AdExtension.EventConfiguration z(AdExtension adExtension) {
        AdExtension.EventConfiguration eventConfiguration;
        if (adExtension == null || (eventConfiguration = adExtension.getEventConfiguration()) == AdExtension.EventConfiguration.getDefaultInstance()) {
            return null;
        }
        return eventConfiguration;
    }
}
