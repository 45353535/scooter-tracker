package org.bidon.inmobi.impl;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.inmobi.InmobiAdapter;
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

/* JADX INFO: loaded from: classes12.dex */
public final class f implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97307a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97308b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InMobiInterstitial f97309c;

    public static final class a extends InterstitialAdEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f97311b;

        a(d dVar) {
            this.f97311b = dVar;
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDismissed(InMobiInterstitial interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("InmobiInterstitialImpl", "onAdClosed: " + this);
            f fVar = f.this;
            Ad ad2 = fVar.getAd();
            if (ad2 == null) {
                return;
            }
            fVar.emitEvent(new AdEvent.Closed(ad2));
            f.this.f97309c = null;
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayFailed(InMobiInterstitial interstitial) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            BidonError.Unspecified unspecified = new BidonError.Unspecified(f.this.getDemandId(), null, null, 6, null);
            LogExtKt.logError("InmobiInterstitialImpl", "onAdDisplayFailed. " + this, unspecified);
            f.this.emitEvent(new AdEvent.ShowFailed(unspecified));
        }

        @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
        public void onAdDisplayed(InMobiInterstitial interstitial, AdMetaInfo adMetaInfo) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
            LogExtKt.logInfo("InmobiInterstitialImpl", "onAdImpression: " + this);
            Ad ad2 = f.this.getAd();
            if (ad2 == null) {
                return;
            }
            f.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97311b.getPrice() / 1000.0d, "USD", Precision.Precise)));
            LogExtKt.logInfo("InmobiInterstitialImpl", "onAdDisplayed: " + this);
            f.this.emitEvent(new AdEvent.Shown(ad2));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdClicked(InMobiInterstitial interstitial, Map map) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            LogExtKt.logInfo("InmobiInterstitialImpl", "onAdClicked: " + map + ", " + this);
            f fVar = f.this;
            Ad ad2 = fVar.getAd();
            if (ad2 == null) {
                return;
            }
            fVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadFailed(InMobiInterstitial interstitial, InMobiAdRequestStatus status) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            Intrinsics.checkNotNullParameter(status, "status");
            LogExtKt.logInfo("InmobiInterstitialImpl", "Error while loading ad: " + status.getStatusCode() + " " + status.getCom.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE java.lang.String() + ". " + this);
            f.this.emitEvent(new AdEvent.LoadFailed(org.bidon.inmobi.ext.a.a(status)));
        }

        @Override // com.inmobi.ads.listeners.AdEventListener
        public void onAdLoadSucceeded(InMobiInterstitial interstitial, AdMetaInfo adMetaInfo) {
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
            Intrinsics.checkNotNullParameter(adMetaInfo, "adMetaInfo");
            LogExtKt.logInfo("InmobiInterstitialImpl", "onAdLoadSucceeded: " + this);
            f fVar = f.this;
            Ad ad2 = fVar.getAd();
            if (ad2 == null) {
                return;
            }
            fVar.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        AdUnit adUnit = auctionParamsScope.getAdUnit();
        Context applicationContext = auctionParamsScope.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new d(applicationContext, adUnit);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97308b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97308b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97308b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97308b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97308b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97308b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(d adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("InmobiInterstitialImpl", "Starting with " + adParams + ": " + this);
        if (adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(adParams.a(), adParams.c().longValue(), new a(adParams));
        this.f97309c = inMobiInterstitial;
        inMobiInterstitial.setExtras(InmobiAdapter.INSTANCE.a());
        if (adParams.getAdUnit().getBidType() != BidType.RTB) {
            inMobiInterstitial.load();
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        byte[] bytes = strB.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        inMobiInterstitial.load(bytes);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("InmobiInterstitialImpl", "destroy");
        this.f97309c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97307a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97308b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97307a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97308b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.inmobi.impl.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.c((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97308b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97308b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97308b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        InMobiInterstitial inMobiInterstitial = this.f97309c;
        return inMobiInterstitial != null && inMobiInterstitial.isReady();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97308b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97308b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97308b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97308b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97308b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97308b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97308b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97308b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97308b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97308b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97308b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97308b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97308b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97308b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97308b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("InmobiInterstitialImpl", "Starting show: " + this);
        if (!getIsAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        InMobiInterstitial inMobiInterstitial = this.f97309c;
        if (inMobiInterstitial != null) {
            inMobiInterstitial.show();
        }
    }
}
