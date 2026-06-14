package org.bidon.mintegral.impl;

import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBridgeIds;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdViewHolder;
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
public final class c implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97445a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97446b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBBannerView f97447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f97448d;

    public static final class a implements BannerAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ org.bidon.mintegral.c f97450b;

        a(org.bidon.mintegral.c cVar) {
            this.f97450b = cVar;
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void closeFullScreen(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "closeFullScreen " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onClick(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "onAdClicked " + mBridgeIds);
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onCloseBanner(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "onCloseBanner " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLeaveApp(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "onLeaveApp " + mBridgeIds);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            LogExtKt.logInfo("MintegralBannerImpl", "onLoadFailed " + mBridgeIds);
            c.this.emitEvent(new AdEvent.LoadFailed(org.bidon.mintegral.ext.a.a(str)));
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLoadSuccessed(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "onLoadSuccessed " + mBridgeIds);
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.Fill(ad2));
            c.this.f(true);
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void onLogImpression(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "onLogImpression " + mBridgeIds);
            Ad ad2 = c.this.getAd();
            if (ad2 == null) {
                return;
            }
            c.this.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(this.f97450b.getPrice() / 1000.0d, "USD", Precision.Precise)));
        }

        @Override // com.mbridge.msdk.out.BannerAdListener
        public void showFullScreen(MBridgeIds mBridgeIds) {
            LogExtKt.logInfo("MintegralBannerImpl", "showFullScreen " + mBridgeIds);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.mintegral.c c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new org.bidon.mintegral.c(auctionParamsScope.getActivity(), auctionParamsScope.getBannerFormat(), auctionParamsScope.getAdUnit());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(org.bidon.mintegral.c cVar, String str, String str2, c cVar2) {
        MBBannerView mBBannerView = new MBBannerView(cVar.a().getApplicationContext());
        cVar2.f97447c = mBBannerView;
        mBBannerView.init(cVar.b(), str, str2);
        mBBannerView.setAllowShowCloseBtn(false);
        mBBannerView.setRefreshTime(0);
        mBBannerView.setBannerAdListener(cVar2.new a(cVar));
        if (cVar.getAdUnit().getBidType() == BidType.CPM) {
            mBBannerView.load();
            return;
        }
        String strC = cVar.c();
        if (strC == null) {
            cVar2.emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(cVar2.getDemandId(), "payload")));
        } else {
            mBBannerView.loadFromBid(strC);
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97446b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97446b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97446b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97446b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97446b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97446b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final org.bidon.mintegral.c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MintegralBannerImpl", "Starting with " + adParams + ": " + this);
        final String strD = adParams.d();
        if (strD == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        final String strE = adParams.e();
        if (strE == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "unitId")));
        } else {
            adParams.a().runOnUiThread(new Runnable() { // from class: org.bidon.mintegral.impl.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.e(adParams, strD, strE, this);
                }
            });
        }
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MintegralBannerImpl", "destroy " + this);
        MBBannerView mBBannerView = this.f97447c;
        if (mBBannerView != null) {
            mBBannerView.release();
        }
        this.f97447c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97445a.emitEvent(event);
    }

    public void f(boolean z10) {
        this.f97448d = z10;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97446b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97445a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        MBBannerView mBBannerView = this.f97447c;
        if (mBBannerView != null) {
            return new AdViewHolder(mBBannerView);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97446b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.mintegral.impl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.c((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97446b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97446b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97446b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97448d;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97446b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97446b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97446b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97446b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97446b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97446b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97446b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97446b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97446b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97446b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97446b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97446b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97446b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97446b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97446b.setTokenInfo(tokenInfo);
    }
}
