package com.appodeal.ads.adapters.admob.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedAdmobBanner<AdViewType extends BaseAdView, AdRequestType extends AdRequest> extends UnifiedBanner<UnifiedAdmobAdUnitParams<AdRequestType>> {

    @Nullable
    private AdViewType adView;

    @NonNull
    public abstract AdViewType createAdView(@NonNull Context context);

    @NonNull
    public AdListener createListener(@NonNull UnifiedBannerCallback unifiedBannerCallback, @NonNull AdViewType adviewtype, int i10) {
        return new a(unifiedBannerCallback, adviewtype, i10);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void onDestroy() {
        AdViewType adviewtype = this.adView;
        if (adviewtype != null) {
            adviewtype.destroy();
            this.adView = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerParams unifiedBannerParams, @NonNull UnifiedAdmobAdUnitParams<AdRequestType> unifiedAdmobAdUnitParams, @NonNull UnifiedBannerCallback unifiedBannerCallback) {
        int height;
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        AdViewType adviewtype = (AdViewType) createAdView(resumedActivity);
        this.adView = adviewtype;
        adviewtype.setAdUnitId(unifiedAdmobAdUnitParams.getKey());
        float screenHeightInDp = UnifiedAdUtils.getScreenHeightInDp(resumedActivity);
        if (unifiedAdmobAdUnitParams.getUseAdaptiveBanner() && unifiedBannerParams.useSmartBanners(resumedActivity)) {
            AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(resumedActivity, unifiedBannerParams.getMaxWidth(resumedActivity));
            this.adView.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
            height = currentOrientationAnchoredAdaptiveBannerAdSize.getHeight();
            setRefreshOnRotate(true);
        } else if (unifiedAdmobAdUnitParams.getUseSmartBanner() && unifiedBannerParams.useSmartBanners(resumedActivity)) {
            this.adView.setAdSize(AdSize.SMART_BANNER);
            height = screenHeightInDp <= 400.0f ? 32 : screenHeightInDp > 720.0f ? 90 : 50;
            setRefreshOnRotate(true);
        } else if (unifiedBannerParams.needLeaderBoard(resumedActivity)) {
            this.adView.setAdSize(AdSize.LEADERBOARD);
            height = 90;
        } else {
            this.adView.setAdSize(AdSize.BANNER);
            height = 50;
        }
        AdViewType adviewtype2 = this.adView;
        adviewtype2.setAdListener(createListener(unifiedBannerCallback, adviewtype2, height));
        this.adView.loadAd(unifiedAdmobAdUnitParams.getRequest());
    }
}
