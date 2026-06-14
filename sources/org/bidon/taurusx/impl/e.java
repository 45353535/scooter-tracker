package org.bidon.taurusx.impl;

import android.view.View;
import com.taurusx.tax.api.OnTaurusXBannerListener;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.api.TaurusXBannerAds;
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
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97736a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97737b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaurusXBannerAds f97738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97739d;

    public static final class a implements OnTaurusXBannerListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TaurusXBannerAds f97741b;

        a(TaurusXBannerAds taurusXBannerAds) {
            this.f97741b = taurusXBannerAds;
        }

        @Override // com.taurusx.tax.api.OnTaurusXBannerListener
        public void onAdClicked() {
            LogExtKt.logInfo("TaurusXBannerImpl", "Banner ad clicked");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXBannerListener
        public void onAdClosed() {
            LogExtKt.logInfo("TaurusXBannerImpl", "Banner ad closed");
        }

        @Override // com.taurusx.tax.api.OnTaurusXBannerListener
        public void onAdFailedToLoad(TaurusXAdError taurusXAdError) {
            LogExtKt.logInfo("TaurusXBannerImpl", "Banner ad load failed: " + (taurusXAdError != null ? taurusXAdError.getMessage() : null));
            e.this.f97739d = false;
            e.this.emitEvent(new AdEvent.LoadFailed(org.bidon.taurusx.ext.a.a(taurusXAdError)));
        }

        @Override // com.taurusx.tax.api.OnTaurusXBannerListener
        public void onAdLoaded() {
            e.this.f97739d = true;
            LogExtKt.logInfo("TaurusXBannerImpl", "Banner ad loaded successfully");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXBannerListener
        public void onAdShown() {
            LogExtKt.logInfo("TaurusXBannerImpl", "Banner ad shown successfully");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(((double) this.f97741b.getPrice()) / 1000.0d, "USD", Precision.Precise)));
            }
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97737b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97737b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97737b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97737b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97737b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void load(d adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("TaurusXBannerImpl", "Starting banner load with format: " + adParams.c());
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId is required")));
            return;
        }
        BidType bidType = adParams.getAdUnit().getBidType();
        String strD = adParams.d();
        BidType bidType2 = BidType.RTB;
        if (bidType == bidType2 && strD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload is required")));
            return;
        }
        TaurusXBannerAds taurusXBannerAds = new TaurusXBannerAds(adParams.a());
        this.f97738c = taurusXBannerAds;
        taurusXBannerAds.setAdUnitId(strB);
        taurusXBannerAds.setAdSize(adParams.c());
        taurusXBannerAds.setListener(new a(taurusXBannerAds));
        if (bidType == bidType2) {
            taurusXBannerAds.loadBannerFromBid(strD);
        } else {
            taurusXBannerAds.loadBanner();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97737b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        TaurusXBannerAds taurusXBannerAds = this.f97738c;
        if (taurusXBannerAds != null) {
            taurusXBannerAds.destroy();
        }
        this.f97738c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97736a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97737b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97736a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        TaurusXBannerAds taurusXBannerAds = this.f97738c;
        if (taurusXBannerAds == null) {
            return null;
        }
        View adView = taurusXBannerAds.getAdView();
        Intrinsics.checkNotNullExpressionValue(adView, "getAdView(...)");
        return new AdViewHolder(adView);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97737b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new c().c(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97737b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97737b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97737b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97738c != null && this.f97739d;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97737b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97737b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97737b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97737b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97737b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97737b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97737b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97737b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97737b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97737b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97737b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97737b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97737b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97737b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97737b.setTokenInfo(tokenInfo);
    }
}
