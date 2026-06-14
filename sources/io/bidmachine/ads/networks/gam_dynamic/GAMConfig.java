package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class GAMConfig extends NetworkConfig {

    @NonNull
    static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NonNull
    static final String KEY_CONTEXT = "context";

    @NonNull
    static final String KEY_PRICE = "price";

    @NonNull
    static final String KEY_SUPPORTED_VERSIONS_RANGE = "supported_versions_range";

    public GAMConfig(@Nullable Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter(getNetworkKey());
    }

    public GAMConfig(@NonNull String str, @Nullable Map<String, String> map) {
        super(str, map);
    }
}
