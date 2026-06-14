package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5558y0 implements Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f78568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f78569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f78570c;

    public C5558y0(A0 a02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f78568a = a02;
        this.f78569b = appMetricaConfig;
        this.f78570c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Dc
    @NotNull
    public final C5321oc a() {
        A0 a02 = this.f78568a;
        C5327oi c5327oi = a02.f75480g;
        AppMetricaConfig appMetricaConfig = this.f78569b;
        PublicLogger publicLogger = this.f78570c;
        L7 l72 = a02.f75482i;
        return c5327oi.a(appMetricaConfig, publicLogger, new C5234l0(l72.f76064j, l72.f76062h));
    }
}
