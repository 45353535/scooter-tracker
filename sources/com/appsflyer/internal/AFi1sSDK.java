package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1sSDK {

    @NotNull
    public final Context getCurrencyIso4217Code;

    @Nullable
    public AFi1pSDK getMediationNetwork;

    public AFi1sSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getCurrencyIso4217Code = context;
    }
}
