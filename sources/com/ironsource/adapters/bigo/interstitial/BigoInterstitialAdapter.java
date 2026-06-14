package com.ironsource.adapters.bigo.interstitial;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J,\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J,\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\u0015\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\fH\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ironsource/adapters/bigo/interstitial/BigoInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/bigo/BigoAdapter;", N6.G1, "(Lcom/ironsource/adapters/bigo/BigoAdapter;)V", "isInterstitialAdAvailable", "", "mAdListener", "Lcom/ironsource/adapters/bigo/interstitial/BigoInterstitialAdListener;", "mAdLoader", "Lsg/bigo/ads/api/InterstitialAdLoader;", "mInterstitialAd", "Lsg/bigo/ads/api/InterstitialAd;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "destroyInterstitialAd", "", "destroyInterstitialAd$bigoadapter_release", "getInterstitialBiddingData", "", "", "", "config", "Lorg/json/JSONObject;", "adData", "initInterstitialForBidding", RemoteConfigConstants.RequestFieldKey.APP_ID, "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isInterstitialReady", "loadInterstitialForBidding", C4424m2.f43620s, "onNetworkInitCallbackSuccess", "setInterstitialAd", "ad", "setInterstitialAd$bigoadapter_release", "setInterstitialAdAvailability", "isAvailable", "setInterstitialAdAvailability$bigoadapter_release", C4240b4.h.H, "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoInterstitialAdapter extends AbstractInterstitialAdapter<BigoAdapter> {
    private boolean isInterstitialAdAvailable;

    @Nullable
    private BigoInterstitialAdListener mAdListener;

    @Nullable
    private InterstitialAdLoader mAdLoader;

    @Nullable
    private InterstitialAd mInterstitialAd;

    @Nullable
    private InterstitialSmashListener mSmashListener;

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
    public BigoInterstitialAdapter(@NotNull BigoAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    public final void destroyInterstitialAd$bigoadapter_release() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdInteractionListener(null);
        }
        InterstitialAd interstitialAd2 = this.mInterstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.destroy();
        }
        this.mAdLoader = null;
        this.mInterstitialAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    @Nullable
    public Map<String, Object> getInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData$bigoadapter_release();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appId, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String appId2 = config.optString(BigoAdapter.INSTANCE.getAppIdKey());
        Intrinsics.checkNotNullExpressionValue(appId2, "appId");
        if (appId2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(appId2));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appId2), "Interstitial"));
            return;
        }
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            getAdapter().initSdk(appId2);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        InterstitialAd interstitialAd = this.mInterstitialAd;
        return (interstitialAd == null || interstitialAd == null || interstitialAd.isExpired()) ? false : true;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        setInterstitialAdAvailability$bigoadapter_release(false);
        BigoAdapter.Companion companion = BigoAdapter.INSTANCE;
        String configStringValueFromKey = getConfigStringValueFromKey(config, companion.getSlotIdKey());
        this.mAdListener = new BigoInterstitialAdListener(new WeakReference(this), listener);
        InterstitialAdLoader interstitialAdLoaderBuild = new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) this.mAdListener).withExt(companion.getMEDIATION_INFO()).build();
        Intrinsics.checkNotNullExpressionValue(interstitialAdLoaderBuild, "Builder()\n            .w…NFO)\n            .build()");
        this.mAdLoader = interstitialAdLoaderBuild;
        interstitialAdLoaderBuild.loadAd(new InterstitialAdRequest.Builder().withBid(serverData).withSlotId(configStringValueFromKey).build());
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        InterstitialSmashListener interstitialSmashListener = this.mSmashListener;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    public final void setInterstitialAd$bigoadapter_release(@NotNull InterstitialAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.mInterstitialAd = ad2;
    }

    public final void setInterstitialAdAvailability$bigoadapter_release(boolean isAvailable) {
        this.isInterstitialAdAvailable = isAvailable;
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
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setAdInteractionListener(this.mAdListener);
        }
        InterstitialAd interstitialAd2 = this.mInterstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.show();
        }
        setInterstitialAdAvailability$bigoadapter_release(false);
    }
}
