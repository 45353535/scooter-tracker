package com.adjust.sdk.purchase;

/* JADX INFO: loaded from: classes5.dex */
public enum ADJPLogLevel {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    ASSERT(7),
    NONE(8);

    private final int adjustPurchaseLogLevel;

    ADJPLogLevel(int i10) {
        this.adjustPurchaseLogLevel = i10;
    }

    public int getAndroidLogLevel() {
        return this.adjustPurchaseLogLevel;
    }
}
