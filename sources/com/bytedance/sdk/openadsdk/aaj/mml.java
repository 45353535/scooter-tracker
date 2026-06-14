package com.bytedance.sdk.openadsdk.aaj;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes6.dex */
public enum mml {
    TYPE_2G("2g"),
    TYPE_3G(X3.f42017a),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI(X3.f42018b),
    TYPE_MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY),
    TYPE_UNKNOWN("unknown");

    private String jpc;

    mml(String str) {
        this.jpc = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.jpc;
    }
}
