package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractInterstitialAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements InterstitialAdapterInterface {
    public AbstractInterstitialAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(config, jSONObject);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(@Nullable JSONObject jSONObject) {
    }

    @Nullable
    public Map<String, Object> getInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    public void initInterstitial(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void initInterstitialForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return false;
    }

    public void loadInterstitial(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @Nullable String str, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
