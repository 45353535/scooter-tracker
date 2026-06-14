package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d3 extends uc {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.appodeal.ads.nativead.e f13225r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(r3 adRequest, AdNetwork adNetwork, x2 adUnit) {
        super(adRequest, adNetwork, adUnit, 5000);
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAd a(AdNetwork adNetwork) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        return adNetwork.createNativeAd();
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdCallback b() {
        return new v2(this);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdParams i() {
        return new z2();
    }
}
