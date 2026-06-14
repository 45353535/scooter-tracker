package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@zzh
public interface BillingProgramReportingDetailsListener {
    void onCreateBillingProgramReportingDetailsResponse(@NonNull BillingResult billingResult, @Nullable BillingProgramReportingDetails billingProgramReportingDetails);
}
