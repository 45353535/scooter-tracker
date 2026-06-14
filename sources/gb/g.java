package gb;

import oa.s;

/* JADX INFO: loaded from: classes12.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f72715d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f72716a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f72718c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f72715d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = f72715d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & ((long) i10)) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public int b() {
        return this.f72718c;
    }

    public long d(s sVar, boolean z10, boolean z11, int i10) {
        if (this.f72717b == 0) {
            if (!sVar.readFully(this.f72716a, 0, 1, z10)) {
                return -1L;
            }
            int iC = c(this.f72716a[0] & 255);
            this.f72718c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f72717b = 1;
        }
        int i11 = this.f72718c;
        if (i11 > i10) {
            this.f72717b = 0;
            return -2L;
        }
        if (i11 != 1) {
            sVar.readFully(this.f72716a, 1, i11 - 1);
        }
        this.f72717b = 0;
        return a(this.f72716a, this.f72718c, z11);
    }

    public void e() {
        this.f72717b = 0;
        this.f72718c = 0;
    }
}
