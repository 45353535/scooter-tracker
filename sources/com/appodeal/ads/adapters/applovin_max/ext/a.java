package com.appodeal.ads.adapters.applovin_max.ext;

import com.applovin.mediation.MaxNetworkResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11996a;

    static {
        int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
        try {
            iArr[MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11996a = iArr;
    }
}
