package com.appodeal.ads.adapters.unityads;

import com.unity3d.ads.UnityAds;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12558a;

    static {
        int[] iArr = new int[UnityAds.UnityAdsLoadError.values().length];
        f12558a = iArr;
        try {
            iArr[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12558a[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12558a[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12558a[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12558a[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
