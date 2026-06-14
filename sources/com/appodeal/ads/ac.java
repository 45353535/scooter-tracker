package com.appodeal.ads;

import android.animation.Animator;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.utils.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ac extends zd {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Handler f11893m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f11894a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t7 f11899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t7 f11900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f11901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a9 f11902i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11895b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f11896c = new WeakReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f11897d = new WeakReference(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11898e = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11903j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ja f11904k = new ja();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f11905l = new ConcurrentHashMap();

    public ac(t7 t7Var) {
        this.f11899f = t7Var;
    }

    public static Event F(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.CONTAINER_ERROR);
    }

    public static Event G(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.SHOW);
    }

    public static Event H(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.SHOW_PREVIOUS);
    }

    public static Event I(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.SHOW_PREVIOUS);
    }

    public static Event J(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_READY_ERROR);
    }

    public static Event K(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.ACTIVITY_ERROR);
    }

    public static Event L(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.PLACEMENT_ERROR);
    }

    public static Event M(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_READY_ERROR);
    }

    public static Event N(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_READY_ERROR);
    }

    public static Event O(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.PLACEMENT_ERROR);
    }

    public static Event e(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_INITIALIZED);
    }

    public static Event g(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_INITIALIZED);
    }

    public static Event h(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_VISIBLE);
    }

    public static Event i(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.FULLSCREEN_SHOWING);
    }

    public static Event j(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.FULLSCREEN_SHOWING);
    }

    public static /* synthetic */ com.appodeal.ads.analytics.breadcrumbs.e m(tc tcVar, s7 s7Var) {
        return new com.appodeal.ads.analytics.breadcrumbs.b(LogConstants.EVENT_SHOW, tcVar.u(), s7Var);
    }

    public static Event n(l0 l0Var, boolean z10) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, z10 ? SdkInternalEvent.Result.SHOW_PREVIOUS : SdkInternalEvent.Result.NOT_READY_ERROR);
    }

    public static void u(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        com.appodeal.ads.utils.q.a(view);
        ViewGroup viewGroup = (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) ? null : (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if ((viewGroup instanceof BannerView) && z10) {
                viewGroup.setVisibility(8);
            }
            if ((viewGroup instanceof MrecView) && z10) {
                viewGroup.setVisibility(8);
            }
            viewGroup.removeView(view);
        }
        if (viewGroup == null || viewGroup.getTag() == null || !viewGroup.getTag().equals("Appodeal") || !z11) {
            return;
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(viewGroup);
        }
    }

    public static void v(l0 l0Var, tc adRequest, s7 adObject) {
        i2 i2Var = l0Var.f13567g;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        i2Var.Y(adRequest, adObject, null);
    }

    public abstract boolean A(View view);

    public final boolean B(ic icVar, final l0 l0Var) {
        Activity activityA;
        ac acVar;
        Log.debug("ViewAdRenderer", "onRenderRequested", "start");
        if (!db.f13250l || (activityA = com.appodeal.ads.context.o.f13205b.getResumedActivity()) == null) {
            activityA = com.appodeal.ads.context.m.f13201b.f13202a.a();
        }
        Activity activity = activityA;
        if (activity == null) {
            Log.debug("ViewAdRenderer", "onRenderRequested", "Target activity can't be resolved");
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.xb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.K(l0Var);
                }
            });
            return false;
        }
        t7 t7Var = this.f11899f;
        t7 t7Var2 = icVar.f13433c;
        ja jaVarO = o(activity);
        com.appodeal.ads.segments.o oVar = icVar.f13256a;
        boolean z10 = icVar.f13257b;
        final tc tcVar = (tc) l0Var.A();
        if (tcVar == null) {
            Log.debug("ViewAdRenderer", "onRenderRequested", "No previous loaded ads");
            boolean z11 = icVar.f13257b;
            Boolean bool = Boolean.FALSE;
            l0Var.m(LogConstants.EVENT_SHOW, "isDebug: " + z11 + ", isLoaded: " + bool + ", isLoading: " + bool + ", placement: '" + oVar.f14495b + "'");
            if (!oVar.c(activity, l0Var.f13566f, 0.0d)) {
                Log.debug("ViewAdRenderer", "onRenderRequested", "Can't show for placement: " + oVar.f14494a);
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.hb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.L(l0Var);
                    }
                });
                return false;
            }
            if (z10 || !l0Var.f13572l) {
                Log.debug("ViewAdRenderer", "onRenderRequested", "Skipping cache because it's debug or not auto-cache");
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.jb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.N(l0Var);
                    }
                });
                return false;
            }
            Log.debug("ViewAdRenderer", "onRenderRequested", "Requesting cache");
            D(activity);
            jaVarO.f13516b = f3.VISIBLE;
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ib
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.M(l0Var);
                }
            });
            return true;
        }
        l0Var.m(LogConstants.EVENT_SHOW, "isDebug: " + icVar.f13257b + ", isLoaded: " + tcVar.f14911w + ", isLoading: " + tcVar.w() + ", placement: '" + oVar.f14495b + "'");
        if (!oVar.d(activity, l0Var.f13566f, tcVar)) {
            Log.debug("ViewAdRenderer", "onRenderRequested", "Can't show for placement: " + oVar.f14494a);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.kb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.O(l0Var);
                }
            });
            return false;
        }
        tc tcVar2 = (tc) l0Var.f13582v;
        if (z10 || icVar.f13434d) {
            acVar = this;
        } else {
            acVar = this;
            ja jaVarO2 = acVar.o(activity);
            f3 f3Var = jaVarO2.f13516b;
            f3 f3Var2 = f3.VISIBLE;
            if ((f3Var == f3Var2 || jaVarO2.f13515a != null) && !tcVar.f14895g && l0Var.f13572l && acVar.l(l0Var, tcVar2) > 0) {
                Log.debug("ViewAdRenderer", "onRenderRequested", "Showing previous ads");
                final boolean zY = acVar.y(activity, l0Var, t7Var2, t7Var);
                if (zY) {
                    jaVarO.f13516b = f3Var2;
                }
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.lb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.n(l0Var, zY);
                    }
                });
                return zY;
            }
        }
        if (tcVar.i(oVar.f14495b)) {
            String str = oVar.f14495b;
            uc ucVar = (str == null || !tcVar.f14904p.containsKey(str)) ? tcVar.f14906r : (uc) tcVar.f14904p.get(str);
            tcVar.f14906r = ucVar;
            final s7 s7Var = (s7) ucVar;
            if (s7Var != null) {
                if (acVar.E(activity) == null && t7Var2 == t7.f14869h) {
                    l0Var.m(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                    Log.debug("ViewAdRenderer", "onRenderRequested", "View container not found");
                    AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.mb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ac.F(l0Var);
                        }
                    });
                    return false;
                }
                com.appodeal.ads.analytics.breadcrumbs.n.f12678b.b(new Function0() { // from class: com.appodeal.ads.nb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.m(tcVar, s7Var);
                    }
                });
                Log.debug("ViewAdRenderer", "onRenderRequested", "Showing new ads");
                activity.runOnUiThread(new y7(acVar, tcVar, s7Var, oVar, activity, t7Var2, t7Var, l0Var));
                jaVarO.f13516b = f3.VISIBLE;
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ob
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.G(l0Var);
                    }
                });
                return true;
            }
        } else if (tcVar.w() || (tcVar.f14910v.get() && !l0Var.f13572l)) {
            Log.debug("ViewAdRenderer", "onRenderRequested", "Trying to show previous ads");
            if (acVar.y(activity, l0Var, t7Var2, t7Var) || (!z10 && l0Var.f13572l)) {
                jaVarO.f13516b = f3.VISIBLE;
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.zb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.H(l0Var);
                    }
                });
                return true;
            }
        } else {
            Log.debug("ViewAdRenderer", "onRenderRequested", "Trying to show previous ads");
            acVar.y(activity, l0Var, t7Var2, t7Var);
            if (!z10 && l0Var.f13572l) {
                Log.debug("ViewAdRenderer", "onRenderRequested", "Requesting cache");
                acVar.D(activity);
                jaVarO.f13516b = f3.VISIBLE;
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.pb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.I(l0Var);
                    }
                });
                return true;
            }
        }
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.yb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ac.J(l0Var);
            }
        });
        return false;
    }

    public final void C() {
        this.f11897d = new WeakReference(null);
    }

    public abstract void D(Activity activity);

    public final ViewGroup E(Activity activity) {
        View viewFindViewById = activity.findViewById(this.f11898e);
        if (viewFindViewById == null) {
            viewFindViewById = (View) this.f11897d.get();
        }
        if (viewFindViewById == null || A(viewFindViewById)) {
            return (ViewGroup) viewFindViewById;
        }
        throw new IllegalArgumentException("Only BannerView.class and MrecView.class are supported as target container for position type == AdDisplayPosition.VIEW");
    }

    public final void P(l0 l0Var) {
        uc ucVar;
        UnifiedAd unifiedAd;
        try {
            Handler handler = b6.f13134a;
            Intrinsics.checkNotNullParameter("ApdViewRendererUnrender", "name");
            View view = (View) this.f11896c.get();
            if (view == null) {
                Log.debug("ViewAdRenderer", "UnRender", "skip: no current ad view");
                return;
            }
            a9 a9Var = this.f11902i;
            if (a9Var != null) {
                f11893m.removeCallbacks(a9Var);
                this.f11902i = null;
            }
            tc tcVar = (tc) l0Var.f13582v;
            if (tcVar != null && (ucVar = tcVar.f14906r) != null && (unifiedAd = ((s7) ucVar).f14940f) != null) {
                unifiedAd.onHide();
            }
            view.setVisibility(8);
            WeakReference weakReference = this.f11901h;
            if (weakReference != null && weakReference.get() != null) {
                ((Animator) weakReference.get()).cancel();
            }
            u(view, true, true);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // com.appodeal.ads.zd
    public final void a(Activity activity, de deVar, l0 l0Var, md mdVar) {
        ic icVar = (ic) deVar;
        l0Var.m(LogConstants.EVENT_SHOW_FAILED, mdVar.f13664a);
        if (mdVar == md.f13660d || mdVar == md.f13659c) {
            o(activity).f13515a = icVar.f13433c;
        }
    }

    @Override // com.appodeal.ads.zd
    public final void b(l0 l0Var) {
        super.b(l0Var);
        Runnable task = new Runnable() { // from class: com.appodeal.ads.gb
            @Override // java.lang.Runnable
            public final void run() {
                this.f13358b.q();
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
    }

    @Override // com.appodeal.ads.zd
    public final boolean c(Activity activity, final l0 l0Var) {
        l0Var.m(LogConstants.EVENT_AD_HIDE, null);
        ja jaVarO = o(activity);
        jaVarO.f13515a = null;
        jaVarO.f13516b = f3.HIDDEN;
        if (this.f11896c.get() == null) {
            return false;
        }
        Runnable task = new Runnable() { // from class: com.appodeal.ads.rb
            @Override // java.lang.Runnable
            public final void run() {
                this.f14341b.P(l0Var);
            }
        };
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.post(task);
        return true;
    }

    @Override // com.appodeal.ads.zd
    public final /* bridge */ /* synthetic */ boolean d(Activity activity, de deVar, l0 l0Var) {
        return B((ic) deVar, l0Var);
    }

    public final long l(l0 l0Var, tc tcVar) {
        uc ucVar;
        if (tcVar == null || (ucVar = tcVar.f14906r) == null) {
            return 0L;
        }
        return Math.max(0L, (tcVar.f14900l + ((long) p(l0Var, (s7) ucVar).intValue())) - System.currentTimeMillis());
    }

    public final ja o(Activity activity) {
        ja jaVar;
        if (db.f13250l || activity == null) {
            return this.f11904k;
        }
        Iterator it = this.f11905l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                jaVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((WeakReference) entry.getKey()).get() == activity) {
                jaVar = (ja) entry.getValue();
                break;
            }
        }
        if (jaVar != null) {
            return jaVar;
        }
        ja jaVar2 = new ja();
        this.f11905l.put(new WeakReference(activity), jaVar2);
        return jaVar2;
    }

    public final Integer p(l0 l0Var, s7 s7Var) {
        int i10 = s7Var == null ? 0 : s7Var.f14937c.f15235l;
        if (i10 > 0) {
            return Integer.valueOf(i10);
        }
        JSONObject jSONObjectOptJSONObject = l0Var.y().f14496c.optJSONObject("impression_interval");
        int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("banner", -1) * 1000 : -1;
        if (iOptInt > 0) {
            this.f11894a = Integer.valueOf(iOptInt);
        } else if (this.f11894a == null) {
            this.f11894a = 15000;
        }
        return this.f11894a;
    }

    public final void q() {
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter("ApdViewRendererDestroy", "name");
        this.f11896c = new WeakReference(null);
        this.f11905l.clear();
    }

    public final void r(int i10) {
        this.f11898e = i10;
    }

    public final synchronized void s(Activity activity, l0 l0Var, long j10) {
        try {
            Log.debug("ViewAdRenderer", "Toggle refresh", "start");
            if (this.f11902i != null) {
                if (db.f13250l || com.appodeal.ads.context.m.f13201b.f13202a.a() == activity) {
                    Log.debug("ViewAdRenderer", "Toggle refresh", "skip: already pending");
                    return;
                } else {
                    f11893m.removeCallbacks(this.f11902i);
                    Log.debug("ViewAdRenderer", "Toggle refresh", "remove previous refresh runnable");
                }
            }
            Log.debug("ViewAdRenderer", "Toggle refresh", "create new refresh runnable");
            this.f11902i = new a9(this, l0Var);
            Log.debug("ViewAdRenderer", "Toggle refresh", "expect in " + j10 + "ms");
            f11893m.postDelayed(this.f11902i, j10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(android.app.Activity r19, com.appodeal.ads.tc r20, com.appodeal.ads.s7 r21, com.appodeal.ads.t7 r22, com.appodeal.ads.t7 r23, com.appodeal.ads.l0 r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.ac.t(android.app.Activity, com.appodeal.ads.tc, com.appodeal.ads.s7, com.appodeal.ads.t7, com.appodeal.ads.t7, com.appodeal.ads.l0, boolean):void");
    }

    public final void w(final tc adRequest, final s7 adObject, final l0 l0Var, View view) {
        if (this.f11895b) {
            com.appodeal.ads.utils.q.c(adObject, view, l0Var.w(), new j8(l0Var, adRequest, adObject));
            return;
        }
        i2 i2Var = l0Var.f13567g;
        i2Var.getClass();
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        i2Var.e0(adRequest, adObject, null);
        Runnable task = new Runnable() { // from class: com.appodeal.ads.qb
            @Override // java.lang.Runnable
            public final void run() {
                ac.v(l0Var, adRequest, adObject);
            }
        };
        long jW = l0Var.w();
        Handler handler = b6.f13134a;
        Intrinsics.checkNotNullParameter(task, "task");
        b6.f13134a.postDelayed(task, jW);
    }

    public final void x(boolean z10) {
        this.f11903j = z10;
    }

    public final boolean y(Activity activity, l0 l0Var, t7 t7Var, t7 t7Var2) {
        Log.debug("ViewAdRenderer", "performShowPreviousAds", "start");
        tc tcVar = (tc) l0Var.f13582v;
        if (tcVar != null && tcVar.f14910v.get() && !tcVar.E) {
            if (t7Var == t7.f14869h && E(activity) == null) {
                l0Var.m(LogConstants.EVENT_SHOW_FAILED, LogConstants.MSG_VIEW_NOT_FOUND);
                Log.debug("ViewAdRenderer", "performShowPreviousAds", "View container not found");
                return false;
            }
            s7 s7Var = (s7) tcVar.f14906r;
            if (s7Var != null) {
                Log.debug("ViewAdRenderer", "performShowPreviousAds", "Perform showing previous ads");
                activity.runOnUiThread(new d8(this, activity, tcVar, s7Var, t7Var, t7Var2, l0Var));
                return true;
            }
            Log.debug("ViewAdRenderer", "performShowPreviousAds", "Previous ads hasn't loaded object");
        }
        Log.debug("ViewAdRenderer", "performShowPreviousAds", "Can't show previous ads, because current displaying ads is: null, wasn't shown or cleared");
        return false;
    }

    public final boolean z(Activity activity, ic icVar, final l0 l0Var) {
        ja jaVarO = o(activity);
        if (!l0Var.f13570j) {
            if (!l0Var.f13572l) {
                Log.debug("ViewAdRenderer", Reporting.EventType.RENDER, "Appodeal hasn't been initialized yet, ads won't show");
                AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.tb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ac.g(l0Var);
                    }
                });
                return false;
            }
            jaVarO.f13515a = icVar.f13433c;
            l0Var.f13573m = icVar.f13256a;
            Log.debug("ViewAdRenderer", Reporting.EventType.RENDER, "Appodeal is initializing, ads will be displayed right after it's will be loaded");
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.sb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.e(l0Var);
                }
            });
            return true;
        }
        if (icVar.f13434d && jaVarO.f13515a == null && jaVarO.f13516b == f3.HIDDEN) {
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.ub
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.h(l0Var);
                }
            });
            return false;
        }
        if (!com.appodeal.ads.utils.c.c(com.appodeal.ads.context.o.f13205b.getResumedActivity())) {
            jaVarO.f13515a = null;
            this.f11900g = icVar.f13433c;
            return f(activity, icVar, l0Var);
        }
        if (!l0Var.f13572l) {
            Log.debug("ViewAdRenderer", Reporting.EventType.RENDER, "Fullscreen ads is showing, ads won't show");
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.wb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ac.j(l0Var);
                }
            });
            return false;
        }
        jaVarO.f13515a = icVar.f13433c;
        l0Var.f13573m = icVar.f13256a;
        Log.debug("ViewAdRenderer", Reporting.EventType.RENDER, "Fullscreen ads is showing, ads will be displayed right after it's will be closed");
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.vb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ac.i(l0Var);
            }
        });
        return true;
    }
}
