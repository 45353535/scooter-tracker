package oa;

import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.v f96552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.v f96553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f96554c;

    public h0(long[] jArr, long[] jArr2, long j10) {
        q9.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f96552a = new q9.v(length);
            this.f96553b = new q9.v(length);
        } else {
            int i10 = length + 1;
            q9.v vVar = new q9.v(i10);
            this.f96552a = vVar;
            q9.v vVar2 = new q9.v(i10);
            this.f96553b = vVar2;
            vVar.a(0L);
            vVar2.a(0L);
        }
        this.f96552a.b(jArr);
        this.f96553b.b(jArr2);
        this.f96554c = j10;
    }

    public void a(long j10, long j11) {
        if (this.f96553b.d() == 0 && j10 > 0) {
            this.f96552a.a(0L);
            this.f96553b.a(0L);
        }
        this.f96552a.a(j11);
        this.f96553b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f96553b.d() == 0) {
            return false;
        }
        q9.v vVar = this.f96553b;
        return j10 - vVar.c(vVar.d() - 1) < j11;
    }

    public void c(long j10) {
        this.f96554c = j10;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96554c;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        if (this.f96553b.d() == 0) {
            return new m0.a(n0.f96612c);
        }
        int iF = q9.o0.f(this.f96553b, j10, true, true);
        n0 n0Var = new n0(this.f96553b.c(iF), this.f96552a.c(iF));
        if (n0Var.f96613a == j10 || iF == this.f96553b.d() - 1) {
            return new m0.a(n0Var);
        }
        int i10 = iF + 1;
        return new m0.a(n0Var, new n0(this.f96553b.c(i10), this.f96552a.c(i10)));
    }

    public long getTimeUs(long j10) {
        if (this.f96553b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f96553b.c(q9.o0.f(this.f96552a, j10, true, true));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return this.f96553b.d() > 0;
    }
}
