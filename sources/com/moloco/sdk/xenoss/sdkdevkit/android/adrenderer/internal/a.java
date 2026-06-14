package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, y0 mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q mraidFullscreenController, MraidActivity.Companion mraidAdActivity, String str, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        Intrinsics.checkNotNullParameter(mraidAdActivity, "mraidAdActivity");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new e1(context, watermark, mraidAdLoader, mraidBaseAd, mraidFullscreenController, mraidAdActivity, str, metricsRecorder);
    }
}
