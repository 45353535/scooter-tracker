package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yc0 implements yo0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y20 f118150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f118151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f118152d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118155g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f118153e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f118149a = new byte[4096];

    static {
        dn0.a("goog.exo.extractor");
    }

    public yc0(c30 c30Var, long j10, long j11) {
        this.f118150b = c30Var;
        this.f118152d = j10;
        this.f118151c = j11;
    }

    public final boolean a(boolean z10, int i10) throws EOFException, InterruptedIOException {
        int i11 = this.f118154f + i10;
        byte[] bArr = this.f118153e;
        if (i11 > bArr.length) {
            int i12 = w83.f117341a;
            this.f118153e = Arrays.copyOf(this.f118153e, Math.max(65536 + i11, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int iA = this.f118155g - this.f118154f;
        while (iA < i10) {
            boolean z11 = z10;
            int i13 = i10;
            iA = a(this.f118153e, this.f118154f, i13, iA, z11);
            if (iA == -1) {
                return false;
            }
            this.f118155g = this.f118154f + iA;
            i10 = i13;
            z10 = z11;
        }
        this.f118154f += i10;
        return true;
    }

    @Override // yads.yo0
    public final void b(int i10) throws EOFException, InterruptedIOException {
        a(false, i10);
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        yc0 yc0Var;
        int i12 = this.f118155g;
        int iA = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f118153e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            yc0Var = this;
            iA = yc0Var.a(bArr, i10, i11, 0, true);
        } else {
            yc0Var = this;
        }
        if (iA != -1) {
            yc0Var.f118152d += (long) iA;
        }
        return iA;
    }

    public final int d(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        yc0 yc0Var;
        int iMin;
        int i12 = this.f118154f + i11;
        byte[] bArr2 = this.f118153e;
        if (i12 > bArr2.length) {
            int i13 = w83.f117341a;
            this.f118153e = Arrays.copyOf(this.f118153e, Math.max(65536 + i12, Math.min(bArr2.length * 2, i12 + 524288)));
        }
        int i14 = this.f118155g;
        int i15 = this.f118154f;
        int i16 = i14 - i15;
        if (i16 == 0) {
            yc0Var = this;
            iMin = yc0Var.a(this.f118153e, i15, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            yc0Var.f118155g += iMin;
        } else {
            yc0Var = this;
            iMin = Math.min(i11, i16);
        }
        System.arraycopy(yc0Var.f118153e, yc0Var.f118154f, bArr, i10, iMin);
        yc0Var.f118154f += iMin;
        return iMin;
    }

    @Override // yads.yo0
    public final long f() {
        return this.f118152d + ((long) this.f118154f);
    }

    @Override // yads.yo0
    public final long b() {
        return this.f118151c;
    }

    @Override // yads.yo0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(z10, i11)) {
            return false;
        }
        System.arraycopy(this.f118153e, this.f118154f - i11, bArr, i10, i11);
        return true;
    }

    @Override // yads.yo0
    public final void b(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        a(bArr, i10, i11, false);
    }

    public final int c(int i10) throws EOFException, InterruptedIOException {
        yc0 yc0Var;
        int iMin = Math.min(this.f118155g, i10);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f118149a;
            yc0Var = this;
            iMin = yc0Var.a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        } else {
            yc0Var = this;
        }
        if (iMin != -1) {
            yc0Var.f118152d += (long) iMin;
        }
        return iMin;
    }

    @Override // yads.yo0
    public final long a() {
        return this.f118152d;
    }

    @Override // yads.yo0
    public final void a(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    @Override // yads.yo0
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iA;
        int i12 = this.f118155g;
        if (i12 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f118153e, 0, bArr, i10, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i11 && iA != -1) {
            iA = a(bArr, i10, i11, iA, z10);
        }
        if (iA != -1) {
            this.f118152d += (long) iA;
        }
        return iA != -1;
    }

    @Override // yads.yo0
    public final void d() {
        this.f118154f = 0;
    }

    public final void d(int i10) {
        int i11 = this.f118155g - i10;
        this.f118155g = i11;
        this.f118154f = 0;
        byte[] bArr = this.f118153e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f118153e = bArr2;
    }

    @Override // yads.yo0
    public final void a(int i10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f118155g, i10);
        d(iMin);
        int iA = iMin;
        while (iA < i10 && iA != -1) {
            iA = a(this.f118149a, -iA, Math.min(i10, this.f118149a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f118152d += (long) iA;
        }
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (!Thread.interrupted()) {
            int iC = this.f118150b.c(bArr, i10 + i12, i11 - i12);
            if (iC != -1) {
                return i12 + iC;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
