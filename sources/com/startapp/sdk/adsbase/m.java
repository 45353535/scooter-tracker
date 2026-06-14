package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64076a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f64076a = iArr;
        try {
            iArr[StartAppAd.AdMode.FULLPAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64076a[StartAppAd.AdMode.OFFERWALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f64076a[StartAppAd.AdMode.OVERLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f64076a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
