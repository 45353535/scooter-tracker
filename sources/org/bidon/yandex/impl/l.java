package org.bidon.yandex.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import lf.m;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements AdSource.Rewarded, AdEventFlow, StatisticsCollector, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97896a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97897b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ g f97898c = j.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RewardedAd f97899d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BidType.values().length];
            try {
                iArr[BidType.RTB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BidType.CPM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b implements RewardedAdLoadListener {
        b() {
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdFailedToLoad(AdRequestError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("YandexRewardedImpl", "onAdFailedToLoad: " + error.getCode() + " " + error.getDescription() + ". " + this);
            l.this.emitEvent(new AdEvent.LoadFailed(org.bidon.yandex.ext.a.b(error)));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
        public void onAdLoaded(RewardedAd rewarded) {
            Intrinsics.checkNotNullParameter(rewarded, "rewarded");
            l.this.f97899d = rewarded;
            LogExtKt.logInfo("YandexRewardedImpl", "onAdLoaded: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.Fill(ad2));
        }
    }

    public static final class c implements RewardedAdEventListener {
        c() {
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdClicked() {
            LogExtKt.logInfo("YandexRewardedImpl", "onAdClicked: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.Clicked(ad2));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdDismissed() {
            LogExtKt.logInfo("YandexRewardedImpl", "onAdDismissed: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.Closed(ad2));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdFailedToShow(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            LogExtKt.logInfo("YandexRewardedImpl", "onAdFailedToShow: " + adError.getDescription() + ". " + this);
            l.this.emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdImpression(ImpressionData impressionData) {
            LogExtKt.logInfo("YandexRewardedImpl", "onAdImpression: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.PaidRevenue(ad2, org.bidon.yandex.ext.a.a(impressionData)));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdShown() {
            LogExtKt.logInfo("YandexRewardedImpl", "onAdShown: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.Shown(ad2));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onRewarded(Reward reward) {
            Intrinsics.checkNotNullParameter(reward, "reward");
            LogExtKt.logInfo("YandexRewardedImpl", "onRewarded: " + this);
            Ad ad2 = l.this.getAd();
            if (ad2 == null) {
                return;
            }
            l.this.emitEvent(new AdEvent.OnReward(ad2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d e(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        Context applicationContext = auctionParamsScope.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new d(applicationContext, auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.yandex.impl.g
    public void a(Context context, AdRequestConfiguration adRequestConfiguration, InterstitialAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f97898c.a(context, adRequestConfiguration, adLoadListener);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97897b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97897b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97897b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97897b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97897b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.yandex.impl.g
    public void b(Context context, AdRequestConfiguration adRequestConfiguration, RewardedAdLoadListener adLoadListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        Intrinsics.checkNotNullParameter(adLoadListener, "adLoadListener");
        this.f97898c.b(context, adRequestConfiguration, adLoadListener);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97897b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        RewardedAd rewardedAd = this.f97899d;
        if (rewardedAd != null) {
            rewardedAd.setAdEventListener(null);
        }
        this.f97899d = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97896a.emitEvent(event);
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void load(d adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        String strA = adParams.a();
        if (strA == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
            return;
        }
        AdRequestConfiguration.Builder builder = new AdRequestConfiguration.Builder(strA);
        int i10 = a.$EnumSwitchMapping$0[adParams.getAdUnit().getBidType().ordinal()];
        if (i10 == 1) {
            String strC = adParams.c();
            if (strC == null) {
                emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "signalData")));
                return;
            }
            builder.setBiddingData(strC);
        } else if (i10 != 2) {
            throw new m();
        }
        b(adParams.b(), builder.build(), new b());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97897b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97896a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97897b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.yandex.impl.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97897b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97897b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97897b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: isAdReadyToShow */
    public boolean getIsAdReadyToShow() {
        return this.f97899d != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97897b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97897b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97897b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97897b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97897b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97897b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97897b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97897b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97897b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97897b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97897b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97897b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97897b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97897b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97897b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (getIsAdReadyToShow()) {
            RewardedAd rewardedAd = this.f97899d;
            if (rewardedAd != null) {
                rewardedAd.setAdEventListener(new c());
            }
            RewardedAd rewardedAd2 = this.f97899d;
            if (rewardedAd2 != null) {
                rewardedAd2.show(activity);
            }
        }
    }
}
