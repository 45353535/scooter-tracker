package sg.bigo.ads.ad.interstitial.g.a;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends x {
    private int I;

    protected a(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void X() {
    }

    @Override // sg.bigo.ads.ad.interstitial.x, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final w b() {
        w wVarB = super.b();
        wVarB.f101803c = this.I;
        return wVarB;
    }

    protected a(@NonNull Activity activity, int i10) {
        super(activity);
        this.I = i10;
    }
}
