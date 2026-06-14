package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class StatsAccumulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31016a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f31017b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f31018c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f31019d = Double.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f31020e = Double.NaN;

    static double a(double d10, double d11) {
        if (Doubles.isFinite(d10)) {
            return d11;
        }
        if (Doubles.isFinite(d11) || d10 == d11) {
            return d10;
        }
        return Double.NaN;
    }

    private void b(long j10, double d10, double d11, double d12, double d13) {
        long j11 = this.f31016a;
        if (j11 == 0) {
            this.f31016a = j10;
            this.f31017b = d10;
            this.f31018c = d11;
            this.f31019d = d12;
            this.f31020e = d13;
            return;
        }
        this.f31016a = j11 + j10;
        if (Doubles.isFinite(this.f31017b) && Doubles.isFinite(d10)) {
            double d14 = this.f31017b;
            double d15 = d10 - d14;
            double d16 = j10;
            double d17 = d14 + ((d15 * d16) / this.f31016a);
            this.f31017b = d17;
            this.f31018c += d11 + (d15 * (d10 - d17) * d16);
        } else {
            this.f31017b = a(this.f31017b, d10);
            this.f31018c = Double.NaN;
        }
        this.f31019d = Math.min(this.f31019d, d12);
        this.f31020e = Math.max(this.f31020e, d13);
    }

    public void add(double d10) {
        long j10 = this.f31016a;
        if (j10 == 0) {
            this.f31016a = 1L;
            this.f31017b = d10;
            this.f31019d = d10;
            this.f31020e = d10;
            if (Doubles.isFinite(d10)) {
                return;
            }
            this.f31018c = Double.NaN;
            return;
        }
        this.f31016a = j10 + 1;
        if (Doubles.isFinite(d10) && Doubles.isFinite(this.f31017b)) {
            double d11 = this.f31017b;
            double d12 = d10 - d11;
            double d13 = d11 + (d12 / this.f31016a);
            this.f31017b = d13;
            this.f31018c += d12 * (d10 - d13);
        } else {
            this.f31017b = a(this.f31017b, d10);
            this.f31018c = Double.NaN;
        }
        this.f31019d = Math.min(this.f31019d, d10);
        this.f31020e = Math.max(this.f31020e, d10);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    double c() {
        return this.f31018c;
    }

    public long count() {
        return this.f31016a;
    }

    public double max() {
        Preconditions.checkState(this.f31016a != 0);
        return this.f31020e;
    }

    public double mean() {
        Preconditions.checkState(this.f31016a != 0);
        return this.f31017b;
    }

    public double min() {
        Preconditions.checkState(this.f31016a != 0);
        return this.f31019d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.f31016a != 0);
        if (Double.isNaN(this.f31018c)) {
            return Double.NaN;
        }
        if (this.f31016a == 1) {
            return 0.0d;
        }
        return DoubleUtils.b(this.f31018c) / this.f31016a;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.f31016a > 1);
        if (Double.isNaN(this.f31018c)) {
            return Double.NaN;
        }
        return DoubleUtils.b(this.f31018c) / (this.f31016a - 1);
    }

    public Stats snapshot() {
        return new Stats(this.f31016a, this.f31017b, this.f31018c, this.f31019d, this.f31020e);
    }

    public final double sum() {
        return this.f31017b * this.f31016a;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d10 : dArr) {
            add(d10);
        }
    }

    public void addAll(int... iArr) {
        for (int i10 : iArr) {
            add(i10);
        }
    }

    public void addAll(long... jArr) {
        for (long j10 : jArr) {
            add(j10);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        b(stats.count(), stats.mean(), stats.d(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        b(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.c(), statsAccumulator.min(), statsAccumulator.max());
    }
}
