package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface PurchaseHistoryResponseListener {
    void onPurchaseHistoryResponse(@NonNull BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list);
}
