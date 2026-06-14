package com.appodeal.ads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v7 extends w8 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15150h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(uc adObject, te adRequest, com.appodeal.ads.segments.o placement, Double d10) {
        super(adObject, adRequest, placement, d10);
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f15150h = "click";
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f15150h;
    }
}
