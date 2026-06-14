package org.bidon.vungle.impl;

import android.app.Activity;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
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
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97855a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97856b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardedAd f97857c;

    public static final class a implements RewardedAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97859b;

        a(e eVar) {
            this.f97859b = eVar;
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdClicked(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdClicked: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdEnd(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdEnd: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logError("VungleRewardedImpl", "onAdFailedToLoad placementId=" + baseAd.getPlacementId() + ". " + this, adError);
            i.this.emitEvent(new AdEvent.LoadFailed(org.bidon.vungle.ext.a.a(adError)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logError("VungleRewardedImpl", "onAdFailedToPlay: " + this, adError);
            i.this.emitEvent(new AdEvent.ShowFailed(org.bidon.vungle.ext.a.a(adError)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdImpression(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdImpression: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97859b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLeftApplication(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdLeftApplication: " + this);
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdLoaded(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdLoaded placementId=" + baseAd.getPlacementId() + ". " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.vungle.ads.RewardedAdListener
        public void onAdRewarded(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdRewarded: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.OnReward(ad2, null));
        }

        @Override // com.vungle.ads.BaseAdListener
        public void onAdStart(BaseAd baseAd) {
            Intrinsics.checkNotNullParameter(baseAd, "baseAd");
            LogExtKt.logInfo("VungleRewardedImpl", "onAdStart: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 == null) {
                return;
            }
            i.this.emitEvent(new AdEvent.Shown(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new e(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97856b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97856b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97856b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97856b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97856b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("VungleRewardedImpl", "Starting with " + adParams + ": " + this);
        String strC = adParams.c();
        if (strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        RewardedAd rewardedAd = new RewardedAd(adParams.a(), strC, new AdConfig());
        this.f97857c = rewardedAd;
        rewardedAd.setAdListener(new a(adParams));
        if (adParams.getAdUnit().getBidType() != BidType.RTB) {
            rewardedAd.load(adParams.b());
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
        } else {
            rewardedAd.load(strB);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97856b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardedAd rewardedAd = this.f97857c;
        if (rewardedAd != null) {
            rewardedAd.setAdListener(null);
        }
        this.f97857c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97855a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97856b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97855a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97856b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.vungle.impl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97856b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97856b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97856b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        RewardedAd rewardedAd = this.f97857c;
        return rewardedAd != null && rewardedAd.canPlayAd().booleanValue();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97856b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97856b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97856b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97856b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97856b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97856b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97856b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97856b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97856b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97856b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97856b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97856b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97856b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97856b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97856b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!getIsAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        RewardedAd rewardedAd = this.f97857c;
        if (rewardedAd != null) {
            FullscreenAd.DefaultImpls.play$default(rewardedAd, null, 1, null);
        }
    }
}
