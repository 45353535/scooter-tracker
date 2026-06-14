package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.moloco.sdk.internal.services.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f55512b;

    public c(Context context, i0 deviceInfoService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        this.f55511a = context;
        this.f55512b = deviceInfoService;
    }

    @Override // com.moloco.sdk.internal.services.b
    public boolean a() {
        Object systemService = this.f55511a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 24) {
            return b(connectivityManager);
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.b
    public Integer b() {
        Object systemService = this.f55511a.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    @Override // com.moloco.sdk.internal.services.b
    public a c() {
        Object systemService = this.f55511a.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() == null) {
            return a.b.f55273a;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities == null ? a.b.f55273a : networkCapabilities.hasTransport(1) ? a.c.f55274a : networkCapabilities.hasTransport(0) ? new a.C0679a(this.f55512b.invoke().g()) : a.b.f55273a;
    }

    @Override // com.moloco.sdk.internal.services.b
    public Integer d() {
        Object systemService = this.f55511a.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        String strSubstring = networkOperator.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Integer.valueOf(Integer.parseInt(strSubstring));
    }

    @Override // com.moloco.sdk.internal.services.b
    public a invoke() {
        return c();
    }

    public final boolean b(ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }
}
