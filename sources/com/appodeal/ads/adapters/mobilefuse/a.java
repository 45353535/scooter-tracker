package com.appodeal.ads.adapters.mobilefuse;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12515b;

    public a(String placementId, boolean z10) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.f12514a = placementId;
        this.f12515b = z10;
    }

    public final String toString() {
        return "MobilefuseAdUnitParams(placementId='" + this.f12514a + "', isMuted=" + this.f12515b + ")";
    }
}
