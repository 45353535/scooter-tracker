package org.bidon.sdk.auction.usecases.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import lf.m;
import org.bidon.sdk.adapter.AdAuctionParams;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.auction.usecases.RequestAdUnitUseCase;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/auction/usecases/impl/RequestAdUnitUseCaseImpl;", "Lorg/bidon/sdk/auction/usecases/RequestAdUnitUseCase;", "<init>", "()V", "invoke", "Lorg/bidon/sdk/auction/models/AuctionResult;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "Lorg/bidon/sdk/adapter/AdAuctionParams;", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "priceFloor", "", "(Lorg/bidon/sdk/adapter/AdSource;Lorg/bidon/sdk/auction/models/AdUnit;Lorg/bidon/sdk/auction/AdTypeParam;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuctionResult", "bidType", "Lorg/bidon/sdk/stats/models/BidType;", "requestStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestAdUnitUseCaseImpl implements RequestAdUnitUseCase {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* JADX INFO: renamed from: org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl", f = "RequestAdUnitUseCaseImpl.kt", l = {30}, m = "invoke")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return RequestAdUnitUseCaseImpl.this.invoke(null, null, null, 0.0d, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuctionResult getAuctionResult(BidType bidType, AdSource<AdAuctionParams> adSource, RoundStatus requestStatus) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[bidType.ordinal()];
        if (i10 == 1) {
            return new AuctionResult.Bidding(adSource, requestStatus);
        }
        if (i10 == 2) {
            return new AuctionResult.Network(adSource, requestStatus);
        }
        throw new m();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // org.bidon.sdk.auction.usecases.RequestAdUnitUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull org.bidon.sdk.adapter.AdSource<org.bidon.sdk.adapter.AdAuctionParams> r15, @org.jetbrains.annotations.NotNull org.bidon.sdk.auction.models.AdUnit r16, @org.jetbrains.annotations.NotNull org.bidon.sdk.auction.AdTypeParam r17, double r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r20) {
        /*
            r14 = this;
            r0 = r20
            boolean r1 = r0 instanceof org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl.AnonymousClass1
            if (r1 == 0) goto L16
            r1 = r0
            org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$1 r1 = (org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$1 r1 = new org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.result
            java.lang.Object r9 = pf.b.g()
            int r1 = r8.label
            r10 = 1
            if (r1 == 0) goto L44
            if (r1 != r10) goto L3c
            java.lang.Object r1 = r8.L$2
            org.bidon.sdk.auction.models.AdUnit r1 = (org.bidon.sdk.auction.models.AdUnit) r1
            java.lang.Object r2 = r8.L$1
            org.bidon.sdk.adapter.AdSource r2 = (org.bidon.sdk.adapter.AdSource) r2
            java.lang.Object r3 = r8.L$0
            org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl r3 = (org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl) r3
            kotlin.d.b(r0)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6a
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            kotlin.d.b(r0)
            long r11 = r16.getTimeout()
            org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1 r0 = new org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl$invoke$result$1
            r7 = 0
            r6 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r8.L$0 = r14
            r8.L$1 = r15
            r8.L$2 = r2
            r8.label = r10
            java.lang.Object r0 = eg.x1.e(r11, r0, r8)
            if (r0 != r9) goto L68
            return r9
        L68:
            r3 = r14
            r1 = r15
        L6a:
            org.bidon.sdk.auction.models.AuctionResult r0 = (org.bidon.sdk.auction.models.AuctionResult) r0
            if (r0 != 0) goto L9f
            long r4 = r2.getTimeout()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "FillFinished: "
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = ". \nResult: FillTimeoutReached. Timeout: "
            r0.append(r7)
            r0.append(r4)
            java.lang.String r4 = " "
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "RequestAdUnitUseCase"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r4, r0)
            org.bidon.sdk.stats.models.BidType r0 = r2.getBidType()
            org.bidon.sdk.stats.models.RoundStatus$FillTimeoutReached r2 = org.bidon.sdk.stats.models.RoundStatus.FillTimeoutReached.INSTANCE
            org.bidon.sdk.auction.models.AuctionResult r0 = r3.getAuctionResult(r0, r1, r2)
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.usecases.impl.RequestAdUnitUseCaseImpl.invoke(org.bidon.sdk.adapter.AdSource, org.bidon.sdk.auction.models.AdUnit, org.bidon.sdk.auction.AdTypeParam, double, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
