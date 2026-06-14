package com.ironsource.adapters.yandex.rewardedvideo;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.rewardedvideo.YandexRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0017J,\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ironsource/adapters/yandex/rewardedvideo/YandexRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/yandex/YandexAdapter;", N6.G1, "(Lcom/ironsource/adapters/yandex/YandexAdapter;)V", "mAd", "Lcom/yandex/mobile/ads/rewarded/RewardedAd;", "mAdLoader", "Lcom/yandex/mobile/ads/rewarded/RewardedAdLoader;", "mIsAdAvailable", "", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "mYandexAdListener", "Lcom/ironsource/adapters/yandex/rewardedvideo/YandexRewardedVideoAdListener;", "collectRewardedVideoBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyRewardedVideoAd", "destroyRewardedVideoAd$yandexadapter_release", "initRewardedVideoWithCallback", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isRewardedVideoAvailable", "loadRewardedVideoForBidding", C4424m2.f43620s, "onNetworkInitCallbackSuccess", "setRewardedVideoAd", "rewardedAd", "setRewardedVideoAd$yandexadapter_release", "setRewardedVideoAdAvailability", "isAvailable", "setRewardedVideoAdAvailability$yandexadapter_release", C4240b4.h.f42594i, "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexRewardedVideoAdapter extends AbstractRewardedVideoAdapter<YandexAdapter> {

    @Nullable
    private RewardedAd mAd;

    @Nullable
    private RewardedAdLoader mAdLoader;
    private boolean mIsAdAvailable;

    @Nullable
    private RewardedVideoSmashListener mSmashListener;

    @Nullable
    private YandexRewardedVideoAdListener mYandexAdListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YandexAdapter.InitState.values().length];
            try {
                iArr[YandexAdapter.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YandexAdapter.InitState.INIT_STATE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[YandexAdapter.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexRewardedVideoAdapter(@NotNull YandexAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadRewardedVideoForBidding$lambda$1(RewardedAdLoader rewardedVideoAdLoader, AdRequestConfiguration adRequest) {
        Intrinsics.checkNotNullParameter(rewardedVideoAdLoader, "$rewardedVideoAdLoader");
        Intrinsics.checkNotNullParameter(adRequest, "$adRequest");
        rewardedVideoAdLoader.loadAd(adRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewardedVideo$lambda$3(YandexRewardedVideoAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RewardedAd rewardedAd = this$0.mAd;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(this$0.mYandexAdListener);
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
            rewardedAd.show(currentActiveActivity);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback, new BidderTokenRequestConfiguration.Builder(AdType.REWARDED).setParameters(getAdapter().getConfigParams()).build());
    }

    public final void destroyRewardedVideoAd$yandexadapter_release() {
        RewardedAdLoader rewardedAdLoader = this.mAdLoader;
        if (rewardedAdLoader != null) {
            rewardedAdLoader.setAdLoadListener(null);
        }
        this.mAdLoader = null;
        RewardedAd rewardedAd = this.mAd;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
        }
        this.mAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        YandexAdapter.Companion companion = YandexAdapter.INSTANCE;
        String appIdKey = companion.getAppIdKey();
        String appId = config.optString(appIdKey);
        if (appId == null || appId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(appIdKey));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appIdKey), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        String adUnitIdKey = companion.getAdUnitIdKey();
        String strOptString = config.optString(adUnitIdKey);
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(adUnitIdKey));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(adUnitIdKey), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("appId = " + appId + ", adUnitId = " + strOptString);
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            YandexAdapter adapter = getAdapter();
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            adapter.initSdk(appId);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return this.mAd != null && this.mIsAdAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose();
        setRewardedVideoAdAvailability$yandexadapter_release(false);
        this.mYandexAdListener = new YandexRewardedVideoAdListener(listener, new WeakReference(this));
        String adUnitId = config.optString(YandexAdapter.INSTANCE.getAdUnitIdKey());
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        final RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(applicationContext);
        rewardedAdLoader.setAdLoadListener(this.mYandexAdListener);
        this.mAdLoader = rewardedAdLoader;
        Intrinsics.checkNotNullExpressionValue(adUnitId, "adUnitId");
        final AdRequestConfiguration adRequestConfigurationBuild = new AdRequestConfiguration.Builder(adUnitId).setBiddingData(serverData).setParameters(getAdapter().getConfigParams()).build();
        postOnUIThread(new Runnable() { // from class: n4.b
            @Override // java.lang.Runnable
            public final void run() {
                YandexRewardedVideoAdapter.loadRewardedVideoForBidding$lambda$1(rewardedAdLoader, adRequestConfigurationBuild);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mSmashListener;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        }
    }

    public final void setRewardedVideoAd$yandexadapter_release(@NotNull RewardedAd rewardedAd) {
        Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
        this.mAd = rewardedAd;
    }

    public final void setRewardedVideoAdAvailability$yandexadapter_release(boolean isAvailable) {
        this.mIsAdAvailable = isAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (isRewardedVideoAvailable(config)) {
            postOnUIThread(new Runnable() { // from class: n4.a
                @Override // java.lang.Runnable
                public final void run() {
                    YandexRewardedVideoAdapter.showRewardedVideo$lambda$3(this.f95107b);
                }
            });
        } else {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
    }
}
