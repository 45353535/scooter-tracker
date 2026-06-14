package com.appodeal.ads.adapters.applovin_max.native_ad;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.appodeal.ads.nativead.NativeAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaxAd f12068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MaxNativeAdLoader f12069g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MaxNativeAd maxNativeAd, MaxAd maxAd, MaxNativeAdLoader nativeAdLoader) {
        super(maxNativeAd, maxAd, nativeAdLoader);
        Intrinsics.checkNotNullParameter(maxNativeAd, "maxNativeAd");
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        this.f12068f = maxAd;
        this.f12069g = nativeAdLoader;
    }

    @Override // com.appodeal.ads.adapters.applovin_max.native_ad.c, com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        FrameLayout innerContainer = nativeAdView.getInnerContainer();
        View textView = new TextView(nativeAdView.getContext());
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new FrameLayout.LayoutParams(1, 1));
        textView.setVisibility(8);
        nativeAdView.addView(textView);
        MaxNativeAdViewBinder.Builder builderA = a(innerContainer, nativeAdView);
        builderA.setAdvertiserTextViewId(textView.getId());
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(builderA.build(), nativeAdView.getContext());
        nativeAdView.configureContainer(maxNativeAdView);
        this.f12069g.render(maxNativeAdView, this.f12068f);
    }
}
