package com.appodeal.ads.adapters.inmobi.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.inmobi.ads.InMobiNative;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiNative f12363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InMobiNative inMobiNative, String str, String str2, String str3, MediaAssets mediaAssets, Float f10) {
        super(str, str2, str3, mediaAssets, f10);
        this.f12363b = inMobiNative;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12363b.isVideo();
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View adChoiceIcon = this.f12363b.getAdChoiceIcon();
        return adChoiceIcon == null ? new View(context) : adChoiceIcon;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12362a = imageView;
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaView mediaView = this.f12363b.getMediaView();
        return mediaView != null ? mediaView : new FrameLayout(context);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12363b.destroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12363b.registerViewForTracking(new InMobiNativeViewData.Builder(nativeAdView).setIconView(this.f12362a).setTitleView(nativeAdView.getTitleView()).setDescriptionView(nativeAdView.getDescriptionView()).setCTAView(nativeAdView.getCallToActionView()).setRatingView(nativeAdView.getRatingView()).build());
    }
}
