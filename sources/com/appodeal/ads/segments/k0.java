package com.appodeal.ads.segments;

import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14488a;

    static {
        int[] iArr = new int[AdType.values().length];
        f14488a = iArr;
        try {
            iArr[AdType.Interstitial.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14488a[AdType.Rewarded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14488a[AdType.Banner.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14488a[AdType.Mrec.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14488a[AdType.Native.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
