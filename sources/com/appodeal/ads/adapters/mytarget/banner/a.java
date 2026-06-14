package com.appodeal.ads.adapters.mytarget.banner;

import android.content.Context;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.my.target.ads.MyTargetView;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MyTargetView f12542a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        MyTargetView.AdSize adSizeForCurrentOrientation;
        int height;
        UnifiedBannerParams unifiedBannerParams = (UnifiedBannerParams) unifiedAdParams;
        com.appodeal.ads.adapters.mytarget.a aVar = (com.appodeal.ads.adapters.mytarget.a) adUnitParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (unifiedBannerParams.useSmartBanners(applicationContext)) {
            adSizeForCurrentOrientation = MyTargetView.AdSize.getAdSizeForCurrentOrientation(unifiedBannerParams.getMaxWidth(applicationContext), applicationContext);
            height = adSizeForCurrentOrientation.getHeight();
            setRefreshOnRotate(true);
        } else if (unifiedBannerParams.needLeaderBoard(applicationContext)) {
            adSizeForCurrentOrientation = MyTargetView.AdSize.ADSIZE_728x90;
            height = 90;
        } else {
            adSizeForCurrentOrientation = MyTargetView.AdSize.ADSIZE_320x50;
            height = 50;
        }
        MyTargetView myTargetView = new MyTargetView(applicationContext);
        this.f12542a = myTargetView;
        myTargetView.setSlotId(aVar.f12540a);
        this.f12542a.setAdSize(adSizeForCurrentOrientation);
        this.f12542a.setRefreshAd(false);
        aVar.a(this.f12542a.getCustomParams());
        this.f12542a.setListener(new b(unifiedBannerCallback, height));
        this.f12542a.load();
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        MyTargetView myTargetView = this.f12542a;
        if (myTargetView != null) {
            myTargetView.destroy();
            this.f12542a = null;
        }
    }
}
