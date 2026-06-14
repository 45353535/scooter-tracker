package com.appodeal.ads;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.nativead.NativeIconView;
import com.appodeal.ads.nativead.NativeMediaView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ld implements com.appodeal.ads.utils.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd f13625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdView f13626b;

    public ld(yd ydVar, NativeAdView nativeAdView) {
        this.f13625a = ydVar;
        this.f13626b = nativeAdView;
    }

    @Override // com.appodeal.ads.utils.p
    public final void a() {
        yd ydVar = this.f13625a;
        ydVar.f15300g = true;
        ydVar.f15297d.invoke();
        yd ydVar2 = this.f13625a;
        NativeAdView nativeAdView = this.f13626b;
        ydVar2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        View titleView = nativeAdView.getTitleView();
        if (titleView == null) {
            arrayList.add("TitleView");
        } else {
            linkedHashMap.put(titleView, "TitleView");
        }
        View descriptionView = nativeAdView.getDescriptionView();
        if (descriptionView == null) {
            arrayList.add("DescriptionView");
        } else {
            linkedHashMap.put(descriptionView, "DescriptionView");
        }
        View callToActionView = nativeAdView.getCallToActionView();
        if (callToActionView == null) {
            arrayList.add("CallToActionView");
        } else {
            linkedHashMap.put(callToActionView, "CallToActionView");
        }
        NativeIconView iconView = nativeAdView.getIconView();
        if (iconView == null) {
            arrayList.add("IconView");
        } else {
            linkedHashMap.put(iconView, "IconView");
        }
        NativeMediaView mediaView = nativeAdView.getMediaView();
        if (mediaView == null) {
            arrayList.add("MediaView");
        } else {
            linkedHashMap.put(mediaView, "MediaView");
        }
        TextView adAttributionView = nativeAdView.getAdAttributionView();
        if (adAttributionView == null) {
            arrayList.add("AdAttributionView");
        } else {
            linkedHashMap.put(adAttributionView, "AdAttributionView");
        }
        if (yd.f(arrayList)) {
            Rect rectA = z6.a(nativeAdView);
            Intrinsics.checkNotNullExpressionValue(rectA, "getViewRectangle(...)");
            yd.f(((LinkedHashMap) yd.b(rectA, nativeAdView, linkedHashMap)).values());
        }
    }

    @Override // com.appodeal.ads.utils.p
    public final void b() {
        this.f13625a.f15299f.invoke();
    }
}
