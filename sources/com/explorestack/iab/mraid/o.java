package com.explorestack.iab.mraid;

import java.util.List;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes5.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18147a;

    public o(List list) {
        this.f18147a = list;
    }

    public boolean a() {
        d.a("MraidNativeFeatureManager", "isCalendarSupported: false (deprecated)", new Object[0]);
        return false;
    }

    public boolean b() {
        List list = this.f18147a;
        boolean z10 = list != null && list.contains(MRAIDNativeFeature.INLINE_VIDEO);
        d.a("MraidNativeFeatureManager", "isInlineVideoSupported: %s", Boolean.valueOf(z10));
        return z10;
    }

    public boolean c() {
        d.a("MraidNativeFeatureManager", "isSmsSupported: false (deprecated)", new Object[0]);
        return false;
    }

    public boolean d() {
        d.a("MraidNativeFeatureManager", "isStorePictureSupported: false (deprecated)", new Object[0]);
        return false;
    }

    public boolean e() {
        d.a("MraidNativeFeatureManager", "isTelSupported: false (deprecated)", new Object[0]);
        return false;
    }
}
