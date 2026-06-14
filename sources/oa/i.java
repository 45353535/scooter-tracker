package oa;

import oa.m0;

/* JADX INFO: loaded from: classes12.dex */
public class i implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f96555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f96556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f96557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f96558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f96559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f96560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f96561g;

    public i(long j10, long j11, int i10, int i11, boolean z10) {
        this.f96555a = j10;
        this.f96556b = j11;
        this.f96557c = i11 == -1 ? 1 : i11;
        this.f96559e = i10;
        this.f96561g = z10;
        if (j10 == -1) {
            this.f96558d = -1L;
            this.f96560f = -9223372036854775807L;
        } else {
            this.f96558d = j10 - j11;
            this.f96560f = c(j10, j11, i10);
        }
    }

    private long a(long j10) {
        long j11 = (j10 * ((long) this.f96559e)) / 8000000;
        int i10 = this.f96557c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f96558d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f96556b + Math.max(jMin, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public long b(long j10) {
        return c(j10, this.f96556b, this.f96559e);
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.f96560f;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        if (this.f96558d == -1 && !this.f96561g) {
            return new m0.a(new n0(0L, this.f96556b));
        }
        long jA = a(j10);
        long jB = b(jA);
        n0 n0Var = new n0(jB, jA);
        if (this.f96558d != -1 && jB < j10) {
            int i10 = this.f96557c;
            if (((long) i10) + jA < this.f96555a) {
                long j11 = jA + ((long) i10);
                return new m0.a(n0Var, new n0(b(j11), j11));
            }
        }
        return new m0.a(n0Var);
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return this.f96558d != -1 || this.f96561g;
    }
}
