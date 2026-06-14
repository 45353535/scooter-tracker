package ga;

import android.os.Handler;
import android.os.Looper;
import ga.f0;
import ga.n0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v9.c2;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f72172a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f72173b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0.a f72174c = new n0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u.a f72175d = new u.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f72176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n9.e0 f72177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c2 f72178g;

    @Override // ga.f0
    public final void a(f0.c cVar) {
        q9.a.e(this.f72176e);
        boolean zIsEmpty = this.f72173b.isEmpty();
        this.f72173b.add(cVar);
        if (zIsEmpty) {
            s();
        }
    }

    @Override // ga.f0
    public final void f(Handler handler, n0 n0Var) {
        q9.a.e(handler);
        q9.a.e(n0Var);
        this.f72174c.h(handler, n0Var);
    }

    @Override // ga.f0
    public final void g(f0.c cVar) {
        boolean zIsEmpty = this.f72173b.isEmpty();
        this.f72173b.remove(cVar);
        if (zIsEmpty || !this.f72173b.isEmpty()) {
            return;
        }
        r();
    }

    @Override // ga.f0
    public /* synthetic */ n9.e0 getInitialTimeline() {
        return d0.a(this);
    }

    @Override // ga.f0
    public /* synthetic */ void h(n9.r rVar) {
        d0.c(this, rVar);
    }

    @Override // ga.f0
    public final void i(f0.c cVar) {
        this.f72172a.remove(cVar);
        if (!this.f72172a.isEmpty()) {
            g(cVar);
            return;
        }
        this.f72176e = null;
        this.f72177f = null;
        this.f72178g = null;
        this.f72173b.clear();
        x();
    }

    @Override // ga.f0
    public /* synthetic */ boolean isSingleWindow() {
        return d0.b(this);
    }

    @Override // ga.f0
    public final void j(f0.c cVar, s9.y yVar, c2 c2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f72176e;
        q9.a.a(looper == null || looper == looperMyLooper);
        this.f72178g = c2Var;
        n9.e0 e0Var = this.f72177f;
        this.f72172a.add(cVar);
        if (this.f72176e == null) {
            this.f72176e = looperMyLooper;
            this.f72173b.add(cVar);
            v(yVar);
        } else if (e0Var != null) {
            a(cVar);
            cVar.a(this, e0Var);
        }
    }

    @Override // ga.f0
    public final void k(Handler handler, z9.u uVar) {
        q9.a.e(handler);
        q9.a.e(uVar);
        this.f72175d.g(handler, uVar);
    }

    @Override // ga.f0
    public final void l(z9.u uVar) {
        this.f72175d.n(uVar);
    }

    @Override // ga.f0
    public final void m(n0 n0Var) {
        this.f72174c.x(n0Var);
    }

    protected final u.a n(int i10, f0.b bVar) {
        return this.f72175d.o(i10, bVar);
    }

    protected final u.a o(f0.b bVar) {
        return this.f72175d.o(0, bVar);
    }

    protected final n0.a p(int i10, f0.b bVar) {
        return this.f72174c.A(i10, bVar);
    }

    protected final n0.a q(f0.b bVar) {
        return this.f72174c.A(0, bVar);
    }

    protected final c2 t() {
        return (c2) q9.a.i(this.f72178g);
    }

    protected final boolean u() {
        return !this.f72173b.isEmpty();
    }

    protected abstract void v(s9.y yVar);

    protected final void w(n9.e0 e0Var) {
        this.f72177f = e0Var;
        Iterator it = this.f72172a.iterator();
        while (it.hasNext()) {
            ((f0.c) it.next()).a(this, e0Var);
        }
    }

    protected abstract void x();

    protected void r() {
    }

    protected void s() {
    }
}
