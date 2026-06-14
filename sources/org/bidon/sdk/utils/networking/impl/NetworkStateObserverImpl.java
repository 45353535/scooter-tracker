package org.bidon.sdk.utils.networking.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.n;
import hg.l0;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.utils.networking.NetworkState;
import org.bidon.sdk.utils.networking.NetworkStateObserver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/NetworkStateObserverImpl;", "Lorg/bidon/sdk/utils/networking/NetworkStateObserver;", "<init>", "()V", "connectivityManager", "Landroid/net/ConnectivityManager;", "instantlyIsConnected", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listeners", "", "Lorg/bidon/sdk/utils/networking/NetworkStateObserver$ConnectionListener;", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "networkStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/utils/networking/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "init", "", "applicationContext", "Landroid/content/Context;", "isConnected", "", "subscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "unsubscribe", "syncState", "checkConnected", "NetworkReceiver", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkStateObserverImpl implements NetworkStateObserver {

    @Nullable
    private ConnectivityManager connectivityManager;

    @NotNull
    private AtomicBoolean instantlyIsConnected = new AtomicBoolean(false);
    private final Set<NetworkStateObserver.ConnectionListener> listeners = DesugarCollections.synchronizedSet(new LinkedHashSet());

    @NotNull
    private final MutableStateFlow networkStateFlow = l0.a(NetworkState.NotInitialized);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lorg/bidon/sdk/utils/networking/impl/NetworkStateObserverImpl$NetworkReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lorg/bidon/sdk/utils/networking/impl/NetworkStateObserverImpl;)V", "onReceive", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", n.f66171o, "Landroid/content/Intent;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class NetworkReceiver extends BroadcastReceiver {
        public NetworkReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            NetworkStateObserverImpl.this.syncState();
        }
    }

    private final boolean checkConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.connectivityManager;
        boolean z10 = false;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        }
        this.instantlyIsConnected.set(z10);
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncState() {
        NetworkState networkState;
        MutableStateFlow networkStateFlow = getNetworkStateFlow();
        if (checkConnected()) {
            Set<NetworkStateObserver.ConnectionListener> listeners = this.listeners;
            Intrinsics.checkNotNullExpressionValue(listeners, "listeners");
            Iterator<T> it = listeners.iterator();
            while (it.hasNext()) {
                ((NetworkStateObserver.ConnectionListener) it.next()).onConnectionUpdated(true);
            }
            networkState = NetworkState.Enabled;
        } else {
            Set<NetworkStateObserver.ConnectionListener> listeners2 = this.listeners;
            Intrinsics.checkNotNullExpressionValue(listeners2, "listeners");
            Iterator<T> it2 = listeners2.iterator();
            while (it2.hasNext()) {
                ((NetworkStateObserver.ConnectionListener) it2.next()).onConnectionUpdated(false);
            }
            networkState = NetworkState.Disabled;
        }
        networkStateFlow.setValue(networkState);
    }

    @Override // org.bidon.sdk.utils.networking.NetworkStateObserver
    public void init(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (getNetworkStateFlow().getValue() != NetworkState.NotInitialized) {
            return;
        }
        Object systemService = applicationContext.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.connectivityManager = connectivityManager;
        if (connectivityManager == null) {
            return;
        }
        getNetworkStateFlow().setValue(NetworkState.Disabled);
        try {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new ConnectivityManager.NetworkCallback() { // from class: org.bidon.sdk.utils.networking.impl.NetworkStateObserverImpl$init$callback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onAvailable(network);
                    this.this$0.syncState();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    super.onLost(network);
                    this.this$0.syncState();
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    super.onUnavailable();
                    this.this$0.syncState();
                }
            });
        } catch (Throwable unused) {
            getNetworkStateFlow().setValue(NetworkState.ConnectivityManagerError);
        }
    }

    @Override // org.bidon.sdk.utils.networking.NetworkStateObserver
    public boolean isConnected() {
        return this.instantlyIsConnected.get();
    }

    @Override // org.bidon.sdk.utils.networking.NetworkStateObserver
    public void subscribe(@NotNull NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // org.bidon.sdk.utils.networking.NetworkStateObserver
    public void unsubscribe(@NotNull NetworkStateObserver.ConnectionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // org.bidon.sdk.utils.networking.NetworkStateObserver
    @NotNull
    public MutableStateFlow getNetworkStateFlow() {
        return this.networkStateFlow;
    }
}
