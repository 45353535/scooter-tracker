package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfri extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfrj zza;

    zzfri(zzfrj zzfrjVar) {
        Objects.requireNonNull(zzfrjVar);
        this.zza = zzfrjVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzi(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzi(false);
    }
}
