package f0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import d0.y;

/* JADX INFO: loaded from: classes5.dex */
public class t extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0.b f69333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f69334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f69335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g0.a f69336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g0.a f69337u;

    public t(com.airbnb.lottie.o oVar, m0.b bVar, l0.s sVar) {
        super(oVar, bVar, sVar.b().g(), sVar.e().g(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f69333q = bVar;
        this.f69334r = sVar.h();
        this.f69335s = sVar.k();
        g0.a aVarA = sVar.c().a();
        this.f69336t = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
    }

    @Override // f0.a, j0.f
    public void b(Object obj, r0.c cVar) {
        super.b(obj, cVar);
        if (obj == y.f68395b) {
            this.f69336t.o(cVar);
            return;
        }
        if (obj == y.K) {
            g0.a aVar = this.f69337u;
            if (aVar != null) {
                this.f69333q.H(aVar);
            }
            if (cVar == null) {
                this.f69337u = null;
                return;
            }
            g0.q qVar = new g0.q(cVar);
            this.f69337u = qVar;
            qVar.a(this);
            this.f69333q.j(this.f69336t);
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69334r;
    }

    @Override // f0.a, f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (this.f69335s) {
            return;
        }
        this.f69202i.setColor(((g0.b) this.f69336t).r());
        g0.a aVar = this.f69337u;
        if (aVar != null) {
            this.f69202i.setColorFilter((ColorFilter) aVar.h());
        }
        super.h(canvas, matrix, i10, dVar);
    }
}
