package com.startapp.sdk.ads.splash;

import com.startapp.sdk.ads.splash.SplashConfig;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63851a;

    static {
        int[] iArr = new int[SplashConfig.Theme.values().length];
        f63851a = iArr;
        try {
            iArr[SplashConfig.Theme.USER_DEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63851a[SplashConfig.Theme.DEEP_BLUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f63851a[SplashConfig.Theme.SKY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f63851a[SplashConfig.Theme.ASHEN_SKY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f63851a[SplashConfig.Theme.BLAZE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f63851a[SplashConfig.Theme.GLOOMY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f63851a[SplashConfig.Theme.OCEAN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
