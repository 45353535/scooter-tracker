package com.appsflyer.internal;

import android.content.Intent;
import androidx.annotation.WorkerThread;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface AFh1qSDK {
    void AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK);

    void getCurrencyIso4217Code();

    @WorkerThread
    void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK);

    boolean getMediationNetwork();

    @WorkerThread
    void getMonetizationNetwork(@NotNull AFf1rSDK aFf1rSDK, @NotNull Function0<Unit> function0);

    boolean getMonetizationNetwork();

    @WorkerThread
    void getRevenue(@NotNull AFh1jSDK aFh1jSDK);

    void u_(@NotNull Intent intent, @NotNull AFa1rSDK aFa1rSDK);
}
