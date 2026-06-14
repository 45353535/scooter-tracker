package ga;

import android.os.Handler;
import ga.f0;
import ga.n0;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h extends ga.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f72318h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f72319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s9.y f72320j;

    private final class a implements n0, z9.u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f72321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n0.a f72322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u.a f72323d;

        public a(Object obj) {
            this.f72322c = h.this.q(null);
            this.f72323d = h.this.o(null);
            this.f72321b = obj;
        }

        private boolean a(int i10, f0.b bVar) {
            f0.b bVarZ;
            if (bVar != null) {
                bVarZ = h.this.z(this.f72321b, bVar);
                if (bVarZ == null) {
                    return false;
                }
            } else {
                bVarZ = null;
            }
            int iB = h.this.B(this.f72321b, i10);
            n0.a aVar = this.f72322c;
            if (aVar.f72385a != iB || !Objects.equals(aVar.f72386b, bVarZ)) {
                this.f72322c = h.this.p(iB, bVarZ);
            }
            u.a aVar2 = this.f72323d;
            if (aVar2.f119317a == iB && Objects.equals(aVar2.f119318b, bVarZ)) {
                return true;
            }
            this.f72323d = h.this.n(iB, bVarZ);
            return true;
        }

        private b0 f(b0 b0Var, f0.b bVar) {
            long jA = h.this.A(this.f72321b, b0Var.f72196f, bVar);
            long jA2 = h.this.A(this.f72321b, b0Var.f72197g, bVar);
            return (jA == b0Var.f72196f && jA2 == b0Var.f72197g) ? b0Var : new b0(b0Var.f72191a, b0Var.f72192b, b0Var.f72193c, b0Var.f72194d, b0Var.f72195e, jA, jA2);
        }

        @Override // ga.n0
        public void B(int i10, f0.b bVar, b0 b0Var) {
            if (a(i10, bVar)) {
                this.f72322c.z(f(b0Var, bVar));
            }
        }

        @Override // ga.n0
        public void E(int i10, f0.b bVar, y yVar, b0 b0Var) {
            if (a(i10, bVar)) {
                this.f72322c.n(yVar, f(b0Var, bVar));
            }
        }

        @Override // z9.u
        public void G(int i10, f0.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f72323d.k(i11);
            }
        }

        @Override // ga.n0
        public void I(int i10, f0.b bVar, y yVar, b0 b0Var, int i11) {
            if (a(i10, bVar)) {
                this.f72322c.w(yVar, f(b0Var, bVar), i11);
            }
        }

        @Override // z9.u
        public void J(int i10, f0.b bVar) {
            if (a(i10, bVar)) {
                this.f72323d.i();
            }
        }

        @Override // ga.n0
        public void K(int i10, f0.b bVar, b0 b0Var) {
            if (a(i10, bVar)) {
                this.f72322c.k(f(b0Var, bVar));
            }
        }

        @Override // z9.u
        public void L(int i10, f0.b bVar) {
            if (a(i10, bVar)) {
                this.f72323d.m();
            }
        }

        @Override // ga.n0
        public void p(int i10, f0.b bVar, y yVar, b0 b0Var, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f72322c.t(yVar, f(b0Var, bVar), iOException, z10);
            }
        }

        @Override // ga.n0
        public void s(int i10, f0.b bVar, y yVar, b0 b0Var) {
            if (a(i10, bVar)) {
                this.f72322c.q(yVar, f(b0Var, bVar));
            }
        }

        @Override // z9.u
        public void v(int i10, f0.b bVar) {
            if (a(i10, bVar)) {
                this.f72323d.j();
            }
        }

        @Override // z9.u
        public void w(int i10, f0.b bVar) {
            if (a(i10, bVar)) {
                this.f72323d.h();
            }
        }

        @Override // z9.u
        public void z(int i10, f0.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f72323d.l(exc);
            }
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f72325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.c f72326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f72327c;

        public b(f0 f0Var, f0.c cVar, a aVar) {
            this.f72325a = f0Var;
            this.f72326b = cVar;
            this.f72327c = aVar;
        }
    }

    protected h() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void C(Object obj, f0 f0Var, n9.e0 e0Var);

    protected final void D(final Object obj, f0 f0Var) {
        q9.a.a(!this.f72318h.containsKey(obj));
        f0.c cVar = new f0.c() { // from class: ga.g
            @Override // ga.f0.c
            public final void a(f0 f0Var2, n9.e0 e0Var) {
                this.f72290a.C(obj, f0Var2, e0Var);
            }
        };
        a aVar = new a(obj);
        this.f72318h.put(obj, new b(f0Var, cVar, aVar));
        f0Var.f((Handler) q9.a.e(this.f72319i), aVar);
        f0Var.k((Handler) q9.a.e(this.f72319i), aVar);
        f0Var.j(cVar, this.f72320j, t());
        if (u()) {
            return;
        }
        f0Var.g(cVar);
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.f72318h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f72325a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // ga.a
    protected void r() {
        for (b bVar : this.f72318h.values()) {
            bVar.f72325a.g(bVar.f72326b);
        }
    }

    @Override // ga.a
    protected void s() {
        for (b bVar : this.f72318h.values()) {
            bVar.f72325a.a(bVar.f72326b);
        }
    }

    @Override // ga.a
    protected void v(s9.y yVar) {
        this.f72320j = yVar;
        this.f72319i = q9.o0.A();
    }

    @Override // ga.a
    protected void x() {
        for (b bVar : this.f72318h.values()) {
            bVar.f72325a.i(bVar.f72326b);
            bVar.f72325a.m(bVar.f72327c);
            bVar.f72325a.l(bVar.f72327c);
        }
        this.f72318h.clear();
    }

    protected abstract f0.b z(Object obj, f0.b bVar);

    protected int B(Object obj, int i10) {
        return i10;
    }

    protected long A(Object obj, long j10, f0.b bVar) {
        return j10;
    }
}
