package com.appodeal.ads.adapters.bidonmediation.banner;

import android.annotation.SuppressLint;
import com.appodeal.ads.adapters.bidonmediation.AdmobBannerAuctionParams;
import com.appodeal.ads.adapters.bidonmediation.ext.AdValueExtKt;
import com.appodeal.ads.adapters.bidonmediation.ext.AdmobErrorExtKt;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdAuctionParamsUseCase;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCase;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdViewHolder;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.adapter.impl.AdEventFlowImpl;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0017J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u0011\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0096\u0001J\u0011\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0096\u0001J\u0011\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\fH\u0096\u0001J!\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0096\u0001J\t\u00100\u001a\u00020\fH\u0096\u0001J\u0011\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u000203H\u0096\u0001J\u000b\u00104\u001a\u0004\u0018\u000105H\u0096\u0001J\t\u00106\u001a\u000207H\u0096\u0001J\t\u00108\u001a\u00020\u001aH\u0096\u0001J \u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010/H\u0096\u0001¢\u0006\u0002\u0010=J \u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010/H\u0096\u0001¢\u0006\u0002\u0010BJ\t\u0010C\u001a\u00020\u001aH\u0096\u0001J\t\u0010D\u001a\u00020\u001aH\u0096\u0001J\t\u0010E\u001a\u00020\u001aH\u0096\u0001J\t\u0010F\u001a\u00020\u001aH\u0096\u0001J\u0019\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020$2\u0006\u0010I\u001a\u00020/H\u0096\u0001J\t\u0010J\u001a\u00020\u001aH\u0096\u0001J\t\u0010K\u001a\u00020\u001aH\u0096\u0001J\t\u0010L\u001a\u00020\u001aH\u0096\u0001J\u0013\u0010M\u001a\u00020\u001a2\b\u0010N\u001a\u0004\u0018\u00010$H\u0096\u0001J\u0011\u0010O\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020/H\u0096\u0001J\u0011\u0010P\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020RH\u0096\u0001J\u0011\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020UH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010V\u001a\b\u0012\u0004\u0012\u0002030WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0012\u0010+\u001a\u00020$X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0012\u0010,\u001a\u00020-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0012\u0010&\u001a\u00020'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/banner/AdmobBannerImpl;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lcom/appodeal/ads/adapters/bidonmediation/AdmobBannerAuctionParams;", "Lorg/bidon/sdk/adapter/impl/AdEventFlow;", "Lorg/bidon/sdk/stats/StatisticsCollector;", "getAdRequest", "Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdRequestUseCase;", "getAdAuctionParams", "Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdAuctionParamsUseCase;", "<init>", "(Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdRequestUseCase;Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdAuctionParamsUseCase;)V", "isAdReadyToShow", "", "()Z", "setAdReadyToShow", "(Z)V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAuctionParam", "Lkotlin/Result;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "auctionParamsScope", "Lorg/bidon/sdk/adapter/AdAuctionParamSource;", "getAuctionParam-IoAF18A", "(Lorg/bidon/sdk/adapter/AdAuctionParamSource;)Ljava/lang/Object;", "load", "", "adParams", "getAdView", "Lorg/bidon/sdk/adapter/AdViewHolder;", "destroy", "addAuctionConfigurationId", "auctionConfigurationId", "", "addAuctionConfigurationUid", "auctionConfigurationUid", "", "addDemandId", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "addExternalWinNotificationsEnabled", "enabled", "addRoundInfo", "auctionId", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "auctionPricefloor", "", "canSendWinLoseNotifications", "emitEvent", "event", "Lorg/bidon/sdk/adapter/AdEvent;", "getAd", "Lorg/bidon/sdk/ads/Ad;", "getStats", "Lorg/bidon/sdk/stats/models/BidStat;", "markBelowPricefloor", "markFillFinished", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "price", "(Lorg/bidon/sdk/stats/models/RoundStatus;Ljava/lang/Double;)V", "markFillStarted", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "pricefloor", "(Lorg/bidon/sdk/auction/models/AdUnit;Ljava/lang/Double;)V", "markLoss", "markWin", "markWinLoseNotificationsSent", "sendClickImpression", "sendLoss", "winnerDemandId", "winnerPrice", "sendRewardImpression", "sendShowImpression", "sendWin", "setDsp", "dspSource", "setPrice", "setStatisticAdType", "adType", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "setTokenInfo", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "adEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getAdEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "getAuctionId", "()Ljava/lang/String;", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobBannerImpl implements AdSource.Banner<AdmobBannerAuctionParams>, AdEventFlow, StatisticsCollector {
    private final /* synthetic */ AdEventFlowImpl $$delegate_0;
    private final /* synthetic */ StatisticsCollectorImpl $$delegate_1;

    @Nullable
    private AdView adView;

    @NotNull
    private final GetAdAuctionParamsUseCase getAdAuctionParams;

    @NotNull
    private final GetAdRequestUseCase getAdRequest;
    private boolean isAdReadyToShow;

    public AdmobBannerImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$5(final AdmobBannerImpl admobBannerImpl, final AdmobBannerAuctionParams admobBannerAuctionParams, String str) {
        AdRequest adRequestInvoke = admobBannerImpl.getAdRequest.invoke(admobBannerAuctionParams);
        final AdView adView = new AdView(admobBannerAuctionParams.getActivity().getApplicationContext());
        admobBannerImpl.adView = adView;
        AdListener adListener = new AdListener() { // from class: com.appodeal.ads.adapters.bidonmediation.banner.AdmobBannerImpl$load$1$requestListener$1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                LogExtKt.logInfo("AdmobBanner", "onAdClicked: " + this);
                Ad ad2 = this.this$0.getAd();
                if (ad2 != null) {
                    this.this$0.emitEvent(new AdEvent.Clicked(ad2));
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                LogExtKt.logInfo("AdmobBanner", "onAdClosed: " + this);
                Ad ad2 = this.this$0.getAd();
                if (ad2 != null) {
                    this.this$0.emitEvent(new AdEvent.Closed(ad2));
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                LogExtKt.logInfo("AdmobBanner", "onAdFailedToLoad: " + loadAdError + ". " + this);
                this.this$0.emitEvent(new AdEvent.LoadFailed(AdmobErrorExtKt.asBidonError(loadAdError)));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                LogExtKt.logInfo("AdmobBanner", "onAdImpression: " + this);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                ResponseInfo responseInfo = adView.getResponseInfo();
                ImpressionLevelData impressionLevelDataA = responseInfo != null ? com.appodeal.ads.adapters.admobmediation.a.a(responseInfo) : null;
                LogExtKt.logInfo("AdmobBanner", "onAdLoaded with responseInfo: " + impressionLevelDataA + ".");
                if (impressionLevelDataA == null) {
                    BidonError.NoFill noFill = new BidonError.NoFill(this.this$0.getDemandId());
                    LogExtKt.logInfo("AdmobBanner", "onAdFailedToLoad: " + noFill + ". " + this);
                    this.this$0.emitEvent(new AdEvent.LoadFailed(noFill));
                    return;
                }
                LogExtKt.logInfo("AdmobBanner", "onAdLoaded: " + this);
                this.this$0.setDsp(impressionLevelDataA.getDemandSource());
                AdmobBannerImpl admobBannerImpl2 = this.this$0;
                Double ecpm = impressionLevelDataA.getEcpm();
                admobBannerImpl2.setPrice(ecpm != null ? ecpm.doubleValue() : admobBannerAuctionParams.getPrice());
                this.this$0.setAdReadyToShow(true);
                Ad ad2 = this.this$0.getAd();
                if (ad2 != null) {
                    this.this$0.emitEvent(new AdEvent.Fill(ad2));
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }
        };
        adView.setAdSize(admobBannerAuctionParams.getAdSize());
        adView.setAdUnitId(str);
        adView.setAdListener(adListener);
        adView.setOnPaidEventListener(new OnPaidEventListener() { // from class: com.appodeal.ads.adapters.bidonmediation.banner.b
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                AdmobBannerImpl.load$lambda$5$lambda$4$lambda$3(this.f12142a, adValue);
            }
        });
        adView.loadAd(adRequestInvoke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$5$lambda$4$lambda$3(AdmobBannerImpl admobBannerImpl, AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Ad ad2 = admobBannerImpl.getAd();
        if (ad2 != null) {
            admobBannerImpl.emitEvent(new AdEvent.PaidRevenue(ad2, AdValueExtKt.asBidonAdValue(adValue)));
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long auctionConfigurationId) {
        this.$$delegate_1.addAuctionConfigurationId(auctionConfigurationId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(@NotNull String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.$$delegate_1.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(@NotNull DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.$$delegate_1.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean enabled) {
        this.$$delegate_1.addExternalWinNotificationsEnabled(enabled);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(@NotNull String auctionId, @NotNull DemandAd demandAd, double auctionPricefloor) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.$$delegate_1.addRoundInfo(auctionId, demandAd, auctionPricefloor);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.$$delegate_1.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("AdmobBanner", "destroy " + this);
        AdView adView = this.adView;
        if (adView != null) {
            adView.setOnPaidEventListener(null);
        }
        this.adView = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(@NotNull AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @Nullable
    public Ad getAd() {
        return this.$$delegate_1.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    @NotNull
    public SharedFlow getAdEvent() {
        return this.$$delegate_0.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    @Nullable
    public AdViewHolder getAdView() {
        AdView adView = this.adView;
        if (adView != null) {
            return new AdViewHolder(adView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public String getAuctionId() {
        return this.$$delegate_1.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    @NotNull
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A, reason: not valid java name */
    public Object mo4425getAuctionParamIoAF18A(@NotNull AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return this.getAdAuctionParams.m4426invokegIAlus(auctionParamsScope, getDemandAd().getAdType());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandAd getDemandAd() {
        return this.$$delegate_1.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandId getDemandId() {
        return this.$$delegate_1.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.$$delegate_1.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow, reason: from getter */
    public boolean getIsAdReadyToShow() {
        return this.isAdReadyToShow;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.$$delegate_1.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(@NotNull RoundStatus roundStatus, @Nullable Double price) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.$$delegate_1.markFillFinished(roundStatus, price);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(@NotNull AdUnit adUnit, @Nullable Double pricefloor) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.$$delegate_1.markFillStarted(adUnit, pricefloor);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.$$delegate_1.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.$$delegate_1.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.$$delegate_1.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.$$delegate_1.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(@NotNull String winnerDemandId, double winnerPrice) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.$$delegate_1.sendLoss(winnerDemandId, winnerPrice);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.$$delegate_1.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.$$delegate_1.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.$$delegate_1.sendWin();
    }

    public void setAdReadyToShow(boolean z10) {
        this.isAdReadyToShow = z10;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(@Nullable String dspSource) {
        this.$$delegate_1.setDsp(dspSource);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double price) {
        this.$$delegate_1.setPrice(price);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(@NotNull StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.$$delegate_1.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(@NotNull TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.$$delegate_1.setTokenInfo(tokenInfo);
    }

    public AdmobBannerImpl(@NotNull GetAdRequestUseCase getAdRequest, @NotNull GetAdAuctionParamsUseCase getAdAuctionParams) {
        Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        Intrinsics.checkNotNullParameter(getAdAuctionParams, "getAdAuctionParams");
        this.$$delegate_0 = new AdEventFlowImpl();
        this.$$delegate_1 = new StatisticsCollectorImpl();
        this.getAdRequest = getAdRequest;
        this.getAdAuctionParams = getAdAuctionParams;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    @SuppressLint({"MissingPermission"})
    public void load(@NotNull final AdmobBannerAuctionParams adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("AdmobBanner", "Starting with " + adParams);
        final String adUnitId = adParams.getAdUnitId();
        if (adUnitId == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
        } else {
            adParams.getActivity().runOnUiThread(new Runnable() { // from class: com.appodeal.ads.adapters.bidonmediation.banner.a
                @Override // java.lang.Runnable
                public final void run() {
                    AdmobBannerImpl.load$lambda$5(this.f12139b, adParams, adUnitId);
                }
            });
        }
    }

    public /* synthetic */ AdmobBannerImpl(GetAdRequestUseCase getAdRequestUseCase, GetAdAuctionParamsUseCase getAdAuctionParamsUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new GetAdRequestUseCase() : getAdRequestUseCase, (i10 & 2) != 0 ? new GetAdAuctionParamsUseCase() : getAdAuctionParamsUseCase);
    }
}
