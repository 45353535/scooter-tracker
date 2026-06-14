package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4950a0 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4976b0 f76771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f76772b;

    public C4950a0(C4976b0 c4976b0, Context context) {
        this.f76771a = c4976b0;
        this.f76772b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4976b0 c4976b0 = this.f76771a;
        Context context = this.f76772b;
        c4976b0.getClass();
        c4976b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
