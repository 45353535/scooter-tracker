package com.appodeal.ads;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class w3 extends zc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15172c;

    public w3(String str) {
        this.f15172c = str;
    }

    @Override // com.appodeal.ads.zc, com.appodeal.ads.RestrictedData
    public final boolean isUserHasConsent() {
        String vendorName = this.f15172c;
        v4 v4Var = v4.f15140a;
        Intrinsics.checkNotNullParameter(vendorName, "vendorName");
        com.appodeal.ads.regulator.b0 b0Var = (com.appodeal.ads.regulator.b0) v4.f15141b.getValue();
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(vendorName, "vendorName");
        String str = ((com.appodeal.ads.regulator.shared.g) ((com.appodeal.ads.regulator.shared.a) b0Var.f14347b.getValue())).f14384f;
        return (str != null && StringsKt.g0(str, vendorName, false, 2, null)) || b0Var.f14348c;
    }
}
