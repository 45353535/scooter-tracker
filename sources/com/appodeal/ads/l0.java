package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.MediationEvent;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.network.NetworkStateObserver;
import com.appodeal.ads.network.NetworkStatus;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.ironsource.X1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f13561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkStatus f13562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b9 f13563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.appodeal.ads.utils.session.r f13564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.appodeal.ads.initializing.j f13565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AdType f13566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i2 f13567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.appodeal.ads.segments.o f13573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.appodeal.ads.waterfall_filter.a f13575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xe f13576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public te f13581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public te f13582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13584x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13585y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ff f13586z;

    public l0(AdType adType, i2 i2Var) {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f13561a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        NetworkStatus networkStatus = NetworkStatus.INSTANCE;
        this.f13562b = networkStatus;
        this.f13563c = b9.f13136b;
        this.f13564d = com.appodeal.ads.utils.session.r.f15109b;
        this.f13565e = com.appodeal.ads.initializing.j.f13479b;
        this.f13568h = new ArrayList();
        this.f13569i = false;
        this.f13570j = false;
        this.f13571k = false;
        this.f13572l = true;
        this.f13576p = null;
        this.f13578r = false;
        this.f13579s = false;
        this.f13580t = false;
        this.f13583w = 1.2f;
        this.f13584x = 2.0f;
        this.f13585y = 5000;
        this.f13586z = new ff(this);
        this.f13566f = adType;
        this.f13567g = i2Var;
        this.f13573m = com.appodeal.ads.segments.q.a("default");
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(this, "controller");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        i2Var.f13410c = this;
        com.appodeal.ads.segments.m0 listener = new com.appodeal.ads.segments.m0() { // from class: com.appodeal.ads.a0
            @Override // com.appodeal.ads.segments.m0
            public final void a() {
                this.f11865a.J();
            }
        };
        Lazy lazy = com.appodeal.ads.segments.s0.f14510a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.appodeal.ads.segments.s0.f14513d.add(listener);
        jf callback = new jf(this);
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.appodeal.ads.segments.q.f14505d.add(callback);
        networkStatus.subscribe(new NetworkStateObserver.ConnectionListener() { // from class: com.appodeal.ads.b0
            @Override // com.appodeal.ads.network.NetworkStateObserver.ConnectionListener
            public final void onAvailable() {
                this.f13104a.M();
            }
        });
    }

    public static Event r(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallStart(adTypeU, strS, str);
    }

    public static Event x(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallStart(adTypeU, strS, str);
    }

    public static Unit z(te teVar) {
        teVar.B = false;
        teVar.A = true;
        return Unit.f93236a;
    }

    public final te A() {
        te teVar;
        if (this.f13568h.isEmpty()) {
            teVar = null;
        } else {
            teVar = (te) this.f13568h.get(r0.size() - 1);
        }
        loop0: while (true) {
            te teVar2 = teVar;
            while (teVar2 != null) {
                teVar2 = teVar2.G;
                if (teVar2 == null) {
                    break loop0;
                }
                if (teVar2.f14907s >= teVar.f14907s) {
                    break;
                }
            }
            teVar = teVar2;
        }
        return teVar;
    }

    public final void B(te teVar) {
        if (p(teVar)) {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f15220b.G();
                }
            });
            d9 d9Var = (d9) h2.f13370d.getValue();
            AdType adType = this.f13566f;
            d9Var.getClass();
            Intrinsics.checkNotNullParameter(adType, "adType");
            eg.i.d((CoroutineScope) d9Var.f13236a.getValue(), null, null, new v8(d9Var, adType, null), 3, null);
            j(teVar, 0, true, false);
            return;
        }
        if (teVar.f14889a.isEmpty()) {
            com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f15303b.I();
                }
            });
            this.f13567g.Q(teVar, null, LoadingError.NoFill);
            return;
        }
        com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f15265b.H();
            }
        });
        d9 d9Var2 = (d9) h2.f13370d.getValue();
        AdType adType2 = this.f13566f;
        d9Var2.getClass();
        Intrinsics.checkNotNullParameter(adType2, "adType");
        eg.i.d((CoroutineScope) d9Var2.f13236a.getValue(), null, null, new v8(d9Var2, adType2, null), 3, null);
        j(teVar, 0, false, false);
    }

    public final double C() {
        com.appodeal.ads.segments.i0 i0Var = com.appodeal.ads.segments.s0.g().f14484b;
        AdType adType = this.f13566f;
        JSONObject jSONObjectOptJSONObject = i0Var.f14479a.optJSONObject("price_floor");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optDouble(com.appodeal.ads.segments.l0.a(adType), -1.0d);
        }
        return -1.0d;
    }

    public abstract String D();

    public void E() {
        if (this.f13570j && this.f13572l) {
            te teVarA = A();
            if (teVarA == null || (teVarA.h() && !teVarA.F)) {
                t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
        }
    }

    public boolean F() {
        te teVarA = A();
        return teVarA != null && teVarA.v();
    }

    public final com.appodeal.ads.analytics.breadcrumbs.e G() {
        AdType adType = this.f13566f;
        Intrinsics.checkNotNullParameter(LogConstants.EVENT_WATERFALL_START, "event");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_START, adType, null);
    }

    public final com.appodeal.ads.analytics.breadcrumbs.e H() {
        AdType adType = this.f13566f;
        Intrinsics.checkNotNullParameter(LogConstants.EVENT_WATERFALL_START, "event");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_START, adType, null);
    }

    public final com.appodeal.ads.analytics.breadcrumbs.e I() {
        AdType adType = this.f13566f;
        Intrinsics.checkNotNullParameter(LogConstants.EVENT_WATERFALL_ERROR, "event");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_WATERFALL_ERROR, adType, null);
    }

    public final /* synthetic */ void J() {
        this.f13571k = true;
    }

    public final String K() {
        com.appodeal.ads.segments.o oVar = this.f13573m;
        if (oVar != null) {
            return String.valueOf(oVar.f14494a);
        }
        com.appodeal.ads.segments.o oVar2 = com.appodeal.ads.segments.o.f14492i;
        return X1.f42014f;
    }

    public final Long L() {
        Long l10;
        te teVarA = A();
        return Long.valueOf((teVarA == null || (l10 = teVarA.f14899k) == null) ? -1L : l10.longValue());
    }

    public void M() {
        if (this.f13579s && this.f13572l) {
            this.f13579s = false;
            t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
        }
    }

    public boolean N() {
        return this.f13578r;
    }

    public abstract uc a(te teVar, AdNetwork adNetwork, x2 x2Var);

    public abstract te b(xe xeVar);

    public void c() {
        for (int i10 = 0; i10 < this.f13568h.size(); i10++) {
            te teVar = (te) this.f13568h.get(i10);
            if (teVar != null && !teVar.E && teVar != this.f13581u && teVar != this.f13582v) {
                teVar.m();
            }
        }
    }

    public void d(Activity activity, int i10) {
        te teVarA = A();
        if (teVarA == null || !this.f13572l) {
            if (teVarA == null || teVarA.h() || this.f13571k) {
                t(activity);
            } else if (teVarA.f14911w) {
                this.f13567g.H(teVarA, teVarA.f14906r);
            }
        }
    }

    public void e(Activity activity, AppState appState) {
    }

    public abstract void f(Context context);

    public final void g(Context context, xe xeVar) {
        final te teVarB;
        com.appodeal.ads.waterfall_filter.a aVar;
        te teVar;
        this.f13576p = xeVar;
        try {
            if (!this.f13570j) {
                m(LogConstants.EVENT_REQUEST_FAILED, LogConstants.MSG_NOT_INITIALIZED);
                return;
            }
            if (!this.f13562b.isConnected()) {
                this.f13579s = true;
                m(LogConstants.EVENT_REQUEST_FAILED, "no internet connection");
                this.f13567g.Q(null, null, LoadingError.ConnectionError);
                return;
            }
            if (!this.f13563c.f13137a.f14931f.get() && !this.f13569i && !com.appodeal.ads.segments.s0.g().f14484b.e(this.f13566f)) {
                te teVarA = A();
                if (teVarA == null) {
                    boolean z10 = xeVar.f15260a;
                    Boolean bool = Boolean.FALSE;
                    m(LogConstants.EVENT_CACHE, "isDebug: " + z10 + ", isLoaded: " + bool + ", isLoading: " + bool);
                } else {
                    m(LogConstants.EVENT_CACHE, "isDebug: " + xeVar.f15260a + ", isLoaded: " + teVarA.f14911w + ", isLoading: " + teVarA.w());
                    if (!(this instanceof n)) {
                        com.appodeal.ads.utils.h.a(teVarA.f14906r);
                        Collection collectionValues = teVarA.f14904p.values();
                        if (collectionValues != null) {
                            Iterator it = collectionValues.iterator();
                            while (it.hasNext()) {
                                com.appodeal.ads.utils.h.a((uc) it.next());
                            }
                        }
                    }
                }
                teVarB = b(xeVar);
                try {
                    this.f13568h.add(teVarB);
                    this.f13581u = teVarB;
                    teVarB.f14908t.set(true);
                    teVarB.f14903o.compareAndSet(0L, System.currentTimeMillis());
                    com.appodeal.ads.segments.s0.b(context);
                    boolean z11 = h2.f13367a;
                    teVarB.f14899k = Long.valueOf(com.appodeal.ads.segments.s0.g().f14483a);
                    if (teVarB.f14895g || (aVar = this.f13575o) == null || System.currentTimeMillis() - aVar.f15206h > aVar.f15207i) {
                        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.g0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l0.r(teVarB);
                            }
                        });
                        k7.k(teVarB, xeVar, this, new w(this, teVarB, D()));
                    } else {
                        com.appodeal.ads.waterfall_filter.a aVar2 = this.f13575o;
                        if (aVar2 != null) {
                            String str = aVar2.f15205g;
                            if (str == null || str.length() == 0) {
                                teVar = null;
                                aVar2.a(teVar);
                                com.appodeal.ads.waterfall_filter.a aVar3 = this.f13575o;
                                teVarB.f14898j = aVar3.f15205g;
                                com.appodeal.ads.waterfall_filter.d dVar = aVar3.f15203e;
                                teVarB.f14889a = dVar.f15215b;
                                teVarB.f14890b = dVar.f15214a;
                            } else {
                                for (int size = this.f13568h.size() - 1; size >= 0; size--) {
                                    teVar = (te) this.f13568h.get(size);
                                    if (teVar.A && str.equals(teVar.f14898j)) {
                                        break;
                                    }
                                }
                                teVar = null;
                                aVar2.a(teVar);
                                com.appodeal.ads.waterfall_filter.a aVar32 = this.f13575o;
                                teVarB.f14898j = aVar32.f15205g;
                                com.appodeal.ads.waterfall_filter.d dVar2 = aVar32.f15203e;
                                teVarB.f14889a = dVar2.f15215b;
                                teVarB.f14890b = dVar2.f15214a;
                            }
                        }
                        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.f0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return l0.x(teVarB);
                            }
                        });
                        this.f13571k = false;
                        B(teVarB);
                    }
                    c();
                    return;
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    Log.log(e);
                    this.f13567g.Q(teVarB, null, LoadingError.InternalError);
                    return;
                }
            }
            m(LogConstants.EVENT_REQUEST_FAILED, "paused: " + this.f13563c.f13137a.f14931f.get() + ", disabled: " + this.f13569i + ", disabled by segment: " + com.appodeal.ads.segments.s0.g().f14484b.e(this.f13566f));
            this.f13567g.Q(null, null, LoadingError.InternalError);
        } catch (Exception e11) {
            e = e11;
            teVarB = null;
        }
    }

    public void h(Configuration configuration) {
    }

    public final synchronized void i(com.appodeal.ads.initializing.j jVar) {
        if (this.f13570j) {
            return;
        }
        try {
            com.appodeal.ads.utils.session.r rVar = this.f13564d;
            ff lifecycleCallback = this.f13586z;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
            rVar.f15110a.b(lifecycleCallback);
            this.f13565e = jVar;
            this.f13570j = true;
            Log.log(this.f13566f.getDisplayName(), LogConstants.EVENT_INITIALIZE, "done");
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.appodeal.ads.i2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.appodeal.ads.initializing.i] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.appodeal.ads.l0] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.appodeal.ads.modules.common.internal.adtype.AdType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.appodeal.ads.te] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(te teVar, int i10, boolean z10, boolean z11) {
        JSONObject adUnitJson;
        ?? adType;
        Object obj;
        Exception exc;
        ?? r72;
        ?? r62;
        boolean z12 = true;
        if (!this.f13562b.isConnected()) {
            this.f13567g.Q(teVar, null, LoadingError.ConnectionError);
            return;
        }
        if (teVar == null) {
            return;
        }
        if (z10 && teVar.f14890b.size() > i10) {
            adUnitJson = (JSONObject) teVar.f14890b.get(i10);
            if (!teVar.f14896h) {
                teVar.f14890b.remove(i10);
            }
        } else if (teVar.f14889a.size() > i10) {
            adUnitJson = (JSONObject) teVar.f14889a.get(i10);
            if (!teVar.f14896h) {
                teVar.f14889a.remove(i10);
            }
        } else {
            adUnitJson = null;
        }
        if (z11 && !teVar.f14896h) {
            teVar.f14889a.clear();
            teVar.f14890b.clear();
        }
        if (adUnitJson == null) {
            this.f13567g.n(teVar, null, null, LoadingError.InternalError);
            return;
        }
        Intrinsics.checkNotNullParameter(adUnitJson, "adUnitJson");
        x2 x2Var = new x2();
        x2Var.f15225b = adUnitJson;
        x2Var.f15226c = adUnitJson.optString("id");
        x2Var.f15228e = z10;
        x2Var.f15227d = adUnitJson.optString("status");
        x2Var.f15229f = adUnitJson.optDouble("ecpm", 0.0d);
        x2Var.f15230g = adUnitJson.optLong("exptime", 0L);
        x2Var.f15231h = adUnitJson.optInt("tmax", 0);
        x2Var.f15232i = adUnitJson.optBoolean("async");
        x2Var.f15233j = z6.e(adUnitJson, "mediator", null);
        x2Var.f15234k = z6.e(adUnitJson, "unit_name", null);
        x2Var.f15235l = adUnitJson.optInt("impression_interval", -1);
        if (adUnitJson.has("mute")) {
            x2Var.f15236m = Boolean.valueOf(adUnitJson.optBoolean("mute", false));
        }
        x2Var.f15237n = adUnitJson.optBoolean("use_exact_ecpm");
        x2Var.f15238o = adUnitJson.optBoolean("get_network_ecpm");
        if (TextUtils.isEmpty(x2Var.f15226c)) {
            this.f13567g.I(teVar, null, LoadingError.IncorrectAdunit);
            return;
        }
        teVar.e(x2Var);
        try {
            if (!(this instanceof n)) {
                try {
                    uc ucVar = teVar.f14906r;
                    if (ucVar != null && Double.compare(ucVar.f14937c.f15229f, x2Var.f15229f) >= 0) {
                        l(LogConstants.EVENT_LOAD_SKIPPED, x2Var, null);
                        if (!teVar.f14891c.contains(ucVar)) {
                            teVar.f14891c.add(ucVar);
                        }
                        teVar.f14894f.remove(x2Var);
                        ucVar.f14937c.f15228e = false;
                        this.f13567g.k0(teVar, ucVar);
                        return;
                    }
                } catch (Exception e10) {
                    exc = e10;
                    r62 = this;
                    r72 = teVar;
                }
            }
            JSONArray jSONArrayOptJSONArray = adUnitJson.optJSONArray("target_placements");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int i11 = 0;
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    if (teVar.f14904p.containsKey(jSONArrayOptJSONArray.optString(i12))) {
                        i11++;
                    }
                }
                if (i11 == jSONArrayOptJSONArray.length()) {
                    B(teVar);
                    return;
                }
            }
            String networkName = x2Var.f15227d;
            com.appodeal.ads.initializing.j jVar = this.f13565e;
            adType = this.f13566f;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(adType, "adType");
            obj = "networkName";
            Intrinsics.checkNotNullParameter(networkName, "networkName");
            AdNetwork adNetworkC = jVar.f13480a.c(adType, networkName);
            try {
                if (adNetworkC == null) {
                    this.f13567g.n(teVar, null, x2Var, LoadingError.AdapterNotFound);
                    return;
                }
                uc ucVarA = a(teVar, adNetworkC, x2Var);
                if (!(this instanceof n)) {
                    JSONArray jSONArrayOptJSONArray2 = adUnitJson.optJSONArray("target_placements");
                    ucVarA.f14939e.clear();
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                            ucVarA.f14939e.add(jSONArrayOptJSONArray2.optString(i13));
                        }
                    }
                }
                if (!q(teVar, ucVarA)) {
                    this.f13567g.n(teVar, ucVarA, x2Var, LoadingError.NoFill);
                    return;
                }
                if (z10) {
                    if (!teVar.f14892d.contains(ucVarA)) {
                        teVar.f14892d.add(ucVarA);
                    }
                } else if (!teVar.f14891c.contains(ucVarA)) {
                    teVar.f14891c.add(ucVarA);
                }
                if (h2.L() != Log.LogLevel.verbose) {
                    z12 = false;
                }
                adNetworkC.setLogging(z12);
                teVar.f14893e.add(ucVarA);
                m task = new m(this, teVar, ucVarA, ucVarA, teVar);
                if (teVar.f14895g || teVar.f14896h || !ucVarA.f14937c.f15232i) {
                    Handler handler = b6.f13134a;
                    Intrinsics.checkNotNullParameter(task, "task");
                    b6.f13134a.post(task);
                } else {
                    this.f13561a.submit(task);
                    if (teVar.f14890b.size() + teVar.f14889a.size() > 0) {
                        B(teVar);
                    }
                }
                d task2 = new d(this, teVar, ucVarA);
                long loadingTimeout = ucVarA.getLoadingTimeout();
                Handler handler2 = b6.f13134a;
                Intrinsics.checkNotNullParameter(task2, "task");
                b6.f13134a.postDelayed(task2, loadingTimeout);
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            adType = this;
            obj = teVar;
        }
        exc = e;
        r62 = adType;
        r72 = obj;
        Log.log(exc);
        r62.f13567g.n(r72, null, x2Var, LoadingError.InternalError);
    }

    public final void k(String networkName) {
        com.appodeal.ads.initializing.j jVar = this.f13565e;
        AdType adType = this.f13566f;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        jVar.f13480a.b(adType, networkName);
    }

    public final void l(String str, AdUnit adUnit, LoadingError loadingError) {
        if (h2.L() == Log.LogLevel.none) {
            return;
        }
        if (adUnit == null) {
            if (loadingError == null) {
                m(str, null);
                return;
            }
            m(str, loadingError.getDescription().toUpperCase() + " (" + loadingError.getCode() + ")");
            return;
        }
        String id2 = adUnit.getId();
        if (!TextUtils.isEmpty(id2) && TextUtils.getTrimmedLength(id2) > 5) {
            id2 = id2.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if (loadingError == null) {
            m(str, String.format(Locale.ENGLISH, "%s - eCPM: %.2f, precache: %s, expTime: %s, id: %s", z6.d(adUnit.getStatus()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id2));
        } else {
            m(str, String.format(Locale.ENGLISH, "%s - %s (%s) - eCPM: %.2f, precache: %s, expTime: %s, id: %s", z6.d(adUnit.getStatus()), loadingError.getDescription().toUpperCase(), Integer.valueOf(loadingError.getCode()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id2));
        }
    }

    public final void m(String str, String str2) {
        Log.log(this.f13566f.getDisplayName(), str, str2);
    }

    public abstract void n(JSONObject jSONObject);

    public final void o(boolean z10) {
        this.f13572l = z10;
    }

    public boolean p(te teVar) {
        return !teVar.f14890b.isEmpty();
    }

    public boolean q(te teVar, uc ucVar) {
        com.appodeal.ads.segments.o oVar = this.f13573m;
        AdType adType = this.f13566f;
        teVar.getClass();
        try {
            if (!ucVar.l()) {
                return true;
            }
            boolean z10 = true;
            int i10 = 0;
            while (i10 < ucVar.f14939e.size()) {
                String str = (String) ucVar.f14939e.get(i10);
                if (teVar.f14904p.containsKey(str)) {
                    uc ucVar2 = (uc) teVar.f14904p.get(str);
                    if (ucVar2 == null || oVar.c(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext(), adType, ucVar2.f14937c.f15229f)) {
                        i10++;
                        z10 = false;
                    } else {
                        teVar.n(ucVar2.f14937c.f15226c);
                    }
                }
                return true;
            }
            return z10;
        } catch (Exception e10) {
            Log.log(e10);
            return true;
        }
    }

    public final AdType s() {
        return this.f13566f;
    }

    public final void t(Context context) {
        if (h2.f13367a) {
            this.f13578r = true;
        } else {
            f(context);
        }
    }

    public final void u(final te teVar, uc ucVar) {
        te teVarB;
        if (teVar.A || teVar.B || teVar.f14894f.isEmpty()) {
            return;
        }
        teVar.B = true;
        if (ucVar != null && !teVar.f14891c.contains(ucVar)) {
            teVar.f14891c.add(ucVar);
        }
        try {
            m(LogConstants.EVENT_POSTBID_CACHE, "isDebug: " + teVar.f14895g + ", isLoaded: " + teVar.f14911w + ", isLoading: " + teVar.w());
            teVarB = b(this.f13576p);
            try {
                teVarB.G = teVar;
                this.f13568h.add(teVarB);
                this.f13581u = teVarB;
                teVarB.f14908t.set(true);
                teVarB.f14903o.compareAndSet(0L, System.currentTimeMillis());
                boolean z10 = h2.f13367a;
                teVarB.f14899k = Long.valueOf(com.appodeal.ads.segments.s0.g().f14483a);
                k7.h(this, teVar, new w(this, teVarB, D()), new Function0() { // from class: com.appodeal.ads.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return l0.z(teVar);
                    }
                });
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                Log.log(e);
                this.f13567g.Q(teVarB, null, LoadingError.InternalError);
            }
        } catch (Exception e11) {
            e = e11;
            teVarB = null;
        }
    }

    public final void v(boolean z10) {
        this.f13577q = z10;
    }

    public final long w() {
        com.appodeal.ads.waterfall_filter.a aVar = this.f13575o;
        if (aVar != null) {
            return aVar.f15208j;
        }
        return 0L;
    }

    public final com.appodeal.ads.segments.o y() {
        com.appodeal.ads.segments.o oVar = this.f13573m;
        return oVar == null ? com.appodeal.ads.segments.q.a("default") : oVar;
    }
}
