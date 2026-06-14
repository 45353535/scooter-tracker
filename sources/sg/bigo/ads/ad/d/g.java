package sg.bigo.ads.ad.d;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.d.f;
import sg.bigo.ads.ad.interstitial.d.w;
import sg.bigo.ads.ad.interstitial.p;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.utils.n;

/* JADX INFO: loaded from: classes4.dex */
public class g extends x implements f.a {
    private w I;

    protected g(@NonNull Activity activity) {
        super(activity);
        activity.overridePendingTransition(0, 0);
    }

    private w ar() {
        if (this.I == null) {
            this.I = sg.bigo.ads.ad.interstitial.d.a.a(this.C, ((sg.bigo.ads.ad.interstitial.a) this).f100542c, n());
        }
        return this.I;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean U() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        int iN = n();
        return iN != 2 ? iN != 3 ? iN != 4 ? iN != 5 ? iN != 6 ? R.layout.bigo_ad_activity_pop_up_style_1 : R.layout.bigo_ad_activity_pop_up_style_6 : R.layout.bigo_ad_activity_pop_up_style_5 : R.layout.bigo_ad_activity_pop_up_style_4 : R.layout.bigo_ad_activity_pop_up_style_3 : R.layout.bigo_ad_activity_pop_up_style_2;
    }

    @Override // sg.bigo.ads.ad.d.f.a
    public final void a() {
        e(true);
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
    }

    @Override // sg.bigo.ads.ad.interstitial.x
    public final void ao() {
        MediaView mediaView;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media)) == null) {
            return;
        }
        if (!((x) this).G) {
            mediaView.setMediaAreaClickable(false);
        }
        ar().a((ViewGroup) mediaView);
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z10) {
        b(true);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g() {
        super.g();
        if (this.A == null) {
            ar().q();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void i() {
        super.i();
        if (this.A == null) {
            ar().p();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.x
    public final void l(int i10) {
        ar();
        w.a(this.D, this.f100551l);
        n nVarE = ar().e(this.D);
        this.f100560u = nVarE;
        if (nVarE == null) {
            ar().f(this.D);
        } else {
            nVarE.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void q() {
        ar().a(this.A, this.D, this);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void w() {
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(@NonNull ViewGroup viewGroup) {
        ar().c(viewGroup);
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g(@LayoutRes int i10) {
        super.g(i10);
        if (this.D == null) {
            return;
        }
        p pVar = this.f100557r;
        if (pVar != null) {
            pVar.b();
        }
        ar().g(this.D);
        ar().h(this.D);
        ar().d(this.D);
        ar().a(p(R.id.inter_container), this.D.findViewById(R.id.media_layout));
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void a(boolean z10) {
    }
}
