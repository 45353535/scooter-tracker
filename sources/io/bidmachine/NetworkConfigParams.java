package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface NetworkConfigParams {
    @Nullable
    String getFromNetworkParams(@NonNull String str);

    @Nullable
    @Deprecated(since = "3.5.0")
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable AdsFormat... adsFormatArr);

    @Nullable
    Map<String, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable String... strArr);

    @NonNull
    Map<String, String> obtainNetworkParams();

    @Nullable
    String removeFromNetworkParams(@NonNull String str);
}
