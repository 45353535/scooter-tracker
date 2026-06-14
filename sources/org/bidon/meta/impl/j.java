package org.bidon.meta.impl;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
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

/* JADX INFO: loaded from: classes8.dex */
public final class j implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97409a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97410b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RewardedVideoAd f97411c;

    public static final class a implements RewardedVideoAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f97413b;

        a(e eVar) {
            this.f97413b = eVar;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            LogExtKt.logInfo("MetaRewardedAdImpl", "onAdClicked: " + this);
            org.bidon.sdk.ads.Ad ad3 = j.this.getAd();
            if (ad3 == null) {
                return;
            }
            j.this.emitEvent(new AdEvent.Clicked(ad3));
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            LogExtKt.logInfo("MetaRewardedAdImpl", "onAdLoaded " + ad2 + ": " + j.this.f97411c + ", " + this);
            org.bidon.sdk.ads.Ad ad3 = j.this.getAd();
            if (j.this.f97411c == null || ad3 == null) {
                j.this.emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            } else {
                j.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            LogExtKt.logInfo("MetaRewardedAdImpl", "Error while loading ad(" + (adError != null ? Integer.valueOf(adError.getErrorCode()) : null) + ": " + (adError != null ? adError.getErrorMessage() : null) + "). " + this);
            j.this.emitEvent(new AdEvent.LoadFailed(org.bidon.meta.ext.a.a(adError)));
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            LogExtKt.logInfo("MetaRewardedAdImpl", "onAdImpression: " + this);
            org.bidon.sdk.ads.Ad ad3 = j.this.getAd();
            if (ad3 == null) {
                return;
            }
            j.this.emitEvent(new AdEvent.PaidRevenue(ad3, new AdValue(this.f97413b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            LogExtKt.logInfo("MetaRewardedAdImpl", "onRewardedVideoClosed");
            org.bidon.sdk.ads.Ad ad2 = j.this.getAd();
            if (ad2 == null) {
                return;
            }
            j.this.emitEvent(new AdEvent.Closed(ad2));
            j.this.f97411c = null;
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            LogExtKt.logInfo("MetaRewardedAdImpl", "onRewardedVideoCompleted");
            org.bidon.sdk.ads.Ad ad2 = j.this.getAd();
            if (ad2 == null) {
                return;
            }
            j.this.emitEvent(new AdEvent.Shown(ad2));
            j.this.emitEvent(new AdEvent.OnReward(ad2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e d(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        Context applicationContext = auctionParamsScope.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new e(applicationContext, auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97410b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97410b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97410b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97410b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97410b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97410b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardedVideoAd rewardedVideoAd = this.f97411c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
        this.f97411c = null;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        if (adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        if (adParams.getAdUnit().getBidType() == BidType.RTB && adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(adParams.a(), adParams.c());
        this.f97411c = rewardedVideoAd;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(new a(adParams)).withBid(adParams.b()).build());
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97409a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public org.bidon.sdk.ads.Ad getAd() {
        return this.f97410b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97409a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97410b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.meta.impl.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.d((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97410b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97410b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97410b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        RewardedVideoAd rewardedVideoAd = this.f97411c;
        if (rewardedVideoAd != null) {
            return rewardedVideoAd.isAdLoaded();
        }
        return false;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97410b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97410b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97410b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97410b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97410b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97410b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97410b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97410b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97410b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97410b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97410b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97410b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97410b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97410b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97410b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        RewardedVideoAd rewardedVideoAd = this.f97411c;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            rewardedVideoAd.show();
        }
    }
}
