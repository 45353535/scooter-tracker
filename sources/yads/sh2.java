package yads;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class sh2 implements yi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f115806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h30 f115807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ir f115808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sr f115809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xi0 f115810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile rh2 f115811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f115812g;

    public sh2(rk1 rk1Var, hr hrVar, Executor executor) {
        this.f115806a = (Executor) fi.a(executor);
        fi.a(rk1Var.f115475c);
        h30 h30VarA = new g30().a(rk1Var.f115475c.f113131a).a(rk1Var.f115475c.f113135e).a(4).a();
        this.f115807b = h30VarA;
        ir irVarB = hrVar.b();
        this.f115808c = irVarB;
        this.f115809d = new sr(irVarB, h30VarA, new rr() { // from class: yads.dq0
            @Override // yads.rr
            public final void a(long j10, long j11, long j12) {
                this.f110019a.a(j10, j11, j12);
            }
        });
    }

    public final void a(xi0 xi0Var) {
        this.f115810e = xi0Var;
        this.f115811f = new rh2(this);
        try {
            if (!this.f115812g) {
                this.f115806a.execute(this.f115811f);
                try {
                    rh2 rh2Var = this.f115811f;
                    rh2Var.f117143c.a();
                    if (rh2Var.f117147g) {
                        throw new CancellationException();
                    }
                    if (rh2Var.f117145e != null) {
                        throw new ExecutionException(rh2Var.f117145e);
                    }
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i10 = w83.f117341a;
                    throw cause;
                }
            }
        } finally {
            this.f115811f.f117143c.b();
        }
    }

    public final void a(long j10, long j11, long j12) {
        xi0 xi0Var = this.f115810e;
        if (xi0Var == null) {
            return;
        }
        float f10 = (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10;
        si0 si0Var = (si0) xi0Var;
        si0Var.f115819d.f116657a = j11;
        si0Var.f115819d.f116658b = f10;
        if (j10 != si0Var.f115825j) {
            si0Var.f115825j = j10;
            qi0 qi0Var = si0Var.f115822g;
            if (qi0Var != null) {
                qi0Var.obtainMessage(10, (int) (j10 >> 32), (int) j10, si0Var).sendToTarget();
            }
        }
    }
}
