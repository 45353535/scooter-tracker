package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ComparisonChain f29393a = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return d(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z10, boolean z11) {
            return d(Boolean.compare(z10, z11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z10, boolean z11) {
            return d(Boolean.compare(z11, z10));
        }

        ComparisonChain d(int i10) {
            return i10 < 0 ? ComparisonChain.f29394b : i10 > 0 ? ComparisonChain.f29395c : ComparisonChain.f29393a;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t10, @ParametricNullness T t11, Comparator<T> comparator) {
            return d(comparator.compare(t10, t11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i10, int i11) {
            return d(Integer.compare(i10, i11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j10, long j11) {
            return d(Long.compare(j10, j11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f10, float f11) {
            return d(Float.compare(f10, f11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d10, double d11) {
            return d(Double.compare(d10, d11));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ComparisonChain f29394b = new InactiveComparisonChain(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComparisonChain f29395c = new InactiveComparisonChain(1);

    private static final class InactiveComparisonChain extends ComparisonChain {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f29396d;

        InactiveComparisonChain(int i10) {
            super();
            this.f29396d = i10;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d10, double d11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.f29396d;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f10, float f11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t10, @ParametricNullness T t11, Comparator<T> comparator) {
            return this;
        }
    }

    public static ComparisonChain start() {
        return f29393a;
    }

    public abstract ComparisonChain compare(double d10, double d11);

    public abstract ComparisonChain compare(float f10, float f11);

    public abstract ComparisonChain compare(int i10, int i11);

    public abstract ComparisonChain compare(long j10, long j11);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t10, @ParametricNullness T t11, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z10, boolean z11);

    public abstract ComparisonChain compareTrueFirst(boolean z10, boolean z11);

    public abstract int result();

    private ComparisonChain() {
    }
}
