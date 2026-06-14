package com.ironsource.adapters.mobilefuse.interstitial;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.mobilefuse.MobileFuseAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.mobilefuse.sdk.MobileFuseInterstitialAd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J,\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0012\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001e\u001a\u00020\fH\u0016J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ironsource/adapters/mobilefuse/interstitial/MobileFuseInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;", N6.G1, "(Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;)V", "mAd", "Lcom/mobilefuse/sdk/MobileFuseInterstitialAd;", "mAdListener", "Lcom/ironsource/adapters/mobilefuse/interstitial/MobileFuseInterstitialAdListener;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "collectInterstitialBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyInterstitialAd", "initInterstitialForBidding", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isInterstitialReady", "", "loadInterstitialForBidding", C4424m2.f43620s, "onNetworkInitCallbackFailed", "error", "onNetworkInitCallbackSuccess", C4240b4.h.H, "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseInterstitialAdapter extends AbstractInterstitialAdapter<MobileFuseAdapter> {

    @Nullable
    private MobileFuseInterstitialAd mAd;

    @Nullable
    private MobileFuseInterstitialAdListener mAdListener;

    @Nullable
    private InterstitialSmashListener mSmashListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileFuseAdapter.Companion.InitState.values().length];
            try {
                iArr[MobileFuseAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileFuseAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileFuseAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileFuseAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFuseInterstitialAdapter(@NotNull MobileFuseAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final void destroyInterstitialAd() {
        this.mAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(MobileFuseAdapter.LOG_INIT_FAILED, "Interstitial"));
        } else if (i10 == 3 || i10 == 4) {
            getAdapter().initSdk(config);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        MobileFuseInterstitialAd mobileFuseInterstitialAd = this.mAd;
        return mobileFuseInterstitialAd != null && mobileFuseInterstitialAd.isLoaded();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        MobileFuseInterstitialAdListener mobileFuseInterstitialAdListener = new MobileFuseInterstitialAdListener(listener);
        this.mAdListener = mobileFuseInterstitialAdListener;
        MobileFuseInterstitialAd mobileFuseInterstitialAd = new MobileFuseInterstitialAd(ContextProvider.getInstance().getApplicationContext(), getConfigStringValueFromKey(config, MobileFuseAdapter.INSTANCE.getPlacementIdKey()));
        this.mAd = mobileFuseInterstitialAd;
        mobileFuseInterstitialAd.setListener(mobileFuseInterstitialAdListener);
        MobileFuseInterstitialAd mobileFuseInterstitialAd2 = this.mAd;
        if (mobileFuseInterstitialAd2 != null) {
            mobileFuseInterstitialAd2.loadAdFromBiddingToken(serverData);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Ad is null"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        InterstitialSmashListener interstitialSmashListener = this.mSmashListener;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(error, "Interstitial"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        InterstitialSmashListener interstitialSmashListener = this.mSmashListener;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (!isInterstitialReady(config)) {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
            return;
        }
        MobileFuseInterstitialAd mobileFuseInterstitialAd = this.mAd;
        if (mobileFuseInterstitialAd != null) {
            mobileFuseInterstitialAd.showAd();
        }
    }
}
