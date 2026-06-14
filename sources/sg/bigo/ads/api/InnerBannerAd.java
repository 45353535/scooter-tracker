package sg.bigo.ads.api;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.b.d;

/* JADX INFO: loaded from: classes4.dex */
public interface InnerBannerAd extends BannerAd {
    void destroyInMainThread();

    sg.bigo.ads.api.core.b getInnerBannerAdData();

    sg.bigo.ads.common.view.c getWatermarkView();

    WebView getWebView();

    void handleInnerBannerAdResponse(@NonNull d.a<InnerBannerAd> aVar);

    boolean isInnerBannerAdFromAutoRefresh();

    void markFromAutoFresh(sg.bigo.ads.api.core.b bVar);

    int updateFormOpenTimes();
}
