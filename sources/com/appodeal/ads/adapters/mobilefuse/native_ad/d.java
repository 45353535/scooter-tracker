package com.appodeal.ads.adapters.mobilefuse.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.mobilefuse.sdk.MobileFuseNativeAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileFuseNativeAd f12535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MediaAssets mediaAssets, MobileFuseNativeAd mobileFuseNativeAd, String str, String str2, String str3) {
        super(str, str2, str3, mediaAssets, null, 16, null);
        this.f12535a = mobileFuseNativeAd;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12535a.hasMainVideo();
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View iconView = this.f12535a.getIconView();
        return iconView == null ? new ImageView(context) : iconView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View mainContentView = this.f12535a.getMainContentView();
        return mainContentView == null ? new FrameLayout(context) : mainContentView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) throws Throwable {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12535a.registerViewForInteraction(nativeAdView, nativeAdView.getClickableViews());
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) throws Throwable {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12535a.unregisterViews();
    }
}
