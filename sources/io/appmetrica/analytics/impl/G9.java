package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class G9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f75814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f75815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC5193jb f75816c;

    public G9(@NonNull String str) {
        this(a(str));
    }

    public static HandlerThreadC5193jb a(String str) {
        HandlerThreadC5193jb handlerThreadC5193jb = new HandlerThreadC5193jb(str + TokenBuilder.TOKEN_DELIMITER + Gd.f75819a.incrementAndGet());
        handlerThreadC5193jb.start();
        return handlerThreadC5193jb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f75815b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10) {
        this.f75815b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Handler getHandler() {
        return this.f75815b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    @NonNull
    public final Looper getLooper() {
        return this.f75814a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z10;
        HandlerThreadC5193jb handlerThreadC5193jb = this.f75816c;
        synchronized (handlerThreadC5193jb) {
            z10 = handlerThreadC5193jb.f77511a;
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(@NonNull Runnable runnable) {
        this.f75815b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f75815b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC5193jb handlerThreadC5193jb = this.f75816c;
        synchronized (handlerThreadC5193jb) {
            handlerThreadC5193jb.f77511a = false;
            handlerThreadC5193jb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f75815b.post(futureTask);
        return futureTask;
    }

    public G9(HandlerThreadC5193jb handlerThreadC5193jb) {
        this(handlerThreadC5193jb, handlerThreadC5193jb.getLooper(), new Handler(handlerThreadC5193jb.getLooper()));
    }

    @VisibleForTesting
    public G9(@NonNull HandlerThreadC5193jb handlerThreadC5193jb, @NonNull Looper looper, @NonNull Handler handler) {
        this.f75816c = handlerThreadC5193jb;
        this.f75814a = looper;
        this.f75815b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        this.f75815b.postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
