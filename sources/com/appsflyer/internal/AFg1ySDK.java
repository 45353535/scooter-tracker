package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFg1ySDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1ySDK(int i10, int i11, int i12, int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i10;
        this.AFAdRevenueData = i11;
        this.getMonetizationNetwork = i12;
        this.getRevenue = i13;
        this.getMediationNetwork = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.getCurrencyIso4217Code == aFg1ySDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFg1ySDK.AFAdRevenueData && this.getMonetizationNetwork == aFg1ySDK.getMonetizationNetwork && this.getRevenue == aFg1ySDK.getRevenue && Intrinsics.areEqual(this.getMediationNetwork, aFg1ySDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (((((((this.getCurrencyIso4217Code * 31) + this.AFAdRevenueData) * 31) + this.getMonetizationNetwork) * 31) + this.getRevenue) * 31) + this.getMediationNetwork.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getCurrencyIso4217Code + ", gdprApplies=" + this.AFAdRevenueData + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.getRevenue + ", tcString=" + this.getMediationNetwork + ")";
    }
}
