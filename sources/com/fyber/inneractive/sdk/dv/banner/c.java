package com.fyber.inneractive.sdk.dv.banner;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.dv.i;
import com.fyber.inneractive.sdk.flow.b0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.interfaces.d;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b0 implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f20526k;

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        ViewGroup viewGroup = this.f20526k;
        return viewGroup != null && viewGroup.equals(view);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        x xVar = this.f20622b;
        if (xVar != null) {
            Object obj = ((b) xVar).f20520i;
            if (obj != null) {
                ((AdView) obj).destroy();
            }
            b bVar = (b) this.f20622b;
            bVar.f20518g = null;
            bVar.f20520i = null;
        }
        ViewGroup viewGroup = this.f20526k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f20526k = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        Object obj;
        x xVar = this.f20622b;
        if (xVar == null || (obj = ((b) xVar).f20520i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f20622b).f20520i).getAdSize().getWidth());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        Object obj;
        x xVar = this.f20622b;
        if (xVar == null || (obj = ((b) xVar).f20520i) == null || ((AdView) obj).getAdSize() == null) {
            return 0;
        }
        return o.b(((AdView) ((b) this.f20622b).f20520i).getAdSize().getHeight());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup = this.f20526k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f20526k = null;
        }
    }

    public final void w() {
        i iVar;
        l0 l0Var;
        G();
        x xVar = this.f20622b;
        if (xVar == null || (iVar = (i) ((b) xVar).f21036b) == null) {
            return;
        }
        b(iVar);
        s0 s0Var = ((b) this.f20622b).f21038d;
        if (s0Var == null || (l0Var = ((r0) s0Var).f20435c) == null) {
            return;
        }
        b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, l0Var.f20420b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        return this.f20526k;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        x xVar;
        if (this.f20621a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        if (viewGroup == null || (xVar = this.f20622b) == null) {
            return;
        }
        b bVar = (b) xVar;
        if (bVar.f20520i != null) {
            bVar.f20519h = this;
            if (bVar.f20523j) {
                w();
                bVar.f20523j = false;
            }
            this.f20526k = viewGroup;
            viewGroup.addView((View) ((b) this.f20622b).f20520i);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(x xVar) {
        return xVar instanceof com.fyber.inneractive.sdk.dv.a;
    }
}
