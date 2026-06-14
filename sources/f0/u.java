package f0;

import g0.a;
import java.util.ArrayList;
import java.util.List;
import l0.t;

/* JADX INFO: loaded from: classes5.dex */
public class u implements c, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f69340c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f69341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0.a f69342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0.a f69343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0.a f69344g;

    public u(m0.b bVar, l0.t tVar) {
        this.f69338a = tVar.c();
        this.f69339b = tVar.g();
        this.f69341d = tVar.f();
        g0.d dVarA = tVar.e().a();
        this.f69342e = dVarA;
        g0.d dVarA2 = tVar.b().a();
        this.f69343f = dVarA2;
        g0.d dVarA3 = tVar.d().a();
        this.f69344g = dVarA3;
        bVar.j(dVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        dVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
    }

    void b(a.b bVar) {
        this.f69340c.add(bVar);
    }

    public g0.a e() {
        return this.f69343f;
    }

    @Override // g0.a.b
    public void f() {
        for (int i10 = 0; i10 < this.f69340c.size(); i10++) {
            ((a.b) this.f69340c.get(i10)).f();
        }
    }

    public g0.a i() {
        return this.f69344g;
    }

    public g0.a j() {
        return this.f69342e;
    }

    t.a k() {
        return this.f69341d;
    }

    public boolean l() {
        return this.f69339b;
    }

    @Override // f0.c
    public void g(List list, List list2) {
    }
}
