package net.pubnative.lite.sdk.models;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes3.dex */
public enum IntegrationType {
    HEADER_BIDDING(CampaignEx.JSON_KEY_HB),
    IN_APP_BIDDING("b"),
    MEDIATION("m"),
    STANDALONE("s");

    private final String code;

    IntegrationType(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
