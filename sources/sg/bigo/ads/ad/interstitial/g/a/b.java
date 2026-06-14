package sg.bigo.ads.ad.interstitial.g.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends y {
    private int I;

    protected b(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void X() {
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final w b() {
        w wVarB = super.b();
        wVarB.f101803c = this.I;
        return wVarB;
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void l() {
        super.l();
        ((y) this).G.a(((long) this.I) * 1000);
    }

    protected b(@NonNull Activity activity, int i10) {
        super(activity);
        this.I = i10;
    }
}
