package org.bidon.amazon.impl;

import android.view.View;
import com.amazon.device.ads.DTBActivityMonitor;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.SDKUtilities;
import com.ironsource.Df;
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
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.bidon.amazon.b f97042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DTBAdView f97043d;

    public static final class a implements DTBAdBannerListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f97045b;

        a(g gVar) {
            this.f97045b = gVar;
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClicked(View view) {
            LogExtKt.logInfo("AmazonBannerImpl", Df.f40645f);
            b bVar = b.this;
            Ad ad2 = bVar.getAd();
            if (ad2 == null) {
                return;
            }
            bVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdClosed(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public /* synthetic */ void onAdError(View view) {
            com.amazon.device.ads.a.a(this, view);
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdFailed(View view) {
            LogExtKt.logInfo("AmazonBannerImpl", "onAdFailed");
            b.this.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(b.this.getDemandId())));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLeftApplication(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdLoaded(View view) {
            LogExtKt.logInfo("AmazonBannerImpl", "onAdLoaded");
            b bVar = b.this;
            Ad ad2 = bVar.getAd();
            if (ad2 == null) {
                return;
            }
            bVar.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onAdOpen(View view) {
        }

        @Override // com.amazon.device.ads.DTBAdListener
        public void onImpressionFired(View view) {
            LogExtKt.logInfo("AmazonBannerImpl", "onImpressionFired");
            b bVar = b.this;
            Ad ad2 = bVar.getAd();
            if (ad2 == null) {
                return;
            }
            bVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97045b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }
    }

    public b(org.bidon.amazon.b bidManager) {
        Intrinsics.checkNotNullParameter(bidManager, "bidManager");
        this.f97040a = new AdEventFlowImpl();
        this.f97041b = new StatisticsCollectorImpl();
        this.f97042c = bidManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new g(auctionParamsScope.getBannerFormat(), auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97041b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97041b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97041b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97041b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97041b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(g adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "slotUuid")));
            return;
        }
        DTBAdResponse dTBAdResponseJ = this.f97042c.j(strB);
        if (dTBAdResponseJ == null) {
            BidonError.NoBid noBid = BidonError.NoBid.INSTANCE;
            LogExtKt.logError("AmazonBannerImpl", "DTBAdResponse is null", noBid);
            emitEvent(new AdEvent.LoadFailed(noBid));
        } else {
            DTBActivityMonitor.INSTANCE.setActivity(adParams.a());
            DTBAdView dTBAdView = new DTBAdView(adParams.a().getApplicationContext(), new a(adParams));
            this.f97043d = dTBAdView;
            dTBAdView.fetchAd(SDKUtilities.getBidInfo(dTBAdResponseJ));
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97041b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        DTBAdView dTBAdView = this.f97043d;
        if (dTBAdView != null) {
            dTBAdView.destroy();
        }
        this.f97043d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97040a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97041b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97040a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        DTBAdView dTBAdView = this.f97043d;
        if (dTBAdView != null) {
            return new AdViewHolder(dTBAdView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97041b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.amazon.impl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97041b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97041b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97041b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97043d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97041b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97041b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97041b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97041b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97041b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97041b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97041b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97041b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97041b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97041b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97041b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97041b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97041b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97041b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97041b.setTokenInfo(tokenInfo);
    }
}
