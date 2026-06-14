package org.bidon.vkads.impl;

import android.app.Activity;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.models.IAdLoadingError;
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
public final class g implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97812a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97813b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardedAd f97814c;

    public static final class a implements RewardedAd.RewardedAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f97816b;

        a(c cVar) {
            this.f97816b = cVar;
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onClick(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onClick: " + this);
            g gVar = g.this;
            Ad ad2 = gVar.getAd();
            if (ad2 == null) {
                return;
            }
            gVar.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDismiss(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onDismiss: " + this);
            g gVar = g.this;
            Ad ad2 = gVar.getAd();
            if (ad2 == null) {
                return;
            }
            gVar.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onDisplay(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onDisplay: " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g gVar = g.this;
                c cVar = this.f97816b;
                gVar.emitEvent(new AdEvent.Shown(ad2));
                gVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(cVar.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onFailedToShow(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onFailedToShow: " + this);
            g.this.emitEvent(new AdEvent.ShowFailed(new BidonError.Unspecified(g.this.getDemandId(), null, null, 6, null)));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onLoad(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onLoad: " + this);
            g gVar = g.this;
            Ad ad2 = gVar.getAd();
            if (ad2 == null) {
                return;
            }
            gVar.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onNoAd(IAdLoadingError error, RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onNoAd: " + error.getCode() + " " + error.getMessage() + ". " + this);
            g.this.emitEvent(new AdEvent.LoadFailed(org.bidon.vkads.ext.a.b(error, null, 1, null)));
        }

        @Override // com.my.target.ads.RewardedAd.RewardedAdListener
        public void onReward(Reward reward, RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            LogExtKt.logInfo("VkAdsRewardedImpl", "onAdRewarded: " + reward + ", " + this);
            Ad ad2 = g.this.getAd();
            if (ad2 != null) {
                g.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new c(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97813b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97813b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97813b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97813b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97813b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        Integer numD = adParams.d();
        if (numD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        RewardedAd rewardedAd = new RewardedAd(numD.intValue(), adParams.a());
        this.f97814c = rewardedAd;
        rewardedAd.getCustomParams().setCustomParam("mediation", adParams.c());
        rewardedAd.setListener(new a(adParams));
        if (adParams.getAdUnit().getBidType() != BidType.RTB) {
            rewardedAd.load();
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "bidId")));
        } else {
            rewardedAd.loadFromBid(strB);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97813b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardedAd rewardedAd = this.f97814c;
        if (rewardedAd != null) {
            rewardedAd.destroy();
        }
        this.f97814c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97812a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97813b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97812a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97813b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.vkads.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.b((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97813b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97813b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97813b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97814c != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97813b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97813b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97813b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97813b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97813b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97813b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97813b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97813b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97813b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97813b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97813b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97813b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97813b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97813b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97813b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RewardedAd rewardedAd = this.f97814c;
        if (rewardedAd != null) {
            rewardedAd.show();
        } else {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        }
    }
}
