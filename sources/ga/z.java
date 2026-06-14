package ga;

import ga.c0;
import ga.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class z implements c0, c0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.b f72553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f72554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ka.b f72555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f72556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0 f72557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c0.a f72558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f72559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f72560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f72561j = -9223372036854775807L;

    public interface a {
        void a(f0.b bVar);

        void b(f0.b bVar, IOException iOException);
    }

    public z(f0.b bVar, ka.b bVar2, long j10) {
        this.f72553b = bVar;
        this.f72555d = bVar2;
        this.f72554c = j10;
    }

    private long i(long j10) {
        long j11 = this.f72561j;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // ga.c0, ga.d1
    public boolean a(io.bidmachine.media3.exoplayer.l1 l1Var) {
        c0 c0Var = this.f72557f;
        return c0Var != null && c0Var.a(l1Var);
    }

    @Override // ga.c0
    public long b(long j10, u9.m0 m0Var) {
        return ((c0) q9.o0.i(this.f72557f)).b(j10, m0Var);
    }

    @Override // ga.c0
    public void c(c0.a aVar, long j10) {
        this.f72558g = aVar;
        c0 c0Var = this.f72557f;
        if (c0Var != null) {
            c0Var.c(this, i(this.f72554c));
        }
    }

    @Override // ga.c0
    public void discardBuffer(long j10, boolean z10) {
        ((c0) q9.o0.i(this.f72557f)).discardBuffer(j10, z10);
    }

    public void e(f0.b bVar) {
        long jI = i(this.f72554c);
        c0 c0VarE = ((f0) q9.a.e(this.f72556e)).e(bVar, this.f72555d, jI);
        this.f72557f = c0VarE;
        if (this.f72558g != null) {
            c0VarE.c(this, jI);
        }
    }

    @Override // ga.c0.a
    public void f(c0 c0Var) {
        ((c0.a) q9.o0.i(this.f72558g)).f(this);
        a aVar = this.f72559h;
        if (aVar != null) {
            aVar.a(this.f72553b);
        }
    }

    public long g() {
        return this.f72561j;
    }

    @Override // ga.c0, ga.d1
    public long getBufferedPositionUs() {
        return ((c0) q9.o0.i(this.f72557f)).getBufferedPositionUs();
    }

    @Override // ga.c0, ga.d1
    public long getNextLoadPositionUs() {
        return ((c0) q9.o0.i(this.f72557f)).getNextLoadPositionUs();
    }

    @Override // ga.c0
    public m1 getTrackGroups() {
        return ((c0) q9.o0.i(this.f72557f)).getTrackGroups();
    }

    public long h() {
        return this.f72554c;
    }

    @Override // ga.c0, ga.d1
    public boolean isLoading() {
        c0 c0Var = this.f72557f;
        return c0Var != null && c0Var.isLoading();
    }

    @Override // ga.c0
    public long j(ja.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f72561j;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f72554c) ? j10 : j11;
        this.f72561j = -9223372036854775807L;
        return ((c0) q9.o0.i(this.f72557f)).j(rVarArr, zArr, c1VarArr, zArr2, j12);
    }

    @Override // ga.d1.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void d(c0 c0Var) {
        ((c0.a) q9.o0.i(this.f72558g)).d(this);
    }

    public void l(long j10) {
        this.f72561j = j10;
    }

    public void m() {
        if (this.f72557f != null) {
            ((f0) q9.a.e(this.f72556e)).c(this.f72557f);
        }
    }

    @Override // ga.c0
    public void maybeThrowPrepareError() throws IOException {
        try {
            c0 c0Var = this.f72557f;
            if (c0Var != null) {
                c0Var.maybeThrowPrepareError();
                return;
            }
            f0 f0Var = this.f72556e;
            if (f0Var != null) {
                f0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f72559h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f72560i) {
                return;
            }
            this.f72560i = true;
            aVar.b(this.f72553b, e10);
        }
    }

    public void n(f0 f0Var) {
        q9.a.g(this.f72556e == null);
        this.f72556e = f0Var;
    }

    @Override // ga.c0
    public long readDiscontinuity() {
        return ((c0) q9.o0.i(this.f72557f)).readDiscontinuity();
    }

    @Override // ga.c0, ga.d1
    public void reevaluateBuffer(long j10) {
        ((c0) q9.o0.i(this.f72557f)).reevaluateBuffer(j10);
    }

    @Override // ga.c0
    public long seekToUs(long j10) {
        return ((c0) q9.o0.i(this.f72557f)).seekToUs(j10);
    }
}
