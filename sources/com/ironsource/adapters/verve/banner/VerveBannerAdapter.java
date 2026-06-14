package com.ironsource.adapters.verve.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.verve.VerveAdapter;
import com.ironsource.adapters.verve.banner.VerveBannerAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.models.AdSize;
import net.pubnative.lite.sdk.views.HyBidAdView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J,\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\nH\u0016J6\u0010\u001d\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\bH\u0000¢\u0006\u0002\b$R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ironsource/adapters/verve/banner/VerveBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/verve/VerveAdapter;", N6.G1, "(Lcom/ironsource/adapters/verve/VerveAdapter;)V", "mAdListener", "Lcom/ironsource/adapters/verve/banner/VerveBannerAdListener;", "mAdView", "Lnet/pubnative/lite/sdk/views/HyBidAdView;", "mSmashListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "collectBannerBiddingData", "", "config", "Lorg/json/JSONObject;", "adData", "biddingDataCallback", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", C4240b4.h.S, "destroyBannerViewAd", "getBannerSize", "Lnet/pubnative/lite/sdk/models/AdSize;", "bannerSize", "Lcom/ironsource/mediationsdk/ISBannerSize;", "initBannerForBidding", "appKey", "", "userId", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadBannerForBidding", C4424m2.f43620s, "onNetworkInitCallbackFailed", "error", "onNetworkInitCallbackSuccess", "setBannerView", "bannerAdView", "setBannerView$verveadapter_release", "verveadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VerveBannerAdapter extends AbstractBannerAdapter<VerveAdapter> {

    @Nullable
    private VerveBannerAdListener mAdListener;

    @Nullable
    private HyBidAdView mAdView;

    @Nullable
    private BannerSmashListener mSmashListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerveAdapter.Companion.InitState.values().length];
            try {
                iArr[VerveAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerveAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerveAdapter.Companion.InitState.INIT_STATE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerveAdapter.Companion.InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerveBannerAdapter(@NotNull VerveAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: h4.a
            @Override // java.lang.Runnable
            public final void run() {
                VerveBannerAdapter.destroyBannerViewAd$lambda$1(this.f72951b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$1(VerveBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HyBidAdView hyBidAdView = this$0.mAdView;
        if (hyBidAdView != null) {
            hyBidAdView.destroy();
        }
        this$0.mAdView = null;
    }

    private final AdSize getBannerSize(ISBannerSize bannerSize) {
        if (bannerSize == null) {
            IronLog.INTERNAL.verbose("Banner size is null");
            return null;
        }
        String description = bannerSize.getDescription();
        if (description != null) {
            int iHashCode = description.hashCode();
            if (iHashCode != -387072689) {
                if (iHashCode != 79011241) {
                    if (iHashCode == 1951953708 && description.equals("BANNER")) {
                        return AdSize.SIZE_320x50;
                    }
                } else if (description.equals(l.f44065e)) {
                    return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? AdSize.SIZE_728x90 : AdSize.SIZE_320x50;
                }
            } else if (description.equals(l.f44063c)) {
                return AdSize.SIZE_300x250;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerForBidding$lambda$0(HyBidAdView bannerAdView, String str, VerveBannerAdListener bannerAdListener) {
        Intrinsics.checkNotNullParameter(bannerAdView, "$bannerAdView");
        Intrinsics.checkNotNullParameter(bannerAdListener, "$bannerAdListener");
        bannerAdView.renderAd(str, bannerAdListener);
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
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(VerveAdapter.LOG_INIT_FAILED, "Banner"));
        } else if (i10 == 3 || i10 == 4) {
            getAdapter().initSdk(config);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable final String serverData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        if (bannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        AdSize bannerSize2 = getBannerSize(bannerSize);
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
        final HyBidAdView hyBidAdView = new HyBidAdView(applicationContext, bannerSize2);
        hyBidAdView.setAdSize(bannerSize2);
        setBannerView$verveadapter_release(hyBidAdView);
        final VerveBannerAdListener verveBannerAdListener = new VerveBannerAdListener(listener, new WeakReference(this), this.mAdView, layoutParams);
        this.mAdListener = verveBannerAdListener;
        hyBidAdView.setMediation(true);
        postOnUIThread(new Runnable() { // from class: h4.b
            @Override // java.lang.Runnable
            public final void run() {
                VerveBannerAdapter.loadBannerForBidding$lambda$0(hyBidAdView, serverData, verveBannerAdListener);
            }
        });
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

    public final void setBannerView$verveadapter_release(@NotNull HyBidAdView bannerAdView) {
        Intrinsics.checkNotNullParameter(bannerAdView, "bannerAdView");
        this.mAdView = bannerAdView;
    }
}
