package vb;

import io.bidmachine.media3.common.a;
import java.util.List;
import oa.s0;
import r9.i;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f106126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s0[] f106128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r9.i f106129d = new r9.i(new i.b() { // from class: vb.f0
        @Override // r9.i.b
        public final void a(long j10, q9.d0 d0Var) {
            oa.g.a(j10, d0Var, this.f106125a.f106128c);
        }
    });

    public g0(List list, String str) {
        this.f106126a = list;
        this.f106127b = str;
        this.f106128c = new s0[list.size()];
    }

    public void b() {
        this.f106129d.d();
    }

    public void c(long j10, q9.d0 d0Var) {
        this.f106129d.a(j10, d0Var);
    }

    public void d(oa.t tVar, l0.d dVar) {
        for (int i10 = 0; i10 < this.f106128c.length; i10++) {
            dVar.a();
            s0 s0VarTrack = tVar.track(dVar.c(), 3);
            io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) this.f106126a.get(i10);
            String str = aVar.f80561o;
            q9.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = aVar.f80547a;
            if (strB == null) {
                strB = dVar.b();
            }
            s0VarTrack.f(new a.b().f0(strB).U(this.f106127b).u0(str).w0(aVar.f80551e).j0(aVar.f80550d).O(aVar.J).g0(aVar.f80564r).N());
            this.f106128c[i10] = s0VarTrack;
        }
    }

    public void e() {
        this.f106129d.d();
    }

    public void f(int i10) {
        this.f106129d.g(i10);
    }
}
