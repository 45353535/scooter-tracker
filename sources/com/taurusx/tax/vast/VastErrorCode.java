package com.taurusx.tax.vast;

import com.taurusx.tax.g.n;
import com.taurusx.tax.g.r;

/* JADX INFO: loaded from: classes11.dex */
public enum VastErrorCode {
    XML_PARSING_ERROR("100"),
    WRAPPER_TIMEOUT("301"),
    NO_ADS_VAST_RESPONSE("303"),
    GENERAL_LINEAR_AD_ERROR("400"),
    GENERAL_COMPANION_AD_ERROR("600"),
    UNDEFINED_ERROR(n.f66164h);


    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f66979z;

    VastErrorCode(String str) {
        r.z(str, "errorCode cannot be null");
        this.f66979z = str;
    }

    public String z() {
        return this.f66979z;
    }
}
