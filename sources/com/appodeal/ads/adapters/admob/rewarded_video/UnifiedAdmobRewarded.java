package com.appodeal.ads.adapters.admob.rewarded_video;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdContainer;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobFullscreenDisplayListener;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes6.dex */
public class UnifiedAdmobRewarded<AdRequestType extends AdRequest> extends UnifiedRewarded<UnifiedAdmobAdUnitParams<AdRequestType>> {

    @Nullable
    private UnifiedAdContainer<RewardedAd> unifiedAdContainer;

    @NonNull
    public RewardedAdLoadCallback createLoadListener(@NonNull UnifiedRewardedCallback unifiedRewardedCallback, @NonNull UnifiedAdContainer<RewardedAd> unifiedAdContainer) {
        return new a(unifiedRewardedCallback, unifiedAdContainer);
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void onDestroy() {
        UnifiedAdContainer<RewardedAd> unifiedAdContainer = this.unifiedAdContainer;
        if (unifiedAdContainer != null) {
            unifiedAdContainer.destroy();
            this.unifiedAdContainer = null;
        }
    }

    @Override // com.appodeal.ads.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedRewardedParams unifiedRewardedParams, @NonNull UnifiedAdmobAdUnitParams<AdRequestType> unifiedAdmobAdUnitParams, @NonNull UnifiedRewardedCallback unifiedRewardedCallback) {
        this.unifiedAdContainer = new UnifiedAdContainer<>();
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        RewardedAd.load(resumedActivity, unifiedAdmobAdUnitParams.getKey(), unifiedAdmobAdUnitParams.getRequest(), createLoadListener(unifiedRewardedCallback, this.unifiedAdContainer));
    }

    @Override // com.appodeal.ads.unified.UnifiedFullscreenAd
    public void show(@NonNull Activity activity, @NonNull final UnifiedRewardedCallback unifiedRewardedCallback) {
        UnifiedAdContainer<RewardedAd> unifiedAdContainer = this.unifiedAdContainer;
        RewardedAd ad2 = unifiedAdContainer != null ? unifiedAdContainer.getAd() : null;
        if (ad2 == null) {
            unifiedRewardedCallback.onAdShowFailed(ShowError.NetworkShowError.ErrorDuringShow.INSTANCE);
        } else {
            ad2.setFullScreenContentCallback(new UnifiedAdmobFullscreenDisplayListener(unifiedRewardedCallback));
            ad2.show(activity, new OnUserEarnedRewardListener() { // from class: com.appodeal.ads.adapters.admob.rewarded_video.b
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    unifiedRewardedCallback.onAdFinished();
                }
            });
        }
    }
}
