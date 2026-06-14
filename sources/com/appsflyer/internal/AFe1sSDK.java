package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public interface AFe1sSDK {
    @WorkerThread
    void getMediationNetwork(@NonNull AFe1lSDK<?> aFe1lSDK);

    @WorkerThread
    void getMonetizationNetwork(@NonNull AFe1lSDK<?> aFe1lSDK, @NonNull AFe1uSDK aFe1uSDK);
}
