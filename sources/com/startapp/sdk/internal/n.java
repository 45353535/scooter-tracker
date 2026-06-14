package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.StartAppAd;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64949a;

    static {
        int[] iArr = new int[StartAppAd.AdMode.values().length];
        f64949a = iArr;
        try {
            iArr[StartAppAd.AdMode.OFFERWALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64949a[StartAppAd.AdMode.OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f64949a[StartAppAd.AdMode.FULLPAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f64949a[StartAppAd.AdMode.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f64949a[StartAppAd.AdMode.REWARDED_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f64949a[StartAppAd.AdMode.AUTOMATIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
