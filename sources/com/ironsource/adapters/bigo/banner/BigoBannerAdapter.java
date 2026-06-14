package com.ironsource.adapters.bigo.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.adapters.bigo.banner.BigoBannerAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002J,\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J,\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\fH\u0016J6\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ironsource/adapters/bigo/banner/BigoBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/bigo/BigoAdapter;", N6.G1, "(Lcom/ironsource/adapters/bigo/BigoAdapter;)V", "mAdListener", "Lcom/ironsource/adapters/bigo/banner/BigoBannerAdListener;", "mAdLoader", "Lsg/bigo/ads/api/BannerAdLoader;", "mBannerViewAd", "Lsg/bigo/ads/api/BannerAd;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", C4240b4.h.S, "", "config", "Lorg/json/JSONObject;", "destroyBannerViewAd", "getBannerBiddingData", "", "", "", "adData", "getBannerSize", "Lsg/bigo/ads/api/AdSize;", "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", "initBannerForBidding", "appKey", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadBannerForBidding", C4424m2.f43620s, "setBannerView", "ad", "setBannerView$bigoadapter_release", "bigoadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BigoBannerAdapter extends AbstractBannerAdapter<BigoAdapter> {

    @Nullable
    private BigoBannerAdListener mAdListener;

    @Nullable
    private BannerAdLoader mAdLoader;

    @Nullable
    private BannerAd mBannerViewAd;

    @Nullable
    private BannerSmashListener mSmashListener;

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
    public BigoBannerAdapter(@NotNull BigoAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: a4.a
            @Override // java.lang.Runnable
            public final void run() {
                BigoBannerAdapter.destroyBannerViewAd$lambda$0(this.f3775b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$0(BigoBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BannerAd bannerAd = this$0.mBannerViewAd;
        if (bannerAd != null) {
            bannerAd.setAdInteractionListener(null);
        }
        BannerAd bannerAd2 = this$0.mBannerViewAd;
        if (bannerAd2 != null) {
            bannerAd2.destroy();
        }
        this$0.mBannerViewAd = null;
        this$0.mAdLoader = null;
    }

    private final AdSize getBannerSize(ISBannerSize bannerSize) {
        String description = bannerSize != null ? bannerSize.getDescription() : null;
        if (Intrinsics.areEqual(description, ISBannerSize.BANNER.getDescription())) {
            return AdSize.BANNER;
        }
        if (Intrinsics.areEqual(description, ISBannerSize.RECTANGLE.getDescription())) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (Intrinsics.areEqual(description, ISBannerSize.SMART.getDescription())) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? AdSize.LARGE_BANNER : AdSize.BANNER;
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        IronLog.ADAPTER_API.verbose();
        destroyBannerViewAd();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    @Nullable
    public Map<String, Object> getBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData$bigoadapter_release();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        String configStringValueFromKey = getConfigStringValueFromKey(config, BigoAdapter.INSTANCE.getAppIdKey());
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey), "Banner"));
            return;
        }
        this.mSmashListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            getAdapter().initSdk(configStringValueFromKey);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (bannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        if (serverData == null || serverData.length() == 0) {
            IronLog.INTERNAL.error("serverData is empty");
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
            return;
        }
        AdSize bannerSize2 = getBannerSize(bannerSize);
        if (bannerSize2 == null) {
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        this.mAdListener = new BigoBannerAdListener(new WeakReference(this), listener, new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize2.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize2.getHeight()), 17));
        BannerAdLoader.Builder builderWithAdLoadListener = new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) this.mAdListener);
        BigoAdapter.Companion companion = BigoAdapter.INSTANCE;
        BannerAdLoader bannerAdLoaderBuild = builderWithAdLoadListener.withExt(companion.getMEDIATION_INFO()).build();
        Intrinsics.checkNotNullExpressionValue(bannerAdLoaderBuild, "Builder().withAdLoadList…\n                .build()");
        this.mAdLoader = bannerAdLoaderBuild;
        bannerAdLoaderBuild.loadAd(new BannerAdRequest.Builder().withBid(serverData).withSlotId(getConfigStringValueFromKey(config, companion.getSlotIdKey())).withAdSizes(bannerSize2).build());
    }

    public final void setBannerView$bigoadapter_release(@NotNull BannerAd ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ad2.setAdInteractionListener(this.mAdListener);
        this.mBannerViewAd = ad2;
    }
}
