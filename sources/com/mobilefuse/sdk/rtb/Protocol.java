package com.mobilefuse.sdk.rtb;

/* JADX INFO: loaded from: classes10.dex */
public enum Protocol {
    VAST1(1),
    VAST2(2),
    VAST3(3),
    VAST1_WRAPPER(4),
    VAST2_WRAPPER(5),
    VAST3_WRAPPER(6),
    VAST4(7),
    VAST4_WRAPPER(8),
    DAAST1(9),
    DAAST1_WRAPPER(10);

    private int value;

    Protocol(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
