package com.appodeal.ads.network.state;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.appodeal.ads.api.Device;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.network.NetworkState;
import com.appodeal.ads.network.NetworkStateObserver;
import eg.e0;
import eg.o0;
import hg.l0;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements NetworkStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f13995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f13996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Device.ConnectionType f13997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConnectivityManager f13998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f13999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f14000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f14001g;

    public d() {
        CoroutineScope scope = i.a(o0.a().plus(new e0("ApdNetworkStateObserver")));
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f13995a = scope;
        this.f13996b = new CopyOnWriteArraySet();
        this.f13997c = Device.ConnectionType.CONNECTIONTYPE_UNKNOWN;
        this.f14000f = l0.a(SetsKt.emptySet());
        this.f14001g = l0.a(NetworkState.NotInitialized);
    }

    public static final void c(d dVar) {
        Device.ConnectionType connectionType;
        ConnectivityManager connectivityManager = dVar.f13998d;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        Integer numValueOf = activeNetworkInfo != null ? Integer.valueOf(activeNetworkInfo.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            connectionType = subtype != 0 ? subtype != 4 ? subtype != 16 ? Device.ConnectionType.MOBILE_4G : Device.ConnectionType.MOBILE_2G : Device.ConnectionType.MOBILE_3G : Device.ConnectionType.MOBILE_UNKNOWN;
        } else {
            connectionType = (numValueOf != null && numValueOf.intValue() == 1) ? Device.ConnectionType.WIFI : (numValueOf != null && numValueOf.intValue() == 9) ? Device.ConnectionType.ETHERNET : Device.ConnectionType.CONNECTIONTYPE_UNKNOWN;
        }
        dVar.f13997c = connectionType;
    }

    public final void b(Network network, NetworkState networkState) {
        Object value;
        Set set;
        NetworkState networkState2;
        MutableStateFlow mutableStateFlow = this.f14000f;
        do {
            value = mutableStateFlow.getValue();
            set = (Set) value;
            networkState2 = NetworkState.Enabled;
        } while (!mutableStateFlow.b(value, networkState == networkState2 ? SetsKt.plus((Set<? extends Network>) set, network) : SetsKt.minus((Set<? extends Network>) set, network)));
        NetworkState networkState3 = (NetworkState) this.f14001g.getValue();
        NetworkState networkState4 = !((Collection) this.f14000f.getValue()).isEmpty() ? networkState2 : NetworkState.Disabled;
        this.f14001g.setValue(networkState4);
        LogExtKt.logInternal$default("NetworkStateObserver", "oldState: " + networkState3 + ", newState: " + networkState4, null, 4, null);
        if (networkState3 == networkState4 || networkState4 != networkState2) {
            return;
        }
        Job job = this.f13999e;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f13999e = eg.i.d(this.f13995a, null, null, new b(this, null), 3, null);
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final Flow getNetworkStateFlow() {
        return this.f14001g;
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final Device.ConnectionType getNetworkType() {
        return this.f13997c;
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final void init(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (this.f14001g.getValue() != NetworkState.NotInitialized) {
            return;
        }
        Object systemService = applicationContext.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.f13998d = connectivityManager;
        if (connectivityManager == null) {
            return;
        }
        this.f14001g.setValue(NetworkState.Disabled);
        try {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new c(this));
        } catch (Throwable unused) {
            this.f14001g.setValue(NetworkState.ConnectivityManagerError);
        }
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final boolean isConnected() {
        return this.f14001g.getValue() == NetworkState.Enabled;
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final void subscribe(NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13996b.add(listener);
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public final void unsubscribe(NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13996b.remove(listener);
    }
}
