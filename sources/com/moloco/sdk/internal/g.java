package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Init$SDKInitResponse f54239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f54240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.c0 f54241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f54242d;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t0 f54244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f54245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var, Context context) {
            super(1, Intrinsics.a.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.f54244c = t0Var;
            this.f54245d = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return g.j(g.this, this.f54244c, this.f54245d, p02);
        }
    }

    public g(Init$SDKInitResponse initResponse, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.internal.services.c0 clickthroughService) {
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.f54239a = initResponse;
        this.f54240b = customUserEventBuilderService;
        this.f54241c = clickthroughService;
        this.f54242d = lf.i.a(new Function0() { // from class: com.moloco.sdk.internal.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(g.i(this.f54230b));
            }
        });
    }

    public static final boolean i(g gVar) {
        return gVar.f54239a.getVerifyBannerVisible();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a j(g gVar, t0 t0Var, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b(aVar, t0Var, context, gVar.f54240b, true, Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(false, false, false).a(t0Var, null));
    }

    @Override // com.moloco.sdk.internal.e
    public Banner a(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, n bannerSize, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.y.b(context, appLifecycleTrackerService, this.f54240b, adUnitId, h(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f54241c, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public Banner b(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, n bannerSize, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.y.b(context, appLifecycleTrackerService, this.f54240b, adUnitId, h(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f54241c, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public NativeAd c(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.internal.services.y audioService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.internal.services.i timeProvider, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new com.moloco.sdk.internal.publisher.f0(com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.h0.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new a(externalLinkHandler, context)), appLifecycleTrackerService, this.f54240b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public Banner d(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, n bannerSize, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.y.b(context, appLifecycleTrackerService, this.f54240b, adUnitId, h(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.f54241c, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public InterstitialAd e(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.f.a(context, appLifecycleTrackerService, this.f54240b, adUnitId, externalLinkHandler, persistentHttpRequest, (64 & 64) != 0 ? new com.moloco.sdk.internal.publisher.k0(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.e
    public RewardedInterstitialAd f(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t viewVisibilityTracker, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.publisher.n adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.l.a(context, appLifecycleTrackerService, this.f54240b, adUnitId, externalLinkHandler, persistentHttpRequest, (64 & 64) != 0 ? new com.moloco.sdk.internal.publisher.k0(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
    }

    public final boolean h() {
        return ((Boolean) this.f54242d.getValue()).booleanValue();
    }
}
