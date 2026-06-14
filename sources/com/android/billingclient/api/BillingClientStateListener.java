package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(@NonNull BillingResult billingResult);
}
