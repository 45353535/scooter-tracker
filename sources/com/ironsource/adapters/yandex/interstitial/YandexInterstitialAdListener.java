package com.ironsource.adapters.yandex.interstitial;

import com.ironsource.Df;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ironsource/adapters/yandex/interstitial/YandexInterstitialAdListener;", "Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoadListener;", "Lcom/yandex/mobile/ads/interstitial/InterstitialAdEventListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/yandex/interstitial/YandexInterstitialAdapter;", "(Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;Ljava/lang/ref/WeakReference;)V", Df.f40645f, "", "onAdDismissed", "onAdFailedToLoad", "error", "Lcom/yandex/mobile/ads/common/AdRequestError;", "onAdFailedToShow", "adError", "Lcom/yandex/mobile/ads/common/AdError;", "onAdImpression", "impressionData", "Lcom/yandex/mobile/ads/common/ImpressionData;", "onAdLoaded", "interstitialAd", "Lcom/yandex/mobile/ads/interstitial/InterstitialAd;", "onAdShown", "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexInterstitialAdListener implements InterstitialAdLoadListener, InterstitialAdEventListener {

    @NotNull
    private final WeakReference<YandexInterstitialAdapter> mAdapter;

    @NotNull
    private final InterstitialSmashListener mListener;

    public YandexInterstitialAdListener(@NotNull InterstitialSmashListener mListener, @NotNull WeakReference<YandexInterstitialAdapter> mAdapter) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        this.mListener = mListener;
        this.mAdapter = mAdapter;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdDismissed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
        YandexInterstitialAdapter yandexInterstitialAdapter = this.mAdapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.destroyInterstitialAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public void onAdFailedToLoad(@NotNull AdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getDescription());
        YandexInterstitialAdapter yandexInterstitialAdapter = this.mAdapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.setInterstitialAdAvailability$yandexadapter_release(false);
        }
        this.mListener.onInterstitialAdLoadFailed(YandexAdapter.INSTANCE.getLoadErrorAndCheckNoFill(error, 1158));
        YandexInterstitialAdapter yandexInterstitialAdapter2 = this.mAdapter.get();
        if (yandexInterstitialAdapter2 != null) {
            yandexInterstitialAdapter2.destroyInterstitialAd$yandexadapter_release();
        }
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdFailedToShow(@NotNull AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to show, errorMessage = " + adError.getDescription());
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", adError.getDescription()));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdImpression(@Nullable ImpressionData impressionData) {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
    public void onAdLoaded(@NotNull InterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        IronLog.ADAPTER_CALLBACK.verbose();
        YandexInterstitialAdapter yandexInterstitialAdapter = this.mAdapter.get();
        if (yandexInterstitialAdapter != null) {
            yandexInterstitialAdapter.setInterstitialAd$yandexadapter_release(interstitialAd);
        }
        YandexInterstitialAdapter yandexInterstitialAdapter2 = this.mAdapter.get();
        if (yandexInterstitialAdapter2 != null) {
            yandexInterstitialAdapter2.setInterstitialAdAvailability$yandexadapter_release(true);
        }
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
    public void onAdShown() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }
}
