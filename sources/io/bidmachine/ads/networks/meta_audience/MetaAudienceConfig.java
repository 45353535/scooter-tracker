package io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public class MetaAudienceConfig extends NetworkConfig {

    @NonNull
    static final String KEY_APP_ID = "app_id";

    @NonNull
    static final String KEY_BID_PAYLOAD = "bid_payload";

    @NonNull
    static final String KEY_PLACEMENT_ID = "meta_key";

    @NonNull
    static final String KEY_TOKEN = "token";

    public MetaAudienceConfig(@NonNull String str) {
        this(new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.meta_audience.MetaAudienceConfig.1
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
        return new MetaAudienceAdapter();
    }

    public MetaAudienceConfig setSkipInitialization(boolean z10) {
        return (MetaAudienceConfig) internalSetSkipInitialization(z10);
    }

    public MetaAudienceConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public MetaAudienceConfig(@Nullable Map<String, String> map) {
        super("", map);
    }

    public MetaAudienceConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str, @Nullable String str2) {
        return (MetaAudienceConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str, str2) { // from class: io.bidmachine.ads.networks.meta_audience.MetaAudienceConfig.2
            final /* synthetic */ String val$appId;
            final /* synthetic */ String val$placementId;

            {
                this.val$placementId = str;
                this.val$appId = str2;
                put(MetaAudienceConfig.KEY_PLACEMENT_ID, str);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                put("app_id", str2);
            }
        });
    }
}
