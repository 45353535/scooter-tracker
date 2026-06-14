package org.bidon.mintegral.impl;

import android.app.Activity;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;
import kotlin.Result;
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
import org.bidon.sdk.ads.rewarded.Reward;
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
public final class g implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97457a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97458b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBRewardVideoHandler f97459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBBidRewardVideoHandler f97460d;

    public static final class a implements RewardVideoListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.bidon.mintegral.b f97462b;

        a(org.bidon.mintegral.b bVar) {
            this.f97462b = bVar;
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            Reward reward;
            LogExtKt.logInfo("MintegralRewardedImpl", "onAdClose " + mBridgeIds + ", " + rewardInfo);
            Ad ad2 = g.this.getAd();
            if (ad2 == null) {
                return;
            }
            g gVar = g.this;
            if (rewardInfo != null) {
                String rewardName = rewardInfo.getRewardName();
                Intrinsics.checkNotNullExpressionValue(rewardName, "getRewardName(...)");
                String rewardAmount = rewardInfo.getRewardAmount();
                Intrinsics.checkNotNullExpressionValue(rewardAmount, "getRewardAmount(...)");
                Integer intOrNull = StringsKt.toIntOrNull(rewardAmount);
                reward = new Reward(rewardName, intOrNull != null ? intOrNull.intValue() : 0);
            } else {
                reward = null;
            }
            gVar.emitEvent(new AdEvent.OnReward(ad2, reward));
            g.this.emitEvent(new AdEvent.Closed(ad2));
            g.this.f97460d = null;
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onAdShow(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onAdShow " + mBridgeIds);
            Ad ad2 = g.this.getAd();
            if (ad2 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Shown(ad2));
            g.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97462b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onEndcardShow(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onEndcardShow " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onLoadSuccess(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onLoadSuccess " + mBridgeIds);
            Ad ad2 = g.this.getAd();
            if (ad2 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            BidonError.Unspecified unspecified = new BidonError.Unspecified(g.this.getDemandId(), new Throwable(str), null, 4, null);
            LogExtKt.logError("MintegralRewardedImpl", "onShowFail " + mBridgeIds, unspecified);
            g.this.emitEvent(new AdEvent.ShowFailed(unspecified));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoAdClicked(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onVideoAdClicked " + mBridgeIds);
            Ad ad2 = g.this.getAd();
            if (ad2 == null) {
                return;
            }
            g.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onVideoComplete " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onVideoLoadFail " + mBridgeIds);
            g.this.emitEvent(new AdEvent.LoadFailed(org.bidon.mintegral.ext.a.a(str)));
        }

        @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
        public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralRewardedImpl", "onVideoLoadSuccess " + mBridgeIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.mintegral.b c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.mintegral.b(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97458b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97458b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97458b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97458b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97458b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97458b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.mintegral.b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MintegralRewardedImpl", "Starting with " + adParams + ": " + this);
        String strC = adParams.c();
        if (strC == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        String strD = adParams.d();
        if (strD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "unitId")));
            return;
        }
        a aVar = new a(adParams);
        if (adParams.getAdUnit().getBidType() == BidType.CPM) {
            MBRewardVideoHandler mBRewardVideoHandler = new MBRewardVideoHandler(adParams.a(), strC, strD);
            mBRewardVideoHandler.setRewardVideoListener(aVar);
            mBRewardVideoHandler.load();
            this.f97459c = mBRewardVideoHandler;
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(adParams.a(), strC, strD);
        mBBidRewardVideoHandler.setRewardVideoListener(aVar);
        mBBidRewardVideoHandler.loadFromBid(strB);
        this.f97460d = mBBidRewardVideoHandler;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MintegralRewardedImpl", "destroy " + this);
        MBRewardVideoHandler mBRewardVideoHandler = this.f97459c;
        if (mBRewardVideoHandler != null) {
            mBRewardVideoHandler.clearVideoCache();
        }
        MBRewardVideoHandler mBRewardVideoHandler2 = this.f97459c;
        if (mBRewardVideoHandler2 != null) {
            mBRewardVideoHandler2.setRewardVideoListener(null);
        }
        this.f97459c = null;
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f97460d;
        if (mBBidRewardVideoHandler != null) {
            mBBidRewardVideoHandler.clearVideoCache();
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = this.f97460d;
        if (mBBidRewardVideoHandler2 != null) {
            mBBidRewardVideoHandler2.setRewardVideoListener(null);
        }
        this.f97460d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97457a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97458b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97457a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97458b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        Object objM8670invokeIoAF18A = auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.mintegral.impl.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.c((AdAuctionParamSource) obj);
            }
        });
        Throwable thG = Result.g(objM8670invokeIoAF18A);
        if (thG != null) {
            LogExtKt.logError("MintegralRewardedImpl", "Failed to get auction param", thG);
        }
        return objM8670invokeIoAF18A;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97458b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97458b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97458b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        MBRewardVideoHandler mBRewardVideoHandler = this.f97459c;
        boolean z10 = false;
        boolean z11 = mBRewardVideoHandler != null && mBRewardVideoHandler.isReady();
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f97460d;
        if (mBBidRewardVideoHandler != null && mBBidRewardVideoHandler.isBidReady()) {
            z10 = true;
        }
        return z11 | z10;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97458b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97458b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97458b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97458b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97458b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97458b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97458b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97458b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97458b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97458b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97458b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97458b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97458b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97458b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97458b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("MintegralRewardedImpl", "Starting show: " + this);
        MBRewardVideoHandler mBRewardVideoHandler = this.f97459c;
        if (mBRewardVideoHandler != null && mBRewardVideoHandler.isReady()) {
            MBRewardVideoHandler mBRewardVideoHandler2 = this.f97459c;
            if (mBRewardVideoHandler2 != null) {
                mBRewardVideoHandler2.show();
                return;
            }
            return;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f97460d;
        if (mBBidRewardVideoHandler == null || !mBBidRewardVideoHandler.isBidReady()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler2 = this.f97460d;
        if (mBBidRewardVideoHandler2 != null) {
            mBBidRewardVideoHandler2.showFromBid();
        }
    }
}
