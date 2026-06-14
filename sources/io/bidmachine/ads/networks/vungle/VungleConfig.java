package io.bidmachine.ads.networks.vungle;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class VungleConfig extends NetworkConfig {

    @NonNull
    static final String KEY_APP_ID = "app_id";

    @NonNull
    static final String KEY_BID_TOKEN = "token";

    @NonNull
    static final String KEY_MARKUP = "markup";

    @NonNull
    static final String KEY_PLACEMENT_ID = "placement_id";

    @NonNull
    static final String KEY_PUBLISHER_ID = "publisher_id";

    public VungleConfig(@NonNull String str) {
        this(str, null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new VungleAdapter();
    }

    public VungleConfig setSkipInitialization(boolean z10) {
        return (VungleConfig) internalSetSkipInitialization(z10);
    }

    public VungleConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return (VungleConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str) { // from class: io.bidmachine.ads.networks.vungle.VungleConfig.2
            final /* synthetic */ String val$placementId;

            {
                this.val$placementId = str;
                put("placement_id", str);
            }
        });
    }

    public VungleConfig(@NonNull String str, @Nullable String str2) {
        this(new HashMap<String, String>(str, str2) { // from class: io.bidmachine.ads.networks.vungle.VungleConfig.1
            final /* synthetic */ String val$appId;
            final /* synthetic */ String val$publisherId;

            {
                this.val$appId = str;
                this.val$publisherId = str2;
                put("app_id", str);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                put(VungleConfig.KEY_PUBLISHER_ID, str2);
            }
        });
    }

    public VungleConfig(@Nullable Map<String, String> map) {
        super("", map);
    }
}
