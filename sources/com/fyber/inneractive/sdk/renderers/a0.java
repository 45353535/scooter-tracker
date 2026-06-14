package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends e implements w, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f23640l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f23642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f23643o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23641m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f23644p = new y(this);

    static {
        IAlog.a(a0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).a(f10);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.w
    public final void b(ViewGroup viewGroup) {
        if (this.f20621a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f23640l = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(this.f23640l.getContext());
        this.f23643o = imageView;
        imageView.setImageURI(((w0) this.f20622b).f21023m);
        this.f23643o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.f23640l.setLayoutParams(layoutParams);
        this.f23640l.addView(this.f23643o, layoutParams);
        com.fyber.inneractive.sdk.ui.controller.a aVar = new com.fyber.inneractive.sdk.ui.controller.a();
        this.f23662k = aVar;
        aVar.f23830a = this.f23644p;
        n0 n0Var = l0.f23879a;
        ViewGroup viewGroup2 = this.f23640l;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f23642n;
        if (aVar != null) {
            aVar.a();
            this.f23642n = null;
        }
        ImageView imageView = this.f23643o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f23643o = null;
        }
        l0.f23879a.a(this.f23640l);
        com.fyber.inneractive.sdk.util.v.a(this.f23640l);
        this.f23640l = null;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f23830a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        l0.f23879a.a(com.fyber.inneractive.sdk.util.o.a(z()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        MediaView mediaView;
        com.fyber.inneractive.sdk.flow.x xVar = this.f20622b;
        return (xVar == null || (mediaView = ((w0) xVar).f21024n) == null) ? this.f23640l : mediaView;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z10, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        if (!this.f23641m) {
            com.fyber.inneractive.sdk.util.r.f23896b.post(new z(this));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f23662k;
            if (bVar instanceof com.fyber.inneractive.sdk.ui.controller.a) {
                ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f23831b.set(true);
            }
        }
        com.fyber.inneractive.sdk.util.r.f23896b.post(new com.fyber.inneractive.sdk.flow.y(this, com.fyber.inneractive.sdk.util.o.a(z()), str, new g1(), gVar, z10, oVar));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f23642n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
