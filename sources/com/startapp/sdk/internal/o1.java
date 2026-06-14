package com.startapp.sdk.internal;

import com.startapp.sdk.ads.banner.BannerFormat;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64986a;

    static {
        int[] iArr = new int[BannerFormat.values().length];
        f64986a = iArr;
        try {
            iArr[BannerFormat.MREC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64986a[BannerFormat.COVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
