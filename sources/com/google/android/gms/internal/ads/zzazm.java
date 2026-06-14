package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzazm extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzazn zza;

    zzazm(zzazn zzaznVar) {
        Objects.requireNonNull(zzaznVar);
        this.zza = zzaznVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzazn.class) {
            this.zza.zzd(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzazn.class) {
            this.zza.zzd(null);
        }
    }
}
