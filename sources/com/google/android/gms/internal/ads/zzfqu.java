package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfqu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzfqw zza;

    zzfqu(zzfqw zzfqwVar) {
        Objects.requireNonNull(zzfqwVar);
        this.zza = zzfqwVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzk(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzk(false);
    }
}
