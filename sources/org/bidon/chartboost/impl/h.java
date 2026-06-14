package org.bidon.chartboost.impl;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.adapter.impl.AdEventFlowImpl;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97231a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97232b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c1.c f97233c;

    public static final class a implements d1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f97235b;

        a(f fVar) {
            this.f97235b = fVar;
        }

        @Override // d1.a
        public void a(e1.e event, e1.d dVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onAdClicked " + event);
            Ad ad2 = h.this.getAd();
            if (ad2 == null) {
                return;
            }
            h.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // d1.a
        public void c(e1.g event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onImpressionRecorded " + event);
            Ad ad2 = h.this.getAd();
            if (ad2 == null) {
                return;
            }
            h.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97235b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // d1.a
        public void d(e1.j event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onAdRequestedToShow " + event);
        }

        @Override // d1.a
        public void e(e1.j event, e1.i iVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onAdShown " + event);
            if (iVar != null) {
                h.this.emitEvent(new AdEvent.ShowFailed(org.bidon.chartboost.ext.a.b(iVar)));
                return;
            }
            Ad ad2 = h.this.getAd();
            if (ad2 == null) {
                return;
            }
            h.this.emitEvent(new AdEvent.Shown(ad2));
        }

        @Override // d1.c
        public void f(e1.f event) {
            Intrinsics.checkNotNullParameter(event, "event");
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onImpressionRecorded " + event);
            Ad ad2 = h.this.getAd();
            if (ad2 == null) {
                return;
            }
            h.this.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // d1.a
        public void g(e1.b event, e1.a aVar) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (aVar != null) {
                LogExtKt.logInfo("ChartboostInterstitialImpl", "onAdFailed " + event + " " + aVar);
                h.this.emitEvent(new AdEvent.LoadFailed(org.bidon.chartboost.ext.a.a(aVar)));
                return;
            }
            LogExtKt.logInfo("ChartboostInterstitialImpl", "onAdLoaded " + event);
            Ad ad2 = h.this.getAd();
            if (ad2 == null) {
                return;
            }
            h.this.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new f(auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97232b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97232b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97232b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97232b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97232b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(f adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        c1.c cVar = new c1.c(adParams.a(), new a(adParams), adParams.b());
        this.f97233c = cVar;
        if (!cVar.f()) {
            LogExtKt.logInfo("ChartboostInterstitialImpl", "Ad is not available, caching");
            cVar.c();
            return;
        }
        LogExtKt.logInfo("ChartboostInterstitialImpl", "Ad is available already");
        Ad ad2 = getAd();
        if (ad2 == null) {
            return;
        }
        emitEvent(new AdEvent.Fill(ad2));
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97232b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        c1.c cVar = this.f97233c;
        if (cVar != null) {
            cVar.d();
        }
        this.f97233c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97231a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97232b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97231a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97232b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.chartboost.impl.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97232b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97232b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97232b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        c1.c cVar = this.f97233c;
        return cVar != null && cVar.f();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97232b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97232b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97232b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97232b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97232b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97232b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97232b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97232b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97232b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97232b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97232b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97232b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97232b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97232b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97232b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!getIsAdReadyToShow()) {
            LogExtKt.logInfo("ChartboostInterstitialImpl", "Ad is not ready to show");
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            c1.c cVar = this.f97233c;
            if (cVar != null) {
                cVar.h();
            }
        }
    }
}
