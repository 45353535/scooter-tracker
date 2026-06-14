package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t {
    public static final r0 a(AdLoad.Listener listener, com.moloco.sdk.acm.f acmLoadTimerEvent, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new s(listener, com.moloco.sdk.internal.l0.b(), acmLoadTimerEvent, adFormatType, metricsRecorder);
    }
}
