package sg.bigo.ads.ad.interstitial.g;

import android.app.Activity;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends x implements b {
    private final a I;
    private n J;

    protected e(@NonNull Activity activity, a aVar) {
        super(activity);
        this.I = aVar;
    }

    static /* synthetic */ boolean d(e eVar) {
        eVar.f100544e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        n nVar = this.J;
        if (nVar != null) {
            nVar.b();
            this.J = null;
        }
        n nVar2 = this.f100562w;
        if (nVar2 != null) {
            nVar2.b();
            this.f100562w = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final void J() {
        long j10 = ((long) this.f100547h.f101811k) * 1000;
        if (j10 >= 0) {
            if (j10 == 0) {
                j10 = 500;
            }
            n nVar = new n(j10) { // from class: sg.bigo.ads.ad.interstitial.g.e.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (((x) e.this).H || e.this.f100544e || e.this.I == null || e.this.I.d_()) {
                        return;
                    }
                    e.d(e.this);
                    e.this.I.c_();
                    ((s) e.this.f101384y).H().a((i) null, 8, 22);
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j11) {
                }
            };
            this.f100562w = nVar;
            nVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        int iN = n();
        return (iN == 1 || iN == 2 || iN == 3) ? R.layout.bigo_ad_activity_sub_interstitial_rich_video_1_3 : super.Y();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void a(int i10) {
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(i10, 2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final ValueCallback<Double> an() {
        return this.I.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.x
    public final boolean aq() {
        return this.f100547h.f101811k == -2;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final void b(int i10) {
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final View g_() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i
    public final void h(int i10) {
        super.h(i10);
        w wVar = this.f100547h;
        if (wVar != null && this.D != null) {
            n nVar = new n(((long) wVar.f101803c) * 1000) { // from class: sg.bigo.ads.ad.interstitial.g.e.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) e.this.C) || e.this.e_() != 0) {
                        return;
                    }
                    e.this.a(0);
                    e.this.ap();
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                }
            };
            this.J = nVar;
            nVar.c();
        }
        b(0);
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        n nVar = this.J;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.J.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void m() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void o() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean v() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.g.b
    public final boolean a() {
        return f(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        n nVar = this.J;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.J.c();
    }
}
