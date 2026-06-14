package com.ironsource.adapters.unityads;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ironsource/adapters/unityads/UnityAdsBannerAdListener;", "Lcom/unity3d/services/banners/BannerView$IListener;", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mAdapter", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/adapters/unityads/UnityAdsAdapter;", "mPlacementId", "", "(Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/ref/WeakReference;Ljava/lang/String;)V", "onBannerClick", "", "bannerView", "Lcom/unity3d/services/banners/BannerView;", "onBannerFailedToLoad", "bannerErrorInfo", "Lcom/unity3d/services/banners/BannerErrorInfo;", "onBannerLeftApplication", "onBannerLoaded", "onBannerShown", "bannerAdView", "unityadsadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsBannerAdListener implements BannerView.IListener {

    @Nullable
    private final WeakReference<UnityAdsAdapter> mAdapter;

    @Nullable
    private final BannerSmashListener mListener;

    @NotNull
    private final String mPlacementId;

    public UnityAdsBannerAdListener(@Nullable BannerSmashListener bannerSmashListener, @Nullable WeakReference<UnityAdsAdapter> weakReference, @NotNull String mPlacementId) {
        Intrinsics.checkNotNullParameter(mPlacementId, "mPlacementId");
        this.mListener = bannerSmashListener;
        this.mAdapter = weakReference;
        this.mPlacementId = mPlacementId;
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerClick(@Nullable BannerView bannerView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerFailedToLoad(@Nullable BannerView bannerView, @Nullable BannerErrorInfo bannerErrorInfo) {
        UnityAdsAdapter unityAdsAdapter;
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        String str = ((weakReference == null || (unityAdsAdapter = weakReference.get()) == null) ? null : unityAdsAdapter.getProviderName()) + " banner, onAdLoadFailed placementId " + this.mPlacementId + " with error: " + (bannerErrorInfo != null ? bannerErrorInfo.errorMessage : null);
        IronSourceError ironSourceError = (bannerErrorInfo != null ? bannerErrorInfo.errorCode : null) == BannerErrorCode.NO_FILL ? new IronSourceError(606, str) : ErrorBuilder.buildLoadFailedError(str);
        IronLog.ADAPTER_CALLBACK.error("placementId = " + this.mPlacementId + " ironSourceError = " + ironSourceError);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdLoadFailed(ironSourceError);
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLeftApplication(@Nullable BannerView bannerView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerLoaded(@Nullable BannerView bannerView) {
        BannerSmashListener bannerSmashListener;
        FrameLayout.LayoutParams layoutParamsCreateLayoutParams;
        UnityAdsAdapter unityAdsAdapter;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        if (bannerView == null || (bannerSmashListener = this.mListener) == null) {
            return;
        }
        WeakReference<UnityAdsAdapter> weakReference = this.mAdapter;
        if (weakReference == null || (unityAdsAdapter = weakReference.get()) == null) {
            layoutParamsCreateLayoutParams = null;
        } else {
            UnityBannerSize size = bannerView.getSize();
            Intrinsics.checkNotNullExpressionValue(size, "bannerView.size");
            layoutParamsCreateLayoutParams = unityAdsAdapter.createLayoutParams(size);
        }
        bannerSmashListener.onBannerAdLoaded(bannerView, layoutParamsCreateLayoutParams);
    }

    @Override // com.unity3d.services.banners.BannerView.IListener
    public void onBannerShown(@Nullable BannerView bannerAdView) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
