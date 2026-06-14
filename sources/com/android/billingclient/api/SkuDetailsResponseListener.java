package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public interface SkuDetailsResponseListener {
    void onSkuDetailsResponse(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list);
}
