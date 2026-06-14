package m0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import d0.v;
import d0.y;
import g0.q;
import q0.o;
import q0.p;

/* JADX INFO: loaded from: classes5.dex */
public class d extends b {
    private final Paint E;
    private final Rect F;
    private final Rect G;
    private final RectF H;
    private final v I;
    private g0.a J;
    private g0.a K;
    private g0.c L;
    private o M;
    private o.a N;

    d(com.airbnb.lottie.o oVar, e eVar) {
        super(oVar, eVar);
        this.E = new e0.a(3);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.I = oVar.O(eVar.n());
        if (z() != null) {
            this.L = new g0.c(this, this, z());
        }
    }

    private Bitmap P() {
        Bitmap bitmap;
        g0.a aVar = this.K;
        if (aVar != null && (bitmap = (Bitmap) aVar.h()) != null) {
            return bitmap;
        }
        Bitmap bitmapF = this.f94334p.F(this.f94335q.n());
        if (bitmapF != null) {
            return bitmapF;
        }
        v vVar = this.I;
        if (vVar != null) {
            return vVar.b();
        }
        return null;
    }

    @Override // m0.b, j0.f
    public void b(Object obj, r0.c cVar) {
        g0.c cVar2;
        g0.c cVar3;
        g0.c cVar4;
        g0.c cVar5;
        g0.c cVar6;
        super.b(obj, cVar);
        if (obj == y.K) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new q(cVar);
                return;
            }
        }
        if (obj == y.N) {
            if (cVar == null) {
                this.K = null;
                return;
            } else {
                this.K = new q(cVar);
                return;
            }
        }
        if (obj == y.f68398e && (cVar6 = this.L) != null) {
            cVar6.b(cVar);
            return;
        }
        if (obj == y.G && (cVar5 = this.L) != null) {
            cVar5.e(cVar);
            return;
        }
        if (obj == y.H && (cVar4 = this.L) != null) {
            cVar4.c(cVar);
            return;
        }
        if (obj == y.I && (cVar3 = this.L) != null) {
            cVar3.d(cVar);
        } else {
            if (obj != y.J || (cVar2 = this.L) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // m0.b, f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapP;
        super.d(rectF, matrix, z10);
        if (this.I != null) {
            float fE = p.e();
            if (this.f94334p.P() || (bitmapP = P()) == null) {
                rectF.set(0.0f, 0.0f, this.I.f() * fE, this.I.d() * fE);
            } else {
                rectF.set(0.0f, 0.0f, bitmapP.getWidth() * fE, bitmapP.getHeight() * fE);
            }
            this.f94333o.mapRect(rectF);
        }
    }

    @Override // m0.b
    public void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        Bitmap bitmapP = P();
        if (bitmapP == null || bitmapP.isRecycled() || this.I == null) {
            return;
        }
        float fE = p.e();
        this.E.setAlpha(i10);
        g0.a aVar = this.J;
        if (aVar != null) {
            this.E.setColorFilter((ColorFilter) aVar.h());
        }
        g0.c cVar = this.L;
        if (cVar != null) {
            dVar = cVar.a(matrix, i10);
        }
        this.F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
        if (this.f94334p.P()) {
            this.G.set(0, 0, (int) (this.I.f() * fE), (int) (this.I.d() * fE));
        } else {
            this.G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
        }
        boolean z10 = dVar != null;
        if (z10) {
            if (this.M == null) {
                this.M = new o();
            }
            if (this.N == null) {
                this.N = new o.a();
            }
            this.N.f();
            dVar.d(i10, this.N);
            RectF rectF = this.H;
            Rect rect = this.G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.H);
            canvas = this.M.j(canvas, this.H, this.N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapP, this.F, this.G, this.E);
        if (z10) {
            this.M.e();
            if (this.M.f()) {
                return;
            }
        }
        canvas.restore();
    }
}
