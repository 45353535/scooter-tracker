package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends f6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f64660c;

    public i(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
        this.f64660c = new HashMap();
    }

    @Override // com.startapp.sdk.internal.f6
    public final int a() {
        int iIntValue;
        synchronized (this.f64660c) {
            try {
                iIntValue = 0;
                for (Integer num : this.f64660c.values()) {
                    if (num != null) {
                        iIntValue |= num.intValue();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override // com.startapp.sdk.internal.f6
    public final void b() {
        if (q0.a(this.f64483a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f64484b.registerDefaultNetworkCallback(new h(this));
        }
    }
}
