package io.bidmachine.ads.networks.gam;

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
    static final String KEY_EXPIRATION_TIME_SEC = "expiration_time";

    @NonNull
    static final String KEY_OVERRIDE_CALLBACKS = "override_callbacks";

    @NonNull
    static final String KEY_PRICE = "price";

    @NonNull
    static final String KEY_REQUEST_AGENT = "request_agent";

    @NonNull
    static final String KEY_SCORE = "score";

    @NonNull
    static final String KEY_SUPPORTED_VERSIONS_RANGE = "supported_versions_range";

    @NonNull
    static final String KEY_WATERFALL_CONFIGURATIONS = "waterfall_configurations";

    public GAMConfig(@Nullable Map<String, String> map) {
        super(BuildConfig.ADAPTER_NAME, map);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter();
    }

    public GAMConfig(@NonNull String str, @Nullable Map<String, String> map) {
        super(str, map);
    }
}
