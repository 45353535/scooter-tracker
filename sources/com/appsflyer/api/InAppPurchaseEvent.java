package com.appsflyer.api;

import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\fH\u0016J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/appsflyer/api/InAppPurchaseEvent;", "Lcom/appsflyer/api/PurchaseEvent;", "productIds", "", "", "purchaseToken", "store", "Lcom/appsflyer/api/Store;", "purchaseTime", "", "packageName", FirebaseAnalytics.Param.QUANTITY, "", "oneTimePurchaseOfferDetails", "", "Lcom/appsflyer/api/models/OneTimePurchaseOfferDetails;", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;JLjava/lang/String;ILjava/util/Map;)V", "getOneTimePurchaseOfferDetails", "()Ljava/util/Map;", "getPackageName", "()Ljava/lang/String;", "getQuantity", "()I", "equals", "", "other", "", "hashCode", "toJsonMap", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InAppPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetails;

    @NotNull
    private final String packageName;
    private final int quantity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseEvent(@NotNull List<String> productIds, @NotNull String purchaseToken, @NotNull Store store, long j10, @NotNull String packageName, int i10, @NotNull Map<String, OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetails) {
        super(productIds, purchaseToken, store, "inapp", j10);
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(oneTimePurchaseOfferDetails, "oneTimePurchaseOfferDetails");
        this.packageName = packageName;
        this.quantity = i10;
        this.oneTimePurchaseOfferDetails = oneTimePurchaseOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(InAppPurchaseEvent.class, other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.appsflyer.api.InAppPurchaseEvent");
        InAppPurchaseEvent inAppPurchaseEvent = (InAppPurchaseEvent) other;
        return Intrinsics.areEqual(this.packageName, inAppPurchaseEvent.packageName) && this.quantity == inAppPurchaseEvent.quantity && Intrinsics.areEqual(this.oneTimePurchaseOfferDetails, inAppPurchaseEvent.oneTimePurchaseOfferDetails);
    }

    @NotNull
    public final Map<String, OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public int hashCode() {
        return (((((super.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.quantity) * 31) + this.oneTimePurchaseOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent, com.appsflyer.api.AFSerializable
    @NotNull
    public Map<String, Object> toJsonMap() {
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, OneTimePurchaseOfferDetails>> setEntrySet = this.oneTimePurchaseOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) entry.getValue();
            Pair pair = TuplesKt.to(key, oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.toJsonMap() : null);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("package_name", this.packageName);
        jsonMap.put("one_time_purchase_offer_details", linkedHashMap);
        jsonMap.put(FirebaseAnalytics.Param.QUANTITY, Integer.valueOf(this.quantity));
        return jsonMap;
    }
}
