package com.appodeal.ads.adapters.yandex.native_ad;

import com.yandex.mobile.ads.nativeads.NativeAdType;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12631a;

    static {
        int[] iArr = new int[NativeAdType.values().length];
        try {
            iArr[NativeAdType.CONTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeAdType.MEDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeAdType.APP_INSTALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12631a = iArr;
    }
}
