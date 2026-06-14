package com.appsflyer.api;

import com.appsflyer.api.models.SubscriptionOfferDetails;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0000\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00030\u000b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0017H\u0016R%\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/appsflyer/api/SubscriptionPurchaseEvent;", "Lcom/appsflyer/api/PurchaseEvent;", "productIds", "", "", "purchaseToken", "store", "Lcom/appsflyer/api/Store;", "purchaseTime", "", "subscriptionOfferDetails", "", "Lcom/appsflyer/api/models/SubscriptionOfferDetails;", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;JLjava/util/Map;)V", "getSubscriptionOfferDetails", "()Ljava/util/Map;", "equals", "", "other", "", "hashCode", "", "toJsonMap", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, List<SubscriptionOfferDetails>> subscriptionOfferDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionPurchaseEvent(@NotNull List<String> productIds, @NotNull String purchaseToken, @NotNull Store store, long j10, @NotNull Map<String, ? extends List<SubscriptionOfferDetails>> subscriptionOfferDetails) {
        super(productIds, purchaseToken, store, "subs", j10);
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(subscriptionOfferDetails, "subscriptionOfferDetails");
        this.subscriptionOfferDetails = subscriptionOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SubscriptionPurchaseEvent.class, other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.appsflyer.api.SubscriptionPurchaseEvent");
        return Intrinsics.areEqual(this.subscriptionOfferDetails, ((SubscriptionPurchaseEvent) other).subscriptionOfferDetails);
    }

    @NotNull
    public final Map<String, List<SubscriptionOfferDetails>> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public int hashCode() {
        return (super.hashCode() * 31) + this.subscriptionOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent, com.appsflyer.api.AFSerializable
    @NotNull
    public Map<String, Object> toJsonMap() {
        ArrayList arrayList;
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, List<SubscriptionOfferDetails>>> setEntrySet = this.subscriptionOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((SubscriptionOfferDetails) it2.next()).toJsonMap());
                }
            } else {
                arrayList = null;
            }
            Pair pair = TuplesKt.to(key, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("subscription_offer_details", linkedHashMap);
        return jsonMap;
    }
}
