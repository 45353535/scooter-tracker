package x;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;
import x.e;

/* JADX INFO: loaded from: classes5.dex */
final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f108075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f108076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f108077c;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            g.this.d(network, false);
        }
    }

    public g(ConnectivityManager connectivityManager, e.a aVar) {
        this.f108075a = connectivityManager;
        this.f108076b = aVar;
        a aVar2 = new a();
        this.f108077c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f108075a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        Network[] allNetworks = this.f108075a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (Intrinsics.areEqual(network2, network) ? z10 : c(network2)) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f108076b.a(z11);
    }

    @Override // x.e
    public boolean a() {
        for (Network network : this.f108075a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // x.e
    public void shutdown() {
        this.f108075a.unregisterNetworkCallback(this.f108077c);
    }
}
