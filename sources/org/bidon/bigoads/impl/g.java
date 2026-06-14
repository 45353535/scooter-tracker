package org.bidon.bigoads.impl;

import android.app.Activity;
import com.ironsource.adapters.bigo.BigoAdapter;
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
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.InterstitialAdLoader;
import sg.bigo.ads.api.InterstitialAdRequest;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97197a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97198b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f97199c;

    public static final class a implements AdInteractionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97201b;

        a(e eVar) {
            this.f97201b = eVar;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            LogExtKt.logInfo("BigoAdsInterstitial", "onAdClicked: " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
            LogExtKt.logInfo("BigoAdsInterstitial", "onAdClosed: " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Closed(ad2));
            }
            g.this.f97199c = null;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(AdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(error);
            LogExtKt.logError("BigoAdsInterstitial", "onAdError: " + this, bidonErrorA);
            g.this.emitEvent(new AdEvent.ShowFailed(bidonErrorA));
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            LogExtKt.logInfo("BigoAdsInterstitial", "onAdImpression: " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97201b.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
            LogExtKt.logInfo("BigoAdsInterstitial", "onAdOpened: " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Shown(ad2));
            }
        }
    }

    public static final class b implements AdLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97203b;

        b(e eVar) {
            this.f97203b = eVar;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BigoAdsInterstitial", "onAdLoaded: " + interstitialAd + ", " + this);
            g.this.f97199c = interstitialAd;
            g.this.d(interstitialAd, this.f97203b);
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(adError);
            LogExtKt.logError("BigoAdsInterstitial", "Error while loading ad: " + adError.getCode() + " " + adError.getMessage() + ". " + this, bidonErrorA);
            g.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(InterstitialAd interstitialAd, e eVar) {
        interstitialAd.setAdInteractionListener(new a(eVar));
        Ad ad2 = getAd();
        if (ad2 != null) {
            emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new e(auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97198b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97198b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97198b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97198b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97198b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97198b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InterstitialAd interstitialAd = this.f97199c;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.f97199c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97197a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        InterstitialAdLoader interstitialAdLoaderBuild = new InterstitialAdLoader.Builder().withAdLoadListener((AdLoadListener<InterstitialAd>) new b(adParams)).build();
        Intrinsics.checkNotNullExpressionValue(interstitialAdLoaderBuild, "build(...)");
        InterstitialAdRequest.Builder builder = new InterstitialAdRequest.Builder();
        if (adParams.getAdUnit().getBidType() == BidType.RTB) {
            String strA = adParams.a();
            if (strA == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
                return;
            }
            builder.withBid(strA);
        }
        builder.withSlotId(strB);
        interstitialAdLoaderBuild.loadAd(builder.build());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97198b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97197a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97198b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.bigoads.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97198b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97198b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97198b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        InterstitialAd interstitialAd = this.f97199c;
        return (interstitialAd == null || interstitialAd.isExpired()) ? false : true;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97198b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97198b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97198b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97198b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97198b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97198b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97198b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97198b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97198b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97198b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97198b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97198b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97198b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97198b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97198b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterstitialAd interstitialAd = this.f97199c;
        if (interstitialAd == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            interstitialAd.show();
        }
    }
}
