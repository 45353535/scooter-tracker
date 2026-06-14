package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes4.dex */
public class m extends i<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f101436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f101437b;

    protected m(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        RelativeLayout relativeLayout = this.f101437b;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        sg.bigo.ads.common.utils.n nVar = this.f101436a;
        if (nVar != null) {
            nVar.b();
            this.f101436a = null;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected int Y() {
        return R.layout.bigo_ad_activity_interstitial_banner;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final boolean Z() {
        return false;
    }

    protected void a() {
        n nVarF;
        T t10 = this.f101384y;
        if (t10 == 0 || (nVarF = ((o) t10).F()) == null) {
            return;
        }
        int iMax = Math.max(nVarF.f101559b, 0);
        this.A.setTakeoverTickEvent(true);
        this.A.a(iMax, (AdCountDownButton.b) null);
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(sg.bigo.ads.common.utils.r.f102828a.a(Math.max(nVarF.f101562e, 0))) { // from class: sg.bigo.ads.ad.interstitial.m.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                AdCountDownButton adCountDownButton = m.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.e();
                    m.this.A.setTakeoverTickEvent(false);
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                AdCountDownButton adCountDownButton = m.this.A;
                if (adCountDownButton != null) {
                    adCountDownButton.a(j10);
                }
            }
        };
        this.f101436a = nVar;
        nVar.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected final void g() {
        super.g();
        sg.bigo.ads.common.utils.n nVar = this.f101436a;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f101436a.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    @CallSuper
    protected final void i() {
        super.i();
        sg.bigo.ads.common.utils.n nVar = this.f101436a;
        if (nVar != null) {
            nVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected final void l() {
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    protected void g(@LayoutRes int i10) {
        T t10 = this.f101384y;
        if (t10 == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        ((o) t10).C = new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.m.1
            @Override // sg.bigo.ads.ad.banner.h
            public final void a() {
                m.this.d(true);
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void b() {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void a(String str) {
            }

            @Override // sg.bigo.ads.ad.banner.h
            public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
            }
        };
        this.f101437b = (RelativeLayout) this.f101385z.findViewById(R.id.inter_banner_container);
        ((o) this.f101384y).a(this.A, p(R.id.click_proxy));
        o oVar = (o) this.f101384y;
        if (!sg.bigo.ads.common.n.d.b()) {
            sg.bigo.ads.common.utils.t.a("adView() must run on UI thread");
        }
        View viewC = oVar.B.c();
        oVar.a(viewC, false);
        if (viewC != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            sg.bigo.ads.common.utils.u.a(viewC, this.f101437b, layoutParams, 0);
        }
        Activity activity = this.L;
        sg.bigo.ads.ad.banner.c<o> cVar = ((o) this.f101384y).B;
        sg.bigo.ads.common.view.c.a(activity, null, cVar != null ? cVar.f100276v : null);
        a();
    }
}
