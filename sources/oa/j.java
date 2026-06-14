package oa;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n9.h f96577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f96578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f96579d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96582g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f96580e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96576a = new byte[4096];

    static {
        n9.s.a("media3.extractor");
    }

    public j(n9.h hVar, long j10, long j11) {
        this.f96577b = hVar;
        this.f96579d = j10;
        this.f96578c = j11;
    }

    private void c(int i10) {
        if (i10 != -1) {
            this.f96579d += (long) i10;
        }
    }

    private void d(int i10) {
        int i11 = this.f96581f + i10;
        byte[] bArr = this.f96580e;
        if (i11 > bArr.length) {
            this.f96580e = Arrays.copyOf(this.f96580e, q9.o0.p(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f96582g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f96580e, 0, bArr, i10, iMin);
        i(iMin);
        return iMin;
    }

    private int f(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i13 = this.f96577b.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int g(int i10) {
        int iMin = Math.min(this.f96582g, i10);
        i(iMin);
        return iMin;
    }

    private void i(int i10) {
        int i11 = this.f96582g - i10;
        this.f96582g = i11;
        this.f96581f = 0;
        byte[] bArr = this.f96580e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f96580e = bArr2;
    }

    @Override // oa.s
    public boolean advancePeekPosition(int i10, boolean z10) throws EOFException, InterruptedIOException {
        d(i10);
        int iF = this.f96582g - this.f96581f;
        while (iF < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iF = f(this.f96580e, this.f96581f, i11, iF, z11);
            if (iF == -1) {
                return false;
            }
            this.f96582g = this.f96581f + iF;
            i10 = i11;
            z10 = z11;
        }
        this.f96581f += i10;
        return true;
    }

    @Override // oa.s
    public long getLength() {
        return this.f96578c;
    }

    @Override // oa.s
    public long getPeekPosition() {
        return this.f96579d + ((long) this.f96581f);
    }

    @Override // oa.s
    public long getPosition() {
        return this.f96579d;
    }

    public boolean h(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iG = g(i10);
        while (iG < i10 && iG != -1) {
            iG = f(this.f96576a, -iG, Math.min(i10, this.f96576a.length + iG), iG, z10);
        }
        c(iG);
        return iG != -1;
    }

    @Override // oa.s
    public int peek(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        d(i11);
        int i12 = this.f96582g;
        int i13 = this.f96581f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            jVar = this;
            iMin = jVar.f(this.f96580e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.f96582g += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(jVar.f96580e, jVar.f96581f, bArr, i10, iMin);
        jVar.f96581f += iMin;
        return iMin;
    }

    @Override // oa.s
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f96580e, this.f96581f - i11, bArr, i10, i11);
        return true;
    }

    @Override // oa.s, n9.h
    public int read(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        int iE = e(bArr, i10, i11);
        if (iE == 0) {
            iE = f(bArr, i10, i11, 0, true);
        }
        c(iE);
        return iE;
    }

    @Override // oa.s
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iE = e(bArr, i10, i11);
        while (iE < i11 && iE != -1) {
            iE = f(bArr, i10, i11, iE, z10);
        }
        c(iE);
        return iE != -1;
    }

    @Override // oa.s
    public void resetPeekPosition() {
        this.f96581f = 0;
    }

    @Override // oa.s
    public int skip(int i10) throws EOFException, InterruptedIOException {
        int iG = g(i10);
        if (iG == 0) {
            byte[] bArr = this.f96576a;
            iG = f(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        c(iG);
        return iG;
    }

    @Override // oa.s
    public void skipFully(int i10) throws EOFException, InterruptedIOException {
        h(i10, false);
    }

    @Override // oa.s
    public void peekFully(byte[] bArr, int i10, int i11) {
        peekFully(bArr, i10, i11, false);
    }

    @Override // oa.s
    public void readFully(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // oa.s
    public void advancePeekPosition(int i10) throws EOFException, InterruptedIOException {
        advancePeekPosition(i10, false);
    }
}
