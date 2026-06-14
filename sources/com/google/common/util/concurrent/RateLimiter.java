package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class RateLimiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SleepingStopwatch f31541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f31542b;

    static abstract class SleepingStopwatch {
        protected SleepingStopwatch() {
        }

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final Stopwatch f31543a = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected long a() {
                    return this.f31543a.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected void b(long j10) {
                    if (j10 > 0) {
                        Uninterruptibles.sleepUninterruptibly(j10, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        protected abstract long a();

        protected abstract void b(long j10);
    }

    RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.f31541a = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean a(long j10, long j11) {
        return h(j10) - j11 <= j10;
    }

    private static void b(int i10) {
        Preconditions.checkArgument(i10 > 0, "Requested permits (%s) must be positive", i10);
    }

    static RateLimiter c(double d10, long j10, TimeUnit timeUnit, double d11, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j10, timeUnit, d11);
        smoothWarmingUp.setRate(d10);
        return smoothWarmingUp;
    }

    public static RateLimiter create(double d10) {
        return d(d10, SleepingStopwatch.createFromSystemTimer());
    }

    static RateLimiter d(double d10, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d10);
        return smoothBursty;
    }

    private Object g() {
        Object obj;
        Object obj2 = this.f31542b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f31542b;
                if (obj == null) {
                    obj = new Object();
                    this.f31542b = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    abstract double e();

    abstract void f(double d10, long j10);

    public final double getRate() {
        double dE;
        synchronized (g()) {
            dE = e();
        }
        return dE;
    }

    abstract long h(long j10);

    final long i(int i10) {
        long j10;
        b(i10);
        synchronized (g()) {
            j10 = j(i10, this.f31541a.a());
        }
        return j10;
    }

    final long j(int i10, long j10) {
        return Math.max(k(i10, j10) - j10, 0L);
    }

    abstract long k(int i10, long j10);

    public final void setRate(double d10) {
        Preconditions.checkArgument(d10 > 0.0d, "rate must be positive");
        synchronized (g()) {
            f(d10, this.f31541a.a());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j10, TimeUnit timeUnit) {
        return tryAcquire(1, j10, timeUnit);
    }

    public static RateLimiter create(double d10, long j10, TimeUnit timeUnit) {
        Preconditions.checkArgument(j10 >= 0, "warmupPeriod must not be negative: %s", j10);
        return c(d10, j10, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    @CanIgnoreReturnValue
    public double acquire(int i10) {
        long jI = i(i10);
        this.f31541a.b(jI);
        return (jI * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i10) {
        return tryAcquire(i10, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int i10, long j10, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j10), 0L);
        b(i10);
        synchronized (g()) {
            try {
                long jA = this.f31541a.a();
                if (!a(jA, jMax)) {
                    return false;
                }
                this.f31541a.b(j(i10, jA));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
