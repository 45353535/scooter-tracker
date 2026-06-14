package com.ironsource.adapters.mobilefuse.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.mobilefuse.MobileFuseAdapter;
import com.ironsource.adapters.mobilefuse.banner.MobileFuseBannerAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J,\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\nH\u0016J6\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0012\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010$\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ironsource/adapters/mobilefuse/banner/MobileFuseBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;", N6.G1, "(Lcom/ironsource/adapters/mobilefuse/MobileFuseAdapter;)V", "mAdListener", "Lcom/ironsource/adapters/mobilefuse/banner/MobileFuseBannerAdListener;", "mAdView", "Lcom/mobilefuse/sdk/MobileFuseBannerAd;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "collectBannerBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", C4240b4.h.S, "destroyBannerViewAd", "getBannerSize", "Lcom/mobilefuse/sdk/MobileFuseBannerAd$AdSize;", "size", "Lcom/ironsource/mediationsdk/ISBannerSize;", "isLargeScreen", "", "initBannerForBidding", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadBannerForBidding", C4424m2.f43620s, "bannerSize", "onNetworkInitCallbackFailed", "error", "onNetworkInitCallbackSuccess", "mobilefuseadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MobileFuseBannerAdapter extends AbstractBannerAdapter<MobileFuseAdapter> {

    @Nullable
    private MobileFuseBannerAdListener mAdListener;

    @Nullable
    private MobileFuseBannerAd mAdView;

    @Nullable
    private BannerSmashListener mSmashListener;

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
    public MobileFuseBannerAdapter(@NotNull MobileFuseAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: e4.a
            @Override // java.lang.Runnable
            public final void run() {
                MobileFuseBannerAdapter.destroyBannerViewAd$lambda$0(this.f68917b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$0(MobileFuseBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MobileFuseBannerAd mobileFuseBannerAd = this$0.mAdView;
        if (mobileFuseBannerAd != null) {
            mobileFuseBannerAd.setListener(null);
        }
        MobileFuseBannerAd mobileFuseBannerAd2 = this$0.mAdView;
        if (mobileFuseBannerAd2 != null) {
            mobileFuseBannerAd2.destroy();
        }
        this$0.mAdView = null;
    }

    private final MobileFuseBannerAd.AdSize getBannerSize(ISBannerSize size, boolean isLargeScreen) {
        String description = size != null ? size.getDescription() : null;
        if (Intrinsics.areEqual(description, ISBannerSize.BANNER.getDescription())) {
            return MobileFuseBannerAd.AdSize.BANNER_320x50;
        }
        if (Intrinsics.areEqual(description, ISBannerSize.RECTANGLE.getDescription())) {
            return MobileFuseBannerAd.AdSize.BANNER_300x250;
        }
        if (Intrinsics.areEqual(description, ISBannerSize.SMART.getDescription())) {
            return isLargeScreen ? MobileFuseBannerAd.AdSize.BANNER_728x90 : MobileFuseBannerAd.AdSize.BANNER_320x50;
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
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
        IronLog.ADAPTER_API.verbose();
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(MobileFuseAdapter.LOG_INIT_FAILED, "Banner"));
        } else if (i10 == 3 || i10 == 4) {
            getAdapter().initSdk(config);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) throws Throwable {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (bannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        MobileFuseBannerAd.AdSize bannerSize2 = getBannerSize(bannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
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
        String configStringValueFromKey = getConfigStringValueFromKey(config, MobileFuseAdapter.INSTANCE.getPlacementIdKey());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize.getHeight()), 17);
        MobileFuseBannerAd mobileFuseBannerAd = new MobileFuseBannerAd(applicationContext, configStringValueFromKey, bannerSize2);
        this.mAdView = mobileFuseBannerAd;
        MobileFuseBannerAdListener mobileFuseBannerAdListener = new MobileFuseBannerAdListener(listener, mobileFuseBannerAd, layoutParams);
        this.mAdListener = mobileFuseBannerAdListener;
        mobileFuseBannerAd.setListener(mobileFuseBannerAdListener);
        mobileFuseBannerAd.setAutorefreshEnabled(false);
        mobileFuseBannerAd.setMuted(true);
        mobileFuseBannerAd.loadAdFromBiddingToken(serverData);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        BannerSmashListener bannerSmashListener = this.mSmashListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(error, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        BannerSmashListener bannerSmashListener = this.mSmashListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }
}
