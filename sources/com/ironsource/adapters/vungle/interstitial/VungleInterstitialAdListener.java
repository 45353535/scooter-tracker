package com.ironsource.adapters.vungle.interstitial;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ironsource/adapters/vungle/interstitial/VungleInterstitialAdListener;", "Lcom/vungle/ads/InterstitialAdListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/vungle/interstitial/VungleInterstitialAdapter;", "mListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "mPlacementId", "", "(Ljava/lang/ref/WeakReference;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;Ljava/lang/String;)V", Df.f40645f, "", "baseAd", "Lcom/vungle/ads/BaseAd;", "onAdEnd", "onAdFailedToLoad", "adError", "Lcom/vungle/ads/VungleError;", "onAdFailedToPlay", "onAdImpression", Df.f40650k, "onAdLoaded", "onAdStart", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleInterstitialAdListener implements InterstitialAdListener {

    @NotNull
    private final WeakReference<VungleInterstitialAdapter> mAdapter;

    @NotNull
    private final InterstitialSmashListener mListener;

    @NotNull
    private final String mPlacementId;

    public VungleInterstitialAdListener(@NotNull WeakReference<VungleInterstitialAdapter> mAdapter, @NotNull InterstitialSmashListener mListener, @NotNull String mPlacementId) {
        Intrinsics.checkNotNullParameter(mAdapter, "mAdapter");
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mPlacementId, "mPlacementId");
        this.mAdapter = mAdapter;
        this.mListener = mListener;
        this.mPlacementId = mPlacementId;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", errorCode= " + adError.getCode() + " error = " + adError.getErrorMessage());
        VungleInterstitialAdapter vungleInterstitialAdapter = this.mAdapter.get();
        if (vungleInterstitialAdapter != null) {
            vungleInterstitialAdapter.setInterstitialAdAvailability$vungleadapter_release(this.mPlacementId, false);
        }
        String str = adError.getErrorMessage() + "( " + adError.getCode() + " )";
        this.mListener.onInterstitialAdLoadFailed(adError.getCode() == 10001 ? new IronSourceError(1158, str) : ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", errorCode = " + adError.getCode() + ", errorMessage = " + adError.getMessage());
        IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", " reason = " + adError.getErrorMessage() + " errorCode = " + adError.getCode());
        Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildShowFailedError, "buildShowFailedError(\n  …   errorMessage\n        )");
        this.mListener.onInterstitialAdShowFailed(ironSourceErrorBuildShowFailedError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        VungleInterstitialAdapter vungleInterstitialAdapter = this.mAdapter.get();
        if (vungleInterstitialAdapter != null) {
            vungleInterstitialAdapter.setInterstitialAdAvailability$vungleadapter_release(this.mPlacementId, true);
        }
        String creativeId = baseAd.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", creativeId = " + creativeId);
        if (creativeId == null || creativeId.length() == 0) {
            this.mListener.onInterstitialAdReady();
        } else {
            this.mListener.onInterstitialAdReady(MapsKt.mapOf(TuplesKt.to("creativeId", creativeId)));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
