package com.appodeal.ads.adapters.yandex.mrec;

import android.content.Context;
import android.location.Location;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.yandex.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedMrec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerAdView f12630a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedMrecParams adTypeParams = (UnifiedMrecParams) unifiedAdParams;
        c adUnitParams2 = (c) adUnitParams;
        UnifiedMrecCallback callback = (UnifiedMrecCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Context applicationContext = contextProvider.getApplicationContext();
        BannerAdView bannerAdView = new BannerAdView(applicationContext);
        this.f12630a = bannerAdView;
        bannerAdView.setAdSize(BannerAdSize.INSTANCE.fixedSize(applicationContext, 300, 250));
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
        BannerAdView bannerAdView = this.f12630a;
        if (bannerAdView != null) {
            bannerAdView.destroy();
        }
        this.f12630a = null;
    }
}
