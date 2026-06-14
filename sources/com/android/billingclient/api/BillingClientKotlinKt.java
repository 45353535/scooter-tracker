package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge;
import eg.p;
import eg.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\t\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r\u001a\u001a\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013\u001a\u0012\u0010\u0017\u001a\u00020\u0018*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0019"}, d2 = {"acknowledgePurchase", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/BillingClient;", "params", "Lcom/android/billingclient/api/AcknowledgePurchaseParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/AcknowledgePurchaseParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumePurchase", "Lcom/android/billingclient/api/ConsumeResult;", "Lcom/android/billingclient/api/ConsumeParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/ConsumeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "Lcom/android/billingclient/api/PurchasesResult;", "Lcom/android/billingclient/api/QueryPurchasesParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryPurchasesParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryProductDetails", "Lcom/android/billingclient/api/ProductDetailsResult;", "Lcom/android/billingclient/api/QueryProductDetailsParams;", "(Lcom/android/billingclient/api/BillingClient;Lcom/android/billingclient/api/QueryProductDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAlternativeBillingOnlyAvailable", "(Lcom/android/billingclient/api/BillingClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAlternativeBillingOnlyReportingDetails", "Lcom/android/billingclient/api/CreateAlternativeBillingOnlyReportingDetailsResult;", "isExternalOfferAvailable", "createExternalOfferReportingDetails", "Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BillingClientKotlinKt {
    /* JADX INFO: renamed from: $r8$lambda$BC2cAL2vk_I3dV-pkSAsSywRIek, reason: not valid java name */
    public static /* synthetic */ void m4260$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(new ConsumeResult(billingResult, str));
    }

    public static /* synthetic */ void $r8$lambda$NjHhuq09jAs8F8dpZjv_HsFBRq0(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$UIFqmbqzelSukPAr7gb0UVftOsk(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull QueryProductDetailsResult queryProductDetailsResult) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(new ProductDetailsResult(billingResult, queryProductDetailsResult.getProductDetailsList()));
    }

    /* JADX INFO: renamed from: $r8$lambda$jxN-QYHicJYIZOoHSpSjQpTOUq0, reason: not valid java name */
    public static /* synthetic */ void m4261$r8$lambda$jxNQYHicJYIZOoHSpSjQpTOUq0(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(billingResult);
    }

    public static /* synthetic */ void $r8$lambda$uERt1i0NYhXEQkbmrKSYJisMHH8(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list) {
        Intrinsics.checkNotNull(billingResult);
        Intrinsics.checkNotNull(list);
        pVar.s(new PurchasesResult(billingResult, list));
    }

    /* JADX INFO: renamed from: $r8$lambda$vlcEyDRKESu-E49PJWQAtcRlfoM, reason: not valid java name */
    public static /* synthetic */ void m4262$r8$lambda$vlcEyDRKESuE49PJWQAtcRlfoM(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails));
    }

    public static /* synthetic */ void $r8$lambda$z4VlE67Tlsqm1a7xTsH92uzKGwo(@RecentlyNonNull p pVar, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNull(billingResult);
        pVar.s(new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails));
    }

    @RecentlyNullable
    public static final Object acknowledgePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull AcknowledgePurchaseParams acknowledgePurchaseParams, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.acknowledgePurchase(acknowledgePurchaseParams, new AcknowledgePurchaseResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$mNiIov37EcRv6CLKJbxie9rmtK8(pVarC, billingResult);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object consumePurchase(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull ConsumeParams consumeParams, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.consumeAsync(consumeParams, new ConsumeResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.ConsumeResponseListener
            public final void onConsumeResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull String str) {
                BillingClientKotlinKt.m4260$r8$lambda$BC2cAL2vk_I3dVpkSAsSywRIek(pVarC, billingResult, str);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object createAlternativeBillingOnlyReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.createAlternativeBillingOnlyReportingDetailsAsync(new AlternativeBillingOnlyReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda6
            @Override // com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener
            public final void onAlternativeBillingOnlyTokenResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
                BillingClientKotlinKt.m4262$r8$lambda$vlcEyDRKESuE49PJWQAtcRlfoM(pVarC, billingResult, alternativeBillingOnlyReportingDetails);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object createExternalOfferReportingDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.createExternalOfferReportingDetailsAsync(new ExternalOfferReportingDetailsListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda4
            @Override // com.android.billingclient.api.ExternalOfferReportingDetailsListener
            public final void onExternalOfferReportingDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull ExternalOfferReportingDetails externalOfferReportingDetails) {
                BillingClientKotlinKt.$r8$lambda$z4VlE67Tlsqm1a7xTsH92uzKGwo(pVarC, billingResult, externalOfferReportingDetails);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object isAlternativeBillingOnlyAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.isAlternativeBillingOnlyAvailableAsync(new AlternativeBillingOnlyAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda5
            @Override // com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener
            public final void onAlternativeBillingOnlyAvailabilityResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.m4261$r8$lambda$jxNQYHicJYIZOoHSpSjQpTOUq0(pVarC, billingResult);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object isExternalOfferAvailable(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.isExternalOfferAvailableAsync(new ExternalOfferAvailabilityListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda1
            @Override // com.android.billingclient.api.ExternalOfferAvailabilityListener
            public final void onExternalOfferAvailabilityResponse(@RecentlyNonNull BillingResult billingResult) {
                BillingClientKotlinKt.$r8$lambda$NjHhuq09jAs8F8dpZjv_HsFBRq0(pVarC, billingResult);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object queryProductDetails(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryProductDetailsParams queryProductDetailsParams, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.queryProductDetailsAsync(queryProductDetailsParams, new ProductDetailsResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda2
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull QueryProductDetailsResult queryProductDetailsResult) {
                BillingClientKotlinKt.$r8$lambda$UIFqmbqzelSukPAr7gb0UVftOsk(pVarC, billingResult, queryProductDetailsResult);
            }
        });
        return pVarC.await(continuation);
    }

    @RecentlyNullable
    public static final Object queryPurchasesAsync(@RecentlyNonNull BillingClient billingClient, @RecentlyNonNull QueryPurchasesParams queryPurchasesParams, @RecentlyNonNull Continuation continuation) {
        final p pVarC = r.c(null, 1, null);
        billingClient.queryPurchasesAsync(queryPurchasesParams, new PurchasesResponseListener() { // from class: com.android.billingclient.api.BillingClientKotlinKt$$ExternalSyntheticLambda7
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public final void onQueryPurchasesResponse(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list) {
                BillingClientKotlinKt.$r8$lambda$uERt1i0NYhXEQkbmrKSYJisMHH8(pVarC, billingResult, list);
            }
        });
        return pVarC.await(continuation);
    }
}
