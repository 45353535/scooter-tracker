package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.Banner;
import eg.m1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y {

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f55248b = new a();

        public a() {
            super(8, y.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // kotlin.jvm.functions.Function8
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j invoke(Context p02, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a p12, com.moloco.sdk.internal.ortb.model.e p22, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 p32, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 p42, com.moloco.sdk.internal.a p52, com.moloco.sdk.internal.services.c0 p62, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r p72) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            Intrinsics.checkNotNullParameter(p32, "p3");
            Intrinsics.checkNotNullParameter(p42, "p4");
            Intrinsics.checkNotNullParameter(p52, "p5");
            Intrinsics.checkNotNullParameter(p62, "p6");
            Intrinsics.checkNotNullParameter(p72, "p7");
            return y.f(p02, p12, p22, p32, p42, p52, p62, p72);
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f55249b = new b();

        public b() {
            super(1, y.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return y.e(p02);
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f55250a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
            this.f55250a = e0Var;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a() {
            this.f55250a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            this.f55250a.a(internalShowError);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0
        public void a(boolean z10) {
            this.f55250a.a(z10);
        }
    }

    public static final Banner b(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, n adCreateLoadTimeoutManager, com.moloco.sdk.internal.a viewLifecycleOwnerSingleton, com.moloco.sdk.internal.n bannerSize, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new d0(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, z10, externalLinkHandler, a.f55248b, b.f55249b, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, clickthroughService, metricsRecorder);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q d(com.moloco.sdk.internal.ortb.model.x xVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVarD;
        return (xVar == null || (qVarD = com.moloco.sdk.internal.i.d(xVar)) == null) ? com.moloco.sdk.internal.i.c() : qVarD;
    }

    public static final c e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        return new c(e0Var);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.internal.ortb.model.e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.internal.a aVar2, com.moloco.sdk.internal.services.c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r rVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0(context, aVar, null, eVar, d(eVar.getExt().getPlayer()), t0Var, g0Var, aVar2, kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain().plus(m1.b(null, 1, null))), c0Var, rVar);
    }
}
