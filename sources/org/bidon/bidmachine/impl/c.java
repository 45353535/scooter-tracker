package org.bidon.bidmachine.impl;

import android.app.Activity;
import android.content.Context;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequest;
import io.bidmachine.PriceFloorParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import l9.d;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
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

/* JADX INFO: loaded from: classes12.dex */
public final class c implements AdSource.Interstitial, AdEventFlow, WinLossNotifiable, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f97152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f97153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l9.d f97154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l9.a f97155f;

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

    public static final class b implements l9.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97157b;

        b(BidType bidType) {
            this.f97157b = bidType;
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(l9.a interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BidMachineInterstitial", "onAdClicked: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // io.bidmachine.AdFullScreenListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdClosed(l9.a interstitialAd, boolean z10) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BidMachineInterstitial", "onAdClosed: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c.this.emitEvent(new AdEvent.Closed(ad2));
            }
            c.this.f97155f = null;
            c.this.f97154e = null;
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(l9.a interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BidMachineInterstitial", "onAdExpired: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c.this.emitEvent(new AdEvent.Expired(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdImpression(l9.a interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BidMachineInterstitial", "onAdShown: " + this);
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c cVar = c.this;
                cVar.emitEvent(new AdEvent.Shown(ad2));
                cVar.emitEvent(new AdEvent.PaidRevenue(ad2, org.bidon.bidmachine.ext.a.a(interstitialAd.getAuctionResult())));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdLoadFailed(l9.a interstitialAd, ae.a bmError) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorB = org.bidon.bidmachine.d.b(bmError, c.this.getDemandId());
            LogExtKt.logError("BidMachineInterstitial", "onAdLoadFailed: " + this, bidonErrorB);
            c.this.emitEvent(new AdEvent.LoadFailed(bidonErrorB));
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(l9.a interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            LogExtKt.logInfo("BidMachineInterstitial", "onAdLoaded: " + this);
            c cVar = c.this;
            zb.c auctionResult = interstitialAd.getAuctionResult();
            cVar.setDsp(auctionResult != null ? auctionResult.getDemandSource() : null);
            if (this.f97157b == BidType.CPM) {
                c cVar2 = c.this;
                zb.c auctionResult2 = interstitialAd.getAuctionResult();
                cVar2.setPrice(auctionResult2 != null ? auctionResult2.getPrice() : 0.0d);
            }
            Ad ad2 = c.this.getAd();
            if (ad2 != null) {
                c.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onAdShowFailed(l9.a interstitialAd, ae.a bmError) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorB = org.bidon.bidmachine.d.b(bmError, c.this.getDemandId());
            LogExtKt.logError("BidMachineInterstitial", "onAdShowFailed: " + this, bidonErrorB);
            c.this.emitEvent(new AdEvent.ShowFailed(bidonErrorB));
        }
    }

    /* JADX INFO: renamed from: org.bidon.bidmachine.impl.c$c, reason: collision with other inner class name */
    public static final class C1122c implements AdRequest.AdRequestListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97159b;

        C1122c(BidType bidType) {
            this.f97159b = bidType;
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onRequestExpired(l9.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            LogExtKt.logInfo("BidMachineInterstitial", "onRequestExpired: " + this);
            c.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Expired(c.this.getDemandId())));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onRequestFailed(l9.d request, ae.a bmError) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorA = this.f97159b == BidType.RTB ? org.bidon.bidmachine.d.a(bmError, c.this.getDemandId()) : org.bidon.bidmachine.d.b(bmError, c.this.getDemandId());
            LogExtKt.logError("BidMachineInterstitial", "onRequestFailed " + bmError + ". " + this, bidonErrorA);
            c.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onRequestSuccess(l9.d request, zb.c result) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            LogExtKt.logInfo("BidMachineInterstitial", "onRequestSuccess " + result + ": " + this);
            c.this.d(request, this.f97159b);
        }
    }

    public c(g obtainAdAuctionParams) {
        Intrinsics.checkNotNullParameter(obtainAdAuctionParams, "obtainAdAuctionParams");
        this.f97150a = new AdEventFlowImpl();
        this.f97151b = new StatisticsCollectorImpl();
        this.f97152c = obtainAdAuctionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(l9.d dVar, BidType bidType) {
        l9.a aVar;
        LogExtKt.logInfo("BidMachineInterstitial", "Starting fill: " + this);
        Context context = this.f97153d;
        if (context == null) {
            emitEvent(new AdEvent.LoadFailed(BidonError.NoContextFound.INSTANCE));
            return;
        }
        this.f97155f = new l9.a(context);
        b bVar = new b(bidType);
        l9.a aVar2 = this.f97155f;
        if (aVar2 == null || (aVar = (l9.a) aVar2.setListener(bVar)) == null) {
            return;
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97151b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97151b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97151b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97151b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97151b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97151b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("BidMachineInterstitial", "destroy " + this);
        l9.d dVar = this.f97154e;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f97154e = null;
        l9.a aVar = this.f97155f;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f97155f = null;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.bidmachine.b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("BidMachineInterstitial", "Starting with " + adParams + ": " + this);
        this.f97153d = adParams.a();
        BidType bidType = adParams.getAdUnit().getBidType();
        AdPlacementConfig.Builder builderInterstitialBuilder = AdPlacementConfig.INSTANCE.interstitialBuilder(AdContentType.All);
        String strD = adParams.d();
        if (strD != null) {
            builderInterstitialBuilder.withPlacementId(strD);
        }
        builderInterstitialBuilder.withCustomParams(adParams.b());
        d.b bVar = new d.b(builderInterstitialBuilder.build());
        int i10 = a.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == 1) {
            bVar.setNetworks("");
        } else {
            if (i10 != 2) {
                throw new m();
            }
            String strC = adParams.c();
            if (strC == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "Payload is null for RTB")));
                return;
            }
        }
        zb.f listener = ((d.b) ((d.b) bVar.setPriceFloorParams(new PriceFloorParams().m7756addPriceFloor(adParams.getPrice()))).setLoadingTimeOut(Integer.valueOf((int) adParams.f()))).setListener(new C1122c(bidType));
        Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
        l9.d dVar = (l9.d) ((d.b) listener).build();
        this.f97154e = dVar;
        dVar.request(adParams.a());
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97150a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97151b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97150a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97151b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return this.f97152c.g(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97151b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97151b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97151b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        l9.a aVar = this.f97155f;
        return aVar != null && aVar.canShow();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97151b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97151b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97151b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97151b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97151b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97151b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyLoss(String winnerNetworkName, double d10) {
        Intrinsics.checkNotNullParameter(winnerNetworkName, "winnerNetworkName");
        LogExtKt.logInfo("BidMachineInterstitial", "notifyLoss: " + this);
        l9.d dVar = this.f97154e;
        if (dVar != null) {
            dVar.notifyMediationLoss(winnerNetworkName, Double.valueOf(d10));
        }
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyWin() {
        LogExtKt.logInfo("BidMachineInterstitial", "notifyWin: " + this);
        l9.d dVar = this.f97154e;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97151b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97151b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97151b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97151b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97151b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97151b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97151b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97151b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97151b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Interstitial
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("BidMachineInterstitial", "Starting show: " + this);
        l9.a aVar = this.f97155f;
        if (aVar == null || !aVar.canShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        l9.a aVar2 = this.f97155f;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    public /* synthetic */ c(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }
}
