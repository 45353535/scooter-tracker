package org.bidon.chartboost.impl;

import kotlin.jvm.functions.Function1;
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
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97223a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97224b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c1.b f97225c;

    public static final class a implements d1.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f97227b;

        a(c cVar) {
            this.f97227b = cVar;
        }

        @Override // d1.a
        public void a(e1.e event, e1.d dVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostBannerImpl", "onAdClicked " + event);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // d1.a
        public void c(e1.g event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostBannerImpl", "onImpressionRecorded " + event);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97227b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // d1.a
        public void d(e1.j event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostBannerImpl", "onAdRequestedToShow " + event);
        }

        @Override // d1.a
        public void e(e1.j event, e1.i iVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostBannerImpl", "onAdShown " + event);
            if (iVar != null) {
                e.this.emitEvent(new AdEvent.ShowFailed(org.bidon.chartboost.ext.a.b(iVar)));
                return;
            }
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Shown(ad2));
        }

        @Override // d1.a
        public void g(e1.b event, e1.a aVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (aVar != null) {
                LogExtKt.logInfo("ChartboostBannerImpl", "onAdFailed " + event + " " + aVar);
                e.this.emitEvent(new AdEvent.LoadFailed(org.bidon.chartboost.ext.a.a(aVar)));
                return;
            }
            LogExtKt.logInfo("ChartboostBannerImpl", "onAdLoaded " + event);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new c(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97224b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97224b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97224b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97224b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97224b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        c1.b bVar = new c1.b(adParams.a(), adParams.b(), adParams.c(), new a(adParams), adParams.d());
        this.f97225c = bVar;
        if (!bVar.e()) {
            LogExtKt.logInfo("ChartboostBannerImpl", "Ad is not available, caching");
            bVar.b();
            return;
        }
        LogExtKt.logInfo("ChartboostBannerImpl", "Ad is available already");
        Ad ad2 = getAd();
        if (ad2 == null) {
            return;
        }
        emitEvent(new AdEvent.Fill(ad2));
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97224b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        c1.b bVar = this.f97225c;
        if (bVar != null) {
            bVar.d();
        }
        c1.b bVar2 = this.f97225c;
        if (bVar2 != null) {
            bVar2.c();
        }
        this.f97225c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97223a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97224b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97223a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        c1.b bVar = this.f97225c;
        if (bVar != null) {
            return new AdViewHolder(bVar);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97224b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.chartboost.impl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97224b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97224b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97224b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        c1.b bVar = this.f97225c;
        return bVar != null && bVar.e();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97224b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97224b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97224b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97224b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97224b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97224b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97224b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97224b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97224b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97224b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97224b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97224b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97224b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97224b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97224b.setTokenInfo(tokenInfo);
    }
}
