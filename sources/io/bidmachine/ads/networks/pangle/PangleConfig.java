package io.bidmachine.ads.networks.pangle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PangleConfig extends NetworkConfig {

    @NonNull
    static final String KEY_APP_ID = "app_id";

    @NonNull
    static final String KEY_BID_PAYLOAD = "bid_payload";

    @NonNull
    static final String KEY_BID_TOKEN = "network_bid_token";

    @NonNull
    static final String KEY_SLOT_ID = "slot_id";

    public PangleConfig(@NonNull String str) {
        this(new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.pangle.PangleConfig.1
            final /* synthetic */ String val$appId;

            {
                this.val$appId = str;
                put("app_id", str);
            }
        });
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new PangleAdapter();
    }

    public PangleConfig setSkipInitialization(boolean z10) {
        return (PangleConfig) internalSetSkipInitialization(z10);
    }

    public PangleConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return (PangleConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.pangle.PangleConfig.2
            final /* synthetic */ String val$slotId;

            {
                this.val$slotId = str;
                put(PangleConfig.KEY_SLOT_ID, str);
            }
        });
    }

    public PangleConfig(@Nullable Map<String, String> map) {
        super("", map);
    }
}
