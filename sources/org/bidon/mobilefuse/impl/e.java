package org.bidon.mobilefuse.impl;

import android.app.Activity;
import com.ironsource.Df;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseRewardedAd;
import com.mobilefuse.sdk.WinningBidInfo;
import java.util.concurrent.atomic.AtomicBoolean;
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
public final class e implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MobileFuseRewardedAd f97494c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97492a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97493b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicBoolean f97495d = new AtomicBoolean(false);

    public static final class a implements MobileFuseRewardedAd.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MobileFuseRewardedAd f97497b;

        /* JADX INFO: renamed from: org.bidon.mobilefuse.impl.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1136a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdError.values().length];
                try {
                    iArr[AdError.AD_ALREADY_RENDERED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdError.AD_ALREADY_LOADED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdError.AD_LOAD_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        a(MobileFuseRewardedAd mobileFuseRewardedAd) {
            this.f97497b = mobileFuseRewardedAd;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdClicked() {
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", Df.f40645f);
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
        public void onAdClosed() {
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", "onAdClosed: " + this);
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Closed(ad2));
            }
            e.this.f97494c = null;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdError(AdError adError) {
            LogExtKt.logError("MobileFuseRewardedAdImpl", "onAdError " + adError, new Throwable(adError != null ? adError.getErrorMessage() : null));
            int i10 = adError == null ? -1 : C1136a.$EnumSwitchMapping$0[adError.ordinal()];
            if (i10 == 1) {
                e.this.emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    if (e.this.f97495d.getAndSet(true) || e.this.getAd() == null) {
                        return;
                    }
                    e eVar = e.this;
                    eVar.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(eVar.getDemandId())));
                    return;
                }
                e.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(e.this.getDemandId(), new Throwable("Message: " + (adError != null ? adError.getErrorMessage() : null) + ". Code: " + (adError != null ? Integer.valueOf(adError.getErrorCode()) : null)), null, 4, null)));
            }
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdExpired() {
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", "onAdExpired");
            e.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Expired(e.this.getDemandId())));
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdLoaded() {
            if (e.this.f97495d.getAndSet(true)) {
                return;
            }
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", "onAdLoaded");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdNotFilled() {
            BidonError.NoFill noFill = new BidonError.NoFill(e.this.getDemandId());
            LogExtKt.logError("MobileFuseRewardedAdImpl", "onAdNotFilled", noFill);
            e.this.emitEvent(new AdEvent.LoadFailed(noFill));
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdRendered() {
            String currency;
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", "onAdRendered");
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e eVar = e.this;
                MobileFuseRewardedAd mobileFuseRewardedAd = this.f97497b;
                eVar.emitEvent(new AdEvent.Shown(ad2));
                WinningBidInfo winningBidInfo = mobileFuseRewardedAd.getWinningBidInfo();
                double cpmPrice = winningBidInfo != null ? ((double) winningBidInfo.getCpmPrice()) / 1000.0d : 0.0d;
                if (winningBidInfo == null || (currency = winningBidInfo.getCurrency()) == null) {
                    currency = "USD";
                }
                eVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(cpmPrice, currency, Precision.Precise)));
            }
        }

        @Override // com.mobilefuse.sdk.MobileFuseRewardedAd.Listener
        public void onUserEarnedReward() {
            LogExtKt.logInfo("MobileFuseRewardedAdImpl", "onUserEarnedReward: " + this);
            Ad ad2 = e.this.getAd();
            if (ad2 != null) {
                e.this.emitEvent(new AdEvent.OnReward(ad2, null));
            }
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97493b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97493b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97493b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97493b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97493b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(c adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MobileFuseRewardedAdImpl", "Starting with " + adParams + ": " + this);
        if (adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        if (adParams.getAdUnit().getBidType() == BidType.RTB && adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "signalData")));
            return;
        }
        MobileFuseRewardedAd mobileFuseRewardedAd = new MobileFuseRewardedAd(adParams.a(), adParams.b());
        this.f97494c = mobileFuseRewardedAd;
        mobileFuseRewardedAd.setListener(new a(mobileFuseRewardedAd));
        mobileFuseRewardedAd.loadAdFromBiddingToken(adParams.c());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97493b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MobileFuseRewardedAdImpl", "destroy " + this);
        this.f97494c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97492a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97493b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97492a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97493b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new h().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97493b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97493b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97493b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        MobileFuseRewardedAd mobileFuseRewardedAd = this.f97494c;
        return mobileFuseRewardedAd != null && mobileFuseRewardedAd.isLoaded();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97493b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97493b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97493b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97493b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97493b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97493b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97493b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97493b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97493b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97493b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97493b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97493b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97493b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97493b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97493b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("MobileFuseRewardedAdImpl", "Starting show: " + this);
        MobileFuseRewardedAd mobileFuseRewardedAd = this.f97494c;
        if (mobileFuseRewardedAd == null || !mobileFuseRewardedAd.isLoaded()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        MobileFuseRewardedAd mobileFuseRewardedAd2 = this.f97494c;
        if (mobileFuseRewardedAd2 != null) {
            mobileFuseRewardedAd2.showAd();
        }
    }
}
