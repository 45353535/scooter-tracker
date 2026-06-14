package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64757a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f64757a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f64757a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f64757a[AdPreferences.Placement.INAPP_NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
