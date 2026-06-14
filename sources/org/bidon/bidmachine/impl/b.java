package org.bidon.bidmachine.impl;

import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.PriceFloorParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdViewHolder;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.WinLossNotifiable;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.adapter.impl.AdEventFlowImpl;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;
import u8.d;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements AdSource.Banner, AdEventFlow, WinLossNotifiable, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f97143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u8.d f97144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u8.f f97145e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidType.values().length];
            try {
                iArr[BidType.CPM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidType.RTB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: org.bidon.bidmachine.impl.b$b, reason: collision with other inner class name */
    public static final class C1121b implements u8.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97147b;

        C1121b(BidType bidType) {
            this.f97147b = bidType;
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(u8.f bannerView) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            LogExtKt.logInfo("BidMachineBanner", "onAdClicked: " + this);
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(u8.f bannerView) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            LogExtKt.logInfo("BidMachineBanner", "onAdExpired: " + this);
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.Expired(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdImpression(u8.f bannerView) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            LogExtKt.logInfo("BidMachineBanner", "onAdShown: " + this);
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.PaidRevenue(ad2, org.bidon.bidmachine.ext.a.a(bannerView.getAuctionResult())));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdLoadFailed(u8.f bannerView, ae.a bmError) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            LogExtKt.logInfo("BidMachineBanner", "onRequestFailed " + bmError + ". " + this);
            b bVar = b.this;
            bVar.emitEvent(new AdEvent.LoadFailed(org.bidon.bidmachine.d.b(bmError, bVar.getDemandId())));
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(u8.f bannerView) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            LogExtKt.logInfo("BidMachineBanner", "onAdLoaded: " + this);
            b bVar = b.this;
            zb.c auctionResult = bannerView.getAuctionResult();
            bVar.setDsp(auctionResult != null ? auctionResult.getDemandSource() : null);
            if (this.f97147b == BidType.CPM) {
                b bVar2 = b.this;
                zb.c auctionResult2 = bannerView.getAuctionResult();
                bVar2.setPrice(auctionResult2 != null ? auctionResult2.getPrice() : 0.0d);
            }
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdShowFailed(u8.f bannerView, ae.a bmError) {
            Intrinsics.checkNotNullParameter(bannerView, "bannerView");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            LogExtKt.logInfo("BidMachineBanner", "onAdShowFailed: " + this);
            b bVar = b.this;
            bVar.emitEvent(new AdEvent.ShowFailed(org.bidon.bidmachine.d.b(bmError, bVar.getDemandId())));
        }
    }

    public static final class c implements AdRequest.AdRequestListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97149b;

        c(BidType bidType) {
            this.f97149b = bidType;
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onRequestExpired(u8.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            LogExtKt.logInfo("BidMachineBanner", "onRequestExpired: " + this);
            b.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Expired(b.this.getDemandId())));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onRequestFailed(u8.d request, ae.a bmError) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorA = this.f97149b == BidType.RTB ? org.bidon.bidmachine.d.a(bmError, b.this.getDemandId()) : org.bidon.bidmachine.d.b(bmError, b.this.getDemandId());
            LogExtKt.logError("BidMachineBanner", "onRequestFailed " + bmError + ". " + this, bidonErrorA);
            b.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onRequestSuccess(u8.d request, zb.c result) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            LogExtKt.logInfo("BidMachineBanner", "onRequestSuccess " + result + ": " + this);
            b.this.c(request, this.f97149b);
        }
    }

    public b(g obtainAdAuctionParams) {
        Intrinsics.checkNotNullParameter(obtainAdAuctionParams, "obtainAdAuctionParams");
        this.f97141a = new AdEventFlowImpl();
        this.f97142b = new StatisticsCollectorImpl();
        this.f97143c = obtainAdAuctionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(u8.d dVar, BidType bidType) {
        LogExtKt.logInfo("BidMachineBanner", "Starting fill: " + this);
        u8.f fVar = this.f97145e;
        if (fVar == null) {
            emitEvent(new AdEvent.LoadFailed(BidonError.NoContextFound.INSTANCE));
        } else {
            fVar.setListener(new C1121b(bidType));
            Intrinsics.checkNotNull(fVar.load(dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(b bVar, org.bidon.bidmachine.a aVar) {
        bVar.f97145e = new u8.f(aVar.a().getApplicationContext());
        BidType bidType = aVar.getAdUnit().getBidType();
        AdPlacementConfig.Builder builderBannerBuilder = AdPlacementConfig.INSTANCE.bannerBuilder(org.bidon.bidmachine.ext.b.d(aVar.b()));
        String strE = aVar.e();
        if (strE != null) {
            builderBannerBuilder.withPlacementId(strE);
        }
        builderBannerBuilder.withCustomParams(aVar.c());
        d.c cVar = new d.c(builderBannerBuilder.build());
        int i10 = a.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == 1) {
            cVar.setNetworks("");
        } else {
            if (i10 != 2) {
                throw new m();
            }
            String strD = aVar.d();
            if (strD == null) {
                bVar.emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(bVar.getDemandId(), "Payload is null for RTB")));
                return;
            }
        }
        zb.f listener = ((d.c) ((d.c) cVar.setPriceFloorParams(new PriceFloorParams().m7756addPriceFloor(aVar.getPrice()))).setLoadingTimeOut(Integer.valueOf((int) aVar.g()))).setListener(bVar.new c(bidType));
        Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
        u8.d dVar = (u8.d) ((d.c) listener).build();
        bVar.f97144d = dVar;
        dVar.request(aVar.a().getApplicationContext());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97142b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97142b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97142b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97142b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97142b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97142b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(final org.bidon.bidmachine.a adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("BidMachineBanner", "Starting with " + adParams + ": " + this);
        adParams.a().runOnUiThread(new Runnable() { // from class: org.bidon.bidmachine.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e(this.f97139b, adParams);
            }
        });
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("BidMachineBanner", "destroy " + this);
        u8.d dVar = this.f97144d;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f97144d = null;
        u8.f fVar = this.f97145e;
        if (fVar != null) {
        }
        u8.f fVar2 = this.f97145e;
        if (fVar2 != null) {
            fVar2.destroy();
        }
        this.f97145e = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97141a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97142b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97141a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        u8.f fVar = this.f97145e;
        if (fVar != null) {
            return new AdViewHolder(fVar);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97142b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return this.f97143c.e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97142b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97142b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97142b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        u8.f fVar = this.f97145e;
        return fVar != null && fVar.canShow();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97142b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97142b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97142b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97142b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97142b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97142b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyLoss(String winnerNetworkName, double d10) {
        Intrinsics.checkNotNullParameter(winnerNetworkName, "winnerNetworkName");
        LogExtKt.logInfo("BidMachineBanner", "notifyLoss: " + this);
        u8.d dVar = this.f97144d;
        if (dVar != null) {
            dVar.notifyMediationLoss(winnerNetworkName, Double.valueOf(d10));
        }
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyWin() {
        LogExtKt.logInfo("BidMachineBanner", "notifyWin: " + this);
        u8.d dVar = this.f97144d;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97142b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97142b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97142b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97142b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97142b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97142b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97142b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97142b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97142b.setTokenInfo(tokenInfo);
    }

    public /* synthetic */ b(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }
}
