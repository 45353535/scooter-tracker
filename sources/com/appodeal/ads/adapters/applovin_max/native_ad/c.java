package com.appodeal.ads.adapters.applovin_max.native_ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public class c extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaxAd f12063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxNativeAdLoader f12064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f12065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f12066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f12067e;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(MaxNativeAd maxNativeAd, MaxAd maxAd, MaxNativeAdLoader nativeAdLoader) {
        Intrinsics.checkNotNullParameter(maxNativeAd, "maxNativeAd");
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        String title = maxNativeAd.getTitle();
        String str = title == null ? "" : title;
        String body = maxNativeAd.getBody();
        String callToAction = maxNativeAd.getCallToAction();
        String str2 = callToAction == null ? "" : callToAction;
        Double starRating = maxNativeAd.getStarRating();
        super(str, body, str2, null, starRating != null ? Float.valueOf((float) starRating.doubleValue()) : null, 8, null);
        this.f12063a = maxAd;
        this.f12064b = nativeAdLoader;
    }

    public final MaxNativeAdViewBinder.Builder a(FrameLayout innerContainer, NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(innerContainer, "innerContainer");
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        MaxNativeAdViewBinder.Builder builder = new MaxNativeAdViewBinder.Builder(innerContainer);
        View titleView = nativeAdView.getTitleView();
        if (titleView != null) {
            builder.setTitleTextViewId(titleView.getId());
        }
        View descriptionView = nativeAdView.getDescriptionView();
        if (descriptionView != null) {
            builder.setBodyTextViewId(descriptionView.getId());
        }
        View callToActionView = nativeAdView.getCallToActionView();
        if (callToActionView != null) {
            builder.setCallToActionButtonId(callToActionView.getId());
        }
        View ratingView = nativeAdView.getRatingView();
        if (ratingView != null) {
            ViewParent parent = ratingView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                builder.setStarRatingContentViewGroupId(viewGroup.getId());
            }
        }
        ImageView imageView = this.f12065c;
        if (imageView != null) {
            builder.setIconImageViewId(imageView.getId());
        }
        this.f12065c = null;
        FrameLayout frameLayout = this.f12066d;
        if (frameLayout != null) {
            builder.setMediaContentViewGroupId(frameLayout.getId());
        }
        this.f12066d = null;
        FrameLayout frameLayout2 = this.f12067e;
        if (frameLayout2 != null) {
            builder.setOptionsContentViewGroupId(frameLayout2.getId());
        }
        this.f12067e = null;
        return builder;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return false;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12067e = frameLayout;
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12065c = imageView;
        imageView.setId(View.generateViewId());
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12066d = frameLayout;
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12065c = null;
        this.f12066d = null;
        this.f12067e = null;
        this.f12064b.destroy(this.f12063a);
        this.f12064b.destroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(a(nativeAdView.getInnerContainer(), nativeAdView).build(), nativeAdView.getContext());
        nativeAdView.configureContainer(maxNativeAdView);
        this.f12064b.render(maxNativeAdView, this.f12063a);
    }
}
