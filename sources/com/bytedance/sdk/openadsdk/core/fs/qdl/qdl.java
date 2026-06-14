package com.bytedance.sdk.openadsdk.core.fs.qdl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public enum qdl {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);

    private final int jpc;

    qdl(int i10) {
        this.jpc = i10;
    }

    @NonNull
    public String qdl() {
        return String.valueOf(this.jpc);
    }
}
