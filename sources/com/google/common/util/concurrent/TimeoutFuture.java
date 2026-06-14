package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
final class TimeoutFuture<V> extends FluentFuture.TrustedFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ListenableFuture f31620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ScheduledFuture f31621j;

    private static final class Fire<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TimeoutFuture f31622b;

        Fire(TimeoutFuture timeoutFuture) {
            this.f31622b = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture;
            TimeoutFuture timeoutFuture = this.f31622b;
            if (timeoutFuture == null || (listenableFuture = timeoutFuture.f31620i) == null) {
                return;
            }
            this.f31622b = null;
            if (listenableFuture.isDone()) {
                timeoutFuture.setFuture(listenableFuture);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = timeoutFuture.f31621j;
                timeoutFuture.f31621j = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                        }
                    } catch (Throwable th2) {
                        timeoutFuture.setException(new TimeoutFutureException(str));
                        throw th2;
                    }
                }
                timeoutFuture.setException(new TimeoutFutureException(str + ": " + listenableFuture));
            } finally {
                listenableFuture.cancel(true);
            }
        }
    }

    private static final class TimeoutFutureException extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private TimeoutFutureException(String str) {
            super(str);
        }
    }

    private TimeoutFuture(ListenableFuture listenableFuture) {
        this.f31620i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    static ListenableFuture G(ListenableFuture listenableFuture, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(listenableFuture);
        Fire fire = new Fire(timeoutFuture);
        timeoutFuture.f31621j = scheduledExecutorService.schedule(fire, j10, timeUnit);
        listenableFuture.addListener(fire, MoreExecutors.directExecutor());
        return timeoutFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void n() {
        y(this.f31620i);
        ScheduledFuture scheduledFuture = this.f31621j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f31620i = null;
        this.f31621j = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String z() {
        ListenableFuture listenableFuture = this.f31620i;
        ScheduledFuture scheduledFuture = this.f31621j;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture + C4240b4.j.f42674e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
