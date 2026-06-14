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
import lf.m;
import md.d;
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
public final class d implements AdSource.Rewarded, AdEventFlow, WinLossNotifiable, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f97162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f97163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private md.d f97164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private md.a f97165f;

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

    public static final class b implements md.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97167b;

        b(BidType bidType) {
            this.f97167b = bidType;
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdClicked(md.a rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdClicked: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // io.bidmachine.AdFullScreenListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onAdClosed(md.a rewardedAd, boolean z10) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdClosed: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Closed(ad2));
            }
            d.this.f97165f = null;
            d.this.f97164e = null;
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onAdExpired(md.a rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdExpired: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Expired(ad2));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onAdImpression(md.a rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdShown: " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d dVar = d.this;
                dVar.emitEvent(new AdEvent.Shown(ad2));
                dVar.emitEvent(new AdEvent.PaidRevenue(ad2, org.bidon.bidmachine.ext.a.a(rewardedAd.getAuctionResult())));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onAdLoadFailed(md.a rewardedAd, ae.a bmError) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorB = org.bidon.bidmachine.d.b(bmError, d.this.getDemandId());
            LogExtKt.logError("BidMachineRewarded", "onAdLoadFailed: " + this, bidonErrorB);
            if (d.this.getAd() != null) {
                d.this.emitEvent(new AdEvent.LoadFailed(bidonErrorB));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(md.a rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdLoaded: " + this);
            d dVar = d.this;
            zb.c auctionResult = rewardedAd.getAuctionResult();
            dVar.setDsp(auctionResult != null ? auctionResult.getDemandSource() : null);
            if (this.f97167b == BidType.CPM) {
                d dVar2 = d.this;
                zb.c auctionResult2 = rewardedAd.getAuctionResult();
                dVar2.setPrice(auctionResult2 != null ? auctionResult2.getPrice() : 0.0d);
            }
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // io.bidmachine.AdRewardedListener
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onAdRewarded(md.a rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            LogExtKt.logInfo("BidMachineRewarded", "onAdRewarded " + rewardedAd + ": " + this);
            Ad ad2 = d.this.getAd();
            if (ad2 != null) {
                d.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }

        @Override // io.bidmachine.AdListener
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onAdShowFailed(md.a rewardedAd, ae.a bmError) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorB = org.bidon.bidmachine.d.b(bmError, d.this.getDemandId());
            LogExtKt.logError("BidMachineRewarded", "onAdShowFailed: " + this, bidonErrorB);
            d.this.emitEvent(new AdEvent.ShowFailed(bidonErrorB));
        }
    }

    public static final class c implements AdRequest.AdRequestListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BidType f97169b;

        c(BidType bidType) {
            this.f97169b = bidType;
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onRequestExpired(md.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            LogExtKt.logInfo("BidMachineRewarded", "onRequestExpired: " + this);
            d.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Expired(d.this.getDemandId())));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onRequestFailed(md.d request, ae.a bmError) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(bmError, "bmError");
            BidonError bidonErrorA = this.f97169b == BidType.RTB ? org.bidon.bidmachine.d.a(bmError, d.this.getDemandId()) : org.bidon.bidmachine.d.b(bmError, d.this.getDemandId());
            LogExtKt.logError("BidMachineRewarded", "onRequestFailed " + bmError + ". " + this, bidonErrorA);
            d.this.emitEvent(new AdEvent.LoadFailed(bidonErrorA));
        }

        @Override // io.bidmachine.AdRequest.AdRequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onRequestSuccess(md.d request, zb.c result) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(result, "result");
            LogExtKt.logInfo("BidMachineRewarded", "onRequestSuccess " + result + ": " + this);
            d.this.d(request, this.f97169b);
        }
    }

    public d(g obtainAdAuctionParams) {
        Intrinsics.checkNotNullParameter(obtainAdAuctionParams, "obtainAdAuctionParams");
        this.f97160a = new AdEventFlowImpl();
        this.f97161b = new StatisticsCollectorImpl();
        this.f97162c = obtainAdAuctionParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(md.d dVar, BidType bidType) {
        md.a aVar;
        LogExtKt.logInfo("BidMachineRewarded", "Starting fill: " + this);
        Context context = this.f97163d;
        if (context == null) {
            emitEvent(new AdEvent.LoadFailed(BidonError.NoContextFound.INSTANCE));
            return;
        }
        this.f97165f = new md.a(context);
        b bVar = new b(bidType);
        md.a aVar2 = this.f97165f;
        if (aVar2 == null || (aVar = (md.a) aVar2.setListener(bVar)) == null) {
            return;
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97161b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97161b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97161b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97161b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97161b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97161b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("BidMachineRewarded", "destroy " + this);
        md.d dVar = this.f97164e;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f97164e = null;
        md.a aVar = this.f97165f;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f97165f = null;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.bidmachine.b adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("BidMachineRewarded", "Starting with " + adParams + ": " + this);
        this.f97163d = adParams.a();
        BidType bidType = adParams.getAdUnit().getBidType();
        AdPlacementConfig.Builder builderRewardedBuilder = AdPlacementConfig.INSTANCE.rewardedBuilder(AdContentType.All);
        String strD = adParams.d();
        if (strD != null) {
            builderRewardedBuilder.withPlacementId(strD);
        }
        builderRewardedBuilder.withCustomParams(adParams.b());
        d.b bVar = new d.b(builderRewardedBuilder.build());
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
        zb.f listener = ((d.b) ((d.b) bVar.setPriceFloorParams(new PriceFloorParams().m7756addPriceFloor(adParams.getPrice()))).setLoadingTimeOut(Integer.valueOf((int) adParams.f()))).setListener(new c(bidType));
        Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
        md.d dVar = (md.d) ((d.b) listener).build();
        this.f97164e = dVar;
        dVar.request(adParams.a());
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97160a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97161b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97160a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97161b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return this.f97162c.g(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97161b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97161b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97161b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        md.a aVar = this.f97165f;
        return aVar != null && aVar.canShow();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97161b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97161b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97161b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97161b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97161b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97161b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyLoss(String winnerNetworkName, double d10) {
        Intrinsics.checkNotNullParameter(winnerNetworkName, "winnerNetworkName");
        LogExtKt.logInfo("BidMachineRewarded", "notifyLoss: " + this);
        md.d dVar = this.f97164e;
        if (dVar != null) {
            dVar.notifyMediationLoss(winnerNetworkName, Double.valueOf(d10));
        }
    }

    @Override // org.bidon.sdk.adapter.WinLossNotifiable
    public void notifyWin() {
        LogExtKt.logInfo("BidMachineRewarded", "notifyWin: " + this);
        md.d dVar = this.f97164e;
        if (dVar != null) {
            dVar.notifyMediationWin();
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97161b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97161b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97161b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97161b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97161b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97161b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97161b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97161b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97161b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("BidMachineRewarded", "Starting show: " + this);
        md.a aVar = this.f97165f;
        if (aVar == null || !aVar.canShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        md.a aVar2 = this.f97165f;
        if (aVar2 != null) {
            aVar2.show();
        }
    }

    public /* synthetic */ d(g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g() : gVar);
    }
}
