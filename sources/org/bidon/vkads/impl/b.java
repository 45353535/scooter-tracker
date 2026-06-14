package org.bidon.vkads.impl;

import com.ironsource.adapters.bigo.BigoAdapter;
import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;
import kotlin.jvm.functions.Function1;
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
public final class b implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97795a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97796b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MyTargetView f97797c;

    public static final class a implements MyTargetView.MyTargetViewListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f97799b;

        a(h hVar) {
            this.f97799b = hVar;
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onClick(MyTargetView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            LogExtKt.logInfo("VkAdsBannerImpl", "onClick: " + this);
            b bVar = b.this;
            Ad ad2 = bVar.getAd();
            if (ad2 == null) {
                return;
            }
            bVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onLoad(MyTargetView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            LogExtKt.logInfo("VkAdsBannerImpl", "onLoad: " + this);
            b bVar = b.this;
            Ad ad2 = bVar.getAd();
            if (ad2 == null) {
                return;
            }
            bVar.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onNoAd(IAdLoadingError error, MyTargetView adView) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(adView, "adView");
            LogExtKt.logInfo("VkAdsBannerImpl", "onNoAd: " + error.getCode() + " " + error.getMessage() + ". " + this);
            b.this.emitEvent(new AdEvent.LoadFailed(org.bidon.vkads.ext.a.a(error, this.f97799b.b())));
        }

        @Override // com.my.target.ads.MyTargetView.MyTargetViewListener
        public void onShow(MyTargetView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            LogExtKt.logInfo("VkAdsBannerImpl", "onShow: " + this);
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97799b.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(AdAuctionParamSource adAuctionParamSource, AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new h(adAuctionParamSource.getActivity(), auctionParamsScope.getBannerFormat(), adAuctionParamSource.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97796b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97796b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97796b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97796b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97796b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(h adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        Integer numE = adParams.e();
        if (numE == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        int iIntValue = numE.intValue();
        MyTargetView myTargetView = new MyTargetView(adParams.a());
        this.f97797c = myTargetView;
        myTargetView.setAdSize(org.bidon.vkads.ext.a.c(adParams.b()));
        myTargetView.setSlotId(iIntValue);
        myTargetView.setRefreshAd(false);
        myTargetView.getCustomParams().setCustomParam("mediation", adParams.d());
        myTargetView.setListener(new a(adParams));
        if (adParams.getAdUnit().getBidType() != BidType.RTB) {
            myTargetView.load();
            return;
        }
        String strC = adParams.c();
        if (strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "bidId")));
        } else {
            myTargetView.loadFromBid(strC);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97796b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        MyTargetView myTargetView = this.f97797c;
        if (myTargetView != null) {
            myTargetView.destroy();
        }
        this.f97797c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97795a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97796b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97795a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        MyTargetView myTargetView = this.f97797c;
        if (myTargetView != null) {
            return new AdViewHolder(myTargetView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97796b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(final AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.vkads.impl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b(auctionParamsScope, (AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97796b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97796b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97796b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97797c != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97796b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97796b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97796b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97796b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97796b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97796b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97796b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97796b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97796b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97796b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97796b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97796b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97796b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97796b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97796b.setTokenInfo(tokenInfo);
    }
}
