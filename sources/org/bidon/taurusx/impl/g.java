package org.bidon.taurusx.impl;

import android.app.Activity;
import com.taurusx.tax.api.OnTaurusXInterstitialListener;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.api.TaurusXInterstitialAds;
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
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaurusXInterstitialAds f97749c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97747a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97748b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnTaurusXInterstitialListener f97750d = new a();

    public static final class a implements OnTaurusXInterstitialListener {
        a() {
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdClicked() {
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad clicked");
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdClosed() {
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad closed");
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Closed(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdFailedToLoad(TaurusXAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad load failed: " + error.getMessage());
            g.this.emitEvent(new AdEvent.LoadFailed(org.bidon.taurusx.ext.a.a(error)));
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdLoaded() {
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad loaded successfully");
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdShowFailed(TaurusXAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad show failed: " + error.getMessage());
            g.this.emitEvent(new AdEvent.ShowFailed(org.bidon.taurusx.ext.a.a(error)));
        }

        @Override // com.taurusx.tax.api.OnTaurusXInterstitialListener
        public void onAdShown() {
            LogExtKt.logInfo("TaurusXInterstitialImpl", "Interstitial ad shown successfully");
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g gVar = g.this;
                gVar.emitEvent(new AdEvent.Shown(ad2));
                TaurusXInterstitialAds taurusXInterstitialAds = gVar.f97749c;
                gVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(taurusXInterstitialAds != null ? ((double) taurusXInterstitialAds.getPrice()) / 1000.0d : 0.0d, "USD", Precision.Precise)));
            }
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97748b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97748b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97748b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97748b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97748b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void load(f adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("TaurusXInterstitialImpl", "Starting interstitial load");
        String strA = adParams.a();
        if (strA == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId is required")));
            return;
        }
        BidType bidType = adParams.getAdUnit().getBidType();
        String strC = adParams.c();
        BidType bidType2 = BidType.RTB;
        if (bidType == bidType2 && strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload is required")));
            return;
        }
        TaurusXInterstitialAds taurusXInterstitialAds = new TaurusXInterstitialAds(adParams.b());
        this.f97749c = taurusXInterstitialAds;
        taurusXInterstitialAds.setAdUnitId(strA);
        taurusXInterstitialAds.setListener(this.f97750d);
        if (bidType == bidType2) {
            taurusXInterstitialAds.loadInterstitialFromBid(strC);
        } else {
            taurusXInterstitialAds.loadInterstitial();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97748b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        TaurusXInterstitialAds taurusXInterstitialAds = this.f97749c;
        if (taurusXInterstitialAds != null) {
            taurusXInterstitialAds.destroy();
        }
        this.f97749c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97747a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97748b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97747a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97748b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new c().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97748b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97748b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97748b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        TaurusXInterstitialAds taurusXInterstitialAds = this.f97749c;
        return taurusXInterstitialAds != null && taurusXInterstitialAds.isReady();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97748b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97748b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97748b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97748b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97748b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97748b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97748b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97748b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97748b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97748b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97748b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97748b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97748b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97748b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97748b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!isAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        TaurusXInterstitialAds taurusXInterstitialAds = this.f97749c;
        if (taurusXInterstitialAds != null) {
            taurusXInterstitialAds.show();
        }
    }
}
