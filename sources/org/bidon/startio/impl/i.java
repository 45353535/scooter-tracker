package org.bidon.startio.impl;

import android.app.Activity;
import com.ironsource.Df;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.Unit;
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
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StartAppAd f97700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f97701d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97698a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97699b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f97702e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f97703f = new b();

    public static final class a implements AdEventListener {
        a() {
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public void onFailedToReceiveAd(Ad ad2) {
            String str = "onFailedToReceiveAd: " + (ad2 != null ? ad2.getErrorMessage() : null);
            LogExtKt.logInfo("StartIoRewardedImpl", str);
            i.this.emitEvent(new AdEvent.LoadFailed(new BidonError.Unspecified(org.bidon.startio.a.a(), null, str, 2, null)));
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public void onReceiveAd(Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            LogExtKt.logInfo("StartIoRewardedImpl", "onReceiveAd");
            org.bidon.sdk.ads.Ad ad3 = i.this.getAd();
            if (ad3 != null) {
                i.this.emitEvent(new AdEvent.Fill(ad3));
            }
        }
    }

    public static final class b implements AdDisplayListener {
        b() {
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
        public void adClicked(Ad ad2) {
            LogExtKt.logInfo("StartIoRewardedImpl", Df.f40645f);
            org.bidon.sdk.ads.Ad ad3 = i.this.getAd();
            if (ad3 != null) {
                i.this.emitEvent(new AdEvent.Clicked(ad3));
            }
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
        public void adDisplayed(Ad ad2) {
            LogExtKt.logInfo("StartIoRewardedImpl", "adDisplayed");
            org.bidon.sdk.ads.Ad ad3 = i.this.getAd();
            if (ad3 != null) {
                i iVar = i.this;
                iVar.emitEvent(new AdEvent.Shown(ad3));
                iVar.emitEvent(new AdEvent.PaidRevenue(ad3, new AdValue(iVar.f97701d / 1000.0d, "USD", Precision.Estimated)));
            }
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
        public void adHidden(Ad ad2) {
            LogExtKt.logInfo("StartIoRewardedImpl", "adHidden: " + this);
            org.bidon.sdk.ads.Ad ad3 = i.this.getAd();
            if (ad3 != null) {
                i.this.emitEvent(new AdEvent.Closed(ad3));
            }
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
        public void adNotDisplayed(Ad ad2) {
            NotDisplayedReason notDisplayedReason;
            String strName = null;
            String errorMessage = ad2 != null ? ad2.getErrorMessage() : null;
            if (ad2 != null && (notDisplayedReason = ad2.getNotDisplayedReason()) != null) {
                strName = notDisplayedReason.name();
            }
            String str = "adNotDisplayed: " + errorMessage + ". Reason: " + strName;
            LogExtKt.logInfo("StartIoRewardedImpl", str);
            i.this.emitEvent(new AdEvent.ShowFailed(new BidonError.Unspecified(org.bidon.startio.a.a(), null, str, 2, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(i iVar) {
        LogExtKt.logInfo("StartIoRewardedImpl", "onVideoCompleted");
        org.bidon.sdk.ads.Ad ad2 = iVar.getAd();
        if (ad2 != null) {
            iVar.emitEvent(new AdEvent.OnReward(ad2, null));
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97699b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97699b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97699b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97699b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97699b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void load(f adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        if (adParams.b() == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "payload")));
            return;
        }
        this.f97701d = adParams.getPrice();
        StartAppAd startAppAd = new StartAppAd(adParams.a());
        this.f97700c = startAppAd;
        StartAppAd.AdMode adMode = StartAppAd.AdMode.REWARDED_VIDEO;
        AdPreferences adPreferences = new AdPreferences();
        adPreferences.setAdTag(adParams.c());
        Unit unit = Unit.f93236a;
        startAppAd.loadAd(adMode, adPreferences, this.f97702e, adParams.b());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97699b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        this.f97700c = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97698a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public org.bidon.sdk.ads.Ad getAd() {
        return this.f97699b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97698a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97699b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return new c().e(auctionParamsScope);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97699b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97699b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97699b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        StartAppAd startAppAd = this.f97700c;
        return (startAppAd != null ? startAppAd.getState() : null) == Ad.AdState.READY;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97699b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97699b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97699b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97699b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97699b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97699b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97699b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97699b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97699b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97699b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97699b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97699b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97699b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97699b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97699b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!isAdReadyToShow()) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
            return;
        }
        StartAppAd startAppAd = this.f97700c;
        if (startAppAd != null) {
            startAppAd.setVideoListener(new VideoListener() { // from class: org.bidon.startio.impl.h
                @Override // com.startapp.sdk.adsbase.adlisteners.VideoListener
                public final void onVideoCompleted() {
                    i.d(this.f97697a);
                }
            });
            startAppAd.showAd(this.f97703f);
        }
    }
}
