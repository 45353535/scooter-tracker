package com.ironsource.adapters.vungle.interstitial;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.interstitial.VungleInterstitialAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.ads.AdConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.InterstitialAd;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020!H\u0000¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100¨\u00063"}, d2 = {"Lcom/ironsource/adapters/vungle/interstitial/VungleInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/vungle/VungleAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/vungle/VungleAdapter;)V", "Lorg/json/JSONObject;", "config", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initInterstitialInternal", "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "", C4424m2.f43620s, "loadInterstitialInternal", "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;Ljava/lang/String;)V", "appKey", "userId", C4240b4.h.B, "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "initInterstitialForBidding", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", C4240b4.h.E, "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "", "isInterstitialReady", "(Lorg/json/JSONObject;)Z", "placementId", "isAvailable", "setInterstitialAdAvailability$vungleadapter_release", "(Ljava/lang/String;Z)V", "setInterstitialAdAvailability", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectInterstitialBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "j$/util/concurrent/ConcurrentHashMap", "Lcom/vungle/ads/InterstitialAd;", "mPlacementToInterstitialAd", "Lj$/util/concurrent/ConcurrentHashMap;", "mInterstitialPlacementToListenerMap", "mPlacementIdToAdAvailability", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleInterstitialAdapter extends AbstractInterstitialAdapter<VungleAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementToListenerMap;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> mPlacementIdToAdAvailability;

    @NotNull
    private final ConcurrentHashMap<String, InterstitialAd> mPlacementToInterstitialAd;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VungleAdapter.Companion.InitState.values().length];
            try {
                iArr[VungleAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VungleAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInterstitialAdapter(@NotNull VungleAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.mPlacementToInterstitialAd = new ConcurrentHashMap<>();
        this.mInterstitialPlacementToListenerMap = new ConcurrentHashMap<>();
        this.mPlacementIdToAdAvailability = new ConcurrentHashMap<>();
    }

    private final void initInterstitialInternal(JSONObject config, InterstitialSmashListener listener) {
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        String appId = config.optString(VungleAdapter.APP_ID);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        if (placementId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(VungleAdapter.PLACEMENT_ID));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(placementId), "Interstitial"));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        if (appId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(VungleAdapter.APP_ID));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appId), "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + placementId + ", appId = " + appId);
        this.mInterstitialPlacementToListenerMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK Init Failed", "Interstitial"));
            return;
        }
        VungleAdapter adapter = getAdapter();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        adapter.initSDK(applicationContext, appId);
    }

    private final void loadInterstitialInternal(JSONObject config, InterstitialSmashListener listener, String serverData) {
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("loadInterstitial Vungle ad with placementId = " + placementId);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        setInterstitialAdAvailability$vungleadapter_release(placementId, false);
        VungleInterstitialAdListener vungleInterstitialAdListener = new VungleInterstitialAdListener(new WeakReference(this), listener, placementId);
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        InterstitialAd interstitialAd = new InterstitialAd(applicationContext, placementId, new AdConfig());
        interstitialAd.setAdListener(vungleInterstitialAdListener);
        this.mPlacementToInterstitialAd.put(placementId, interstitialAd);
        interstitialAd.load(serverData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterstitial$lambda$3(InterstitialAd interstitialAd) {
        if (interstitialAd != null) {
            FullscreenAd.DefaultImpls.play$default(interstitialAd, null, 1, null);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        initInterstitialInternal(config, listener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        initInterstitialInternal(config, listener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        InterstitialAd interstitialAd;
        Intrinsics.checkNotNullParameter(config, "config");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = <" + placementId + ">");
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        if (placementId.length() == 0) {
            return false;
        }
        Boolean bool = this.mPlacementIdToAdAvailability.get(placementId);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue() && (interstitialAd = this.mPlacementToInterstitialAd.get(placementId)) != null) {
            return interstitialAd.canPlayAd().booleanValue();
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("loadInterstitial Vungle ad with placementId = " + strOptString);
        loadInterstitialInternal(config, listener, null);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("loadInterstitial Vungle ad with placementId = " + strOptString);
        loadInterstitialInternal(config, listener, serverData);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        Collection<InterstitialSmashListener> collectionValues = this.mInterstitialPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mInterstitialPlacementToListenerMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((InterstitialSmashListener) it.next()).onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(error, "Interstitial"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Collection<InterstitialSmashListener> collectionValues = this.mInterstitialPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mInterstitialPlacementToListenerMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((InterstitialSmashListener) it.next()).onInterstitialInitSuccess();
        }
    }

    public final void setInterstitialAdAvailability$vungleadapter_release(@NotNull String placementId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.mPlacementIdToAdAvailability.put(placementId, Boolean.valueOf(isAvailable));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + placementId);
        if (!isInterstitialReady(config)) {
            IronLog.INTERNAL.error("There is no ad available for placementId = " + placementId);
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
            return;
        }
        final InterstitialAd interstitialAd = this.mPlacementToInterstitialAd.get(placementId);
        ironLog.verbose("showInterstitial vungle ad <" + placementId);
        postOnUIThread(new Runnable() { // from class: j4.a
            @Override // java.lang.Runnable
            public final void run() {
                VungleInterstitialAdapter.showInterstitial$lambda$3(interstitialAd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        setInterstitialAdAvailability$vungleadapter_release(placementId, false);
    }
}
