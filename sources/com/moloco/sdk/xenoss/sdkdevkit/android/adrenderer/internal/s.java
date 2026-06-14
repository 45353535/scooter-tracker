package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.service_locator.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u a(Context context, com.moloco.sdk.internal.ortb.model.e bid, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g loadVast, o0 decLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        return new r(context, bid, loadVast, decLoader, z10, watermark, metricsRecorder);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u b(Context context, com.moloco.sdk.internal.ortb.model.e eVar, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var, com.moloco.sdk.acm.recorder.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g gVar, o0 o0Var, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g gVar2 = gVar;
        if ((i10 & 64) != 0) {
            o0Var = b.a.f55792a.a();
        }
        return a(context, eVar, z10, g0Var, aVar, gVar2, o0Var);
    }
}
