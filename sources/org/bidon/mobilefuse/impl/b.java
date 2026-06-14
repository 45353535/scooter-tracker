package org.bidon.mobilefuse.impl;

import com.ironsource.Df;
import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.MobileFuseBannerAd;
import com.mobilefuse.sdk.WinningBidInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParamSource;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdViewHolder;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.impl.AdEventFlow;
import org.bidon.sdk.adapter.impl.AdEventFlowImpl;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.banner.BannerFormat;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
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
public final class b implements AdSource.Banner, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MobileFuseBannerAd f97477c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97475a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97476b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicBoolean f97478d = new AtomicBoolean(false);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            try {
                iArr[BannerFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerFormat.LeaderBoard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerFormat.MRec.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerFormat.Adaptive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: org.bidon.mobilefuse.impl.b$b, reason: collision with other inner class name */
    public static final class C1134b implements MobileFuseBannerAd.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MobileFuseBannerAd f97480b;

        /* JADX INFO: renamed from: org.bidon.mobilefuse.impl.b$b$a */
        public /* synthetic */ class a {
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

        C1134b(MobileFuseBannerAd mobileFuseBannerAd) {
            this.f97480b = mobileFuseBannerAd;
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdClicked() {
            LogExtKt.logInfo("MobileFuseBannerImpl", Df.f40645f);
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
        public void onAdCollapsed() {
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdError(AdError adError) {
            LogExtKt.logError("MobileFuseBannerImpl", "onAdError " + adError, new Throwable(adError != null ? adError.getErrorMessage() : null));
            int i10 = adError == null ? -1 : a.$EnumSwitchMapping$0[adError.ordinal()];
            if (i10 == 1) {
                b.this.emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    if (b.this.f97478d.getAndSet(true) || b.this.getAd() == null) {
                        return;
                    }
                    b bVar = b.this;
                    bVar.emitEvent(new AdEvent.LoadFailed(new BidonError.NoFill(bVar.getDemandId())));
                    return;
                }
                b.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(b.this.getDemandId(), new Throwable("Message: " + (adError != null ? adError.getErrorMessage() : null) + ". Code: " + (adError != null ? Integer.valueOf(adError.getErrorCode()) : null)), null, 4, null)));
            }
        }

        @Override // com.mobilefuse.sdk.MobileFuseBannerAd.Listener
        public void onAdExpanded() {
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdExpired() {
            LogExtKt.logInfo("MobileFuseBannerImpl", "onAdExpired");
            b.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Expired(b.this.getDemandId())));
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdLoaded() {
            if (b.this.f97478d.getAndSet(true)) {
                return;
            }
            LogExtKt.logInfo("MobileFuseBannerImpl", "onAdLoaded");
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdNotFilled() {
            BidonError.NoFill noFill = new BidonError.NoFill(b.this.getDemandId());
            LogExtKt.logError("MobileFuseBannerImpl", "onAdNotFilled", null);
            b.this.emitEvent(new AdEvent.LoadFailed(noFill));
        }

        @Override // com.mobilefuse.sdk.BaseAdListener
        public void onAdRendered() {
            String currency;
            LogExtKt.logInfo("MobileFuseBannerImpl", "onAdRendered");
            Ad ad2 = b.this.getAd();
            if (ad2 != null) {
                b bVar = b.this;
                MobileFuseBannerAd mobileFuseBannerAd = this.f97480b;
                bVar.emitEvent(new AdEvent.Shown(ad2));
                WinningBidInfo winningBidInfo = mobileFuseBannerAd.getWinningBidInfo();
                double cpmPrice = winningBidInfo != null ? ((double) winningBidInfo.getCpmPrice()) / 1000.0d : 0.0d;
                if (winningBidInfo == null || (currency = winningBidInfo.getCurrency()) == null) {
                    currency = "USD";
                }
                bVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue(cpmPrice, currency, Precision.Precise)));
            }
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97476b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97476b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97476b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97476b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97476b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void load(org.bidon.mobilefuse.impl.a adParams) {
        MobileFuseBannerAd.AdSize adSize;
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("MobileFuseBannerImpl", "Starting with " + adParams + ": " + this);
        if (adParams.c() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        if (adParams.getAdUnit().getBidType() == BidType.RTB && adParams.d() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "signalData")));
            return;
        }
        int i10 = a.$EnumSwitchMapping$0[adParams.b().ordinal()];
        if (i10 == 1) {
            adSize = MobileFuseBannerAd.AdSize.BANNER_320x50;
        } else if (i10 == 2) {
            adSize = MobileFuseBannerAd.AdSize.BANNER_728x90;
        } else if (i10 == 3) {
            adSize = MobileFuseBannerAd.AdSize.BANNER_300x250;
        } else {
            if (i10 != 4) {
                throw new m();
            }
            adSize = DeviceInfo.INSTANCE.isTablet() ? MobileFuseBannerAd.AdSize.BANNER_728x90 : MobileFuseBannerAd.AdSize.BANNER_320x50;
        }
        MobileFuseBannerAd mobileFuseBannerAd = new MobileFuseBannerAd(adParams.a(), adParams.c(), adSize);
        this.f97477c = mobileFuseBannerAd;
        mobileFuseBannerAd.setAutorefreshEnabled(false);
        mobileFuseBannerAd.setListener(new C1134b(mobileFuseBannerAd));
        mobileFuseBannerAd.loadAdFromBiddingToken(adParams.d());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97476b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("MobileFuseBannerImpl", "destroy " + this);
        this.f97477c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97475a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97476b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97475a.getAdEvent();
    }

    @Override // org.bidon.sdk.adapter.AdSource.Banner
    public AdViewHolder getAdView() {
        MobileFuseBannerAd mobileFuseBannerAd = this.f97477c;
        if (mobileFuseBannerAd != null) {
            return new AdViewHolder(mobileFuseBannerAd);
        }
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97476b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new h().c(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97476b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97476b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97476b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        MobileFuseBannerAd mobileFuseBannerAd = this.f97477c;
        return mobileFuseBannerAd != null && mobileFuseBannerAd.isLoaded();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97476b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97476b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97476b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97476b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97476b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97476b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97476b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97476b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97476b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97476b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97476b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97476b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97476b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97476b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97476b.setTokenInfo(tokenInfo);
    }
}
