package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class F9 implements ExecutorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5329ok f75767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f75768b;

    public F9() {
        C5329ok c5329okX = C5468ua.k().x();
        this.f75767a = c5329okX;
        this.f75768b = c5329okX.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f75767a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + TokenBuilder.TOKEN_DELIMITER + Gd.f75819a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f75768b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.f75767a.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C5329ok c5329ok = this.f75767a;
        if (c5329ok.f77926f == null) {
            synchronized (c5329ok) {
                try {
                    if (c5329ok.f77926f == null) {
                        c5329ok.f77921a.getClass();
                        HandlerThreadC5193jb handlerThreadC5193jbA = G9.a("IAA-SIO");
                        c5329ok.f77926f = new G9(handlerThreadC5193jbA, handlerThreadC5193jbA.getLooper(), new Handler(handlerThreadC5193jbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c5329ok.f77926f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        C5329ok c5329ok = this.f75767a;
        if (c5329ok.f77928h == null) {
            synchronized (c5329ok) {
                try {
                    if (c5329ok.f77928h == null) {
                        c5329ok.f77921a.getClass();
                        c5329ok.f77928h = new ExecutorC5279mk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c5329ok.f77928h;
    }
}
