package com.ironsource.adapters.mintegral;

import com.ironsource.C4488pd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0013\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0017\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0019\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralRewardedVideoListener;", "Lcom/mbridge/msdk/out/RewardVideoWithCodeListener;", "placementId", "", "smashListener", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "adapterListener", "Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "(Ljava/lang/String;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", "onAdClose", "", "bridgeIds", "Lcom/mbridge/msdk/out/MBridgeIds;", "rewardInfo", "Lcom/mbridge/msdk/out/RewardInfo;", "onAdShow", "onEndcardShow", C4488pd.f44653f, "onShowFailWithCode", "errorCode", "", "errorMsg", "onVideoAdClicked", "onVideoComplete", "onVideoLoadFailWithCode", "onVideoLoadSuccess", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MintegralRewardedVideoListener extends RewardVideoWithCodeListener {

    @NotNull
    private final WeakReference<MintegralAdapter> adapterListener;

    @NotNull
    private final String placementId;

    @NotNull
    private final WeakReference<RewardedVideoSmashListener> smashListener;

    public MintegralRewardedVideoListener(@NotNull String placementId, @NotNull WeakReference<RewardedVideoSmashListener> smashListener, @NotNull WeakReference<MintegralAdapter> adapterListener) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(smashListener, "smashListener");
        Intrinsics.checkNotNullParameter(adapterListener, "adapterListener");
        this.placementId = placementId;
        this.smashListener = smashListener;
        this.adapterListener = adapterListener;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(@Nullable MBridgeIds bridgeIds, @Nullable RewardInfo rewardInfo) {
        RewardedVideoSmashListener rewardedVideoSmashListener;
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + " rewarded:" + (rewardInfo != null ? Boolean.valueOf(rewardInfo.isCompleteView()) : null));
        if (rewardInfo != null && rewardInfo.isCompleteView() && (rewardedVideoSmashListener = this.smashListener.get()) != null) {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
        RewardedVideoSmashListener rewardedVideoSmashListener2 = this.smashListener.get();
        if (rewardedVideoSmashListener2 != null) {
            rewardedVideoSmashListener2.onRewardedVideoAdClosed();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(@Nullable MBridgeIds bridgeIds, int errorCode, @Nullable String errorMsg) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + " errorCode=" + errorCode + " errorMsg=" + errorMsg);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
        RewardedVideoSmashListener rewardedVideoSmashListener2 = this.smashListener.get();
        if (rewardedVideoSmashListener2 != null) {
            rewardedVideoSmashListener2.onRewardedVideoAdShowFailed(new IronSourceError(errorCode, errorMsg));
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(@Nullable MBridgeIds bridgeIds) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(@Nullable MBridgeIds bridgeIds, int errorCode, @Nullable String errorMsg) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId=" + this.placementId + "  errorCode=" + errorCode + " errorMsg=" + errorMsg);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
        RewardedVideoSmashListener rewardedVideoSmashListener2 = this.smashListener.get();
        if (rewardedVideoSmashListener2 != null) {
            if (errorCode == 708) {
                errorCode = 1058;
            }
            rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(errorCode, errorMsg));
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(@Nullable MBridgeIds bridgeIds) {
        MintegralAdapter mintegralAdapter = this.adapterListener.get();
        MBBidRewardVideoHandler rewardedVideoHandler = mintegralAdapter != null ? mintegralAdapter.getMRewardedVideoAd() : null;
        String creativeIdWithUnitId = rewardedVideoHandler != null ? rewardedVideoHandler.getCreativeIdWithUnitId() : null;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.placementId + ", creativeId = " + creativeIdWithUnitId);
        if (creativeIdWithUnitId == null || creativeIdWithUnitId.length() == 0) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.smashListener.get();
            if (rewardedVideoSmashListener != null) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
                return;
            }
            return;
        }
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("creativeId", creativeIdWithUnitId));
        RewardedVideoSmashListener rewardedVideoSmashListener2 = this.smashListener.get();
        if (rewardedVideoSmashListener2 != null) {
            rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(true, mapMapOf);
        }
    }
}
