package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1mSDK extends AFi1pSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1mSDK(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    protected final String getCurrencyIso4217Code() {
        ConnectivityManager connectivityManager = this.AFAdRevenueData;
        if (connectivityManager != null) {
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getRevenue() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            Intrinsics.checkNotNullExpressionValue(networkInterfaces, "");
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            Intrinsics.checkNotNullExpressionValue(list, "");
            if (!androidx.activity.s.a(list) || !list.isEmpty()) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface.isUp() && Intrinsics.areEqual(networkInterface.getName(), "tun0")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Failed collecting ivc data", e10);
            return false;
        }
    }
}
