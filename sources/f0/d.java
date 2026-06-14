package f0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g0.a;
import java.util.ArrayList;
import java.util.List;
import q0.o;

/* JADX INFO: loaded from: classes5.dex */
public class d implements e, m, a.b, j0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.a f69213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f69214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0.o f69215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f69216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f69217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f69218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f69219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f69220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f69221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f69222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f69223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g0.p f69224l;

    public d(com.airbnb.lottie.o oVar, m0.b bVar, l0.q qVar, d0.i iVar) {
        this(oVar, bVar, qVar.c(), qVar.d(), e(oVar, iVar, bVar, qVar.b()), j(qVar.b()));
    }

    private static List e(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = ((l0.c) list.get(i10)).a(oVar, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static k0.n j(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            l0.c cVar = (l0.c) list.get(i10);
            if (cVar instanceof k0.n) {
                return (k0.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f69221i.size(); i11++) {
            if ((this.f69221i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        g0.p pVar = this.f69224l;
        if (pVar != null) {
            pVar.c(obj, cVar);
        }
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f69216d.set(matrix);
        g0.p pVar = this.f69224l;
        if (pVar != null) {
            this.f69216d.preConcat(pVar.f());
        }
        this.f69218f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f69221i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f69221i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(this.f69218f, this.f69216d, z10);
                rectF.union(this.f69218f);
            }
        }
    }

    @Override // g0.a.b
    public void f() {
        this.f69222j.invalidateSelf();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f69221i.size());
        arrayList.addAll(list);
        for (int size = this.f69221i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f69221i.get(size);
            cVar.g(arrayList, this.f69221i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69219g;
    }

    @Override // f0.m
    public Path getPath() {
        this.f69216d.reset();
        g0.p pVar = this.f69224l;
        if (pVar != null) {
            this.f69216d.set(pVar.f());
        }
        this.f69217e.reset();
        if (this.f69220h) {
            return this.f69217e;
        }
        for (int size = this.f69221i.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f69221i.get(size);
            if (cVar instanceof m) {
                this.f69217e.addPath(((m) cVar).getPath(), this.f69216d);
            }
        }
        return this.f69217e;
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (this.f69220h) {
            return;
        }
        this.f69216d.set(matrix);
        g0.p pVar = this.f69224l;
        if (pVar != null) {
            this.f69216d.preConcat(pVar.f());
            i10 = (int) (((((this.f69224l.h() == null ? 100 : ((Integer) this.f69224l.h().h()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f69222j.e0() && n() && i10 != 255) || (dVar != null && this.f69222j.f0() && n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.f69214b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.f69214b, matrix, true);
            o.a aVar = this.f69213a;
            aVar.f98660a = i10;
            if (dVar != null) {
                dVar.b(aVar);
                dVar = null;
            } else {
                aVar.f98663d = null;
            }
            canvas = this.f69215c.j(canvas, this.f69214b, this.f69213a);
        } else if (dVar != null) {
            q0.d dVar2 = new q0.d(dVar);
            dVar2.i(i11);
            dVar = dVar2;
        }
        for (int size = this.f69221i.size() - 1; size >= 0; size--) {
            Object obj = this.f69221i.get(size);
            if (obj instanceof e) {
                ((e) obj).h(canvas, this.f69216d, i11, dVar);
            }
        }
        if (z10) {
            this.f69215c.e();
        }
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f69221i.size(); i11++) {
                    c cVar = (c) this.f69221i.get(i11);
                    if (cVar instanceof j0.f) {
                        ((j0.f) cVar).i(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    public List k() {
        return this.f69221i;
    }

    List l() {
        if (this.f69223k == null) {
            this.f69223k = new ArrayList();
            for (int i10 = 0; i10 < this.f69221i.size(); i10++) {
                c cVar = (c) this.f69221i.get(i10);
                if (cVar instanceof m) {
                    this.f69223k.add((m) cVar);
                }
            }
        }
        return this.f69223k;
    }

    Matrix m() {
        g0.p pVar = this.f69224l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f69216d.reset();
        return this.f69216d;
    }

    d(com.airbnb.lottie.o oVar, m0.b bVar, String str, boolean z10, List list, k0.n nVar) {
        this.f69213a = new o.a();
        this.f69214b = new RectF();
        this.f69215c = new q0.o();
        this.f69216d = new Matrix();
        this.f69217e = new Path();
        this.f69218f = new RectF();
        this.f69219g = str;
        this.f69222j = oVar;
        this.f69220h = z10;
        this.f69221i = list;
        if (nVar != null) {
            g0.p pVarB = nVar.b();
            this.f69224l = pVarB;
            pVarB.a(bVar);
            this.f69224l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).e(list.listIterator(list.size()));
        }
    }
}
