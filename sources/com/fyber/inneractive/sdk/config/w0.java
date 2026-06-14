package com.fyber.inneractive.sdk.config;

import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: loaded from: classes7.dex */
public enum w0 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO("3"),
    APP_INFO(Protocol.VAST_1_0_WRAPPER),
    STORE_PROMO("5");

    String value;

    w0(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
