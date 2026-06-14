package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q0 {
    public static final o0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new p0(mediaCacheRepository, errorReportingService);
    }

    public static final void c(String str) {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "DECLoaderImpl", str, false, 4, null);
    }
}
