package com.ironsource.adapters.yandex.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.yandex.YandexAdapter;
import com.ironsource.adapters.yandex.banner.YandexBannerAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.taurusx.tax.f.y;
import com.yandex.mobile.ads.banner.BannerAdSize;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.BidderTokenRequestConfiguration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J,\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\bH\u0016J6\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\u0015\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\"R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/yandex/banner/YandexBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/yandex/YandexAdapter;", N6.G1, "(Lcom/ironsource/adapters/yandex/YandexAdapter;)V", "mAdView", "Lcom/yandex/mobile/ads/banner/BannerAdView;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mYandexAdListener", "Lcom/ironsource/adapters/yandex/banner/YandexBannerAdListener;", "collectBannerBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", C4240b4.h.S, "destroyBannerViewAd", "getBannerSize", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", "initBannerForBidding", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadBannerForBidding", C4424m2.f43620s, "onNetworkInitCallbackSuccess", "setBannerView", "bannerAdView", "setBannerView$yandexadapter_release", y.f66058y, "yandexadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class YandexBannerAdapter extends AbstractBannerAdapter<YandexAdapter> {

    @NotNull
    private static final String BANNER_SIZE_IS_NULL_ERROR_MSG = "banner size is null, banner has been destroyed";

    @Nullable
    private BannerAdView mAdView;

    @Nullable
    private BannerSmashListener mSmashListener;

    @Nullable
    private YandexBannerAdListener mYandexAdListener;

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
    public YandexBannerAdapter(@NotNull YandexAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: l4.a
            @Override // java.lang.Runnable
            public final void run() {
                YandexBannerAdapter.destroyBannerViewAd$lambda$4(this.f94043b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$4(YandexBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BannerAdView bannerAdView = this$0.mAdView;
        if (bannerAdView != null) {
            bannerAdView.setBannerAdEventListener(null);
        }
        BannerAdView bannerAdView2 = this$0.mAdView;
        if (bannerAdView2 != null) {
            bannerAdView2.destroy();
        }
        this$0.mAdView = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final BannerAdSize getBannerSize(ISBannerSize bannerSize) {
        if (bannerSize == null) {
            IronLog.INTERNAL.verbose("Banner size is null");
            return null;
        }
        Context context = ContextProvider.getInstance().getApplicationContext();
        String description = bannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        BannerAdSize.Companion companion = BannerAdSize.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return companion.fixedSize(context, 300, 250);
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f44062b)) {
                        BannerAdSize.Companion companion2 = BannerAdSize.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return companion2.fixedSize(context, 320, 90);
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        if (AdapterUtils.isLargeScreen(context)) {
                            BannerAdSize.Companion companion3 = BannerAdSize.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            return companion3.fixedSize(context, 728, 90);
                        }
                        BannerAdSize.Companion companion4 = BannerAdSize.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return companion4.fixedSize(context, 320, 50);
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        BannerAdSize.Companion companion5 = BannerAdSize.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return companion5.fixedSize(context, 320, 50);
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        int width = bannerSize.getWidth();
                        int height = bannerSize.getHeight();
                        BannerAdSize.Companion companion6 = BannerAdSize.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        return companion6.fixedSize(context, width, height);
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerForBidding$lambda$0(ISBannerSize iSBannerSize, BannerSmashListener listener, BannerAdView bannerAdView, AdRequest adRequest) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(bannerAdView, "$bannerAdView");
        Intrinsics.checkNotNullParameter(adRequest, "$adRequest");
        if (iSBannerSize != null) {
            bannerAdView.loadAd(adRequest);
        } else {
            IronLog.INTERNAL.error(BANNER_SIZE_IS_NULL_ERROR_MSG);
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(BANNER_SIZE_IS_NULL_ERROR_MSG));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        BannerAdSize bannerSize;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        BidderTokenRequestConfiguration.Builder builder = new BidderTokenRequestConfiguration.Builder(AdType.BANNER);
        if (adData != null && (bannerSize = getBannerSize((ISBannerSize) adData.opt("bannerSize"))) != null) {
            builder.setBannerAdSize(bannerSize);
        }
        builder.setParameters(getAdapter().getConfigParams());
        getAdapter().collectBiddingData(biddingDataCallback, builder.build());
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.ADAPTER_API.verbose();
        destroyBannerViewAd();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        YandexAdapter.Companion companion = YandexAdapter.INSTANCE;
        String appIdKey = companion.getAppIdKey();
        String configStringValueFromKey = getConfigStringValueFromKey(config, appIdKey);
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(appIdKey));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appIdKey), "Banner"));
            return;
        }
        String adUnitIdKey = companion.getAdUnitIdKey();
        String configStringValueFromKey2 = getConfigStringValueFromKey(config, adUnitIdKey);
        if (configStringValueFromKey2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(adUnitIdKey));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(adUnitIdKey), "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("appId = " + configStringValueFromKey + ", adUnitId = " + configStringValueFromKey2);
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            getAdapter().initSdk(configStringValueFromKey);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable final ISBannerSize bannerSize, @NotNull final BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (bannerSize == null) {
            IronLog.INTERNAL.error(BANNER_SIZE_IS_NULL_ERROR_MSG);
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(BANNER_SIZE_IS_NULL_ERROR_MSG));
            return;
        }
        BannerAdSize bannerSize2 = getBannerSize(bannerSize);
        if (bannerSize2 == null) {
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize2.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize2.getHeight()), 17);
        String configStringValueFromKey = getConfigStringValueFromKey(config, YandexAdapter.INSTANCE.getAdUnitIdKey());
        Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
        final BannerAdView bannerAdView = new BannerAdView(applicationContext2);
        bannerAdView.setAdUnitId(configStringValueFromKey);
        bannerAdView.setAdSize(bannerSize2);
        this.mYandexAdListener = new YandexBannerAdListener(listener, new WeakReference(this), bannerAdView, layoutParams);
        final AdRequest adRequestBuild = new AdRequest.Builder().setBiddingData(serverData).setParameters(getAdapter().getConfigParams()).build();
        bannerAdView.setBannerAdEventListener(this.mYandexAdListener);
        postOnUIThread(new Runnable() { // from class: l4.b
            @Override // java.lang.Runnable
            public final void run() {
                YandexBannerAdapter.loadBannerForBidding$lambda$0(bannerSize, listener, bannerAdView, adRequestBuild);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        BannerSmashListener bannerSmashListener = this.mSmashListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    public final void setBannerView$yandexadapter_release(@NotNull BannerAdView bannerAdView) {
        Intrinsics.checkNotNullParameter(bannerAdView, "bannerAdView");
        this.mAdView = bannerAdView;
    }
}
