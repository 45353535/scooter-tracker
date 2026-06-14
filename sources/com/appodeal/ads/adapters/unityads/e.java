package com.appodeal.ads.adapters.unityads;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12565a;

    public e(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f12565a = placementId;
    }

    public final String toString() {
        return "UnityAdsAdUnitParams(placementId='" + this.f12565a + "')";
    }
}
