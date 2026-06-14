package com.appodeal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface AdUnit {
    @Nullable
    String getAdUnitName();

    double getEcpm();

    long getExpTime();

    String getId();

    int getImpressionInterval();

    JSONObject getJsonData();

    int getLoadingTimeout();

    @Nullable
    String getMediatorName();

    @Nullable
    b3 getRequestResult();

    String getStatus();

    boolean isAsync();

    @Nullable
    Boolean isMuted();

    boolean isPrecache();

    boolean shouldGetNetworkEcpm();

    boolean shouldUseExactEcpm();
}
