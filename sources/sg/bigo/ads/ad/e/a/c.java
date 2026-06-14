package sg.bigo.ads.ad.e.a;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.e.g;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.y;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends g implements sg.bigo.ads.ad.interstitial.g.b {
    private final sg.bigo.ads.ad.interstitial.g.a K;
    private n O;

    protected c(@NonNull Activity activity, sg.bigo.ads.ad.interstitial.g.a aVar) {
        super(activity);
        this.K = aVar;
    }

    static /* synthetic */ boolean e(c cVar) {
        cVar.f100544e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        n nVar = this.O;
        if (nVar != null) {
            nVar.b();
            this.O = null;
        }
        n nVar2 = this.f100562w;
        if (nVar2 != null) {
            nVar2.b();
            this.f100562w = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final void J() {
        w wVar;
        int i10;
        boolean z10;
        sg.bigo.ads.core.a.a aVarF = ((s) this.f101384y).f();
        if (!this.f100555p.get()) {
            i10 = this.f100547h.f101811k;
            if (i10 < 0) {
                return;
            } else {
                z10 = false;
            }
        } else if (aVarF.bh() != null || (wVar = this.f100547h) == null || (i10 = wVar.f101814n) < 0) {
            return;
        } else {
            z10 = true;
        }
        a(aVarF, z10, i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        int iN = n();
        return (iN == 1 || iN == 2 || iN == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.Y();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void aE() {
        if (this.f101384y == 0 || M()) {
            return;
        }
        ((s) this.f101384y).c(this.C);
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final ValueCallback<Double> an() {
        return this.K.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final sg.bigo.ads.ad.interstitial.a.a as() {
        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pairB;
        T t10 = this.f101384y;
        if (t10 == 0 || (pairB = ((s) t10).b(this.C)) == null) {
            return null;
        }
        return (sg.bigo.ads.ad.interstitial.a.a) pairB.second;
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final sg.bigo.ads.ad.interstitial.a.b at() {
        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pairB;
        T t10 = this.f101384y;
        if (t10 == 0 || (pairB = ((s) t10).b(this.C)) == null) {
            return null;
        }
        return (sg.bigo.ads.ad.interstitial.a.b) pairB.first;
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean aw() {
        return this.f100547h.f101811k == -2;
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final boolean az() {
        m mVar = ((sg.bigo.ads.ad.interstitial.a) this).f100542c;
        return mVar != null && 1 == mVar.a("endpage.companion_first", 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void b(int i10) {
        sg.bigo.ads.ad.interstitial.g.a aVar = this.K;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final View g_() {
        Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pairB;
        T t10 = this.f101384y;
        if (t10 == 0 || (pairB = ((s) t10).b(this.C)) == null) {
            return null;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar = (sg.bigo.ads.ad.interstitial.a.b) pairB.first;
        if (bVar.f100654a && bVar.b() && !bVar.f100655b) {
            bVar.a(1);
            return bVar.f100659f.f100599i;
        }
        if (!bVar.b()) {
            bVar.f100659f.f();
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = (sg.bigo.ads.ad.interstitial.a.a) pairB.second;
        if (aVar.f100586a && aVar.b()) {
            aVar.a(1);
            return aVar.a();
        }
        if (aVar.b()) {
            return null;
        }
        aVar.f();
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void m() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void o() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final int r() {
        int i10;
        w wVar = this.f100547h;
        if (wVar == null || (i10 = wVar.f101815o) <= 0) {
            return 5;
        }
        return i10;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    public final boolean v() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void a(int i10) {
        sg.bigo.ads.ad.interstitial.g.a aVar = this.K;
        if (aVar != null) {
            aVar.a(i10, i10 == 11 ? 2 : 1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        n nVar = this.O;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.O.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i10) {
        super.h(i10);
        w wVar = this.f100547h;
        if (wVar != null && this.D != null) {
            n nVar = new n(((long) wVar.f101803c) * 1000) { // from class: sg.bigo.ads.ad.e.a.c.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (c.this.K == null || c.this.e_() != 0 || sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) c.this.C)) {
                        return;
                    }
                    c.this.K.a(0, 2);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.O = nVar;
            nVar.c();
        }
        b(0);
        ar();
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        n nVar = this.O;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.O.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void m(int i10) {
        if (M()) {
            return;
        }
        super.m(i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.y
    public final void a(sg.bigo.ads.core.a.a aVar, boolean z10, int i10) {
        long jA;
        if (z10) {
            jA = i10 == 0 ? 800L : r.f102828a.a(i10);
        } else {
            jA = ((long) i10) * 1000;
            if (jA == 0) {
                jA = 500;
            }
        }
        n nVar = new n(jA) { // from class: sg.bigo.ads.ad.e.a.c.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                int iE_ = c.this.e_();
                if (((y) c.this).H || c.this.f100544e || c.this.K == null || c.this.K.d_() || iE_ != 0) {
                    return;
                }
                c.e(c.this);
                c.this.K.c_();
                ((s) c.this.f101384y).H().a((i) null, c.this.au(), 22);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f100562w = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final boolean a() {
        return f(true);
    }
}
