package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true)
public final class UnsignedLong extends Number implements Comparable<UnsignedLong>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31143b;
    public static final UnsignedLong ZERO = new UnsignedLong(0);
    public static final UnsignedLong ONE = new UnsignedLong(1);
    public static final UnsignedLong MAX_VALUE = new UnsignedLong(-1);

    private UnsignedLong(long j10) {
        this.f31143b = j10;
    }

    public static UnsignedLong fromLongBits(long j10) {
        return new UnsignedLong(j10);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(long j10) {
        Preconditions.checkArgument(j10 >= 0, "value (%s) is outside the range for an unsigned long value", j10);
        return fromLongBits(j10);
    }

    public BigInteger bigIntegerValue() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.f31143b & Long.MAX_VALUE);
        return this.f31143b < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    public UnsignedLong dividedBy(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.divide(this.f31143b, ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f31143b));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j10 = this.f31143b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnsignedLong) && this.f31143b == ((UnsignedLong) obj).f31143b;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j10 = this.f31143b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0f;
    }

    public int hashCode() {
        return Longs.hashCode(this.f31143b);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f31143b;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f31143b;
    }

    public UnsignedLong minus(UnsignedLong unsignedLong) {
        return fromLongBits(this.f31143b - ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f31143b);
    }

    public UnsignedLong mod(UnsignedLong unsignedLong) {
        return fromLongBits(UnsignedLongs.remainder(this.f31143b, ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f31143b));
    }

    public UnsignedLong plus(UnsignedLong unsignedLong) {
        return fromLongBits(this.f31143b + ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f31143b);
    }

    public UnsignedLong times(UnsignedLong unsignedLong) {
        return fromLongBits(this.f31143b * ((UnsignedLong) Preconditions.checkNotNull(unsignedLong)).f31143b);
    }

    public String toString() {
        return UnsignedLongs.toString(this.f31143b);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnsignedLong unsignedLong) {
        Preconditions.checkNotNull(unsignedLong);
        return UnsignedLongs.compare(this.f31143b, unsignedLong.f31143b);
    }

    public String toString(int i10) {
        return UnsignedLongs.toString(this.f31143b, i10);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        Preconditions.checkArgument(bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return fromLongBits(bigInteger.longValue());
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str) {
        return valueOf(str, 10);
    }

    @CanIgnoreReturnValue
    public static UnsignedLong valueOf(String str, int i10) {
        return fromLongBits(UnsignedLongs.parseUnsignedLong(str, i10));
    }
}
