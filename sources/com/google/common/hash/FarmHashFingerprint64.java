package com.google.common.hash;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final HashFunction f30747b = new FarmHashFingerprint64();

    FarmHashFingerprint64() {
    }

    static long a(byte[] bArr, int i10, int i11) {
        return i11 <= 32 ? i11 <= 16 ? b(bArr, i10, i11) : d(bArr, i10, i11) : i11 <= 64 ? g(bArr, i10, i11) : h(bArr, i10, i11);
    }

    private static long b(byte[] bArr, int i10, int i11) {
        if (i11 >= 8) {
            long j10 = (((long) i11) * 2) - 7286425919675154353L;
            long jB = LittleEndianByteArray.b(bArr, i10) - 7286425919675154353L;
            long jB2 = LittleEndianByteArray.b(bArr, (i10 + i11) - 8);
            return c((Long.rotateRight(jB2, 37) * j10) + jB, (Long.rotateRight(jB, 25) + jB2) * j10, j10);
        }
        if (i11 >= 4) {
            return c(((long) i11) + ((((long) LittleEndianByteArray.a(bArr, i10)) & 4294967295L) << 3), ((long) LittleEndianByteArray.a(bArr, (i10 + i11) - 4)) & 4294967295L, ((long) (i11 * 2)) - 7286425919675154353L);
        }
        if (i11 <= 0) {
            return -7286425919675154353L;
        }
        return i((((long) ((bArr[i10] & 255) + ((bArr[(i11 >> 1) + i10] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (i11 + ((bArr[i10 + (i11 - 1)] & 255) << 2))) * (-4348849565147123417L))) * (-7286425919675154353L);
    }

    private static long c(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    private static long d(byte[] bArr, int i10, int i11) {
        long j10 = (((long) i11) * 2) - 7286425919675154353L;
        long jB = LittleEndianByteArray.b(bArr, i10) * (-5435081209227447693L);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jB3 = LittleEndianByteArray.b(bArr, i12 - 8) * j10;
        return c(Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (LittleEndianByteArray.b(bArr, i12 - 16) * (-7286425919675154353L)), jB3 + jB + Long.rotateRight(jB2 - 7286425919675154353L, 18), j10);
    }

    private static long g(byte[] bArr, int i10, int i11) {
        long j10 = (((long) i11) * 2) - 7286425919675154353L;
        long jB = LittleEndianByteArray.b(bArr, i10) * (-7286425919675154353L);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        int i12 = i10 + i11;
        long jB3 = LittleEndianByteArray.b(bArr, i12 - 8) * j10;
        long jRotateRight = Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (LittleEndianByteArray.b(bArr, i12 - 16) * (-7286425919675154353L));
        long jC = c(jRotateRight, jB3 + Long.rotateRight(jB2 - 7286425919675154353L, 18) + jB, j10);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 16) * j10;
        long jB5 = LittleEndianByteArray.b(bArr, i10 + 24);
        long jB6 = (jRotateRight + LittleEndianByteArray.b(bArr, i12 - 32)) * j10;
        return c(Long.rotateRight(jB4 + jB5, 43) + Long.rotateRight(jB6, 30) + ((jC + LittleEndianByteArray.b(bArr, i12 - 24)) * j10), jB4 + Long.rotateRight(jB + jB5, 18) + jB6, j10);
    }

    private static long h(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = bArr;
        long j10 = 81;
        long j11 = -5435081209227447693L;
        long j12 = (j10 * (-5435081209227447693L)) + 113;
        long jI = i((j12 * (-7286425919675154353L)) + 113) * (-7286425919675154353L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c10 = 1;
        int i12 = i11 - 1;
        int i13 = i10 + ((i12 / 64) * 64);
        int i14 = i12 & 63;
        int i15 = i13 + i14;
        int i16 = i15 - 63;
        long j13 = j12;
        long jB = (j10 * (-7286425919675154353L)) + LittleEndianByteArray.b(bArr, i10);
        int i17 = i10;
        while (true) {
            long j14 = j11;
            long jRotateRight = Long.rotateRight(jB + j13 + jArr[0] + LittleEndianByteArray.b(bArr2, i17 + 8), 37) * j14;
            long jRotateRight2 = Long.rotateRight(j13 + jArr[c10] + LittleEndianByteArray.b(bArr2, i17 + 48), 42) * j14;
            long j15 = jRotateRight ^ jArr2[c10];
            char c11 = c10;
            long jB2 = jRotateRight2 + jArr[0] + LittleEndianByteArray.b(bArr2, i17 + 40);
            long jRotateRight3 = Long.rotateRight(jI + jArr2[0], 33) * j14;
            j(bArr2, i17, jArr[c11] * j14, j15 + jArr2[0], jArr);
            int i18 = i17;
            long[] jArr3 = jArr;
            j(bArr2, i18 + 32, jArr2[c11] + jRotateRight3, jB2 + LittleEndianByteArray.b(bArr2, i18 + 16), jArr2);
            i17 = i18 + 64;
            if (i17 == i13) {
                long j16 = ((j15 & 255) << c11) + j14;
                long j17 = jArr2[0] + ((long) i14);
                jArr2[0] = j17;
                long j18 = jArr3[0] + j17;
                jArr3[0] = j18;
                jArr2[0] = jArr2[0] + j18;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jB2 + jArr3[0] + LittleEndianByteArray.b(bArr2, i15 - 55), 37) * j16;
                long jRotateRight5 = Long.rotateRight(jB2 + jArr3[c11] + LittleEndianByteArray.b(bArr2, i15 - 15), 42) * j16;
                long j19 = jRotateRight4 ^ (jArr2[c11] * 9);
                long jB3 = jRotateRight5 + (jArr3[0] * 9) + LittleEndianByteArray.b(bArr2, i15 - 23);
                long jRotateRight6 = Long.rotateRight(j15 + jArr2[0], 33) * j16;
                j(bArr2, i16, jArr3[c11] * j16, jArr2[0] + j19, jArr3);
                j(bArr2, i15 - 31, jArr2[c11] + jRotateRight6, LittleEndianByteArray.b(bArr2, i15 - 47) + jB3, jArr2);
                return c(c(jArr3[0], jArr2[0], j16) + (i(jB3) * (-4348849565147123417L)) + j19, c(jArr3[c11], jArr2[c11], j16) + jRotateRight6, j16);
            }
            bArr2 = bArr;
            jB = jRotateRight3;
            j11 = j14;
            jI = j15;
            c10 = c11;
            j13 = jB2;
            jArr = jArr3;
        }
    }

    private static long i(long j10) {
        return j10 ^ (j10 >>> 47);
    }

    private static void j(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jB = LittleEndianByteArray.b(bArr, i10);
        long jB2 = LittleEndianByteArray.b(bArr, i10 + 8);
        long jB3 = LittleEndianByteArray.b(bArr, i10 + 16);
        long jB4 = LittleEndianByteArray.b(bArr, i10 + 24);
        long j12 = j10 + jB;
        long j13 = jB2 + j12 + jB3;
        long jRotateRight = Long.rotateRight(j11 + j12 + jB4, 21) + Long.rotateRight(j13, 44);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
