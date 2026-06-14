package com.fyber.inneractive.sdk.cache.session.enums;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20241a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f20241a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20241a[UnitDisplayType.MRECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20241a[UnitDisplayType.BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20241a[UnitDisplayType.INTERSTITIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
