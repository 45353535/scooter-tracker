package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.A3;
import com.ironsource.A5;
import com.ironsource.C4246ba;
import com.ironsource.C4283dd;
import com.ironsource.C4415la;
import com.ironsource.C4424m2;
import com.ironsource.C4460o2;
import com.ironsource.C4462o4;
import com.ironsource.C4603wa;
import com.ironsource.C4606wd;
import com.ironsource.C4647z3;
import com.ironsource.C4649z5;
import com.ironsource.CallableC4596w3;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4457o;
import com.ironsource.InterfaceC4586va;
import com.ironsource.InterfaceC4656zc;
import com.ironsource.Ke;
import com.ironsource.M7;
import com.ironsource.O5;
import com.ironsource.O7;
import com.ironsource.R1;
import com.ironsource.Rd;
import com.ironsource.Td;
import com.ironsource.Vd;
import com.ironsource.Wd;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class s extends m implements InterfaceC4586va, Wd, R1, O7, InterfaceC4656zc, InterfaceC4457o {
    private e A;
    private long B;
    private Boolean C;
    private final Object D;
    private O5 E;
    private final long F;
    private final M7.a G;
    private final M7 H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4603wa f44193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap<String, C4424m2> f44194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, h.a> f44195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C4424m2 f44196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f44197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f44198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JSONObject f44199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Vd f44200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f44203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f44204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NetworkStateReceiver f44206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f44207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConcurrentHashMap<String, t> f44208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Ke f44209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f44211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f44212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f44213y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f44214z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f44215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rd f44216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f44218d;

        a(NetworkSettings networkSettings, Rd rd2, String str, String str2) {
            this.f44215a = networkSettings;
            this.f44216b = rd2;
            this.f44217c = str;
            this.f44218d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.a(this.f44215a, this.f44216b, this.f44217c, this.f44218d);
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            s.this.j();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.d("makeAuction()");
            s.this.f44203o = new Date().getTime();
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            s.this.b(map, arrayList, sb2, arrayList2);
            s.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    class d implements C4647z3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f44222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f44223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f44224c;

        d(Map map, StringBuilder sb2, List list) {
            this.f44222a = map;
            this.f44223b = sb2;
            this.f44224c = list;
        }

        @Override // com.ironsource.C4647z3.b
        public void a(@NotNull List<A3> list, long j10, @NotNull List<String> list2) {
            s.this.c(A5.RV_COLLECT_TOKENS_COMPLETED, C4415la.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            for (A3 a32 : list) {
                t tVar = (t) s.this.f44208t.get(a32.c());
                if (a32.a() != null) {
                    this.f44222a.put(a32.c(), a32.a());
                    StringBuilder sb2 = this.f44223b;
                    sb2.append(a32.d());
                    sb2.append(a32.c());
                    sb2.append(StringUtils.COMMA);
                    if (tVar != null) {
                        tVar.a(A5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(a32.e())}});
                    }
                } else if (tVar != null) {
                    tVar.a(A5.RV_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(a32.e())}, new Object[]{"reason", a32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                t tVar2 = (t) s.this.f44208t.get(it.next());
                if (tVar2 != null) {
                    tVar2.a(A5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
                }
            }
            s.this.a((Map<String, Object>) this.f44222a, (List<String>) this.f44224c, this.f44223b.toString());
        }

        @Override // com.ironsource.C4647z3.b
        public void onFailure(String str) {
            s.this.c(A5.RV_COLLECT_TOKENS_FAILED, C4415la.a(new Object[][]{new Object[]{"reason", str}}));
            s.this.a((Map<String, Object>) this.f44222a, (List<String>) this.f44224c, this.f44223b.toString());
        }
    }

    private enum e {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public s(List<NetworkSettings> list, Rd rd2, String str, String str2, HashSet<ImpressionDataListener> hashSet, C4246ba c4246ba) throws Throwable {
        super(hashSet, c4246ba);
        this.f44204p = "";
        this.f44207s = false;
        this.f44210v = 1;
        this.D = new Object();
        this.G = Ib.O().x();
        this.H = Ib.U().w();
        long time = new Date().getTime();
        c(A5.RV_MANAGER_INIT_STARTED, C4415la.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.LWS_RV_MANAGER_NAME}}));
        a(e.RV_STATE_INITIATING);
        this.C = null;
        this.f44212x = rd2.g();
        this.f44213y = rd2.j();
        this.f44211w = "";
        this.f44199k = null;
        C4460o2 c4460o2K = rd2.k();
        this.f44214z = false;
        this.f44193e = new C4603wa(rd2.k().f(), rd2.k().i());
        this.f44194f = new ConcurrentHashMap<>();
        this.f44195g = new ConcurrentHashMap<>();
        this.B = new Date().getTime();
        this.f44201m = c4460o2K.g() > 0;
        this.f44202n = c4460o2K.n();
        if (this.f44201m) {
            this.f44198j = new com.ironsource.mediationsdk.e(IronSource.a.REWARDED_VIDEO, c4460o2K, this);
        }
        this.f44200l = new Vd(c4460o2K, this);
        ConcurrentHashMap<String, t> concurrentHashMap = new ConcurrentHashMap<>();
        this.f44208t = concurrentHashMap;
        a(list, rd2, str, str2);
        this.f44197i = new h(list, c4460o2K.c());
        Ke ke2 = new Ke();
        this.f44209u = ke2;
        ke2.a(new ArrayList(concurrentHashMap.values()));
        this.E = new O5(rd2.c(), this);
        this.F = rd2.l();
        c(A5.RV_MANAGER_INIT_ENDED, C4415la.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        a(c4460o2K.k());
    }

    private void a(List<NetworkSettings> list, Rd rd2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next(), rd2, str, str2));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(rd2.f(), rd2.o(), arrayList);
    }

    @Override // com.ironsource.InterfaceC4586va
    public void b(t tVar) {
        a(tVar, "onRewardedVideoAdStarted");
        C4606wd.a().c();
    }

    @Override // com.ironsource.InterfaceC4586va
    public void c(t tVar) {
        a(tVar, "onRewardedVideoAdClosed, mediation state: " + this.A.name());
        C4606wd.a().b(this.f44193e.a(tVar.u()));
        this.f44214z = false;
        boolean z10 = this.A == e.RV_STATE_READY_TO_SHOW;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            for (t tVar2 : this.f44193e.c()) {
                if (tVar2.y()) {
                    sb2.append(tVar2.c() + ";");
                }
            }
        }
        A5 a52 = A5.RV_INSTANCE_CLOSED;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("otherRVAvailable = ");
        sb3.append(sb2.length() > 0 ? "true|" + ((Object) sb2) : "false");
        tVar.b(a52, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}});
        if (tVar.equals(this.f44193e.f())) {
            this.f44193e.a((t) null);
            if (this.A != e.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
        }
    }

    @Override // com.ironsource.InterfaceC4586va
    public void e(t tVar) {
        a(tVar, "onRewardedVideoAdEnded");
        C4606wd.a().b();
    }

    @Override // com.ironsource.InterfaceC4586va
    public void f(t tVar) {
        this.f44193e.a(tVar);
        this.f44210v++;
        a(tVar, "onRewardedVideoAdOpened");
        if (this.f44201m) {
            C4424m2 c4424m2 = this.f44194f.get(tVar.c());
            if (c4424m2 != null) {
                C4603wa c4603wa = this.f44193e;
                c4603wa.a(c4603wa.d(), c4424m2.a(this.f44211w), c4424m2.d());
                this.f44198j.a(c4424m2, tVar.g(), this.f44196h, this.f44211w);
                this.f44195g.put(tVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
                a(c4424m2, this.f44211w);
            } else {
                String strC = tVar.c();
                c("onRewardedVideoAdOpened showing instance " + strC + " missing from waterfall");
                a(A5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C4415la.a(new Object[][]{new Object[]{"errorCode", 1011}, new Object[]{"reason", "Showing missing " + this.A}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
            }
        }
        C4606wd.a().c(this.f44193e.a(tVar.u()));
        b(false);
        this.f44200l.c();
    }

    private List<C4424m2> g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (t tVar : this.f44208t.values()) {
            if (!tVar.p() && !this.f44209u.b(tVar) && this.f44193e.b(tVar)) {
                copyOnWriteArrayList.add(new C4424m2(tVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void h() {
        a(e.RV_STATE_NOT_LOADED);
        if (!this.f44214z) {
            b(false);
        }
        this.f44200l.a();
    }

    private void i() throws Throwable {
        if (this.f44193e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(A5.TROUBLESHOOTING_RV_LOAD_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
            return;
        }
        a(e.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44193e.c().size() && i10 < this.f44212x; i11++) {
            t tVar = this.f44193e.c().get(i11);
            if (tVar.h()) {
                if (this.f44213y && tVar.p()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + tVar.c() + " as a non bidder is being loaded";
                        d(str);
                        IronSourceUtils.i(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + tVar.c() + ". No other instances will be loaded at the same time.";
                    d(str2);
                    IronSourceUtils.i(str2);
                    g(tVar);
                    return;
                }
                g(tVar);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.D) {
            try {
                e eVar = this.A;
                e eVar2 = e.RV_STATE_AUCTION_IN_PROGRESS;
                if (eVar != eVar2) {
                    a(eVar2);
                    AsyncTask.execute(new c());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k() {
        a(g(), "fallback_" + System.currentTimeMillis(), this.f44199k);
    }

    @Override // com.ironsource.O7
    public boolean d() {
        if ((!this.f44207s || IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) && this.A == e.RV_STATE_READY_TO_SHOW && !this.f44214z) {
            Iterator<t> it = this.f44193e.c().iterator();
            while (it.hasNext()) {
                if (it.next().A()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4586va
    public void b(t tVar, C4283dd c4283dd) {
        a(tVar, "onRewardedVideoAdClicked");
        C4606wd.a().a(c4283dd, this.f44193e.a(tVar.u()));
    }

    @Override // com.ironsource.Wd
    public void b() throws Throwable {
        d("onLoadTriggered: RV load was triggered in " + this.A + " state");
        a(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings, Rd rd2, String str, String str2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getRewardedVideoSettings(), false);
        if (abstractAdapterA != null) {
            t tVar = new t(str, str2, networkSettings, this, rd2.h(), abstractAdapterA, this.f44210v);
            this.f44208t.put(tVar.c(), tVar);
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        for (t tVar : this.f44208t.values()) {
            if (!this.f44209u.b(tVar) && this.f44193e.b(tVar)) {
                if (tVar.p()) {
                    list2.add(new CallableC4596w3(tVar.g(), tVar.c(), null, tVar, null, null));
                } else {
                    list.add(tVar.c());
                    sb2.append(tVar.g() + tVar.c() + StringUtils.COMMA);
                }
            }
        }
    }

    private void g(t tVar) throws Throwable {
        String strK = this.f44194f.get(tVar.c()).k();
        JSONObject jSONObjectA = this.f44194f.get(tVar.c()).a();
        tVar.c(strK);
        tVar.a(strK, jSONObjectA);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005b A[SYNTHETIC] */
    @Override // com.ironsource.InterfaceC4586va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.ironsource.mediationsdk.t r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.s.d(com.ironsource.mediationsdk.t):void");
    }

    private void b(boolean z10) {
        a(z10, (Map<String, Object>) null);
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 0);
    }

    private void c(t tVar, C4283dd c4283dd) {
        d("showVideo()");
        this.f44209u.a(tVar);
        if (this.f44209u.b(tVar)) {
            tVar.B();
            IronSourceUtils.i(tVar.c() + " rewarded video is now session capped");
        }
        M7.a aVar = this.G;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        String strC = c4283dd.c();
        IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
        aVar.a(applicationContext, strC, aVar2);
        if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c4283dd, aVar2)) {
            a(A5.RV_CAP_PLACEMENT);
        }
        this.E.a();
        tVar.a(c4283dd);
    }

    private void b(A5 a52) {
        a(a52, (Map<String, Object>) null, false, false);
    }

    private void b(A5 a52, Map<String, Object> map) {
        a(a52, map, true, true);
    }

    @Override // com.ironsource.O7
    public void a(Activity activity, C4283dd c4283dd) {
        synchronized (this.D) {
            try {
                if (c4283dd == null) {
                    a("showRewardedVideo error: empty default placement");
                    IronSourceError ironSourceError = new IronSourceError(1021, "showRewardedVideo error: empty default placement");
                    C4606wd c4606wdA = C4606wd.a();
                    C4603wa c4603wa = this.f44193e;
                    c4606wdA.a(ironSourceError, c4603wa.a(c4603wa.d()));
                    a(A5.RV_CALLBACK_SHOW_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 1021}, new Object[]{"reason", "showRewardedVideo error: empty default placement"}}), false, true);
                    return;
                }
                this.f44211w = c4283dd.c();
                b("showRewardedVideo(" + c4283dd + ")");
                t tVar = null;
                b(A5.RV_API_SHOW_CALLED, activity != null ? C4415la.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW}}) : null);
                if (this.f44214z) {
                    a("showRewardedVideo error: can't show ad while an ad is already showing");
                    IronSourceError ironSourceError2 = new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing");
                    C4606wd c4606wdA2 = C4606wd.a();
                    C4603wa c4603wa2 = this.f44193e;
                    c4606wdA2.a(ironSourceError2, c4603wa2.a(c4603wa2.d()));
                    b(A5.RV_CALLBACK_SHOW_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 1022}, new Object[]{"reason", "showRewardedVideo error: can't show ad while an ad is already showing"}}));
                    return;
                }
                if (this.A != e.RV_STATE_READY_TO_SHOW) {
                    a("showRewardedVideo error: show called while no ads are available");
                    IronSourceError ironSourceError3 = new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available");
                    C4606wd c4606wdA3 = C4606wd.a();
                    C4603wa c4603wa3 = this.f44193e;
                    c4606wdA3.a(ironSourceError3, c4603wa3.a(c4603wa3.d()));
                    b(A5.RV_CALLBACK_SHOW_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 1023}, new Object[]{"reason", "showRewardedVideo error: show called while no ads are available"}}));
                    return;
                }
                if (this.H.c(ContextProvider.getInstance().getApplicationContext(), c4283dd, IronSource.a.REWARDED_VIDEO)) {
                    String str = "showRewardedVideo error: placement " + this.f44211w + " is capped";
                    a(str);
                    IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
                    C4606wd c4606wdA4 = C4606wd.a();
                    C4603wa c4603wa4 = this.f44193e;
                    c4606wdA4.a(ironSourceError4, c4603wa4.a(c4603wa4.d()));
                    b(A5.RV_CALLBACK_SHOW_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_PLACEMENT_CAPPED)}, new Object[]{"reason", str}}));
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<t> it = this.f44193e.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t next = it.next();
                    if (next.A()) {
                        this.f44214z = true;
                        next.b(true);
                        a(e.RV_STATE_NOT_LOADED);
                        tVar = next;
                        break;
                    }
                    if (next.e() != null) {
                        stringBuffer.append(next.c() + StringUtils.PROCESS_POSTFIX_DELIMITER + next.e() + StringUtils.COMMA);
                    }
                    next.b(false);
                }
                if (tVar == null) {
                    d("showRewardedVideo(): No ads to show");
                    C4606wd c4606wdA5 = C4606wd.a();
                    IronSourceError ironSourceErrorBuildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    C4603wa c4603wa5 = this.f44193e;
                    c4606wdA5.a(ironSourceErrorBuildNoAdsToShowError, c4603wa5.a(c4603wa5.d()));
                    HashMap map = new HashMap();
                    map.put("errorCode", 509);
                    map.put("reason", "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        map.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    b(A5.RV_CALLBACK_SHOW_FAILED, map);
                    this.f44200l.b();
                    return;
                }
                c(tVar, c4283dd);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(A5 a52) {
        return a52 == A5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS || a52 == A5.RV_AUCTION_SUCCESS || a52 == A5.RV_AUCTION_FAILED || a52 == A5.RV_AD_UNIT_CAPPED;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(A5 a52, Map<String, Object> map) {
        a(a52, map, false, false);
    }

    private boolean c(boolean z10) {
        Boolean bool = this.C;
        if (bool == null) {
            return false;
        }
        if (z10 && !bool.booleanValue() && d()) {
            return true;
        }
        return !z10 && this.C.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: " + str, 0);
    }

    @Override // com.ironsource.InterfaceC4586va
    public void a(t tVar) {
        synchronized (this.D) {
            try {
                a(tVar, "onLoadSuccess mState=" + this.A);
                if (tVar.u() == this.f44193e.d() && this.A != e.RV_STATE_AUCTION_IN_PROGRESS) {
                    this.f44195g.put(tVar.c(), h.a.ISAuctionPerformanceLoadedSuccessfully);
                    e eVar = this.A;
                    e eVar2 = e.RV_STATE_LOADING_SMASHES;
                    if (eVar == eVar2) {
                        a(e.RV_STATE_READY_TO_SHOW);
                        a(A5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, C4415la.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f44203o)}}));
                        this.E.a(0L);
                        if (this.f44201m) {
                            C4424m2 c4424m2 = this.f44194f.get(tVar.c());
                            if (c4424m2 != null) {
                                C4603wa c4603wa = this.f44193e;
                                c4603wa.a(c4603wa.d(), c4424m2.a(""), c4424m2.d());
                                this.f44198j.a(c4424m2, tVar.g(), this.f44196h);
                                this.f44198j.a(this.f44193e.c(), this.f44194f, tVar.g(), this.f44196h, c4424m2);
                            } else {
                                String strC = tVar.c();
                                c("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId: " + tVar.u() + " and the current id is " + this.f44193e.d());
                                A5 a52 = A5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Loaded missing ");
                                sb2.append(eVar2);
                                a(a52, C4415la.a(new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}}));
                            }
                        }
                        b(true);
                    }
                    return;
                }
                d("onLoadSuccess was invoked with auctionId: " + tVar.u() + " and the current id is " + this.f44193e.d());
                A5 a53 = A5.RV_MANAGER_UNEXPECTED_STATE;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onLoadSuccess wrong auction ID ");
                sb3.append(this.A);
                tVar.a(a53, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", sb3.toString()}});
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ironsource.InterfaceC4586va
    public void a(IronSourceError ironSourceError, t tVar) {
        C4424m2 c4424m2;
        if (this.f44201m && (c4424m2 = this.f44194f.get(tVar.c())) != null) {
            C4603wa c4603wa = this.f44193e;
            c4603wa.a(c4603wa.d(), c4424m2.a(this.f44211w), c4424m2.d());
        }
        a(tVar, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f44214z = false;
        b(A5.RV_CALLBACK_SHOW_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}}));
        C4606wd.a().a(ironSourceError, this.f44193e.a(tVar.u()));
        this.f44195g.put(tVar.c(), h.a.ISAuctionPerformanceFailedToShow);
        if (this.A != e.RV_STATE_READY_TO_SHOW) {
            b(false);
        }
        this.f44200l.b();
    }

    @Override // com.ironsource.InterfaceC4586va
    public void a(t tVar, C4283dd c4283dd) {
        a(tVar, "onRewardedVideoAdRewarded");
        C4606wd.a().b(c4283dd, this.f44193e.a(tVar.u()));
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) throws Throwable {
        d("makeAuction(): success");
        this.f44196h = c4424m2;
        this.f44205q = i10;
        this.f44199k = jSONObject;
        this.f44204p = "";
        if (!TextUtils.isEmpty(str2)) {
            a(A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str2}}));
        }
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        a(jSONObject2, aVar);
        if (this.f44095b.a(aVar)) {
            a(A5.RV_AD_UNIT_CAPPED, C4415la.a(new Object[][]{new Object[]{"auctionId", str}}));
            h();
        } else {
            a(list, str, this.f44199k);
            a(A5.RV_AUCTION_SUCCESS, C4415la.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
            i();
        }
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) throws Throwable {
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        d(str3);
        IronSourceUtils.i("RV: " + str3);
        this.f44205q = i11;
        this.f44204p = str2;
        this.f44199k = null;
        if (this.f44202n) {
            d("Moving to fallback waterfall");
            k();
        }
        if (TextUtils.isEmpty(str)) {
            a(A5.RV_AUCTION_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}));
        } else {
            a(A5.RV_AUCTION_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j10)}}));
        }
        i();
    }

    private void a(long j10) throws Throwable {
        if (this.f44209u.a()) {
            d("all smashes are capped");
            a(A5.TROUBLESHOOTING_RV_LOAD_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 80001}, new Object[]{"reason", "all smashes are capped"}}));
            h();
            return;
        }
        a(IronSource.a.REWARDED_VIDEO);
        if (this.f44201m) {
            if (!this.f44195g.isEmpty()) {
                this.f44197i.a(this.f44195g);
                this.f44195g.clear();
            }
            new Timer().schedule(new b(), j10);
            return;
        }
        d("auction fallback flow starting");
        k();
        if (this.f44193e.c().isEmpty()) {
            d("loadSmashes -  waterfall is empty");
            a(A5.TROUBLESHOOTING_RV_LOAD_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 80004}, new Object[]{"reason", "waterfall is empty"}}));
            h();
        } else {
            b(A5.RV_BUSINESS_MEDIATION_LOAD);
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2.toString());
            return;
        }
        C4647z3 c4647z3 = new C4647z3();
        d dVar = new d(map, sb2, list);
        b(A5.RV_COLLECT_TOKENS);
        c4647z3.a(list2, dVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, String str) {
        if (map.keySet().size() == 0 && list.size() == 0) {
            c(A5.RV_AUCTION_FAILED, C4415la.a(new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{"duration", 0}}));
            d("makeAuction() failed - No candidates available for auctioning");
            h();
            return;
        }
        d("makeAuction() - request waterfall is: " + str);
        b(A5.RV_BUSINESS_MEDIATION_LOAD);
        b(A5.RV_AUCTION_REQUEST);
        c(A5.RV_AUCTION_REQUEST_WATERFALL, C4415la.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, str.toString()}}));
        this.f44198j.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f44197i, this.f44210v, this.f44096c);
    }

    private void a(List<C4424m2> list, String str, JSONObject jSONObject) {
        this.f44194f.clear();
        this.f44195g.clear();
        CopyOnWriteArrayList<t> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        for (C4424m2 c4424m2 : list) {
            sb2.append(a(c4424m2) + StringUtils.COMMA);
            t tVar = this.f44208t.get(c4424m2.c());
            if (tVar != null) {
                AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(tVar.f43736b.h());
                if (abstractAdapterA != null) {
                    t tVar2 = new t(tVar, this, abstractAdapterA, this.f44210v, str, jSONObject, this.f44205q, this.f44204p);
                    tVar2.a(true);
                    copyOnWriteArrayList.add(tVar2);
                    this.f44194f.put(tVar2.c(), c4424m2);
                    this.f44195g.put(c4424m2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                d("updateWaterfall() - could not find matching smash for auction response item " + c4424m2.c());
            }
        }
        this.f44193e.a(copyOnWriteArrayList, str);
        if (this.f44193e.a()) {
            a(A5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C4415la.a(new Object[][]{new Object[]{"reason", "waterfalls hold too many with size=" + this.f44193e.e()}}));
        }
        d("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            d("Updated waterfall is empty");
        }
        a(A5.RV_AUCTION_RESPONSE_WATERFALL, C4415la.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    private String a(C4424m2 c4424m2) {
        String string;
        t tVar = this.f44208t.get(c4424m2.c());
        if (tVar != null) {
            string = Integer.toString(tVar.g());
        } else {
            string = TextUtils.isEmpty(c4424m2.k()) ? "1" : "2";
        }
        return string + c4424m2.c();
    }

    private void a(e eVar) {
        d("current state=" + this.A + ", new state=" + eVar);
        this.A = eVar;
    }

    private void a(boolean z10, Map<String, Object> map) {
        A5 a52;
        synchronized (this.D) {
            try {
                Boolean bool = this.C;
                if (bool == null || bool.booleanValue() != z10) {
                    this.C = Boolean.valueOf(z10);
                    long time = new Date().getTime() - this.B;
                    this.B = new Date().getTime();
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    map.put("duration", Long.valueOf(time));
                    if (z10) {
                        a52 = A5.RV_CALLBACK_AVAILABILITY_TRUE;
                    } else {
                        a52 = A5.RV_CALLBACK_AVAILABILITY_FALSE;
                    }
                    a(a52, map);
                    C4606wd c4606wdA = C4606wd.a();
                    C4603wa c4603wa = this.f44193e;
                    c4606wdA.a(z10, c4603wa.a(c4603wa.d()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(t tVar, String str) {
        String str2 = tVar.c() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void a(A5 a52, Map<String, Object> map) {
        a(a52, map, false, true);
    }

    private void a(A5 a52) {
        a(a52, (Map<String, Object>) null, true, true);
    }

    private void a(A5 a52, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap();
        map2.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        map2.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f44193e.d())) {
            map2.put("auctionId", this.f44193e.d());
        }
        JSONObject jSONObject = this.f44199k;
        if (jSONObject != null && jSONObject.length() > 0) {
            map2.put("genericParams", this.f44199k);
        }
        if (z10 && !TextUtils.isEmpty(this.f44211w)) {
            map2.put("placement", this.f44211w);
        }
        if (c(a52)) {
            Td.i().a(map2, this.f44205q, this.f44204p);
        }
        map2.put("sessionDepth", Integer.valueOf(this.f44210v));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    map2.putAll(map);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        Td.i().a(new C4649z5(a52, new JSONObject(map2)));
    }

    @Override // com.ironsource.InterfaceC4457o
    public void a() throws Throwable {
        a(e.RV_STATE_NOT_LOADED);
        a(false, C4415la.a(new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{"reason", "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.InterfaceC4656zc
    public void a(boolean z10) {
        if (this.f44207s) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "Network Availability Changed To: " + z10, 0);
            if (c(z10)) {
                b(z10);
            }
        }
    }

    @Override // com.ironsource.O7
    public void a(Context context, boolean z10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f44207s = z10;
            if (z10) {
                if (this.f44206r == null) {
                    this.f44206r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f44206r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f44206r != null) {
                context.getApplicationContext().unregisterReceiver(this.f44206r);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }
}
