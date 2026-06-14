package com.appodeal.ads.regulator;

import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14356d;

    public e(String appKey, boolean z10, String sdk, String sdkVersion) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.f14353a = appKey;
        this.f14354b = z10;
        this.f14355c = sdk;
        this.f14356d = sdkVersion;
    }

    public final String toString() {
        return "OnStarted [appKey: " + this.f14353a + ", tagForUnderAgeOfConsent: " + this.f14354b + ", sdk: " + this.f14355c + ", sdkVersion: " + this.f14356d + C4240b4.j.f42674e;
    }
}
