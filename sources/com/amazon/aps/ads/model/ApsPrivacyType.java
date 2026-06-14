package com.amazon.aps.ads.model;

import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes5.dex */
public enum ApsPrivacyType {
    IAB_CCPA_US_PRIVACY(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY),
    IAB_CCPA_APS_PRIVACY(DtbConstants.APS_ADMOB_CONST_CCPA_APS_PRIVACY),
    DSA_PRIVACY("dsa");

    private String strApsPrivacyType;

    ApsPrivacyType(String str) {
        this.strApsPrivacyType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.strApsPrivacyType;
    }
}
