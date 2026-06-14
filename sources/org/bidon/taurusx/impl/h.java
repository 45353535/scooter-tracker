package org.bidon.taurusx.impl;

import android.app.Activity;
import com.taurusx.tax.api.OnTaurusXRewardListener;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.api.TaurusXRewardedAds;
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
public final class h implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TaurusXRewardedAds f97754c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97752a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97753b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnTaurusXRewardListener f97755d = new a();

    public static final class a implements OnTaurusXRewardListener {
        a() {
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdClicked() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad clicked");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdClosed() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad closed");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Closed(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdFailedToLoad(TaurusXAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad load failed: " + error.getMessage());
            h.this.emitEvent(new AdEvent.LoadFailed(org.bidon.taurusx.ext.a.a(error)));
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdLoaded() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad loaded successfully");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdShowFailed(TaurusXAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad show failed: " + error.getMessage());
            h.this.emitEvent(new AdEvent.ShowFailed(org.bidon.taurusx.ext.a.a(error)));
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onAdShown() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad shown successfully");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h hVar = h.this;
                hVar.emitEvent(new AdEvent.Shown(ad2));
                TaurusXRewardedAds taurusXRewardedAds = hVar.f97754c;
                hVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(taurusXRewardedAds != null ? ((double) taurusXRewardedAds.getPrice()) / 1000.0d : 0.0d, "USD", Precision.Precise)));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onRewardFailed() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad onRewardFailed: " + this);
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onRewarded(TaurusXRewardedAds.RewardItem rewardItem) {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad onRewarded: " + this);
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onVideoCompleted() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad video completed: " + this);
        }

        @Override // com.taurusx.tax.api.OnTaurusXRewardListener
        public void onVideoStart() {
            LogExtKt.logInfo("TaurusXRewardedImpl", "Rewarded ad video start: " + this);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97753b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97753b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97753b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97753b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97753b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void load(f adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("TaurusXRewardedImpl", "Starting Rewarded load");
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
        TaurusXRewardedAds taurusXRewardedAds = new TaurusXRewardedAds(adParams.b());
        this.f97754c = taurusXRewardedAds;
        taurusXRewardedAds.setAdUnitId(strA);
        taurusXRewardedAds.setListener(this.f97755d);
        if (bidType == bidType2) {
            taurusXRewardedAds.loadRewardFromBid(strC);
        } else {
            taurusXRewardedAds.loadReward();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97753b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        TaurusXRewardedAds taurusXRewardedAds = this.f97754c;
        if (taurusXRewardedAds != null) {
            taurusXRewardedAds.setListener(null);
        }
        this.f97754c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97752a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97753b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97752a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97753b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new c().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97753b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97753b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97753b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        TaurusXRewardedAds taurusXRewardedAds = this.f97754c;
        return taurusXRewardedAds != null && taurusXRewardedAds.isReady();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97753b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97753b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97753b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97753b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97753b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97753b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97753b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97753b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97753b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97753b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97753b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97753b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97753b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97753b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97753b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!isAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        TaurusXRewardedAds taurusXRewardedAds = this.f97754c;
        if (taurusXRewardedAds != null) {
            taurusXRewardedAds.showReward();
        }
    }
}
