package vb;

import io.bidmachine.media3.common.a;
import java.util.List;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f106271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f106273c;

    public n0(List list, String str) {
        this.f106271a = list;
        this.f106272b = str;
        this.f106273c = new s0[list.size()];
    }

    public void a(long j10, q9.d0 d0Var) {
        if (d0Var.a() < 9) {
            return;
        }
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        int iH = d0Var.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            oa.g.b(j10, d0Var, this.f106273c);
        }
    }

    public void b(oa.t tVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f106273c.length; i10++) {
            dVar.a();
            s0 s0VarTrack = tVar.track(dVar.c(), 3);
            io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) this.f106271a.get(i10);
            String str = aVar.f80561o;
            q9.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            s0VarTrack.f(new a.b().f0(dVar.b()).U(this.f106272b).u0(str).w0(aVar.f80551e).j0(aVar.f80550d).O(aVar.J).g0(aVar.f80564r).N());
            this.f106273c[i10] = s0VarTrack;
        }
    }
}
