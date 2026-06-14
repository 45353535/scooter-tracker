package com.appsflyer.internal;

import androidx.annotation.WorkerThread;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFc1uSDK {
    void getCurrencyIso4217Code();

    @WorkerThread
    boolean getCurrencyIso4217Code(@Nullable String str);

    @WorkerThread
    @NotNull
    List<AFc1tSDK> getMediationNetwork();

    @WorkerThread
    @Nullable
    String getMonetizationNetwork(@NotNull AFc1tSDK aFc1tSDK);

    @WorkerThread
    void getMonetizationNetwork();
}
