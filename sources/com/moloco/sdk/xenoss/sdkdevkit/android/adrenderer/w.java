package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w {
    public static final u a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r rVar, com.moloco.sdk.internal.ortb.model.e bid, t0 externalLinkHandler, g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0(context, customUserEventBuilderService, rVar, bid, externalLinkHandler, watermark, metricsRecorder);
    }

    public static /* synthetic */ u b(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, r rVar, com.moloco.sdk.internal.ortb.model.e eVar, t0 t0Var, g0 g0Var, com.moloco.sdk.acm.recorder.a aVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            rVar = null;
        }
        return a(context, aVar, rVar, eVar, t0Var, g0Var, aVar2);
    }

    public static final u c(Context context, String adm, com.moloco.sdk.internal.services.c0 clickthroughService, g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l(context, adm, clickthroughService, watermark, b.h.f55827a.f(), b.i.f55834a.c(), metricsRecorder);
    }
}
