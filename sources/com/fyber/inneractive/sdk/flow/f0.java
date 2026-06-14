package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20732a;

    static {
        int[] iArr = new int[InneractiveErrorCode.values().length];
        f20732a = iArr;
        try {
            iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20732a[InneractiveErrorCode.NO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20732a[InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
