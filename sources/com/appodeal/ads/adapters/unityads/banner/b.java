package com.appodeal.ads.adapters.unityads.banner;

import com.unity3d.services.banners.BannerErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12560a;

    static {
        int[] iArr = new int[BannerErrorCode.values().length];
        f12560a = iArr;
        try {
            iArr[BannerErrorCode.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12560a[BannerErrorCode.NATIVE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12560a[BannerErrorCode.WEBVIEW_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12560a[BannerErrorCode.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
