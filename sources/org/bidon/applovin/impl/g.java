package org.bidon.applovin.impl;

import android.app.Activity;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppLovinSdk f97100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f97101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdUnit f97102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f97103f;

    public static final class a implements AppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener, AppLovinAdClickListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinInterstitial", "adClicked: " + this);
            Ad ad3 = g.this.getAd();
            if (ad3 != null) {
                g.this.emitEvent(new AdEvent.Clicked(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinInterstitial", "adDisplayed: " + this);
            Ad ad3 = g.this.getAd();
            if (ad3 != null) {
                g gVar = g.this;
                gVar.emitEvent(new AdEvent.Shown(ad3));
                AdUnit adUnit = gVar.f97102e;
                gVar.emitEvent(new AdEvent.PaidRevenue(ad3, org.bidon.applovin.ext.a.a(adUnit != null ? Double.valueOf(adUnit.getPricefloor()) : null)));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinInterstitial", "adHidden: " + this);
            Ad ad3 = g.this.getAd();
            if (ad3 != null) {
                g.this.emitEvent(new AdEvent.Closed(ad3));
            }
            g.this.destroy();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd ad2, double d10, boolean z10) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
        }
    }

    public static final class b implements AppLovinAdLoadListener {
        b() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("ApplovinInterstitial", "adReceived: " + this);
            g.this.f97101d = ad2;
            Ad ad3 = g.this.getAd();
            if (ad3 != null) {
                g.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            LogExtKt.logInfo("ApplovinInterstitial", "failedToReceiveAd: errorCode=" + i10 + ". " + this);
            g.this.emitEvent(new AdEvent.LoadFailed(org.bidon.applovin.ext.b.a(i10)));
        }
    }

    public g(AppLovinSdk applovinSdk) {
        Intrinsics.checkNotNullParameter(applovinSdk, "applovinSdk");
        this.f97098a = new AdEventFlowImpl();
        this.f97099b = new StatisticsCollectorImpl();
        this.f97100c = applovinSdk;
        this.f97103f = lf.i.a(new Function0() { // from class: org.bidon.applovin.impl.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.g(this.f97097b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.applovin.c e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.applovin.c(auctionParamsScope.getAdUnit());
    }

    private final a f() {
        return (a) this.f97103f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(g gVar) {
        return gVar.new a();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97099b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97099b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97099b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97099b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97099b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97099b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("ApplovinInterstitial", "destroy");
        this.f97101d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97098a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97099b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97098a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97099b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.applovin.impl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97099b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97099b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97099b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.applovin.c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("ApplovinInterstitial", "Starting with " + adParams + ": " + this);
        this.f97102e = adParams.getAdUnit();
        AppLovinAdService adService = this.f97100c.getAdService();
        Intrinsics.checkNotNullExpressionValue(adService, "getAdService(...)");
        String strA = adParams.a();
        b bVar = new b();
        LogExtKt.logInfo("ApplovinInterstitial", "Starting fill: " + this);
        if (strA == null || StringsKt.y0(strA)) {
            adService.loadNextAd(AppLovinAdSize.INTERSTITIAL, bVar);
        } else {
            adService.loadNextAdForZoneId(strA, bVar);
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97101d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97099b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97099b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97099b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97099b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97099b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97099b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97099b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97099b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97099b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97099b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97099b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97099b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97099b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97099b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97099b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("ApplovinInterstitial", "Starting show: " + this);
        AppLovinAd appLovinAd = this.f97101d;
        if (appLovinAd == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create();
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(f());
        appLovinInterstitialAdDialogCreate.setAdClickListener(f());
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAd);
        this.f97101d = null;
    }
}
