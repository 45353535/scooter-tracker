package com.appodeal.ads.adapters.applovin;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11961a;

    public b(String zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.f11961a = zoneId;
    }

    public final String toString() {
        return "ApplovinAdUnitParams(zoneId='" + this.f11961a + "')";
    }
}
