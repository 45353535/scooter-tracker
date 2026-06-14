package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.e.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public class d extends sg.bigo.ads.ad.interstitial.i.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f100500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f100501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f100502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n f100503h;

    protected d(@NonNull Activity activity) {
        super(activity);
        this.f100501f = false;
        this.f100502g = false;
    }

    static /* synthetic */ void h(d dVar) {
        n nVar = dVar.f100503h;
        if (nVar != null) {
            nVar.d();
        }
        AdCountDownButton adCountDownButton = dVar.A;
        if (adCountDownButton != null) {
            adCountDownButton.b();
        }
    }

    static /* synthetic */ boolean i(d dVar) {
        dVar.f100502g = true;
        return true;
    }

    static /* synthetic */ void k(d dVar) {
        n nVar = dVar.f100503h;
        if (nVar != null) {
            nVar.c();
        }
        AdCountDownButton adCountDownButton = dVar.A;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f101384y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.f100500e = (h) t10;
        } else {
            a("Illegal SAB content.");
        }
        if (this.A != null) {
            this.f100503h = new n(r.f102828a.a(1)) { // from class: sg.bigo.ads.ad.e.d.1
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.d.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (d.this.f100500e == null || d.this.f100501f) {
                                sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
                            } else {
                                d.e(d.this);
                                d.this.f100500e.N();
                            }
                            if (d.this.A != null) {
                                d.this.A.e();
                            }
                        }
                    });
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j10) {
                    if (d.this.A != null) {
                        d.this.A.a(j10);
                    }
                }
            };
            this.A.setVisibility(0);
            this.A.setTakeoverTickEvent(true);
            this.A.setShowCloseButtonInCountdown(true);
            this.A.a(1, (AdCountDownButton.b) null);
            this.f100503h.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() != 0) {
            return;
        }
        if (!this.f100501f) {
            new c(this.L).a(new c.a() { // from class: sg.bigo.ads.ad.e.d.2
                @Override // sg.bigo.ads.ad.e.c.a
                public final void a() {
                    d.h(d.this);
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void b() {
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void c() {
                    d.i(d.this);
                    d.this.ab();
                }

                @Override // sg.bigo.ads.ad.e.c.a
                public final void d() {
                    d.k(d.this);
                }
            });
            return;
        }
        n nVar = this.f100503h;
        if (nVar != null) {
            nVar.b();
            this.f100503h = null;
        }
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.e();
        }
        super.d(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a
    public final boolean e() {
        return true;
    }

    static /* synthetic */ boolean e(d dVar) {
        dVar.f100501f = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i.a
    public final boolean j() {
        return this.f100501f;
    }
}
