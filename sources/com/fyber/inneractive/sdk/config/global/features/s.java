package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20382a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f20382a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20382a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
