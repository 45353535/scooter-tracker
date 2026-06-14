package wa;

import oa.d0;
import oa.m0;
import oa.n0;
import oa.s0;
import oa.t;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f107829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f107830c;

    class a extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f107831b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, m0 m0Var2) {
            super(m0Var);
            this.f107831b = m0Var2;
        }

        @Override // oa.d0, oa.m0
        public m0.a getSeekPoints(long j10) {
            m0.a seekPoints = this.f107831b.getSeekPoints(j10);
            n0 n0Var = seekPoints.f96607a;
            n0 n0Var2 = new n0(n0Var.f96613a, n0Var.f96614b + e.this.f107829b);
            n0 n0Var3 = seekPoints.f96608b;
            return new m0.a(n0Var2, new n0(n0Var3.f96613a, n0Var3.f96614b + e.this.f107829b));
        }
    }

    public e(long j10, t tVar) {
        this.f107829b = j10;
        this.f107830c = tVar;
    }

    @Override // oa.t
    public void e(m0 m0Var) {
        this.f107830c.e(new a(m0Var, m0Var));
    }

    @Override // oa.t
    public void endTracks() {
        this.f107830c.endTracks();
    }

    @Override // oa.t
    public s0 track(int i10, int i11) {
        return this.f107830c.track(i10, i11);
    }
}
