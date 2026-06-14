package org.bidon.bigoads.impl;

import android.view.View;
import com.ironsource.adapters.bigo.BigoAdapter;
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
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;
import sg.bigo.ads.api.BannerAdLoader;
import sg.bigo.ads.api.BannerAdRequest;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97186a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97187b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BannerAd f97188c;

    public static final class a implements AdLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.bidon.bigoads.impl.a f97190b;

        /* JADX INFO: renamed from: org.bidon.bigoads.impl.d$a$a, reason: collision with other inner class name */
        public static final class C1124a implements AdInteractionListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f97191a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ org.bidon.bigoads.impl.a f97192b;

            C1124a(d dVar, org.bidon.bigoads.impl.a aVar) {
                this.f97191a = dVar;
                this.f97192b = aVar;
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public void onAdClicked() {
                LogExtKt.logInfo("BigoAdsBanner", "onAdClicked: " + this);
                Ad ad2 = this.f97191a.getAd();
                if (ad2 != null) {
                    this.f97191a.emitEvent(new AdEvent.Clicked(ad2));
                }
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public void onAdClosed() {
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public void onAdError(AdError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(error);
                LogExtKt.logError("BigoAdsBanner", "onAdError: " + this, bidonErrorA);
                this.f97191a.emitEvent(new AdEvent.ShowFailed(bidonErrorA));
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public void onAdImpression() {
                LogExtKt.logInfo("BigoAdsBanner", "onAdImpression: " + this);
                Ad ad2 = this.f97191a.getAd();
                if (ad2 != null) {
                    this.f97191a.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97192b.getPrice() / 1000.0d, "USD", Precision.Precise)));
                }
            }

            @Override // sg.bigo.ads.api.AdInteractionListener
            public void onAdOpened() {
            }
        }

        a(org.bidon.bigoads.impl.a aVar) {
            this.f97190b = aVar;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(BannerAd bannerAd) {
            Intrinsics.checkNotNullParameter(bannerAd, "bannerAd");
            LogExtKt.logInfo("BigoAdsBanner", "onAdLoaded: " + bannerAd + ", " + this);
            d.this.f97188c = bannerAd;
            bannerAd.setAdInteractionListener(new C1124a(d.this, this.f97190b));
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(adError);
            LogExtKt.logError("BigoAdsBanner", "Error while loading ad: " + adError.getCode() + " " + adError.getMessage() + ". " + this, bidonErrorA);
            d.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.bigoads.impl.a d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.bigoads.impl.a(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BannerAdLoader bannerAdLoader, BannerAdRequest.Builder builder) {
        bannerAdLoader.loadAd(builder.build());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97187b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97187b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97187b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97187b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97187b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97187b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        BannerAd bannerAd = this.f97188c;
        if (bannerAd != null) {
            bannerAd.destroy();
        }
        this.f97188c = null;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.bigoads.impl.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strD = adParams.d();
        if (strD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        final BannerAdLoader bannerAdLoaderBuild = new BannerAdLoader.Builder().withAdLoadListener((AdLoadListener<BannerAd>) new a(adParams)).build();
        Intrinsics.checkNotNullExpressionValue(bannerAdLoaderBuild, "build(...)");
        final BannerAdRequest.Builder builder = new BannerAdRequest.Builder();
        builder.withAdSizes(adParams.b());
        if (adParams.getAdUnit().getBidType() == BidType.RTB) {
            String strC = adParams.c();
            if (strC == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
                return;
            }
            builder.withBid(strC);
        }
        builder.withSlotId(strD);
        adParams.a().runOnUiThread(new Runnable() { // from class: org.bidon.bigoads.impl.c
            @Override // java.lang.Runnable
            public final void run() {
                d.f(bannerAdLoaderBuild, builder);
            }
        });
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97186a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97187b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97186a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        View viewAdView;
        BannerAd bannerAd = this.f97188c;
        if (bannerAd == null || (viewAdView = bannerAd.adView()) == null) {
            return null;
        }
        return new AdViewHolder(viewAdView);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97187b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.bigoads.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.d((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97187b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97187b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97187b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        BannerAd bannerAd = this.f97188c;
        return (bannerAd == null || bannerAd.isExpired()) ? false : true;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97187b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97187b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97187b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97187b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97187b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97187b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97187b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97187b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97187b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97187b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97187b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97187b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97187b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97187b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97187b.setTokenInfo(tokenInfo);
    }
}
