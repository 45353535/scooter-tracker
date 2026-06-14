package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/android/billingclient/api/PurchasesResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "purchasesList", "", "Lcom/android/billingclient/api/Purchase;", "<init>", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getPurchasesList", "()Ljava/util/List;", "component1", "component2", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PurchasesResult {

    /* JADX INFO: renamed from: zza, reason: from toString */
    @NotNull
    private final BillingResult billingResult;

    /* JADX INFO: renamed from: zzb, reason: from toString */
    @NotNull
    private final List purchasesList;

    public PurchasesResult(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.billingResult = billingResult;
        this.purchasesList = purchasesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ PurchasesResult copy$default(@RecentlyNonNull PurchasesResult purchasesResult, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchasesResult.billingResult;
        }
        if ((i10 & 2) != 0) {
            list = purchasesResult.purchasesList;
        }
        return purchasesResult.copy(billingResult, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @NotNull
    public final List<Purchase> component2() {
        return this.purchasesList;
    }

    @NotNull
    public final PurchasesResult copy(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        return new PurchasesResult(billingResult, purchasesList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) other;
        return Intrinsics.areEqual(this.billingResult, purchasesResult.billingResult) && Intrinsics.areEqual(this.purchasesList, purchasesResult.purchasesList);
    }

    @NotNull
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    @NotNull
    public final List<Purchase> getPurchasesList() {
        return this.purchasesList;
    }

    public int hashCode() {
        return (this.billingResult.hashCode() * 31) + this.purchasesList.hashCode();
    }

    @NotNull
    public String toString() {
        return "PurchasesResult(billingResult=" + this.billingResult + ", purchasesList=" + this.purchasesList + ")";
    }
}
