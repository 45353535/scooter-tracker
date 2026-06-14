package ib;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f74033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f74034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f74036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f74037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f74038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f74039g;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10, long j11) {
            this.f74033a = jArr;
            this.f74034b = iArr;
            this.f74035c = i10;
            this.f74036d = jArr2;
            this.f74037e = iArr2;
            this.f74038f = j10;
            this.f74039g = j11;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int[] iArr2 = iArr;
        int i11 = 8192 / i10;
        int i12 = 0;
        int iK = 0;
        for (int i13 : iArr2) {
            iK += o0.k(i13, i11);
        }
        long[] jArr2 = new long[iK];
        int[] iArr3 = new int[iK];
        long[] jArr3 = new long[iK];
        int[] iArr4 = new int[iK];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int iMax = 0;
        while (i12 < iArr2.length) {
            int i17 = iArr2[i12];
            long j11 = jArr[i12];
            while (i17 > 0) {
                int iMin = Math.min(i11, i17);
                jArr2[i16] = j11;
                int i18 = i10 * iMin;
                iArr3[i16] = i18;
                i15 += i18;
                iMax = Math.max(iMax, i18);
                jArr3[i16] = ((long) i14) * j10;
                iArr4[i16] = 1;
                j11 += (long) iArr3[i16];
                i14 += iMin;
                i17 -= iMin;
                i16++;
                i11 = i11;
            }
            i12++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, iMax, jArr3, iArr4, j10 * ((long) i14), i15);
    }
}
