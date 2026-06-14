package com.ironsource.adapters.moloco.rewardedvideo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.moloco.MolocoAdapter;
import com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdapter;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J,\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020!H\u0016J\r\u0010\"\u001a\u00020\u000fH\u0000¢\u0006\u0002\b#R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/moloco/rewardedvideo/MolocoRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/moloco/MolocoAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/moloco/MolocoAdapter;)V", "mListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "mAdLoadListener", "Lcom/ironsource/adapters/moloco/rewardedvideo/MolocoRewardedVideoAdLoadListener;", "mAdShowListener", "Lcom/ironsource/adapters/moloco/rewardedvideo/MolocoRewardedVideoAdShowListener;", "mAd", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "initRewardedVideoWithCallback", "", "appKey", "", "userId", "config", "Lorg/json/JSONObject;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onNetworkInitCallbackSuccess", "onNetworkInitCallbackFailed", "error", "loadRewardedVideoForBidding", "adData", C4424m2.f43620s, C4240b4.h.f42594i, "isRewardedVideoAvailable", "", "collectRewardedVideoBiddingData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyRewardedVideoAd", "destroyRewardedVideoAd$molocoadapter_release", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoRewardedVideoAdapter extends AbstractRewardedVideoAdapter<MolocoAdapter> {

    @Nullable
    private RewardedInterstitialAd mAd;

    @Nullable
    private MolocoRewardedVideoAdLoadListener mAdLoadListener;

    @Nullable
    private MolocoRewardedVideoAdShowListener mAdShowListener;

    @Nullable
    private RewardedVideoSmashListener mListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MolocoAdapter.Companion.InitState.values().length];
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MolocoRewardedVideoAdapter(@NotNull MolocoAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit loadRewardedVideoForBidding$lambda$2(com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdapter r0, java.lang.String r1, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener r2, com.moloco.sdk.publisher.RewardedInterstitialAd r3, com.moloco.sdk.publisher.MolocoAdError.AdCreateError r4) {
        /*
            if (r4 == 0) goto L17
            com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener r0 = r0.mListener
            if (r0 == 0) goto L2d
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError
            int r2 = r4.getErrorCode()
            java.lang.String r3 = r4.getDescription()
            r1.<init>(r2, r3)
            r0.onRewardedVideoLoadFailed(r1)
            goto L2d
        L17:
            if (r3 == 0) goto L24
            r0.mAd = r3
            com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdLoadListener r0 = r0.mAdLoadListener
            r3.load(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.f93236a
            if (r0 != 0) goto L2d
        L24:
            java.lang.String r0 = "invalid configuration"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r0)
            r2.onRewardedVideoLoadFailed(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdapter.loadRewardedVideoForBidding$lambda$2(com.ironsource.adapters.moloco.rewardedvideo.MolocoRewardedVideoAdapter, java.lang.String, com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener, com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError$AdCreateError):kotlin.Unit");
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
    }

    public final void destroyRewardedVideoAd$molocoadapter_release() {
        RewardedInterstitialAd rewardedInterstitialAd = this.mAd;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.destroy();
        }
        this.mAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MolocoAdapter.Companion companion = MolocoAdapter.INSTANCE;
        String configStringValueFromKey = getConfigStringValueFromKey(config, companion.getAdUnitIdKey());
        String configStringValueFromKey2 = getConfigStringValueFromKey(config, companion.getAppKey());
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (configStringValueFromKey2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey2));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey2), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("adUnitId = " + configStringValueFromKey + ", appKey = " + configStringValueFromKey2);
        this.mListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Moloco sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new m();
            }
            getAdapter().initSdk(configStringValueFromKey2);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        RewardedInterstitialAd rewardedInterstitialAd = this.mAd;
        return (rewardedInterstitialAd == null || rewardedInterstitialAd == null || !rewardedInterstitialAd.isLoaded()) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable final String serverData, @NotNull final RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
        } else {
            this.mAdLoadListener = new MolocoRewardedVideoAdLoadListener(listener, new WeakReference(this));
            MolocoAdapter.Companion companion = MolocoAdapter.INSTANCE;
            Moloco.createRewardedInterstitial$default(companion.getMediationInfo(), getConfigStringValueFromKey(config, companion.getAdUnitIdKey()), null, new Function2() { // from class: g4.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MolocoRewardedVideoAdapter.loadRewardedVideoForBidding$lambda$2(this.f72152b, serverData, listener, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                }
            }, 4, null);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(error, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (!isRewardedVideoAvailable(config)) {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        MolocoRewardedVideoAdShowListener molocoRewardedVideoAdShowListener = new MolocoRewardedVideoAdShowListener(listener, new WeakReference(this));
        this.mAdShowListener = molocoRewardedVideoAdShowListener;
        RewardedInterstitialAd rewardedInterstitialAd = this.mAd;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.show(molocoRewardedVideoAdShowListener);
        }
    }
}
