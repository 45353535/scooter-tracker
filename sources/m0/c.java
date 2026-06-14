package m0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import d0.y;
import g0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.e;
import q0.o;

/* JADX INFO: loaded from: classes5.dex */
public class c extends b {
    private g0.a E;
    private final List F;
    private final RectF G;
    private final RectF H;
    private final RectF I;
    private final o J;
    private final o.a K;
    private float L;
    private boolean M;
    private g0.c N;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94347a;

        static {
            int[] iArr = new int[e.b.values().length];
            f94347a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94347a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(com.airbnb.lottie.o oVar, e eVar, List list, d0.i iVar) {
        int i10;
        b bVar;
        super(oVar, eVar);
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new o();
        this.K = new o.a();
        this.M = true;
        k0.b bVarV = eVar.v();
        if (bVarV != null) {
            g0.d dVarA = bVarV.a();
            this.E = dVarA;
            j(dVarA);
            this.E.a(this);
        } else {
            this.E = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = (e) list.get(size);
            b bVarV2 = b.v(this, eVar2, oVar, iVar);
            if (bVarV2 != null) {
                longSparseArray.put(bVarV2.A().e(), bVarV2);
                if (bVar2 != null) {
                    bVar2.J(bVarV2);
                    bVar2 = null;
                } else {
                    this.F.add(0, bVarV2);
                    int i11 = a.f94347a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = bVarV2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i10));
            if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.A().k())) != null) {
                bVar3.L(bVar);
            }
        }
        if (z() != null) {
            this.N = new g0.c(this, this, z());
        }
    }

    @Override // m0.b
    protected void I(j0.e eVar, int i10, List list, j0.e eVar2) {
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            ((b) this.F.get(i11)).i(eVar, i10, list, eVar2);
        }
    }

    @Override // m0.b
    public void K(boolean z10) {
        super.K(z10);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((b) it.next()).K(z10);
        }
    }

    @Override // m0.b
    public void M(float f10) {
        if (d0.e.h()) {
            d0.e.b("CompositionLayer#setProgress");
        }
        this.L = f10;
        super.M(f10);
        if (this.E != null) {
            f10 = ((((Float) this.E.h()).floatValue() * this.f94335q.c().i()) - this.f94335q.c().p()) / (this.f94334p.I().e() + 0.01f);
        }
        if (this.E == null) {
            f10 -= this.f94335q.s();
        }
        if (this.f94335q.w() != 0.0f && !"__container".equals(this.f94335q.j())) {
            f10 /= this.f94335q.w();
        }
        for (int size = this.F.size() - 1; size >= 0; size--) {
            ((b) this.F.get(size)).M(f10);
        }
        if (d0.e.h()) {
            d0.e.c("CompositionLayer#setProgress");
        }
    }

    public float P() {
        return this.L;
    }

    public void Q(boolean z10) {
        this.M = z10;
    }

    @Override // m0.b, j0.f
    public void b(Object obj, r0.c cVar) {
        g0.c cVar2;
        g0.c cVar3;
        g0.c cVar4;
        g0.c cVar5;
        g0.c cVar6;
        super.b(obj, cVar);
        if (obj == y.E) {
            if (cVar == null) {
                g0.a aVar = this.E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.E = qVar;
            qVar.a(this);
            j(this.E);
            return;
        }
        if (obj == y.f68398e && (cVar6 = this.N) != null) {
            cVar6.b(cVar);
            return;
        }
        if (obj == y.G && (cVar5 = this.N) != null) {
            cVar5.e(cVar);
            return;
        }
        if (obj == y.H && (cVar4 = this.N) != null) {
            cVar4.c(cVar);
            return;
        }
        if (obj == y.I && (cVar3 = this.N) != null) {
            cVar3.d(cVar);
        } else {
            if (obj != y.J || (cVar2 = this.N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // m0.b, f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.G.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.F.get(size)).d(this.G, this.f94333o, true);
            rectF.union(this.G);
        }
    }

    @Override // m0.b
    void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        Canvas canvasJ;
        if (d0.e.h()) {
            d0.e.b("CompositionLayer#draw");
        }
        boolean z10 = false;
        boolean z11 = (dVar == null && this.N == null) ? false : true;
        if ((this.f94334p.e0() && this.F.size() > 1 && i10 != 255) || (z11 && this.f94334p.f0())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        g0.c cVar = this.N;
        if (cVar != null) {
            dVar = cVar.a(matrix, i11);
        }
        if (this.M || !"__container".equals(this.f94335q.j())) {
            this.H.set(0.0f, 0.0f, this.f94335q.m(), this.f94335q.l());
            matrix.mapRect(this.H);
        } else {
            this.H.setEmpty();
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                ((b) it.next()).d(this.I, matrix, true);
                this.H.union(this.I);
            }
        }
        if (z10) {
            this.K.f();
            o.a aVar = this.K;
            aVar.f98660a = i10;
            if (dVar != null) {
                dVar.b(aVar);
                dVar = null;
            }
            canvasJ = this.J.j(canvas, this.H, this.K);
        } else {
            canvasJ = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.H)) {
            for (int size = this.F.size() - 1; size >= 0; size--) {
                ((b) this.F.get(size)).h(canvasJ, matrix, i11, dVar);
            }
        }
        if (z10) {
            this.J.e();
        }
        canvas.restore();
        if (d0.e.h()) {
            d0.e.c("CompositionLayer#draw");
        }
    }
}
