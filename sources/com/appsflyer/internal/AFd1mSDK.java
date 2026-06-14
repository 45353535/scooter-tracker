package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFd1mSDK {
    void AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String... strArr);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull String str, int i10, @NotNull String str2);

    void getMonetizationNetwork(@Nullable String str, @NotNull String str2);

    void getMonetizationNetwork(@NotNull Throwable th2);

    void getRevenue();

    void getRevenue(@NotNull String str, @NotNull String str2);

    void q_(@Nullable String str, @Nullable PackageManager packageManager);
}
