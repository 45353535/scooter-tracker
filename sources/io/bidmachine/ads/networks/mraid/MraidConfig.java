package io.bidmachine.ads.networks.mraid;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* JADX INFO: loaded from: classes12.dex */
public class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super("mraid", null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}
