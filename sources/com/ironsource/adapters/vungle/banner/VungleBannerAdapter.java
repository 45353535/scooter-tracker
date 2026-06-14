package com.ironsource.adapters.vungle.banner;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.banner.VungleBannerAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J3\u0010$\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.¨\u00061"}, d2 = {"Lcom/ironsource/adapters/vungle/banner/VungleBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/vungle/VungleAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/vungle/VungleAdapter;)V", "Lorg/json/JSONObject;", "config", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initBannersInternal", "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "", "placementId", "Lcom/ironsource/mediationsdk/ISBannerSize;", "bannerSize", C4424m2.f43620s, "loadBannerInternal", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;Ljava/lang/String;)V", "Lcom/vungle/ads/VungleAdSize;", "getBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;)Lcom/vungle/ads/VungleAdSize;", "appKey", "userId", "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "initBanners", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.N, "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "(Lorg/json/JSONObject;)V", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectBannerBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "j$/util/concurrent/ConcurrentHashMap", "mBannerPlacementToListenerMap", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/vungle/ads/VungleBannerView;", "mPlacementToBannerAd", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleBannerAdapter extends AbstractBannerAdapter<VungleAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementToListenerMap;

    @NotNull
    private final ConcurrentHashMap<String, VungleBannerView> mPlacementToBannerAd;

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
    public VungleBannerAdapter(@NotNull VungleAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.mBannerPlacementToListenerMap = new ConcurrentHashMap<>();
        this.mPlacementToBannerAd = new ConcurrentHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBanner$lambda$4(JSONObject config, VungleBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strOptString = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + strOptString);
        VungleBannerView vungleBannerView = this$0.mPlacementToBannerAd.get(strOptString);
        if (vungleBannerView != null) {
            ironLog.verbose("destroyBanner Vungle ad, with PlacementId - " + strOptString);
            vungleBannerView.finishAd();
            this$0.mPlacementToBannerAd.remove(strOptString);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final VungleAdSize getBannerSize(ISBannerSize bannerSize) {
        String description = bannerSize.getDescription();
        if (description == null) {
            return null;
        }
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f44063c)) {
                    return VungleAdSize.MREC;
                }
                return null;
            case 72205083:
                if (!description.equals(l.f44062b)) {
                    return null;
                }
                break;
            case 79011241:
                if (description.equals(l.f44065e)) {
                    return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? VungleAdSize.BANNER_LEADERBOARD : VungleAdSize.BANNER;
                }
                return null;
            case 1951953708:
                if (!description.equals("BANNER")) {
                    return null;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    return VungleAdSize.INSTANCE.getAdSizeWithWidthAndHeight(bannerSize.getWidth(), bannerSize.getHeight());
                }
                return null;
            default:
                return null;
        }
        return VungleAdSize.BANNER;
    }

    private final void initBannersInternal(JSONObject config, BannerSmashListener listener) {
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        String appId = config.optString(VungleAdapter.APP_ID);
        if (placementId == null || placementId.length() == 0) {
            IronLog ironLog = IronLog.INTERNAL;
            Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
            ironLog.error(getAdUnitIdMissingErrorString(placementId));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(placementId), "Banner"));
            return;
        }
        if (appId == null || appId.length() == 0) {
            IronLog ironLog2 = IronLog.INTERNAL;
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            ironLog2.error(getAdUnitIdMissingErrorString(appId));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appId), "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + placementId + ", appId = " + appId);
        ConcurrentHashMap<String, BannerSmashListener> concurrentHashMap = this.mBannerPlacementToListenerMap;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK init failed", "Banner"));
            return;
        }
        VungleAdapter adapter = getAdapter();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        adapter.initSDK(applicationContext, appId);
    }

    private final void loadBannerInternal(String placementId, ISBannerSize bannerSize, BannerSmashListener listener, String serverData) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + placementId);
        if (bannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        VungleAdSize bannerSize2 = getBannerSize(bannerSize);
        if (bannerSize2 == null) {
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        VungleBannerView vungleBannerView = new VungleBannerView(applicationContext, placementId, bannerSize2);
        vungleBannerView.setAdListener(new VungleBannerAdListener(listener, placementId, vungleBannerView));
        this.mPlacementToBannerAd.put(placementId, vungleBannerView);
        ironLog.verbose("size = " + bannerSize2);
        vungleBannerView.load(serverData);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull final JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        postOnUIThread(new Runnable() { // from class: i4.a
            @Override // java.lang.Runnable
            public final void run() {
                VungleBannerAdapter.destroyBanner$lambda$4(config, this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        initBannersInternal(config, listener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        initBannersInternal(config, listener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + placementId);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        loadBannerInternal(placementId, bannerSize, listener, null);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + placementId);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        loadBannerInternal(placementId, bannerSize, listener, serverData);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        Collection<BannerSmashListener> collectionValues = this.mBannerPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mBannerPlacementToListenerMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((BannerSmashListener) it.next()).onBannerInitFailed(ErrorBuilder.buildInitFailedError(error, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Collection<BannerSmashListener> collectionValues = this.mBannerPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mBannerPlacementToListenerMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((BannerSmashListener) it.next()).onBannerInitSuccess();
        }
    }
}
