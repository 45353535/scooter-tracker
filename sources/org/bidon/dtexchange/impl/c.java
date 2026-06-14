package org.bidon.dtexchange.impl;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.dtexchange.impl.c;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97249a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97250b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InneractiveAdSpot f97251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AdViewHolder f97252d;

    public static final class a implements InneractiveAdViewEventsListenerWithImpressionData {
        a() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            LogExtKt.logInfo("DTExchangeBanner", "onAdClicked: " + inneractiveAdSpot);
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
        public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
            BidonError.Unspecified unspecifiedA = org.bidon.dtexchange.ext.a.a(adDisplayError);
            LogExtKt.logError("DTExchangeBanner", "onAdEnteredErrorState: " + inneractiveAdSpot + ", " + adDisplayError, unspecifiedA);
            c.this.emitEvent(new AdEvent.ShowFailed(unspecifiedA));
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
        public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
        public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot, ImpressionData impressionData) {
            AdValue adValueA;
            LogExtKt.logInfo("DTExchangeBanner", "onAdImpression: " + inneractiveAdSpot + ", " + impressionData);
            if (impressionData == null || (adValueA = org.bidon.dtexchange.ext.c.a(impressionData)) == null) {
                return;
            }
            c.this.setDsp(impressionData.getDemandSource());
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.PaidRevenue(ad2, adValueA));
        }
    }

    public static final class b implements InneractiveAdSpot.RequestListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97255b;

        b(e eVar) {
            this.f97255b = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(c cVar, InneractiveAdSpot inneractiveAdSpot, e eVar) {
            cVar.d(inneractiveAdSpot, eVar);
            Ad ad2 = cVar.getAd();
            if (ad2 != null) {
                cVar.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            LogExtKt.logInfo("DTExchangeBanner", "onInneractiveFailedAdRequest: " + inneractiveErrorCode);
            c.this.emitEvent(new AdEvent.LoadFailed(org.bidon.dtexchange.ext.d.a(inneractiveErrorCode)));
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(final InneractiveAdSpot inneractiveAdSpot) {
            LogExtKt.logInfo("DTExchangeBanner", "onInneractiveSuccessfulAdRequest: " + inneractiveAdSpot);
            c.this.f97251c = inneractiveAdSpot;
            Activity activityA = this.f97255b.a();
            final c cVar = c.this;
            final e eVar = this.f97255b;
            activityA.runOnUiThread(new Runnable() { // from class: org.bidon.dtexchange.impl.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.b(cVar, inneractiveAdSpot, eVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdViewHolder d(InneractiveAdSpot inneractiveAdSpot, e eVar) {
        Context applicationContext;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot != null ? inneractiveAdSpot.getSelectedUnitController() : null;
        InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController == null || (applicationContext = eVar.a().getApplicationContext()) == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(applicationContext);
        inneractiveAdViewUnitController.setEventsListener(new a());
        inneractiveAdViewUnitController.bindView(frameLayout);
        AdViewHolder adViewHolder = new AdViewHolder(frameLayout);
        this.f97252d = adViewHolder;
        return adViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        AdUnit adUnit = auctionParamsScope.getAdUnit();
        return new e(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), adUnit);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97250b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97250b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97250b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97250b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97250b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97250b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f97251c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.setRequestListener(null);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f97251c;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
        }
        this.f97251c = null;
        this.f97252d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97249a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("DTExchangeBanner", "Starting with " + adParams);
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "spotId")));
            return;
        }
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        inneractiveAdSpotCreateSpot.addUnitController(new InneractiveAdViewUnitController());
        InneractiveAdRequest inneractiveAdRequest = new InneractiveAdRequest(strB);
        inneractiveAdSpotCreateSpot.setRequestListener(new b(adParams));
        inneractiveAdSpotCreateSpot.requestAd(inneractiveAdRequest);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97250b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97249a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        return this.f97252d;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97250b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.dtexchange.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97250b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97250b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97250b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        InneractiveAdSpot inneractiveAdSpot = this.f97251c;
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97250b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97250b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97250b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97250b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97250b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97250b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97250b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97250b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97250b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97250b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97250b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97250b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97250b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97250b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97250b.setTokenInfo(tokenInfo);
    }
}
