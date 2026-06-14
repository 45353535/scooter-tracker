package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20869a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f20869a = iArr;
        try {
            iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20869a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
