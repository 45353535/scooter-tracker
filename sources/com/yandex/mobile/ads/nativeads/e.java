package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import yads.bn2;
import yads.d9;
import yads.dn2;
import yads.e9;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn2 f68293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d9 f68294b;

    public e(dn2 dn2Var, d9 d9Var) {
        this.f68293a = dn2Var;
        this.f68294b = d9Var;
    }

    public final e9 a(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        bn2 bn2VarA;
        AdTheme preferredTheme = nativeAdRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f68293a.getClass();
            bn2VarA = dn2.a(preferredTheme);
        } else {
            bn2VarA = null;
        }
        bn2 bn2Var = bn2VarA;
        this.f68294b.getClass();
        return new e9(nativeAdRequestConfiguration.getAdUnitId(), nativeAdRequestConfiguration.getAge(), nativeAdRequestConfiguration.getGender(), nativeAdRequestConfiguration.getContextQuery(), nativeAdRequestConfiguration.getContextTags(), nativeAdRequestConfiguration.getLocation(), nativeAdRequestConfiguration.getParameters(), nativeAdRequestConfiguration.getBiddingData(), null, bn2Var, nativeAdRequestConfiguration.getShouldLoadImagesAutomatically(), null);
    }

    public /* synthetic */ e() {
        this(new dn2(), new d9());
    }
}
