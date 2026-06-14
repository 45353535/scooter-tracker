package com.ironsource.mediationsdk;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.A3;
import com.ironsource.A5;
import com.ironsource.B3;
import com.ironsource.C4246ba;
import com.ironsource.C4324g3;
import com.ironsource.C4360i5;
import com.ironsource.C4424m2;
import com.ironsource.C4462o4;
import com.ironsource.C4544t2;
import com.ironsource.C4570ub;
import com.ironsource.C4647z3;
import com.ironsource.C4649z5;
import com.ironsource.CallableC4596w3;
import com.ironsource.G9;
import com.ironsource.H7;
import com.ironsource.I7;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4471od;
import com.ironsource.M7;
import com.ironsource.M8;
import com.ironsource.Mf;
import com.ironsource.R1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
public class y extends m implements InterfaceC4471od, R1 {
    private ConcurrentHashMap<String, h.a> A;
    private long B;
    private final Object C;
    private C4360i5 D;
    private boolean E;
    private final long F;
    private final Runnable G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M8 f44342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final M8.a f44343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M7 f44344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final M7.a f44345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f44346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f44347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4570ub f44348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f44349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4324g3 f44350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f44351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private z f44352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, z> f44354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CopyOnWriteArrayList<z> f44355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f44356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private JSONObject f44357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f44358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.ironsource.mediationsdk.e f44360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private C4424m2 f44361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f44362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConcurrentHashMap<String, C4424m2> f44363z;

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                y yVar = y.this;
                if (yVar.f44349l == null) {
                    IronLog.INTERNAL.verbose("mIronSourceBanner is null");
                    y.this.a(A5.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL)}});
                } else {
                    if (yVar.o()) {
                        y.this.v();
                        return;
                    }
                    IronLog.INTERNAL.verbose("banner is not visible, reload skipped");
                    y.this.a(A5.BN_SKIP_RELOAD, new Object[][]{new Object[]{"errorCode", 613}});
                    y.this.f44348k.a(TimeUnit.SECONDS.toMillis(r3.f44346i.f()));
                }
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                y.this.a(A5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, new Object[][]{new Object[]{"reason", th2.getMessage()}});
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.w();
            if (y.this.y()) {
                return;
            }
            y.this.a(A5.BN_AUCTION_REQUEST);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            y.this.b(map, arrayList, sb2, arrayList2);
            y.this.a(map, arrayList, sb2, arrayList2);
        }
    }

    class e implements C4647z3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f44371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f44372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f44373c;

        e(Map map, StringBuilder sb2, List list) {
            this.f44371a = map;
            this.f44372b = sb2;
            this.f44373c = list;
        }

        @Override // com.ironsource.C4647z3.b
        public void a(@NotNull List<A3> list, long j10, @NotNull List<String> list2) {
            y.this.a(A5.BN_COLLECT_TOKENS_COMPLETED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            for (A3 a32 : list) {
                if (a32.a() != null) {
                    this.f44371a.put(a32.c(), a32.a());
                    StringBuilder sb2 = this.f44372b;
                    sb2.append(a32.d());
                    sb2.append(a32.c());
                    sb2.append(StringUtils.COMMA);
                    ((z) y.this.f44354q.get(a32.c())).a(A5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(a32.e())}});
                } else {
                    ((z) y.this.f44354q.get(a32.c())).a(A5.BN_INSTANCE_COLLECT_TOKEN_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(a32.e())}, new Object[]{"reason", a32.b()}});
                }
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                ((z) y.this.f44354q.get(it.next())).a(A5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            }
            y.this.a((Map<String, Object>) this.f44371a, (List<String>) this.f44373c, this.f44372b);
        }

        @Override // com.ironsource.C4647z3.b
        public void onFailure(String str) {
            y.this.a(A5.BN_COLLECT_TOKENS_FAILED, new Object[][]{new Object[]{"duration", str}});
            y.this.a((Map<String, Object>) this.f44371a, (List<String>) this.f44373c, this.f44372b);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f44375a;

        f(NetworkSettings networkSettings) {
            this.f44375a = networkSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.a(this.f44375a);
        }
    }

    class g implements B3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f44377a;

        g(z zVar) {
            this.f44377a = zVar;
        }

        @Override // com.ironsource.B3
        public void a() {
            this.f44377a.D();
        }
    }

    class h extends TimerTask {
        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            y.this.u();
        }
    }

    enum i {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public y(List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C4246ba c4246ba) {
        this(Ib.U(), Ib.O(), list, kVar, hashSet, c4246ba);
    }

    private boolean a(i iVar, i iVar2) {
        boolean z10;
        synchronized (this.C) {
            try {
                if (this.f44347j == iVar) {
                    IronLog.INTERNAL.verbose("set state from '" + this.f44347j + "' to '" + iVar2 + "'");
                    this.f44347j = iVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f44347j);
        if (!a(i.STARTED_LOADING, this.f44346i.j() ? z10 ? i.AUCTION : i.FIRST_AUCTION : z10 ? i.RELOADING : i.LOADING)) {
            ironLog.error("wrong state - " + this.f44347j);
            return;
        }
        this.D = new C4360i5();
        this.f44356s = "";
        this.f44357t = null;
        this.f44351n = 0;
        this.f44353p = this.f44342e.a(IronSource.a.BANNER);
        if (z10) {
            a(A5.BN_RELOAD);
        } else {
            a(A5.BN_LOAD);
        }
        if (this.f44346i.j()) {
            u();
        } else {
            x();
            t();
        }
    }

    private void f(z zVar) {
        String strK;
        q qVar = this.f44349l;
        if (qVar == null || qVar.b()) {
            return;
        }
        q qVarC = null;
        if (zVar.p()) {
            strK = this.f44363z.get(zVar.c()).k();
            zVar.c(strK);
        } else {
            strK = null;
        }
        JSONObject jSONObjectA = this.f44363z.get(zVar.c()).a();
        try {
            qVarC = this.f44349l.c();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.verbose("Failed to make copy of banner layout: " + e10.getMessage());
        }
        zVar.a(qVarC, this.f44350m, strK, jSONObjectA);
    }

    @Override // com.ironsource.InterfaceC4471od
    public void c(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4544t2.a().f(this.f44097d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(A5.BN_CALLBACK_PRESENT_SCREEN, objArr, zVar.n());
    }

    @Override // com.ironsource.InterfaceC4471od
    public void e(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4544t2.a().e(this.f44097d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(A5.BN_CALLBACK_DISMISS_SCREEN, objArr, zVar.n());
    }

    private boolean g() {
        q qVar = this.f44349l;
        return (qVar == null || qVar.b()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f44352o != null) {
            IronLog.INTERNAL.verbose("mActiveSmash = " + this.f44352o.f());
            this.f44352o.t();
            this.f44352o = null;
        }
    }

    private List<C4424m2> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (z zVar : this.f44354q.values()) {
            if (!zVar.p() && !this.f44344g.c(ContextProvider.getInstance().getApplicationContext(), this.f44350m, IronSource.a.BANNER)) {
                copyOnWriteArrayList.add(new C4424m2(zVar.c()));
            }
        }
        return copyOnWriteArrayList;
    }

    private ISBannerSize j() {
        q qVar = this.f44349l;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.f44349l.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? ISBannerSize.f43742f : ISBannerSize.BANNER : this.f44349l.getSize();
    }

    private ISBannerSize k() {
        q qVar = this.f44349l;
        if (qVar != null) {
            return qVar.getSize();
        }
        return null;
    }

    private String l() {
        C4324g3 c4324g3 = this.f44350m;
        return c4324g3 != null ? c4324g3.c() : "";
    }

    private void m() {
        String str = this.f44355r.isEmpty() ? "Empty waterfall" : "Mediation No fill";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("errorReason = " + str);
        g((z) null);
        i iVar = i.LOADING;
        i iVar2 = i.READY_TO_LOAD;
        if (a(iVar, iVar2)) {
            a(A5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 606}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
        } else if (a(i.RELOADING, i.LOADED)) {
            a(A5.BN_CALLBACK_RELOAD_ERROR, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.D))}});
            n.a().b(IronSource.a.BANNER, new IronSourceError(606, str));
            this.f44348k.a(TimeUnit.SECONDS.toMillis(this.f44346i.f()));
        } else {
            a(iVar2);
            ironLog.error("wrong state = " + this.f44347j);
        }
    }

    private void n() {
        String strL = l();
        M7.a aVar = this.f44345h;
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSource.a aVar2 = IronSource.a.BANNER;
        aVar.a(applicationContext, strL, aVar2);
        if (this.f44344g.c(ContextProvider.getInstance().getApplicationContext(), this.f44350m, aVar2)) {
            a(A5.BN_PLACEMENT_CAPPED);
        }
    }

    private boolean p() {
        i iVar = this.f44347j;
        return iVar == i.RELOADING || iVar == i.AUCTION;
    }

    private boolean q() {
        boolean z10;
        synchronized (this.C) {
            z10 = this.f44347j == i.LOADED;
        }
        return z10;
    }

    private boolean r() {
        boolean z10;
        synchronized (this.C) {
            try {
                i iVar = this.f44347j;
                z10 = iVar == i.FIRST_AUCTION || iVar == i.AUCTION;
            } finally {
            }
        }
        return z10;
    }

    private boolean s() {
        boolean z10;
        synchronized (this.C) {
            try {
                i iVar = this.f44347j;
                z10 = iVar == i.LOADING || iVar == i.RELOADING;
            } finally {
            }
        }
        return z10;
    }

    private void t() {
        try {
            for (int i10 = this.f44351n; i10 < this.f44355r.size(); i10++) {
                z zVar = this.f44355r.get(i10);
                if (zVar.h()) {
                    IronLog.INTERNAL.verbose("loading smash - " + zVar.f());
                    this.f44351n = i10 + 1;
                    f(zVar);
                    return;
                }
            }
            m();
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            a(A5.TROUBLESHOOTING_BN_INTERNAL_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "loadNextSmash"}, new Object[]{"reason", Log.getStackTraceString(e10)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        IronLog.INTERNAL.verbose();
        AsyncTask.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (a(i.LOADED, i.STARTED_LOADING)) {
            b(true);
            return;
        }
        ironLog.error("wrong state = " + this.f44347j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A.isEmpty()) {
            return;
        }
        this.f44362y.a(this.A);
        this.A.clear();
    }

    private void x() {
        List<C4424m2> listI = i();
        this.f44356s = e();
        a(listI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        long jA = l.a(this.B, this.f44346i.h());
        if (jA <= 0) {
            return false;
        }
        IronLog.INTERNAL.verbose("waiting before auction - timeToWaitBeforeAuction = " + jA);
        new Timer().schedule(new h(), jA);
        return true;
    }

    @Override // com.ironsource.InterfaceC4471od
    public void d(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4544t2.a().b(this.f44097d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(A5.BN_CALLBACK_CLICK, objArr, zVar.n());
    }

    public boolean o() {
        if (!this.f44349l.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.f44349l.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.f44349l.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void g(z zVar) {
        for (z zVar2 : this.f44355r) {
            if (!zVar2.equals(zVar)) {
                zVar2.q();
            }
        }
    }

    y(I7 i72, H7 h72, List<NetworkSettings> list, k kVar, HashSet<ImpressionDataListener> hashSet, C4246ba c4246ba) {
        super(hashSet, c4246ba);
        this.f44347j = i.NONE;
        this.f44358u = "";
        this.C = new Object();
        this.E = false;
        c cVar = new c();
        this.G = cVar;
        M8 m8S = i72.s();
        this.f44342e = m8S;
        this.f44343f = h72.h();
        this.f44344g = i72.w();
        this.f44345h = h72.x();
        long time = new Date().getTime();
        a(A5.BN_MANAGER_INIT_STARTED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, IronSourceConstants.PROG_BN_MANAGER_NAME}});
        IronLog.INTERNAL.verbose("isAuctionEnabled = " + kVar.j());
        this.f44346i = kVar;
        this.f44354q = new ConcurrentHashMap<>();
        this.f44355r = new CopyOnWriteArrayList<>();
        this.f44363z = new ConcurrentHashMap<>();
        this.A = new ConcurrentHashMap<>();
        IronSource.a aVar = IronSource.a.BANNER;
        this.f44353p = m8S.a(aVar);
        n.a().a(aVar, this.f44346i.d());
        if (this.f44346i.j()) {
            this.f44360w = new com.ironsource.mediationsdk.e(aVar, this.f44346i.b(), this);
        }
        this.f44362y = new com.ironsource.mediationsdk.h(list, this.f44346i.b().c());
        a(list, kVar);
        this.B = new Date().getTime();
        a(i.READY_TO_LOAD);
        this.F = kVar.g();
        this.f44348k = new C4570ub(cVar, com.ironsource.lifecycle.b.d(), new Mf());
        a(A5.BN_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(i iVar) {
        IronLog.INTERNAL.verbose("from '" + this.f44347j + "' to '" + iVar + "'");
        synchronized (this.C) {
            this.f44347j = iVar;
        }
    }

    class b implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f44367a;

        b(q qVar) {
            this.f44367a = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog.INTERNAL.verbose("destroying banner");
            y.this.f44348k.b();
            y yVar = y.this;
            z zVar = yVar.f44352o;
            y.this.a(A5.BN_DESTROY, (Object[][]) null, zVar != null ? zVar.n() : yVar.f44353p);
            y.this.h();
            this.f44367a.a();
            y yVar2 = y.this;
            yVar2.f44349l = null;
            yVar2.f44350m = null;
            yVar2.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("destroy banner failed - errorMessage = " + str);
        }
    }

    public void a(q qVar, C4324g3 c4324g3) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        IronSource.a aVar = IronSource.a.BANNER;
        a(aVar);
        f();
        if (a(i.READY_TO_LOAD, i.STARTED_LOADING)) {
            if (!n.a().b(aVar)) {
                l.a(qVar, c4324g3, new a(c4324g3, qVar));
                return;
            } else {
                ironLog.verbose("can't load banner - already has pending invocation");
                return;
            }
        }
        IronLog.API.error("can't load banner - loadBanner already called and still in progress");
    }

    class a implements l.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4324g3 f44364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f44365b;

        a(C4324g3 c4324g3, q qVar) {
            this.f44364a = c4324g3;
            this.f44365b = qVar;
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("placement = " + this.f44364a.c());
            l.b(this.f44365b);
            y yVar = y.this;
            yVar.f44349l = this.f44365b;
            yVar.f44350m = this.f44364a;
            M7 m72 = yVar.f44344g;
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C4324g3 c4324g3 = this.f44364a;
            IronSource.a aVar = IronSource.a.BANNER;
            if (!m72.c(applicationContext, c4324g3, aVar)) {
                y.this.b(false);
                return;
            }
            ironLog.verbose("placement is capped");
            n.a().b(aVar, new IronSourceError(604, "placement " + this.f44364a.c() + " is capped"));
            y.this.a(A5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 604}});
            y.this.a(i.READY_TO_LOAD);
        }

        @Override // com.ironsource.mediationsdk.l.b
        public void a(String str) {
            IronLog.API.error("can't load banner - errorMessage = " + str);
        }
    }

    @Override // com.ironsource.InterfaceC4471od
    public void b(z zVar) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(zVar.f());
        if (g()) {
            C4544t2.a().c(this.f44097d);
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        a(A5.BN_CALLBACK_LEAVE_APP, objArr, zVar.n());
    }

    public void a(q qVar) {
        IronLog.INTERNAL.verbose();
        l.a(qVar, new b(qVar));
    }

    @Override // com.ironsource.R1
    public void a(List<C4424m2> list, String str, C4424m2 c4424m2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        i iVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (r()) {
            this.f44358u = "";
            this.f44356s = str;
            this.f44359v = i10;
            this.f44361x = c4424m2;
            this.f44357t = jSONObject;
            if (!TextUtils.isEmpty(str2)) {
                a(A5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(i11)}, new Object[]{"reason", str2}});
            }
            IronSource.a aVar = IronSource.a.BANNER;
            a(jSONObject2, aVar);
            if (this.f44095b.a(aVar)) {
                a(A5.BN_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}});
                i iVar2 = this.f44347j;
                a(i.READY_TO_LOAD);
                if (iVar2 == i.FIRST_AUCTION) {
                    n.a().b(aVar, new IronSourceError(IronSourceError.ERROR_AD_FORMAT_CAPPED, "Ad unit is capped"));
                    return;
                }
                return;
            }
            a(A5.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            if (this.f44347j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            a(A5.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, a(list)}});
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f44347j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        if (this.f44344g.c(ContextProvider.getInstance().getApplicationContext(), this.f44350m, IronSource.a.BANNER)) {
            return;
        }
        for (z zVar : this.f44354q.values()) {
            AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(zVar.f43738d, IronSource.a.BANNER, null, this.f44349l);
            if (zVar.p()) {
                list2.add(new CallableC4596w3(zVar.g(), zVar.c(), adDataCreateAdDataForNetworkAdapter, zVar, null, null));
            } else if (!zVar.p()) {
                list.add(zVar.c());
                sb2.append(zVar.g() + zVar.c() + StringUtils.COMMA);
            }
        }
    }

    private void b(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        if (this.f44349l != null) {
            zVar.E();
            l.a(this.f44349l, view, layoutParams, new g(zVar));
        }
    }

    private String b(C4424m2 c4424m2) {
        z zVar = this.f44354q.get(c4424m2.c());
        String str = "1";
        if (zVar == null ? !TextUtils.isEmpty(c4424m2.k()) : zVar.p()) {
            str = "2";
        }
        return str + c4424m2.c();
    }

    private boolean b(A5 a52) {
        return a52 == A5.BN_CALLBACK_RELOAD_ERROR || a52 == A5.BN_CALLBACK_LOAD_SUCCESS || a52 == A5.BN_CALLBACK_LOAD_ERROR || a52 == A5.BN_CALLBACK_RELOAD_SUCCESS || a52 == A5.BN_CALLBACK_SHOW || a52 == A5.BN_CALLBACK_CLICK || a52 == A5.BN_CALLBACK_LEAVE_APP || a52 == A5.BN_AUCTION_FAILED || a52 == A5.BN_AUCTION_SUCCESS || a52 == A5.BN_AD_UNIT_CAPPED;
    }

    @Override // com.ironsource.R1
    public void a(int i10, String str, int i11, String str2, long j10) {
        i iVar;
        String str3 = "Auction failed (error " + i10 + " - " + str + ")";
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(str3);
        IronSourceUtils.i("BN: " + str3);
        if (r()) {
            this.f44358u = str2;
            this.f44359v = i11;
            this.f44357t = null;
            if (this.f44346i.b().n()) {
                ironLog.verbose("Moving to fallback waterfall");
                x();
            }
            a(A5.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}, new Object[]{"errorCode", Integer.valueOf(i10)}, new Object[]{"reason", str}});
            if (this.f44347j == i.FIRST_AUCTION) {
                iVar = i.LOADING;
            } else {
                iVar = i.RELOADING;
            }
            a(iVar);
            t();
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f44347j);
    }

    @Override // com.ironsource.InterfaceC4471od
    public void a(z zVar, View view, FrameLayout.LayoutParams layoutParams) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + zVar.f());
        if (zVar.x() != this.f44356s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f44356s);
            zVar.a(A5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 2}, new Object[]{"reason", "Wrong auction id " + zVar.x() + " State - " + this.f44347j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            z zVar2 = this.f44352o;
            if (zVar2 != null) {
                zVar2.q();
            }
            g(zVar);
            this.f44352o = zVar;
            b(zVar, view, layoutParams);
            this.A.put(zVar.c(), h.a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f44346i.j()) {
                C4424m2 c4424m2 = this.f44363z.get(zVar.c());
                if (c4424m2 != null) {
                    a(c4424m2.a(l()), c4424m2.d());
                    this.f44360w.a(c4424m2, zVar.g(), this.f44361x);
                    this.f44360w.a(this.f44355r, this.f44363z, zVar.g(), this.f44361x, c4424m2);
                    if (!this.f44346i.b().r()) {
                        a(zVar, c4424m2);
                    }
                } else {
                    String strC = zVar.c();
                    ironLog.error("onLoadSuccess winner instance " + strC + " missing from waterfall. auctionId = " + this.f44356s);
                    a(A5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{"errorCode", 1010}, new Object[]{"reason", "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
                }
            }
            if (this.f44347j == i.LOADING) {
                if (g()) {
                    C4544t2.a().d(this.f44097d);
                    objArr = new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.D))}};
                } else {
                    objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}, new Object[]{"duration", Long.valueOf(C4360i5.a(this.D))}};
                }
                a(A5.BN_CALLBACK_LOAD_SUCCESS, objArr);
            } else {
                if (g()) {
                    C4544t2.a().d(this.f44097d);
                }
                IronSourceUtils.i("bannerReloadSucceeded");
                a(A5.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4360i5.a(this.D))}});
            }
            n();
            this.f44343f.b(IronSource.a.BANNER);
            a(i.LOADED);
            this.f44348k.a(TimeUnit.SECONDS.toMillis(this.f44346i.f()));
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f44347j);
    }

    @Override // com.ironsource.InterfaceC4471od
    public void a(IronSourceError ironSourceError, z zVar, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (zVar.x() != this.f44356s) {
            ironLog.error("invoked with auctionId: " + zVar.x() + " and the current id is " + this.f44356s);
            zVar.a(A5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 3}, new Object[]{"reason", "Wrong auction " + zVar.x() + " State - " + this.f44347j}, new Object[]{IronSourceConstants.EVENTS_EXT1, zVar.c()}});
            return;
        }
        if (s()) {
            this.A.put(zVar.c(), h.a.ISAuctionPerformanceFailedToLoad);
            t();
        } else {
            ironLog.warning("wrong state - mCurrentState = " + this.f44347j);
        }
    }

    @Override // com.ironsource.InterfaceC4471od
    public void a(z zVar) {
        C4424m2 c4424m2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(zVar.f());
        if (q()) {
            if (this.f44346i.j() && this.f44346i.b().r() && (c4424m2 = this.f44363z.get(zVar.c())) != null) {
                a(zVar, c4424m2);
            }
            a(A5.BN_CALLBACK_SHOW);
            return;
        }
        ironLog.warning("wrong state - mCurrentState = " + this.f44347j);
        String strC = zVar.c();
        a(A5.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f44347j}, new Object[]{IronSourceConstants.EVENTS_EXT1, strC}});
    }

    private void a(z zVar, C4424m2 c4424m2) {
        this.f44360w.a(c4424m2, zVar.g(), this.f44361x, l());
        a(this.f44363z.get(zVar.c()), l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2, List<CallableC4596w3> list2) {
        if (list2.isEmpty()) {
            a(map, list, sb2);
            return;
        }
        C4647z3 c4647z3 = new C4647z3();
        e eVar = new e(map, sb2, list);
        a(A5.BN_COLLECT_TOKENS);
        c4647z3.a(list2, eVar, this.F, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, Object> map, List<String> list, StringBuilder sb2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auction waterfallString = " + ((Object) sb2));
        if (map.size() == 0 && list.size() == 0) {
            a(A5.BN_AUCTION_FAILED, new Object[][]{new Object[]{"errorCode", 1005}, new Object[]{"duration", 0}});
            if (a(i.AUCTION, i.LOADED)) {
                this.f44348k.a(TimeUnit.SECONDS.toMillis(this.f44346i.f()));
                return;
            }
            n.a().b(IronSource.a.BANNER, new IronSourceError(1005, "No candidates available for auctioning"));
            a(A5.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", 1005}});
            a(i.READY_TO_LOAD);
            return;
        }
        a(A5.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
        com.ironsource.mediationsdk.e eVar = this.f44360w;
        if (eVar != null) {
            eVar.a(ContextProvider.getInstance().getApplicationContext(), map, list, this.f44362y, this.f44353p, this.f44096c, j());
        } else {
            ironLog.error("mAuctionHandler is null");
        }
    }

    private void a(List<NetworkSettings> list, k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<NetworkSettings> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f(it.next()));
        }
        IronSourceThreadManager.INSTANCE.executeTasks(kVar.c().l(), kVar.c().n(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(NetworkSettings networkSettings) {
        NetworkSettings networkSettings2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(String.format("Start initializing provider %s on thread %s", networkSettings.getProviderInstanceName(), Thread.currentThread().getName()));
        AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), false);
        if (abstractAdapterA != null) {
            networkSettings2 = networkSettings;
            z zVar = new z(this.f44346i, this, networkSettings2, abstractAdapterA, this.f44353p, p());
            this.f44354q.put(zVar.c(), zVar);
        } else {
            networkSettings2 = networkSettings;
            ironLog.verbose(networkSettings2.getProviderInstanceName() + " can't load adapter");
        }
        ironLog.verbose(String.format("Done initializing provider %s on thread %s", networkSettings2.getProviderInstanceName(), Thread.currentThread().getName()));
    }

    private String a(List<C4424m2> list) {
        IronLog.INTERNAL.verbose("waterfall.size() = " + list.size());
        this.f44355r.clear();
        this.f44363z.clear();
        this.A.clear();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4424m2 c4424m2 = list.get(i10);
            a(c4424m2);
            sb2.append(b(c4424m2));
            if (i10 != list.size() - 1) {
                sb2.append(StringUtils.COMMA);
            }
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb2.toString());
        return sb2.toString();
    }

    private void a(C4424m2 c4424m2) {
        z zVar = this.f44354q.get(c4424m2.c());
        if (zVar != null) {
            AbstractAdapter abstractAdapterA = com.ironsource.mediationsdk.c.b().a(zVar.f43736b.h());
            if (abstractAdapterA != null) {
                z zVar2 = new z(this.f44346i, this, zVar.f43736b.h(), abstractAdapterA, this.f44353p, this.f44356s, this.f44357t, this.f44359v, this.f44358u, p());
                zVar2.a(true);
                this.f44355r.add(zVar2);
                this.f44363z.put(zVar2.c(), c4424m2);
                this.A.put(c4424m2.c(), h.a.ISAuctionPerformanceDidntAttemptToLoad);
                return;
            }
            return;
        }
        IronLog.INTERNAL.error("could not find matching smash for auction response item - item = " + c4424m2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(A5 a52) {
        a(a52, (Object[][]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(A5 a52, Object[][] objArr) {
        a(a52, objArr, this.f44353p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(A5 a52, Object[][] objArr, int i10) {
        JSONObject jSONObjectA = IronSourceUtils.a(false, true, 1);
        try {
            ISBannerSize iSBannerSizeK = k();
            if (iSBannerSizeK != null) {
                a(jSONObjectA, iSBannerSizeK);
            }
            if (this.f44350m != null) {
                jSONObjectA.put("placement", l());
            }
            jSONObjectA.put("sessionDepth", i10);
            if (!TextUtils.isEmpty(this.f44356s)) {
                jSONObjectA.put("auctionId", this.f44356s);
            }
            JSONObject jSONObject = this.f44357t;
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObjectA.put("genericParams", this.f44357t);
            }
            if (b(a52)) {
                jSONObjectA.put(IronSourceConstants.AUCTION_TRIALS, this.f44359v);
                if (!TextUtils.isEmpty(this.f44358u)) {
                    jSONObjectA.put(IronSourceConstants.AUCTION_FALLBACK, this.f44358u);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    jSONObjectA.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
        G9.i().a(new C4649z5(a52, jSONObjectA));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(org.json.JSONObject r7, com.ironsource.mediationsdk.ISBannerSize r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.y.a(org.json.JSONObject, com.ironsource.mediationsdk.ISBannerSize):void");
    }
}
