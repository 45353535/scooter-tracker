package com.mobilefuse.sdk.rtb;

/* JADX INFO: loaded from: classes10.dex */
public enum ApiFramework {
    VPAID1(1),
    VPAID2(2),
    MRAID1(3),
    ORMMA(4),
    MRAID2(5),
    MRAID3(6),
    OMID1(7);

    private int value;

    ApiFramework(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
