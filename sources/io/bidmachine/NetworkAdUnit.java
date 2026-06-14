package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class NetworkAdUnit {

    @NonNull
    private final AdFormat adFormat;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NonNull
    private final String f79150id;

    @NonNull
    private final Map<String, String> mediationConfig;

    @NonNull
    private final NetworkAdapter networkAdapter;

    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdFormat adFormat, @NonNull Map<String, String> map) {
        this.f79150id = UUID.randomUUID().toString();
        this.networkAdapter = networkAdapter;
        this.adFormat = adFormat;
        this.mediationConfig = map;
    }

    void clearAuction() throws Throwable {
        getNetworkAdapter().clearAuction(this);
    }

    @NonNull
    @Deprecated(since = "3.5.0")
    public AdsFormat getAdFormat() {
        return AdsFormat.fromAdFormat(this.adFormat);
    }

    @NonNull
    public AdFormat getFormat() {
        return this.adFormat;
    }

    @NonNull
    public String getId() {
        return this.f79150id;
    }

    @NonNull
    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    @Nullable
    public String getMediationParameter(@NonNull String str) {
        return this.mediationConfig.get(str);
    }

    @NonNull
    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    void onLossAuction() throws Throwable {
        getNetworkAdapter().onLossAuction(this);
    }

    void onWinAuction() throws Throwable {
        getNetworkAdapter().onWinAuction(this);
    }

    @Deprecated(since = "3.5.0")
    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        this(networkAdapter, adsFormat.toAdFormat(), map);
    }
}
