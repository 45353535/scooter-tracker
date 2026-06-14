package org.bidon.moloco.impl;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Banner f97514c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97512a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97513b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f97515d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f97516e = lf.i.a(new Function0() { // from class: org.bidon.moloco.impl.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.f(this.f97509b);
        }
    });

    public static final class a implements AdLoad.Listener {
        a() {
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            BidonError bidonErrorD = org.bidon.moloco.ext.b.d(molocoAdError);
            LogExtKt.logError("MolocoBannerImpl", "Banner ad load failed: " + molocoAdError.getDescription(), bidonErrorD);
            d.this.emitEvent(new AdEvent.LoadFailed(bidonErrorD));
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoBannerImpl", "Banner ad loaded successfully");
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }
    }

    public static final class b implements BannerAdShowListener {
        b() {
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoBannerImpl", "Banner ad clicked");
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            LogExtKt.logInfo("MolocoBannerImpl", "Banner ad show failed: " + molocoAdError.getDescription());
            d.this.emitEvent(new AdEvent.ShowFailed(org.bidon.moloco.ext.b.e(molocoAdError)));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoBannerImpl", "Banner ad shown successfully");
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(molocoAd.getRevenue() != null ? r8.floatValue() : 0.0d, "USD", Precision.Precise)));
            }
        }
    }

    private final b c() {
        return (b) this.f97516e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(d dVar, org.bidon.moloco.impl.a aVar, Banner banner, Throwable th2) {
        String message;
        if (banner != null) {
            dVar.f97514c = banner;
            banner.load(aVar.c(), dVar.f97515d);
        } else {
            DemandId demandIdA = org.bidon.moloco.a.a();
            if (th2 == null || (message = th2.getMessage()) == null) {
                message = "Created banner is null.";
            }
            dVar.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(demandIdA, null, message, 2, null)));
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f(d dVar) {
        return dVar.new b();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97513b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97513b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97513b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97513b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97513b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97513b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final org.bidon.moloco.impl.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MolocoBannerImpl", "Starting banner load with format: " + adParams.b());
        if (adParams.a() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId is required")));
        } else if (adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload is required")));
        } else {
            org.bidon.moloco.ext.b.b(Moloco.INSTANCE, adParams.b(), adParams.a(), new Function2() { // from class: org.bidon.moloco.impl.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(this.f97510b, adParams, (Banner) obj, (Throwable) obj2);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MolocoBannerImpl", "Destroying banner ad");
        Banner banner = this.f97514c;
        if (banner != null) {
            banner.setAdShowListener(null);
        }
        Banner banner2 = this.f97514c;
        if (banner2 != null) {
            banner2.destroy();
        }
        this.f97514c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97512a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97513b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97512a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        Banner banner = this.f97514c;
        if (banner == null) {
            return null;
        }
        banner.setAdShowListener(c());
        return new AdViewHolder(banner);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97513b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new n().c(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97513b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97513b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97513b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        Banner banner = this.f97514c;
        return banner != null && banner.isLoaded();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97513b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97513b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97513b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97513b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97513b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97513b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97513b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97513b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97513b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97513b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97513b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97513b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97513b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97513b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97513b.setTokenInfo(tokenInfo);
    }
}
