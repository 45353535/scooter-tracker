package com.appodeal.ads.nativead;

import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.MediaAssetsHelperKt;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.d3;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.segments.o;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.yd;
import eg.e0;
import eg.o0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements NativeAd, h, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedNativeAd f13870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3 f13871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function0 f13872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f13873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f13874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f13878j;

    public e(UnifiedNativeAd unifiedNativeAd, d3 owner, Function0 onViewShown, Function0 onViewClicked, Function0 onViewTrackingFinished) {
        Intrinsics.checkNotNullParameter(unifiedNativeAd, "unifiedNativeAd");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onViewShown, "onViewShown");
        Intrinsics.checkNotNullParameter(onViewClicked, "onViewClicked");
        Intrinsics.checkNotNullParameter(onViewTrackingFinished, "onViewTrackingFinished");
        this.f13870b = unifiedNativeAd;
        this.f13871c = owner;
        this.f13872d = onViewShown;
        this.f13873e = onViewClicked;
        this.f13874f = onViewTrackingFinished;
        this.f13875g = a.a(25, unifiedNativeAd.getTitle());
        String description = unifiedNativeAd.getDescription();
        this.f13876h = description != null ? a.a(100, description) : null;
        this.f13877i = a.a(25, unifiedNativeAd.getCallToAction());
        this.f13878j = lf.i.a(new Function0() { // from class: com.appodeal.ads.nativead.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.c(this.f13837b);
            }
        });
    }

    public static final Unit d(e eVar, Function0 function0, MediaAssets loadedMediaAssets) {
        Intrinsics.checkNotNullParameter(loadedMediaAssets, "loadedMediaAssets");
        MediaAssets mediaAssets = eVar.f13870b.getMediaAssets();
        mediaAssets.setIcon(loadedMediaAssets.getIcon());
        mediaAssets.setMainImage(loadedMediaAssets.getMainImage());
        mediaAssets.setVideo(loadedMediaAssets.getVideo());
        function0.invoke();
        return Unit.f93236a;
    }

    public static final Unit e(Function0 function0) {
        function0.invoke();
        return Unit.f93236a;
    }

    @Override // com.appodeal.ads.nativead.h
    public final void a() {
        ((h) this.f13878j.getValue()).a();
    }

    @Override // com.appodeal.ads.nativead.h
    public final void b() {
        ((h) this.f13878j.getValue()).b();
    }

    @Override // com.appodeal.ads.nativead.h
    public final o c() {
        return ((h) this.f13878j.getValue()).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    @Override // com.appodeal.ads.NativeAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean canShow(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "placementName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.appodeal.ads.segments.o r8 = com.appodeal.ads.segments.q.a(r8)
            java.lang.String r0 = r6.f13875g
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L85
            java.lang.String r0 = r6.f13877i
            int r0 = r0.length()
            if (r0 <= 0) goto L85
            com.appodeal.ads.unified.UnifiedNativeAd r0 = r6.f13870b
            com.appodeal.ads.MediaAssets r0 = r0.getMediaAssets()
            com.appodeal.ads.ImageData r0 = r0.getIcon()
            boolean r0 = com.appodeal.ads.MediaAssetsHelperKt.isLoaded(r0)
            java.lang.String r2 = "Assets Error"
            java.lang.String r3 = "Native"
            if (r0 != 0) goto L38
            java.lang.String r4 = "Icon asset is invalid"
            com.appodeal.ads.utils.Log.log(r3, r2, r4)
        L38:
            if (r0 == 0) goto L85
            com.appodeal.ads.unified.UnifiedNativeAd r0 = r6.f13870b
            com.appodeal.ads.MediaAssets r0 = r0.getMediaAssets()
            com.appodeal.ads.ImageData r0 = r0.getMainImage()
            boolean r0 = com.appodeal.ads.MediaAssetsHelperKt.isLoaded(r0)
            if (r0 != 0) goto L4f
            java.lang.String r4 = "Image asset is invalid"
            com.appodeal.ads.utils.Log.log(r3, r2, r4)
        L4f:
            r4 = 1
            if (r0 != 0) goto L76
            com.appodeal.ads.unified.UnifiedNativeAd r0 = r6.f13870b
            com.appodeal.ads.MediaAssets r0 = r0.getMediaAssets()
            com.appodeal.ads.VideoData r0 = r0.getVideo()
            boolean r0 = com.appodeal.ads.MediaAssetsHelperKt.isLoaded(r0)
            if (r0 == 0) goto L6c
            com.appodeal.ads.unified.UnifiedNativeAd r0 = r6.f13870b
            boolean r0 = r0.containsVideo()
            if (r0 == 0) goto L6c
            r0 = r4
            goto L6d
        L6c:
            r0 = r1
        L6d:
            if (r0 != 0) goto L74
            java.lang.String r5 = "Video asset is invalid"
            com.appodeal.ads.utils.Log.log(r3, r2, r5)
        L74:
            if (r0 == 0) goto L85
        L76:
            com.appodeal.ads.modules.common.internal.adtype.AdType r0 = com.appodeal.ads.modules.common.internal.adtype.AdType.Native
            com.appodeal.ads.d3 r2 = r6.f13871c
            com.appodeal.ads.x2 r2 = r2.f14937c
            double r2 = r2.f15229f
            boolean r7 = r8.c(r7, r0, r2)
            if (r7 == 0) goto L85
            return r4
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.nativead.e.canShow(android.content.Context, java.lang.String):boolean");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e other = (e) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompare = Double.compare(other.f13871c.f14937c.f15229f, this.f13871c.f14937c.f15229f);
        return iCompare == 0 ? Intrinsics.compare(other.f13870b.getAdId(), this.f13870b.getAdId()) : iCompare;
    }

    @Override // com.appodeal.ads.NativeAd
    public final boolean containsVideo() {
        return this.f13870b.containsVideo();
    }

    @Override // com.appodeal.ads.NativeAd
    public final void destroy() {
        com.appodeal.ads.utils.h.a(this.f13871c);
        b();
        this.f13870b.onDestroy();
        a();
    }

    public final void f(com.appodeal.ads.nativead.downloader.g mediaAssetDownloader, final Function0 onAssetsReady, final Function0 onAssetsFailed) {
        Intrinsics.checkNotNullParameter(mediaAssetDownloader, "mediaAssetDownloader");
        Intrinsics.checkNotNullParameter(onAssetsReady, "onAssetsReady");
        Intrinsics.checkNotNullParameter(onAssetsFailed, "onAssetsFailed");
        MediaAssets mediaAssets = this.f13870b.getMediaAssets();
        int loadingTimeout = this.f13871c.getLoadingTimeout();
        Function1 onAssetsLoaded = new Function1() { // from class: com.appodeal.ads.nativead.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.d(this.f13838b, onAssetsReady, (MediaAssets) obj);
            }
        };
        Function0 onAssetsFailed2 = new Function0() { // from class: com.appodeal.ads.nativead.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.e(onAssetsFailed);
            }
        };
        mediaAssetDownloader.getClass();
        Intrinsics.checkNotNullParameter(mediaAssets, "mediaAssets");
        Intrinsics.checkNotNullParameter(onAssetsLoaded, "onAssetsLoaded");
        Intrinsics.checkNotNullParameter(onAssetsFailed2, "onAssetsFailed");
        if (!MediaAssetsHelperKt.isLoaded(mediaAssets.getIcon()) || !MediaAssetsHelperKt.isLoaded(mediaAssets.getMainImage()) || !MediaAssetsHelperKt.isLoaded(mediaAssets.getVideo())) {
            eg.i.d(kotlinx.coroutines.i.a(o0.b().plus(new e0("ApdDownloadMediaAssets"))), null, null, new com.appodeal.ads.nativead.downloader.b(loadingTimeout, mediaAssetDownloader, mediaAssets, onAssetsLoaded, onAssetsFailed2, null), 3, null);
        } else {
            onAssetsLoaded.invoke(mediaAssets);
            LogExtKt.logInternal$default(null, "Native assets were loaded by network", null, 5, null);
        }
    }

    @Override // com.appodeal.ads.NativeAd
    public final String getAdProvider() {
        return this.f13871c.f14938d;
    }

    @Override // com.appodeal.ads.NativeAd
    public final String getCallToAction() {
        return this.f13877i;
    }

    @Override // com.appodeal.ads.NativeAd
    public final String getDescription() {
        return this.f13876h;
    }

    @Override // com.appodeal.ads.NativeAd
    public final MediaAssets getMediaAssets() {
        return this.f13870b.getMediaAssets();
    }

    @Override // com.appodeal.ads.NativeAd
    public final double getPredictedEcpm() {
        return this.f13871c.f14937c.f15229f;
    }

    @Override // com.appodeal.ads.NativeAd
    public final float getRating() {
        Float rating = this.f13870b.getRating();
        if (rating != null) {
            return rating.floatValue();
        }
        return 5.0f;
    }

    @Override // com.appodeal.ads.NativeAd
    public final String getTitle() {
        return this.f13875g;
    }

    @Override // com.appodeal.ads.NativeAd
    public final boolean isPrecache() {
        return this.f13871c.f14937c.f15228e;
    }

    public static final yd c(e eVar) {
        return new yd(eVar, eVar.f13870b, eVar.f13872d, eVar.f13873e, eVar.f13874f);
    }

    @Override // com.appodeal.ads.nativead.h
    public final void a(NativeAdView nativeAdView, String placementName) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        ((h) this.f13878j.getValue()).a(nativeAdView, placementName);
    }
}
