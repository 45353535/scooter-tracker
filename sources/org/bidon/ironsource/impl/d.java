package org.bidon.ironsource.impl;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
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
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97327a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97328b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f97329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ISDemandOnlyBannerLayout f97330d;

    public static final class a implements ISDemandOnlyBannerListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f97332b;

        a(b bVar) {
            this.f97332b = bVar;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdClicked(String str) {
            LogExtKt.logInfo("IronSourceBannerImpl", "onBannerAdClicked: " + str + ", " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLeftApplication(String str) {
            LogExtKt.logInfo("IronSourceBannerImpl", "onBannerAdLeftApplication: " + str + ", " + this);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
            LogExtKt.logInfo("IronSourceBannerImpl", "onBannerAdLoadFailed: " + str + ", " + this);
            d.this.emitEvent(new AdEvent.LoadFailed(org.bidon.ironsource.impl.a.a(ironSourceError)));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdLoaded(String str) {
            LogExtKt.logInfo("IronSourceBannerImpl", "onBannerAdLoaded: " + str + ", " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
        public void onBannerAdShown(String str) {
            LogExtKt.logInfo("IronSourceBannerImpl", "onBannerAdShown: " + str + ", " + this);
            List listC = f.c();
            if (str == null) {
                return;
            }
            listC.add(str);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97332b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new b(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97328b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97328b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97328b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97328b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97328b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strC = adParams.c();
        this.f97329c = strC;
        if (strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "instanceId")));
            return;
        }
        if (f.c().contains(strC)) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "instanceId already loaded")));
            return;
        }
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(adParams.a(), adParams.b());
        this.f97330d = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
        iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(new a(adParams));
        IronSource.loadISDemandOnlyBanner(adParams.a(), iSDemandOnlyBannerLayoutCreateBannerForDemandOnly, strC);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97328b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        String str = this.f97329c;
        if (str != null) {
            IronSource.destroyISDemandOnlyBanner(str);
            List listC = f.c();
            b1.a(listC).remove(this.f97329c);
        }
        this.f97329c = null;
        this.f97330d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97327a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97328b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97327a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.f97330d;
        if (iSDemandOnlyBannerLayout != null) {
            return new AdViewHolder(iSDemandOnlyBannerLayout);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97328b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.ironsource.impl.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97328b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97328b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97328b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97330d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97328b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97328b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97328b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97328b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97328b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97328b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97328b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97328b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97328b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97328b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97328b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97328b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97328b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97328b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97328b.setTokenInfo(tokenInfo);
    }
}
