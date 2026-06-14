package org.bidon.vkads.impl;

import android.app.Activity;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.my.target.ads.InterstitialAd;
import com.my.target.common.models.IAdLoadingError;
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

/* JADX INFO: loaded from: classes4.dex */
public final class e implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97807a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97808b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f97809c;

    public static final class a implements InterstitialAd.InterstitialAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f97811b;

        a(c cVar) {
            this.f97811b = cVar;
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onClick(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onClick: " + this);
            e eVar = e.this;
            Ad ad2 = eVar.getAd();
            if (ad2 == null) {
                return;
            }
            eVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDismiss(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onDismiss: " + this);
            e eVar = e.this;
            Ad ad2 = eVar.getAd();
            if (ad2 == null) {
                return;
            }
            eVar.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onDisplay(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onDisplay: " + this);
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e eVar = e.this;
                c cVar = this.f97811b;
                eVar.emitEvent(new AdEvent.Shown(ad2));
                eVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(cVar.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onFailedToShow(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onFailedToShow: " + this);
            e.this.emitEvent(new AdEvent.ShowFailed(new BidonError.Unspecified(e.this.getDemandId(), null, null, 6, null)));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onLoad(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onLoad: " + this);
            e eVar = e.this;
            Ad ad2 = eVar.getAd();
            if (ad2 == null) {
                return;
            }
            eVar.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onNoAd(IAdLoadingError error, InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onNoAd: " + error.getCode() + " " + error.getMessage() + ". " + this);
            e.this.emitEvent(new AdEvent.LoadFailed(org.bidon.vkads.ext.a.b(error, null, 1, null)));
        }

        @Override // com.my.target.ads.InterstitialAd.InterstitialAdListener
        public void onVideoCompleted(InterstitialAd interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("VkAdsInterstitialImpl", "onVideoCompleted: " + this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b(AdAuctionParamSource adAuctionParamSource, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new c(adAuctionParamSource.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97808b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97808b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97808b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97808b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97808b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        Integer numD = adParams.d();
        if (numD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(numD.intValue(), adParams.a());
        this.f97809c = interstitialAd;
        interstitialAd.getCustomParams().setCustomParam("mediation", adParams.c());
        interstitialAd.setListener(new a(adParams));
        if (adParams.getAdUnit().getBidType() != BidType.RTB) {
            interstitialAd.load();
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "bidId")));
        } else {
            interstitialAd.loadFromBid(strB);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97808b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InterstitialAd interstitialAd = this.f97809c;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.f97809c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97807a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97808b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97807a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97808b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(final AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.vkads.impl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b(auctionParamsScope, (AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97808b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97808b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97808b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97809c != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97808b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97808b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97808b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97808b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97808b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97808b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97808b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97808b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97808b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97808b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97808b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97808b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97808b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97808b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97808b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterstitialAd interstitialAd = this.f97809c;
        if (interstitialAd != null) {
            interstitialAd.show();
        } else {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        }
    }
}
