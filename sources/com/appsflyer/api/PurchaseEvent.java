package com.appsflyer.api;

import com.ironsource.C4240b4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0000\b&\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00180\u001cH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/appsflyer/api/PurchaseEvent;", "Lcom/appsflyer/api/AFSerializable;", "productIds", "", "", "purchaseToken", "store", "Lcom/appsflyer/api/Store;", C4240b4.i.f42638m, "purchaseTime", "", "(Ljava/util/List;Ljava/lang/String;Lcom/appsflyer/api/Store;Ljava/lang/String;J)V", "getProductIds", "()Ljava/util/List;", "getProductType", "()Ljava/lang/String;", "getPurchaseTime", "()J", "getPurchaseToken", "getStore", "()Lcom/appsflyer/api/Store;", "equals", "", "other", "", "hashCode", "", "toJsonMap", "", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PurchaseEvent implements AFSerializable {

    @NotNull
    private final List<String> productIds;

    @NotNull
    private final String productType;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final Store store;

    public PurchaseEvent(@NotNull List<String> productIds, @NotNull String purchaseToken, @NotNull Store store, @NotNull String productType, long j10) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.productIds = productIds;
        this.purchaseToken = purchaseToken;
        this.store = store;
        this.productType = productType;
        this.purchaseTime = j10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.appsflyer.api.PurchaseEvent");
        PurchaseEvent purchaseEvent = (PurchaseEvent) other;
        return Intrinsics.areEqual(this.productIds, purchaseEvent.productIds) && Intrinsics.areEqual(this.purchaseToken, purchaseEvent.purchaseToken) && this.store == purchaseEvent.store && Intrinsics.areEqual(this.productType, purchaseEvent.productType);
    }

    @NotNull
    public final List<String> getProductIds() {
        return this.productIds;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @NotNull
    public final Store getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((((this.productIds.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.store.hashCode()) * 31) + this.productType.hashCode();
    }

    @Override // com.appsflyer.api.AFSerializable
    @NotNull
    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("purchase_token", this.purchaseToken), TuplesKt.to("product_ids", this.productIds), TuplesKt.to("product_type", this.productType), TuplesKt.to("purchase_time", Long.valueOf(this.purchaseTime)));
    }
}
