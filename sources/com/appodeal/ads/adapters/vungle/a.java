package com.appodeal.ads.adapters.vungle;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12595a;

    public a(String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f12595a = placementId;
    }

    public final String toString() {
        return "VungleAdUnitParams(placementId='" + this.f12595a + "')";
    }
}
