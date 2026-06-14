package org.bidon.bigoads.impl;

import android.app.Activity;
import com.ironsource.adapters.bigo.BigoAdapter;
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
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.RewardVideoAdLoader;
import sg.bigo.ads.api.RewardVideoAdRequest;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97204a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97205b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardVideoAd f97206c;

    public static final class a implements RewardAdInteractionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97208b;

        a(e eVar) {
            this.f97208b = eVar;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClicked() {
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdClicked: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdClosed() {
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdClosed: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.Closed(ad2));
            }
            i.this.f97206c = null;
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdError(AdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(error);
            LogExtKt.logError("BigoAdsRewardedAd", "onAdError: " + this, bidonErrorA);
            i.this.emitEvent(new AdEvent.ShowFailed(bidonErrorA));
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdImpression() {
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdImpression: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97208b.getPrice() / 1000.0d, "USD", Precision.Precise)));
            }
        }

        @Override // sg.bigo.ads.api.AdInteractionListener
        public void onAdOpened() {
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdOpened: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.Shown(ad2));
            }
        }

        @Override // sg.bigo.ads.api.RewardAdInteractionListener
        public void onAdRewarded() {
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdRewarded: " + this);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }
    }

    public static final class b implements AdLoadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97210b;

        b(e eVar) {
            this.f97210b = eVar;
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardVideoAd rewardVideoAd) {
            Intrinsics.checkNotNullParameter(rewardVideoAd, "rewardVideoAd");
            LogExtKt.logInfo("BigoAdsRewardedAd", "onAdLoaded: " + rewardVideoAd + ", " + this);
            i.this.f97206c = rewardVideoAd;
            i.this.d(rewardVideoAd, this.f97210b);
        }

        @Override // sg.bigo.ads.api.AdLoadListener
        public void onError(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            BidonError bidonErrorA = org.bidon.bigoads.ext.a.a(adError);
            LogExtKt.logError("BigoAdsRewardedAd", "Error while loading ad: " + adError.getCode() + " " + adError.getMessage() + ". " + this, bidonErrorA);
            i.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(RewardVideoAd rewardVideoAd, e eVar) {
        rewardVideoAd.setAdInteractionListener((RewardAdInteractionListener) new a(eVar));
        Ad ad2 = getAd();
        if (ad2 != null) {
            emitEvent(new AdEvent.Fill(ad2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new e(auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97205b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97205b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97205b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97205b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97205b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97205b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardVideoAd rewardVideoAd = this.f97206c;
        if (rewardVideoAd != null) {
            rewardVideoAd.destroy();
        }
        this.f97206c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97204a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), BigoAdapter.SLOT_ID)));
            return;
        }
        RewardVideoAdLoader rewardVideoAdLoaderBuild = new RewardVideoAdLoader.Builder().withAdLoadListener((AdLoadListener<RewardVideoAd>) new b(adParams)).build();
        Intrinsics.checkNotNullExpressionValue(rewardVideoAdLoaderBuild, "build(...)");
        RewardVideoAdRequest.Builder builder = new RewardVideoAdRequest.Builder();
        if (adParams.getAdUnit().getBidType() == BidType.RTB) {
            String strA = adParams.a();
            if (strA == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
                return;
            }
            builder.withBid(strA);
        }
        builder.withSlotId(strB);
        rewardVideoAdLoaderBuild.loadAd(builder.build());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97205b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97204a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97205b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.bigoads.impl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97205b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97205b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97205b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        RewardVideoAd rewardVideoAd = this.f97206c;
        return (rewardVideoAd == null || rewardVideoAd.isExpired()) ? false : true;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97205b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97205b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97205b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97205b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97205b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97205b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97205b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97205b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97205b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97205b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97205b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97205b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97205b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97205b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97205b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RewardVideoAd rewardVideoAd = this.f97206c;
        if (rewardVideoAd == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            rewardVideoAd.show();
        }
    }
}
