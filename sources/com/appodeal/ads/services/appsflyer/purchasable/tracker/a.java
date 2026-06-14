package com.appodeal.ads.services.appsflyer.purchasable.tracker;

import com.android.billingclient.BuildConfig;
import com.appodeal.ads.ext.LogExtKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final boolean a() {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            Object obj = BuildConfig.class.getDeclaredField("VERSION_NAME").get(null);
            objB = Result.b(obj instanceof String ? (String) obj : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        String str = (String) (Result.i(objB) ? null : objB);
        if (str != null) {
            return b(str);
        }
        return false;
    }

    public static final boolean b(String str) {
        Integer intOrNull;
        LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", "Your version of com.android.billingclient: " + str, null, 4, null);
        String str2 = (String) CollectionsKt.firstOrNull(StringsKt.X0(str, new char[]{'.'}, false, 0, 6, null));
        if (str2 != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            if (intOrNull.intValue() == 8) {
                LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", "Billing Library " + str + " is supported. PurchaseConnector is available.", null, 4, null);
                return true;
            }
            LogExtKt.logInternal$default("AppsflyerService [PurchaseConnector]", "AppsFlyer PurchaseConnector v2.2.0 supports only Billing Library 8.x. Detected version: " + str + ". Use Appodeal.validateInAppPurchase() for manual validation. See: https://dev.appsflyer.com/hc/docs/purchase-connector-android", null, 4, null);
        }
        return false;
    }
}
