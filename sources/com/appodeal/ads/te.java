package com.appodeal.ads;

import android.text.TextUtils;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AdUnitsEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.MediationEvent;
import com.appodeal.ads.analytics.models.WaterfallResult;
import com.appodeal.ads.analytics.models.WaterfallType;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class te {
    public te G;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14898j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public uc f14906r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double f14907s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f14889a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f14890b = new ArrayList(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f14891c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f14892d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f14893e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f14894f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Long f14899k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14900l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14901m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14902n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f14903o = new AtomicLong(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f14904p = new HashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f14905q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f14908t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f14909u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f14910v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14911w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14912x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14913y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14914z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public final he H = new he();
    public final AtomicBoolean I = new AtomicBoolean(false);
    public final AtomicBoolean J = new AtomicBoolean(false);
    public final AtomicBoolean K = new AtomicBoolean(false);

    public te(xe xeVar) {
        if (xeVar != null) {
            this.f14895g = xeVar.f15260a;
            this.f14896h = xeVar.f15262c;
            this.f14897i = xeVar.f15264e;
        }
    }

    public static Event b(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        uc ucVar = adRequest.f14906r;
        WaterfallResult loaded = ucVar != null ? new WaterfallResult.Loaded(ucVar.f14937c.f15229f) : WaterfallResult.NoFill.INSTANCE;
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallCancel(adTypeU, strS, str, loaded);
    }

    public static void g(Collection collection) {
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                uc ucVar = (uc) it.next();
                if (ucVar != null) {
                    com.appodeal.ads.utils.h.a(ucVar);
                    ucVar.q();
                }
            }
            collection.clear();
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public static Event l(te adRequest) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        uc ucVar = adRequest.f14906r;
        WaterfallResult loaded = ucVar != null ? new WaterfallResult.Loaded(ucVar.f14937c.f15229f) : WaterfallResult.NoFill.INSTANCE;
        AdType adTypeU = adRequest.u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String strS = adRequest.s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        String str = adRequest.f14898j;
        if (str == null) {
            str = "";
        }
        return new MediationEvent.WaterfallFinish(adTypeU, strS, str, loaded);
    }

    public final void A() {
        this.f14908t.set(false);
        boolean z10 = this.I.get() || this.J.get();
        if (this.K.compareAndSet(false, true) && z10) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ke
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f13553b.x();
                }
            });
        }
    }

    public final Event a(uc adUnit) {
        Intrinsics.checkNotNullParameter(this, "adRequest");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new AdUnitsEvent.AdUnitStart(com.appodeal.ads.analytics.helper.a.a(this, adUnit));
    }

    public final void c(AdUnit adUnit, String str) {
        if (adUnit == null || adUnit.getRequestResult() == b3.f13111e || this.F || this.f14910v.get()) {
            return;
        }
        Log.log(u().getDisplayName(), LogConstants.EVENT_NETWORK_ERROR, z6.d(adUnit.getStatus()) + " - " + str);
    }

    public final void d(AdUnit adUnit, String str, Object obj) {
        if (str == null || obj == null) {
            if (str != null) {
                c(adUnit, str);
                return;
            } else {
                c(adUnit, "(network not provided any appropriate text or code)");
                return;
            }
        }
        c(adUnit, "(" + obj + ") " + str);
    }

    public final void e(final x2 x2Var) {
        if (x2Var.f15228e && this.I.compareAndSet(false, true)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.me
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f13665b.j(x2Var);
                }
            });
        } else if (!x2Var.f15228e && this.J.compareAndSet(false, true)) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ne
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f13898b.o(x2Var);
                }
            });
        }
        this.f14894f.add(x2Var);
    }

    public final void f(final x2 x2Var, LoadingError loadingError) {
        if (x2Var.f15243t == null) {
            b3 result = loadingError != null ? loadingError.getRequestResult() : b3.f13112f;
            Intrinsics.checkNotNullParameter(result, "result");
            x2Var.f15243t = result;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!x2Var.f15242s.getAndSet(true)) {
                x2Var.f15240q = jCurrentTimeMillis;
            }
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.je
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f13523b.r(x2Var);
                }
            });
        }
    }

    public final boolean h() {
        if (this.f14895g) {
            return false;
        }
        return !(this.f14911w || w()) || this.f14910v.get();
    }

    public final boolean i(String str) {
        return this.f14911w || this.f14912x || this.f14904p.containsKey(str);
    }

    public final /* synthetic */ Event j(x2 x2Var) {
        return com.appodeal.ads.analytics.helper.c.a(this, x2Var);
    }

    public final /* synthetic */ Event k(uc ucVar) {
        return com.appodeal.ads.analytics.helper.a.b(this, ucVar);
    }

    public final void m() {
        if (this.A) {
            Iterator it = this.f14891c.iterator();
            while (it.hasNext()) {
                ((uc) it.next()).q();
            }
            Iterator it2 = this.f14892d.iterator();
            while (it2.hasNext()) {
                ((uc) it2.next()).q();
            }
            Iterator it3 = this.f14893e.iterator();
            while (it3.hasNext()) {
                ((uc) it3.next()).q();
            }
            this.f14889a.clear();
            this.f14890b.clear();
            this.f14893e.clear();
            this.f14891c.clear();
            this.f14892d.clear();
            this.f14894f.clear();
            this.E = true;
            p();
            g(this.f14905q);
            g(this.f14904p.values());
        }
    }

    public final void n(String str) {
        try {
            Iterator it = this.f14904p.values().iterator();
            while (it.hasNext()) {
                if (((uc) it.next()).f14937c.f15226c.equals(str)) {
                    it.remove();
                }
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final /* synthetic */ Event o(x2 x2Var) {
        return com.appodeal.ads.analytics.helper.c.a(this, x2Var);
    }

    public final void p() {
        uc ucVar = this.f14906r;
        if (ucVar != null) {
            com.appodeal.ads.utils.h.a(ucVar);
            this.f14906r.q();
            this.f14906r = null;
            this.H.f13148a = null;
            this.f14911w = false;
            this.f14912x = false;
        }
    }

    public final void q(final uc ucVar) {
        if (TextUtils.isEmpty(ucVar.f14937c.f15226c)) {
            return;
        }
        x2 x2Var = ucVar.f14937c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!x2Var.f15241r.getAndSet(true)) {
            x2Var.f15239p = jCurrentTimeMillis;
        }
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ie
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f13435b.a(ucVar);
            }
        });
    }

    public final /* synthetic */ Event r(x2 x2Var) {
        return com.appodeal.ads.analytics.helper.a.b(this, x2Var);
    }

    public final String s() {
        String str = this.f14897i;
        return str == null ? "00000000-0000-0000-0000-000000000000" : str;
    }

    public final void t(final uc ucVar) {
        if (ucVar == null || TextUtils.isEmpty(ucVar.f14937c.f15226c)) {
            return;
        }
        x2 x2Var = ucVar.f14937c;
        if (x2Var.f15243t == null) {
            b3 result = b3.f13109c;
            Intrinsics.checkNotNullParameter(result, "result");
            x2Var.f15243t = result;
            x2 x2Var2 = ucVar.f14937c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!x2Var2.f15242s.getAndSet(true)) {
                x2Var2.f15240q = jCurrentTimeMillis;
            }
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.le
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f13627b.k(ucVar);
                }
            });
        }
    }

    public abstract AdType u();

    public final boolean v() {
        if (this.f14910v.get()) {
            return false;
        }
        return this.f14911w || this.f14912x;
    }

    public final boolean w() {
        return this.f14908t.get() && System.currentTimeMillis() - this.f14903o.get() <= UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    }

    public final Event x() {
        WaterfallType postBid;
        Intrinsics.checkNotNullParameter(this, "adRequest");
        uc ucVar = this.f14906r;
        WaterfallResult loaded = ucVar != null ? new WaterfallResult.Loaded(ucVar.f14937c.f15229f) : WaterfallResult.NoFill.INSTANCE;
        Intrinsics.checkNotNullParameter(this, "adRequest");
        te teVar = this.G;
        if (teVar == null) {
            postBid = WaterfallType.Main.INSTANCE;
        } else {
            int i10 = 0;
            while (teVar != null) {
                teVar = teVar.G;
                i10++;
            }
            postBid = new WaterfallType.PostBid(i10);
        }
        WaterfallType waterfallType = postBid;
        AdType adTypeU = u();
        Intrinsics.checkNotNullExpressionValue(adTypeU, "getType(...)");
        String str = this.f14898j;
        if (str == null) {
            str = "";
        }
        String strS = s();
        Intrinsics.checkNotNullExpressionValue(strS, "getImpressionId(...)");
        return new MediationEvent.WaterfallRoundFinish(waterfallType, adTypeU, strS, str, loaded);
    }

    public final void y() {
        Iterator it = this.f14894f.iterator();
        while (it.hasNext()) {
            b3 b3Var = ((x2) it.next()).f15243t;
            if (b3Var == null || b3Var == b3.f13117k) {
                final te teVar = this;
                while (true) {
                    te teVar2 = teVar.G;
                    if (teVar2 == null || teVar2.f14907s < teVar.f14907s) {
                        break;
                    } else {
                        teVar = teVar2;
                    }
                }
                AppodealAnalytics appodealAnalytics = AppodealAnalytics.INSTANCE;
                appodealAnalytics.internalEvent(new Function0() { // from class: com.appodeal.ads.oe
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return te.b(this.f14261b);
                    }
                });
                appodealAnalytics.internalEvent(new Function0() { // from class: com.appodeal.ads.pe
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return te.l(this.f14283b);
                    }
                });
                return;
            }
        }
    }

    public final void z() {
        this.f14910v.set(false);
        this.A = false;
        this.B = false;
        this.C = false;
        this.f14912x = false;
        this.f14911w = false;
        this.f14914z = false;
        this.D = false;
        this.f14913y = false;
    }
}
