package com.appsflyer.internal;

import com.appsflyer.migration.AppsFlyerMigrationHelper;

/* JADX INFO: loaded from: classes6.dex */
public final class AFh1sSDK {
    public static final boolean getMonetizationNetwork() {
        try {
            AppsFlyerMigrationHelper appsFlyerMigrationHelper = AppsFlyerMigrationHelper.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
