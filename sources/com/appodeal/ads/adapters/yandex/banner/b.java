package com.appodeal.ads.adapters.yandex.banner;

import android.content.Context;
import android.location.Location;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.yandex.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAdView f12608a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        BannerAdSize bannerAdSizeFixedSize;
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        c adUnitParams2 = (c) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        if (adTypeParams.useSmartBanners(applicationContext)) {
            setRefreshOnRotate(true);
            bannerAdSizeFixedSize = BannerAdSize.INSTANCE.inlineSize(applicationContext, adTypeParams.getMaxWidth(applicationContext), adTypeParams.getMaxHeight(applicationContext));
        } else {
            bannerAdSizeFixedSize = adTypeParams.needLeaderBoard(applicationContext) ? BannerAdSize.INSTANCE.fixedSize(applicationContext, 728, 90) : BannerAdSize.INSTANCE.fixedSize(applicationContext, 320, 50);
        }
        BannerAdView bannerAdView = new BannerAdView(applicationContext);
        this.f12608a = bannerAdView;
        bannerAdView.setAdSize(bannerAdSizeFixedSize);
        bannerAdView.setAdUnitId(adUnitParams2.f12609a);
        bannerAdView.setBannerAdEventListener(new a(callback, bannerAdView));
        Intrinsics.checkNotNullParameter(adUnitParams2, "<this>");
        AdRequest.Builder builder = new AdRequest.Builder();
        Location location = adUnitParams2.f12610b;
        if (location != null) {
            builder.setLocation(location);
        }
        Map<String, String> map = adUnitParams2.f12611c;
        if (map != null) {
            builder.setParameters(map);
        }
        bannerAdView.loadAd(builder.build());
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerAdView bannerAdView = this.f12608a;
        if (bannerAdView != null) {
            bannerAdView.destroy();
        }
        this.f12608a = null;
    }
}
