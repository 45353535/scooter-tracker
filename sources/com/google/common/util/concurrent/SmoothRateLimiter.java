package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class SmoothRateLimiter extends RateLimiter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f31585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    double f31586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double f31587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31588f;

    static final class SmoothBursty extends SmoothRateLimiter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final double f31589g;

        SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d10) {
            super(sleepingStopwatch);
            this.f31589g = d10;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double l() {
            return this.f31587e;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void m(double d10, double d11) {
            double d12 = this.f31586d;
            double d13 = this.f31589g * d10;
            this.f31586d = d13;
            if (d12 == Double.POSITIVE_INFINITY) {
                this.f31585c = d13;
            } else {
                this.f31585c = d12 != 0.0d ? (this.f31585c * d13) / d12 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long o(double d10, double d11) {
            return 0L;
        }
    }

    static final class SmoothWarmingUp extends SmoothRateLimiter {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f31590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private double f31591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private double f31592i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private double f31593j;

        SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j10, TimeUnit timeUnit, double d10) {
            super(sleepingStopwatch);
            this.f31590g = timeUnit.toMicros(j10);
            this.f31593j = d10;
        }

        private double p(double d10) {
            return this.f31587e + (d10 * this.f31591h);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double l() {
            return this.f31590g / this.f31586d;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void m(double d10, double d11) {
            double d12 = this.f31586d;
            double d13 = this.f31593j * d11;
            long j10 = this.f31590g;
            double d14 = (j10 * 0.5d) / d11;
            this.f31592i = d14;
            double d15 = ((j10 * 2.0d) / (d11 + d13)) + d14;
            this.f31586d = d15;
            this.f31591h = (d13 - d11) / (d15 - d14);
            if (d12 == Double.POSITIVE_INFINITY) {
                this.f31585c = 0.0d;
                return;
            }
            if (d12 != 0.0d) {
                d15 = (this.f31585c * d15) / d12;
            }
            this.f31585c = d15;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long o(double d10, double d11) {
            long jP;
            double d12 = d10 - this.f31592i;
            if (d12 > 0.0d) {
                double dMin = Math.min(d12, d11);
                jP = (long) (((p(d12) + p(d12 - dMin)) * dMin) / 2.0d);
                d11 -= dMin;
            } else {
                jP = 0;
            }
            return jP + ((long) (this.f31587e * d11));
        }
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final double e() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f31587e;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final void f(double d10, long j10) {
        n(j10);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d10;
        this.f31587e = micros;
        m(d10, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long h(long j10) {
        return this.f31588f;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long k(int i10, long j10) {
        n(j10);
        long j11 = this.f31588f;
        double d10 = i10;
        double dMin = Math.min(d10, this.f31585c);
        this.f31588f = LongMath.saturatedAdd(this.f31588f, o(this.f31585c, dMin) + ((long) ((d10 - dMin) * this.f31587e)));
        this.f31585c -= dMin;
        return j11;
    }

    abstract double l();

    abstract void m(double d10, double d11);

    void n(long j10) {
        if (j10 > this.f31588f) {
            this.f31585c = Math.min(this.f31586d, this.f31585c + ((j10 - r0) / l()));
            this.f31588f = j10;
        }
    }

    abstract long o(double d10, double d11);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.f31588f = 0L;
    }
}
