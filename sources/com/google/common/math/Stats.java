package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Stats implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f31012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f31013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f31014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f31015f;

    Stats(long j10, double d10, double d11, double d12, double d13) {
        this.f31011b = j10;
        this.f31012c = d10;
        this.f31013d = d11;
        this.f31014e = d12;
        this.f31015f = d13;
    }

    static Stats a(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public static Stats fromByteArray(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return a(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static Stats of(Iterable<? extends Number> iterable) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    public long count() {
        return this.f31011b;
    }

    double d() {
        return this.f31013d;
    }

    public boolean equals(Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.f31011b == stats.f31011b && Double.doubleToLongBits(this.f31012c) == Double.doubleToLongBits(stats.f31012c) && Double.doubleToLongBits(this.f31013d) == Double.doubleToLongBits(stats.f31013d) && Double.doubleToLongBits(this.f31014e) == Double.doubleToLongBits(stats.f31014e) && Double.doubleToLongBits(this.f31015f) == Double.doubleToLongBits(stats.f31015f);
    }

    void g(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.f31011b).putDouble(this.f31012c).putDouble(this.f31013d).putDouble(this.f31014e).putDouble(this.f31015f);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f31011b), Double.valueOf(this.f31012c), Double.valueOf(this.f31013d), Double.valueOf(this.f31014e), Double.valueOf(this.f31015f));
    }

    public double max() {
        Preconditions.checkState(this.f31011b != 0);
        return this.f31015f;
    }

    public double mean() {
        Preconditions.checkState(this.f31011b != 0);
        return this.f31012c;
    }

    public double min() {
        Preconditions.checkState(this.f31011b != 0);
        return this.f31014e;
    }

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        Preconditions.checkState(this.f31011b > 0);
        if (Double.isNaN(this.f31013d)) {
            return Double.NaN;
        }
        if (this.f31011b == 1) {
            return 0.0d;
        }
        return DoubleUtils.b(this.f31013d) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        Preconditions.checkState(this.f31011b > 1);
        if (Double.isNaN(this.f31013d)) {
            return Double.NaN;
        }
        return DoubleUtils.b(this.f31013d) / (this.f31011b - 1);
    }

    public double sum() {
        return this.f31012c * this.f31011b;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        g(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? MoreObjects.toStringHelper(this).add("count", this.f31011b).add("mean", this.f31012c).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.f31014e).add("max", this.f31015f).toString() : MoreObjects.toStringHelper(this).add("count", this.f31011b).toString();
    }

    public static double meanOf(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j10 = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j10++;
            dDoubleValue = (Doubles.isFinite(dDoubleValue2) && Doubles.isFinite(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j10) : StatsAccumulator.a(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static Stats of(Iterator<? extends Number> it) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(it);
        return statsAccumulator.snapshot();
    }

    public static Stats of(double... dArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(dArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dA = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            double d10 = dArr[i10];
            dA = (Doubles.isFinite(d10) && Doubles.isFinite(dA)) ? dA + ((d10 - dA) / ((double) (i10 + 1))) : StatsAccumulator.a(dA, d10);
        }
        return dA;
    }

    public static Stats of(int... iArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iArr);
        return statsAccumulator.snapshot();
    }

    public static Stats of(long... jArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        double dA = iArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            double d10 = iArr[i10];
            dA = (Doubles.isFinite(d10) && Doubles.isFinite(dA)) ? dA + ((d10 - dA) / ((double) (i10 + 1))) : StatsAccumulator.a(dA, d10);
        }
        return dA;
    }

    public static double meanOf(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        double dA = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            double d10 = jArr[i10];
            dA = (Doubles.isFinite(d10) && Doubles.isFinite(dA)) ? dA + ((d10 - dA) / ((double) (i10 + 1))) : StatsAccumulator.a(dA, d10);
        }
        return dA;
    }
}
