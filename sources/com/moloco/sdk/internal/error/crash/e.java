package com.moloco.sdk.internal.error.crash;

import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.api.a f54226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f54228d;

    public e(List exceptionFilters, com.moloco.sdk.internal.error.api.a errorReporter, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(exceptionFilters, "exceptionFilters");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f54225a = exceptionFilters;
        this.f54226b = errorReporter;
        this.f54227c = metricsRecorder;
        this.f54228d = "CrashHandlerService";
    }

    @Override // com.moloco.sdk.internal.error.crash.d
    public void a(Throwable crash) {
        Intrinsics.checkNotNullParameter(crash, "crash");
        if (!b(crash)) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f54228d, "App Crashed", null, false, 12, null);
        } else {
            this.f54227c.b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.H.g()));
            this.f54226b.a(crash);
        }
    }

    public final boolean b(Throwable th2) {
        Iterator it = this.f54225a.iterator();
        while (it.hasNext()) {
            if (((com.moloco.sdk.internal.error.crash.filters.a) it.next()).a(th2)) {
                return true;
            }
        }
        return false;
    }
}
