package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: classes7.dex */
public class p extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f23685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f23686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoContentListener f23687n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f23689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f23690q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f23693t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f23688o = new m(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f23691r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f23692s = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23694u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f23695v = new o(this);

    public void K() {
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.f20984j) {
                return;
            }
            t0Var.f20984j = true;
            G();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    public void b(ViewGroup viewGroup) {
        a(viewGroup);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f23687n = null;
        t();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f21547a;
            if (fVar == null || (qVar = fVar.f23252a) == null) {
                return;
            }
            sVar.a(qVar.f21526e);
            sVar.a(sVar.f21547a.f23252a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup;
        n nVar = this.f23693t;
        if (nVar != null && (viewGroup = this.f23689p) != null) {
            viewGroup.removeCallbacks(nVar);
            this.f23693t = null;
        }
        l0.f23879a.a(this.f23689p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f23689p);
        if (this.f23662k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f23662k;
            sVar.getClass();
            sVar.f21553g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.f23662k).destroy();
            this.f23662k = null;
        }
        if (this.f23686m != null) {
            this.f23689p.setLayoutTransition(null);
            this.f23689p.removeView(this.f23685l);
            this.f23686m.destroy();
            this.f23686m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        return c(this.f23689p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View z() {
        return this.f23685l;
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f23689p);
    }

    public void a(ViewGroup viewGroup) {
        InneractiveAdSpot inneractiveAdSpot = this.f20621a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f23689p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!a(selectedUnitController)) {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            this.f23687n = a(selectedUnitController.getSelectedContentController());
        }
        this.f23694u = false;
        this.f23685l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        com.fyber.inneractive.sdk.player.t tVar = xVar != null ? ((t0) xVar).f20983i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar);
        this.f23690q = d0VarA;
        if (d0VarA != null) {
            this.f23686m = d0VarA.a(context, ((t0) this.f20622b).f21037c);
            this.f23662k = (com.fyber.inneractive.sdk.player.controller.s) this.f23690q.a(this.f20621a, (t0) this.f20622b);
            this.f23689p.addView(this.f23685l, new ViewGroup.LayoutParams(-1, -2));
            this.f23689p.setLayoutTransition(null);
            this.f23685l.addView((View) this.f23686m, new FrameLayout.LayoutParams(-2, -2, 17));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f23662k;
            o oVar = this.f23695v;
            sVar.getClass();
            sVar.f21553g = oVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f23662k;
            this.f23690q.b();
            sVar2.b(false);
            this.f23690q.a(this.f23688o);
            n0 n0Var = l0.f23879a;
            ViewGroup viewGroup2 = this.f23689p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof InneractiveAdViewVideoContentController)) {
            IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController.getClass().getSimpleName());
            return null;
        }
        return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f23691r == f10 && this.f23692s.equals(rect)) {
            return;
        }
        this.f23691r = f10;
        this.f23692s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.f23686m).e();
            ((com.fyber.inneractive.sdk.player.controller.s) this.f23662k).a(f10);
        }
        if (f10 > 0.0f) {
            n nVar = this.f23693t;
            if (nVar != null && (viewGroup2 = this.f23689p) != null) {
                viewGroup2.removeCallbacks(nVar);
                this.f23693t = null;
            }
            n nVar2 = new n(this);
            this.f23693t = nVar2;
            this.f23689p.postDelayed(nVar2, 100L);
            return;
        }
        n nVar3 = this.f23693t;
        if (nVar3 == null || (viewGroup = this.f23689p) == null) {
            return;
        }
        viewGroup.removeCallbacks(nVar3);
        this.f23693t = null;
    }

    public d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f23333f == null) {
            return null;
        }
        return new a(tVar);
    }
}
