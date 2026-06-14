package com.ironsource.adapters.moloco.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.moloco.MolocoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J6\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0002J*\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010*\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002JX\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010*\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u00112\u001e\b\u0002\u0010/\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u00020\u000f00H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ironsource/adapters/moloco/banner/MolocoBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/moloco/MolocoAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/moloco/MolocoAdapter;)V", "mListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "mAdLoadListener", "Lcom/ironsource/adapters/moloco/banner/MolocoBannerAdLoadListener;", "mAdShowListener", "Lcom/ironsource/adapters/moloco/banner/MolocoBannerAdShowListener;", "mAdView", "Lcom/moloco/sdk/publisher/Banner;", "initBannerForBidding", "", "appKey", "", "userId", "config", "Lorg/json/JSONObject;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onNetworkInitCallbackSuccess", "onNetworkInitCallbackFailed", "error", "loadBannerForBidding", "adData", C4424m2.f43620s, "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", C4240b4.h.S, "collectBannerBiddingData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "destroyBannerViewAd", "createBannerLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "size", "handleBannerCreation", "adView", "layoutParams", "createBannerWithSize", "mediationInfo", "Lcom/moloco/sdk/publisher/MediationInfo;", "adUnitId", "createCallback", "Lkotlin/Function2;", "Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "molocoadapter_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MolocoBannerAdapter extends AbstractBannerAdapter<MolocoAdapter> {

    @Nullable
    private MolocoBannerAdLoadListener mAdLoadListener;

    @Nullable
    private MolocoBannerAdShowListener mAdShowListener;

    @Nullable
    private Banner mAdView;

    @Nullable
    private BannerSmashListener mListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MolocoAdapter.Companion.InitState.values().length];
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MolocoAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MolocoBannerAdapter(@NotNull MolocoAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final FrameLayout.LayoutParams createBannerLayoutParams(Context context, ISBannerSize size) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        String description = size.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, 250));
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        layoutParams = AdapterUtils.isLargeScreen(context) ? new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 728), AdapterUtils.dpToPixels(context, 90)) : new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                    }
                    break;
                case 446888797:
                    if (description.equals(l.f44064d)) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 728), AdapterUtils.dpToPixels(context, 90));
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                    }
                    break;
            }
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void createBannerWithSize(ISBannerSize size, MediationInfo mediationInfo, String adUnitId, BannerSmashListener listener, FrameLayout.LayoutParams layoutParams, String serverData, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> createCallback) {
        String description = size.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        Moloco.createMREC(mediationInfo, adUnitId, null, createCallback);
                        return;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
                            Moloco.createBannerTablet(mediationInfo, adUnitId, null, createCallback);
                            return;
                        } else {
                            Moloco.createBanner(mediationInfo, adUnitId, null, createCallback);
                            return;
                        }
                    }
                    break;
                case 446888797:
                    if (description.equals(l.f44064d)) {
                        Moloco.createBannerTablet(mediationInfo, adUnitId, null, createCallback);
                        return;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        Moloco.createBanner(mediationInfo, adUnitId, null, createCallback);
                        return;
                    }
                    break;
            }
        }
        Moloco.createBanner(mediationInfo, adUnitId, null, createCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void createBannerWithSize$default(final MolocoBannerAdapter molocoBannerAdapter, ISBannerSize iSBannerSize, MediationInfo mediationInfo, String str, final BannerSmashListener bannerSmashListener, final FrameLayout.LayoutParams layoutParams, final String str2, Function2 function2, int i10, Object obj) {
        molocoBannerAdapter.createBannerWithSize(iSBannerSize, mediationInfo, str, bannerSmashListener, layoutParams, str2, (i10 & 64) != 0 ? new Function2() { // from class: com.ironsource.adapters.moloco.banner.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return MolocoBannerAdapter.createBannerWithSize$lambda$4(bannerSmashListener, molocoBannerAdapter, layoutParams, str2, (Banner) obj2, (MolocoAdError.AdCreateError) obj3);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createBannerWithSize$lambda$4(BannerSmashListener bannerSmashListener, MolocoBannerAdapter molocoBannerAdapter, FrameLayout.LayoutParams layoutParams, String str, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (adCreateError != null) {
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError(String.valueOf(adCreateError.getErrorCode()), adCreateError.getDescription());
            Intrinsics.checkNotNullExpressionValue(ironSourceErrorBuildShowFailedError, "buildShowFailedError(...)");
            bannerSmashListener.onBannerAdLoadFailed(ironSourceErrorBuildShowFailedError);
        } else {
            molocoBannerAdapter.handleBannerCreation(banner, bannerSmashListener, layoutParams, str);
        }
        return Unit.f93236a;
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.moloco.banner.a
            @Override // java.lang.Runnable
            public final void run() {
                MolocoBannerAdapter.destroyBannerViewAd$lambda$0(this.f42395b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$0(MolocoBannerAdapter molocoBannerAdapter) {
        Banner banner = molocoBannerAdapter.mAdView;
        if (banner != null) {
            banner.destroy();
        }
        molocoBannerAdapter.mAdView = null;
    }

    private final void handleBannerCreation(Banner adView, BannerSmashListener listener, FrameLayout.LayoutParams layoutParams, String serverData) {
        if (adView != null) {
            this.mAdView = adView;
            this.mAdLoadListener = new MolocoBannerAdLoadListener(listener, layoutParams, adView);
            MolocoBannerAdShowListener molocoBannerAdShowListener = new MolocoBannerAdShowListener(listener);
            this.mAdShowListener = molocoBannerAdShowListener;
            Banner banner = this.mAdView;
            if (banner != null) {
                banner.setAdShowListener(molocoBannerAdShowListener);
                banner.load(serverData, this.mAdLoadListener);
            } else {
                banner = null;
            }
            if (banner != null) {
                return;
            }
        }
        listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(MolocoAdapter.INVALID_CONFIGURATION));
        Unit unit = Unit.f93236a;
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
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose();
        MolocoAdapter.Companion companion = MolocoAdapter.INSTANCE;
        String configStringValueFromKey = getConfigStringValueFromKey(config, companion.getAdUnitIdKey());
        String configStringValueFromKey2 = getConfigStringValueFromKey(config, companion.getAppKey());
        if (configStringValueFromKey.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey), "Banner"));
            return;
        }
        if (configStringValueFromKey2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(configStringValueFromKey2));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(configStringValueFromKey2), "Banner"));
            return;
        }
        ironLog.verbose("adUnitId = " + configStringValueFromKey + ", appKey = " + configStringValueFromKey2);
        this.mListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Moloco sdk init failed", "Banner"));
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new m();
            }
            getAdapter().initSdk(configStringValueFromKey2);
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
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        FrameLayout.LayoutParams layoutParamsCreateBannerLayoutParams = createBannerLayoutParams(applicationContext, bannerSize);
        MolocoAdapter.Companion companion = MolocoAdapter.INSTANCE;
        createBannerWithSize$default(this, bannerSize, companion.getMediationInfo(), getConfigStringValueFromKey(config, companion.getAdUnitIdKey()), listener, layoutParamsCreateBannerLayoutParams, serverData, null, 64, null);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(error, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }
}
