package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFc1vSDK {

    @NotNull
    final List<AFe1mSDK> AFAdRevenueData;

    @NotNull
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1vSDK(@NotNull String str, @NotNull List<? extends AFe1mSDK> list, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = list;
        this.getMediationNetwork = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1vSDK)) {
            return false;
        }
        AFc1vSDK aFc1vSDK = (AFc1vSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1vSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1vSDK.AFAdRevenueData) && this.getMediationNetwork == aFc1vSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return (((this.getCurrencyIso4217Code.hashCode() * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMediationNetwork;
    }

    @NotNull
    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.getCurrencyIso4217Code + ", eventTypes=" + this.AFAdRevenueData + ", maxCapacity=" + this.getMediationNetwork + ")";
    }
}
