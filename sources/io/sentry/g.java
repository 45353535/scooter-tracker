package io.sentry;

import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends io.sentry.protocol.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.protocol.c f83503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.protocol.c f83504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.protocol.c f83505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l4 f83506g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83507a;

        static {
            int[] iArr = new int[l4.values().length];
            f83507a = iArr;
            try {
                iArr[l4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83507a[l4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83507a[l4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(io.sentry.protocol.c cVar, io.sentry.protocol.c cVar2, io.sentry.protocol.c cVar3, l4 l4Var) {
        this.f83503d = cVar;
        this.f83504e = cVar2;
        this.f83505f = cVar3;
        this.f83506g = l4Var;
    }

    private io.sentry.protocol.c B() {
        int i10 = a.f83507a[this.f83506g.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f83505f : this.f83503d : this.f83504e : this.f83505f;
    }

    private io.sentry.protocol.c C() {
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        cVar.m(this.f83503d);
        cVar.m(this.f83504e);
        cVar.m(this.f83505f);
        return cVar;
    }

    @Override // io.sentry.protocol.c
    public boolean a(Object obj) {
        return this.f83503d.a(obj) || this.f83504e.a(obj) || this.f83505f.a(obj);
    }

    @Override // io.sentry.protocol.c
    public Set b() {
        return C().b();
    }

    @Override // io.sentry.protocol.c
    public Object c(Object obj) {
        Object objC = this.f83505f.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.f83504e.c(obj);
        return objC2 != null ? objC2 : this.f83503d.c(obj);
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.f83505f.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.f83504e.d();
        return aVarD2 != null ? aVarD2 : this.f83503d.d();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.e e() {
        io.sentry.protocol.e eVarE = this.f83505f.e();
        if (eVarE != null) {
            return eVarE;
        }
        io.sentry.protocol.e eVarE2 = this.f83504e.e();
        return eVarE2 != null ? eVarE2 : this.f83503d.e();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.g f() {
        io.sentry.protocol.g gVarF = this.f83505f.f();
        if (gVarF != null) {
            return gVarF;
        }
        io.sentry.protocol.g gVarF2 = this.f83504e.f();
        return gVarF2 != null ? gVarF2 : this.f83503d.f();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.n h() {
        io.sentry.protocol.n nVarH = this.f83505f.h();
        if (nVarH != null) {
            return nVarH;
        }
        io.sentry.protocol.n nVarH2 = this.f83504e.h();
        return nVarH2 != null ? nVarH2 : this.f83503d.h();
    }

    @Override // io.sentry.protocol.c
    public io.sentry.protocol.z i() {
        io.sentry.protocol.z zVarI = this.f83505f.i();
        if (zVarI != null) {
            return zVarI;
        }
        io.sentry.protocol.z zVarI2 = this.f83504e.i();
        return zVarI2 != null ? zVarI2 : this.f83503d.i();
    }

    @Override // io.sentry.protocol.c
    public p8 j() {
        p8 p8VarJ = this.f83505f.j();
        if (p8VarJ != null) {
            return p8VarJ;
        }
        p8 p8VarJ2 = this.f83504e.j();
        return p8VarJ2 != null ? p8VarJ2 : this.f83503d.j();
    }

    @Override // io.sentry.protocol.c
    public Enumeration k() {
        return C().k();
    }

    @Override // io.sentry.protocol.c
    public Object l(String str, Object obj) {
        return B().l(str, obj);
    }

    @Override // io.sentry.protocol.c
    public void m(io.sentry.protocol.c cVar) {
        B().m(cVar);
    }

    @Override // io.sentry.protocol.c
    public Object n(Object obj) {
        return B().n(obj);
    }

    @Override // io.sentry.protocol.c
    public void o(io.sentry.protocol.a aVar) {
        B().o(aVar);
    }

    @Override // io.sentry.protocol.c
    public void p(io.sentry.protocol.b bVar) {
        B().p(bVar);
    }

    @Override // io.sentry.protocol.c
    public void q(io.sentry.protocol.e eVar) {
        B().q(eVar);
    }

    @Override // io.sentry.protocol.c
    public void r(io.sentry.protocol.g gVar) {
        B().r(gVar);
    }

    @Override // io.sentry.protocol.c, io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        C().serialize(n3Var, iLogger);
    }

    @Override // io.sentry.protocol.c
    public void t(io.sentry.protocol.j jVar) {
        B().t(jVar);
    }

    @Override // io.sentry.protocol.c
    public void u(io.sentry.protocol.n nVar) {
        B().u(nVar);
    }

    @Override // io.sentry.protocol.c
    public void w(io.sentry.protocol.p pVar) {
        B().w(pVar);
    }

    @Override // io.sentry.protocol.c
    public void x(io.sentry.protocol.z zVar) {
        B().x(zVar);
    }

    @Override // io.sentry.protocol.c
    public void y(io.sentry.protocol.f0 f0Var) {
        B().y(f0Var);
    }

    @Override // io.sentry.protocol.c
    public void z(p8 p8Var) {
        B().z(p8Var);
    }
}
