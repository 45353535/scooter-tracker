package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f64591a;

    public h(i iVar) {
        this.f64591a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int iA = g6.a(networkCapabilities);
        synchronized (this.f64591a.f64660c) {
            this.f64591a.f64660c.put(network, Integer.valueOf(iA));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f64591a.f64660c) {
            this.f64591a.f64660c.remove(network);
        }
    }
}
