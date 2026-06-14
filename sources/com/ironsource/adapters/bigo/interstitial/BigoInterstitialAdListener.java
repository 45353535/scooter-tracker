package com.ironsource.adapters.bigo.interstitial;

import com.ironsource.Df;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ironsource/adapters/bigo/interstitial/BigoInterstitialAdListener;", "Lsg/bigo/ads/api/AdInteractionListener;", "Lsg/bigo/ads/api/AdLoadListener;", "Lsg/bigo/ads/api/InterstitialAd;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/bigo/interstitial/BigoInterstitialAdapter;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "(Ljava/lang/ref/WeakReference;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", Df.f40645f, "", Df.f40646g, TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lsg/bigo/ads/api/AdError;", "onAdImpression", "onAdLoaded", "ad", Df.f40642c, "onError", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoInterstitialAdListener implements AdInteractionListener, AdLoadListener<InterstitialAd> {

    @NotNull
    private final WeakReference<BigoInterstitialAdapter> mAdapter;

    @NotNull
    private final InterstitialSmashListener mListener;

    public BigoInterstitialAdListener(@NotNull WeakReference<BigoInterstitialAdapter> mAdapter, @NotNull InterstitialSmashListener mListener) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        this.mAdapter = mAdapter;
        this.mListener = mListener;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdClosed();
        BigoInterstitialAdapter bigoInterstitialAdapter = this.mAdapter.get();
        if (bigoInterstitialAdapter != null) {
            bigoInterstitialAdapter.destroyInterstitialAd$bigoadapter_release();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + error.getCode() + ", errorMessage = " + error.getMessage());
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", error.getMessage()));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onInterstitialAdOpened();
        this.mListener.onInterstitialAdShowSucceeded();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onError(@NotNull AdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose("onError code: " + error.getCode() + ", " + error.getMessage());
        this.mListener.onInterstitialAdLoadFailed(BigoAdapter.INSTANCE.getLoadError(error));
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(@NotNull InterstitialAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        IronLog.INTERNAL.verbose("onAdLoaded");
        BigoInterstitialAdapter bigoInterstitialAdapter = this.mAdapter.get();
        if (bigoInterstitialAdapter != null) {
            bigoInterstitialAdapter.setInterstitialAd$bigoadapter_release(ad2);
        }
        BigoInterstitialAdapter bigoInterstitialAdapter2 = this.mAdapter.get();
        if (bigoInterstitialAdapter2 != null) {
            bigoInterstitialAdapter2.setInterstitialAdAvailability$bigoadapter_release(true);
        }
        this.mListener.onInterstitialAdReady();
    }
}
