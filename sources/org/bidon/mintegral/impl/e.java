package org.bidon.mintegral.impl;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import kotlin.Result;
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

/* JADX INFO: loaded from: classes8.dex */
public final class e implements AdSource.Interstitial, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97451a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97452b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBNewInterstitialHandler f97453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MBBidNewInterstitialHandler f97454d;

    public static final class a implements NewInterstitialListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.bidon.mintegral.b f97456b;

        a(org.bidon.mintegral.b bVar) {
            this.f97456b = bVar;
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onAdClicked " + mBridgeIds);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onAdClose " + mBridgeIds + ", " + rewardInfo);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onAdCloseWithNIReward " + mBridgeIds + ", " + rewardInfo);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onAdShow " + mBridgeIds);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Shown(ad2));
            e.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97456b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onEndcardShow " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onLoadCampaignSuccess " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onResourceLoadFail " + mBridgeIds);
            e.this.emitEvent(new AdEvent.LoadFailed(org.bidon.mintegral.ext.a.a(str)));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onResourceLoadSuccess " + mBridgeIds);
            Ad ad2 = e.this.getAd();
            if (ad2 == null) {
                return;
            }
            e.this.emitEvent(new AdEvent.Fill(ad2));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            BidonError.Unspecified unspecified = new BidonError.Unspecified(e.this.getDemandId(), new Throwable(str), null, 4, null);
            LogExtKt.logError("MintegralInterstitialImpl", "onShowFail " + mBridgeIds, unspecified);
            e.this.emitEvent(new AdEvent.ShowFailed(unspecified));
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralInterstitialImpl", "onVideoComplete " + mBridgeIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.mintegral.b b(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.mintegral.b(auctionParamsScope.getActivity(), auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97452b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97452b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97452b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97452b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97452b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.mintegral.b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MintegralInterstitialImpl", "Starting with " + adParams + ": " + this);
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
            MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(adParams.a(), strC, strD);
            mBNewInterstitialHandler.setInterstitialVideoListener(aVar);
            mBNewInterstitialHandler.load();
            this.f97453c = mBNewInterstitialHandler;
            return;
        }
        String strB = adParams.b();
        if (strB == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = new MBBidNewInterstitialHandler(adParams.a(), strC, strD);
        mBBidNewInterstitialHandler.setInterstitialVideoListener(aVar);
        mBBidNewInterstitialHandler.loadFromBid(strB);
        this.f97454d = mBBidNewInterstitialHandler;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97452b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MintegralInterstitialImpl", "destroy " + this);
        MBNewInterstitialHandler mBNewInterstitialHandler = this.f97453c;
        if (mBNewInterstitialHandler != null) {
            mBNewInterstitialHandler.clearVideoCache();
        }
        MBNewInterstitialHandler mBNewInterstitialHandler2 = this.f97453c;
        if (mBNewInterstitialHandler2 != null) {
            mBNewInterstitialHandler2.setInterstitialVideoListener(null);
        }
        this.f97453c = null;
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f97454d;
        if (mBBidNewInterstitialHandler != null) {
            mBBidNewInterstitialHandler.clearVideoCache();
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = this.f97454d;
        if (mBBidNewInterstitialHandler2 != null) {
            mBBidNewInterstitialHandler2.setInterstitialVideoListener(null);
        }
        this.f97454d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97451a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97452b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97451a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97452b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        Object objM8670invokeIoAF18A = auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.mintegral.impl.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b((AdAuctionParamSource) obj);
            }
        });
        Throwable thG = Result.g(objM8670invokeIoAF18A);
        if (thG != null) {
            LogExtKt.logError("MintegralInterstitialImpl", "Failed to get auction param", thG);
        }
        return objM8670invokeIoAF18A;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97452b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97452b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97452b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        MBNewInterstitialHandler mBNewInterstitialHandler = this.f97453c;
        boolean z10 = false;
        boolean z11 = mBNewInterstitialHandler != null && mBNewInterstitialHandler.isReady();
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f97454d;
        if (mBBidNewInterstitialHandler != null && mBBidNewInterstitialHandler.isBidReady()) {
            z10 = true;
        }
        return z11 | z10;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97452b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97452b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97452b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97452b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97452b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97452b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97452b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97452b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97452b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97452b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97452b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97452b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97452b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97452b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97452b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("MintegralInterstitialImpl", "Starting show: " + this);
        MBNewInterstitialHandler mBNewInterstitialHandler = this.f97453c;
        if (mBNewInterstitialHandler != null && mBNewInterstitialHandler.isReady()) {
            MBNewInterstitialHandler mBNewInterstitialHandler2 = this.f97453c;
            if (mBNewInterstitialHandler2 != null) {
                mBNewInterstitialHandler2.show();
                return;
            }
            return;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f97454d;
        if (mBBidNewInterstitialHandler == null || !mBBidNewInterstitialHandler.isBidReady()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = this.f97454d;
        if (mBBidNewInterstitialHandler2 != null) {
            mBBidNewInterstitialHandler2.showFromBid();
        }
    }
}
