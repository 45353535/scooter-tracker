package hb;

import oa.i0;
import oa.m0;
import oa.n0;
import q9.d0;
import q9.o0;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f73098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f73099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f73101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f73102e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f73098a = jArr;
        this.f73099b = jArr2;
        this.f73100c = j10;
        this.f73101d = j11;
        this.f73102e = i10;
    }

    public static h a(long j10, long j11, i0.a aVar, d0 d0Var) {
        int iH;
        d0Var.X(6);
        long jQ = j11 + ((long) aVar.f96571c) + ((long) d0Var.q());
        int iQ = d0Var.q();
        if (iQ <= 0) {
            return null;
        }
        long jB1 = o0.b1((((long) iQ) * ((long) aVar.f96575g)) - 1, aVar.f96572d);
        int iP = d0Var.P();
        int iP2 = d0Var.P();
        int iP3 = d0Var.P();
        d0Var.X(2);
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        int i10 = 0;
        long j12 = j11 + ((long) aVar.f96571c);
        while (i10 < iP) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int i11 = i10;
            jArr3[i11] = (((long) i10) * jB1) / ((long) iP);
            jArr4[i11] = j12;
            if (iP3 == 1) {
                iH = d0Var.H();
            } else if (iP3 == 2) {
                iH = d0Var.P();
            } else if (iP3 == 3) {
                iH = d0Var.K();
            } else {
                if (iP3 != 4) {
                    return null;
                }
                iH = d0Var.L();
            }
            j12 += ((long) iH) * ((long) iP2);
            i10 = i11 + 1;
            jArr = jArr3;
            jArr2 = jArr4;
        }
        long[] jArr5 = jArr;
        long[] jArr6 = jArr2;
        if (j10 != -1 && j10 != jQ) {
            u.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jQ);
        }
        if (jQ != j12) {
            u.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jQ + ", " + j12 + "\nSeeking will be inaccurate.");
            jQ = Math.max(jQ, j12);
        }
        return new h(jArr5, jArr6, jB1, jQ, aVar.f96574f);
    }

    @Override // hb.g
    public int getAverageBitrate() {
        return this.f73102e;
    }

    @Override // hb.g
    public long getDataEndPosition() {
        return this.f73101d;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f73100c;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        int iH = o0.h(this.f73098a, j10, true, true);
        n0 n0Var = new n0(this.f73098a[iH], this.f73099b[iH]);
        if (n0Var.f96613a >= j10 || iH == this.f73098a.length - 1) {
            return new m0.a(n0Var);
        }
        int i10 = iH + 1;
        return new m0.a(n0Var, new n0(this.f73098a[i10], this.f73099b[i10]));
    }

    @Override // hb.g
    public long getTimeUs(long j10) {
        return this.f73098a[o0.h(this.f73099b, j10, true, true)];
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }
}
