package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractBannerAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements BannerAdapterInterface {
    public AbstractBannerAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> bannerBiddingData = getBannerBiddingData(config, jSONObject);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void destroyBanner(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    public int getAdaptiveHeight(int i10) {
        return -1;
    }

    @Nullable
    public Map<String, Object> getBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @Nullable
    public LoadWhileShowSupportState getBannerLoadWhileShowSupportState(@Nullable JSONObject jSONObject) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public void initBannerForBidding(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void initBanners(@Nullable String str, @Nullable String str2, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadBanner(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @Nullable ISBannerSize iSBannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject jSONObject, @Nullable String str, @Nullable ISBannerSize iSBannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(@NotNull JSONObject config, @Nullable String str, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewBound(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void onBannerViewWillBind(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
