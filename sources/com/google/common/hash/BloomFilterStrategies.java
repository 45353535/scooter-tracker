package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, LockFreeBitArray lockFreeBitArray) {
            long jB = lockFreeBitArray.b();
            long jAsLong = Hashing.murmur3_128().hashObject(t10, funnel).asLong();
            int i11 = (int) jAsLong;
            int i12 = (int) (jAsLong >>> 32);
            for (int i13 = 1; i13 <= i10; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                if (!lockFreeBitArray.d(((long) i14) % jB)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, LockFreeBitArray lockFreeBitArray) {
            long jB = lockFreeBitArray.b();
            long jAsLong = Hashing.murmur3_128().hashObject(t10, funnel).asLong();
            int i11 = (int) jAsLong;
            int i12 = (int) (jAsLong >>> 32);
            boolean zG = false;
            for (int i13 = 1; i13 <= i10; i13++) {
                int i14 = (i13 * i12) + i11;
                if (i14 < 0) {
                    i14 = ~i14;
                }
                zG |= lockFreeBitArray.g(((long) i14) % jB);
            }
            return zG;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long g(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long h(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, LockFreeBitArray lockFreeBitArray) {
            long jB = lockFreeBitArray.b();
            byte[] bArrD = Hashing.murmur3_128().hashObject(t10, funnel).d();
            long jG = g(bArrD);
            long jH = h(bArrD);
            for (int i11 = 0; i11 < i10; i11++) {
                if (!lockFreeBitArray.d((Long.MAX_VALUE & jG) % jB)) {
                    return false;
                }
                jG += jH;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(@ParametricNullness T t10, Funnel<? super T> funnel, int i10, LockFreeBitArray lockFreeBitArray) {
            long jB = lockFreeBitArray.b();
            byte[] bArrD = Hashing.murmur3_128().hashObject(t10, funnel).d();
            long jG = g(bArrD);
            long jH = h(bArrD);
            boolean zG = false;
            for (int i11 = 0; i11 < i10; i11++) {
                zG |= lockFreeBitArray.g((Long.MAX_VALUE & jG) % jB);
                jG += jH;
            }
            return zG;
        }
    };

    static final class LockFreeBitArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicLongArray f30731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LongAddable f30732b;

        LockFreeBitArray(long j10) {
            Preconditions.checkArgument(j10 > 0, "data length is zero!");
            this.f30731a = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j10, 64L, RoundingMode.CEILING)));
            this.f30732b = LongAddables.create();
        }

        public static long[] toPlainArray(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = atomicLongArray.get(i10);
            }
            return jArr;
        }

        long a() {
            return this.f30732b.sum();
        }

        long b() {
            return ((long) this.f30731a.length()) * 64;
        }

        LockFreeBitArray c() {
            return new LockFreeBitArray(toPlainArray(this.f30731a));
        }

        boolean d(long j10) {
            return ((1 << ((int) j10)) & this.f30731a.get((int) (j10 >>> 6))) != 0;
        }

        void e(LockFreeBitArray lockFreeBitArray) {
            Preconditions.checkArgument(this.f30731a.length() == lockFreeBitArray.f30731a.length(), "BitArrays must be of equal length (%s != %s)", this.f30731a.length(), lockFreeBitArray.f30731a.length());
            for (int i10 = 0; i10 < this.f30731a.length(); i10++) {
                f(i10, lockFreeBitArray.f30731a.get(i10));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(toPlainArray(this.f30731a), toPlainArray(((LockFreeBitArray) obj).f30731a));
            }
            return false;
        }

        void f(int i10, long j10) {
            while (true) {
                long j11 = this.f30731a.get(i10);
                long j12 = j11 | j10;
                if (j11 == j12) {
                    return;
                }
                int i11 = i10;
                if (this.f30731a.compareAndSet(i11, j11, j12)) {
                    this.f30732b.add(Long.bitCount(j12) - Long.bitCount(j11));
                    return;
                }
                i10 = i11;
            }
        }

        boolean g(long j10) {
            long j11;
            long j12;
            if (d(j10)) {
                return false;
            }
            int i10 = (int) (j10 >>> 6);
            long j13 = 1 << ((int) j10);
            do {
                j11 = this.f30731a.get(i10);
                j12 = j11 | j13;
                if (j11 == j12) {
                    return false;
                }
            } while (!this.f30731a.compareAndSet(i10, j11, j12));
            this.f30732b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(toPlainArray(this.f30731a));
        }

        LockFreeBitArray(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.f30731a = new AtomicLongArray(jArr);
            this.f30732b = LongAddables.create();
            long jBitCount = 0;
            for (long j10 : jArr) {
                jBitCount += (long) Long.bitCount(j10);
            }
            this.f30732b.add(jBitCount);
        }
    }
}
