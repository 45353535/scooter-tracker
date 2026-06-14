package com.ironsource.adapters.bigo.rewardedvideo;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J,\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\fH\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ironsource/adapters/bigo/rewardedvideo/BigoRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/bigo/BigoAdapter;", N6.G1, "(Lcom/ironsource/adapters/bigo/BigoAdapter;)V", "isRewardedVideoAdAvailable", "", "mAdListener", "Lcom/ironsource/adapters/bigo/rewardedvideo/BigoRewardedVideoAdListener;", "mAdLoader", "Lsg/bigo/ads/api/RewardVideoAdLoader;", "mRewardedAd", "Lsg/bigo/ads/api/RewardVideoAd;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "destroyRewardedVideoAd", "", "destroyRewardedVideoAd$bigoadapter_release", "getRewardedVideoBiddingData", "", "", "", "config", "Lorg/json/JSONObject;", "adData", "initRewardedVideoWithCallback", "appKey", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isRewardedVideoAvailable", "loadRewardedVideoForBidding", C4424m2.f43620s, "onNetworkInitCallbackSuccess", "setRewardedVideoAd", "ad", "setRewardedVideoAd$bigoadapter_release", "setRewardedVideoAdAvailability", "isAvailable", "setRewardedVideoAdAvailability$bigoadapter_release", C4240b4.h.f42594i, "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoRewardedVideoAdapter extends AbstractRewardedVideoAdapter<BigoAdapter> {
    private boolean isRewardedVideoAdAvailable;

    @Nullable
    private BigoRewardedVideoAdListener mAdListener;

    @Nullable
    private RewardVideoAdLoader mAdLoader;

    @Nullable
    private RewardVideoAd mRewardedAd;

    @Nullable
    private RewardedVideoSmashListener mSmashListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BigoAdapter.Companion.InitState.values().length];
            try {
                iArr[BigoAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BigoAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BigoAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigoRewardedVideoAdapter(@NotNull BigoAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    public final void destroyRewardedVideoAd$bigoadapter_release() {
        RewardVideoAd rewardVideoAd = this.mRewardedAd;
        if (rewardVideoAd != null) {
            rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) null);
        }
        RewardVideoAd rewardVideoAd2 = this.mRewardedAd;
        if (rewardVideoAd2 != null) {
            rewardVideoAd2.destroy();
        }
        this.mAdLoader = null;
        this.mRewardedAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    @Nullable
    public Map<String, Object> getRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData$bigoadapter_release();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String configStringValueFromKey = getConfigStringValueFromKey(config, BigoAdapter.INSTANCE.getAppIdKey());
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("appId = " + configStringValueFromKey);
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            getAdapter().initSdk(configStringValueFromKey);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        RewardVideoAd rewardVideoAd = this.mRewardedAd;
        return (rewardVideoAd == null || rewardVideoAd.isExpired()) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        setRewardedVideoAdAvailability$bigoadapter_release(false);
        BigoAdapter.Companion companion = BigoAdapter.INSTANCE;
        String configStringValueFromKey = getConfigStringValueFromKey(config, companion.getSlotIdKey());
        this.mAdListener = new BigoRewardedVideoAdListener(new WeakReference(this), listener);
        RewardVideoAdLoader rewardVideoAdLoaderBuild = new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) this.mAdListener).withExt(companion.getMEDIATION_INFO()).build();
        Intrinsics.checkNotNullExpressionValue(rewardVideoAdLoaderBuild, "Builder()\n            .w…NFO)\n            .build()");
        this.mAdLoader = rewardVideoAdLoaderBuild;
        rewardVideoAdLoaderBuild.loadAd(new RewardVideoAdRequest.Builder().withBid(serverData).withSlotId(configStringValueFromKey).build());
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mSmashListener;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        }
    }

    public final void setRewardedVideoAd$bigoadapter_release(@NotNull RewardVideoAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.mRewardedAd = ad2;
    }

    public final void setRewardedVideoAdAvailability$bigoadapter_release(boolean isAvailable) {
        this.isRewardedVideoAdAvailable = isAvailable;
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
        RewardVideoAd rewardVideoAd = this.mRewardedAd;
        if (rewardVideoAd != null) {
            rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) this.mAdListener);
        }
        RewardVideoAd rewardVideoAd2 = this.mRewardedAd;
        if (rewardVideoAd2 != null) {
            rewardVideoAd2.show();
        }
        setRewardedVideoAdAvailability$bigoadapter_release(false);
    }
}
