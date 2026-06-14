package com.appodeal.ads.adapters.ironsource.rewarded_video;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.ironsource.e;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12376a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedAdCallback;
        String str = ((e) adUnitParams).f12367a;
        this.f12376a = str;
        boolean zIsISDemandOnlyRewardedVideoAvailable = IronSource.isISDemandOnlyRewardedVideoAvailable(str);
        IronSource.setISDemandOnlyRewardedVideoListener(new b(this.f12376a, unifiedRewardedCallback, zIsISDemandOnlyRewardedVideoAvailable));
        if (zIsISDemandOnlyRewardedVideoAvailable) {
            unifiedRewardedCallback.onAdLoaded();
            return;
        }
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity != null) {
            IronSource.loadISDemandOnlyRewardedVideo(resumedActivity, this.f12376a);
        } else {
            unifiedRewardedCallback.onAdLoadFailed(LoadingError.InternalError);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        if (IronSource.isISDemandOnlyRewardedVideoAvailable(this.f12376a)) {
            IronSource.showISDemandOnlyRewardedVideo(this.f12376a);
        } else {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        }
    }
}
