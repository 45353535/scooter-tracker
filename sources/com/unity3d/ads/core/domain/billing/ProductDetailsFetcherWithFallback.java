package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {

    @NotNull
    private final ProductDetailsFetcher primaryFetcher;

    @NotNull
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, 24}, m = "fetchProductDetails")
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
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(@NotNull ProductDetailsFetcher primaryFetcher, @NotNull ProductDetailsFetcher secondaryFetcher) {
        Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetchProductDetails(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1 r0 = new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r9 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r9
            kotlin.d.b(r10)
            goto L90
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.d.b(r10)
            return r10
        L3f:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback r2 = (com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback) r2
            kotlin.d.b(r10)
            goto L5e
        L4b:
            kotlin.d.b(r10)
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r8.primaryFetcher
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.fetchProductDetails(r9, r0)
            if (r10 != r1) goto L5d
            goto L8c
        L5d:
            r2 = r8
        L5e:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r5 == 0) goto L65
            return r10
        L65:
            boolean r5 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.NotFound
            r6 = 0
            if (r5 == 0) goto L7a
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r10 = r2.secondaryFetcher
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r9 = r10.fetchProductDetails(r9, r0)
            if (r9 != r1) goto L79
            goto L8c
        L79:
            return r9
        L7a:
            boolean r4 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Failure
            if (r4 == 0) goto L98
            com.unity3d.ads.core.domain.billing.ProductDetailsFetcher r2 = r2.secondaryFetcher
            r0.L$0 = r10
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r2.fetchProductDetails(r9, r0)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r7 = r10
            r10 = r9
            r9 = r7
        L90:
            com.unity3d.ads.core.domain.billing.ProductDetailsResult r10 = (com.unity3d.ads.core.domain.billing.ProductDetailsResult) r10
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.billing.ProductDetailsResult.Success
            if (r0 == 0) goto L97
            return r10
        L97:
            return r9
        L98:
            lf.m r9 = new lf.m
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback.fetchProductDetails(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
