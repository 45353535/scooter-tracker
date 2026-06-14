package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.ironsource.D5;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InneractiveAdViewUnitController f23668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f23669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f23670n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f23672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f23673q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f23675s;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f23681y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f23667k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23671o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f23674r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23676t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f23677u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f23678v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f23679w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23680x = false;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f23971b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f23669m.f23995e0) : com.fyber.inneractive.sdk.util.o.c(this.f23669m.f23971b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f23971b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f23669m.f23994d0) : com.fyber.inneractive.sdk.util.o.c(this.f23669m.f23971b.getWidth());
        }
        return -1;
    }

    public final void K() {
        if (this.f23675s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(this.f23675s);
            this.f23675s = null;
        }
    }

    public final void L() {
        d dVar = this.f23681y;
        if (dVar != null) {
            dVar.f23655g = false;
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar.f23658j);
        }
        if (this.f23669m != null) {
            K();
            com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
            if (xVar != null) {
                ((q0) xVar).destroy();
            }
            this.f23669m = null;
            this.f20622b = null;
            ViewGroup viewGroup = this.f23672p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f23673q);
            }
            j jVar = this.f23673q;
            if (jVar != null) {
                jVar.removeAllViews();
                this.f23673q = null;
            }
        }
        this.f23678v = false;
    }

    public final int M() {
        l0 l0Var;
        int iIntValue;
        int i10 = this.f23676t;
        if (i10 == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i10 <= 0) {
            s0 s0Var = this.f20621a.getAdContent().f21038d;
            if (s0Var != null && (l0Var = ((r0) s0Var).f20435c) != null) {
                Integer num = l0Var.f20419a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.f23676t));
        iIntValue = this.f23676t;
        return iIntValue * 1000;
    }

    public final void N() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f23971b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if ((!this.f23669m.p() || this.f23669m.N == f0.RESIZED) && (inneractiveAdViewUnitController = this.f23668l) != null) {
            this.f23674r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void O() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f23971b) == null || !mVar.getIsVisible() || this.f23674r == 0 || this.f23669m.p() || this.f23669m.N == f0.RESIZED) {
            return;
        }
        if (!this.f23679w) {
            if (this.f23667k < System.currentTimeMillis() - this.f23674r) {
                this.f23677u = 1L;
            } else {
                this.f23677u = this.f23667k - (System.currentTimeMillis() - this.f23674r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.f23677u));
        a(false, this.f23677u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof q0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f23672p);
    }

    public final void c(boolean z10) {
        if (this.f23675s != null) {
            this.f23679w = z10;
            K();
            this.f23677u = this.f23667k - (System.currentTimeMillis() - this.f23674r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.f23677u), Long.valueOf(this.f23667k));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.f23669m.N == f0.RESIZED) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        K();
        L();
        this.f23670n = null;
        com.fyber.inneractive.sdk.util.z.f23924a.f23853a.remove(this);
        i iVar = this.f23675s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return this.f23669m.f23994d0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return this.f23669m.f23995e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f23971b) == null) {
            return;
        }
        if (!mVar.getIsVisible() || com.fyber.inneractive.sdk.util.z.f23924a.f23854b || this.f23669m.p() || this.f23669m.N == f0.RESIZED) {
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.f23677u = 1L;
            return;
        }
        IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
        long jM = M();
        this.f23667k = jM;
        if (jM != 0) {
            a(false, 10000L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        d dVar = this.f23681y;
        if (dVar != null) {
            dVar.f23655g = false;
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar.f23658j);
        }
        j jVar = this.f23673q;
        if (jVar != null) {
            jVar.removeAllViews();
            this.f23673q = null;
        }
        ViewGroup viewGroup = this.f23672p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f23672p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f23971b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        j jVar;
        l0 l0Var;
        UnitDisplayType unitDisplayType;
        InneractiveAdSpot inneractiveAdSpot = this.f20621a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f23671o = false;
        this.f20625e = false;
        if (viewGroup != null) {
            this.f23672p = viewGroup;
            this.f23668l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f23680x) {
            L();
            if (!(this.f20621a.getAdContent() instanceof q0)) {
                IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f20621a.getAdContent());
                return;
            }
            this.f20622b = (q0) this.f20621a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f20868i : null;
        this.f23669m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f23670n == null) {
                this.f23670n = new h(this);
            }
            iAmraidWebViewController.setListener(this.f23670n);
            q0 q0Var = (q0) this.f20622b;
            InneractiveAdRequest inneractiveAdRequest = q0Var.f21035a;
            s0 s0Var = q0Var.f21038d;
            if (s0Var == null || (l0Var = ((r0) s0Var).f20435c) == null || (unitDisplayType = l0Var.f20420b) == null || !unitDisplayType.isFullscreenUnit()) {
                this.f23673q = new j(this.f23672p.getContext(), 0.0f);
                q0 q0Var2 = (q0) this.f20622b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var2.f21036b;
                h1 h1VarA = a(fVar.f23725e, fVar.f23726f, q0Var2.f21038d);
                this.f23669m.setAdDefaultSize(h1VarA.f23872a, h1VarA.f23873b);
                IAmraidWebViewController iAmraidWebViewController2 = this.f23669m;
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.f23971b;
                if (mVar != null || com.fyber.inneractive.sdk.util.o.f23888a == null) {
                    ViewParent parent = mVar != null ? mVar.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(mVar);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(h1VarA.f23872a, h1VarA.f23873b);
                    layoutParams.addRule(new int[]{13}[0]);
                    this.f23669m.a(this.f23673q, layoutParams);
                    this.f23672p.addView(this.f23673q);
                    j jVar2 = this.f23673q;
                    ViewGroup.LayoutParams layoutParams2 = jVar2.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    jVar2.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f20621a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f23672p) != null) {
                        Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.f20621a.getAdContent().f21035a, this.f20621a.getAdContent().b(), this.f20621a.getAdContent().f21037c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, this.f23672p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = gVar.f20736d;
                        iFyberAdIdentifier.f23825k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController3 = this.f23669m;
                        if (iAmraidWebViewController3 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController3.f23971b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && z() != null) {
                            ViewGroup.LayoutParams layoutParams3 = z().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController4 = this.f23669m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController4.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                } else if (this.f23680x) {
                    FrameLayout frameLayout = new FrameLayout(this.f23672p.getContext());
                    frameLayout.setBackgroundResource(R.color.ia_blank_background);
                    this.f23672p.removeAllViews();
                    this.f23672p.addView(frameLayout, new FrameLayout.LayoutParams(h1VarA.f23872a, h1VarA.f23873b, 17));
                } else {
                    this.f23680x = true;
                    iAmraidWebViewController2.f23971b = iAmraidWebViewController2.a(((q0) this.f20622b).f21037c);
                    try {
                        iAmraidWebViewController2.h();
                        iAmraidWebViewController2.f23971b.loadDataWithBaseURL(iAmraidWebViewController2.f23985p, iAmraidWebViewController2.f23986q, "text/html", D5.N, null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f23672p.getContext());
                        frameLayout2.setBackgroundResource(R.color.ia_blank_background);
                        this.f23672p.removeAllViews();
                        this.f23672p.addView(frameLayout2, new FrameLayout.LayoutParams(h1VarA.f23872a, h1VarA.f23873b, 17));
                    }
                }
            } else {
                j jVar3 = new j(this.f23672p.getContext(), 1.5f);
                this.f23673q = jVar3;
                this.f23669m.a(jVar3, new ViewGroup.LayoutParams(-1, -1));
                this.f23672p.addView(this.f23673q, new ViewGroup.LayoutParams(-2, -2));
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f20622b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((q0) xVar2).f21036b : null;
            if (fVar2 != null && (jVar = this.f23673q) != null) {
                d dVar = new d(fVar2, jVar, new g(this));
                this.f23681y = dVar;
                dVar.f23656h = false;
                dVar.f23652d = 1;
                dVar.f23653e = 0.0f;
                int i10 = fVar2.f23742v;
                if (i10 >= 1) {
                    dVar.f23652d = Math.min(i10, 100);
                }
                float f10 = fVar2.f23743w;
                if (f10 >= -1.0f) {
                    dVar.f23653e = f10;
                }
                if (dVar.f23653e >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    dVar.f23651c = 0.0f;
                    dVar.f23654f = System.currentTimeMillis();
                    dVar.f23655g = true;
                    dVar.a();
                }
            }
        } else {
            IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f23924a;
        if (b0Var.f23853a.contains(this)) {
            return;
        }
        b0Var.f23853a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f23669m;
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

    public final void a(boolean z10, long j10) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!TextUtils.isEmpty(this.f20621a.getMediationNameString()) || j10 == 0 || (this.f20621a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f23676t == -1 || (iAmraidWebViewController = this.f23669m) == null || (mVar = iAmraidWebViewController.f23971b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.f23674r = System.currentTimeMillis();
        this.f23667k = z10 ? this.f23667k : j10;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j10), Long.valueOf(this.f23667k));
        if (j10 > 1) {
            i iVar = this.f23675s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(iVar);
            }
            K();
            i iVar2 = new i(this);
            this.f23675s = iVar2;
            com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(iVar2, j10);
            return;
        }
        N();
    }

    public static h1 a(int i10, int i11, s0 s0Var) {
        int iA;
        int iA2;
        l0 l0Var;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 > 0 && i11 > 0) {
            iA = com.fyber.inneractive.sdk.util.o.a(i10);
            iA2 = com.fyber.inneractive.sdk.util.o.a(i11);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((r0) s0Var).f20435c) != null) {
                unitDisplayType = l0Var.f20420b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_TABLET_HEIGHT.value);
            } else {
                iA = com.fyber.inneractive.sdk.util.o.a(k.BANNER_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(k.BANNER_HEIGHT.value);
            }
        }
        IAlog.e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(iA), Integer.valueOf(iA2));
        return new h1(iA, iA2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
        this.f23676t = i10;
    }
}
