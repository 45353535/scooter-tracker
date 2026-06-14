package f0;

import android.graphics.Path;
import d0.y;
import g0.a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r implements m, a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f69328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.o f69329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0.m f69330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69331f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69326a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f69332g = new b();

    public r(com.airbnb.lottie.o oVar, m0.b bVar, l0.r rVar) {
        this.f69327b = rVar.b();
        this.f69328c = rVar.d();
        this.f69329d = oVar;
        g0.m mVarA = rVar.c().a();
        this.f69330e = mVarA;
        bVar.j(mVarA);
        mVarA.a(this);
    }

    private void e() {
        this.f69331f = false;
        this.f69329d.invalidateSelf();
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.P) {
            this.f69330e.o(cVar);
        }
    }

    @Override // g0.a.b
    public void f() {
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // f0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L3c
            java.lang.Object r1 = r6.get(r0)
            f0.c r1 = (f0.c) r1
            boolean r2 = r1 instanceof f0.u
            if (r2 == 0) goto L26
            r2 = r1
            f0.u r2 = (f0.u) r2
            l0.t$a r3 = r2.k()
            l0.t$a r4 = l0.t.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            f0.b r1 = r5.f69332g
            r1.a(r2)
            r2.b(r5)
            goto L39
        L26:
            boolean r2 = r1 instanceof f0.s
            if (r2 == 0) goto L39
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            f0.s r1 = (f0.s) r1
            r1.c(r5)
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            g0.m r6 = r5.f69330e
            r6.s(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.r.g(java.util.List, java.util.List):void");
    }

    @Override // f0.c
    public String getName() {
        return this.f69327b;
    }

    @Override // f0.m
    public Path getPath() {
        if (this.f69331f && !this.f69330e.k()) {
            return this.f69326a;
        }
        this.f69326a.reset();
        if (this.f69328c) {
            this.f69331f = true;
            return this.f69326a;
        }
        Path path = (Path) this.f69330e.h();
        if (path == null) {
            return this.f69326a;
        }
        this.f69326a.set(path);
        this.f69326a.setFillType(Path.FillType.EVEN_ODD);
        this.f69332g.b(this.f69326a);
        this.f69331f = true;
        return this.f69326a;
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
