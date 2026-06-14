package wb;

import oa.m0;
import oa.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class e implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f107875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f107876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f107877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f107878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f107879e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f107875a = cVar;
        this.f107876b = i10;
        this.f107877c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f107870e);
        this.f107878d = j12;
        this.f107879e = a(j12);
    }

    private long a(long j10) {
        return o0.c1(j10 * ((long) this.f107876b), 1000000L, this.f107875a.f107868c);
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f107879e;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        long jQ = o0.q((((long) this.f107875a.f107868c) * j10) / (((long) this.f107876b) * 1000000), 0L, this.f107878d - 1);
        long j11 = this.f107877c + (((long) this.f107875a.f107870e) * jQ);
        long jA = a(jQ);
        n0 n0Var = new n0(jA, j11);
        if (jA >= j10 || jQ == this.f107878d - 1) {
            return new m0.a(n0Var);
        }
        long j12 = jQ + 1;
        return new m0.a(n0Var, new n0(a(j12), this.f107877c + (((long) this.f107875a.f107870e) * j12)));
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }
}
