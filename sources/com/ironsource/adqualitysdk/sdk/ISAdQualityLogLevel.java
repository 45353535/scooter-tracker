package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes10.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f73;

    ISAdQualityLogLevel(int i10) {
        this.f73 = i10;
    }

    public static ISAdQualityLogLevel fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return ERROR;
        }
        if (i10 == 2) {
            return WARNING;
        }
        if (i10 == 3) {
            return INFO;
        }
        if (i10 == 4) {
            return DEBUG;
        }
        if (i10 != 5) {
            return null;
        }
        return VERBOSE;
    }

    public final int getValue() {
        return this.f73;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = this.f73;
        return i10 != NONE.f73 && i10 >= iSAdQualityLogLevel.f73;
    }
}
