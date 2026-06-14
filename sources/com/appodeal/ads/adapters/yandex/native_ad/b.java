package com.appodeal.ads.adapters.yandex.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.utils.Log;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNativeAd implements NativeAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaView f12633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAd f12634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f12635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeAd nativeAd, UnifiedNativeCallback unifiedNativeCallback, String str, String str2, String str3, Float f10) {
        super(str, str2, str3, null, f10, 8, null);
        this.f12634c = nativeAd;
        this.f12635d = unifiedNativeCallback;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12634c.getAdAssets().getMedia() != null;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new View(context);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12632a = imageView;
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaView mediaView = new MediaView(context);
        this.f12633b = mediaView;
        return mediaView;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
        this.f12635d.onAdClicked();
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12632a = null;
        this.f12633b = null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onImpression(ImpressionData impressionData) {
        this.f12635d.onAdRevenueReceived(com.appodeal.ads.adapters.yandex.b.a(impressionData));
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        TextView textView = new TextView(nativeAdView.getContext());
        textView.setVisibility(8);
        ImageView imageView = new ImageView(nativeAdView.getContext());
        imageView.setVisibility(8);
        TextView textView2 = new TextView(nativeAdView.getContext());
        textView2.setVisibility(8);
        TextView textView3 = new TextView(nativeAdView.getContext());
        textView3.setVisibility(8);
        Context context = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        com.yandex.mobile.ads.nativeads.NativeAdView nativeAdView2 = new com.yandex.mobile.ads.nativeads.NativeAdView(context);
        nativeAdView2.addView(nativeAdView.getInnerContainer(), 0);
        nativeAdView2.addView(textView, new FrameLayout.LayoutParams(1, 1));
        nativeAdView2.addView(imageView, new FrameLayout.LayoutParams(1, 1));
        nativeAdView2.addView(textView2, new FrameLayout.LayoutParams(1, 1));
        nativeAdView2.addView(textView3, new FrameLayout.LayoutParams(1, 1));
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(nativeAdView2);
        builder.setDomainView(textView);
        builder.setFeedbackView(imageView);
        builder.setSponsoredView(textView2);
        builder.setWarningView(textView3);
        View titleView = nativeAdView.getTitleView();
        builder.setTitleView(titleView instanceof TextView ? (TextView) titleView : null);
        View callToActionView = nativeAdView.getCallToActionView();
        builder.setCallToActionView(callToActionView instanceof TextView ? (TextView) callToActionView : null);
        View descriptionView = nativeAdView.getDescriptionView();
        builder.setBodyView(descriptionView instanceof TextView ? (TextView) descriptionView : null);
        builder.setMediaView(this.f12633b);
        int i10 = a.f12631a[this.f12634c.getAdType().ordinal()];
        if (i10 == 1 || i10 == 2) {
            builder.setFaviconView(this.f12632a);
        } else {
            if (i10 != 3) {
                throw new m();
            }
            builder.setIconView(this.f12632a);
        }
        this.f12632a = null;
        this.f12633b = null;
        try {
            this.f12634c.setNativeAdEventListener(this);
            this.f12634c.bindNativeAd(builder.build());
            nativeAdView.configureContainer(nativeAdView2);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12634c.setNativeAdEventListener(null);
        this.f12632a = null;
        this.f12633b = null;
    }
}
