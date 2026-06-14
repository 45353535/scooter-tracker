package com.appodeal.ads.adapters.meta.native_ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaView f12487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAd f12488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MediaAssets mediaAssets, NativeAd nativeAd, String str, String str2, String str3, Float f10) {
        super(str, str2, str3, mediaAssets, f10);
        this.f12488c = nativeAd;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12488c.getAdCreativeType() == NativeAd.AdCreativeType.VIDEO;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AdOptionsView adOptionsView = new AdOptionsView(context, this.f12488c, null);
        adOptionsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return adOptionsView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12486a = imageView;
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaView mediaView = new MediaView(context);
        this.f12487b = mediaView;
        return mediaView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12486a = null;
        MediaView mediaView = this.f12487b;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.f12487b = null;
        this.f12488c.destroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12488c.registerViewForInteraction(nativeAdView, this.f12487b, this.f12486a, nativeAdView.getClickableViews());
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12488c.unregisterView();
        this.f12486a = null;
        MediaView mediaView = this.f12487b;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.f12487b = null;
    }
}
