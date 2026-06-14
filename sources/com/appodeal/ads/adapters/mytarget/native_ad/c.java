package com.appodeal.ads.adapters.mytarget.native_ad;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.my.target.nativeads.NativeAd;
import com.my.target.nativeads.banners.NativePromoBanner;
import com.my.target.nativeads.factories.NativeViewsFactory;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.NativeAdChoicesView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAd f12550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NativeAd nativeAd, String str, String str2, String str3, Float f10) {
        super(str, str2, str3, null, f10, 8, null);
        this.f12550a = nativeAd;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        NativePromoBanner banner = this.f12550a.getBanner();
        return banner != null && banner.hasVideo();
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NativeAdChoicesView nativeAdChoicesView = NativeViewsFactory.getNativeAdChoicesView(context);
        Intrinsics.checkNotNullExpressionValue(nativeAdChoicesView, "getNativeAdChoicesView(...)");
        return nativeAdChoicesView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IconAdView iconAdView = NativeViewsFactory.getIconAdView(context);
        Intrinsics.checkNotNullExpressionValue(iconAdView, "getIconAdView(...)");
        return iconAdView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaAdView mediaAdView = NativeViewsFactory.getMediaAdView(context);
        Intrinsics.checkNotNullExpressionValue(mediaAdView, "getMediaAdView(...)");
        return mediaAdView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12550a.setListener(null);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12550a.registerView(nativeAdView);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12550a.unregisterView();
    }
}
