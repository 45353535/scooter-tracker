package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFd1zSDK {
    @WorkerThread
    int AFAdRevenueData();

    @WorkerThread
    boolean getCurrencyIso4217Code();

    @WorkerThread
    boolean getCurrencyIso4217Code(@NotNull String... strArr);

    @WorkerThread
    @NotNull
    List<ExceptionInfo> getMediationNetwork();

    @WorkerThread
    void getMediationNetwork(int i10, int i11);

    @WorkerThread
    @Nullable
    String getRevenue(@NotNull Throwable th2, @NotNull String str);
}
