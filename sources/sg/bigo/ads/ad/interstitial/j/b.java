package sg.bigo.ads.ad.interstitial.j;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.h;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {
    public b(InterstitialAd interstitialAd, Context context, @NonNull n nVar) {
        super(interstitialAd, context, nVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.j.a, sg.bigo.ads.ad.banner.g
    public final void a(View view, View view2, h.b bVar) {
        int iA = bVar != null ? bVar.a() : 0;
        int iB = bVar != null ? bVar.b() : 0;
        Context context = this.f101401a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (iA <= 0 || iB <= 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = e.a(context, iA);
            layoutParams.height = e.a(context, iB);
            layoutParams.gravity = 17;
            view2.setMinimumHeight(e.a(context, iB));
        }
    }
}
