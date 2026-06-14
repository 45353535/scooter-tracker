package sg.bigo.ads.ad.e.a.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.e.e;
import sg.bigo.ads.ad.interstitial.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {
    private int K;

    protected a(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void X() {
    }

    @Override // sg.bigo.ads.ad.e.e, sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final w b() {
        w wVarB = super.b();
        wVarB.f101803c = this.K;
        return wVarB;
    }

    protected a(@NonNull Activity activity, int i10, boolean z10) {
        super(activity);
        ((e) this).J = z10;
        this.K = i10;
    }
}
