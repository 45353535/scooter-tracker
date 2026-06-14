package sg.bigo.ads.ad.e;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.w;

/* JADX INFO: loaded from: classes4.dex */
public class f extends sg.bigo.ads.ad.interstitial.k.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    protected h f100509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f100510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f100511e;

    protected f(@NonNull Activity activity) {
        super(activity);
        this.f100510d = true;
        this.f100511e = false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        super.T();
        T t10 = this.f101384y;
        if (t10 == 0) {
            return;
        }
        if (t10 instanceof h) {
            this.f100509c = (h) t10;
        }
        if (this.f100509c == null || !am()) {
            a("Illegal VPAID content.");
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a
    public final void a() {
        AdCountDownButton adCountDownButton = this.A;
        if (adCountDownButton != null) {
            adCountDownButton.setShowCloseButtonInCountdown(false);
        }
        super.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.controller.e.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ag() {
        if (this.f100510d) {
            d(true);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int ai() {
        return 2;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z10) {
        if (this.A.getVisibility() == 0) {
            AdCountDownButton adCountDownButton = this.A;
            if (adCountDownButton.f100519c) {
                if (!this.f100511e) {
                    adCountDownButton.e();
                    h hVar = this.f100509c;
                    if (hVar != null) {
                        this.f100511e = true;
                        hVar.N();
                    }
                }
                super.d(true);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void l() {
        super.l();
        w wVar = ((sg.bigo.ads.ad.interstitial.k.a) this).f101411a;
        if (wVar != null) {
            wVar.f101803c = 15;
            wVar.f101806f = true;
            wVar.f101807g = false;
        }
    }
}
