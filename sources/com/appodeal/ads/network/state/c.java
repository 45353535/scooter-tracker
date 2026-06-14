package com.appodeal.ads.network.state;

import android.net.ConnectivityManager;
import android.net.Network;
import com.appodeal.ads.network.NetworkState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13994a;

    public c(d dVar) {
        this.f13994a = dVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        this.f13994a.b(network, NetworkState.Enabled);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        this.f13994a.b(network, NetworkState.Disabled);
    }
}
