package ga;

import ga.c0;

/* JADX INFO: loaded from: classes12.dex */
final class j1 implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f72360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c0.a f72362d;

    private static final class a implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c1 f72363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f72364c;

        public a(c1 c1Var, long j10) {
            this.f72363b = c1Var;
            this.f72364c = j10;
        }

        public c1 a() {
            return this.f72363b;
        }

        @Override // ga.c1
        public int d(u9.d0 d0Var, t9.f fVar, int i10) {
            int iD = this.f72363b.d(d0Var, fVar, i10);
            if (iD == -4) {
                fVar.f104990g += this.f72364c;
            }
            return iD;
        }

        @Override // ga.c1
        public boolean isReady() {
            return this.f72363b.isReady();
        }

        @Override // ga.c1
        public void maybeThrowError() {
            this.f72363b.maybeThrowError();
        }

        @Override // ga.c1
        public int skipData(long j10) {
            return this.f72363b.skipData(j10 - this.f72364c);
        }
    }

    public j1(c0 c0Var, long j10) {
        this.f72360b = c0Var;
        this.f72361c = j10;
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        return this.f72360b.a(l1Var.a().f(l1Var.f81195a - this.f72361c).d());
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        return this.f72360b.b(j10 - this.f72361c, m0Var) + this.f72361c;
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f72362d = aVar;
        this.f72360b.c(this, j10 - this.f72361c);
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        this.f72360b.discardBuffer(j10 - this.f72361c, z10);
    }

    public c0 e() {
        return this.f72360b;
    }

    @Override // ga.c0.a
    public void f(c0 c0Var) {
        ((c0.a) q9.a.e(this.f72362d)).f(this);
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c0 c0Var) {
        ((c0.a) q9.a.e(this.f72362d)).d(this);
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f72360b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f72361c;
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f72360b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f72361c;
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return this.f72360b.getTrackGroups();
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        return this.f72360b.isLoading();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1VarA = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            a aVar = (a) c1VarArr[i10];
            if (aVar != null) {
                c1VarA = aVar.a();
            }
            c1VarArr2[i10] = c1VarA;
            i10++;
        }
        long j11 = this.f72360b.j(rVarArr, zArr, c1VarArr2, zArr2, j10 - this.f72361c);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var = c1VarArr2[i11];
            if (c1Var == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var2 = c1VarArr[i11];
                if (c1Var2 == null || ((a) c1Var2).a() != c1Var) {
                    c1VarArr[i11] = new a(c1Var, this.f72361c);
                }
            }
        }
        return j11 + this.f72361c;
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() {
        this.f72360b.maybeThrowPrepareError();
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        long discontinuity = this.f72360b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.f72361c;
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        this.f72360b.reevaluateBuffer(j10 - this.f72361c);
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        return this.f72360b.seekToUs(j10 - this.f72361c) + this.f72361c;
    }
}
