package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20208a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f20208a = iArr;
        try {
            iArr[UnitDisplayType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20208a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20208a[UnitDisplayType.REWARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20208a[UnitDisplayType.MRECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20208a[UnitDisplayType.NATIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
