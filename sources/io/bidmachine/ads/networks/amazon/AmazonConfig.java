package io.bidmachine.ads.networks.amazon;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class AmazonConfig extends NetworkConfig {

    @NonNull
    static final String APP_KEY = "app_key";

    @NonNull
    static final String BID_INFO = "bid_info";

    @NonNull
    static final String SLOT_UUID = "slot_uuid";

    public AmazonConfig(@NonNull String str) {
        this(new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.amazon.AmazonConfig.1
            final /* synthetic */ String val$appKey;

            {
                this.val$appKey = str;
                put("app_key", str);
            }
        });
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new AmazonAdapter();
    }

    public AmazonConfig setSkipInitialization(boolean z10) {
        return (AmazonConfig) internalSetSkipInitialization(z10);
    }

    public AmazonConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public AmazonConfig(@Nullable Map<String, String> map) {
        super("", map);
    }

    public AmazonConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str, @Nullable String str2) {
        return (AmazonConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str, str2) { // from class: io.bidmachine.ads.networks.amazon.AmazonConfig.2
            final /* synthetic */ String val$appKey;
            final /* synthetic */ String val$slotUuid;

            {
                this.val$slotUuid = str;
                this.val$appKey = str2;
                put(AmazonConfig.SLOT_UUID, str);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                put("app_key", str2);
            }
        });
    }
}
