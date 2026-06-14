package com.appodeal.ads.adapters.dtexchange.unified;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12200a;

    static {
        int[] iArr = new int[InneractiveErrorCode.values().length];
        try {
            iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InneractiveErrorCode.UNKNOWN_APP_ID.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[InneractiveErrorCode.SERVER_INVALID_RESPONSE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[InneractiveErrorCode.NO_FILL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[InneractiveErrorCode.CANCELLED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[InneractiveErrorCode.ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f12200a = iArr;
    }
}
