package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes10.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final double f60;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityAdType f61;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f62;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f63;

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f64;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private double f66;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f67 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityAdType f65 = ISAdQualityAdType.UNKNOWN;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f67, this.f65, this.f66, this.f64, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f65 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f67 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f64 = str;
            return this;
        }

        public Builder setRevenue(double d10) {
            this.f66 = d10;
            return this;
        }
    }

    /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str, byte b10) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d10, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f61;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f62;
    }

    public String getPlacement() {
        return this.f63;
    }

    public double getRevenue() {
        return this.f60;
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str) {
        this.f62 = iSAdQualityMediationNetwork;
        this.f61 = iSAdQualityAdType;
        this.f60 = d10;
        this.f63 = str;
    }
}
