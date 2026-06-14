package org.bidon.vungle.impl;

import com.vungle.ads.Ad;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.VungleError;
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
public final class d implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97839a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97840b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BannerAd f97841c;

    public static final class a implements BaseAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.bidon.vungle.impl.a f97843b;

        a(org.bidon.vungle.impl.a aVar) {
            this.f97843b = aVar;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdClicked: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdEnd: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logError("VungleBannerImpl", "onAdFailedToLoad placementId=" + baseAd.getPlacementId() + ". " + this, adError);
            d.this.emitEvent(new AdEvent.LoadFailed(org.bidon.vungle.ext.a.a(adError)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logError("VungleBannerImpl", "onAdFailedToPlay: " + this, adError);
            d.this.emitEvent(new AdEvent.ShowFailed(org.bidon.vungle.ext.a.a(adError)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdImpression: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97843b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdLeftApplication: " + this);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdLoaded placementId=" + baseAd.getPlacementId() + ". " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 == null) {
                return;
            }
            d.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleBannerImpl", "onAdStart: " + this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.vungle.impl.a c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.vungle.impl.a(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(org.bidon.vungle.impl.a aVar, String str, d dVar) throws Throwable {
        BannerAd bannerAd = new BannerAd(aVar.a(), str, aVar.b());
        dVar.f97841c = bannerAd;
        bannerAd.setAdListener(dVar.new a(aVar));
        if (aVar.getAdUnit().getBidType() != BidType.RTB) {
            Ad.DefaultImpls.load$default(bannerAd, null, 1, null);
            return;
        }
        String strC = aVar.c();
        if (strC == null) {
            dVar.emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(dVar.getDemandId(), "payload")));
        } else {
            bannerAd.load(strC);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97840b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97840b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97840b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97840b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97840b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97840b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final org.bidon.vungle.impl.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("VungleBannerImpl", "Starting with " + adParams + ": " + this);
        final String strD = adParams.d();
        if (strD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
        } else {
            adParams.a().runOnUiThread(new Runnable() { // from class: org.bidon.vungle.impl.c
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    d.e(adParams, strD, this);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        BannerAd bannerAd = this.f97841c;
        if (bannerAd != null) {
            bannerAd.finishAd();
        }
        BannerAd bannerAd2 = this.f97841c;
        if (bannerAd2 != null) {
            bannerAd2.setAdListener(null);
        }
        this.f97841c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97839a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public org.bidon.sdk.ads.Ad getAd() {
        return this.f97840b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97839a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        BannerView bannerView;
        BannerAd bannerAd = this.f97841c;
        if (bannerAd == null || (bannerView = bannerAd.getBannerView()) == null) {
            return null;
        }
        return new AdViewHolder(bannerView);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97840b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.vungle.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.c((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97840b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97840b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97840b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        BannerAd bannerAd = this.f97841c;
        return bannerAd != null && bannerAd.canPlayAd().booleanValue();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97840b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97840b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97840b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97840b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97840b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97840b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97840b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97840b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97840b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97840b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97840b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97840b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97840b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97840b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97840b.setTokenInfo(tokenInfo);
    }
}
