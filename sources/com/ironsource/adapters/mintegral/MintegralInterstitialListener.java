package com.ironsource.adapters.mintegral;

import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralInterstitialListener;", "Lcom/mbridge/msdk/newinterstitial/out/NewInterstitialWithCodeListener;", "placementId", "", "smashListener", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "adapterListener", "Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", Df.f40645f, "", "bridgeIds", "Lcom/mbridge/msdk/out/MBridgeIds;", "onAdClose", "rewardInfo", "Lcom/mbridge/msdk/out/RewardInfo;", "onAdCloseWithNIReward", "onAdShow", "onEndcardShow", "onLoadCampaignSuccess", "onResourceLoadFailWithCode", "errorCode", "", "errorMsg", "onResourceLoadSuccess", "onShowFailWithCode", "onVideoComplete", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MintegralInterstitialListener extends NewInterstitialWithCodeListener {

    @NotNull
    private final WeakReference<MintegralAdapter> adapterListener;

    @NotNull
    private final String placementId;

    @NotNull
    private final WeakReference<InterstitialSmashListener> smashListener;

    public MintegralInterstitialListener(@NotNull String placementId, @NotNull WeakReference<InterstitialSmashListener> smashListener, @NotNull WeakReference<MintegralAdapter> adapterListener) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        Intrinsics.checkNotNullParameter(adapterListener, "adapterListener");
        this.placementId = placementId;
        this.smashListener = smashListener;
        this.adapterListener = adapterListener;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClicked(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdClose(@Nullable MBridgeIds bridgeIds, @Nullable RewardInfo rewardInfo) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdCloseWithNIReward(@Nullable MBridgeIds bridgeIds, @Nullable RewardInfo rewardInfo) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onAdShow(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdOpened();
        }
        InterstitialSmashListener interstitialSmashListener2 = this.smashListener.get();
        if (interstitialSmashListener2 != null) {
            interstitialSmashListener2.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onEndcardShow(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onLoadCampaignSuccess(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onResourceLoadFailWithCode(@Nullable MBridgeIds bridgeIds, int errorCode, @Nullable String errorMsg) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + "  errorCode=" + errorCode + " errorMsg=" + errorMsg);
        InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
        if (interstitialSmashListener != null) {
            if (errorCode == 708) {
                errorCode = 1158;
            }
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(errorCode, errorMsg));
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onResourceLoadSuccess(@Nullable MBridgeIds bridgeIds) {
        MintegralAdapter mintegralAdapter = this.adapterListener.get();
        MBBidNewInterstitialHandler interstitialHandler = mintegralAdapter != null ? mintegralAdapter.getInterstitialHandler() : null;
        String creativeIdWithUnitId = interstitialHandler != null ? interstitialHandler.getCreativeIdWithUnitId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId + ", creativeId = " + creativeIdWithUnitId);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
            if (interstitialSmashListener != null) {
                interstitialSmashListener.onInterstitialAdReady();
                return;
            }
            return;
        }
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("creativeId", creativeIdWithUnitId));
        InterstitialSmashListener interstitialSmashListener2 = this.smashListener.get();
        if (interstitialSmashListener2 != null) {
            interstitialSmashListener2.onInterstitialAdReady(mapMapOf);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public void onShowFailWithCode(@Nullable MBridgeIds bridgeIds, int errorCode, @Nullable String errorMsg) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + " errorCode=" + errorCode + " errorMsg=" + errorMsg);
        InterstitialSmashListener interstitialSmashListener = this.smashListener.get();
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(errorCode, errorMsg));
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public void onVideoComplete(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }
}
