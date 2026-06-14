package f0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import d0.y;
import g0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
public class p implements e, m, j, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f69312a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f69313b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f69314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.b f69315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0.a f69318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0.a f69319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0.p f69320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f69321j;

    public p(com.airbnb.lottie.o oVar, m0.b bVar, l0.m mVar) {
        this.f69314c = oVar;
        this.f69315d = bVar;
        this.f69316e = mVar.c();
        this.f69317f = mVar.f();
        g0.d dVarA = mVar.b().a();
        this.f69318g = dVarA;
        bVar.j(dVarA);
        dVarA.a(this);
        g0.d dVarA2 = mVar.d().a();
        this.f69319h = dVarA2;
        bVar.j(dVarA2);
        dVarA2.a(this);
        g0.p pVarB = mVar.e().b();
        this.f69320i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (this.f69320i.c(obj, cVar)) {
            return;
        }
        if (obj == y.f68414u) {
            this.f69318g.o(cVar);
        } else if (obj == y.f68415v) {
            this.f69319h.o(cVar);
        }
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f69321j.d(rectF, matrix, z10);
    }

    @Override // f0.j
    public void e(ListIterator listIterator) {
        if (this.f69321j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f69321j = new d(this.f69314c, this.f69315d, "Repeater", this.f69317f, arrayList, null);
    }

    @Override // g0.a.b
    public void f() {
        this.f69314c.invalidateSelf();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        this.f69321j.g(list, list2);
    }

    @Override // f0.c
    public String getName() {
        return this.f69316e;
    }

    @Override // f0.m
    public Path getPath() {
        Path path = this.f69321j.getPath();
        this.f69313b.reset();
        float fFloatValue = ((Float) this.f69318g.h()).floatValue();
        float fFloatValue2 = ((Float) this.f69319h.h()).floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f69312a.set(this.f69320i.g(i10 + fFloatValue2));
            this.f69313b.addPath(path, this.f69312a);
        }
        return this.f69313b;
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        float fFloatValue = ((Float) this.f69318g.h()).floatValue();
        float fFloatValue2 = ((Float) this.f69319h.h()).floatValue();
        float fFloatValue3 = ((Float) this.f69320i.i().h()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) this.f69320i.e().h()).floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f69312a.set(matrix);
            float f10 = i11;
            this.f69312a.preConcat(this.f69320i.g(f10 + fFloatValue2));
            this.f69321j.h(canvas, this.f69312a, (int) (i10 * q0.l.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), dVar);
        }
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f69321j.k().size(); i11++) {
            c cVar = (c) this.f69321j.k().get(i11);
            if (cVar instanceof k) {
                q0.l.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }
}
