package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes4.dex */
public class a extends d {
    public a(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage_7_8;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        super.b();
        View viewP = p(R.id.inter_webview_close);
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f101236a;
        if (landingPageStyleConfig == null || viewP == null || landingPageStyleConfig.f103721a != 8) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewP.getLayoutParams();
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = sg.bigo.ads.common.utils.e.a(this.L, 20);
    }
}
