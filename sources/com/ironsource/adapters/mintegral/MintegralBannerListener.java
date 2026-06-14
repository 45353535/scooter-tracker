package com.ironsource.adapters.mintegral;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.mbridge.msdk.out.BannerAdWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralBannerListener;", "Lcom/mbridge/msdk/out/BannerAdWithCodeListener;", "placementId", "", "smashListener", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "adapterListener", "Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", "closeFullScreen", "", "bridgeIds", "Lcom/mbridge/msdk/out/MBridgeIds;", "onClick", "onCloseBanner", "onLeaveApp", "onLoadFailedWithCode", "errorCode", "", "errorMsg", "onLoadSuccessed", "onLogImpression", "showFullScreen", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MintegralBannerListener extends BannerAdWithCodeListener {

    @NotNull
    private final WeakReference<MintegralAdapter> adapterListener;

    @NotNull
    private final String placementId;

    @NotNull
    private final WeakReference<BannerSmashListener> smashListener;

    public MintegralBannerListener(@NotNull String placementId, @NotNull WeakReference<BannerSmashListener> smashListener, @NotNull WeakReference<MintegralAdapter> adapterListener) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        Intrinsics.checkNotNullParameter(adapterListener, "adapterListener");
        this.placementId = placementId;
        this.smashListener = smashListener;
        this.adapterListener = adapterListener;
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void closeFullScreen(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdScreenDismissed();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onClick(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onCloseBanner(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLeaveApp(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdWithCodeListener
    public void onLoadFailedWithCode(@Nullable MBridgeIds bridgeIds, int errorCode, @Nullable String errorMsg) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + "  errorCode=" + errorCode + " errorMsg=" + errorMsg);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            if (errorCode == 708) {
                errorCode = 606;
            }
            bannerSmashListener.onBannerAdLoadFailed(new IronSourceError(errorCode, errorMsg));
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLoadSuccessed(@Nullable MBridgeIds bridgeIds) {
        MintegralAdapter mintegralAdapter = this.adapterListener.get();
        MBBannerView bannerView = mintegralAdapter != null ? mintegralAdapter.getBannerView(this.placementId) : null;
        MintegralAdapter mintegralAdapter2 = this.adapterListener.get();
        FrameLayout.LayoutParams bannerLayoutParams = mintegralAdapter2 != null ? mintegralAdapter2.getBannerLayoutParams(this.placementId) : null;
        String creativeIdWithUnitId = bannerView != null ? bannerView.getCreativeIdWithUnitId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId + ", creativeId = " + creativeIdWithUnitId);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            BannerSmashListener bannerSmashListener = this.smashListener.get();
            if (bannerSmashListener != null) {
                bannerSmashListener.onBannerAdLoaded(bannerView, bannerLayoutParams);
                return;
            }
            return;
        }
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("creativeId", creativeIdWithUnitId));
        BannerSmashListener bannerSmashListener2 = this.smashListener.get();
        if (bannerSmashListener2 != null) {
            bannerSmashListener2.onBannerAdLoaded(bannerView, bannerLayoutParams, mapMapOf);
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void onLogImpression(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }

    @Override // com.mbridge.msdk.out.BannerAdListener
    public void showFullScreen(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        BannerSmashListener bannerSmashListener = this.smashListener.get();
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdScreenPresented();
        }
    }
}
