package org.bidon.sdk.auction.usecases.impl;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.ext.AdTypeParamExtKt;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.AuctionResolver;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.InterstitialRequest;
import org.bidon.sdk.auction.models.RewardedRequest;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.auction.usecases.AuctionStat;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.ResultBody;
import org.bidon.sdk.stats.models.RoundStat;
import org.bidon.sdk.stats.models.RoundStatus;
import org.bidon.sdk.stats.models.StatsAdUnit;
import org.bidon.sdk.stats.models.StatsRequestBody;
import org.bidon.sdk.stats.usecases.StatsRequestUseCase;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.ext.LocalDateTimeExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\f\u0010&\u001a\u00020'*\u00020\u0017H\u0002J$\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u000f2\u0006\u00101\u001a\u00020\u001bH\u0002J\u0014\u00102\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u00010\u0017H\u0002J4\u00104\u001a\u00020)*\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u00107\u001a\u00020\tH\u0002J\u0018\u00108\u001a\u0002092\u0006\u0010\b\u001a\u00020\t2\u0006\u00107\u001a\u00020\tH\u0002J\u000e\u0010:\u001a\u0004\u0018\u00010\u000f*\u00020;H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lorg/bidon/sdk/auction/usecases/impl/AuctionStatImpl;", "Lorg/bidon/sdk/auction/usecases/AuctionStat;", "statsRequest", "Lorg/bidon/sdk/stats/usecases/StatsRequestUseCase;", "resolver", "Lorg/bidon/sdk/auction/AuctionResolver;", "<init>", "(Lorg/bidon/sdk/stats/usecases/StatsRequestUseCase;Lorg/bidon/sdk/auction/AuctionResolver;)V", "auctionStartTs", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "auctionId", "", "bannerRequestBody", "Lorg/bidon/sdk/auction/models/BannerRequest;", "interstitialRequestBody", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "rewardedRequestBody", "Lorg/bidon/sdk/auction/models/RewardedRequest;", Reporting.EventType.WINNER, "Lorg/bidon/sdk/auction/models/AuctionResult;", "getWinner", "()Lorg/bidon/sdk/auction/models/AuctionResult;", "isAuctionCanceled", "", "markAuctionStarted", "", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "markAuctionCanceled", "addRoundResults", "Lorg/bidon/sdk/stats/models/RoundStat;", "result", "Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;", "(Lorg/bidon/sdk/auction/usecases/models/RoundResult$Results;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asStatsAdUnit", "Lorg/bidon/sdk/stats/models/StatsAdUnit;", "sendAuctionStats", "Lorg/bidon/sdk/stats/models/StatsRequestBody;", "auctionData", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "roundStat", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "getFinalStatus", "currentStatus", "isWinner", "updateWinnerIfNeed", "roundWinner", "asStatsRequestBody", "auctionConfigurationId", "auctionConfigurationUid", "auctionFinishTs", "getResultBody", "Lorg/bidon/sdk/stats/models/ResultBody;", "getStatusMessage", "Lorg/bidon/sdk/stats/models/RoundStatus;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuctionStatImpl implements AuctionStat {

    @NotNull
    private String auctionId;
    private long auctionStartTs;

    @Nullable
    private BannerRequest bannerRequestBody;

    @Nullable
    private InterstitialRequest interstitialRequestBody;
    private boolean isAuctionCanceled;

    @NotNull
    private final AuctionResolver resolver;

    @Nullable
    private RewardedRequest rewardedRequestBody;

    @NotNull
    private final StatsRequestUseCase statsRequest;

    @Nullable
    private AuctionResult winner;

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.AuctionStatImpl$addRoundResults$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.AuctionStatImpl", f = "AuctionStatImpl.kt", l = {66}, m = "addRoundResults")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuctionStatImpl.this.addRoundResults(null, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.AuctionStatImpl$sendAuctionStats$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.AuctionStatImpl$sendAuctionStats$1", f = "AuctionStatImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "invokeSuspend")
    static final class C58161 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ DemandAd $demandAd;
        final /* synthetic */ StatsRequestBody $statsRequestBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58161(StatsRequestBody statsRequestBody, DemandAd demandAd, Continuation continuation) {
            super(2, continuation);
            this.$statsRequestBody = statsRequestBody;
            this.$demandAd = demandAd;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AuctionStatImpl.this.new C58161(this.$statsRequestBody, this.$demandAd, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                StatsRequestUseCase statsRequestUseCase = AuctionStatImpl.this.statsRequest;
                StatsRequestBody statsRequestBody = this.$statsRequestBody;
                DemandAd demandAd = this.$demandAd;
                this.label = 1;
                if (statsRequestUseCase.mo8678invoke0E7RQCE(statsRequestBody, demandAd, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58161) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AuctionStatImpl(@NotNull StatsRequestUseCase statsRequest, @NotNull AuctionResolver resolver) {
        Intrinsics.checkNotNullParameter(statsRequest, "statsRequest");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.statsRequest = statsRequest;
        this.resolver = resolver;
        this.auctionId = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r17v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Long] */
    private final StatsAdUnit asStatsAdUnit(AuctionResult auctionResult) {
        if (auctionResult instanceof AuctionResult.Network) {
            AuctionResult.Network network = (AuctionResult.Network) auctionResult;
            BidStat stat = network.getAdSource().getStat();
            String demandId = stat.getDemandId().getDemandId();
            String code = network.getRoundStatus().getCode();
            Double dValueOf = Double.valueOf(stat.getPrice());
            String code2 = BidType.CPM.getCode();
            Long fillStartTs = stat.getFillStartTs();
            Long fillFinishTs = stat.getFillFinishTs();
            AdUnit adUnit = stat.getAdUnit();
            String uid = adUnit != null ? adUnit.getUid() : null;
            AdUnit adUnit2 = stat.getAdUnit();
            String label = adUnit2 != null ? adUnit2.getLabel() : null;
            String statusMessage = getStatusMessage(network.getRoundStatus());
            AdUnit adUnit3 = stat.getAdUnit();
            Long lValueOf = adUnit3 != null ? Long.valueOf(adUnit3.getTimeout()) : null;
            AdUnit adUnit4 = stat.getAdUnit();
            return new StatsAdUnit(demandId, code, dValueOf, null, null, code2, fillStartTs, fillFinishTs, uid, label, statusMessage, lValueOf, adUnit4 != null ? adUnit4.getExtra() : null);
        }
        if (!(auctionResult instanceof AuctionResult.Bidding)) {
            if (!(auctionResult instanceof AuctionResult.AuctionFailed)) {
                throw new m();
            }
            AuctionResult.AuctionFailed auctionFailed = (AuctionResult.AuctionFailed) auctionResult;
            String demandId2 = auctionFailed.getAdUnit().getDemandId();
            String code3 = auctionFailed.getRoundStatus().getCode();
            Double dValueOf2 = Double.valueOf(auctionFailed.getAdUnit().getPricefloor());
            TokenInfo tokenInfo = auctionFailed.getTokenInfo();
            Long tokenStartTs = tokenInfo != null ? tokenInfo.getTokenStartTs() : null;
            TokenInfo tokenInfo2 = auctionFailed.getTokenInfo();
            return new StatsAdUnit(demandId2, code3, dValueOf2, tokenStartTs, tokenInfo2 != null ? tokenInfo2.getTokenFinishTs() : null, auctionFailed.getAdUnit().getBidType().getCode(), null, null, auctionFailed.getAdUnit().getUid(), auctionFailed.getAdUnit().getLabel(), getStatusMessage(auctionFailed.getRoundStatus()), Long.valueOf(auctionFailed.getAdUnit().getTimeout()), auctionFailed.getAdUnit().getExtra());
        }
        AuctionResult.Bidding bidding = (AuctionResult.Bidding) auctionResult;
        BidStat stat2 = bidding.getAdSource().getStat();
        String demandId3 = stat2.getDemandId().getDemandId();
        String code4 = bidding.getRoundStatus().getCode();
        Double dValueOf3 = Double.valueOf(stat2.getPrice());
        TokenInfo tokenInfo3 = stat2.getTokenInfo();
        Long tokenStartTs2 = tokenInfo3 != null ? tokenInfo3.getTokenStartTs() : null;
        TokenInfo tokenInfo4 = stat2.getTokenInfo();
        Long tokenFinishTs = tokenInfo4 != null ? tokenInfo4.getTokenFinishTs() : null;
        String code5 = BidType.RTB.getCode();
        Long fillStartTs2 = stat2.getFillStartTs();
        Long fillFinishTs2 = stat2.getFillFinishTs();
        AdUnit adUnit5 = stat2.getAdUnit();
        String uid2 = adUnit5 != null ? adUnit5.getUid() : null;
        AdUnit adUnit6 = stat2.getAdUnit();
        String label2 = adUnit6 != null ? adUnit6.getLabel() : null;
        String statusMessage2 = getStatusMessage(bidding.getRoundStatus());
        AdUnit adUnit7 = stat2.getAdUnit();
        Long lValueOf2 = adUnit7 != null ? Long.valueOf(adUnit7.getTimeout()) : null;
        AdUnit adUnit8 = stat2.getAdUnit();
        return new StatsAdUnit(demandId3, code4, dValueOf3, tokenStartTs2, tokenFinishTs, code5, fillStartTs2, fillFinishTs2, uid2, label2, statusMessage2, lValueOf2, adUnit8 != null ? adUnit8.getExtra() : null);
    }

    private final StatsRequestBody asStatsRequestBody(RoundStat roundStat, String str, long j10, String str2, long j11, long j12) {
        ResultBody resultBody = getResultBody(j11, j12);
        return new StatsRequestBody(str, j10, str2, roundStat.getPricefloor(), roundStat.getDemands(), resultBody);
    }

    private final String getFinalStatus(String currentStatus, boolean isWinner) {
        return isWinner ? RoundStatus.Win.INSTANCE.getCode() : Intrinsics.areEqual(currentStatus, RoundStatus.Successful.INSTANCE.getCode()) ? RoundStatus.Lose.INSTANCE.getCode() : currentStatus == null ? "NO_EXPLANATION_AVAILABLE" : currentStatus;
    }

    private final ResultBody getResultBody(long auctionStartTs, long auctionFinishTs) {
        String code;
        AdUnit adUnit;
        AdUnit adUnit2;
        BidType bidType;
        DemandId demandId;
        AdSource<?> adSource;
        AuctionResult winner = getWinner();
        String label = null;
        RoundStatus roundStatus = winner != null ? winner.getRoundStatus() : null;
        RoundStatus.Successful successful = RoundStatus.Successful.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(roundStatus, successful);
        AuctionResult winner2 = getWinner();
        BidStat stat = (winner2 == null || (adSource = winner2.getAdSource()) == null) ? null : adSource.getStat();
        LogExtKt.logInfo("AuctionStat", "isSucceed=" + zAreEqual + ", stat: " + stat);
        if (this.isAuctionCanceled) {
            code = RoundStatus.AuctionCancelled.INSTANCE.getCode();
        } else {
            AuctionResult winner3 = getWinner();
            code = Intrinsics.areEqual(winner3 != null ? winner3.getRoundStatus() : null, successful) ? "SUCCESS" : "FAIL";
        }
        String str = code;
        String demandId2 = zAreEqual ? (stat == null || (demandId = stat.getDemandId()) == null) ? null : demandId.getDemandId() : null;
        Double dValueOf = zAreEqual ? stat != null ? Double.valueOf(stat.getPrice()) : null : null;
        String code2 = (stat == null || (bidType = stat.getBidType()) == null) ? null : bidType.getCode();
        String uid = (stat == null || (adUnit2 = stat.getAdUnit()) == null) ? null : adUnit2.getUid();
        if (stat != null && (adUnit = stat.getAdUnit()) != null) {
            label = adUnit.getLabel();
        }
        return new ResultBody(str, demandId2, code2, dValueOf, uid, label, auctionStartTs, auctionFinishTs, this.bannerRequestBody, this.interstitialRequestBody, this.rewardedRequestBody);
    }

    private final CoroutineScope getScope() {
        return i.a(SdkDispatchers.INSTANCE.getIO());
    }

    private final String getStatusMessage(RoundStatus roundStatus) {
        if (roundStatus instanceof RoundStatus.UnspecifiedException) {
            return ((RoundStatus.UnspecifiedException) roundStatus).getErrorMessage();
        }
        if (roundStatus instanceof RoundStatus.IncorrectAdUnit) {
            return ((RoundStatus.IncorrectAdUnit) roundStatus).getErrorMessage();
        }
        return null;
    }

    private final AuctionResult getWinner() {
        if (this.isAuctionCanceled) {
            return null;
        }
        return this.winner;
    }

    private final AuctionResult updateWinnerIfNeed(AuctionResult roundWinner) {
        AdSource<?> adSource;
        BidStat stat;
        if (roundWinner == null) {
            return getWinner();
        }
        AuctionResult winner = getWinner();
        if (((winner == null || (adSource = winner.getAdSource()) == null || (stat = adSource.getStat()) == null) ? 0.0d : stat.getPrice()) >= roundWinner.getAdSource().getStat().getPrice()) {
            return getWinner();
        }
        this.winner = roundWinner;
        return roundWinner;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // org.bidon.sdk.auction.usecases.AuctionStat
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object addRoundResults(@org.jetbrains.annotations.NotNull org.bidon.sdk.auction.usecases.models.RoundResult.Results r31, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.AuctionStatImpl.addRoundResults(org.bidon.sdk.auction.usecases.models.RoundResult$Results, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.bidon.sdk.auction.usecases.AuctionStat
    public void markAuctionCanceled() {
        this.isAuctionCanceled = true;
    }

    @Override // org.bidon.sdk.auction.usecases.AuctionStat
    public void markAuctionStarted(@NotNull String auctionId, @NotNull AdTypeParam adTypeParam) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adTypeParam, "adTypeParam");
        this.auctionId = auctionId;
        this.auctionStartTs = LocalDateTimeExtKt.getSystemTimeNow();
        Triple tripleAsAdRequestBody = AdTypeParamExtKt.asAdRequestBody(adTypeParam);
        BannerRequest bannerRequest = (BannerRequest) tripleAsAdRequestBody.d();
        InterstitialRequest interstitialRequest = (InterstitialRequest) tripleAsAdRequestBody.g();
        RewardedRequest rewardedRequest = (RewardedRequest) tripleAsAdRequestBody.h();
        this.bannerRequestBody = bannerRequest;
        this.interstitialRequestBody = interstitialRequest;
        this.rewardedRequestBody = rewardedRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    @Override // org.bidon.sdk.auction.usecases.AuctionStat
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bidon.sdk.stats.models.StatsRequestBody sendAuctionStats(@org.jetbrains.annotations.NotNull org.bidon.sdk.auction.models.AuctionResponse r36, @org.jetbrains.annotations.Nullable org.bidon.sdk.stats.models.RoundStat r37, @org.jetbrains.annotations.NotNull org.bidon.sdk.adapter.DemandAd r38) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.AuctionStatImpl.sendAuctionStats(org.bidon.sdk.auction.models.AuctionResponse, org.bidon.sdk.stats.models.RoundStat, org.bidon.sdk.adapter.DemandAd):org.bidon.sdk.stats.models.StatsRequestBody");
    }
}
