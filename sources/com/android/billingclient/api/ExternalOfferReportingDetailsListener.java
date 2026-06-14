package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@zzj
@Deprecated
public interface ExternalOfferReportingDetailsListener {
    void onExternalOfferReportingDetailsResponse(@NonNull BillingResult billingResult, @Nullable ExternalOfferReportingDetails externalOfferReportingDetails);
}
