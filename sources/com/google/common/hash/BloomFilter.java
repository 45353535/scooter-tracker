package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.hash.BloomFilterStrategies;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements Predicate<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BloomFilterStrategies.LockFreeBitArray f30722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Funnel f30724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Strategy f30725e;

    private static class SerialForm<T> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f30726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f30727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Funnel f30728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Strategy f30729e;

        SerialForm(BloomFilter bloomFilter) {
            this.f30726b = BloomFilterStrategies.LockFreeBitArray.toPlainArray(bloomFilter.f30722b.f30731a);
            this.f30727c = bloomFilter.f30723c;
            this.f30728d = bloomFilter.f30724d;
            this.f30729e = bloomFilter.f30725e;
        }

        Object readResolve() {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(this.f30726b), this.f30727c, this.f30728d, this.f30729e);
        }
    }

    interface Strategy extends Serializable {
        <T> boolean mightContain(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);

        int ordinal();

        <T> boolean put(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, BloomFilterStrategies.LockFreeBitArray lockFreeBitArray);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i10, double d10) {
        return create(funnel, i10, d10);
    }

    static BloomFilter h(Funnel funnel, long j10, double d10, Strategy strategy) {
        Preconditions.checkNotNull(funnel);
        Preconditions.checkArgument(j10 >= 0, "Expected insertions (%s) must be >= 0", j10);
        Preconditions.checkArgument(d10 > 0.0d, "False positive probability (%s) must be > 0.0", Double.valueOf(d10));
        Preconditions.checkArgument(d10 < 1.0d, "False positive probability (%s) must be < 1.0", Double.valueOf(d10));
        Preconditions.checkNotNull(strategy);
        if (j10 == 0) {
            j10 = 1;
        }
        long jI = i(j10, d10);
        try {
            return new BloomFilter(new BloomFilterStrategies.LockFreeBitArray(jI), j(j10, jI), funnel, strategy);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + jI + " bits", e10);
        }
    }

    static long i(long j10, double d10) {
        if (d10 == 0.0d) {
            d10 = Double.MIN_VALUE;
        }
        return (long) (((-j10) * Math.log(d10)) / (Math.log(2.0d) * Math.log(2.0d)));
    }

    static int j(long j10, long j11) {
        return Math.max(1, (int) Math.round((j11 / j10) * Math.log(2.0d)));
    }

    public static <T> BloomFilter<T> readFrom(InputStream inputStream, Funnel<? super T> funnel) throws IOException {
        int i10;
        int i11;
        DataInputStream dataInputStream;
        byte b10;
        Preconditions.checkNotNull(inputStream, "InputStream");
        Preconditions.checkNotNull(funnel, "Funnel");
        int i12 = -1;
        try {
            try {
                dataInputStream = new DataInputStream(inputStream);
                b10 = dataInputStream.readByte();
                try {
                    i11 = UnsignedBytes.toInt(dataInputStream.readByte());
                } catch (Exception e10) {
                    e = e10;
                    i11 = -1;
                    i12 = b10;
                    i10 = -1;
                }
            } catch (Exception e11) {
                e = e11;
                i10 = -1;
                i11 = -1;
            }
            try {
                i12 = dataInputStream.readInt();
                BloomFilterStrategies bloomFilterStrategies = BloomFilterStrategies.values()[b10];
                BloomFilterStrategies.LockFreeBitArray lockFreeBitArray = new BloomFilterStrategies.LockFreeBitArray(LongMath.checkedMultiply(i12, 64L));
                for (int i13 = 0; i13 < i12; i13++) {
                    lockFreeBitArray.f(i13, dataInputStream.readLong());
                }
                return new BloomFilter<>(lockFreeBitArray, i11, funnel, bloomFilterStrategies);
            } catch (Exception e12) {
                e = e12;
                int i14 = i12;
                i12 = b10;
                i10 = i14;
                throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + i12 + " numHashFunctions: " + i11 + " dataLength: " + i10, e);
            }
        } catch (IOException e13) {
            throw e13;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new SerialForm(this);
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(@ParametricNullness T t10) {
        return mightContain(t10);
    }

    public long approximateElementCount() {
        double dB = this.f30722b.b();
        return DoubleMath.roundToLong(((-Math.log1p(-(this.f30722b.a() / dB))) * dB) / ((double) this.f30723c), RoundingMode.HALF_UP);
    }

    public BloomFilter<T> copy() {
        return new BloomFilter<>(this.f30722b.c(), this.f30723c, this.f30724d, this.f30725e);
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.f30723c == bloomFilter.f30723c && this.f30724d.equals(bloomFilter.f30724d) && this.f30722b.equals(bloomFilter.f30722b) && this.f30725e.equals(bloomFilter.f30725e)) {
                return true;
            }
        }
        return false;
    }

    public double expectedFpp() {
        return Math.pow(this.f30722b.a() / g(), this.f30723c);
    }

    long g() {
        return this.f30722b.b();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f30723c), this.f30724d, this.f30725e, this.f30722b);
    }

    public boolean isCompatible(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        return this != bloomFilter && this.f30723c == bloomFilter.f30723c && g() == bloomFilter.g() && this.f30725e.equals(bloomFilter.f30725e) && this.f30724d.equals(bloomFilter.f30724d);
    }

    public boolean mightContain(@ParametricNullness T t10) {
        return this.f30725e.mightContain(t10, this.f30724d, this.f30723c, this.f30722b);
    }

    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness T t10) {
        return this.f30725e.put(t10, this.f30724d, this.f30723c, this.f30722b);
    }

    public void putAll(BloomFilter<T> bloomFilter) {
        Preconditions.checkNotNull(bloomFilter);
        Preconditions.checkArgument(this != bloomFilter, "Cannot combine a BloomFilter with itself.");
        int i10 = this.f30723c;
        int i11 = bloomFilter.f30723c;
        Preconditions.checkArgument(i10 == i11, "BloomFilters must have the same number of hash functions (%s != %s)", i10, i11);
        Preconditions.checkArgument(g() == bloomFilter.g(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", g(), bloomFilter.g());
        Preconditions.checkArgument(this.f30725e.equals(bloomFilter.f30725e), "BloomFilters must have equal strategies (%s != %s)", this.f30725e, bloomFilter.f30725e);
        Preconditions.checkArgument(this.f30724d.equals(bloomFilter.f30724d), "BloomFilters must have equal funnels (%s != %s)", this.f30724d, bloomFilter.f30724d);
        this.f30722b.e(bloomFilter.f30722b);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeByte(SignedBytes.checkedCast(this.f30725e.ordinal()));
        dataOutputStream.writeByte(UnsignedBytes.checkedCast(this.f30723c));
        dataOutputStream.writeInt(this.f30722b.f30731a.length());
        for (int i10 = 0; i10 < this.f30722b.f30731a.length(); i10++) {
            dataOutputStream.writeLong(this.f30722b.f30731a.get(i10));
        }
    }

    private BloomFilter(BloomFilterStrategies.LockFreeBitArray lockFreeBitArray, int i10, Funnel funnel, Strategy strategy) {
        Preconditions.checkArgument(i10 > 0, "numHashFunctions (%s) must be > 0", i10);
        Preconditions.checkArgument(i10 <= 255, "numHashFunctions (%s) must be <= 255", i10);
        this.f30722b = (BloomFilterStrategies.LockFreeBitArray) Preconditions.checkNotNull(lockFreeBitArray);
        this.f30723c = i10;
        this.f30724d = (Funnel) Preconditions.checkNotNull(funnel);
        this.f30725e = (Strategy) Preconditions.checkNotNull(strategy);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j10, double d10) {
        return h(funnel, j10, d10, BloomFilterStrategies.MURMUR128_MITZ_64);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, int i10) {
        return create(funnel, i10);
    }

    public static <T> BloomFilter<T> create(Funnel<? super T> funnel, long j10) {
        return create(funnel, j10, 0.03d);
    }
}
