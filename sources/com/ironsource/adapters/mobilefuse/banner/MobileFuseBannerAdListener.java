package com.ironsource.adapters.mobilefuse.banner;

import android.widget.FrameLayout;
import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/banner/MobileFuseBannerAdListener;", "Lcom/mobilefuse/sdk/MobileFuseBannerAd$Listener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mAdView", "Lcom/mobilefuse/sdk/MobileFuseBannerAd;", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Lcom/mobilefuse/sdk/MobileFuseBannerAd;Landroid/widget/FrameLayout$LayoutParams;)V", Df.f40645f, "", "onAdCollapsed", TelemetryAdLifecycleEvent.AD_ERROR, "error", "Lcom/mobilefuse/sdk/AdError;", "onAdExpanded", "onAdExpired", "onAdLoaded", "onAdNotFilled", "onAdRendered", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseBannerAdListener implements MobileFuseBannerAd.Listener {

    @Nullable
    private final MobileFuseBannerAd mAdView;

    @NotNull
    private final FrameLayout.LayoutParams mLayoutParams;

    @NotNull
    private final BannerSmashListener mListener;

    public MobileFuseBannerAdListener(@NotNull BannerSmashListener mListener, @Nullable MobileFuseBannerAd mobileFuseBannerAd, @NotNull FrameLayout.LayoutParams mLayoutParams) {
        Intrinsics.checkNotNullParameter(mListener, "mListener");
        Intrinsics.checkNotNullParameter(mLayoutParams, "mLayoutParams");
        this.mListener = mListener;
        this.mAdView = mobileFuseBannerAd;
        this.mLayoutParams = mLayoutParams;
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdClicked();
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public void onAdCollapsed() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdError(@Nullable AdError error) {
        int errorCode = error != null ? error.getErrorCode() : 0;
        String errorMessage = error != null ? error.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        }
        IronLog.ADAPTER_CALLBACK.verbose("Failed to load, errorCode = " + errorCode + ", errorMessage = " + errorMessage);
        this.mListener.onBannerAdLoadFailed(new IronSourceError(errorCode, errorMessage));
    }

    @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
    public void onAdExpanded() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdExpired() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdLoaded() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdLoaded(this.mAdView, this.mLayoutParams);
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdNotFilled() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner ad not filled"));
    }

    @Override // com.mobilefuse.sdk.BaseAdListener
    public void onAdRendered() {
        IronLog.ADAPTER_CALLBACK.verbose();
        this.mListener.onBannerAdShown();
        this.mListener.onBannerAdScreenPresented();
    }
}
