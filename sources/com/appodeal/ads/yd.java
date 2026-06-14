package com.appodeal.ads;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.VideoData;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.nativead.NativeIconView;
import com.appodeal.ads.nativead.NativeMediaView;
import com.appodeal.ads.unified.AdNetworkConnector;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.AppodealException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yd implements com.appodeal.ads.nativead.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.appodeal.ads.nativead.e f15295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdNetworkConnector f15296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f15297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f15298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f15299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.appodeal.ads.segments.o f15301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference f15302i;

    public yd(com.appodeal.ads.nativead.e nativeAd, AdNetworkConnector adNetworkConnector, Function0 onViewShown, Function0 onViewClicked, Function0 onViewTrackingFinished) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(adNetworkConnector, "adNetworkConnector");
        Intrinsics.checkNotNullParameter(onViewShown, "onViewShown");
        Intrinsics.checkNotNullParameter(onViewClicked, "onViewClicked");
        Intrinsics.checkNotNullParameter(onViewTrackingFinished, "onViewTrackingFinished");
        this.f15295b = nativeAd;
        this.f15296c = adNetworkConnector;
        this.f15297d = onViewShown;
        this.f15298e = onViewClicked;
        this.f15299f = onViewTrackingFinished;
        com.appodeal.ads.segments.o DEFAULT = com.appodeal.ads.segments.o.f14492i;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.f15301h = DEFAULT;
        this.f15302i = new WeakReference(null);
    }

    public static final void e(yd ydVar, View view) {
        ydVar.f15298e.invoke();
    }

    public static boolean f(Collection collection) {
        boolean z10 = (collection.contains("TitleView") || collection.contains("DescriptionView") || collection.contains("CallToActionView") || (collection.contains("IconView") && collection.contains("MediaView"))) ? false : true;
        if (!z10) {
            Log.log(new AppodealException("Required assets: " + CollectionsKt.joinToString$default(collection, null, null, null, 0, null, null, 63, null) + " not found. \n                Please check if NativeAdView contains all required views.\n                Documentation: https://docs.appodeal.com/android/ad-types/native"));
        }
        return z10;
    }

    @Override // com.appodeal.ads.nativead.h
    public final void a() {
        VideoData video = this.f15295b.f13870b.getMediaAssets().getVideo();
        if ((video instanceof VideoData.Remote) || (video instanceof VideoData.LocalUri)) {
            return;
        }
        Intrinsics.areEqual(video, VideoData.Autoload.INSTANCE);
    }

    @Override // com.appodeal.ads.nativead.h
    public final void b() {
        NativeAdView nativeAdView = (NativeAdView) this.f15302i.get();
        if (nativeAdView != null) {
            nativeAdView.setOnClickListener(null);
            Iterator<View> it = nativeAdView.getClickableViews().iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(null);
            }
            com.appodeal.ads.utils.q.b(this);
            com.appodeal.ads.utils.q.a(nativeAdView);
            this.f15296c.onUnregisterForInteraction(nativeAdView);
        }
        this.f15302i = new WeakReference(null);
    }

    @Override // com.appodeal.ads.nativead.h
    public final com.appodeal.ads.segments.o c() {
        return this.f15301h;
    }

    public final void d(NativeAdView nativeAdView) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.appodeal.ads.xd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yd.e(this.f15259b, view);
            }
        };
        if (nativeAdView != null) {
            nativeAdView.setOnClickListener(null);
            Iterator<View> it = nativeAdView.getClickableViews().iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(null);
            }
        }
        if (nativeAdView != null) {
            nativeAdView.setOnClickListener(onClickListener);
            Iterator<View> it2 = nativeAdView.getClickableViews().iterator();
            while (it2.hasNext()) {
                it2.next().setOnClickListener(onClickListener);
            }
        }
        c(nativeAdView, onClickListener);
        this.f15302i = new WeakReference(nativeAdView);
        if (!this.f15300g) {
            com.appodeal.ads.utils.q.c(this, nativeAdView, t1.a().w(), new ld(this, nativeAdView));
        }
        this.f15296c.onRegisterForInteraction(nativeAdView);
    }

    public static void c(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof Button) {
                ((Button) childAt).setOnClickListener(onClickListener);
            }
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, onClickListener);
            }
        }
    }

    @Override // com.appodeal.ads.nativead.h
    public final void a(NativeAdView nativeAdView, String placementName) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f15301h = com.appodeal.ads.segments.q.a(placementName);
        t1.a().f13573m = this.f15301h;
        nativeAdView.deconfigureContainer();
        View titleView = nativeAdView.getTitleView();
        TextView textView = titleView instanceof TextView ? (TextView) titleView : null;
        if (textView != null) {
            textView.setText(this.f15295b.f13875g);
        }
        View descriptionView = nativeAdView.getDescriptionView();
        TextView textView2 = descriptionView instanceof TextView ? (TextView) descriptionView : null;
        if (textView2 != null) {
            textView2.setText(this.f15295b.f13876h);
        }
        View callToActionView = nativeAdView.getCallToActionView();
        TextView textView3 = callToActionView instanceof TextView ? (TextView) callToActionView : null;
        if (textView3 != null) {
            textView3.setText(this.f15295b.f13877i);
        }
        View ratingView = nativeAdView.getRatingView();
        RatingBar ratingBar = ratingView instanceof RatingBar ? (RatingBar) ratingView : null;
        if (ratingBar != null) {
            if (this.f15295b.getRating() == 0.0f) {
                ratingBar.setVisibility(8);
            } else {
                ratingBar.setVisibility(0);
                ratingBar.setStepSize(0.1f);
                ratingBar.setRating(this.f15295b.getRating());
            }
        }
        TextView adAttributionView = nativeAdView.getAdAttributionView();
        if (adAttributionView != null) {
            CharSequence text = adAttributionView.getText();
            if (text == null || text.length() == 0) {
                adAttributionView.setText(com.taurusx.tax.f.t.f66040o);
            }
            adAttributionView.setMaxLines(1);
            adAttributionView.setSingleLine(true);
            adAttributionView.setGravity(4);
            if (Build.VERSION.SDK_INT >= 26) {
                adAttributionView.setAutoSizeTextTypeWithDefaults(1);
            } else {
                adAttributionView.setTextAppearance(adAttributionView.getContext(), R.style.TextAppearance.Material.Small);
            }
        }
        ViewGroup adChoiceView = nativeAdView.getAdChoiceView();
        if (adChoiceView != null) {
            Context context = adChoiceView.getContext();
            AdNetworkConnector adNetworkConnector = this.f15296c;
            Intrinsics.checkNotNull(context);
            View viewObtainAdChoice = adNetworkConnector.obtainAdChoice(context);
            if (viewObtainAdChoice != null) {
                adChoiceView.removeAllViews();
                adChoiceView.addView(viewObtainAdChoice);
            } else {
                adChoiceView.setVisibility(8);
            }
        }
        NativeIconView iconView = nativeAdView.getIconView();
        if (iconView != null) {
            Context context2 = iconView.getContext();
            AdNetworkConnector adNetworkConnector2 = this.f15296c;
            Intrinsics.checkNotNull(context2);
            View viewObtainIconView = adNetworkConnector2.obtainIconView(context2);
            ViewParent parent = viewObtainIconView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewObtainIconView);
            }
            ImageData icon = this.f15295b.f13870b.getMediaAssets().getIcon();
            if (!(icon instanceof ImageData.Autoload)) {
                if (viewObtainIconView instanceof ImageView) {
                    MediaAssetsHelperKt.setImageData((ImageView) viewObtainIconView, icon);
                } else if (viewObtainIconView instanceof ViewGroup) {
                    ImageView imageView = new ImageView(context2);
                    MediaAssetsHelperKt.setImageData(imageView, icon);
                    ((ViewGroup) viewObtainIconView).addView(imageView);
                }
            }
            iconView.setIconView$core_release(viewObtainIconView);
        }
        NativeMediaView mediaView = nativeAdView.getMediaView();
        if (mediaView != null) {
            Context context3 = mediaView.getContext();
            AdNetworkConnector adNetworkConnector3 = this.f15296c;
            Intrinsics.checkNotNull(context3);
            mediaView.setMediaView$core_release(adNetworkConnector3.obtainMediaView(context3));
        }
        d(nativeAdView);
    }

    public static Map b(Rect rect, View view, LinkedHashMap linkedHashMap) {
        if (linkedHashMap.containsKey(view)) {
            if (view != null) {
                if (view.isShown() && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && view.getAlpha() != 0.0f && rect.contains(z6.a(view))) {
                    linkedHashMap.remove(view);
                    return linkedHashMap;
                }
            } else {
                throw new IllegalStateException("Already checked here: requiredViews.containsKey(view)");
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                b(rect, viewGroup.getChildAt(i10), linkedHashMap);
            }
        }
        return linkedHashMap;
    }
}
