package org.bidon.meta.impl;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
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

/* JADX INFO: loaded from: classes8.dex */
public final class g implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97403a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97404b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f97405c;

    public static final class a implements InterstitialAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97407b;

        a(e eVar) {
            this.f97407b = eVar;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            LogExtKt.logInfo("MetaInterstitialImpl", "onAdClicked: " + this);
            org.bidon.sdk.ads.Ad ad3 = g.this.getAd();
            if (ad3 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Clicked(ad3));
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            LogExtKt.logInfo("MetaInterstitialImpl", "onAdLoaded " + ad2 + ": " + g.this.f97405c + ", " + this);
            org.bidon.sdk.ads.Ad ad3 = g.this.getAd();
            if (g.this.f97405c == null || ad3 == null) {
                g.this.emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            } else {
                g.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            LogExtKt.logInfo("MetaInterstitialImpl", "Error while loading ad(" + (adError != null ? Integer.valueOf(adError.getErrorCode()) : null) + ": " + (adError != null ? adError.getErrorMessage() : null) + "). " + this);
            g.this.emitEvent(new AdEvent.LoadFailed(org.bidon.meta.ext.a.a(adError)));
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            LogExtKt.logInfo("MetaInterstitialImpl", "onInterstitialDismissed " + ad2 + ": " + this);
            org.bidon.sdk.ads.Ad ad3 = g.this.getAd();
            if (ad3 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Closed(ad3));
            g.this.f97405c = null;
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
            LogExtKt.logInfo("MetaInterstitialImpl", "onInterstitialDisplayed " + ad2 + ": " + this);
            org.bidon.sdk.ads.Ad ad3 = g.this.getAd();
            if (ad3 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Shown(ad3));
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            LogExtKt.logInfo("MetaInterstitialImpl", "onAdImpression: " + this);
            org.bidon.sdk.ads.Ad ad3 = g.this.getAd();
            if (ad3 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.PaidRevenue(ad3, new AdValue(this.f97407b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        Context applicationContext = auctionParamsScope.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new e(applicationContext, auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97404b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97404b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97404b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97404b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97404b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97404b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InterstitialAd interstitialAd = this.f97405c;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.f97405c = null;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        if (adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        if (adParams.getAdUnit().getBidType() == BidType.RTB && adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(adParams.a(), adParams.c());
        this.f97405c = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new a(adParams)).withBid(adParams.b()).build());
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97403a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public org.bidon.sdk.ads.Ad getAd() {
        return this.f97404b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97403a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97404b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.meta.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.d((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97404b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97404b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97404b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        InterstitialAd interstitialAd = this.f97405c;
        if (interstitialAd != null) {
            return interstitialAd.isAdLoaded();
        }
        return false;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97404b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97404b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97404b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97404b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97404b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97404b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97404b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97404b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97404b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97404b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97404b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97404b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97404b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97404b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97404b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterstitialAd interstitialAd = this.f97405c;
        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            interstitialAd.show();
        }
    }
}
