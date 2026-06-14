package com.appodeal.ads;

import com.ironsource.C4424m2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8 extends w8 implements com.appodeal.ads.networking.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13391h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(uc adObject, te adRequest, com.appodeal.ads.segments.o placement, Double d10) {
        super(adObject, adRequest, placement, d10);
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f13391h = C4424m2.f43623v;
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f13391h;
    }
}
