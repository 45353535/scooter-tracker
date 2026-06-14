package org.bidon.amazon.impl;

import android.app.Activity;
import android.view.View;
import com.amazon.device.ads.DTBActivityMonitor;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.SDKUtilities;
import com.amazon.device.ads.l0;
import com.ironsource.Df;
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
public final class d implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.bidon.amazon.b f97048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DTBAdInterstitial f97049d;

    public static final class a implements DTBAdInterstitialListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f97051b;

        a(h hVar) {
            this.f97051b = hVar;
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClicked(View view) {
            LogExtKt.logInfo("AmazonInterstitialImpl", Df.f40645f);
            d dVar = d.this;
            Ad ad2 = dVar.getAd();
            if (ad2 == null) {
                return;
            }
            dVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClosed(View view) {
            LogExtKt.logInfo("AmazonInterstitialImpl", Df.f40646g);
            d dVar = d.this;
            Ad ad2 = dVar.getAd();
            if (ad2 == null) {
                return;
            }
            dVar.emitEvent(new AdEvent.Closed(ad2));
            d.this.f97049d = null;
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public /* synthetic */ void onAdError(View view) {
            com.amazon.device.ads.a.a(this, view);
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdFailed(View view) {
            LogExtKt.logInfo("AmazonInterstitialImpl", "onAdFailed");
            d.this.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(d.this.getDemandId())));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLeftApplication(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLoaded(View view) {
            LogExtKt.logInfo("AmazonInterstitialImpl", "onAdLoaded");
            d dVar = d.this;
            Ad ad2 = dVar.getAd();
            if (ad2 == null) {
                return;
            }
            dVar.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdOpen(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onImpressionFired(View view) {
            LogExtKt.logInfo("AmazonInterstitialImpl", "onImpressionFired");
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d dVar = d.this;
                h hVar = this.f97051b;
                dVar.emitEvent(new AdEvent.Shown(ad2));
                dVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(hVar.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }

        @Override // com.amazon.device.ads.DTBAdVideoListener
        public void onVideoCompleted(View view) {
            l0.a(this, view);
            LogExtKt.logInfo("AmazonInterstitialImpl", "onVideoCompleted");
        }
    }

    public d(org.bidon.amazon.b bidManager) {
        Intrinsics.checkNotNullParameter(bidManager, "bidManager");
        this.f97046a = new AdEventFlowImpl();
        this.f97047b = new StatisticsCollectorImpl();
        this.f97048c = bidManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new h(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97047b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97047b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97047b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97047b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97047b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97047b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(h adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "slotUuid")));
            return;
        }
        DTBAdResponse dTBAdResponseJ = this.f97048c.j(strB);
        if (dTBAdResponseJ == null) {
            BidonError.NoBid noBid = BidonError.NoBid.INSTANCE;
            LogExtKt.logError("AmazonInterstitialImpl", "DTBAdResponse is null", noBid);
            emitEvent(new AdEvent.LoadFailed(noBid));
        } else {
            DTBActivityMonitor.INSTANCE.setActivity(adParams.a());
            DTBAdInterstitial dTBAdInterstitial = new DTBAdInterstitial(adParams.a(), new a(adParams));
            this.f97049d = dTBAdInterstitial;
            dTBAdInterstitial.fetchAd(SDKUtilities.getBidInfo(dTBAdResponseJ));
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        this.f97049d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97046a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97047b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97046a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97047b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.amazon.impl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.c((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97047b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97047b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97047b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97049d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97047b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97047b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97047b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97047b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97047b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97047b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97047b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97047b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97047b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97047b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97047b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97047b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97047b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97047b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97047b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DTBAdInterstitial dTBAdInterstitial = this.f97049d;
        if (dTBAdInterstitial != null) {
            dTBAdInterstitial.show();
            return;
        }
        BidonError.AdNotReady adNotReady = BidonError.AdNotReady.INSTANCE;
        LogExtKt.logError("AmazonInterstitialImpl", "Interstitial is null", adNotReady);
        emitEvent(new AdEvent.LoadFailed(adNotReady));
    }
}
