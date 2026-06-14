package com.appodeal.ads.services.adjust.revenue;

import com.appodeal.ads.revenue.RevenuePlatform;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14562a;

    static {
        int[] iArr = new int[RevenuePlatform.values().length];
        try {
            iArr[RevenuePlatform.APPODEAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RevenuePlatform.APPLOVIN_MAX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RevenuePlatform.LEVEL_PLAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f14562a = iArr;
    }
}
