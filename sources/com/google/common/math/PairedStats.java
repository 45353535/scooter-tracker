package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class PairedStats implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Stats f31000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Stats f31001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f31002d;

    PairedStats(Stats stats, Stats stats2, double d10) {
        this.f31000b = stats;
        this.f31001c = stats2;
        this.f31002d = d10;
    }

    private static double a(double d10) {
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        if (d10 <= -1.0d) {
            return -1.0d;
        }
        return d10;
    }

    private static double b(double d10) {
        if (d10 > 0.0d) {
            return d10;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.a(byteBufferOrder), Stats.a(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public long count() {
        return this.f31000b.count();
    }

    double d() {
        return this.f31002d;
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.f31000b.equals(pairedStats.f31000b) && this.f31001c.equals(pairedStats.f31001c) && Double.doubleToLongBits(this.f31002d) == Double.doubleToLongBits(pairedStats.f31002d);
    }

    public int hashCode() {
        return Objects.hashCode(this.f31000b, this.f31001c, Double.valueOf(this.f31002d));
    }

    public LinearTransformation leastSquaresFit() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.f31002d)) {
            return LinearTransformation.forNaN();
        }
        double d10 = this.f31000b.d();
        if (d10 > 0.0d) {
            return this.f31001c.d() > 0.0d ? LinearTransformation.mapping(this.f31000b.mean(), this.f31001c.mean()).withSlope(this.f31002d / d10) : LinearTransformation.horizontal(this.f31001c.mean());
        }
        Preconditions.checkState(this.f31001c.d() > 0.0d);
        return LinearTransformation.vertical(this.f31000b.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.f31002d)) {
            return Double.NaN;
        }
        double d10 = xStats().d();
        double d11 = yStats().d();
        Preconditions.checkState(d10 > 0.0d);
        Preconditions.checkState(d11 > 0.0d);
        return a(this.f31002d / Math.sqrt(b(d10 * d11)));
    }

    public double populationCovariance() {
        Preconditions.checkState(count() != 0);
        return this.f31002d / count();
    }

    public double sampleCovariance() {
        Preconditions.checkState(count() > 1);
        return this.f31002d / (count() - 1);
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f31000b.g(byteBufferOrder);
        this.f31001c.g(byteBufferOrder);
        byteBufferOrder.putDouble(this.f31002d);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? MoreObjects.toStringHelper(this).add("xStats", this.f31000b).add("yStats", this.f31001c).add("populationCovariance", populationCovariance()).toString() : MoreObjects.toStringHelper(this).add("xStats", this.f31000b).add("yStats", this.f31001c).toString();
    }

    public Stats xStats() {
        return this.f31000b;
    }

    public Stats yStats() {
        return this.f31001c;
    }
}
