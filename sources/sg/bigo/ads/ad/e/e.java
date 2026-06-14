package sg.bigo.ads.ad.e;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes4.dex */
public class e extends x {

    @Nullable
    protected h I;
    protected boolean J;
    private boolean K;

    protected e(@NonNull Activity activity) {
        super(activity);
        this.K = true;
        this.J = false;
    }

    static /* synthetic */ boolean g(e eVar) {
        eVar.f100544e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final void A() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.A.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.A);
        }
        if (e_() == 0) {
            int i10 = this.f100547h.f101803c;
            if (i10 < 0) {
                i10 = 15;
            }
            this.A.a(i10, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.e.e.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.e.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (e.this.A != null) {
                                e.this.A.e();
                            }
                            e eVar = e.this;
                            h hVar = eVar.I;
                            if (hVar == null || eVar.J) {
                                sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                eVar.J = true;
                                hVar.N();
                            }
                            if (e.this.f100557r != null) {
                                e.this.f100557r.f101589y.a(null);
                            }
                            if (e.this.f100547h.f101810j != 3 || e.this.f100544e) {
                                return;
                            }
                            e.g(e.this);
                            sg.bigo.ads.common.t.a.a(0, 4, "Interstitial Static", "auto click when force staying finish");
                            ((s) e.this.f101384y).H().a((i) null, 8, 22);
                        }
                    });
                }
            });
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public final void E() {
        this.f100544e = true;
        if (I()) {
            H();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f101384y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.I = (h) t10;
        }
        if (this.I == null) {
            a("Illegal static content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.K && e_() == 0) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int ai() {
        return ((sg.bigo.ads.ad.interstitial.a) this).f100541b.a("interstitial_video_style.video_play_page.icon_strategy") == 2 ? 2 : 1;
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final void z() {
        super.z();
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(this.K);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public w b() {
        w wVarB = super.b();
        if (!this.K) {
            wVarB.f101802b = 0;
            wVarB.f101803c = -1;
        }
        return wVarB;
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        if (this.f100555p.get() && !this.J) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton != null) {
                adCountDownButton.e();
            }
            h hVar = this.I;
            if (hVar != null) {
                this.J = true;
                hVar.N();
            }
        }
        return super.f(z10);
    }
}
