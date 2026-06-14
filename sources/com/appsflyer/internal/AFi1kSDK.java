package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFi1kSDK {
    @NotNull
    String getCurrencyIso4217Code(@Nullable Activity activity);

    @Nullable
    String getMediationNetwork(@Nullable Activity activity);

    void getMonetizationNetwork(@NotNull Activity activity);
}
