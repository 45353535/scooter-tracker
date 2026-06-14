package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractNativeAdAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements NativeAdAdapterInterface {
    public AbstractNativeAdAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectNativeAdBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> nativeAdBiddingData = getNativeAdBiddingData(config, jSONObject);
        if (nativeAdBiddingData != null) {
            biddingDataCallback.onSuccess(nativeAdBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyNativeAd(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Nullable
    public Map<String, Object> getNativeAdBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @NotNull
    public final NativeAdProperties getNativeAdProperties(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new NativeAdProperties(config);
    }

    public void initNativeAdForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void initNativeAds(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadNativeAd(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @NotNull NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadNativeAdForBidding(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @Nullable String str, @NotNull NativeAdSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
