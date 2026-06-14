package com.amazon.aps.ads.model;

import io.bidmachine.ads.networks.nast.NastAdapter;

/* JADX INFO: loaded from: classes5.dex */
public enum ApsMraidVersion {
    MRAID_V1(NastAdapter.ADAPTER_SDK_VERSION_NAME),
    MRAID_V2("2.0"),
    MRAID_V3("3.0");

    private String version;

    ApsMraidVersion(String str) {
        this.version = str;
    }

    public String getString() {
        return this.version;
    }
}
