package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.i0;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements RewardedInterstitialAdShowListener, AdShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdShowListener f54833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardedInterstitialAdShowListener f54834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f54835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.i0 f54836d;

    public m(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, Function0 provideSdkEvents, com.moloco.sdk.internal.i0 sdkEventUrlTracker) {
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f54833a = v.a(rewardedInterstitialAdShowListener);
        this.f54834b = rewardedInterstitialAdShowListener;
        this.f54835c = provideSdkEvents;
        this.f54836d = sdkEventUrlTracker;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54833a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54833a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f54834b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f54833a.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(MolocoAd molocoAd) {
        String onRewardedVideoCompleted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f54835c.invoke();
        if (zVar != null && (onRewardedVideoCompleted = zVar.getOnRewardedVideoCompleted()) != null) {
            i0.a.a(this.f54836d, onRewardedVideoCompleted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f54834b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(MolocoAd molocoAd) {
        String onRewardedVideoStarted;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f54835c.invoke();
        if (zVar != null && (onRewardedVideoStarted = zVar.getOnRewardedVideoStarted()) != null) {
            i0.a.a(this.f54836d, onRewardedVideoStarted, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f54834b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(MolocoAd molocoAd) {
        String onUserRewarded;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.ortb.model.z zVar = (com.moloco.sdk.internal.ortb.model.z) this.f54835c.invoke();
        if (zVar != null && (onUserRewarded = zVar.getOnUserRewarded()) != null) {
            i0.a.a(this.f54836d, onUserRewarded, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f54834b;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
