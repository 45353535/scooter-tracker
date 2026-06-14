package io.bidmachine.ads.networks.my_target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class MyTargetConfig extends NetworkConfig {

    @NonNull
    static final String KEY_BIDDER_TOKEN = "bidder_token";

    @NonNull
    static final String KEY_BID_ID = "bid_id";

    @NonNull
    static final String KEY_SLOT_ID = "slot_id";

    public MyTargetConfig() {
        this(null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new MyTargetAdapter();
    }

    public MyTargetConfig setSkipInitialization(boolean z10) {
        return (MyTargetConfig) internalSetSkipInitialization(z10);
    }

    public MyTargetConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return (MyTargetConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.my_target.MyTargetConfig.1
            final /* synthetic */ String val$slotId;

            {
                this.val$slotId = str;
                put(MyTargetConfig.KEY_SLOT_ID, str);
            }
        });
    }

    public MyTargetConfig(@Nullable Map<String, String> map) {
        super("", map);
    }
}
