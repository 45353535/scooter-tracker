package com.appodeal.ads.adapters.admobmediation.banner;

import com.appodeal.ads.adapters.admob.banner.AdmobBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AdmobBanner {
    @Override // com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner
    public final AdListener createListener(UnifiedBannerCallback callback, BaseAdView baseAdView, int i10) {
        AdView adView = (AdView) baseAdView;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(adView, "adView");
        return new a(adView, callback, i10);
    }
}
