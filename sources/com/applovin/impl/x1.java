package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.d6;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class x1 extends w1 {
    private final y1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    public x1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new y1(this.f11156a, this.f11159d, this.f11157b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        this.f11172q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f11166k;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f11165j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f11165j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f11156a.getAdEventTracker().b(b(), arrayList);
    }

    @Override // com.applovin.impl.w1
    protected void A() {
        this.M.a(this.f11167l);
        this.f11172q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    protected void I() {
        long jP;
        long millis = 0;
        if (this.f11156a.O() >= 0 || this.f11156a.P() >= 0) {
            if (this.f11156a.O() >= 0) {
                jP = this.f11156a.O();
            } else {
                if (this.f11156a.W0()) {
                    int iH1 = (int) ((com.applovin.impl.sdk.ad.a) this.f11156a).h1();
                    if (iH1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iH1);
                    } else {
                        int iR = (int) this.f11156a.r();
                        if (iR > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iR);
                        }
                    }
                }
                jP = (long) (millis * (((double) this.f11156a.P()) / 100.0d));
            }
            c(jP);
        }
    }

    @Override // com.applovin.impl.w1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f11166k, this.f11165j, b(), viewGroup);
        if (((Boolean) this.f11157b.a(x4.X5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f11165j;
            if (kVar != null) {
                kVar.b();
            }
            b().renderAd(this.f11156a);
            a("javascript:al_onPoststitialShow();", this.f11156a.x());
            if (h()) {
                long jC = C();
                this.O = jC;
                if (jC > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f11158c.a("AppLovinFullscreenActivity", "Scheduling timer for ad fully watched in " + this.O + "ms...");
                    }
                    this.N = g0.a(this.O, this.f11157b, new Runnable() { // from class: com.applovin.impl.hg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9016b.F();
                        }
                    });
                }
            }
            if (this.f11166k != null) {
                if (this.f11156a.r() >= 0) {
                    a(this.f11166k, this.f11156a.r(), new Runnable() { // from class: com.applovin.impl.ig
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f9112b.G();
                        }
                    });
                } else {
                    this.f11166k.setVisibility(0);
                }
            }
            I();
            this.f11157b.q0().a(new r6(this.f11157b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.jg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9151b.H();
                }
            }), d6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            p();
            super.c(n7.e(this.f11157b));
        }
    }

    @Override // com.applovin.impl.w1
    public void b(long j10) {
    }

    @Override // com.applovin.impl.w1
    public void e() {
        super.e();
        A();
    }

    @Override // com.applovin.impl.w1
    public void f() {
        super.f();
        A();
    }

    @Override // com.applovin.impl.w1
    protected void m() {
        super.a(D(), false, E(), -2L);
    }

    @Override // com.applovin.impl.w1
    public void v() {
    }

    @Override // com.applovin.impl.w1
    public void w() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.w1
    protected void x() {
        super.x();
        this.P.set(true);
    }

    private long C() {
        com.applovin.impl.sdk.ad.b bVar = this.f11156a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fH1 = ((com.applovin.impl.sdk.ad.a) bVar).h1();
        if (fH1 <= 0.0f) {
            fH1 = this.f11156a.r();
        }
        return (long) (n7.c(fH1) * (((double) this.f11156a.y()) / 100.0d));
    }

    private int D() {
        g0 g0Var;
        int iMin = 100;
        if (h()) {
            if (((Boolean) this.f11157b.a(x4.f11324h1)).booleanValue() && !this.f11156a.hasShown()) {
                return 0;
            }
            if (!E() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    protected boolean E() {
        if (!(this.J && this.f11156a.a1()) && h()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.w1
    public void a(String str) {
        if (!((Boolean) this.f11157b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f11156a;
            if (bVar != null) {
                bVar.a(str);
            }
            m();
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.a();
            this.N = null;
        }
        super.a(str);
    }
}
