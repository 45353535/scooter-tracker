package org.bidon.unityads.impl;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
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
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.analytic.Precision;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements AdSource.Rewarded, AdEventFlow, StatisticsCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AdEventFlowImpl f97786a = new AdEventFlowImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StatisticsCollectorImpl f97787b = new StatisticsCollectorImpl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdUnit f97788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f97789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f97790e;

    public static final class a implements IUnityAdsLoadListener {
        a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            LogExtKt.logInfo("UnityAdsRewarded", "onUnityAdsAdLoaded: " + this);
            i.this.e(true);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.Fill(ad2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            LogExtKt.logInfo("UnityAdsRewarded", "onUnityAdsFailedToLoad: placementId=" + str + ", error=" + unityAdsLoadError + ", message=" + str2);
            i.this.emitEvent(new AdEvent.LoadFailed(org.bidon.unityads.ext.c.a(unityAdsLoadError)));
        }
    }

    public static final class b implements IUnityAdsShowListener {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                try {
                    iArr[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            LogExtKt.logInfo("UnityAdsRewarded", "onUnityAdsShowClick. placementId: " + str);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i.this.emitEvent(new AdEvent.Clicked(ad2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            LogExtKt.logInfo("UnityAdsRewarded", "onUnityAdsShowComplete: placementId=" + str + ", state=" + unityAdsShowCompletionState);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i iVar = i.this;
                int i10 = unityAdsShowCompletionState == null ? -1 : a.$EnumSwitchMapping$0[unityAdsShowCompletionState.ordinal()];
                if (i10 != -1) {
                    if (i10 == 1) {
                        iVar.emitEvent(new AdEvent.OnReward(ad2, null));
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
                iVar.emitEvent(new AdEvent.Closed(ad2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            LogExtKt.logError("UnityAdsRewarded", "onUnityAdsShowFailure: placementId=" + str + ", error=" + unityAdsShowError + ", message=" + str2, org.bidon.unityads.ext.c.b(unityAdsShowError));
            i.this.emitEvent(new AdEvent.ShowFailed(org.bidon.unityads.ext.c.b(unityAdsShowError)));
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            LogExtKt.logInfo("UnityAdsRewarded", "onUnityAdsShowStart: placementId=" + str);
            Ad ad2 = i.this.getAd();
            if (ad2 != null) {
                i iVar = i.this;
                iVar.emitEvent(new AdEvent.Shown(ad2));
                AdUnit adUnit = iVar.f97788c;
                iVar.emitEvent(new AdEvent.PaidRevenue(ad2, new AdValue((adUnit != null ? adUnit.getPricefloor() : 0.0d) / 1000.0d, "USD", Precision.Estimated)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e c(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "$this$auctionParamsScope");
        return new e(auctionParamsScope.getAdUnit());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long j10) {
        this.f97787b.addAuctionConfigurationId(j10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.f97787b.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.f97787b.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean z10) {
        this.f97787b.addExternalWinNotificationsEnabled(z10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(String auctionId, DemandAd demandAd, double d10) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.f97787b.addRoundInfo(auctionId, demandAd, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.f97787b.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void load(e adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("UnityAdsRewarded", "Starting with " + adParams + ": " + this);
        String strA = adParams.a();
        if (strA == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "placementId")));
            return;
        }
        this.f97789d = strA;
        this.f97788c = adParams.getAdUnit();
        UnityAds.load(adParams.a(), new a());
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
    }

    public void e(boolean z10) {
        this.f97790e = z10;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f97786a.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public Ad getAd() {
        return this.f97787b.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public SharedFlow getAdEvent() {
        return this.f97786a.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public String getAuctionId() {
        return this.f97787b.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return auctionParamsScope.m8670invokeIoAF18A(new Function1() { // from class: org.bidon.unityads.impl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.c((AdAuctionParamSource) obj);
            }
        });
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandAd getDemandAd() {
        return this.f97787b.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public DemandId getDemandId() {
        return this.f97787b.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.f97787b.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.f97790e;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.f97787b.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(RoundStatus roundStatus, Double d10) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.f97787b.markFillFinished(roundStatus, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(AdUnit adUnit, Double d10) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f97787b.markFillStarted(adUnit, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.f97787b.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.f97787b.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.f97787b.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.f97787b.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(String winnerDemandId, double d10) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.f97787b.sendLoss(winnerDemandId, d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.f97787b.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.f97787b.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.f97787b.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(String str) {
        this.f97787b.setDsp(str);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double d10) {
        this.f97787b.setPrice(d10);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f97787b.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.f97787b.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        UnityAds.show(activity, this.f97789d, new UnityAdsShowOptions(), new b());
        e(false);
    }
}
