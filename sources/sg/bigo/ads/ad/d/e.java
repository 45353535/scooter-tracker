package sg.bigo.ads.ad.d;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.popup.PopupAd;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends s implements PopupAd {
    public e(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.s, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.controller.e.b<?>> D() {
        return B() ? J() ? sg.bigo.ads.ad.interstitial.k.b.class : h.class : g.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void a(Context context) {
        if (sg.bigo.ads.controller.landing.e.a(context, D(), this)) {
            return;
        }
        a(2004, "This ad cannot be open");
    }
}
