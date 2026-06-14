package org.bidon.moloco.impl;

import android.app.Activity;
import com.ironsource.Df;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialAd f97528c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97526a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97527b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f97529d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f97530e = lf.i.a(new Function0() { // from class: org.bidon.moloco.impl.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.f(this.f97525b);
        }
    });

    public static final class a implements AdLoad.Listener {
        a() {
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            BidonError bidonErrorD = org.bidon.moloco.ext.b.d(molocoAdError);
            LogExtKt.logError("MolocoInterstitialImpl", Df.f40641b, bidonErrorD);
            h.this.emitEvent(new AdEvent.LoadFailed(bidonErrorD));
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoInterstitialImpl", "onAdLoadSuccess");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }
    }

    public static final class b implements InterstitialAdShowListener {
        b() {
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoInterstitialImpl", Df.f40645f);
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoInterstitialImpl", "onAdHidden: " + this);
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h.this.emitEvent(new AdEvent.Closed(ad2));
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            LogExtKt.logInfo("MolocoInterstitialImpl", "onAdShowFailed: " + molocoAdError.getDescription());
            h.this.emitEvent(new AdEvent.ShowFailed(org.bidon.moloco.ext.b.e(molocoAdError)));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoInterstitialImpl", "onAdRendered");
            Ad ad2 = h.this.getAd();
            if (ad2 != null) {
                h hVar = h.this;
                hVar.emitEvent(new AdEvent.Shown(ad2));
                hVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(molocoAd.getRevenue() != null ? r8.floatValue() : 0.0d, "USD", Precision.Precise)));
            }
        }
    }

    private final InterstitialAdShowListener c() {
        return (InterstitialAdShowListener) this.f97530e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(h hVar, e eVar, InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        String description;
        if (interstitialAd != null) {
            hVar.f97528c = interstitialAd;
            interstitialAd.load(eVar.b(), hVar.f97529d);
        } else {
            DemandId demandIdA = org.bidon.moloco.a.a();
            if (adCreateError == null || (description = adCreateError.getDescription()) == null) {
                description = "Created interstitial is null.";
            }
            hVar.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(demandIdA, null, description, 2, null)));
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f(h hVar) {
        return hVar.new b();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97527b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97527b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97527b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97527b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97527b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97527b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MolocoInterstitialImpl", "Starting with " + adParams + ": " + this);
        if (adParams.a() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
        } else if (adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
        } else {
            Moloco.createInterstitial(new MediationInfo(""), adParams.a(), "", new Function2() { // from class: org.bidon.moloco.impl.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return h.e(this.f97523b, adParams, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        InterstitialAd interstitialAd = this.f97528c;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.f97528c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97526a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97527b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97526a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97527b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new n().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97527b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97527b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97527b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        InterstitialAd interstitialAd = this.f97528c;
        return interstitialAd != null && interstitialAd.isLoaded();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97527b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97527b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97527b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97527b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97527b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97527b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97527b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97527b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97527b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97527b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97527b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97527b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97527b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97527b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97527b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!getIsAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        InterstitialAd interstitialAd = this.f97528c;
        if (interstitialAd != null) {
            interstitialAd.show(c());
        }
    }
}
