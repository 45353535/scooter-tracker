package org.bidon.yandex.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import lf.m;
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
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements AdSource.Banner, AdEventFlow, StatisticsCollector, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97872a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97873b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ g f97874c = j.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BannerAdView f97875d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidType.values().length];
            try {
                iArr[BidType.RTB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidType.CPM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b implements BannerAdEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BannerAdView f97877b;

        b(BannerAdView bannerAdView) {
            this.f97877b = bannerAdView;
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdClicked() {
            LogExtKt.logInfo("YandexBannerImpl", "onAdClicked: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdFailedToLoad(AdRequestError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logError("YandexBannerImpl", "onAdFailedToLoad: " + error.getCode() + " " + error.getDescription() + ". " + this, new BidonError.NoFill(c.this.getDemandId()));
            c.this.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(c.this.getDemandId())));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdLoaded() {
            c.this.f97875d = this.f97877b;
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onImpression(ImpressionData impressionData) {
            LogExtKt.logInfo("YandexBannerImpl", "onImpression: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.PaidRevenue(ad2, org.bidon.yandex.ext.a.a(impressionData)));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onLeftApplication() {
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onReturnedToApplication() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.yandex.impl.a e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.yandex.impl.a(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.yandex.impl.g
    public void a(Context context, AdRequestConfiguration adRequestConfiguration, InterstitialAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f97874c.a(context, adRequestConfiguration, adLoadListener);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97873b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97873b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97873b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97873b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97873b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.yandex.impl.g
    public void b(Context context, AdRequestConfiguration adRequestConfiguration, RewardedAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f97874c.b(context, adRequestConfiguration, adLoadListener);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97873b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("YandexBannerImpl", "destroy: " + this);
        BannerAdView bannerAdView = this.f97875d;
        if (bannerAdView != null) {
            bannerAdView.destroy();
        }
        this.f97875d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97872a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.yandex.impl.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
            return;
        }
        AdRequest.Builder builder = new AdRequest.Builder();
        int i10 = a.$EnumSwitchMapping$0[adParams.getAdUnit().getBidType().ordinal()];
        if (i10 == 1) {
            String strD = adParams.d();
            if (strD == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "signalData")));
                return;
            }
            builder.setBiddingData(strD);
        } else if (i10 != 2) {
            throw new m();
        }
        AdRequest adRequestBuild = builder.build();
        BannerAdView bannerAdView = new BannerAdView(adParams.a());
        this.f97875d = bannerAdView;
        bannerAdView.setAdSize(org.bidon.yandex.ext.a.e(adParams.c(), adParams.a()));
        bannerAdView.setAdUnitId(strB);
        bannerAdView.setBannerAdEventListener(new b(bannerAdView));
        bannerAdView.loadAd(adRequestBuild);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97873b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97872a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        BannerAdView bannerAdView = this.f97875d;
        if (bannerAdView != null) {
            return new AdViewHolder(bannerAdView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97873b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.yandex.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97873b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97873b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97873b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97875d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97873b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97873b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97873b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97873b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97873b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97873b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97873b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97873b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97873b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97873b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97873b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97873b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97873b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97873b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97873b.setTokenInfo(tokenInfo);
    }
}
