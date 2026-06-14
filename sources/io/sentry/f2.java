package io.sentry;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements d0, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a8 f83487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x6 f83488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile l0 f83489e = null;

    public f2(v7 v7Var) {
        v7 v7Var2 = (v7) io.sentry.util.w.c(v7Var, "The SentryOptions is required.");
        this.f83486b = v7Var2;
        z7 z7Var = new z7(v7Var2);
        this.f83488d = new x6(z7Var);
        this.f83487c = new a8(z7Var, v7Var2);
    }

    private void M(w6 w6Var) {
        Map mapA = this.f83486b.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map mapV0 = w6Var.v0();
        if (mapV0 == null) {
            w6Var.G0(mapA);
        } else {
            mapV0.putAll(mapA);
        }
    }

    private void R(n5 n5Var) {
        if (n5Var.I() == null) {
            n5Var.a0("java");
        }
    }

    private void U(n5 n5Var) {
        if (n5Var.J() == null) {
            n5Var.b0(this.f83486b.getRelease());
        }
    }

    private void V(n5 n5Var) {
        if (n5Var.L() == null) {
            n5Var.d0(this.f83486b.getSdkVersion());
        }
    }

    private void W(n5 n5Var) {
        if (n5Var.M() == null) {
            n5Var.e0(this.f83486b.getServerName());
        }
        if (this.f83486b.isAttachServerName() && n5Var.M() == null) {
            m();
            if (this.f83489e != null) {
                n5Var.e0(this.f83489e.d());
            }
        }
    }

    private void b0(n5 n5Var) {
        if (n5Var.N() == null) {
            n5Var.g0(new HashMap(this.f83486b.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f83486b.getTags().entrySet()) {
            if (!n5Var.N().containsKey(entry.getKey())) {
                n5Var.f0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void e0(w6 w6Var, i0 i0Var) {
        if (w6Var.w0() == null) {
            List<io.sentry.protocol.s> listR0 = w6Var.r0();
            ArrayList arrayList = null;
            if (listR0 != null && !listR0.isEmpty()) {
                for (io.sentry.protocol.s sVar : listR0) {
                    if (sVar.g() != null && sVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sVar.j());
                    }
                }
            }
            if (this.f83486b.isAttachThreads() || io.sentry.util.m.h(i0Var, io.sentry.hints.a.class)) {
                Object objG = io.sentry.util.m.g(i0Var);
                w6Var.H0(this.f83487c.b(arrayList, objG instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objG).c() : false));
            } else if (this.f83486b.isAttachStacktrace()) {
                if ((listR0 == null || listR0.isEmpty()) && !n(i0Var)) {
                    w6Var.H0(this.f83487c.a());
                }
            }
        }
    }

    private boolean i0(n5 n5Var, i0 i0Var) {
        if (io.sentry.util.m.q(i0Var)) {
            return true;
        }
        this.f83486b.getLogger().c(g7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", n5Var.G());
        return false;
    }

    private void m() {
        if (this.f83489e == null) {
            this.f83489e = l0.e();
        }
    }

    private boolean n(i0 i0Var) {
        return io.sentry.util.m.h(i0Var, io.sentry.hints.e.class);
    }

    private void o(n5 n5Var) {
        io.sentry.protocol.i0 i0VarQ = n5Var.Q();
        if (i0VarQ == null) {
            i0VarQ = new io.sentry.protocol.i0();
            n5Var.h0(i0VarQ);
        }
        if (i0VarQ.i() == null && this.f83486b.isSendDefaultPii()) {
            i0VarQ.k("{{auto}}");
        }
    }

    private void p(n5 n5Var) {
        U(n5Var);
        y(n5Var);
        W(n5Var);
        w(n5Var);
        V(n5Var);
        b0(n5Var);
        o(n5Var);
    }

    private void q(n5 n5Var) {
        R(n5Var);
    }

    private void s(n5 n5Var) {
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(n5Var.D(), this.f83486b);
        if (dVarC != null) {
            n5Var.U(dVarC);
        }
    }

    private void w(n5 n5Var) {
        if (n5Var.E() == null) {
            n5Var.V(this.f83486b.getDist());
        }
    }

    private void y(n5 n5Var) {
        if (n5Var.F() == null) {
            n5Var.W(this.f83486b.getEnvironment());
        }
    }

    private void z(w6 w6Var) {
        Throwable thP = w6Var.P();
        if (thP != null) {
            w6Var.C0(this.f83488d.d(thP));
        }
    }

    @Override // io.sentry.d0
    public w7 c(w7 w7Var, i0 i0Var) {
        q(w7Var);
        if (i0(w7Var, i0Var)) {
            p(w7Var);
            io.sentry.protocol.r rVarJ = this.f83486b.getSessionReplay().j();
            if (rVarJ != null) {
                w7Var.d0(rVarJ);
            }
        }
        return w7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f83489e != null) {
            this.f83489e.c();
        }
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, i0 i0Var) {
        q(w6Var);
        z(w6Var);
        s(w6Var);
        M(w6Var);
        if (i0(w6Var, i0Var)) {
            p(w6Var);
            e0(w6Var, i0Var);
        }
        return w6Var;
    }

    @Override // io.sentry.d0
    public io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, i0 i0Var) {
        q(e0Var);
        s(e0Var);
        if (i0(e0Var, i0Var)) {
            p(e0Var);
        }
        return e0Var;
    }
}
