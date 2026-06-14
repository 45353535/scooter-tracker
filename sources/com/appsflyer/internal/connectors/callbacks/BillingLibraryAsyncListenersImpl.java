package com.appsflyer.internal.connectors.callbacks;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.appsflyer.AFLogger;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.Store;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.appsflyer.api.models.PricingPhases;
import com.appsflyer.api.models.SubscriptionOfferDetails;
import com.appsflyer.common.ExtentionsKt;
import com.appsflyer.exceptions.WrongProductTypeException;
import com.appsflyer.internal.connectors.BillingClientConnector;
import com.appsflyer.internal.db.PurchaseDatabaseHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ.\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00180\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00180\u0018H\u0002J.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\u001e\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u00180\u0018H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\f\u001a\u00020\u0011*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013R\u0018\u0010\f\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006)"}, d2 = {"Lcom/appsflyer/internal/connectors/callbacks/BillingLibraryAsyncListenersImpl;", "Lcom/android/billingclient/api/ProductDetailsResponseListener;", "type", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appsflyer/internal/connectors/BillingClientConnector$BillingUpdatesListener;", "newPurchases", "", "Lcom/android/billingclient/api/Purchase;", "isHistory", "", "(Ljava/lang/String;Lcom/appsflyer/internal/connectors/BillingClientConnector$BillingUpdatesListener;Ljava/util/List;Z)V", "wrapper", "Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;", "getWrapper", "(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "Lcom/appsflyer/api/models/PricingPhases;", "Lcom/android/billingclient/api/ProductDetails$PricingPhase;", "(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)Lcom/appsflyer/api/models/PricingPhases;", "Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "filterProductDetails", "", "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "", "getInAppPurchaseWrappers", "Lcom/appsflyer/api/InAppPurchaseEvent;", PurchaseDatabaseHelper.TABLE_NAME, "getSubscriptionPurchaseWrappers", "Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "subs", ProductDetailsResponseListenerProxy.onProductDetailsResponseMethodName, "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "productDetailsResult", "Lcom/android/billingclient/api/QueryProductDetailsResult;", "mapProductDetailsToProductId", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BillingLibraryAsyncListenersImpl implements ProductDetailsResponseListener {
    private final boolean isHistory;

    @NotNull
    private final BillingClientConnector.BillingUpdatesListener listener;

    @Nullable
    private final List<Purchase> newPurchases;

    @NotNull
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public BillingLibraryAsyncListenersImpl(@NotNull String type, @NotNull BillingClientConnector.BillingUpdatesListener listener, @Nullable List<? extends Purchase> list, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.type = type;
        this.listener = listener;
        this.newPurchases = list;
        this.isHistory = z10;
    }

    private final Map<Purchase, Map<String, ProductDetails>> filterProductDetails(List<ProductDetails> productDetails) {
        List<String> products;
        Map<String, ProductDetails> mapMapProductDetailsToProductId = mapProductDetailsToProductId(productDetails);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Purchase> list = this.newPurchases;
        if (list != null) {
            for (Purchase purchase : list) {
                if (purchase != null && (products = purchase.getProducts()) != null) {
                    Intrinsics.checkNotNullExpressionValue(products, "products");
                    for (String newPurchaseProductId : products) {
                        if (!mapMapProductDetailsToProductId.containsKey(newPurchaseProductId)) {
                            break;
                        }
                        if (linkedHashMap.containsKey(purchase)) {
                            Object obj = linkedHashMap.get(purchase);
                            Intrinsics.checkNotNull(obj);
                            Intrinsics.checkNotNullExpressionValue(newPurchaseProductId, "newPurchaseProductId");
                            ProductDetails productDetails2 = mapMapProductDetailsToProductId.get(newPurchaseProductId);
                            Intrinsics.checkNotNull(productDetails2);
                            ((Map) obj).put(newPurchaseProductId, productDetails2);
                        } else {
                            ProductDetails productDetails3 = mapMapProductDetailsToProductId.get(newPurchaseProductId);
                            Intrinsics.checkNotNull(productDetails3);
                            linkedHashMap.put(purchase, MapsKt.mutableMapOf(TuplesKt.to(newPurchaseProductId, productDetails3)));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final List<InAppPurchaseEvent> getInAppPurchaseWrappers(Map<Purchase, ? extends Map<String, ProductDetails>> purchases) {
        OneTimePurchaseOfferDetails wrapper;
        ArrayList arrayList = new ArrayList(purchases.size());
        for (Map.Entry<Purchase, ? extends Map<String, ProductDetails>> entry : purchases.entrySet()) {
            Purchase key = entry.getKey();
            key.getPurchaseTime();
            Set<Map.Entry<String, ProductDetails>> setEntrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = ((ProductDetails) entry2.getValue()).getOneTimePurchaseOfferDetails();
                if (oneTimePurchaseOfferDetails != null) {
                    Intrinsics.checkNotNullExpressionValue(oneTimePurchaseOfferDetails, "oneTimePurchaseOfferDetails");
                    wrapper = getWrapper(oneTimePurchaseOfferDetails);
                } else {
                    wrapper = null;
                }
                Pair pair = TuplesKt.to(key2, wrapper);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> products = key.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "purchase.products");
            String purchaseToken = key.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchase.purchaseToken");
            Store store = Store.GOOGLE;
            long purchaseTime = key.getPurchaseTime();
            String packageName = key.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "purchase.packageName");
            arrayList.add(new InAppPurchaseEvent(products, purchaseToken, store, purchaseTime, packageName, key.getQuantity(), linkedHashMap));
        }
        return arrayList;
    }

    private final List<SubscriptionPurchaseEvent> getSubscriptionPurchaseWrappers(Map<Purchase, ? extends Map<String, ProductDetails>> subs) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(subs.size());
        for (Map.Entry<Purchase, ? extends Map<String, ProductDetails>> entry : subs.entrySet()) {
            Purchase key = entry.getKey();
            Set<Map.Entry<String, ProductDetails>> setEntrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = ((ProductDetails) entry2.getValue()).getSubscriptionOfferDetails();
                if (subscriptionOfferDetails != null) {
                    Intrinsics.checkNotNullExpressionValue(subscriptionOfferDetails, "subscriptionOfferDetails");
                    List<ProductDetails.SubscriptionOfferDetails> list = subscriptionOfferDetails;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (ProductDetails.SubscriptionOfferDetails offer : list) {
                        Intrinsics.checkNotNullExpressionValue(offer, "offer");
                        arrayList.add(getWrapper(offer));
                    }
                } else {
                    arrayList = null;
                }
                Pair pair = TuplesKt.to(key2, arrayList);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> products = key.getProducts();
            Intrinsics.checkNotNullExpressionValue(products, "purchase.products");
            String purchaseToken = key.getPurchaseToken();
            Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchase.purchaseToken");
            arrayList2.add(new SubscriptionPurchaseEvent(products, purchaseToken, Store.GOOGLE, key.getPurchaseTime(), linkedHashMap));
        }
        return arrayList2;
    }

    private final SubscriptionOfferDetails getWrapper(ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails) {
        String basePlanId = subscriptionOfferDetails.getBasePlanId();
        Intrinsics.checkNotNullExpressionValue(basePlanId, "basePlanId");
        String offerId = subscriptionOfferDetails.getOfferId();
        List<String> offerTags = subscriptionOfferDetails.getOfferTags();
        Intrinsics.checkNotNullExpressionValue(offerTags, "offerTags");
        String offerToken = subscriptionOfferDetails.getOfferToken();
        Intrinsics.checkNotNullExpressionValue(offerToken, "offerToken");
        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList();
        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "pricingPhases.pricingPhaseList");
        List<ProductDetails.PricingPhase> list = pricingPhaseList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ProductDetails.PricingPhase it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(getWrapper(it));
        }
        return new SubscriptionOfferDetails(basePlanId, offerId, offerTags, offerToken, arrayList);
    }

    private final Map<String, ProductDetails> mapProductDetailsToProductId(List<ProductDetails> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ProductDetails productDetails : list) {
            if (Intrinsics.areEqual(productDetails.getProductType(), this.type)) {
                String productId = productDetails.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId, "it.productId");
                linkedHashMap.put(productId, productDetails);
            } else {
                String str = "[PurchaseConnector]: expected Product type of " + this.type + ", but received " + productDetails.getProductType();
                AFLogger.afErrorLog(str, new WrongProductTypeException(str));
            }
        }
        return linkedHashMap;
    }

    @Override // com.android.billingclient.api.ProductDetailsResponseListener
    public void onProductDetailsResponse(@NotNull BillingResult billingResult, @NotNull QueryProductDetailsResult productDetailsResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(productDetailsResult, "productDetailsResult");
        List<ProductDetails> productDetailsList = productDetailsResult.getProductDetailsList();
        Intrinsics.checkNotNullExpressionValue(productDetailsList, "productDetailsResult.productDetailsList");
        try {
            if (billingResult.getResponseCode() == 0 && !productDetailsList.isEmpty()) {
                AFLogger.afDebugLog("[PurchaseConnector]: Received the following Product details:\n\ttype: " + this.type + "\n\tProduct Ids: " + CollectionsKt.joinToString$default(productDetailsList, ", ", null, null, 0, null, new Function1<ProductDetails, CharSequence>() { // from class: com.appsflyer.internal.connectors.callbacks.BillingLibraryAsyncListenersImpl.onProductDetailsResponse.1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final CharSequence invoke(ProductDetails productDetails) {
                        String productId = productDetails.getProductId();
                        Intrinsics.checkNotNullExpressionValue(productId, "it.productId");
                        return productId;
                    }
                }, 30, null));
                Map<Purchase, Map<String, ProductDetails>> mapFilterProductDetails = filterProductDetails(productDetailsList);
                if (mapFilterProductDetails.isEmpty()) {
                    return;
                }
                if (!Intrinsics.areEqual("subs", this.type)) {
                    this.listener.onNewInAppPurchases(getInAppPurchaseWrappers(mapFilterProductDetails));
                    return;
                }
                List<SubscriptionPurchaseEvent> subscriptionPurchaseWrappers = getSubscriptionPurchaseWrappers(mapFilterProductDetails);
                if (this.isHistory) {
                    this.listener.onSubscriptionPurchaseHistoryRetrieved(subscriptionPurchaseWrappers);
                } else {
                    this.listener.onNewSubscriptionPurchases(subscriptionPurchaseWrappers);
                }
            }
        } catch (Throwable th2) {
            ExtentionsKt.warnIfBillingLibraryWrongVersion(th2);
            ExtentionsKt.printCause(th2);
            AFLogger.afErrorLog("[PurchaseConnector]: Failed to log new purchase", th2, true);
        }
    }

    public /* synthetic */ BillingLibraryAsyncListenersImpl(String str, BillingClientConnector.BillingUpdatesListener billingUpdatesListener, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, billingUpdatesListener, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? false : z10);
    }

    private final OneTimePurchaseOfferDetails getWrapper(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails) {
        String formattedPrice = oneTimePurchaseOfferDetails.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "formattedPrice");
        long priceAmountMicros = oneTimePurchaseOfferDetails.getPriceAmountMicros();
        String priceCurrencyCode = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "priceCurrencyCode");
        return new OneTimePurchaseOfferDetails(formattedPrice, priceAmountMicros, priceCurrencyCode);
    }

    private final PricingPhases getWrapper(ProductDetails.PricingPhase pricingPhase) {
        int billingCycleCount = pricingPhase.getBillingCycleCount();
        String billingPeriod = pricingPhase.getBillingPeriod();
        Intrinsics.checkNotNullExpressionValue(billingPeriod, "billingPeriod");
        String formattedPrice = pricingPhase.getFormattedPrice();
        Intrinsics.checkNotNullExpressionValue(formattedPrice, "formattedPrice");
        long priceAmountMicros = pricingPhase.getPriceAmountMicros();
        String priceCurrencyCode = pricingPhase.getPriceCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(priceCurrencyCode, "priceCurrencyCode");
        return new PricingPhases(billingCycleCount, billingPeriod, formattedPrice, priceAmountMicros, priceCurrencyCode, pricingPhase.getRecurrenceMode());
    }
}
