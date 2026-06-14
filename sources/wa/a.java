package wa;

import java.util.List;
import oa.l0;
import oa.o0;
import oa.q;
import oa.r;
import oa.s;
import oa.t;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f107811a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f107811a = new o0(65496, 2, "image/jpeg");
        } else {
            this.f107811a = new b();
        }
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        return this.f107811a.a(sVar, l0Var);
    }

    @Override // oa.r
    public void b(t tVar) {
        this.f107811a.b(tVar);
    }

    @Override // oa.r
    public boolean c(s sVar) {
        return this.f107811a.c(sVar);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void release() {
        this.f107811a.release();
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f107811a.seek(j10, j11);
    }
}
