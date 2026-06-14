package com.appodeal.ads.adapters.mobilefuse;

import com.mobilefuse.sdk.AdError;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12523a;

    static {
        int[] iArr = new int[AdError.values().length];
        try {
            iArr[AdError.AD_ALREADY_RENDERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdError.AD_ALREADY_LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdError.AD_RUNTIME_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdError.INCORRECT_ADM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AdError.AD_LOAD_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AdError.NO_FILL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f12523a = iArr;
    }
}
