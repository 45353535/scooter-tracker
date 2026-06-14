package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFd1xSDK {

    public interface AFa1ySDK {
        void onConfigurationChanged(boolean z10);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(@Nullable AFa1ySDK aFa1ySDK);

    void getRevenue();

    void getRevenue(@NonNull Throwable th2, @NonNull String str);
}
