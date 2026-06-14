package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1vSDK {

    @NonNull
    public final String AFAdRevenueData;

    @Nullable
    public final Throwable areAllFieldsValid;

    @Nullable
    public final AFi1uSDK component1;

    @Nullable
    public final String component3;
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;
    public final int getRevenue;

    public AFi1vSDK(@Nullable String str, @NonNull String str2, long j10, long j11, int i10, @Nullable AFi1uSDK aFi1uSDK, @Nullable String str3, Throwable th2) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getMonetizationNetwork = j10;
        this.getCurrencyIso4217Code = j11;
        this.getRevenue = i10;
        this.component1 = aFi1uSDK;
        this.component3 = str3;
        this.areAllFieldsValid = th2;
    }
}
