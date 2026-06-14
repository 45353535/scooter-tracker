package org.bidon.moloco.impl;

import android.app.Activity;
import com.ironsource.Df;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
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
public final class k implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardedInterstitialAd f97538c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97536a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97537b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f97539d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f97540e = lf.i.a(new Function0() { // from class: org.bidon.moloco.impl.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return k.f(this.f97535b);
        }
    });

    public static final class a implements AdLoad.Listener {
        a() {
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            BidonError bidonErrorD = org.bidon.moloco.ext.b.d(molocoAdError);
            LogExtKt.logError("MolocoRewardedImpl", Df.f40641b, bidonErrorD);
            k.this.emitEvent(new AdEvent.LoadFailed(bidonErrorD));
        }

        @Override // com.moloco.sdk.publisher.AdLoad.Listener
        public void onAdLoadSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onAdLoadSuccess");
            Ad ad2 = k.this.getAd();
            if (ad2 != null) {
                k.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }
    }

    public static final class b implements RewardedInterstitialAdShowListener {
        b() {
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", Df.f40645f);
            Ad ad2 = k.this.getAd();
            if (ad2 != null) {
                k.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onAdHidden: " + this);
            Ad ad2 = k.this.getAd();
            if (ad2 != null) {
                k.this.emitEvent(new AdEvent.Closed(ad2));
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            LogExtKt.logInfo("MolocoRewardedImpl", "onAdShowFailed: " + molocoAdError.getDescription());
            k.this.emitEvent(new AdEvent.ShowFailed(org.bidon.moloco.ext.b.e(molocoAdError)));
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onAdRendered");
            Ad ad2 = k.this.getAd();
            if (ad2 != null) {
                k kVar = k.this;
                kVar.emitEvent(new AdEvent.Shown(ad2));
                kVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(molocoAd.getRevenue() != null ? r8.floatValue() : 0.0d, "USD", Precision.Precise)));
            }
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoCompleted(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onRewardedVideoCompleted: " + this);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoStarted(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onRewardedVideoStarted: " + this);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onUserRewarded(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            LogExtKt.logInfo("MolocoRewardedImpl", "onUserEarnedReward: " + this);
            Ad ad2 = k.this.getAd();
            if (ad2 != null) {
                k.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }
    }

    private final RewardedInterstitialAdShowListener c() {
        return (RewardedInterstitialAdShowListener) this.f97540e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(k kVar, e eVar, RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        String description;
        if (rewardedInterstitialAd != null) {
            kVar.f97538c = rewardedInterstitialAd;
            rewardedInterstitialAd.load(eVar.b(), kVar.f97539d);
        } else {
            DemandId demandIdA = org.bidon.moloco.a.a();
            if (adCreateError == null || (description = adCreateError.getDescription()) == null) {
                description = "Created rewarded is null.";
            }
            kVar.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(demandIdA, null, description, 2, null)));
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b f(k kVar) {
        return kVar.new b();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97537b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97537b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97537b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97537b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97537b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97537b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        if (adParams.a() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
        } else if (adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
        } else {
            Moloco.createRewardedInterstitial(new MediationInfo(""), adParams.a(), "", new Function2() { // from class: org.bidon.moloco.impl.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.e(this.f97533b, adParams, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardedInterstitialAd rewardedInterstitialAd = this.f97538c;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.destroy();
        }
        this.f97538c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97536a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97537b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97536a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97537b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new n().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97537b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97537b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97537b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        RewardedInterstitialAd rewardedInterstitialAd = this.f97538c;
        return rewardedInterstitialAd != null && rewardedInterstitialAd.isLoaded();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97537b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97537b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97537b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97537b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97537b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97537b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97537b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97537b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97537b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97537b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97537b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97537b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97537b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97537b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97537b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!getIsAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        RewardedInterstitialAd rewardedInterstitialAd = this.f97538c;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.show(c());
        }
    }
}
