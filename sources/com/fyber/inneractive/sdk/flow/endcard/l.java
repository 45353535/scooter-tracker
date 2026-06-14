package com.fyber.inneractive.sdk.flow.endcard;

/* JADX INFO: loaded from: classes7.dex */
public enum l {
    Default(1),
    Fmp(2),
    Companion(3);

    private final int mPriority;

    l(int i10) {
        this.mPriority = i10;
    }

    public final int a() {
        return this.mPriority;
    }
}
