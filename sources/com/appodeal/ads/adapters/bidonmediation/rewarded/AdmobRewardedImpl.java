package com.appodeal.ads.adapters.bidonmediation.rewarded;

import android.app.Activity;
import com.appodeal.ads.adapters.bidonmediation.AdmobFullscreenAdAuctionParams;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdAuctionParamsUseCase;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCase;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetFullScreenContentCallbackUseCase;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.ironsource.C4424m2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import org.bidon.sdk.ads.rewarded.Reward;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.impl.StatisticsCollectorImpl;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\u0011\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0096\u0001J\u0011\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0096\u0001J\u0011\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0096\u0001J\u0011\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0010H\u0096\u0001J!\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0096\u0001J\t\u00101\u001a\u00020\u0010H\u0096\u0001J\u0011\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u000204H\u0096\u0001J\u000b\u00105\u001a\u0004\u0018\u000106H\u0096\u0001J\t\u00107\u001a\u000208H\u0096\u0001J\t\u00109\u001a\u00020\u001aH\u0096\u0001J \u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u000100H\u0096\u0001¢\u0006\u0002\u0010>J \u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u000100H\u0096\u0001¢\u0006\u0002\u0010CJ\t\u0010D\u001a\u00020\u001aH\u0096\u0001J\t\u0010E\u001a\u00020\u001aH\u0096\u0001J\t\u0010F\u001a\u00020\u001aH\u0096\u0001J\t\u0010G\u001a\u00020\u001aH\u0096\u0001J\u0019\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u000200H\u0096\u0001J\t\u0010K\u001a\u00020\u001aH\u0096\u0001J\t\u0010L\u001a\u00020\u001aH\u0096\u0001J\t\u0010M\u001a\u00020\u001aH\u0096\u0001J\u0013\u0010N\u001a\u00020\u001a2\b\u0010O\u001a\u0004\u0018\u00010%H\u0096\u0001J\u0011\u0010P\u001a\u00020\u001a2\u0006\u0010=\u001a\u000200H\u0096\u0001J\u0011\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020SH\u0096\u0001J\u0011\u0010T\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020VH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0018\u0010W\u001a\b\u0012\u0004\u0012\u0002040XX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0012\u0010,\u001a\u00020%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0012\u0010-\u001a\u00020.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0012\u0010'\u001a\u00020(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/rewarded/AdmobRewardedImpl;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lcom/appodeal/ads/adapters/bidonmediation/AdmobFullscreenAdAuctionParams;", "Lorg/bidon/sdk/adapter/impl/AdEventFlow;", "Lorg/bidon/sdk/stats/StatisticsCollector;", "getAdRequest", "Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdRequestUseCase;", "getFullScreenContentCallback", "Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetFullScreenContentCallbackUseCase;", "obtainAdAuctionParams", "Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdAuctionParamsUseCase;", "<init>", "(Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdRequestUseCase;Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetFullScreenContentCallbackUseCase;Lcom/appodeal/ads/adapters/bidonmediation/usecases/GetAdAuctionParamsUseCase;)V", "rewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "isAdReadyToShow", "", "()Z", "getAuctionParam", "Lkotlin/Result;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "auctionParamsScope", "Lorg/bidon/sdk/adapter/AdAuctionParamSource;", "getAuctionParam-IoAF18A", "(Lorg/bidon/sdk/adapter/AdAuctionParamSource;)Ljava/lang/Object;", "load", "", "adParams", C4424m2.f43623v, "activity", "Landroid/app/Activity;", "destroy", "addAuctionConfigurationId", "auctionConfigurationId", "", "addAuctionConfigurationUid", "auctionConfigurationUid", "", "addDemandId", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "addExternalWinNotificationsEnabled", "enabled", "addRoundInfo", "auctionId", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "auctionPricefloor", "", "canSendWinLoseNotifications", "emitEvent", "event", "Lorg/bidon/sdk/adapter/AdEvent;", "getAd", "Lorg/bidon/sdk/ads/Ad;", "getStats", "Lorg/bidon/sdk/stats/models/BidStat;", "markBelowPricefloor", "markFillFinished", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "price", "(Lorg/bidon/sdk/stats/models/RoundStatus;Ljava/lang/Double;)V", "markFillStarted", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "pricefloor", "(Lorg/bidon/sdk/auction/models/AdUnit;Ljava/lang/Double;)V", "markLoss", "markWin", "markWinLoseNotificationsSent", "sendClickImpression", "sendLoss", "winnerDemandId", "winnerPrice", "sendRewardImpression", "sendShowImpression", "sendWin", "setDsp", "dspSource", "setPrice", "setStatisticAdType", "adType", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "setTokenInfo", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "adEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getAdEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "getAuctionId", "()Ljava/lang/String;", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobRewardedImpl implements AdSource.Rewarded<AdmobFullscreenAdAuctionParams>, AdEventFlow, StatisticsCollector {
    private final /* synthetic */ AdEventFlowImpl $$delegate_0;
    private final /* synthetic */ StatisticsCollectorImpl $$delegate_1;

    @NotNull
    private final GetAdRequestUseCase getAdRequest;

    @NotNull
    private final GetFullScreenContentCallbackUseCase getFullScreenContentCallback;

    @NotNull
    private final GetAdAuctionParamsUseCase obtainAdAuctionParams;

    @Nullable
    private RewardedAd rewardedAd;

    public AdmobRewardedImpl() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(AdmobRewardedImpl admobRewardedImpl, RewardItem rewardItem) {
        Intrinsics.checkNotNullParameter(rewardItem, "rewardItem");
        LogExtKt.logInfo("AdmobRewarded", "onUserEarnedReward " + rewardItem + ": " + admobRewardedImpl);
        Ad ad2 = admobRewardedImpl.getAd();
        if (ad2 != null) {
            String type = rewardItem.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            admobRewardedImpl.emitEvent(new AdEvent.OnReward(ad2, new Reward(type, rewardItem.getAmount())));
        }
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long auctionConfigurationId) {
        this.$$delegate_1.addAuctionConfigurationId(auctionConfigurationId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(@NotNull String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.$$delegate_1.addAuctionConfigurationUid(auctionConfigurationUid);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(@NotNull DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.$$delegate_1.addDemandId(demandId);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean enabled) {
        this.$$delegate_1.addExternalWinNotificationsEnabled(enabled);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(@NotNull String auctionId, @NotNull DemandAd demandAd, double auctionPricefloor) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.$$delegate_1.addRoundInfo(auctionId, demandAd, auctionPricefloor);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.$$delegate_1.canSendWinLoseNotifications();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void destroy() {
        LogExtKt.logInfo("AdmobRewarded", "destroy " + this);
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setOnPaidEventListener(null);
        }
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setFullScreenContentCallback(null);
        }
        this.rewardedAd = null;
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    public void emitEvent(@NotNull AdEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.$$delegate_0.emitEvent(event);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @Nullable
    public Ad getAd() {
        return this.$$delegate_1.getAd();
    }

    @Override // org.bidon.sdk.adapter.impl.AdEventFlow
    @NotNull
    public SharedFlow getAdEvent() {
        return this.$$delegate_0.getAdEvent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public String getAuctionId() {
        return this.$$delegate_1.getAuctionId();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    @NotNull
    /* JADX INFO: renamed from: getAuctionParam-IoAF18A */
    public Object mo4425getAuctionParamIoAF18A(@NotNull AdAuctionParamSource auctionParamsScope) {
        Intrinsics.checkNotNullParameter(auctionParamsScope, "auctionParamsScope");
        return this.obtainAdAuctionParams.m4426invokegIAlus(auctionParamsScope, getDemandAd().getAdType());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandAd getDemandAd() {
        return this.$$delegate_1.getDemandAd();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandId getDemandId() {
        return this.$$delegate_1.getDemandId();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    /* JADX INFO: renamed from: getStats */
    public BidStat getStat() {
        return this.$$delegate_1.getStat();
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public boolean isAdReadyToShow() {
        return this.rewardedAd != null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        this.$$delegate_1.markBelowPricefloor();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(@NotNull RoundStatus roundStatus, @Nullable Double price) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.$$delegate_1.markFillFinished(roundStatus, price);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(@NotNull AdUnit adUnit, @Nullable Double pricefloor) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.$$delegate_1.markFillStarted(adUnit, pricefloor);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.$$delegate_1.markLoss();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.$$delegate_1.markWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.$$delegate_1.markWinLoseNotificationsSent();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        this.$$delegate_1.sendClickImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(@NotNull String winnerDemandId, double winnerPrice) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        this.$$delegate_1.sendLoss(winnerDemandId, winnerPrice);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        this.$$delegate_1.sendRewardImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        this.$$delegate_1.sendShowImpression();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        this.$$delegate_1.sendWin();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(@Nullable String dspSource) {
        this.$$delegate_1.setDsp(dspSource);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double price) {
        this.$$delegate_1.setPrice(price);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(@NotNull StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.$$delegate_1.setStatisticAdType(adType);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(@NotNull TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.$$delegate_1.setTokenInfo(tokenInfo);
    }

    @Override // org.bidon.sdk.adapter.AdSource.Rewarded
    public void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo("AdmobRewarded", "Starting show: " + this);
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            emitEvent(new AdEvent.ShowFailed(BidonError.AdNotReady.INSTANCE));
        } else {
            rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: com.appodeal.ads.adapters.bidonmediation.rewarded.a
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    AdmobRewardedImpl.show$lambda$2(this.f12148b, rewardItem);
                }
            });
        }
    }

    public AdmobRewardedImpl(@NotNull GetAdRequestUseCase getAdRequest, @NotNull GetFullScreenContentCallbackUseCase getFullScreenContentCallback, @NotNull GetAdAuctionParamsUseCase obtainAdAuctionParams) {
        Intrinsics.checkNotNullParameter(getAdRequest, "getAdRequest");
        Intrinsics.checkNotNullParameter(getFullScreenContentCallback, "getFullScreenContentCallback");
        Intrinsics.checkNotNullParameter(obtainAdAuctionParams, "obtainAdAuctionParams");
        this.$$delegate_0 = new AdEventFlowImpl();
        this.$$delegate_1 = new StatisticsCollectorImpl();
        this.getAdRequest = getAdRequest;
        this.getFullScreenContentCallback = getFullScreenContentCallback;
        this.obtainAdAuctionParams = obtainAdAuctionParams;
    }

    @Override // org.bidon.sdk.adapter.AdSource
    public void load(@NotNull AdmobFullscreenAdAuctionParams adParams) {
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        LogExtKt.logInfo("AdmobRewarded", "Starting with " + adParams);
        AdRequest adRequestInvoke = this.getAdRequest.invoke(adParams);
        String adUnitId = adParams.getAdUnitId();
        if (adUnitId == null) {
            emitEvent(new AdEvent.LoadFailed(new BidonError.IncorrectAdUnit(getDemandId(), "adUnitId")));
        } else {
            RewardedAd.load(adParams.getActivity(), adUnitId, adRequestInvoke, new AdmobRewardedImpl$load$requestListener$1(this, adParams));
        }
    }

    public /* synthetic */ AdmobRewardedImpl(GetAdRequestUseCase getAdRequestUseCase, GetFullScreenContentCallbackUseCase getFullScreenContentCallbackUseCase, GetAdAuctionParamsUseCase getAdAuctionParamsUseCase, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new GetAdRequestUseCase() : getAdRequestUseCase, (i10 & 2) != 0 ? new GetFullScreenContentCallbackUseCase() : getFullScreenContentCallbackUseCase, (i10 & 4) != 0 ? new GetAdAuctionParamsUseCase() : getAdAuctionParamsUseCase);
    }
}
