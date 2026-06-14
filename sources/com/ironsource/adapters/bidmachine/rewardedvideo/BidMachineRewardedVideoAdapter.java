package com.ironsource.adapters.bidmachine.rewardedvideo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.AdPlacementConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.a;
import md.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import zb.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u001bH\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b+\u0010\u0014R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/ironsource/adapters/bidmachine/rewardedvideo/BidMachineRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;)V", "Lorg/json/JSONObject;", "config", "Lio/bidmachine/AdPlacementConfig;", "createRewardedPlacementConfig", "(Lorg/json/JSONObject;)Lio/bidmachine/AdPlacementConfig;", "", "appKey", "userId", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "adData", C4424m2.f43620s, "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "Lmd/a;", "rewardedVideoAd", "setRewardedVideoAd$bidmachineadapter_release", "(Lmd/a;)V", "setRewardedVideoAd", "isAvailable", "setRewardedVideoAdAvailability$bidmachineadapter_release", "(Z)V", "setRewardedVideoAdAvailability", "destroyRewardedVideoAd$bidmachineadapter_release", "destroyRewardedVideoAd", "mRewardedVideoListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "Lcom/ironsource/adapters/bidmachine/rewardedvideo/BidMachineRewardedVideoAdListener;", "mRewardedVideoAdListener", "Lcom/ironsource/adapters/bidmachine/rewardedvideo/BidMachineRewardedVideoAdListener;", "mRewardedVideoAd", "Lmd/a;", "isRewardedVideoAdAvailable", "Z", "Lmd/d;", "mRewardedRequest", "Lmd/d;", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineRewardedVideoAdapter extends AbstractRewardedVideoAdapter<BidMachineAdapter> {
    private boolean isRewardedVideoAdAvailable;

    @Nullable
    private d mRewardedRequest;

    @Nullable
    private a mRewardedVideoAd;

    @Nullable
    private BidMachineRewardedVideoAdListener mRewardedVideoAdListener;

    @Nullable
    private RewardedVideoSmashListener mRewardedVideoListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidMachineAdapter.Companion.InitState.values().length];
            try {
                iArr[BidMachineAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidMachineAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BidMachineAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidMachineRewardedVideoAdapter(@NotNull BidMachineAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final AdPlacementConfig createRewardedPlacementConfig(JSONObject config) {
        String strOptString = config.optString(BidMachineAdapter.INSTANCE.getPlacementIdKey());
        AdPlacementConfig.Builder builderRewardedBuilder$default = AdPlacementConfig.Companion.rewardedBuilder$default(AdPlacementConfig.INSTANCE, null, 1, null);
        if (strOptString != null && strOptString.length() != 0) {
            builderRewardedBuilder$default.withPlacementId(strOptString);
        }
        return builderRewardedBuilder$default.build();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback, createRewardedPlacementConfig(config));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void destroyRewardedVideoAd$bidmachineadapter_release() {
        a aVar = this.mRewardedVideoAd;
        if (aVar != null) {
        }
        a aVar2 = this.mRewardedVideoAd;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.mRewardedVideoAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        String sourceIdKey = BidMachineAdapter.INSTANCE.getSourceIdKey();
        String sourceId = config.optString(sourceIdKey);
        if (sourceId == null || sourceId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(sourceIdKey));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(sourceIdKey), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        this.mRewardedVideoListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            BidMachineAdapter adapter = getAdapter();
            Intrinsics.checkNotNullExpressionValue(sourceId, "sourceId");
            adapter.initSdk(sourceId);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        a aVar;
        Intrinsics.checkNotNullParameter(config, "config");
        return this.isRewardedVideoAdAvailable && (aVar = this.mRewardedVideoAd) != null && aVar.canShow() && !aVar.isExpired();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        setRewardedVideoAdAvailability$bidmachineadapter_release(false);
        a aVar = new a(ContextProvider.getInstance().getApplicationContext());
        BidMachineRewardedVideoAdListener bidMachineRewardedVideoAdListener = new BidMachineRewardedVideoAdListener(listener, new WeakReference(this));
        aVar.setListener(bidMachineRewardedVideoAdListener);
        this.mRewardedVideoAdListener = bidMachineRewardedVideoAdListener;
        f bidPayload = new d.b(createRewardedPlacementConfig(config)).setBidPayload(serverData);
        Intrinsics.checkNotNullExpressionValue(bidPayload, "Builder(adPlacementConfi…setBidPayload(serverData)");
        d dVar = (d) ((d.b) bidPayload).build();
        this.mRewardedRequest = dVar;
        aVar.load(dVar);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mRewardedVideoListener;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        }
    }

    public final void setRewardedVideoAd$bidmachineadapter_release(@NotNull a rewardedVideoAd) {
        Intrinsics.checkNotNullParameter(rewardedVideoAd, "rewardedVideoAd");
        this.mRewardedVideoAd = rewardedVideoAd;
    }

    public final void setRewardedVideoAdAvailability$bidmachineadapter_release(boolean isAvailable) {
        this.isRewardedVideoAdAvailable = isAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (isRewardedVideoAvailable(config)) {
            a aVar = this.mRewardedVideoAd;
            if (aVar != null) {
                aVar.show();
            }
        } else {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        setRewardedVideoAdAvailability$bidmachineadapter_release(false);
    }
}
