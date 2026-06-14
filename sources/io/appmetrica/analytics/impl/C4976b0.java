package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4976b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5533x0 f76871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4997bl f76872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z3 f76873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f76874d = TimeUnit.SECONDS.toMillis(10);

    public C4976b0(C5533x0 c5533x0, C4997bl c4997bl, Z3 z32) {
        this.f76871a = c5533x0;
        this.f76872b = c4997bl;
        this.f76873c = z32;
    }

    public final synchronized void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f76871a.getClass();
        if (C5533x0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f76872b.a();
        this.f76871a.getClass();
        C5508w0 c5508w0A = C5508w0.a(context);
        c5508w0A.f78479d.a(null, c5508w0A);
        IHandlerExecutor iHandlerExecutorA = this.f76873c.a();
        ((G9) iHandlerExecutorA).f75815b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.bq
            @Override // java.lang.Runnable
            public final void run() {
                C4976b0.a(this.f76931b, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f76871a.getClass();
        C5533x0.b();
    }

    public static final void a(C4976b0 c4976b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c4976b0.f76871a.getClass();
        C5508w0 c5508w0A = C5508w0.a(context);
        c5508w0A.f().a(appMetricaLibraryAdapterConfig);
        C5186j4.l().f77467c.a().execute(new RunnableC5484v1(c5508w0A.f78476a));
    }
}
