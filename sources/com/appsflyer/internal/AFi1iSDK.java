package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1iSDK {
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1iSDK(long j10, long j11, @Nullable String str, @Nullable String str2) {
        this.getRevenue = j10;
        this.getCurrencyIso4217Code = j11;
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1iSDK)) {
            return false;
        }
        AFi1iSDK aFi1iSDK = (AFi1iSDK) obj;
        return this.getRevenue == aFi1iSDK.getRevenue && this.getCurrencyIso4217Code == aFi1iSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1iSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFi1iSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int iA = ((androidx.collection.b.a(this.getRevenue) * 31) + androidx.collection.b.a(this.getCurrencyIso4217Code)) * 31;
        String str = this.getMonetizationNetwork;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getRevenue + ", ttrMillis=" + this.getCurrencyIso4217Code + ", piaToken=" + this.getMonetizationNetwork + ", errorCode=" + this.getMediationNetwork + ")";
    }
}
