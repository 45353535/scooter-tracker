package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes12.dex */
public final class Vh implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5533x0 f76599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f76600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f76601c;

    public Vh(C5533x0 c5533x0, Context context, ReporterConfig reporterConfig) {
        this.f76599a = c5533x0;
        this.f76600b = context;
        this.f76601c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C5533x0 c5533x0 = this.f76599a;
        Context context = this.f76600b;
        ReporterConfig reporterConfig = this.f76601c;
        c5533x0.getClass();
        return C5508w0.a(context).f().c(reporterConfig);
    }
}
