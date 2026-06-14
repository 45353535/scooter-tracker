package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends f6 {
    public n0(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    @Override // com.startapp.sdk.internal.f6
    public final int a() {
        if (!q0.a(this.f64483a, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        int iA = 0;
        for (Network network : this.f64484b.getAllNetworks()) {
            if (network != null) {
                iA |= g6.a(this.f64484b.getNetworkCapabilities(network));
            }
        }
        return iA;
    }
}
