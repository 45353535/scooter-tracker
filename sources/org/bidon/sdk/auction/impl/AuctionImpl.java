package org.bidon.sdk.auction.impl;

import com.my.target.common.menu.MenuActionType;
import hg.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.i;
import lf.m;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdaptersSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.WinLossNotifiable;
import org.bidon.sdk.ads.AdUnitInfo;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.ext.AuctionInfoExtKt;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.Auction;
import org.bidon.sdk.auction.ResultsCollector;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.AuctionCancellation;
import org.bidon.sdk.auction.models.AuctionResponse;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.usecases.AuctionStat;
import org.bidon.sdk.auction.usecases.ExecuteAuctionUseCase;
import org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase;
import org.bidon.sdk.auction.usecases.GetTokensUseCase;
import org.bidon.sdk.auction.usecases.models.RoundResult;
import org.bidon.sdk.bidding.BiddingConfig;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.models.RoundStat;
import org.bidon.sdk.stats.models.RoundStatus;
import org.bidon.sdk.stats.models.StatsAdUnit;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u001a\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0017\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJN\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020\u00130'2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#H\u0082@¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010,\u001a\u00020\u0013H\u0002¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u00102J%\u00106\u001a\u00020\u00152\f\u00103\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J[\u00109\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00102\u001e\u00108\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00150\u00122\u001a\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0015H\u0016¢\u0006\u0004\b;\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010D\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lorg/bidon/sdk/auction/impl/AuctionImpl;", "Lorg/bidon/sdk/auction/Auction;", "Lorg/bidon/sdk/adapter/AdaptersSource;", "adaptersSource", "Lorg/bidon/sdk/auction/usecases/GetTokensUseCase;", "getTokens", "Lorg/bidon/sdk/auction/usecases/GetAuctionRequestUseCase;", "getAuctionRequest", "Lorg/bidon/sdk/auction/usecases/ExecuteAuctionUseCase;", "executeAuction", "Lorg/bidon/sdk/auction/usecases/AuctionStat;", "auctionStat", "Lorg/bidon/sdk/bidding/BiddingConfig;", "biddingConfig", "<init>", "(Lorg/bidon/sdk/adapter/AdaptersSource;Lorg/bidon/sdk/auction/usecases/GetTokensUseCase;Lorg/bidon/sdk/auction/usecases/GetAuctionRequestUseCase;Lorg/bidon/sdk/auction/usecases/ExecuteAuctionUseCase;Lorg/bidon/sdk/auction/usecases/AuctionStat;Lorg/bidon/sdk/bidding/BiddingConfig;)V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "Lkotlin/Function2;", "Lorg/bidon/sdk/ads/AuctionInfo;", "", "", "onFailure", "cause", "processAuctionFailed", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/jvm/functions/Function2;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "auctionData", "Lorg/bidon/sdk/stats/models/RoundStat;", "statResult", "getAuctionInfo", "(Lorg/bidon/sdk/auction/models/AuctionResponse;Lorg/bidon/sdk/stats/models/RoundStat;)Lorg/bidon/sdk/ads/AuctionInfo;", "Lorg/bidon/sdk/adapter/DemandAd;", "demandAd", "adTypeParamData", "", "", "Lorg/bidon/sdk/auction/models/TokenInfo;", "tokens", "Lkotlin/Pair;", "", "Lorg/bidon/sdk/auction/models/AuctionResult;", "conductAuction", "(Lorg/bidon/sdk/auction/models/AuctionResponse;Lorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/auction/AdTypeParam;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auctionInfo", "printStatsData", "(Lorg/bidon/sdk/auction/models/AuctionResponse;Lorg/bidon/sdk/stats/models/RoundStat;Lorg/bidon/sdk/ads/AuctionInfo;)V", "proceedRoundResults", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearData", "()V", "finalResults", "", "externalWinNotificationsEnabled", "notifyWinLoss", "(Ljava/util/List;Z)V", "onSuccess", "start", "(Lorg/bidon/sdk/adapter/DemandAd;Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", MenuActionType.CANCEL, "Lorg/bidon/sdk/adapter/AdaptersSource;", "Lorg/bidon/sdk/auction/usecases/GetTokensUseCase;", "Lorg/bidon/sdk/auction/usecases/GetAuctionRequestUseCase;", "Lorg/bidon/sdk/auction/usecases/ExecuteAuctionUseCase;", "Lorg/bidon/sdk/auction/usecases/AuctionStat;", "Lorg/bidon/sdk/bidding/BiddingConfig;", "Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/auction/Auction$AuctionState;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_auctionDataResponse", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "_demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Lorg/bidon/sdk/auction/ResultsCollector;", "resultsCollector$delegate", "getResultsCollector", "()Lorg/bidon/sdk/auction/ResultsCollector;", "resultsCollector", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuctionImpl implements Auction {

    @Nullable
    private AuctionResponse _auctionDataResponse;

    @Nullable
    private DemandAd _demandAd;

    @NotNull
    private final AdaptersSource adaptersSource;

    @NotNull
    private final AuctionStat auctionStat;

    @NotNull
    private final BiddingConfig biddingConfig;

    @NotNull
    private final ExecuteAuctionUseCase executeAuction;

    @NotNull
    private final GetAuctionRequestUseCase getAuctionRequest;

    @NotNull
    private final GetTokensUseCase getTokens;

    @Nullable
    private Job job;

    /* JADX INFO: renamed from: resultsCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultsCollector;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private final MutableStateFlow state;

    /* JADX INFO: renamed from: org.bidon.sdk.auction.impl.AuctionImpl$conductAuction$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.AuctionImpl", f = "AuctionImpl.kt", l = {190, 204, 206, 235}, m = "conductAuction")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        double D$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
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
            return AuctionImpl.this.conductAuction(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.impl.AuctionImpl$conductAuction$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lorg/bidon/sdk/auction/Auction$AuctionState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.AuctionImpl$conductAuction$3", f = "AuctionImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<Auction.AuctionState, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((Auction.AuctionState) this.L$0) == Auction.AuctionState.Finished);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Auction.AuctionState auctionState, Continuation continuation) {
            return ((AnonymousClass3) create(auctionState, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.impl.AuctionImpl$processAuctionFailed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.AuctionImpl", f = "AuctionImpl.kt", l = {138}, m = "processAuctionFailed")
    static final class C58141 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C58141(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuctionImpl.this.processAuctionFailed(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.auction.impl.AuctionImpl$start$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.auction.impl.AuctionImpl$start$1", f = "AuctionImpl.kt", l = {83, 89, 106, 123, 127}, m = "invokeSuspend")
    static final class C58151 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ AdTypeParam $adTypeParam;
        final /* synthetic */ DemandAd $demandAd;
        final /* synthetic */ Function2<AuctionInfo, Throwable, Unit> $onFailure;
        final /* synthetic */ Function2<List<? extends AuctionResult>, AuctionInfo, Unit> $onSuccess;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C58151(AdTypeParam adTypeParam, DemandAd demandAd, Function2<? super AuctionInfo, ? super Throwable, Unit> function2, Function2<? super List<? extends AuctionResult>, ? super AuctionInfo, Unit> function22, Continuation continuation) {
            super(2, continuation);
            this.$adTypeParam = adTypeParam;
            this.$demandAd = demandAd;
            this.$onFailure = function2;
            this.$onSuccess = function22;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$6$lambda$4$lambda$2(Function2 function2, AuctionInfo auctionInfo) {
            function2.invoke(auctionInfo, BidonError.NoAuctionResults.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58151 c58151 = AuctionImpl.this.new C58151(this.$adTypeParam, this.$demandAd, this.$onFailure, this.$onSuccess, continuation);
            c58151.L$0 = obj;
            return c58151;
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x02bd, code lost:
        
            if (r1.processAuctionFailed(r2, r3, r4, r6) == r7) goto L87;
         */
        /* JADX WARN: Removed duplicated region for block: B:69:0x022d A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:18:0x0042, B:67:0x0219, B:69:0x022d, B:71:0x0246, B:70:0x023a), top: B:94:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x023a A[Catch: all -> 0x004a, TryCatch #2 {all -> 0x004a, blocks: (B:18:0x0042, B:67:0x0219, B:69:0x022d, B:71:0x0246, B:70:0x023a), top: B:94:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x025b A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:13:0x002a, B:80:0x0283, B:75:0x025f, B:77:0x0265, B:73:0x0250, B:23:0x0069, B:47:0x0194, B:74:0x025b, B:26:0x0094, B:43:0x0188, B:29:0x00b2), top: B:96:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0265 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:13:0x002a, B:80:0x0283, B:75:0x025f, B:77:0x0265, B:73:0x0250, B:23:0x0069, B:47:0x0194, B:74:0x025b, B:26:0x0094, B:43:0x0188, B:29:0x00b2), top: B:96:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 707
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.AuctionImpl.C58151.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58151) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AuctionImpl(@NotNull AdaptersSource adaptersSource, @NotNull GetTokensUseCase getTokens, @NotNull GetAuctionRequestUseCase getAuctionRequest, @NotNull ExecuteAuctionUseCase executeAuction, @NotNull AuctionStat auctionStat, @NotNull BiddingConfig biddingConfig) {
        Intrinsics.checkNotNullParameter(adaptersSource, "adaptersSource");
        Intrinsics.checkNotNullParameter(getTokens, "getTokens");
        Intrinsics.checkNotNullParameter(getAuctionRequest, "getAuctionRequest");
        Intrinsics.checkNotNullParameter(executeAuction, "executeAuction");
        Intrinsics.checkNotNullParameter(auctionStat, "auctionStat");
        Intrinsics.checkNotNullParameter(biddingConfig, "biddingConfig");
        this.adaptersSource = adaptersSource;
        this.getTokens = getTokens;
        this.getAuctionRequest = getAuctionRequest;
        this.executeAuction = executeAuction;
        this.auctionStat = auctionStat;
        this.biddingConfig = biddingConfig;
        this.scope = i.a(new Function0() { // from class: org.bidon.sdk.auction.impl.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuctionImpl.scope_delegate$lambda$0();
            }
        });
        this.state = l0.a(Auction.AuctionState.Initialized);
        this.resultsCollector = i.a(new Function0() { // from class: org.bidon.sdk.auction.impl.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuctionImpl.resultsCollector_delegate$lambda$1();
            }
        });
    }

    private final void clearData() {
        LogExtKt.logInfo("Auction", "Clearing data");
        getResultsCollector().clear();
        this._auctionDataResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object conductAuction(org.bidon.sdk.auction.models.AuctionResponse r24, org.bidon.sdk.adapter.DemandAd r25, org.bidon.sdk.auction.AdTypeParam r26, java.util.Map<java.lang.String, org.bidon.sdk.auction.models.TokenInfo> r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.AuctionImpl.conductAuction(org.bidon.sdk.auction.models.AuctionResponse, org.bidon.sdk.adapter.DemandAd, org.bidon.sdk.auction.AdTypeParam, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final AuctionInfo getAuctionInfo(AuctionResponse auctionData, RoundStat statResult) {
        ArrayList arrayList;
        List<StatsAdUnit> demands;
        List<AdUnit> noBids;
        String auctionId = auctionData.getAuctionId();
        Long auctionConfigurationId = auctionData.getAuctionConfigurationId();
        String auctionConfigurationUid = auctionData.getAuctionConfigurationUid();
        double pricefloor = auctionData.getPricefloor();
        long auctionTimeout = auctionData.getAuctionTimeout();
        ArrayList arrayList2 = null;
        if (statResult == null || (noBids = statResult.getNoBids()) == null) {
            arrayList = null;
        } else {
            List<AdUnit> list = noBids;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(AuctionInfoExtKt.toAuctionNoBidInfo((AdUnit) it.next()));
            }
            arrayList = arrayList3;
        }
        if (statResult != null && (demands = statResult.getDemands()) != null) {
            List<StatsAdUnit> list2 = demands;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AuctionInfoExtKt.toAuctionInfo((StatsAdUnit) it2.next()));
            }
        }
        return new AuctionInfo(auctionId, auctionConfigurationId, auctionConfigurationUid, auctionTimeout, pricefloor, arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResultsCollector getResultsCollector() {
        return (ResultsCollector) this.resultsCollector.getValue();
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    private final void notifyWinLoss(List<? extends AuctionResult> finalResults, boolean externalWinNotificationsEnabled) {
        AuctionResult auctionResult = (AuctionResult) CollectionsKt.getOrNull(finalResults, 0);
        if (auctionResult == null) {
            return;
        }
        AdSource<?> adSource = auctionResult.getAdSource();
        adSource.markWin();
        if (externalWinNotificationsEnabled) {
            LogExtKt.logInfo("Auction", "Skipped win notification to adapter: " + adSource.getDemandId() + " (external_win_notifications=true, will be notified externally)");
        } else {
            boolean z10 = auctionResult instanceof AuctionResult.Bidding;
            if (!z10 && (adSource instanceof WinLossNotifiable)) {
                ((WinLossNotifiable) adSource).notifyWin();
                LogExtKt.logInfo("Auction", "Notified win to adapter: " + adSource.getDemandId() + " (external_win_notifications=false)");
            } else if (z10) {
                LogExtKt.logInfo("Auction", "Skipped win notification for bidding demand: " + adSource.getDemandId());
            }
        }
        for (AuctionResult auctionResult2 : CollectionsKt.drop(finalResults, 1)) {
            AdSource<?> adSource2 = auctionResult2.getAdSource();
            if (!(auctionResult2 instanceof AuctionResult.Bidding) && (adSource2 instanceof WinLossNotifiable)) {
                LogExtKt.logInfo("Auction", "Notified loss: " + adSource2.getDemandId());
                ((WinLossNotifiable) adSource2).notifyLoss(adSource.getDemandId().getDemandId(), adSource.getStat().getPrice());
            }
            if (Intrinsics.areEqual(auctionResult2.getRoundStatus(), RoundStatus.Successful.INSTANCE)) {
                adSource2.markLoss();
            }
            LogExtKt.logInfo("Auction", "Destroying loser: " + adSource2.getDemandId());
            adSource2.destroy();
        }
    }

    private final void printStatsData(AuctionResponse auctionData, RoundStat statResult, AuctionInfo auctionInfo) {
        List<StatsAdUnit> demands;
        List<AdUnit> adUnits = auctionData.getAdUnits();
        Integer numValueOf = adUnits != null ? Integer.valueOf(adUnits.size()) : null;
        List<AdUnit> noBids = auctionData.getNoBids();
        Integer numValueOf2 = noBids != null ? Integer.valueOf(noBids.size()) : null;
        Integer numValueOf3 = (statResult == null || (demands = statResult.getDemands()) == null) ? null : Integer.valueOf(demands.size());
        List<AdUnitInfo> adUnits2 = auctionInfo.getAdUnits();
        Integer numValueOf4 = adUnits2 != null ? Integer.valueOf(adUnits2.size()) : null;
        List<AdUnitInfo> noBids2 = auctionInfo.getNoBids();
        LogExtKt.logInfo("Auction", "Was received: \nAdUnits: " + numValueOf + " \nNoBids: " + numValueOf2 + "\nWas sent:\nStats: " + numValueOf3 + " \nAuctionInfo AdUnits: " + numValueOf4 + " \nAuctionInfo NoBids: " + (noBids2 != null ? Integer.valueOf(noBids2.size()) : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object proceedRoundResults(Continuation continuation) {
        RoundResult roundResults = getResultsCollector().getRoundResults();
        RoundResult.Results results = roundResults instanceof RoundResult.Results ? (RoundResult.Results) roundResults : null;
        if (results != null) {
            return this.auctionStat.addRoundResults(results, continuation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processAuctionFailed(org.bidon.sdk.auction.AdTypeParam r5, final kotlin.jvm.functions.Function2<? super org.bidon.sdk.ads.AuctionInfo, ? super java.lang.Throwable, kotlin.Unit> r6, final java.lang.Throwable r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof org.bidon.sdk.auction.impl.AuctionImpl.C58141
            if (r0 == 0) goto L13
            r0 = r8
            org.bidon.sdk.auction.impl.AuctionImpl$processAuctionFailed$1 r0 = (org.bidon.sdk.auction.impl.AuctionImpl.C58141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.auction.impl.AuctionImpl$processAuctionFailed$1 r0 = new org.bidon.sdk.auction.impl.AuctionImpl$processAuctionFailed$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r5 = r0.L$3
            r7 = r5
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r5 = r0.L$2
            r6 = r5
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r5 = r0.L$1
            org.bidon.sdk.auction.AdTypeParam r5 = (org.bidon.sdk.auction.AdTypeParam) r5
            java.lang.Object r0 = r0.L$0
            org.bidon.sdk.auction.impl.AuctionImpl r0 = (org.bidon.sdk.auction.impl.AuctionImpl) r0
            kotlin.d.b(r8)
            goto L58
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            kotlin.d.b(r8)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.L$2 = r6
            r0.L$3 = r7
            r0.label = r3
            java.lang.Object r8 = r4.proceedRoundResults(r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r0 = r4
        L58:
            org.bidon.sdk.stats.models.RoundStat r8 = (org.bidon.sdk.stats.models.RoundStat) r8
            org.bidon.sdk.auction.models.AuctionResponse r1 = r0._auctionDataResponse
            if (r1 != 0) goto L72
            java.lang.String r8 = "Auction"
            java.lang.String r1 = "No auction data response info."
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r8, r1)
            android.app.Activity r5 = r5.getActivity()
            org.bidon.sdk.auction.impl.a r8 = new org.bidon.sdk.auction.impl.a
            r8.<init>()
            r5.runOnUiThread(r8)
            goto L85
        L72:
            org.bidon.sdk.ads.AuctionInfo r2 = r0.getAuctionInfo(r1, r8)
            r0.printStatsData(r1, r8, r2)
            android.app.Activity r5 = r5.getActivity()
            org.bidon.sdk.auction.impl.b r8 = new org.bidon.sdk.auction.impl.b
            r8.<init>()
            r5.runOnUiThread(r8)
        L85:
            kotlinx.coroutines.flow.MutableStateFlow r5 = r0.state
            org.bidon.sdk.auction.Auction$AuctionState r6 = org.bidon.sdk.auction.Auction.AuctionState.Finished
            r5.setValue(r6)
            r0.clearData()
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.AuctionImpl.processAuctionFailed(org.bidon.sdk.auction.AdTypeParam, kotlin.jvm.functions.Function2, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResultsCollector resultsCollector_delegate$lambda$1() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(ResultsCollector.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (ResultsCollector) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.ResultsCollector");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (ResultsCollector) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.ResultsCollector");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + ResultsCollector.class).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getMain());
    }

    @Override // org.bidon.sdk.auction.Auction
    public void cancel() {
        Job job = this.job;
        LogExtKt.logInfo("Auction", "Trying to cancel auction. Is active: " + (job != null ? Boolean.valueOf(job.isActive()) : null));
        Job job2 = this.job;
        if (job2 != null && job2.isActive()) {
            Job job3 = this.job;
            if (job3 != null) {
                job3.cancel(new AuctionCancellation());
            }
            this.auctionStat.markAuctionCanceled();
            LogExtKt.logInfo("Auction", "Auction canceled");
        }
        this.job = null;
    }

    @Override // org.bidon.sdk.auction.Auction
    public void start(@NotNull DemandAd demandAd, @NotNull AdTypeParam adTypeParam, @NotNull Function2<? super List<? extends AuctionResult>, ? super AuctionInfo, Unit> onSuccess, @NotNull Function2<? super AuctionInfo, ? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        Intrinsics.checkNotNullParameter(adTypeParam, "adTypeParam");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        if (this.state.b(Auction.AuctionState.Initialized, Auction.AuctionState.InProgress)) {
            Job job = this.job;
            if (job == null || !job.isActive()) {
                this.job = eg.i.d(getScope(), null, null, new C58151(adTypeParam, demandAd, onFailure, onSuccess, null), 3, null);
                return;
            }
            LogExtKt.logInfo("Auction", "Action in progress " + this);
        }
    }
}
