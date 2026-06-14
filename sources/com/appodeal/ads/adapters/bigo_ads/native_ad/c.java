package com.appodeal.ads.adapters.bigo_ads.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNativeAd implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaView f12172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdOptionsView f12173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NativeAd f12174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f12175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NativeAd nativeAd, UnifiedNativeCallback unifiedNativeCallback, String str, String str2, String str3) {
        super(str, str2, str3, null, null, 24, null);
        this.f12174d = nativeAd;
        this.f12175e = unifiedNativeCallback;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12174d.getCreativeType() == NativeAd.CreativeType.VIDEO;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AdOptionsView adOptionsView = new AdOptionsView(context);
        this.f12173c = adOptionsView;
        return adOptionsView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12171a = imageView;
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaView mediaView = new MediaView(context);
        this.f12172b = mediaView;
        return mediaView;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f12175e.onAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12175e.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        UnifiedNativeCallback unifiedNativeCallback = this.f12175e;
        String message = adError.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        unifiedNativeCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(message, Integer.valueOf(adError.getCode())));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12171a = null;
        this.f12172b = null;
        this.f12173c = null;
        this.f12174d.destroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        this.f12174d.setAdInteractionListener(this);
        View titleView = nativeAdView.getTitleView();
        if (titleView != null) {
            titleView.setTag(2);
        }
        View descriptionView = nativeAdView.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setTag(6);
        }
        View callToActionView = nativeAdView.getCallToActionView();
        if (callToActionView != null) {
            callToActionView.setTag(7);
        }
        this.f12174d.registerViewForInteraction(nativeAdView, this.f12172b, this.f12171a, this.f12173c, nativeAdView.getClickableViews());
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        this.f12174d.setAdInteractionListener(null);
        View titleView = nativeAdView.getTitleView();
        if (titleView != null) {
            titleView.setTag(null);
        }
        View descriptionView = nativeAdView.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setTag(null);
        }
        View callToActionView = nativeAdView.getCallToActionView();
        if (callToActionView != null) {
            callToActionView.setTag(null);
        }
        this.f12171a = null;
        this.f12172b = null;
        this.f12173c = null;
    }
}
