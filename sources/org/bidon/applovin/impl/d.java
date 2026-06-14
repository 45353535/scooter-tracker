package org.bidon.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdView f97091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AdUnit f97092d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f97094f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97089a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97090b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f97093e = lf.i.a(new Function0() { // from class: org.bidon.applovin.impl.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.g(this.f97088b);
        }
    });

    public static final class a implements AppLovinAdDisplayListener, AppLovinAdClickListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinBanner", "adClicked: " + ad2);
            Ad ad3 = d.this.getAd();
            if (ad3 != null) {
                d.this.emitEvent(new AdEvent.Clicked(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinBanner", "adDisplayed: " + ad2);
            Ad ad3 = d.this.getAd();
            if (ad3 != null) {
                d dVar = d.this;
                AdUnit adUnit = dVar.f97092d;
                dVar.emitEvent(new AdEvent.PaidRevenue(ad3, org.bidon.applovin.ext.a.a(adUnit != null ? Double.valueOf(adUnit.getPricefloor()) : null)));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinBanner", "adHidden: " + ad2);
        }
    }

    public static final class b implements AppLovinAdLoadListener {
        b() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinBanner", "adReceived: " + this);
            d.this.j(true);
            Ad ad3 = d.this.getAd();
            if (ad3 != null) {
                d.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            LogExtKt.logInfo("ApplovinBanner", "failedToReceiveAd: errorCode=" + i10 + ". " + this);
            d.this.emitEvent(new AdEvent.LoadFailed(org.bidon.applovin.ext.b.a(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.applovin.b e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.applovin.b(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    private final a f() {
        return (a) this.f97093e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(d dVar) {
        return dVar.new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(org.bidon.applovin.b bVar, String str, d dVar, b bVar2) {
        AppLovinAdView appLovinAdView = new AppLovinAdView(bVar.b(), str);
        dVar.f97091c = appLovinAdView;
        appLovinAdView.setAdClickListener(dVar.f());
        appLovinAdView.setAdDisplayListener(dVar.f());
        appLovinAdView.setAdLoadListener(bVar2);
        appLovinAdView.loadNextAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97090b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97090b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97090b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97090b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97090b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97090b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("ApplovinBanner", "destroy " + this);
        AppLovinAdView appLovinAdView = this.f97091c;
        if (appLovinAdView != null) {
            appLovinAdView.setAdLoadListener(null);
        }
        this.f97091c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97089a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97090b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97089a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        AppLovinAdView appLovinAdView = this.f97091c;
        if (appLovinAdView != null) {
            return new AdViewHolder(appLovinAdView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97090b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.applovin.impl.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97090b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97090b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97090b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void load(final org.bidon.applovin.b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("ApplovinBanner", "Starting with " + adParams + ": " + this);
        this.f97092d = adParams.getAdUnit();
        final String strC = adParams.c();
        if (strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "zoneId")));
        } else {
            final b bVar = new b();
            adParams.a().runOnUiThread(new Runnable() { // from class: org.bidon.applovin.impl.a
                @Override // java.lang.Runnable
                public final void run() {
                    d.i(adParams, strC, this, bVar);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97094f;
    }

    public void j(boolean z10) {
        this.f97094f = z10;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97090b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97090b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97090b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97090b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97090b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97090b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97090b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97090b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97090b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97090b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97090b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97090b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97090b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97090b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97090b.setTokenInfo(tokenInfo);
    }
}
