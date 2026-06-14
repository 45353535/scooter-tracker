package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15173a;

    static {
        int[] iArr = new int[AdType.values().length];
        try {
            iArr[AdType.Banner.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdType.Mrec.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdType.Interstitial.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdType.Rewarded.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AdType.Native.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f15173a = iArr;
    }
}
