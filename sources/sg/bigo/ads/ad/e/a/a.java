package sg.bigo.ads.ad.e.a;

import android.app.Activity;
import android.util.Pair;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.b.a.e;
import sg.bigo.ads.ad.e.c;
import sg.bigo.ads.ad.e.h;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.g.d;

/* JADX INFO: loaded from: classes4.dex */
public class a extends d {
    private boolean O;
    private boolean P;

    protected a(@NonNull Activity activity) {
        super(activity);
        this.O = false;
        this.P = false;
    }

    static /* synthetic */ boolean a(a aVar) {
        aVar.P = true;
        return true;
    }

    private void ar() {
        if (this.O) {
            return;
        }
        T t10 = this.f101384y;
        if (t10 instanceof h) {
            this.O = true;
            ((h) t10).N();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final Pair<sg.bigo.ads.ad.b.b, sg.bigo.ads.ad.interstitial.a> ao() {
        sg.bigo.ads.ad.b.b bVarG = ((d) this).H.G();
        if (bVarG == null) {
            return null;
        }
        Object bVar = bVarG instanceof sg.bigo.ads.ad.b.a.d ? new b(this.L, this) : bVarG instanceof e ? new c(this.L, this) : null;
        if (bVar == null) {
            return null;
        }
        return new Pair<>(bVarG, bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final void ap() {
        ar();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final void aq() {
        ar();
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        if (this.P) {
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).G;
        if (aVar instanceof c) {
            ((c) aVar).g();
        } else if (aVar instanceof b) {
            ((b) aVar).g();
        } else {
            super.g();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        if (this.P) {
            return;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null && !adCountDownButton.f100519c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.ad.interstitial.a aVar = ((d) this).G;
        if (aVar instanceof c) {
            ((c) aVar).i();
        } else if (aVar instanceof b) {
            ((b) aVar).i();
        } else {
            super.i();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.g.d
    public final boolean a(boolean z10, boolean z11) {
        boolean zA = super.a(z10, z11);
        if (!zA || ((d) this).K) {
            return zA;
        }
        new sg.bigo.ads.ad.e.c(this.L).a(new c.a() { // from class: sg.bigo.ads.ad.e.a.a.1
            @Override // sg.bigo.ads.ad.e.c.a
            public final void a() {
                a.this.i();
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void b() {
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void c() {
                a.a(a.this);
                a.this.ab();
            }

            @Override // sg.bigo.ads.ad.e.c.a
            public final void d() {
                a.this.g();
            }
        });
        return false;
    }
}
