package com.ironsource.adapters.yandex.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.interstitial.YandexInterstitialAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoader;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0017J,\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\nH\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ironsource/adapters/yandex/interstitial/YandexInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/yandex/YandexAdapter;", N6.G1, "(Lcom/ironsource/adapters/yandex/YandexAdapter;)V", "mAd", "Lcom/yandex/mobile/ads/interstitial/InterstitialAd;", "mAdLoader", "Lcom/yandex/mobile/ads/interstitial/InterstitialAdLoader;", "mIsAdAvailable", "", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "mYandexAdListener", "Lcom/ironsource/adapters/yandex/interstitial/YandexInterstitialAdListener;", "collectInterstitialBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyInterstitialAd", "destroyInterstitialAd$yandexadapter_release", "initInterstitialForBidding", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isInterstitialReady", "loadInterstitialForBidding", C4424m2.f43620s, "onNetworkInitCallbackSuccess", "setInterstitialAd", "interstitialAd", "setInterstitialAd$yandexadapter_release", "setInterstitialAdAvailability", "isAvailable", "setInterstitialAdAvailability$yandexadapter_release", C4240b4.h.H, "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexInterstitialAdapter extends AbstractInterstitialAdapter<YandexAdapter> {

    @Nullable
    private InterstitialAd mAd;

    @Nullable
    private InterstitialAdLoader mAdLoader;
    private boolean mIsAdAvailable;

    @Nullable
    private InterstitialSmashListener mSmashListener;

    @Nullable
    private YandexInterstitialAdListener mYandexAdListener;

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
    public YandexInterstitialAdapter(@NotNull YandexAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadInterstitialForBidding$lambda$1(InterstitialAdLoader interstitialAdLoader, AdRequestConfiguration adRequest) {
        Intrinsics.checkNotNullParameter(interstitialAdLoader, "$interstitialAdLoader");
        Intrinsics.checkNotNullParameter(adRequest, "$adRequest");
        interstitialAdLoader.loadAd(adRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterstitial$lambda$3(YandexInterstitialAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterstitialAd interstitialAd = this$0.mAd;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(this$0.mYandexAdListener);
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
            interstitialAd.show(currentActiveActivity);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback, new BidderTokenRequestConfiguration.Builder(AdType.INTERSTITIAL).setParameters(getAdapter().getConfigParams()).build());
    }

    public final void destroyInterstitialAd$yandexadapter_release() {
        InterstitialAdLoader interstitialAdLoader = this.mAdLoader;
        if (interstitialAdLoader != null) {
            interstitialAdLoader.setAdLoadListener(null);
        }
        this.mAdLoader = null;
        InterstitialAd interstitialAd = this.mAd;
        if (interstitialAd != null) {
            interstitialAd.setAdEventListener(null);
        }
        this.mAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        YandexAdapter.Companion companion = YandexAdapter.INSTANCE;
        String appIdKey = companion.getAppIdKey();
        String configStringValueFromKey = getConfigStringValueFromKey(config, appIdKey);
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(appIdKey));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appIdKey), "Interstitial"));
            return;
        }
        String adUnitIdKey = companion.getAdUnitIdKey();
        String configStringValueFromKey2 = getConfigStringValueFromKey(config, adUnitIdKey);
        if (configStringValueFromKey2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(adUnitIdKey));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(adUnitIdKey), "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("appId = " + configStringValueFromKey + ", adUnitId = " + configStringValueFromKey2);
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            getAdapter().initSdk(configStringValueFromKey);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return this.mAd != null && this.mIsAdAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose();
        setInterstitialAdAvailability$yandexadapter_release(false);
        this.mYandexAdListener = new YandexInterstitialAdListener(listener, new WeakReference(this));
        String configStringValueFromKey = getConfigStringValueFromKey(config, YandexAdapter.INSTANCE.getAdUnitIdKey());
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        final InterstitialAdLoader interstitialAdLoader = new InterstitialAdLoader(applicationContext);
        interstitialAdLoader.setAdLoadListener(this.mYandexAdListener);
        this.mAdLoader = interstitialAdLoader;
        final AdRequestConfiguration adRequestConfigurationBuild = new AdRequestConfiguration.Builder(configStringValueFromKey).setBiddingData(serverData).setParameters(getAdapter().getConfigParams()).build();
        postOnUIThread(new Runnable() { // from class: m4.a
            @Override // java.lang.Runnable
            public final void run() {
                YandexInterstitialAdapter.loadInterstitialForBidding$lambda$1(interstitialAdLoader, adRequestConfigurationBuild);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        InterstitialSmashListener interstitialSmashListener = this.mSmashListener;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    public final void setInterstitialAd$yandexadapter_release(@NotNull InterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        this.mAd = interstitialAd;
    }

    public final void setInterstitialAdAvailability$yandexadapter_release(boolean isAvailable) {
        this.mIsAdAvailable = isAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (isInterstitialReady(config)) {
            postOnUIThread(new Runnable() { // from class: m4.b
                @Override // java.lang.Runnable
                public final void run() {
                    YandexInterstitialAdapter.showInterstitial$lambda$3(this.f94463b);
                }
            });
        } else {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
    }
}
