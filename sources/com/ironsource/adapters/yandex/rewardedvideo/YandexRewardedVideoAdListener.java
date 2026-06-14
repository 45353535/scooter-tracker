package com.ironsource.adapters.yandex.rewardedvideo;

import com.ironsource.Df;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ironsource/adapters/yandex/rewardedvideo/YandexRewardedVideoAdListener;", "Lcom/yandex/mobile/ads/rewarded/RewardedAdLoadListener;", "Lcom/yandex/mobile/ads/rewarded/RewardedAdEventListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/yandex/rewardedvideo/YandexRewardedVideoAdapter;", "(Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;Ljava/lang/ref/WeakReference;)V", Df.f40645f, "", "onAdDismissed", "onAdFailedToLoad", "error", "Lcom/yandex/mobile/ads/common/AdRequestError;", "onAdFailedToShow", "adError", "Lcom/yandex/mobile/ads/common/AdError;", "onAdImpression", "impressionData", "Lcom/yandex/mobile/ads/common/ImpressionData;", "onAdLoaded", "rewarded", "Lcom/yandex/mobile/ads/rewarded/RewardedAd;", "onAdShown", "onRewarded", "reward", "Lcom/yandex/mobile/ads/rewarded/Reward;", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexRewardedVideoAdListener implements RewardedAdLoadListener, RewardedAdEventListener {

    @NotNull
    private final WeakReference<YandexRewardedVideoAdapter> mAdapter;

    @NotNull
    private final RewardedVideoSmashListener mListener;

    public YandexRewardedVideoAdListener(@NotNull RewardedVideoSmashListener mListener, @NotNull WeakReference<YandexRewardedVideoAdapter> mAdapter) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdClosed();
        YandexRewardedVideoAdapter yandexRewardedVideoAdapter = this.mAdapter.get();
        if (yandexRewardedVideoAdapter != null) {
            yandexRewardedVideoAdapter.destroyRewardedVideoAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public void onAdFailedToLoad(@NotNull AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getDescription());
        YandexRewardedVideoAdapter yandexRewardedVideoAdapter = this.mAdapter.get();
        if (yandexRewardedVideoAdapter != null) {
            yandexRewardedVideoAdapter.setRewardedVideoAdAvailability$yandexadapter_release(false);
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(YandexAdapter.INSTANCE.getLoadErrorAndCheckNoFill(error, 1058));
        YandexRewardedVideoAdapter yandexRewardedVideoAdapter2 = this.mAdapter.get();
        if (yandexRewardedVideoAdapter2 != null) {
            yandexRewardedVideoAdapter2.destroyRewardedVideoAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdFailedToShow(@NotNull AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorMessage = " + adError.getDescription());
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, adError.getDescription()));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdImpression(@Nullable ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdOpened();
        this.mListener.onRewardedVideoAdStarted();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public void onAdLoaded(@NotNull RewardedAd rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        IronLog.ADAPTER_CALLBACK.verbose();
        YandexRewardedVideoAdapter yandexRewardedVideoAdapter = this.mAdapter.get();
        if (yandexRewardedVideoAdapter != null) {
            yandexRewardedVideoAdapter.setRewardedVideoAd$yandexadapter_release(rewarded);
        }
        YandexRewardedVideoAdapter yandexRewardedVideoAdapter2 = this.mAdapter.get();
        if (yandexRewardedVideoAdapter2 != null) {
            yandexRewardedVideoAdapter2.setRewardedVideoAdAvailability$yandexadapter_release(true);
        }
        this.mListener.onRewardedVideoAvailabilityChanged(true);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onRewarded(@NotNull Reward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onRewardedVideoAdEnded();
        this.mListener.onRewardedVideoAdRewarded();
    }
}
