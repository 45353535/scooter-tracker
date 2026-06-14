package com.appodeal.ads.adapters.unityads.banner;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.unityads.e;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerView f12559a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        e eVar = (e) adUnitParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        UnityBannerSize unityBannerSize = ((UnifiedBannerParams) unifiedAdParams).needLeaderBoard(contextProvider.getApplicationContext()) ? new UnityBannerSize(728, 90) : new UnityBannerSize(320, 50);
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            unifiedBannerCallback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        String str = eVar.f12565a;
        if (str.isEmpty()) {
            str = "banner";
        }
        BannerView bannerView = new BannerView(resumedActivity, str, unityBannerSize);
        this.f12559a = bannerView;
        bannerView.setListener(new c(unifiedBannerCallback));
        this.f12559a.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerView bannerView = this.f12559a;
        if (bannerView != null) {
            bannerView.destroy();
            this.f12559a = null;
        }
    }
}
