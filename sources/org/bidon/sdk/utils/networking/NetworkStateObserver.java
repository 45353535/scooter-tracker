package org.bidon.sdk.utils.networking;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lorg/bidon/sdk/utils/networking/NetworkStateObserver;", "", "networkStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lorg/bidon/sdk/utils/networking/NetworkState;", "getNetworkStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "isConnected", "", "init", "", "applicationContext", "Landroid/content/Context;", "subscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/bidon/sdk/utils/networking/NetworkStateObserver$ConnectionListener;", "unsubscribe", "ConnectionListener", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface NetworkStateObserver {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lorg/bidon/sdk/utils/networking/NetworkStateObserver$ConnectionListener;", "", "onConnectionUpdated", "", "isConnected", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionListener {
        void onConnectionUpdated(boolean isConnected);
    }

    @NotNull
    StateFlow getNetworkStateFlow();

    void init(@NotNull Context applicationContext);

    boolean isConnected();

    void subscribe(@NotNull ConnectionListener listener);

    void unsubscribe(@NotNull ConnectionListener listener);
}
