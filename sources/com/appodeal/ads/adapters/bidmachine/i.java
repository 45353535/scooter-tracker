package com.appodeal.ads.adapters.bidmachine;

import com.appodeal.ads.AdUnitParams;
import io.bidmachine.CustomParams;
import io.bidmachine.PriceFloorParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriceFloorParams f12091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomParams f12092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12093c;

    public i(PriceFloorParams priceFloorParams, CustomParams customParams, String str) {
        Intrinsics.checkNotNullParameter(priceFloorParams, "priceFloorParams");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.f12091a = priceFloorParams;
        this.f12092b = customParams;
        this.f12093c = str;
    }

    public final String toString() {
        return "BidmachineAdUnitParams(priceFloorParams=" + this.f12091a + ", customParams=" + this.f12092b + ", networksConfig=" + this.f12093c + ")";
    }
}
