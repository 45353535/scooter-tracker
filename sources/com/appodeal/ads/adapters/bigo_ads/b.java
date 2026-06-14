package com.appodeal.ads.adapters.bigo_ads;

import com.appodeal.ads.AdUnitParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12156a;

    public b(String slotId) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.f12156a = slotId;
    }

    public final String toString() {
        return "BidoAdsAdUnitParams(slotId='" + this.f12156a + "')";
    }
}
