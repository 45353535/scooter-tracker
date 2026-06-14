package org.bidon.applovin.impl;

import android.app.Activity;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinIncentivizedInterstitial f97109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f97110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdUnit f97111e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97107a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97108b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f97112f = lf.i.a(new Function0() { // from class: org.bidon.applovin.impl.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return j.g(this.f97106b);
        }
    });

    public static final class a implements AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener, AppLovinAdDisplayListener, AppLovinAdClickListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("Applovin Rewarded", "adClicked: " + this);
            Ad ad3 = j.this.getAd();
            if (ad3 != null) {
                j.this.emitEvent(new AdEvent.Clicked(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("Applovin Rewarded", "adDisplayed: " + this);
            Ad ad3 = j.this.getAd();
            if (ad3 != null) {
                j jVar = j.this;
                jVar.emitEvent(new AdEvent.Shown(ad3));
                AdUnit adUnit = jVar.f97111e;
                jVar.emitEvent(new AdEvent.PaidRevenue(ad3, org.bidon.applovin.ext.a.a(adUnit != null ? Double.valueOf(adUnit.getPricefloor()) : null)));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("Applovin Rewarded", "adHidden: " + this);
            Ad ad3 = j.this.getAd();
            if (ad3 != null) {
                j.this.emitEvent(new AdEvent.Closed(ad3));
            }
            j.this.destroy();
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd ad2, Map map) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("Applovin Rewarded", "userRewardVerified: " + this);
            Ad ad3 = j.this.getAd();
            if (ad3 != null) {
                j.this.emitEvent(new AdEvent.OnReward(ad3, null));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
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
            LogExtKt.logInfo("Applovin Rewarded", "adReceived: " + this);
            j.this.f97110d = ad2;
            Ad ad3 = j.this.getAd();
            if (ad3 != null) {
                j.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            LogExtKt.logInfo("Applovin Rewarded", "failedToReceiveAd: errorCode=" + i10 + ". " + this);
            j.this.emitEvent(new AdEvent.LoadFailed(org.bidon.applovin.ext.b.a(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.applovin.c e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.applovin.c(auctionParamsScope.getAdUnit());
    }

    private final a f() {
        return (a) this.f97112f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(j jVar) {
        return jVar.new a();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97108b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97108b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97108b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97108b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97108b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97108b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("Applovin Rewarded", "destroy " + this);
        this.f97109c = null;
        this.f97110d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97107a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97108b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97107a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97108b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.applovin.impl.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97108b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97108b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97108b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.applovin.c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("Applovin Rewarded", "Starting with " + adParams + ": " + this);
        this.f97111e = adParams.getAdUnit();
        String strA = adParams.a();
        if (strA == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "zoneId")));
            return;
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = new AppLovinIncentivizedInterstitial(strA);
        this.f97109c = appLovinIncentivizedInterstitial;
        b bVar = new b();
        LogExtKt.logInfo("Applovin Rewarded", "Starting fill: " + this);
        appLovinIncentivizedInterstitial.preload(bVar);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.f97109c;
        return appLovinIncentivizedInterstitial != null && appLovinIncentivizedInterstitial.isAdReadyToDisplay();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97108b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97108b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97108b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97108b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97108b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97108b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97108b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97108b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97108b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97108b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97108b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97108b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97108b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97108b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97108b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("Applovin Rewarded", "Starting show: " + this);
        AppLovinAd appLovinAd = this.f97110d;
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.f97109c;
        if (appLovinIncentivizedInterstitial == null || !appLovinIncentivizedInterstitial.isAdReadyToDisplay() || appLovinAd == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial2 = this.f97109c;
        if (appLovinIncentivizedInterstitial2 != null) {
            appLovinIncentivizedInterstitial2.show(appLovinAd, f(), f(), f(), f());
        }
        this.f97110d = null;
    }
}
