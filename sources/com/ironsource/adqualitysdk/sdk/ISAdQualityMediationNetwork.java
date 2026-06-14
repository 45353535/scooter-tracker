package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes10.dex */
public enum ISAdQualityMediationNetwork {
    UNKNOWN(-1),
    ADMOB(0),
    DT_FAIR_BID(1),
    HELIUM(2),
    LEVEL_PLAY(3),
    MAX(4),
    UNITY(5),
    SELF_MEDIATED(6),
    OTHER(7);


    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f75;

    ISAdQualityMediationNetwork(int i10) {
        this.f75 = i10;
    }

    public static ISAdQualityMediationNetwork fromInt(int i10) {
        switch (i10) {
            case -1:
                return UNKNOWN;
            case 0:
                return ADMOB;
            case 1:
                return DT_FAIR_BID;
            case 2:
                return HELIUM;
            case 3:
                return LEVEL_PLAY;
            case 4:
                return MAX;
            case 5:
                return UNITY;
            case 6:
                return SELF_MEDIATED;
            case 7:
                return OTHER;
            default:
                return null;
        }
    }

    public final int getValue() {
        return this.f75;
    }
}
