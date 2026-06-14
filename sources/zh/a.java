package zh;

import java.util.Queue;
import org.slf4j.helpers.j;
import yh.g;

/* JADX INFO: loaded from: classes4.dex */
public class a extends org.slf4j.helpers.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f119514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f119515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Queue f119516d;

    public a(j jVar, Queue queue) {
        this.f119515c = jVar;
        this.f119514b = jVar.c();
        this.f119516d = queue;
    }

    @Override // yh.d
    public boolean d() {
        return true;
    }

    @Override // yh.d
    public boolean g() {
        return true;
    }

    @Override // yh.d
    public boolean j() {
        return true;
    }

    @Override // yh.d
    public boolean k() {
        return true;
    }

    @Override // yh.d
    public boolean l() {
        return true;
    }

    @Override // org.slf4j.helpers.a
    public String o() {
        return this.f119514b;
    }

    @Override // org.slf4j.helpers.a
    protected void q(b bVar, g gVar, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.k(System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.f119515c);
        dVar.g(this.f119514b);
        if (gVar != null) {
            dVar.a(gVar);
        }
        dVar.h(str);
        dVar.i(Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th2);
        this.f119516d.add(dVar);
    }
}
