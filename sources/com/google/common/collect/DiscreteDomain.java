package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends Comparable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f29440b;

    private static final class BigIntegerDomain extends DiscreteDomain<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final BigIntegerDomain f29441c = new BigIntegerDomain();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final BigInteger f29442d = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final BigInteger f29443e = BigInteger.valueOf(Long.MAX_VALUE);

        BigIntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f29441c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigInteger a(BigInteger bigInteger, long j10) {
            CollectPreconditions.c(j10, "distance");
            return bigInteger.add(BigInteger.valueOf(j10));
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(f29442d).min(f29443e).longValue();
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger next(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public BigInteger previous(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }
    }

    private static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final IntegerDomain f29444c = new IntegerDomain();

        IntegerDomain() {
            super(true);
        }

        private Object readResolve() {
            return f29444c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer a(Integer num, long j10) {
            CollectPreconditions.c(j10, "distance");
            return Integer.valueOf(Ints.checkedCast(num.longValue() + j10));
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Integer num, Integer num2) {
            return ((long) num2.intValue()) - ((long) num.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer next(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Integer previous(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    private static final class LongDomain extends DiscreteDomain<Long> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final LongDomain f29445c = new LongDomain();

        LongDomain() {
            super(true);
        }

        private Object readResolve() {
            return f29445c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long a(Long l10, long j10) {
            CollectPreconditions.c(j10, "distance");
            long jLongValue = l10.longValue() + j10;
            if (jLongValue < 0) {
                Preconditions.checkArgument(l10.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(Long l10, Long l11) {
            long jLongValue = l11.longValue() - l10.longValue();
            if (l11.longValue() > l10.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l11.longValue() >= l10.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long next(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public Long previous(Long l10) {
            long jLongValue = l10.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public static DiscreteDomain<BigInteger> bigIntegers() {
        return BigIntegerDomain.f29441c;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.f29444c;
    }

    public static DiscreteDomain<Long> longs() {
        return LongDomain.f29445c;
    }

    Comparable a(Comparable comparable, long j10) {
        CollectPreconditions.c(j10, "distance");
        Comparable next = comparable;
        for (long j11 = 0; j11 < j10; j11++) {
            next = next(next);
            if (next == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + comparable + ", " + j10 + ")");
            }
        }
        return next;
    }

    public abstract long distance(C c10, C c11);

    @CanIgnoreReturnValue
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @CanIgnoreReturnValue
    public C minValue() {
        throw new NoSuchElementException();
    }

    public abstract C next(C c10);

    public abstract C previous(C c10);

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean z10) {
        this.f29440b = z10;
    }
}
