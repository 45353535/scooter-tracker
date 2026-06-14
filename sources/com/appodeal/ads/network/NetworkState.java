package com.appodeal.ads.network;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/network/NetworkState;", "", "Enabled", "Disabled", "NotInitialized", "ConnectivityManagerError", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkState {
    public static final NetworkState ConnectivityManagerError;
    public static final NetworkState Disabled;
    public static final NetworkState Enabled;
    public static final NetworkState NotInitialized;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NetworkState[] f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f13946b;

    static {
        NetworkState networkState = new NetworkState("Enabled", 0);
        Enabled = networkState;
        NetworkState networkState2 = new NetworkState("Disabled", 1);
        Disabled = networkState2;
        NetworkState networkState3 = new NetworkState("NotInitialized", 2);
        NotInitialized = networkState3;
        NetworkState networkState4 = new NetworkState("ConnectivityManagerError", 3);
        ConnectivityManagerError = networkState4;
        NetworkState[] networkStateArr = {networkState, networkState2, networkState3, networkState4};
        f13945a = networkStateArr;
        f13946b = qf.a.a(networkStateArr);
    }

    public NetworkState(String str, int i10) {
    }

    public static EnumEntries getEntries() {
        return f13946b;
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) f13945a.clone();
    }
}
