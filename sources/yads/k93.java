package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class k93 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f112654d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f112655a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112657c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f112654d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long a(yc0 yc0Var, boolean z10, boolean z11, int i10) throws EOFException, InterruptedIOException {
        int i11;
        if (this.f112656b == 0) {
            if (!yc0Var.a(this.f112655a, 0, 1, z10)) {
                return -1L;
            }
            int i12 = this.f112655a[0] & 255;
            int i13 = 0;
            while (true) {
                long[] jArr = f112654d;
                if (i13 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((((long) i12) & jArr[i13]) != 0) {
                    i11 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f112657c = i11;
            if (i11 != -1) {
                this.f112656b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i14 = this.f112657c;
        if (i14 > i10) {
            this.f112656b = 0;
            return -2L;
        }
        if (i14 != 1) {
            yc0Var.a(this.f112655a, 1, i14 - 1, false);
        }
        this.f112656b = 0;
        return a(this.f112655a, this.f112657c, z11);
    }
}
