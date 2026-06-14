package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1tSDK {

    @Nullable
    public final String getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFi1tSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.getMediationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMonetizationNetwork = z10;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }
}
