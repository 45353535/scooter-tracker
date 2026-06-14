package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class NetworkParamsImpl implements NetworkParams {

    @NonNull
    private final String networkKey;

    @NonNull
    private final String networkName;

    public NetworkParamsImpl(@NonNull String str, @NonNull String str2) {
        this.networkKey = str;
        this.networkName = str2;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }
}
