package vb;

import io.bidmachine.media3.common.a;
import oa.s0;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.bidmachine.media3.common.a f106458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q9.j0 f106459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f106460c;

    public x(String str, String str2) {
        this.f106458a = new a.b().U(str2).u0(str).N();
    }

    private void c() {
        q9.a.i(this.f106459b);
        o0.i(this.f106460c);
    }

    @Override // vb.d0
    public void a(q9.d0 d0Var) {
        c();
        long jE = this.f106459b.e();
        long jF = this.f106459b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        io.bidmachine.media3.common.a aVar = this.f106458a;
        if (jF != aVar.f80566t) {
            io.bidmachine.media3.common.a aVarN = aVar.b().y0(jF).N();
            this.f106458a = aVarN;
            this.f106460c.f(aVarN);
        }
        int iA = d0Var.a();
        this.f106460c.c(d0Var, iA);
        this.f106460c.e(jE, 1, iA, 0, null);
    }

    @Override // vb.d0
    public void b(q9.j0 j0Var, oa.t tVar, l0.d dVar) {
        this.f106459b = j0Var;
        dVar.a();
        s0 s0VarTrack = tVar.track(dVar.c(), 5);
        this.f106460c = s0VarTrack;
        s0VarTrack.f(this.f106458a);
    }
}
