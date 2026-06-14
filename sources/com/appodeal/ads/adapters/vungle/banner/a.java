package com.appodeal.ads.adapters.vungle.banner;

import com.appodeal.ads.adapters.vungle.e;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BannerAdSize f12597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedBannerCallback callback, BannerAdSize bannerSize) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        this.f12597c = bannerSize;
    }

    @Override // com.appodeal.ads.adapters.vungle.e
    public final void a(BannerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((UnifiedBannerCallback) this.f12601b).onAdLoaded(view, this.f12597c.getHeight());
    }
}
