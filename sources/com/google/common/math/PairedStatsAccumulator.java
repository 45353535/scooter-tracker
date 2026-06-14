package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class PairedStatsAccumulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StatsAccumulator f31003a = new StatsAccumulator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StatsAccumulator f31004b = new StatsAccumulator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f31005c = 0.0d;

    private static double a(double d10) {
        return Doubles.constrainToRange(d10, -1.0d, 1.0d);
    }

    private double b(double d10) {
        if (d10 > 0.0d) {
            return d10;
        }
        return Double.MIN_VALUE;
    }

    public void add(double d10, double d11) {
        this.f31003a.add(d10);
        if (!Doubles.isFinite(d10) || !Doubles.isFinite(d11)) {
            this.f31005c = Double.NaN;
        } else if (this.f31003a.count() > 1) {
            this.f31005c += (d10 - this.f31003a.mean()) * (d11 - this.f31004b.mean());
        }
        this.f31004b.add(d11);
    }

    public void addAll(PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.f31003a.addAll(pairedStats.xStats());
        if (this.f31004b.count() == 0) {
            this.f31005c = pairedStats.d();
        } else {
            this.f31005c += pairedStats.d() + ((pairedStats.xStats().mean() - this.f31003a.mean()) * (pairedStats.yStats().mean() - this.f31004b.mean()) * pairedStats.count());
        }
        this.f31004b.addAll(pairedStats.yStats());
    }

    public long count() {
        return this.f31003a.count();
    }

    public final LinearTransformation leastSquaresFit() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.f31005c)) {
            return LinearTransformation.forNaN();
        }
        double dC = this.f31003a.c();
        if (dC > 0.0d) {
            return this.f31004b.c() > 0.0d ? LinearTransformation.mapping(this.f31003a.mean(), this.f31004b.mean()).withSlope(this.f31005c / dC) : LinearTransformation.horizontal(this.f31004b.mean());
        }
        Preconditions.checkState(this.f31004b.c() > 0.0d);
        return LinearTransformation.vertical(this.f31003a.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.f31005c)) {
            return Double.NaN;
        }
        double dC = this.f31003a.c();
        double dC2 = this.f31004b.c();
        Preconditions.checkState(dC > 0.0d);
        Preconditions.checkState(dC2 > 0.0d);
        return a(this.f31005c / Math.sqrt(b(dC * dC2)));
    }

    public double populationCovariance() {
        Preconditions.checkState(count() != 0);
        return this.f31005c / count();
    }

    public final double sampleCovariance() {
        Preconditions.checkState(count() > 1);
        return this.f31005c / (count() - 1);
    }

    public PairedStats snapshot() {
        return new PairedStats(this.f31003a.snapshot(), this.f31004b.snapshot(), this.f31005c);
    }

    public Stats xStats() {
        return this.f31003a.snapshot();
    }

    public Stats yStats() {
        return this.f31004b.snapshot();
    }
}
