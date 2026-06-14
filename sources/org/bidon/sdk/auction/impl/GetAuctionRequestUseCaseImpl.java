package org.bidon.sdk.auction.impl;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.banner.helper.GetOrientationUseCase;
import org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase;
import org.bidon.sdk.databinders.DataBinderType;
import org.bidon.sdk.segment.SegmentSynchronizer;
import org.bidon.sdk.utils.networking.requests.CreateRequestBodyUseCase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJV\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/bidon/sdk/auction/impl/GetAuctionRequestUseCaseImpl;", "Lorg/bidon/sdk/auction/usecases/GetAuctionRequestUseCase;", "createRequestBody", "Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;", "getOrientation", "Lorg/bidon/sdk/ads/banner/helper/GetOrientationUseCase;", "segmentSynchronizer", "Lorg/bidon/sdk/segment/SegmentSynchronizer;", "<init>", "(Lorg/bidon/sdk/utils/networking/requests/CreateRequestBodyUseCase;Lorg/bidon/sdk/ads/banner/helper/GetOrientationUseCase;Lorg/bidon/sdk/segment/SegmentSynchronizer;)V", "binders", "", "Lorg/bidon/sdk/databinders/DataBinderType;", "request", "Lkotlin/Result;", "Lorg/bidon/sdk/auction/models/AuctionResponse;", "adTypeParam", "Lorg/bidon/sdk/auction/AdTypeParam;", "auctionId", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "adapters", "", "Lorg/bidon/sdk/adapter/AdapterInfo;", "tokens", "Lorg/bidon/sdk/auction/models/TokenInfo;", "request-hUnOzRk", "(Lorg/bidon/sdk/auction/AdTypeParam;Ljava/lang/String;Lorg/bidon/sdk/adapter/DemandAd;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetAuctionRequestUseCaseImpl implements GetAuctionRequestUseCase {

    @NotNull
    private final List<DataBinderType> binders;

    @NotNull
    private final CreateRequestBodyUseCase createRequestBody;

    @NotNull
    private final GetOrientationUseCase getOrientation;

    @NotNull
    private final SegmentSynchronizer segmentSynchronizer;

    public GetAuctionRequestUseCaseImpl(@NotNull CreateRequestBodyUseCase createRequestBody, @NotNull GetOrientationUseCase getOrientation, @NotNull SegmentSynchronizer segmentSynchronizer) {
        Intrinsics.checkNotNullParameter(createRequestBody, "createRequestBody");
        Intrinsics.checkNotNullParameter(getOrientation, "getOrientation");
        Intrinsics.checkNotNullParameter(segmentSynchronizer, "segmentSynchronizer");
        this.createRequestBody = createRequestBody;
        this.getOrientation = getOrientation;
        this.segmentSynchronizer = segmentSynchronizer;
        this.binders = CollectionsKt.listOf((Object[]) new DataBinderType[]{DataBinderType.AvailableAdapters, DataBinderType.Device, DataBinderType.App, DataBinderType.Token, DataBinderType.Session, DataBinderType.User, DataBinderType.Segment, DataBinderType.Reg, DataBinderType.Test});
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // org.bidon.sdk.auction.usecases.GetAuctionRequestUseCase
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: request-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo8671requesthUnOzRk(@org.jetbrains.annotations.NotNull org.bidon.sdk.auction.AdTypeParam r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull org.bidon.sdk.adapter.DemandAd r14, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, org.bidon.sdk.adapter.AdapterInfo> r15, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, org.bidon.sdk.auction.models.TokenInfo> r16, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r17) {
        /*
            r11 = this;
            r15 = r17
            boolean r0 = r15 instanceof org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$1
            if (r0 == 0) goto L15
            r0 = r15
            org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$1 r0 = (org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L15:
            org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$1 r0 = new org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$1
            r0.<init>(r11, r15)
        L1a:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r15)
            goto L51
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.d.b(r15)
            org.bidon.sdk.utils.SdkDispatchers r15 = org.bidon.sdk.utils.SdkDispatchers.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r15 = r15.getIO()
            org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$2 r4 = new org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl$request$2
            r10 = 0
            r6 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            r8 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.label = r3
            java.lang.Object r15 = eg.g.g(r15, r4, r0)
            if (r15 != r1) goto L51
            return r1
        L51:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.l()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.auction.impl.GetAuctionRequestUseCaseImpl.mo8671requesthUnOzRk(org.bidon.sdk.auction.AdTypeParam, java.lang.String, org.bidon.sdk.adapter.DemandAd, java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
