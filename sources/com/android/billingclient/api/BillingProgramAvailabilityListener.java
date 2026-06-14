package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@zzh
public interface BillingProgramAvailabilityListener {
    void onBillingProgramAvailabilityResponse(@NonNull BillingResult billingResult, @NonNull BillingProgramAvailabilityDetails billingProgramAvailabilityDetails);
}
