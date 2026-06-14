package f1;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import e1.c;
import e1.k;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ua implements sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f71266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6 f71267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f71268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f71269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg f71270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x5 f71271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wc f71272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb f71273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f71274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q4 f71275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c4 f71276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f71277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j5 f71278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h9 f71279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r4 f71280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l5 f71281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f71282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f71283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConcurrentLinkedQueue f71284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f71285u;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d1.f f71286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e1.k f71287g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d1.f fVar, e1.k kVar) {
            super(0);
            this.f71286f = fVar;
            this.f71287g = kVar;
        }

        public final void a() {
            this.f71286f.a(this.f71287g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public ua(Context context, SharedPreferences sharedPreferences, t6 uiPoster, g0 privacyApi, AtomicReference sdkConfig, gg prefetcher, x5 downloader, wc session, qb videoCachePolicy, Lazy videoRepository, q4 initInstallRequest, c4 initConfigRequest, i reachability, j5 providerInstallerHelper, h9 identity, r4 openMeasurementManager, l5 telemetryManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(initInstallRequest, "initInstallRequest");
        Intrinsics.checkNotNullParameter(initConfigRequest, "initConfigRequest");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(providerInstallerHelper, "providerInstallerHelper");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        this.f71265a = context;
        this.f71266b = sharedPreferences;
        this.f71267c = uiPoster;
        this.f71268d = privacyApi;
        this.f71269e = sdkConfig;
        this.f71270f = prefetcher;
        this.f71271g = downloader;
        this.f71272h = session;
        this.f71273i = videoCachePolicy;
        this.f71274j = videoRepository;
        this.f71275k = initInstallRequest;
        this.f71276l = initConfigRequest;
        this.f71277m = reachability;
        this.f71278n = providerInstallerHelper;
        this.f71279o = identity;
        this.f71280p = openMeasurementManager;
        this.f71281q = telemetryManager;
        this.f71283s = true;
        this.f71284t = new ConcurrentLinkedQueue();
    }

    @Override // f1.sd
    public void a(String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        e1.c c0859c = this.f71277m.e() ? new c.a.C0859c(errorMsg, null) : c.a.b.f68710h;
        if (this.f71283s) {
            b(c0859c);
        } else {
            i();
        }
        s();
    }

    public final void b(e1.c cVar) {
        j(cVar);
        c(f(cVar));
    }

    public final void c(e1.k kVar) {
        a();
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f71284t.poll();
            d1.f fVar = atomicReference != null ? (d1.f) atomicReference.get() : null;
            if (fVar == null) {
                this.f71285u = false;
                return;
            }
            this.f71267c.b(new a(fVar, kVar));
        }
    }

    public final void d(String str, String str2) {
        if (!y4.a(this.f71265a)) {
            b(new c.b.d("INTERNET and/or ACCESS_NETWORK_STATE permissions are not set.", null));
            return;
        }
        if (str.length() == 0 || str2.length() == 0 || str.length() != 24 || str2.length() != 40 || !nb.f70658a.g(str) || !nb.f70658a.g(str2)) {
            b(c.b.C0860b.f68718h);
            return;
        }
        this.f71278n.b();
        this.f71271g.f();
        if (l()) {
            o();
        } else {
            q();
        }
    }

    public final synchronized void e(String appId, String appSignature, d1.f onStarted, e1.c cVar) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        try {
            c0.f69488c.b();
            this.f71284t.add(new AtomicReference(onStarted));
        } catch (Exception e10) {
            eg.i("Cannot initialize Chartboost sdk due to internal error", e10);
            b(new c.b.a("Internal SDK error: " + e10.getMessage(), e10));
        }
        if (this.f71285u) {
            eg.j("Initialization already in progress", null, 2, null);
            return;
        }
        if (cVar != null) {
            b(cVar);
            return;
        }
        eg.e("Current session count: " + this.f71272h.c(), null, 2, null);
        if (this.f71272h.c() > 1) {
            this.f71283s = false;
        }
        this.f71285u = true;
        if (this.f71282r) {
            o();
        } else {
            d(appId, appSignature);
        }
        g();
    }

    public final e1.k f(e1.c cVar) {
        return new e1.k(cVar instanceof c.b.C0860b ? k.a.f68776c : ((cVar instanceof c.a.b) || (cVar instanceof c.a.C0858a)) ? k.a.f68777d : cVar instanceof c.a.C0859c ? k.a.f68778e : cVar instanceof c.b.C0861c ? k.a.f68783j : cVar instanceof c.b.d ? k.a.f68784k : k.a.f68779f, cVar);
    }

    public final void g() {
        if (this.f71268d.b("coppa") != null || this.f71282r) {
            return;
        }
        eg.p("COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.", null, 2, null);
    }

    public final void h(JSONObject jSONObject) {
        if (h8.f70006a.g()) {
            h8.b("Video player: " + new ga(jSONObject).c().i());
        }
    }

    public final void i() {
        this.f71280p.i();
        rf.f71003a.a(rd.f70996b.a().g());
        v();
        w();
        r();
        u();
        this.f71283s = false;
    }

    public final void j(e1.c cVar) {
        this.f71281q.h(new x0(null, cVar.getMessage(), cVar.g(), cVar.h(), cVar.d(), null, 1, null), CollectionsKt.emptyList());
    }

    public final void k(JSONObject jSONObject) {
        if (jSONObject == null || !y4.b(this.f71269e, jSONObject)) {
            return;
        }
        this.f71266b.edit().putString("config", jSONObject.toString()).apply();
    }

    public final boolean l() {
        String strP = p();
        return strP != null && strP.length() > 0;
    }

    public final boolean m() {
        return this.f71282r;
    }

    public final void n() {
        if (this.f71269e.get() == null || ((ga) this.f71269e.get()).f() == null) {
            return;
        }
        String strF = ((ga) this.f71269e.get()).f();
        Intrinsics.checkNotNullExpressionValue(strF, "getPublisherWarning(...)");
        eg.p(strF, null, 2, null);
    }

    public final void o() {
        c(null);
        this.f71282r = true;
        q();
    }

    public final String p() {
        return this.f71266b.getString("config", "");
    }

    public final void q() {
        this.f71276l.a(this);
    }

    public final void r() {
        n();
        ga gaVar = (ga) this.f71269e.get();
        if (gaVar != null) {
            this.f71268d.c(gaVar.C);
        }
        this.f71275k.a();
        t();
    }

    public final void s() {
        if (h8.f70006a.g()) {
            String strP = p();
            String str = JsonUtils.EMPTY_JSON;
            if (strP == null) {
                strP = JsonUtils.EMPTY_JSON;
            }
            if (strP.length() != 0) {
                str = strP;
            }
            h(new JSONObject(str));
        }
    }

    public final void t() {
        this.f71270f.e();
    }

    public final void u() {
        if (this.f71282r) {
            return;
        }
        c(null);
        this.f71282r = true;
    }

    public final void v() {
        u uVarG = ((ga) this.f71269e.get()).g();
        if (uVarG != null) {
            ld.f70416c.n(uVarG);
        }
    }

    public final void w() {
        ze zeVarC = ((ga) this.f71269e.get()).c();
        if (zeVarC != null) {
            this.f71273i.j(zeVarC.c());
            this.f71273i.f(zeVarC.d());
            this.f71273i.i(zeVarC.e());
            this.f71273i.l(zeVarC.f());
            this.f71273i.n(zeVarC.e());
            this.f71273i.p(zeVarC.h());
            this.f71273i.b(zeVarC.a());
        }
        ((q1) this.f71274j.getValue()).a(this.f71265a);
    }

    @Override // f1.sd
    public void a(JSONObject configJson) {
        Intrinsics.checkNotNullParameter(configJson, "configJson");
        k(configJson);
        i();
        h(configJson);
    }

    public final void a() {
        if (h8.f70006a.g()) {
            kf kfVarO = this.f71279o.o();
            h8.b("SetId: " + kfVarO.d() + " scope:" + kfVarO.e() + " Tracking state: " + kfVarO.f() + " Identifiers: " + kfVarO.b());
        }
    }
}
