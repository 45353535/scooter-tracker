package o0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    private static List a(p0.c cVar, float f10, d0.i iVar, n0 n0Var) {
        return u.a(cVar, iVar, f10, n0Var, false);
    }

    private static List b(p0.c cVar, d0.i iVar, n0 n0Var) {
        return u.a(cVar, iVar, 1.0f, n0Var, false);
    }

    static k0.a c(p0.c cVar, d0.i iVar) {
        return new k0.a(b(cVar, iVar, g.f96262a));
    }

    static k0.j d(p0.c cVar, d0.i iVar) {
        return new k0.j(a(cVar, q0.p.e(), iVar, i.f96267a));
    }

    public static k0.b e(p0.c cVar, d0.i iVar) {
        return f(cVar, iVar, true);
    }

    public static k0.b f(p0.c cVar, d0.i iVar, boolean z10) {
        return new k0.b(a(cVar, z10 ? q0.p.e() : 1.0f, iVar, l.f96284a));
    }

    static k0.c g(p0.c cVar, d0.i iVar, int i10) {
        return new k0.c(b(cVar, iVar, new o(i10)));
    }

    static k0.d h(p0.c cVar, d0.i iVar) {
        return new k0.d(b(cVar, iVar, r.f96297a));
    }

    static k0.f i(p0.c cVar, d0.i iVar) {
        return new k0.f(u.a(cVar, iVar, q0.p.e(), b0.f96252a, true));
    }

    static k0.g j(p0.c cVar, d0.i iVar) {
        return new k0.g(b(cVar, iVar, g0.f96263a));
    }

    static k0.h k(p0.c cVar, d0.i iVar) {
        return new k0.h(a(cVar, q0.p.e(), iVar, h0.f96265a));
    }
}
