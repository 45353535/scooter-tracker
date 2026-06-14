package org.bidon.sdk.utils.networking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import qf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/utils/networking/NetworkState;", "", "<init>", "(Ljava/lang/String;I)V", "Enabled", "Disabled", "NotInitialized", "ConnectivityManagerError", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkState[] $VALUES;
    public static final NetworkState Enabled = new NetworkState("Enabled", 0);
    public static final NetworkState Disabled = new NetworkState("Disabled", 1);
    public static final NetworkState NotInitialized = new NetworkState("NotInitialized", 2);
    public static final NetworkState ConnectivityManagerError = new NetworkState("ConnectivityManagerError", 3);

    private static final /* synthetic */ NetworkState[] $values() {
        return new NetworkState[]{Enabled, Disabled, NotInitialized, ConnectivityManagerError};
    }

    static {
        NetworkState[] networkStateArr$values = $values();
        $VALUES = networkStateArr$values;
        $ENTRIES = a.a(networkStateArr$values);
    }

    private NetworkState(String str, int i10) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NetworkState valueOf(String str) {
        return (NetworkState) Enum.valueOf(NetworkState.class, str);
    }

    public static NetworkState[] values() {
        return (NetworkState[]) $VALUES.clone();
    }
}
