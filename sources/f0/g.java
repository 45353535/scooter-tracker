package f0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import d0.y;
import g0.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g implements e, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f69234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.b f69235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f69238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0.a f69239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0.a f69240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g0.a f69241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f69242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g0.a f69243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f69244l;

    public g(com.airbnb.lottie.o oVar, m0.b bVar, l0.p pVar) {
        Path path = new Path();
        this.f69233a = path;
        this.f69234b = new e0.a(1);
        this.f69238f = new ArrayList();
        this.f69235c = bVar;
        this.f69236d = pVar.d();
        this.f69237e = pVar.f();
        this.f69242j = oVar;
        if (bVar.x() != null) {
            g0.d dVarA = bVar.x().a().a();
            this.f69243k = dVarA;
            dVarA.a(this);
            bVar.j(this.f69243k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f69239g = null;
            this.f69240h = null;
            return;
        }
        path.setFillType(pVar.c());
        g0.a aVarA = pVar.b().a();
        this.f69239g = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        g0.a aVarA2 = pVar.e().a();
        this.f69240h = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.f68394a) {
            this.f69239g.o(cVar);
            return;
        }
        if (obj == y.f68397d) {
            this.f69240h.o(cVar);
            return;
        }
        if (obj == y.K) {
            g0.a aVar = this.f69241i;
            if (aVar != null) {
                this.f69235c.H(aVar);
            }
            if (cVar == null) {
                this.f69241i = null;
                return;
            }
            g0.q qVar = new g0.q(cVar);
            this.f69241i = qVar;
            qVar.a(this);
            this.f69235c.j(this.f69241i);
            return;
        }
        if (obj == y.f68403j) {
            g0.a aVar2 = this.f69243k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            g0.q qVar2 = new g0.q(cVar);
            this.f69243k = qVar2;
            qVar2.a(this);
            this.f69235c.j(this.f69243k);
        }
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f69233a.reset();
        for (int i10 = 0; i10 < this.f69238f.size(); i10++) {
            this.f69233a.addPath(((m) this.f69238f.get(i10)).getPath(), matrix);
        }
        this.f69233a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // g0.a.b
    public void f() {
        this.f69242j.invalidateSelf();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f69238f.add((m) cVar);
            }
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69236d;
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (this.f69237e) {
            return;
        }
        if (d0.e.h()) {
            d0.e.b("FillContent#draw");
        }
        float fIntValue = ((Integer) this.f69240h.h()).intValue() / 100.0f;
        this.f69234b.setColor((q0.l.c((int) (i10 * fIntValue), 0, 255) << 24) | (((g0.b) this.f69239g).r() & ViewCompat.MEASURED_SIZE_MASK));
        g0.a aVar = this.f69241i;
        if (aVar != null) {
            this.f69234b.setColorFilter((ColorFilter) aVar.h());
        }
        g0.a aVar2 = this.f69243k;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f69234b.setMaskFilter(null);
            } else if (fFloatValue != this.f69244l) {
                this.f69234b.setMaskFilter(this.f69235c.y(fFloatValue));
            }
            this.f69244l = fFloatValue;
        }
        if (dVar != null) {
            dVar.c((int) (fIntValue * 255.0f), this.f69234b);
        } else {
            this.f69234b.clearShadowLayer();
        }
        this.f69233a.reset();
        for (int i11 = 0; i11 < this.f69238f.size(); i11++) {
            this.f69233a.addPath(((m) this.f69238f.get(i11)).getPath(), matrix);
        }
        canvas.drawPath(this.f69233a, this.f69234b);
        if (d0.e.h()) {
            d0.e.c("FillContent#draw");
        }
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
