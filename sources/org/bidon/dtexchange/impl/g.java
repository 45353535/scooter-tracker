package org.bidon.dtexchange.impl;

import android.app.Activity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97264a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97265b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdUnit f97266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InneractiveAdSpot f97267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f97268e;

    public static final class a implements InneractiveFullscreenAdEventsListenerWithImpressionData {
        a() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            LogExtKt.logInfo("DTExchangeInterstitial", "onAdClicked: " + inneractiveAdSpot);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            LogExtKt.logInfo("DTExchangeInterstitial", "onAdDismissed: " + inneractiveAdSpot);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Closed(ad2));
            }
            g.this.f97267d = null;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
            LogExtKt.logInfo("DTExchangeInterstitial", "onAdEnteredErrorState: " + inneractiveAdSpot + ", " + adDisplayError);
            g.this.emitEvent(new AdEvent.ShowFailed(org.bidon.dtexchange.ext.a.a(adDisplayError)));
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
            AdValue adValueA;
            LogExtKt.logInfo("DTExchangeInterstitial", "onAdImpression: " + inneractiveAdSpot);
            if (impressionData == null || (adValueA = org.bidon.dtexchange.ext.c.a(impressionData)) == null) {
                return;
            }
            g.this.f97268e = impressionData.getDemandSource();
            g gVar = g.this;
            gVar.setDsp(gVar.f97268e);
            Ad ad2 = g.this.getAd();
            if (ad2 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.PaidRevenue(ad2, adValueA));
            g.this.emitEvent(new AdEvent.Shown(ad2));
        }
    }

    public static final class b implements InneractiveAdSpot.RequestListener {
        b() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            BidonError bidonErrorA = org.bidon.dtexchange.ext.d.a(inneractiveErrorCode);
            LogExtKt.logError("DTExchangeInterstitial", "onInneractiveFailedAdRequest: " + inneractiveErrorCode, bidonErrorA);
            g.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            LogExtKt.logInfo("DTExchangeInterstitial", "onInneractiveSuccessfulAdRequest: " + inneractiveAdSpot);
            g.this.f97267d = inneractiveAdSpot;
            g gVar = g.this;
            String mediationNameString = gVar.f97268e;
            if (mediationNameString == null) {
                mediationNameString = inneractiveAdSpot != null ? inneractiveAdSpot.getMediationNameString() : null;
            }
            gVar.setDsp(mediationNameString);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.dtexchange.impl.a e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.dtexchange.impl.a(auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97265b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97265b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97265b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97265b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97265b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97265b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f97267d;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f97267d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97264a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.dtexchange.impl.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("DTExchangeInterstitial", "Starting with " + adParams + ": " + this);
        String strA = adParams.a();
        if (strA == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "spotId")));
            return;
        }
        this.f97266c = adParams.getAdUnit();
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        inneractiveFullscreenUnitController.addContentController(new InneractiveFullscreenVideoContentController());
        inneractiveFullscreenUnitController.setEventsListener(new a());
        inneractiveAdSpotCreateSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(strA);
        inneractiveAdSpotCreateSpot.setRequestListener(new b());
        inneractiveAdSpotCreateSpot.requestAd(inneractiveAdRequest);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97265b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97264a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97265b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.dtexchange.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97265b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97265b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97265b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        InneractiveAdSpot inneractiveAdSpot = this.f97267d;
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97265b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97265b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97265b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97265b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97265b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97265b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97265b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97265b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97265b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97265b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97265b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97265b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97265b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97265b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97265b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InneractiveAdSpot inneractiveAdSpot = this.f97267d;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot != null ? inneractiveAdSpot.getSelectedUnitController() : null;
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        InneractiveAdSpot inneractiveAdSpot2 = this.f97267d;
        if (inneractiveAdSpot2 == null || !inneractiveAdSpot2.isReady() || inneractiveFullscreenUnitController == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            inneractiveFullscreenUnitController.show(activity);
        }
    }
}
