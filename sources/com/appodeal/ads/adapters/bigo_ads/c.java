package com.appodeal.ads.adapters.bigo_ads;

import com.appodeal.ads.InitializeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements InitializeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12162b;

    public c(String appId, String appChannel) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appChannel, "appChannel");
        this.f12161a = appId;
        this.f12162b = appChannel;
    }

    public final String toString() {
        return "BigoAdsInitializeParams(appId='" + this.f12161a + "', appChannel='" + this.f12162b + "')";
    }
}
