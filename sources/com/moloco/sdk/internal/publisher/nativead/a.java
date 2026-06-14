package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.ui.g;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements NativeAd.Assets {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0669a f54844k = new C0669a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54845l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f54847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f54848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f54849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f54850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f54851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.nativead.model.d f54852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f54853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f54854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f54855j;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C0669a {
        public /* synthetic */ C0669a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0669a() {
        }
    }

    public a(Context context, t viewVisibilityTracker, com.moloco.sdk.internal.a viewLifecycleOwner, g0 watermark, Function1 vastAdPlaylistController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        this.f54846a = context;
        this.f54847b = viewVisibilityTracker;
        this.f54848c = viewLifecycleOwner;
        this.f54849d = watermark;
        this.f54850e = vastAdPlaylistController;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        this.f54853h = dVar != null ? dVar.c(1) : null;
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.f(this.f54846a, uri, this.f54849d, this.f54851f, null, null, 48, null);
    }

    public final g b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.f54850e.invoke(aVar);
        aVar2.d();
        return new g(this.f54846a, aVar2, this.f54847b, this.f54848c, this.f54849d, this.f54851f);
    }

    public final void c() {
        g gVar = this.f54855j;
        if (gVar != null) {
            gVar.b();
        }
        this.f54855j = null;
    }

    public final void d(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }

    public final void e(com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.f54852g = dVar;
    }

    public final void f(Function0 function0) {
        this.f54851f = function0;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.d g() {
        return this.f54852g;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null) {
            return dVar.c(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getMainImageUri() {
        return this.f54853h;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public View getMediaView() {
        Uri uriC;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVarE;
        g gVar = this.f54855j;
        if (gVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached video view", null, false, 12, null);
            d(gVar);
            return gVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null && (aVarE = dVar.e(2)) != null) {
            g gVarB = b(aVarE);
            this.f54855j = gVarB;
            return gVarB;
        }
        ViewGroup viewGroup = this.f54854i;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached image view", null, false, 12, null);
            d(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.f54852g;
        if (dVar2 == null || (uriC = dVar2.c(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup viewGroupA = a(uriC);
        this.f54854i = viewGroupA;
        return viewGroupA;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Float getRating() {
        String strA;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar == null || (strA = dVar.a(6)) == null) {
            return null;
        }
        return StringsKt.u(strA);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.f54852g;
        if (dVar != null) {
            return dVar.d(3);
        }
        return null;
    }
}
