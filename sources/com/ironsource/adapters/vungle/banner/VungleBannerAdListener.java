package com.ironsource.adapters.vungle.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ironsource/adapters/vungle/banner/VungleBannerAdListener;", "Lcom/vungle/ads/BannerAdListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mPlacementId", "", "bannerView", "Lcom/vungle/ads/VungleBannerView;", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/String;Lcom/vungle/ads/VungleBannerView;)V", Df.f40645f, "", "baseAd", "Lcom/vungle/ads/BaseAd;", "onAdEnd", "onAdFailedToLoad", "adError", "Lcom/vungle/ads/VungleError;", "onAdFailedToPlay", "onAdImpression", Df.f40650k, "onAdLoaded", "onAdStart", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleBannerAdListener implements BannerAdListener {

    @NotNull
    private final VungleBannerView bannerView;

    @NotNull
    private final BannerSmashListener mListener;

    @NotNull
    private final String mPlacementId;

    public VungleBannerAdListener(@NotNull BannerSmashListener mListener, @NotNull String mPlacementId, @NotNull VungleBannerView bannerView) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mPlacementId, "mPlacementId");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.mListener = mListener;
        this.mPlacementId = mPlacementId;
        this.bannerView = bannerView;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", errorCode = " + adError.getCode() + ", errorMessage = " + adError.getMessage());
        String str = adError.getErrorMessage() + "( " + adError.getCode() + " )";
        this.mListener.onBannerAdLoadFailed(adError.getCode() == 10001 ? new IronSourceError(606, str) : ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NotNull BaseAd baseAd, @NotNull VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", errorCode = " + adError.getCode() + ", errorMessage = " + adError.getErrorMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onBannerAdShown();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        this.mListener.onBannerAdLeftApplication();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, this.bannerView.getAdViewSize().getWidth()), AdapterUtils.dpToPixels(applicationContext, this.bannerView.getAdViewSize().getHeight()), 17);
        String creativeId = baseAd.getCreativeId();
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + ", creativeId = " + creativeId);
        if (creativeId == null || creativeId.length() == 0) {
            this.mListener.onBannerAdLoaded(this.bannerView, layoutParams);
        } else {
            this.mListener.onBannerAdLoaded(this.bannerView, layoutParams, MapsKt.mapOf(TuplesKt.to("creativeId", creativeId)));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NotNull BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
    }
}
