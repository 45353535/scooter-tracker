package io.bidmachine.ads.networks.nast;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* JADX INFO: loaded from: classes12.dex */
public class NastConfig extends NetworkConfig {
    public NastConfig() {
        super(NastAdapter.KEY, null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}
