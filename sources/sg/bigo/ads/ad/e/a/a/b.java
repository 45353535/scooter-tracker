package sg.bigo.ads.ad.e.a.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.e.g;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {
    private int K;

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
        wVarB.f101803c = this.K;
        return wVarB;
    }

    @Override // sg.bigo.ads.ad.e.g, sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void l() {
        super.l();
        ((y) this).G.a(((long) this.K) * 1000);
    }

    protected b(@NonNull Activity activity, int i10, boolean z10) {
        super(activity);
        ((g) this).J = z10;
        this.K = i10;
    }
}
