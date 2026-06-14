package sg.bigo.ads.ad.e;

import android.app.Activity;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.e.c;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.m;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    protected b f100481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f100482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f100483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f100484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f100485f;

    protected a(@NonNull Activity activity) {
        super(activity);
        this.f100482c = true;
        this.f100483d = false;
        this.f100484e = false;
        this.f100485f = false;
    }

    static /* synthetic */ boolean c(a aVar) {
        aVar.f100485f = true;
        return true;
    }

    static /* synthetic */ boolean s(a aVar) {
        aVar.f100484e = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f101384y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof b) {
            this.f100481b = (b) t10;
        }
        if (this.f100481b == null) {
            a("Illegal reward banner content.");
        }
        if (this.A.getVisibility() != 0) {
            this.A.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.A);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.f100482c) {
            d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        b bVar = this.f100481b;
        if (bVar != null && !this.f100483d) {
            this.f100483d = true;
            bVar.G();
        } else if (bVar == null) {
            sg.bigo.ads.common.t.a.a(2, "", "Failed to claim reward because of null RewardVideoAd.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.m
    public final void a() {
        T t10 = this.f101384y;
        if (t10 == 0) {
            return;
        }
        n nVarF = ((o) t10).F();
        if (nVarF == null) {
            this.A.a(15, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.e.a.1
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.e.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.A != null) {
                                a.this.A.e();
                            }
                            a.c(a.this);
                            a.this.b();
                        }
                    });
                }
            });
            return;
        }
        int i10 = nVarF.f101559b;
        if (i10 < 0) {
            this.A.setShowCloseButtonInCountdown(false);
        }
        this.A.setTakeoverTickEvent(true);
        this.A.a(i10, (AdCountDownButton.b) null);
        int i11 = nVarF.f101562e;
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(r.f102828a.a(i11 >= 5 ? i11 : 15)) { // from class: sg.bigo.ads.ad.e.a.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.e.a.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.A != null) {
                            a.this.A.e();
                        }
                        a.c(a.this);
                        a.this.b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                if (a.this.A != null) {
                    a.this.A.a(j10);
                }
            }
        };
        ((m) this).f101436a = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton.f100519c) {
                if (!this.f100484e && !this.f100485f) {
                    new c(this.L).a(new c.a() { // from class: sg.bigo.ads.ad.e.a.3
                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void a() {
                            if (((m) a.this).f101436a != null) {
                                ((m) a.this).f101436a.d();
                            }
                            if (a.this.A != null) {
                                a.this.A.b();
                            }
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void b() {
                            if (((m) a.this).f101436a != null && ((m) a.this).f101436a.e()) {
                                ((m) a.this).f101436a.c();
                            }
                            if (a.this.A == null || a.this.A.f100519c) {
                                return;
                            }
                            a.this.A.c();
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void c() {
                            a.s(a.this);
                            a.this.ab();
                        }

                        @Override // sg.bigo.ads.ad.e.c.a
                        public final void d() {
                        }
                    });
                    return;
                }
                adCountDownButton.e();
                b();
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.m, sg.bigo.ads.ad.interstitial.i
    public final void g(@LayoutRes int i10) {
        super.g(i10);
    }
}
