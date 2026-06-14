package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23619d = 0;

    public x(w wVar) {
        Charset charset = l1.f23521a;
        if (wVar == null) {
            throw new NullPointerException("input");
        }
        this.f23616a = wVar;
        wVar.f23605d = this;
    }

    public static void c(int i10) throws n1 {
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        b(3);
        return c(p2.f23544c.a(cls), h0Var);
    }

    public final void b(int i10) throws m1 {
        if ((this.f23617b & 7) == i10) {
            return;
        }
        int i11 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        b(0);
        return this.f23616a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f23617b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        b(0);
        return this.f23616a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws m1 {
        b(1);
        return this.f23616a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws m1 {
        b(1);
        return this.f23616a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i10;
        if (this.f23616a.c() || (i10 = this.f23617b) == this.f23618c) {
            return false;
        }
        return this.f23616a.e(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        b(0);
        return this.f23616a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws m1 {
        b(5);
        return this.f23616a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        b(0);
        return this.f23616a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws m1 {
        b(5);
        return this.f23616a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() throws m1 {
        b(2);
        return this.f23616a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        b(0);
        return this.f23616a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() throws m1 {
        b(2);
        return this.f23616a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws m1 {
        b(5);
        return this.f23616a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        b(0);
        return this.f23616a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i10 = this.f23619d;
        if (i10 != 0) {
            this.f23617b = i10;
            this.f23619d = 0;
        } else {
            this.f23617b = this.f23616a.t();
        }
        int i11 = this.f23617b;
        if (i11 == 0 || i11 == this.f23618c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws m1 {
        b(1);
        return this.f23616a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f23617b & 7;
            if (i10 == 2) {
                int iU = this.f23616a.u();
                c(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    list.add(Integer.valueOf(this.f23616a.h()));
                } while (this.f23616a.b() < iB);
                return;
            }
            if (i10 != 5) {
                int i11 = n1.f23533a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f23616a.h()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f23617b & 7;
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            c(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                a1Var.c(this.f23616a.h());
            } while (this.f23616a.b() < iB2);
            return;
        }
        if (i12 != 5) {
            int i13 = n1.f23533a;
            throw new m1();
        }
        do {
            a1Var.c(this.f23616a.h());
            if (this.f23616a.c()) {
                return;
            } else {
                iT2 = this.f23616a.t();
            }
        } while (iT2 == this.f23617b);
        this.f23619d = iT2;
    }

    public static void d(int i10) throws n1 {
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f23618c;
        this.f23618c = ((this.f23617b >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f23617b == this.f23618c) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f23618c = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 2) {
                int iU = this.f23616a.u();
                c(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    a1Var.c(this.f23616a.n());
                } while (this.f23616a.b() < iB);
                return;
            }
            if (i10 == 5) {
                do {
                    a1Var.c(this.f23616a.n());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            c(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                list.add(Integer.valueOf(this.f23616a.n()));
            } while (this.f23616a.b() < iB2);
            return;
        }
        if (i12 == 5) {
            do {
                list.add(Integer.valueOf(this.f23616a.n()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f23616a.q());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    u1Var.a(this.f23616a.q());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f23616a.q()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Long.valueOf(this.f23616a.q()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int iT;
        if ((this.f23617b & 7) == 2) {
            do {
                b(2);
                list.add(this.f23616a.e());
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        int i10 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f23616a.u());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    a1Var.c(this.f23616a.u());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f23616a.u()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Integer.valueOf(this.f23616a.u()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i10 = this.f23617b & 7;
            if (i10 == 1) {
                do {
                    d0Var.a(this.f23616a.f());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f23616a.u();
                d(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    d0Var.a(this.f23616a.f());
                } while (this.f23616a.b() < iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 1) {
            do {
                list.add(Double.valueOf(this.f23616a.f()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            d(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                list.add(Double.valueOf(this.f23616a.f()));
            } while (this.f23616a.b() < iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f23616a.l());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    u1Var.a(this.f23616a.l());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f23616a.l()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Long.valueOf(this.f23616a.l()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof j) {
            j jVar = (j) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    jVar.a(this.f23616a.d());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    jVar.a(this.f23616a.d());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Boolean.valueOf(this.f23616a.d()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Boolean.valueOf(this.f23616a.d()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 1) {
                do {
                    u1Var.a(this.f23616a.o());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f23616a.u();
                d(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    u1Var.a(this.f23616a.o());
                } while (this.f23616a.b() < iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.f23616a.o()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            d(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f23616a.o()));
            } while (this.f23616a.b() < iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 1) {
                do {
                    u1Var.a(this.f23616a.i());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f23616a.u();
                d(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    u1Var.a(this.f23616a.i());
                } while (this.f23616a.b() < iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.f23616a.i()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            d(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f23616a.i()));
            } while (this.f23616a.b() < iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f23616a.k());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    a1Var.c(this.f23616a.k());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f23616a.k()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Integer.valueOf(this.f23616a.k()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f23616a.g());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    a1Var.c(this.f23616a.g());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f23616a.g()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Integer.valueOf(this.f23616a.g()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        b(2);
        return d(p2.f23544c.a(cls), h0Var);
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iU = this.f23616a.u();
        w wVar = this.f23616a;
        if (wVar.f23602a < wVar.f23603b) {
            int iD = wVar.d(iU);
            Object objA = t2Var.a();
            this.f23616a.f23602a++;
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            this.f23616a.a(0);
            r5.f23602a--;
            this.f23616a.c(iD);
            return objA;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws m1 {
        b(2);
        return this.f23616a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f23616a.v());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    u1Var.a(this.f23616a.v());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f23616a.v()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Long.valueOf(this.f23616a.v()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        b(0);
        return this.f23616a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f23617b;
        if ((i10 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.f23616a.c() || this.f23619d != 0) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == i10);
            this.f23619d = iT;
            return;
        }
        int i11 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        b(0);
        return this.f23616a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f23617b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f23616a.p());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f23616a.b() + this.f23616a.u();
                do {
                    a1Var.c(this.f23616a.p());
                } while (this.f23616a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f23616a.p()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f23616a.b() + this.f23616a.u();
            do {
                list.add(Integer.valueOf(this.f23616a.p()));
            } while (this.f23616a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i10 = this.f23617b & 7;
            if (i10 == 2) {
                int iU = this.f23616a.u();
                c(iU);
                int iB = this.f23616a.b() + iU;
                do {
                    q0Var.a(this.f23616a.j());
                } while (this.f23616a.b() < iB);
                return;
            }
            if (i10 == 5) {
                do {
                    q0Var.a(this.f23616a.j());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            int i11 = n1.f23533a;
            throw new m1();
        }
        int i12 = this.f23617b & 7;
        if (i12 == 2) {
            int iU2 = this.f23616a.u();
            c(iU2);
            int iB2 = this.f23616a.b() + iU2;
            do {
                list.add(Float.valueOf(this.f23616a.j()));
            } while (this.f23616a.b() < iB2);
            return;
        }
        if (i12 == 5) {
            do {
                list.add(Float.valueOf(this.f23616a.j()));
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        int i13 = n1.f23533a;
        throw new m1();
    }

    public final void a(List list, boolean z10) throws m1 {
        String strR;
        int iT;
        int iT2;
        if ((this.f23617b & 7) == 2) {
            if ((list instanceof q1) && !z10) {
                q1 q1Var = (q1) list;
                do {
                    b(2);
                    q1Var.a(this.f23616a.e());
                    if (this.f23616a.c()) {
                        return;
                    } else {
                        iT2 = this.f23616a.t();
                    }
                } while (iT2 == this.f23617b);
                this.f23619d = iT2;
                return;
            }
            do {
                if (z10) {
                    b(2);
                    strR = this.f23616a.s();
                } else {
                    b(2);
                    strR = this.f23616a.r();
                }
                list.add(strR);
                if (this.f23616a.c()) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == this.f23617b);
            this.f23619d = iT;
            return;
        }
        int i10 = n1.f23533a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f23617b;
        if ((i10 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.f23616a.c() || this.f23619d != 0) {
                    return;
                } else {
                    iT = this.f23616a.t();
                }
            } while (iT == i10);
            this.f23619d = iT;
            return;
        }
        int i11 = n1.f23533a;
        throw new m1();
    }

    public final void a(int i10) throws n1 {
        if (this.f23616a.b() != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
