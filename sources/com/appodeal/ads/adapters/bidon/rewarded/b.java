package com.appodeal.ads.adapters.bidon.rewarded;

import android.app.Activity;
import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidon.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.utils.Log;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.ads.rewarded.RewardedAd;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedRewarded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedAd f12138a;

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, AdUnitParams adUnitParams, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        c adUnitParams2 = (c) adUnitParams;
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedAdCallback;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        Intrinsics.checkNotNullParameter(adUnitParams2, "adUnitParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            callback.onAdLoadFailed(LoadingError.InternalError);
            return;
        }
        RewardedAd rewardedAd = new RewardedAd(adUnitParams2.f12118b);
        this.f12138a = rewardedAd;
        rewardedAd.setRewardedListener(new a(callback));
        rewardedAd.addExtra("ext", adUnitParams2.f12119c);
        rewardedAd.addExtra("mediator", "appodeal");
        BidonSdk.getSegment().setCustomAttributes(adUnitParams2.f12120d);
        rewardedAd.loadAd(resumedActivity, adUnitParams2.f12117a);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onDestroy() {
        Log.log("BidonRewarded", "onDestroy", "rewardedAd: " + this.f12138a);
        RewardedAd rewardedAd = this.f12138a;
        if (rewardedAd != null) {
            rewardedAd.destroyAd();
        }
        this.f12138a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationLoss(String str, double d10) {
        super.onMediationLoss(str, d10);
        RewardedAd rewardedAd = this.f12138a;
        if (rewardedAd != null) {
            if (str == null) {
                str = "null";
            }
            rewardedAd.notifyLoss(str, d10);
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onMediationWin() {
        super.onMediationWin();
        RewardedAd rewardedAd = this.f12138a;
        if (rewardedAd != null) {
            rewardedAd.notifyWin();
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public final void onPrepareToShow(Activity activity, UnifiedAdParams unifiedAdParams) {
        UnifiedRewardedParams adTypeParams = (UnifiedRewardedParams) unifiedAdParams;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adTypeParams, "adTypeParams");
        super.onPrepareToShow(activity, adTypeParams);
        RewardedAd rewardedAd = this.f12138a;
        if (rewardedAd != null) {
            rewardedAd.addExtra("appodeal_placement_id", adTypeParams.obtainPlacementId());
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback callback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        RewardedAd rewardedAd = this.f12138a;
        if (rewardedAd == null) {
            callback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            rewardedAd.showAd(activity);
        }
    }
}
