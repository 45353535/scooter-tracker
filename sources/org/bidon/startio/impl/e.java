package org.bidon.startio.impl;

import android.view.View;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.Pair;
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
import org.bidon.sdk.ads.banner.BannerFormat;
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

/* JADX INFO: loaded from: classes4.dex */
public final class e implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BannerStandard f97679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f97681e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97677a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97678b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f97682f = new a();

    public static final class a implements BannerListener {
        a() {
        }

        @Override // com.startapp.sdk.ads.banner.BannerListener
        public void onClick(View view) {
            LogExtKt.logInfo("StartIoBannerImpl", "Banner ad clicked");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.startapp.sdk.ads.banner.BannerListener
        public void onFailedToReceiveAd(View view) {
            e.this.f97680d = false;
            BannerStandard bannerStandard = e.this.f97679c;
            String str = "onFailedToReceiveAd: " + (bannerStandard != null ? bannerStandard.getErrorMessage() : null);
            LogExtKt.logInfo("StartIoBannerImpl", str);
            e.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(org.bidon.startio.a.a(), null, str, 2, null)));
        }

        @Override // com.startapp.sdk.ads.banner.BannerListener
        public void onImpression(View view) {
            LogExtKt.logInfo("StartIoBannerImpl", "Banner ad shown successfully");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e eVar = e.this;
                eVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(eVar.f97681e / 1000.0d, "USD", Precision.Estimated)));
            }
        }

        @Override // com.startapp.sdk.ads.banner.BannerListener
        public void onReceiveAd(View view) {
            e.this.f97680d = true;
            LogExtKt.logInfo("StartIoBannerImpl", "Banner ad loaded successfully");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97678b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97678b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97678b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97678b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97678b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97678b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(d adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        if (adParams.d() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        this.f97681e = adParams.getPrice();
        AdPreferences adPreferences = new AdPreferences();
        adPreferences.setAdTag(adParams.e());
        BannerStandard mrec = adParams.b() == BannerFormat.MRec ? new Mrec(adParams.a(), adPreferences, (BannerListener) this.f97682f) : new Banner(adParams.a(), adPreferences, this.f97682f);
        Pair pairC = adParams.c();
        mrec.loadAd(((Number) pairC.component1()).intValue(), ((Number) pairC.component2()).intValue(), adParams.d());
        this.f97679c = mrec;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        this.f97679c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97677a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97678b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97677a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        BannerStandard bannerStandard = this.f97679c;
        if (bannerStandard != null) {
            return new AdViewHolder(bannerStandard);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97678b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new c().c(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97678b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97678b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97678b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97679c != null && this.f97680d;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97678b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97678b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97678b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97678b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97678b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97678b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97678b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97678b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97678b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97678b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97678b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97678b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97678b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97678b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97678b.setTokenInfo(tokenInfo);
    }
}
