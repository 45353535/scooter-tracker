package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class e6 implements ConnectivityManager.OnNetworkActiveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f64446a;

    public e6(g6 g6Var) {
        this.f64446a = g6Var;
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        g6 g6Var = this.f64446a;
        synchronized (g6Var.f64547c) {
            try {
                Iterator it = g6Var.f64547c.iterator();
                while (it.hasNext()) {
                    ((k7) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
