package com.appodeal.ads.adapters.bidon.banner;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.adapters.bidon.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.BannerView;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BannerView f12116a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        c adUnitParams2 = (c) adUnitParams;
        UnifiedBannerCallback callback = (UnifiedBannerCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        Context applicationContext = resumedActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BannerView bannerView = new BannerView(applicationContext, null, 0, adUnitParams2.f12118b, null, 22, null);
        this.f12116a = bannerView;
        bannerView.setBannerFormat(adTypeParams.useSmartBanners(resumedActivity) ? BannerFormat.Adaptive : adTypeParams.needLeaderBoard(resumedActivity) ? BannerFormat.LeaderBoard : BannerFormat.Banner);
        String strObtainPlacementId = adTypeParams.obtainPlacementId();
        if (strObtainPlacementId == null) {
            strObtainPlacementId = "default";
        }
        bannerView.addExtra("appodeal_placement_id", strObtainPlacementId);
        bannerView.addExtra("ext", adUnitParams2.f12119c);
        bannerView.addExtra("mediator", "appodeal");
        BidonSdk.getSegment().setCustomAttributes(adUnitParams2.f12120d);
        bannerView.setBannerListener(new a(this, callback));
        bannerView.loadAd(resumedActivity, adUnitParams2.f12117a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        BannerView bannerView = this.f12116a;
        if (bannerView != null) {
            bannerView.destroyAd();
        }
        this.f12116a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        BannerView bannerView = this.f12116a;
        if (bannerView != null) {
            if (str == null) {
                str = "null";
            }
            bannerView.notifyLoss(str, d10);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        BannerView bannerView = this.f12116a;
        if (bannerView != null) {
            bannerView.notifyWin();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedBannerParams adTypeParams = (UnifiedBannerParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        BannerView bannerView = this.f12116a;
        if (bannerView != null) {
            bannerView.addExtra("appodeal_placement_id", adTypeParams.obtainPlacementId());
        }
        BannerView bannerView2 = this.f12116a;
        if (bannerView2 != null) {
            bannerView2.showAd();
        }
    }
}
