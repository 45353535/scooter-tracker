package com.unity3d.ads.core.domain.billing;

import com.ironsource.C4240b4;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "billingClientAdapter", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", C4240b4.i.f42638m, "", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Ljava/lang/String;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final String productType;

    public CommonProductDetailsFetcher(@Nullable BillingClientAdapter billingClientAdapter, @NotNull String productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    public Object fetchProductDetails(@NotNull String str, @NotNull Continuation continuation) {
        final e eVar = new e(b.d(continuation), 1);
        eVar.I();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(@NotNull BillingResultBridge billingResult, @Nullable String str2) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                if (str2 != null && billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    CancellableContinuation cancellableContinuation = eVar;
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(new ProductDetailsResult.Success(str2)));
                } else if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    CancellableContinuation cancellableContinuation2 = eVar;
                    Result.Companion companion2 = Result.f93230c;
                    cancellableContinuation2.resumeWith(Result.b(ProductDetailsResult.NotFound.INSTANCE));
                } else {
                    CancellableContinuation cancellableContinuation3 = eVar;
                    Result.Companion companion3 = Result.f93230c;
                    cancellableContinuation3.resumeWith(Result.b(new ProductDetailsResult.Failure(billingResult)));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object objC = eVar.C();
        if (objC == b.g()) {
            g.c(continuation);
        }
        return objC;
    }
}
