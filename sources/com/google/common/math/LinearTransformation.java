package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f30983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f30984b;

        public LinearTransformation and(double d10, double d11) {
            Preconditions.checkArgument(DoubleUtils.d(d10) && DoubleUtils.d(d11));
            double d12 = this.f30983a;
            if (d10 != d12) {
                return withSlope((d11 - this.f30984b) / (d10 - d12));
            }
            Preconditions.checkArgument(d11 != this.f30984b);
            return new VerticalLinearTransformation(this.f30983a);
        }

        public LinearTransformation withSlope(double d10) {
            Preconditions.checkArgument(!Double.isNaN(d10));
            return DoubleUtils.d(d10) ? new RegularLinearTransformation(d10, this.f30984b - (this.f30983a * d10)) : new VerticalLinearTransformation(this.f30983a);
        }

        private LinearTransformationBuilder(double d10, double d11) {
            this.f30983a = d10;
            this.f30984b = d11;
        }
    }

    private static final class NaNLinearTransformation extends LinearTransformation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final NaNLinearTransformation f30985a = new NaNLinearTransformation();

        private NaNLinearTransformation() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d10) {
            return Double.NaN;
        }
    }

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.f30985a;
    }

    public static LinearTransformation horizontal(double d10) {
        Preconditions.checkArgument(DoubleUtils.d(d10));
        return new RegularLinearTransformation(0.0d, d10);
    }

    public static LinearTransformationBuilder mapping(double d10, double d11) {
        Preconditions.checkArgument(DoubleUtils.d(d10) && DoubleUtils.d(d11));
        return new LinearTransformationBuilder(d10, d11);
    }

    public static LinearTransformation vertical(double d10) {
        Preconditions.checkArgument(DoubleUtils.d(d10));
        return new VerticalLinearTransformation(d10);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d10);

    private static final class VerticalLinearTransformation extends LinearTransformation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f30989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearTransformation f30990b;

        VerticalLinearTransformation(double d10) {
            this.f30989a = d10;
            this.f30990b = null;
        }

        private LinearTransformation a() {
            return new RegularLinearTransformation(0.0d, this.f30989a, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f30990b;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationA = a();
            this.f30990b = linearTransformationA;
            return linearTransformationA;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f30989a));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d10) {
            throw new IllegalStateException();
        }

        VerticalLinearTransformation(double d10, LinearTransformation linearTransformation) {
            this.f30989a = d10;
            this.f30990b = linearTransformation;
        }
    }

    private static final class RegularLinearTransformation extends LinearTransformation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f30986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double f30987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearTransformation f30988c;

        RegularLinearTransformation(double d10, double d11) {
            this.f30986a = d10;
            this.f30987b = d11;
            this.f30988c = null;
        }

        private LinearTransformation a() {
            double d10 = this.f30986a;
            return d10 != 0.0d ? new RegularLinearTransformation(1.0d / d10, (this.f30987b * (-1.0d)) / d10, this) : new VerticalLinearTransformation(this.f30987b, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f30988c;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationA = a();
            this.f30988c = linearTransformationA;
            return linearTransformationA;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.f30986a == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.f30986a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f30986a), Double.valueOf(this.f30987b));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d10) {
            return (d10 * this.f30986a) + this.f30987b;
        }

        RegularLinearTransformation(double d10, double d11, LinearTransformation linearTransformation) {
            this.f30986a = d10;
            this.f30987b = d11;
            this.f30988c = linearTransformation;
        }
    }
}
