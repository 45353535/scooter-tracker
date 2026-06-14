package yads;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class st0 implements ne3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f115928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t42 f115929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m42 f115930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f115931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m30 f115932e;

    public st0(v5 v5Var, t42 t42Var, m42 m42Var, Iterator it, m30 m30Var) {
        this.f115928a = v5Var;
        this.f115929b = t42Var;
        this.f115930c = m42Var;
        this.f115931d = it;
        this.f115932e = m30Var;
    }

    @Override // yads.ne3
    public final void a() {
        if (this.f115931d.hasNext()) {
            Pair pair = (Pair) this.f115931d.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            v5 v5Var = this.f115928a;
            t42 t42Var = this.f115929b;
            m42 m42Var = this.f115930c;
            m42Var.a(str, new st0(v5Var, t42Var, m42Var, this.f115931d, this.f115932e), str2);
        }
    }

    @Override // yads.ne3
    public final void b() {
        this.f115932e.a(l30.f112936f);
    }

    @Override // yads.ne3
    public final void c() {
        a();
    }
}
