package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final HashFunction f30748b = new Fingerprint2011();

    Fingerprint2011() {
    }

    static long a(byte[] bArr, int i10, int i11) {
        long jC = c((i11 <= 32 ? g(bArr, i10, i11, -1397348546323613475L) : i11 <= 64 ? d(bArr, i10, i11) : b(bArr, i10, i11)) + (i11 >= 9 ? LittleEndianByteArray.b(bArr, (i10 + i11) - 8) : -6505348102511208375L), i11 >= 8 ? LittleEndianByteArray.b(bArr, i10) : -6505348102511208375L);
        return (jC == 0 || jC == 1) ? jC - 2 : jC;
    }

    private static long b(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = bArr;
        long jB = LittleEndianByteArray.b(bArr, i10);
        int i12 = i10 + i11;
        long jB2 = LittleEndianByteArray.b(bArr2, i12 - 16) ^ (-8261664234251669945L);
        long jB3 = (-6505348102511208375L) ^ LittleEndianByteArray.b(bArr2, i12 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j10 = i11;
        i(bArr2, i12 - 64, j10, jB2, jArr);
        i(bArr2, i12 - 32, j10 * (-8261664234251669945L), -6505348102511208375L, jArr2);
        long[] jArr3 = jArr2;
        long jH = jB3 + (h(jArr[1]) * (-8261664234251669945L));
        long jRotateRight = Long.rotateRight(jB + jH, 39) * (-8261664234251669945L);
        int i13 = (i11 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jB2, 33) * (-8261664234251669945L);
        long j11 = jRotateRight;
        int i14 = i10;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j11 + jRotateRight2 + jArr[0] + LittleEndianByteArray.b(bArr2, i14 + 16), 37) * (-8261664234251669945L);
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.b(bArr2, i14 + 48), 42) * (-8261664234251669945L);
            long j12 = jArr3[1] ^ jRotateRight3;
            long j13 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(jArr3[0] ^ jH, 33);
            i(bArr2, i14, jArr[1] * (-8261664234251669945L), jArr3[0] + j12, jArr);
            int i15 = i14;
            long[] jArr4 = jArr3;
            jRotateRight2 = j13;
            i(bArr, i15 + 32, jArr3[1] + jRotateRight5, jRotateRight2, jArr4);
            i14 = i15 + 64;
            i13 -= 64;
            if (i13 == 0) {
                return c(c(jArr[0], jArr4[0]) + (h(jRotateRight2) * (-8261664234251669945L)) + j12, c(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j11 = jRotateRight5;
            jH = j12;
        }
    }

    static long c(long j10, long j11) {
        long j12 = (j11 ^ j10) * (-4132994306676758123L);
        long j13 = (j10 ^ (j12 ^ (j12 >>> 47))) * (-4132994306676758123L);
        return (j13 ^ (j13 >>> 47)) * (-4132994306676758123L);
    }

    private static long d(byte[] bArr, int i10, int i11) {
        long jB = LittleEndianByteArray.b(bArr, i10 + 24);
        int i12 = i10 + i11;
        int i13 = i12 - 16;
        long jB2 = LittleEndianByteArray.b(bArr, i10) + ((((long) i11) + LittleEndianByteArray.b(bArr, i13)) * (-6505348102511208375L));
        long jRotateRight = Long.rotateRight(jB2 + jB, 52);
        long jRotateRight2 = Long.rotateRight(jB2, 37);
        long jB3 = jB2 + LittleEndianByteArray.b(bArr, i10 + 8);
        long jRotateRight3 = jRotateRight2 + Long.rotateRight(jB3, 7);
        int i14 = i10 + 16;
        long jB4 = jB3 + LittleEndianByteArray.b(bArr, i14);
        long j10 = jB + jB4;
        long jRotateRight4 = jRotateRight + Long.rotateRight(jB4, 31) + jRotateRight3;
        long jB5 = LittleEndianByteArray.b(bArr, i14) + LittleEndianByteArray.b(bArr, i12 - 32);
        long jB6 = LittleEndianByteArray.b(bArr, i12 - 8);
        long jRotateRight5 = Long.rotateRight(jB5 + jB6, 52);
        long jRotateRight6 = Long.rotateRight(jB5, 37);
        long jB7 = jB5 + LittleEndianByteArray.b(bArr, i12 - 24);
        long jRotateRight7 = jRotateRight6 + Long.rotateRight(jB7, 7);
        long jB8 = jB7 + LittleEndianByteArray.b(bArr, i13);
        return h((h(((j10 + jRotateRight5 + Long.rotateRight(jB8, 31) + jRotateRight7) * (-4288712594273399085L)) + ((jB6 + jB8 + jRotateRight4) * (-6505348102511208375L))) * (-6505348102511208375L)) + jRotateRight4) * (-4288712594273399085L);
    }

    static long g(byte[] bArr, int i10, int i11, long j10) {
        int i12 = i11 & (-8);
        int i13 = i11 & 7;
        long jC = j10 ^ (((long) i11) * (-4132994306676758123L));
        for (int i14 = 0; i14 < i12; i14 += 8) {
            jC = (jC ^ (h(LittleEndianByteArray.b(bArr, i10 + i14) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
        }
        if (i13 != 0) {
            jC = (LittleEndianByteArray.c(bArr, i10 + i12, i13) ^ jC) * (-4132994306676758123L);
        }
        return h(h(jC) * (-4132994306676758123L));
    }

    private static long h(long j10) {
        return j10 ^ (j10 >>> 47);
    }

    private static void i(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jB = LittleEndianByteArray.b(bArr, i10);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        long jB3 = LittleEndianByteArray.b(bArr, i10 + 16);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 24);
        long j12 = j10 + jB;
        long j13 = jB2 + j12 + jB3;
        long jRotateRight = Long.rotateRight(j11 + j12 + jB4, 51) + Long.rotateRight(j13, 23);
        jArr[0] = j13 + jB4;
        jArr[1] = jRotateRight + j12;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i10 + i11, bArr.length);
        return HashCode.fromLong(a(bArr, i10, i11));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
