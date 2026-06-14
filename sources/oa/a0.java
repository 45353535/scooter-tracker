package oa;

import oa.b0;
import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f96449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f96450b;

    public a0(b0 b0Var, long j10) {
        this.f96449a = b0Var;
        this.f96450b = j10;
    }

    private n0 a(long j10, long j11) {
        return new n0((j10 * 1000000) / ((long) this.f96449a.f96468e), this.f96450b + j11);
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96449a.f();
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        q9.a.i(this.f96449a.f96474k);
        b0 b0Var = this.f96449a;
        b0.a aVar = b0Var.f96474k;
        long[] jArr = aVar.f96476a;
        long[] jArr2 = aVar.f96477b;
        int iH = q9.o0.h(jArr, b0Var.i(j10), true, false);
        n0 n0VarA = a(iH == -1 ? 0L : jArr[iH], iH != -1 ? jArr2[iH] : 0L);
        if (n0VarA.f96613a == j10 || iH == jArr.length - 1) {
            return new m0.a(n0VarA);
        }
        int i10 = iH + 1;
        return new m0.a(n0VarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }
}
