package com.appodeal.ads.network;

import android.content.Context;
import com.appodeal.ads.api.Device;
import com.appodeal.ads.network.NetworkStateObserver;
import com.appodeal.ads.network.state.d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/appodeal/ads/network/NetworkStatus;", "Lcom/appodeal/ads/network/NetworkStateObserver;", "Landroid/content/Context;", "applicationContext", "", "init", "(Landroid/content/Context;)V", "", "isConnected", "()Z", "Lcom/appodeal/ads/api/Device$ConnectionType;", "getNetworkType", "()Lcom/appodeal/ads/api/Device$ConnectionType;", "Lcom/appodeal/ads/network/NetworkStateObserver$ConnectionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "subscribe", "(Lcom/appodeal/ads/network/NetworkStateObserver$ConnectionListener;)V", "unsubscribe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/appodeal/ads/network/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "networkStateFlow", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkStatus implements NetworkStateObserver {
    public static final NetworkStatus INSTANCE = new NetworkStatus();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f13947a = new d();

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public Flow getNetworkStateFlow() {
        return this.f13947a.f14001g;
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public Device.ConnectionType getNetworkType() {
        return this.f13947a.f13997c;
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public void init(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f13947a.init(applicationContext);
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public boolean isConnected() {
        return this.f13947a.isConnected();
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public void subscribe(NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d dVar = this.f13947a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        dVar.f13996b.add(listener);
    }

    @Override // com.appodeal.ads.network.NetworkStateObserver
    public void unsubscribe(NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        d dVar = this.f13947a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        dVar.f13996b.remove(listener);
    }
}
