package com.ironsource.adapters.bidmachine.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.bidmachine.BidMachineAdapter;
import com.ironsource.adapters.bidmachine.banner.BidMachineBannerAdapter;
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
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.BannerAdSize;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import u8.d;
import u8.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/ironsource/adapters/bidmachine/banner/BidMachineBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/bidmachine/BidMachineAdapter;)V", "", "destroyBannerViewAd", "()V", "Lcom/ironsource/mediationsdk/ISBannerSize;", "bannerSize", "Lio/bidmachine/BannerAdSize;", "getBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;)Lio/bidmachine/BannerAdSize;", "Lorg/json/JSONObject;", "config", "Lio/bidmachine/AdPlacementConfig;", "createBannerPlacementConfig", "(Lorg/json/JSONObject;Lio/bidmachine/BannerAdSize;)Lio/bidmachine/AdPlacementConfig;", "", "appKey", "userId", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "adData", C4424m2.f43620s, "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "(Lorg/json/JSONObject;)V", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectBannerBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "Lu8/f;", "ad", "setBannerView$bidmachineadapter_release", "(Lu8/f;)V", "setBannerView", "mBannerListener", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "Lcom/ironsource/adapters/bidmachine/banner/BidMachineBannerAdListener;", "mBannerAdListener", "Lcom/ironsource/adapters/bidmachine/banner/BidMachineBannerAdListener;", "mBannerViewAd", "Lu8/f;", "Lu8/d;", "mBannerRequest", "Lu8/d;", y.f66058y, "bidmachineadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BidMachineBannerAdapter extends AbstractBannerAdapter<BidMachineAdapter> {

    @NotNull
    private static final String BANNER_SIZE_IS_NULL_ERROR_MSG = "banner size is null, banner has been destroyed";

    @Nullable
    private BidMachineBannerAdListener mBannerAdListener;

    @Nullable
    private BannerSmashListener mBannerListener;

    @Nullable
    private d mBannerRequest;

    @Nullable
    private f mBannerViewAd;

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
    public BidMachineBannerAdapter(@NotNull BidMachineAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    private final AdPlacementConfig createBannerPlacementConfig(JSONObject config, BannerAdSize bannerSize) {
        String strOptString = config.optString(BidMachineAdapter.INSTANCE.getPlacementIdKey());
        AdPlacementConfig.Builder builderBannerBuilder = AdPlacementConfig.INSTANCE.bannerBuilder(bannerSize);
        if (strOptString != null && strOptString.length() != 0) {
            builderBannerBuilder.withPlacementId(strOptString);
        }
        return builderBannerBuilder.build();
    }

    private final void destroyBannerViewAd() {
        postOnUIThread(new Runnable() { // from class: z3.b
            @Override // java.lang.Runnable
            public final void run() {
                BidMachineBannerAdapter.destroyBannerViewAd$lambda$1(this.f119182b);
            }
        });
        this.mBannerViewAd = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBannerViewAd$lambda$1(BidMachineBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        f fVar = this$0.mBannerViewAd;
        if (fVar != null) {
        }
        f fVar2 = this$0.mBannerViewAd;
        if (fVar2 != null) {
            fVar2.destroy();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final BannerAdSize getBannerSize(ISBannerSize bannerSize) {
        if (bannerSize == null) {
            IronLog.INTERNAL.verbose("Banner size is null");
            return null;
        }
        String description = bannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        return BannerAdSize.MediumRectangle;
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? BannerAdSize.Leaderboard : BannerAdSize.Banner;
                    }
                    break;
                case 446888797:
                    if (description.equals(l.f44064d)) {
                        return BannerAdSize.Leaderboard;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        return BannerAdSize.Banner;
                    }
                    break;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerForBidding$lambda$0(ISBannerSize iSBannerSize, BannerSmashListener listener, f bannerView, BidMachineBannerAdapter this$0) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(bannerView, "$bannerView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (iSBannerSize != null) {
            bannerView.load(this$0.mBannerRequest);
        } else {
            IronLog.INTERNAL.error(BANNER_SIZE_IS_NULL_ERROR_MSG);
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(BANNER_SIZE_IS_NULL_ERROR_MSG));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Object objOpt = adData != null ? adData.opt("bannerSize") : null;
        if (!(objOpt instanceof ISBannerSize)) {
            IronLog.INTERNAL.verbose("Banner size is invalid or not of type ISBannerSize");
            biddingDataCallback.onFailure("Banner size is invalid or not of type ISBannerSize - BidMachine");
            return;
        }
        BannerAdSize bannerSize = getBannerSize((ISBannerSize) objOpt);
        if (bannerSize != null) {
            getAdapter().collectBiddingData(biddingDataCallback, createBannerPlacementConfig(config, bannerSize));
            return;
        }
        IronLog.INTERNAL.verbose("Unsupported or null banner size");
        biddingDataCallback.onFailure("Unsupported or null banner size - BidMachine");
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
        String sourceIdKey = BidMachineAdapter.INSTANCE.getSourceIdKey();
        String sourceId = config.optString(sourceIdKey);
        if (sourceId == null || sourceId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(sourceIdKey));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(sourceIdKey), "Banner"));
            return;
        }
        this.mBannerListener = listener;
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
        } else if (i10 == 2 || i10 == 3) {
            BidMachineAdapter adapter = getAdapter();
            Intrinsics.checkNotNullExpressionValue(sourceId, "sourceId");
            adapter.initSdk(sourceId);
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
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        BidMachineBannerAdListener bidMachineBannerAdListener = new BidMachineBannerAdListener(listener, new WeakReference(this), new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, bannerSize2.getWidth()), AdapterUtils.dpToPixels(applicationContext, bannerSize2.getHeight()), 17));
        this.mBannerAdListener = bidMachineBannerAdListener;
        final f fVar = new f(ContextProvider.getInstance().getApplicationContext());
        fVar.setListener(bidMachineBannerAdListener);
        zb.f bidPayload = new d.c(createBannerPlacementConfig(config, bannerSize2)).setBidPayload(serverData);
        Intrinsics.checkNotNullExpressionValue(bidPayload, "Builder(adPlacementConfi…setBidPayload(serverData)");
        this.mBannerRequest = (d) ((d.c) bidPayload).build();
        postOnUIThread(new Runnable() { // from class: z3.a
            @Override // java.lang.Runnable
            public final void run() {
                BidMachineBannerAdapter.loadBannerForBidding$lambda$0(bannerSize, listener, fVar, this);
            }
        });
    }

    public final void setBannerView$bidmachineadapter_release(@NotNull f ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.mBannerViewAd = ad2;
    }
}
