package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzcdr extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcdu zza;

    zzcdr(zzcdu zzcduVar) {
        Objects.requireNonNull(zzcduVar);
        this.zza = zzcduVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzC().set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzC().set(false);
    }
}
