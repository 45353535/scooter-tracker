package com.appodeal.ads.adapters.iab.appodeal.native_ad;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.appodeal.ads.MediaAssets;
import com.appodeal.ads.NativeMediaViewContentType;
import com.appodeal.ads.VideoData;
import com.appodeal.ads.adapters.iab.R$drawable;
import com.appodeal.ads.adapters.iab.unified.g;
import com.appodeal.ads.adapters.iab.unified.m;
import com.appodeal.ads.adapters.iab.unified.q;
import com.appodeal.ads.adapters.iab.unified.y;
import com.appodeal.ads.adapters.iab.utils.e;
import com.appodeal.ads.nativead.NativeAdView;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.appodeal.ads.utils.Log;
import java.io.File;
import java.util.Timer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends UnifiedNativeAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f12208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaAssets f12209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeParams f12210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f12211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f12213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediaAssets mediaAssets, UnifiedNativeParams unifiedNativeParams, Context context, String str, y yVar, String str2, String str3, String str4, float f10) {
        super(str2, str3, str4, mediaAssets, Float.valueOf(f10));
        this.f12209b = mediaAssets;
        this.f12210c = unifiedNativeParams;
        this.f12211d = context;
        this.f12212e = str;
        this.f12213f = yVar;
        Intrinsics.checkNotNull(str2);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final boolean containsVideo() {
        return this.f12209b.getVideo() != null;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainAdChoice(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R$drawable.f12203a);
        return imageView;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainIconView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ImageView(context);
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final View obtainMediaView(Context context) {
        String path;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = new q(context);
        MediaAssets mediaAssets = this.f12209b;
        NativeMediaViewContentType nativeMediaContentType = this.f12210c.getNativeMediaContentType();
        Intrinsics.checkNotNullExpressionValue(nativeMediaContentType, "getNativeMediaContentType(...)");
        Intrinsics.checkNotNullParameter(mediaAssets, "mediaAssets");
        Intrinsics.checkNotNullParameter(nativeMediaContentType, "nativeMediaContentType");
        VideoData video = mediaAssets.getVideo();
        VideoData.LocalUri localUri = video instanceof VideoData.LocalUri ? (VideoData.LocalUri) video : null;
        Uri localUri2 = localUri != null ? localUri.getLocalUri() : null;
        boolean z10 = (localUri2 == null || (path = localUri2.getPath()) == null || !new File(path).exists()) ? false : true;
        if (NativeMediaViewContentType.NoVideo != nativeMediaContentType && z10) {
            qVar.f12276d = true;
            qVar.f12277e = true;
        }
        qVar.f12274b = localUri;
        qVar.f12275c = mediaAssets.getMainImage();
        qVar.f();
        this.f12208a = qVar;
        return qVar;
    }

    @Override // com.appodeal.ads.unified.AdNetworkConnector
    public final void onDestroy() {
        q qVar = this.f12208a;
        if (qVar != null) {
            Timer timer = qVar.f12286n;
            if (timer != null) {
                timer.cancel();
            }
            qVar.f12286n = null;
            qVar.a();
            qVar.f12281i = null;
            qVar.f12282j = null;
            qVar.f12283k = null;
            qVar.f12285m = null;
            qVar.f12274b = null;
            qVar.f12275c = null;
            q.f12273u = null;
        }
        this.f12208a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onRegisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        q qVar = this.f12208a;
        if (qVar != null) {
            Log.log("MediaView", "State", "onViewAppearOnScreen");
            qVar.f12292t = true;
            if (qVar.f12276d) {
                if (qVar.f12277e) {
                    qVar.k();
                } else {
                    qVar.c(g.f12261d);
                }
            }
        }
        q qVar2 = this.f12208a;
        if (qVar2 == null || qVar2.f12284l == null || !qVar2.f12276d) {
            return;
        }
        Timer timer = new Timer();
        qVar2.f12286n = timer;
        timer.schedule(new m(qVar2), 0L, 500L);
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void onUnregisterForInteraction(NativeAdView nativeAdView) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        q qVar = this.f12208a;
        if (qVar != null) {
            qVar.l();
        }
        q qVar2 = this.f12208a;
        if (qVar2 != null) {
            Timer timer = qVar2.f12286n;
            if (timer != null) {
                timer.cancel();
            }
            qVar2.f12286n = null;
            qVar2.a();
            qVar2.f12281i = null;
            qVar2.f12282j = null;
            qVar2.f12283k = null;
            qVar2.f12285m = null;
            qVar2.f12274b = null;
            qVar2.f12275c = null;
            q.f12273u = null;
        }
        this.f12208a = null;
    }

    @Override // com.appodeal.ads.unified.UnifiedNativeAd, com.appodeal.ads.unified.AdNetworkConnector
    public final void processClick(Function1 clickTrackListener) {
        Intrinsics.checkNotNullParameter(clickTrackListener, "clickTrackListener");
        super.processClick(clickTrackListener);
        e eVar = new e();
        Context context = this.f12211d;
        String str = this.f12212e;
        y yVar = this.f12213f;
        eVar.a(context, str, yVar.f12308a, yVar.f12309b, new a(clickTrackListener));
    }
}
