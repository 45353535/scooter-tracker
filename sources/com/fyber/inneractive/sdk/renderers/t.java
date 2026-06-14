package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends p0 {
    public v1 E;
    public com.fyber.inneractive.sdk.external.g I;
    public a1 J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f23699w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public IAmraidWebViewController f23701y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23700x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f23702z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public boolean H = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean K() {
        return !this.B && this.f23701y.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int M() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        if (xVar == null || (rVar = ((q0) xVar).f21037c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f20622b).f21037c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int N() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        if (xVar == null || (rVar = ((q0) xVar).f21037c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f20622b).f21037c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long O() {
        int iB;
        com.fyber.inneractive.sdk.response.e eVar;
        int iMin = 5;
        if (this.F == UnitDisplayType.REWARDED) {
            iB = IAConfigManager.O.f20315u.f20484b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(iB));
        } else {
            com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f20315u;
            if (sVar == null) {
                iB = 5;
            } else {
                com.fyber.inneractive.sdk.config.o oVar = sVar.f20484b;
                int iB2 = oVar.b("mraid_x_delay_v2", 5, 0);
                com.fyber.inneractive.sdk.config.l lVarA = oVar.a("int_configuration");
                if (lVarA != null && lVarA.f20418a.containsKey("close_d")) {
                    iB2 = lVarA.f20418a.containsKey("close_d") ? Integer.parseInt((String) lVarA.f20418a.get("close_d")) : 5;
                    if (iB2 < 0 || iB2 > 30) {
                        iB2 = 5;
                    }
                    this.f20864t = true;
                } else if (this.F == UnitDisplayType.INTERSTITIAL) {
                    CreativeType creativeType = CreativeType.PLAYABLE;
                    com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
                    if (creativeType.equals((xVar == null || (eVar = ((q0) xVar).f21036b) == null) ? null : ((com.fyber.inneractive.sdk.response.f) eVar).M)) {
                        iB = oVar.b("d_ad_int_pl", iB2, 5);
                    }
                }
                iB = iB2;
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (C()) {
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.c) ((q0) this.f20622b).f21037c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("skip_time_sec");
                int iIntValue = numA != null ? numA.intValue() : 5;
                if (iIntValue >= 0 && iIntValue <= 8) {
                    iMin = iIntValue;
                }
            } else {
                iMin = Math.min(iB, 5);
            }
            iB = Math.min(iMin, iB);
        }
        return iB * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean P() {
        return false;
    }

    public final void Q() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.H) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.I != null) {
            com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY);
            com.fyber.inneractive.sdk.external.g gVar = this.I;
            i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(((s0) gVar.f20609a).mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f20609a.f20587b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f23701y;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            J();
        }
        this.H = true;
    }

    public final void R() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f20622b == null || (iAmraidWebViewController = this.f23701y) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.f23971b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        l0 l0Var = (xVar == null || (s0Var = ((q0) xVar).f21038d) == null) ? null : ((r0) s0Var).f20435c;
        if (l0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f20868i : null;
        this.f23701y = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f23971b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((q0) xVar).f();
        this.F = l0Var.f20420b;
        this.f23702z = false;
        this.A = false;
        this.J = new a1(this.f20621a);
        this.f20855k = eVar;
        IAmraidWebViewController iAmraidWebViewController2 = this.f23701y;
        if (iAmraidWebViewController2 == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f20622b);
            return;
        }
        iAmraidWebViewController2.a(eVar.getCloseButton(), com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.f20622b).f21036b;
        int i10 = fVar.f23725e;
        int i11 = fVar.f23726f;
        boolean z10 = (i10 == 300 && i11 == 250) || (i10 == 600 && i11 == 500);
        this.B = z10;
        if (z10) {
            this.f23701y.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i10), com.fyber.inneractive.sdk.util.o.a(i11));
        }
        if (this.f23699w == null) {
            this.f23699w = new s(this);
        }
        this.f23701y.setListener(this.f23699w);
        InneractiveAdSpot inneractiveAdSpot = this.f20621a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f20621a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f21035a, adContent.b(), adContent.f21037c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.f20736d;
            iFyberAdIdentifier.f23825k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.f23701y.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        R();
        IAmraidWebViewController iAmraidWebViewController3 = this.f23701y;
        ViewGroup layout = this.f20855k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.f20622b).f21035a;
        iAmraidWebViewController3.a(layout, (ViewGroup.LayoutParams) null);
        this.f23702z = true;
        if (this.F == UnitDisplayType.REWARDED) {
            v1 v1Var = new v1(TimeUnit.SECONDS, IAConfigManager.O.f20315u.f20484b.a("rewarded_mraid_delay", 31, 30));
            this.E = v1Var;
            v1Var.f23920e = new r(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f23918c = t1Var;
            v1Var.f23919d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f23701y;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f23702z && !this.A && (eventsListener = this.f20623c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f20621a);
        }
        this.f23699w = null;
        v1 v1Var = this.E;
        if (v1Var != null) {
            v1Var.f23920e = null;
            this.E = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f23701y;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f21120a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void l() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.F == UnitDisplayType.REWARDED && this.G) {
            Q();
        }
        if (!this.A && (eventsListener = this.f20623c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f20621a);
        }
        a1 a1Var = this.J;
        if (a1Var != null && a1Var.f23850b != 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - a1Var.f23850b) - a1Var.f23852d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str = seconds + "." + millis;
            a1Var.f23850b = 0L;
            a1Var.f23851c = 0L;
            a1Var.f23852d = 0L;
            InneractiveAdSpot inneractiveAdSpot = a1Var.f23849a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f21035a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f21037c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f21418c = uVar;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArrayB;
            wVar.a("time", str);
            wVar.a((String) null);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f20621a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void n() {
        v1 v1Var;
        super.n();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f23919d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            if (a1Var.f23850b == 0) {
                a1Var.f23850b = System.currentTimeMillis();
            }
            if (a1Var.f23851c > 0) {
                a1Var.f23852d += System.currentTimeMillis() - a1Var.f23851c;
                a1Var.f23851c = 0L;
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f20865u;
        if (!aVar.f23844b || aVar.f23847e <= 0) {
            return;
        }
        aVar.f23848f += System.currentTimeMillis() - aVar.f23847e;
        aVar.f23847e = 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void s() {
        v1 v1Var;
        super.s();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f23919d = true;
            t1 t1Var = v1Var.f23918c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            a1Var.f23851c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f20865u;
        if (aVar.f23844b) {
            aVar.f23847e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean v() {
        boolean z10;
        if (this.f20855k == null) {
            z10 = true;
        } else if (this.F == UnitDisplayType.REWARDED) {
            if (this.G) {
                Q();
            }
            z10 = this.G;
        } else {
            z10 = this.f20860p;
        }
        if (!z10) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        IAmraidWebViewController iAmraidWebViewController = this.f23701y;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.f23971b : null);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z10) {
        if (!K()) {
            if (z10) {
                this.f20865u.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.f20865u;
                aVar.f23846d = 0L;
                aVar.f23847e = 0L;
                aVar.f23848f = 0L;
                aVar.f23844b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        R();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j10) {
        if (this.F == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f20864t) {
            return j10;
        }
        long j11 = 13;
        try {
            j11 = Long.parseLong(IAConfigManager.O.f20315u.f20484b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.I = gVar;
    }
}
