package org.bidon.sdk.auction.impl;

import com.ironsource.X0;
import hg.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.m;
import org.bidon.sdk.auction.AuctionResolver;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.usecases.models.BiddingResult;
import org.bidon.sdk.auction.usecases.models.RoundResult;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.ext.LocalDateTimeExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\u00020\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bH\u0017J\u0018\u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0015H\u0097@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lorg/bidon/sdk/auction/impl/ResultsCollectorImpl;", "Lorg/bidon/sdk/auction/ResultsCollector;", "resolver", "Lorg/bidon/sdk/auction/AuctionResolver;", "<init>", "(Lorg/bidon/sdk/auction/AuctionResolver;)V", "auctionResults", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "roundResult", "Lorg/bidon/sdk/auction/usecases/models/RoundResult;", "serverBiddingStarted", "", "serverBiddingFinished", X0.f42007c, "Lorg/bidon/sdk/auction/models/AdUnit;", "setNoBidInfo", "noBidsInfo", "startRound", "pricefloor", "", "add", "result", "getAll", "clear", "saveWinners", "sourcePriceFloor", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "biddingTimeoutReached", "getRoundResults", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResultsCollectorImpl implements ResultsCollector {

    @NotNull
    private final MutableStateFlow auctionResults;

    @NotNull
    private final AuctionResolver resolver;

    @NotNull
    private final MutableStateFlow roundResult;

    /* JADX INFO: renamed from: org.bidon.sdk.auction.impl.ResultsCollectorImpl$saveWinners$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.ResultsCollectorImpl", f = "ResultsCollectorImpl.kt", l = {177}, m = "saveWinners")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return ResultsCollectorImpl.this.saveWinners(0.0d, this);
        }
    }

    public ResultsCollectorImpl(@NotNull AuctionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.resolver = resolver;
        this.auctionResults = l0.a(CollectionsKt.emptyList());
        this.roundResult = l0.a(RoundResult.Idle.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // org.bidon.sdk.auction.ResultsCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void add(@org.jetbrains.annotations.NotNull org.bidon.sdk.auction.models.AuctionResult r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.ResultsCollectorImpl.add(org.bidon.sdk.auction.models.AuctionResult):void");
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void biddingTimeoutReached() {
        Object value;
        RoundResult.Results results;
        Pair pair;
        Long l10;
        MutableStateFlow mutableStateFlow = this.roundResult;
        do {
            value = mutableStateFlow.getValue();
            RoundResult roundResult = (RoundResult) value;
            if (!(roundResult instanceof RoundResult.Results)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            results = (RoundResult.Results) roundResult;
            BiddingResult biddingResult = results.getBiddingResult();
            if (biddingResult instanceof BiddingResult.ServerBiddingStarted) {
                pair = TuplesKt.to(Long.valueOf(((BiddingResult.ServerBiddingStarted) results.getBiddingResult()).getServerBiddingStartTs()), Long.valueOf(LocalDateTimeExtKt.getSystemTimeNow()));
            } else if (biddingResult instanceof BiddingResult.FilledAd) {
                pair = TuplesKt.to(Long.valueOf(((BiddingResult.FilledAd) results.getBiddingResult()).getServerBiddingStartTs()), Long.valueOf(((BiddingResult.FilledAd) results.getBiddingResult()).getServerBiddingFinishTs()));
            } else if (Intrinsics.areEqual(biddingResult, BiddingResult.Idle.INSTANCE)) {
                pair = TuplesKt.to(null, null);
            } else if (biddingResult instanceof BiddingResult.NoBid) {
                pair = TuplesKt.to(Long.valueOf(((BiddingResult.NoBid) results.getBiddingResult()).getServerBiddingStartTs()), Long.valueOf(((BiddingResult.NoBid) results.getBiddingResult()).getServerBiddingFinishTs()));
            } else {
                if (!(biddingResult instanceof BiddingResult.TimeoutReached)) {
                    throw new m();
                }
                pair = TuplesKt.to(Long.valueOf(((BiddingResult.TimeoutReached) results.getBiddingResult()).getServerBiddingStartTs()), ((BiddingResult.TimeoutReached) results.getBiddingResult()).getServerBiddingFinishTs());
            }
            l10 = (Long) pair.component1();
        } while (!mutableStateFlow.b(value, new RoundResult.Results(results.getPricefloor(), new BiddingResult.TimeoutReached(l10 != null ? l10.longValue() : 0L, (Long) pair.component2()), results.getNetworkResults(), results.getNoBidsInfo())));
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void clear() {
        this.auctionResults.setValue(CollectionsKt.emptyList());
        this.roundResult.setValue(RoundResult.Idle.INSTANCE);
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    @NotNull
    public List<AuctionResult> getAll() {
        return (List) this.auctionResults.getValue();
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    @NotNull
    public RoundResult getRoundResults() {
        return (RoundResult) this.roundResult.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010d -> B:49:0x0110). Please report as a decompilation issue!!! */
    @Override // org.bidon.sdk.auction.ResultsCollector
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object saveWinners(double r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.ResultsCollectorImpl.saveWinners(double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void serverBiddingFinished(@Nullable List<AdUnit> adUnits) {
        Object value;
        RoundResult results;
        BiddingResult biddingResult;
        MutableStateFlow mutableStateFlow = this.roundResult;
        do {
            value = mutableStateFlow.getValue();
            results = (RoundResult) value;
            if (!Intrinsics.areEqual(results, RoundResult.Idle.INSTANCE)) {
                if (!(results instanceof RoundResult.Results)) {
                    throw new m();
                }
                RoundResult.Results results2 = (RoundResult.Results) results;
                if (results2.getBiddingResult() instanceof BiddingResult.ServerBiddingStarted) {
                    List<AdUnit> list = adUnits;
                    biddingResult = (list == null || list.isEmpty()) ? new BiddingResult.NoBid(((BiddingResult.ServerBiddingStarted) results2.getBiddingResult()).getServerBiddingStartTs(), LocalDateTimeExtKt.getSystemTimeNow()) : new BiddingResult.FilledAd(((BiddingResult.ServerBiddingStarted) results2.getBiddingResult()).getServerBiddingStartTs(), LocalDateTimeExtKt.getSystemTimeNow(), adUnits, CollectionsKt.emptyList());
                } else {
                    LogExtKt.logError("ResultsCollector", "Unexpected bidding result: " + results2.getBiddingResult(), null);
                    biddingResult = results2.getBiddingResult();
                }
                results = new RoundResult.Results(results2.getPricefloor(), biddingResult, results2.getNetworkResults(), results2.getNoBidsInfo());
            }
        } while (!mutableStateFlow.b(value, results));
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void serverBiddingStarted() {
        Object value;
        RoundResult.Results results;
        MutableStateFlow mutableStateFlow = this.roundResult;
        do {
            value = mutableStateFlow.getValue();
            RoundResult roundResult = (RoundResult) value;
            if (!(roundResult instanceof RoundResult.Results)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            results = (RoundResult.Results) roundResult;
        } while (!mutableStateFlow.b(value, new RoundResult.Results(results.getPricefloor(), new BiddingResult.ServerBiddingStarted(LocalDateTimeExtKt.getSystemTimeNow()), results.getNetworkResults(), results.getNoBidsInfo())));
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void setNoBidInfo(@Nullable List<AdUnit> noBidsInfo) {
        MutableStateFlow mutableStateFlow = this.roundResult;
        while (true) {
            Object value = mutableStateFlow.getValue();
            RoundResult roundResult = (RoundResult) value;
            if (!(roundResult instanceof RoundResult.Results)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            RoundResult.Results results = (RoundResult.Results) roundResult;
            List<AdUnit> list = noBidsInfo;
            if (mutableStateFlow.b(value, new RoundResult.Results(results.getPricefloor(), results.getBiddingResult(), results.getNetworkResults(), list))) {
                return;
            } else {
                noBidsInfo = list;
            }
        }
    }

    @Override // org.bidon.sdk.auction.ResultsCollector
    public void startRound(double pricefloor) {
        this.roundResult.setValue(new RoundResult.Results(pricefloor, BiddingResult.Idle.INSTANCE, CollectionsKt.emptyList(), CollectionsKt.emptyList()));
    }
}
