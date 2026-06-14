package com.appodeal.ads.adapters.bidmachine.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import dc.p;
import dc.s;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f12103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f12104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f12105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f12106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac.b f12107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ac.b bVar, String str, String str2, String str3, float f10) {
        super(str, str2, str3, null, Float.valueOf(f10), 8, null);
        this.f12107e = bVar;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12107e.hasVideo();
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        this.f12105c = view;
        return view;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        this.f12103a = imageView;
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        s sVar = new s(context);
        this.f12104b = sVar;
        return sVar;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        this.f12103a = null;
        this.f12104b = null;
        this.f12105c = null;
        p pVar = this.f12106d;
        if (pVar != null) {
            pVar.c();
        }
        this.f12106d = null;
        this.f12107e.destroy();
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onRegisterForInteraction(nativeAdView);
        p pVar = new p(nativeAdView.getContext());
        this.f12106d = pVar;
        pVar.setTitleView(nativeAdView.getTitleView());
        pVar.setDescriptionView(nativeAdView.getDescriptionView());
        pVar.setCallToActionView(nativeAdView.getCallToActionView());
        pVar.setRatingView(nativeAdView.getRatingView());
        pVar.setIconView(this.f12103a);
        pVar.setMediaView(this.f12104b);
        pVar.setProviderView(this.f12105c);
        this.f12103a = null;
        this.f12104b = null;
        this.f12105c = null;
        pVar.b(this.f12107e);
        pVar.d(this.f12107e, CollectionsKt.toSet(nativeAdView.getClickableViews()));
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        super.onUnregisterForInteraction(nativeAdView);
        p pVar = this.f12106d;
        if (pVar != null) {
            pVar.e();
        }
        this.f12103a = null;
        this.f12104b = null;
        this.f12105c = null;
    }
}
