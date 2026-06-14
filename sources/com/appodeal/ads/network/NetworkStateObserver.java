package com.appodeal.ads.network;

import android.content.Context;
import com.appodeal.ads.api.Device;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/appodeal/ads/network/NetworkStateObserver;", "", "networkStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/appodeal/ads/network/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "init", "", "applicationContext", "Landroid/content/Context;", "isConnected", "", "getNetworkType", "Lcom/appodeal/ads/api/Device$ConnectionType;", "subscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appodeal/ads/network/NetworkStateObserver$ConnectionListener;", "unsubscribe", "ConnectionListener", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkStateObserver {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/appodeal/ads/network/NetworkStateObserver$ConnectionListener;", "", "onAvailable", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionListener {
        void onAvailable();
    }

    Flow getNetworkStateFlow();

    Device.ConnectionType getNetworkType();

    void init(Context applicationContext);

    boolean isConnected();

    void subscribe(ConnectionListener listener);

    void unsubscribe(ConnectionListener listener);
}
