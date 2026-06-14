package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.ads.nativead.StartAppNativeAd;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f63840a;

    static {
        int[] iArr = new int[StartAppNativeAd.CampaignAction.values().length];
        f63840a = iArr;
        try {
            iArr[StartAppNativeAd.CampaignAction.OPEN_MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f63840a[StartAppNativeAd.CampaignAction.LAUNCH_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
