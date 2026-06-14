package m0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import d0.y;
import java.util.Collections;
import java.util.List;
import l0.q;

/* JADX INFO: loaded from: classes5.dex */
public class g extends b {
    private final f0.d E;
    private final c F;
    private g0.c G;

    g(o oVar, e eVar, c cVar, d0.i iVar) {
        super(oVar, eVar);
        this.F = cVar;
        f0.d dVar = new f0.d(oVar, this, new q("__container", eVar.o(), false), iVar);
        this.E = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.g(list, list);
        if (z() != null) {
            this.G = new g0.c(this, this, z());
        }
    }

    @Override // m0.b
    protected void I(j0.e eVar, int i10, List list, j0.e eVar2) {
        this.E.i(eVar, i10, list, eVar2);
    }

    @Override // m0.b, j0.f
    public void b(Object obj, r0.c cVar) {
        g0.c cVar2;
        g0.c cVar3;
        g0.c cVar4;
        g0.c cVar5;
        g0.c cVar6;
        super.b(obj, cVar);
        if (obj == y.f68398e && (cVar6 = this.G) != null) {
            cVar6.b(cVar);
            return;
        }
        if (obj == y.G && (cVar5 = this.G) != null) {
            cVar5.e(cVar);
            return;
        }
        if (obj == y.H && (cVar4 = this.G) != null) {
            cVar4.c(cVar);
            return;
        }
        if (obj == y.I && (cVar3 = this.G) != null) {
            cVar3.d(cVar);
        } else {
            if (obj != y.J || (cVar2 = this.G) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // m0.b, f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.E.d(rectF, this.f94333o, z10);
    }

    @Override // m0.b
    void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        g0.c cVar = this.G;
        if (cVar != null) {
            dVar = cVar.a(matrix, i10);
        }
        this.E.h(canvas, matrix, i10, dVar);
    }

    @Override // m0.b
    public l0.a x() {
        l0.a aVarX = super.x();
        return aVarX != null ? aVarX : this.F.x();
    }
}
