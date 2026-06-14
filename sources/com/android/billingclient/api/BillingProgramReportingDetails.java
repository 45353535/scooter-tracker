package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
@zzh
public final class BillingProgramReportingDetails {
    private final int billingProgram;
    private final String externalTransactionToken;

    BillingProgramReportingDetails(String str, int i10) {
        this.externalTransactionToken = str;
        this.billingProgram = i10;
    }

    public int getBillingProgram() {
        return this.billingProgram;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }
}
