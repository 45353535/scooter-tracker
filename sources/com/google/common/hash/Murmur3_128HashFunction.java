package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final HashFunction f30794c = new Murmur3_128HashFunction(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final HashFunction f30795d = new Murmur3_128HashFunction(Hashing.f30761a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30796b;

    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f30797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f30798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f30799f;

        Murmur3_128Hasher(int i10) {
            super(16);
            long j10 = i10;
            this.f30797d = j10;
            this.f30798e = j10;
            this.f30799f = 0;
        }

        private void g(long j10, long j11) {
            long jI = i(j10) ^ this.f30797d;
            this.f30797d = jI;
            long jRotateLeft = Long.rotateLeft(jI, 27);
            long j12 = this.f30798e;
            this.f30797d = ((jRotateLeft + j12) * 5) + 1390208809;
            long j13 = j(j11) ^ j12;
            this.f30798e = j13;
            this.f30798e = ((Long.rotateLeft(j13, 31) + this.f30797d) * 5) + 944331445;
        }

        private static long h(long j10) {
            long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
            long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
            return j12 ^ (j12 >>> 33);
        }

        private static long i(long j10) {
            return Long.rotateLeft(j10 * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        private static long j(long j10) {
            return Long.rotateLeft(j10 * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected HashCode a() {
            long j10 = this.f30797d;
            int i10 = this.f30799f;
            long j11 = this.f30798e ^ ((long) i10);
            long j12 = (j10 ^ ((long) i10)) + j11;
            this.f30797d = j12;
            this.f30798e = j11 + j12;
            this.f30797d = h(j12);
            long jH = h(this.f30798e);
            long j13 = this.f30797d + jH;
            this.f30797d = j13;
            this.f30798e = jH + j13;
            return HashCode.c(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f30797d).putLong(this.f30798e).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void d(ByteBuffer byteBuffer) {
            g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f30799f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        protected void e(ByteBuffer byteBuffer) {
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            this.f30799f += byteBuffer.remaining();
            long j17 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j10 = 0;
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 2:
                    j11 = 0;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 3:
                    j12 = 0;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 4:
                    j13 = 0;
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 5:
                    j14 = 0;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 6:
                    j15 = 0;
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j15;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 7:
                    j15 = ((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48;
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j15;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j12 = (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24) ^ j13;
                    j11 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j12;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j16 = j10 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 8:
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 9:
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 10:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 11:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 12:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 13:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 14:
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                case 15:
                    j17 = ((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j17 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j17 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j16 = byteBuffer.getLong();
                    this.f30797d = i(j16) ^ this.f30797d;
                    this.f30798e ^= j(j17);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    Murmur3_128HashFunction(int i10) {
        this.f30796b = i10;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.f30796b == ((Murmur3_128HashFunction) obj).f30796b;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.f30796b;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.f30796b);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f30796b + ")";
    }
}
