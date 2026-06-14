package io.bidmachine.ads.networks.mintegral;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class MintegralConfig extends NetworkConfig {

    @NonNull
    static final String KEY_AD_UNIT_ID = "ad_unit_id";

    @NonNull
    static final String KEY_APP_ID = "app_id";

    @NonNull
    static final String KEY_APP_KEY = "app_key";

    @NonNull
    static final String KEY_BID_TOKEN = "bid_token";

    @NonNull
    static final String KEY_BUYER_UID = "buyer_uid";

    @NonNull
    static final String KEY_PLACEMENT_ID = "placement_id";

    public MintegralConfig(@NonNull String str, @NonNull String str2) {
        this(new HashMap<String, String>(str, str2) { // from class: io.bidmachine.ads.networks.mintegral.MintegralConfig.1
            final /* synthetic */ String val$appId;
            final /* synthetic */ String val$appKey;

            {
                this.val$appId = str;
                this.val$appKey = str2;
                put("app_id", str);
                put("app_key", str2);
            }
        });
    }

    @Override // io.bidmachine.NetworkConfig
    @NonNull
    protected NetworkAdapter createNetworkAdapter() {
        return new MintegralAdapter();
    }

    public MintegralConfig setSkipInitialization(boolean z10) {
        return (MintegralConfig) internalSetSkipInitialization(z10);
    }

    public MintegralConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str) {
        return withMediationConfig(adsFormat, str, (String) null);
    }

    public MintegralConfig(@Nullable Map<String, String> map) {
        super("", map);
    }

    public MintegralConfig withMediationConfig(@NonNull AdsFormat adsFormat, @NonNull String str, @Nullable String str2) {
        return (MintegralConfig) withMediationConfig(adsFormat, new HashMap<String, String>(str, str2) { // from class: io.bidmachine.ads.networks.mintegral.MintegralConfig.2
            final /* synthetic */ String val$adUnitId;
            final /* synthetic */ String val$placementId;

            {
                this.val$adUnitId = str;
                this.val$placementId = str2;
                put(MintegralConfig.KEY_AD_UNIT_ID, str);
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                put("placement_id", str2);
            }
        });
    }
}
