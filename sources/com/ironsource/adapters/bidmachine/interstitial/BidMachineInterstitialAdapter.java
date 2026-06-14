package com.ironsource.adapters.bidmachine.interstitial;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import io.bidmachine.AdPlacementConfig;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9.a;
import l9.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import zb.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001bH\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b+\u0010\u0014R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/ironsource/adapters/bidmachine/interstitial/BidMachineInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;)V", "Lorg/json/JSONObject;", "config", "Lio/bidmachine/AdPlacementConfig;", "createInterstitialPlacementConfig", "(Lorg/json/JSONObject;)Lio/bidmachine/AdPlacementConfig;", "", "appKey", "userId", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initInterstitialForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "adData", C4424m2.f43620s, "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "", "isInterstitialReady", "(Lorg/json/JSONObject;)Z", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectInterstitialBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "isAvailable", "setInterstitialAdAvailability$bidmachineadapter_release", "(Z)V", "setInterstitialAdAvailability", "Ll9/a;", "interstitialAd", "setInterstitialAd$bidmachineadapter_release", "(Ll9/a;)V", "setInterstitialAd", "destroyInterstitialAd$bidmachineadapter_release", "destroyInterstitialAd", "mInterstitialListener", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "Lcom/ironsource/adapters/bidmachine/interstitial/BidMachineInterstitialAdListener;", "mInterstitialAdListener", "Lcom/ironsource/adapters/bidmachine/interstitial/BidMachineInterstitialAdListener;", "mInterstitialAd", "Ll9/a;", "isInterstitialAdAvailable", "Z", "Ll9/d;", "mInterstitialRequest", "Ll9/d;", "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineInterstitialAdapter extends AbstractInterstitialAdapter<BidMachineAdapter> {
    private boolean isInterstitialAdAvailable;

    @Nullable
    private a mInterstitialAd;

    @Nullable
    private BidMachineInterstitialAdListener mInterstitialAdListener;

    @Nullable
    private InterstitialSmashListener mInterstitialListener;

    @Nullable
    private d mInterstitialRequest;

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
    public BidMachineInterstitialAdapter(@NotNull BidMachineAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final AdPlacementConfig createInterstitialPlacementConfig(JSONObject config) {
        String strOptString = config.optString(BidMachineAdapter.INSTANCE.getPlacementIdKey());
        AdPlacementConfig.Builder builderInterstitialBuilder$default = AdPlacementConfig.Companion.interstitialBuilder$default(AdPlacementConfig.INSTANCE, null, 1, null);
        if (strOptString != null && strOptString.length() != 0) {
            builderInterstitialBuilder$default.withPlacementId(strOptString);
        }
        return builderInterstitialBuilder$default.build();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback, createInterstitialPlacementConfig(config));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void destroyInterstitialAd$bidmachineadapter_release() {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
        }
        a aVar2 = this.mInterstitialAd;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.mInterstitialAd = null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        String sourceId = config.optString(BidMachineAdapter.INSTANCE.getSourceIdKey());
        if (TextUtils.isEmpty(sourceId)) {
            IronLog ironLog = IronLog.INTERNAL;
            Intrinsics.checkNotNullExpressionValue(sourceId, "sourceId");
            ironLog.error(getAdUnitIdMissingErrorString(sourceId));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(sourceId), "Interstitial"));
            return;
        }
        this.mInterstitialListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            BidMachineAdapter adapter = getAdapter();
            Intrinsics.checkNotNullExpressionValue(sourceId, "sourceId");
            adapter.initSdk(sourceId);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        a aVar;
        Intrinsics.checkNotNullParameter(config, "config");
        return this.isInterstitialAdAvailable && (aVar = this.mInterstitialAd) != null && aVar.canShow() && !aVar.isExpired();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        setInterstitialAdAvailability$bidmachineadapter_release(false);
        a aVar = new a(ContextProvider.getInstance().getApplicationContext());
        BidMachineInterstitialAdListener bidMachineInterstitialAdListener = new BidMachineInterstitialAdListener(new WeakReference(this), listener);
        aVar.setListener(bidMachineInterstitialAdListener);
        this.mInterstitialAdListener = bidMachineInterstitialAdListener;
        f bidPayload = new d.b(createInterstitialPlacementConfig(config)).setBidPayload(serverData);
        Intrinsics.checkNotNullExpressionValue(bidPayload, "Builder(adPlacementConfi…setBidPayload(serverData)");
        d dVar = (d) ((d.b) bidPayload).build();
        this.mInterstitialRequest = dVar;
        aVar.load(dVar);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        InterstitialSmashListener interstitialSmashListener = this.mInterstitialListener;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    public final void setInterstitialAd$bidmachineadapter_release(@NotNull a interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        this.mInterstitialAd = interstitialAd;
    }

    public final void setInterstitialAdAvailability$bidmachineadapter_release(boolean isAvailable) {
        this.isInterstitialAdAvailable = isAvailable;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (isInterstitialReady(config)) {
            a aVar = this.mInterstitialAd;
            if (aVar != null) {
                aVar.show();
            }
        } else {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
        setInterstitialAdAvailability$bidmachineadapter_release(false);
    }
}
