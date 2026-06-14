package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1xSDK {
    public static boolean getMonetizationNetwork(@Nullable String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean getRevenue(@Nullable String str) {
        return str == null || str.length() == 0;
    }
}
