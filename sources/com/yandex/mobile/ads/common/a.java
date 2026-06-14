package com.yandex.mobile.ads.common;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f68251a;

    static {
        int[] iArr = new int[AdType.values().length];
        try {
            iArr[AdType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdType.REWARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdType.NATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AdType.APP_OPEN_AD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AdType.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f68251a = iArr;
    }
}
