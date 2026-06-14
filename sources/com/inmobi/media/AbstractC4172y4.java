package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4172y4 {
    public static final Pe a() {
        Context context = Ji.f37157a;
        if (context == null) {
            return Pe.f37540a;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Pe.f37541b;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService(com.ironsource.X3.f42018b);
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? Pe.f37543d : linkSpeed >= 2 ? Pe.f37542c : Pe.f37541b;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Pe.f37540a;
                }
                Object systemService3 = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? Pe.f37541b : (networkType == 18 || networkType == 20) ? Pe.f37543d : Pe.f37542c;
            }
            return Pe.f37540a;
        } catch (SecurityException unused) {
            return Pe.f37540a;
        }
    }
}
