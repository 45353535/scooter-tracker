package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {
    public static final AdLoad a(CoroutineScope scope, Function1 timeout, String adUnitId, Function1 recreateXenossAdLoader, AdFormatType adFormatType, com.moloco.sdk.internal.services.k webViewChecker, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new q(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.d.a(), h0.a(), adFormatType, webViewChecker, metricsRecorder);
    }
}
