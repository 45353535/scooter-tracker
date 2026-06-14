package g0;

import android.graphics.Color;
import android.graphics.Matrix;
import g0.a;

/* JADX INFO: loaded from: classes5.dex */
public class c implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0.b f72052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.b f72053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0.a f72054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f72055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f72056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f72057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d f72058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Matrix f72059h;

    class a extends r0.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0.c f72060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f72061e;

        a(c cVar, r0.c cVar2) {
            this.f72060d = cVar2;
            this.f72061e = cVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(r0.b bVar) {
            Float f10 = (Float) this.f72060d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, m0.b bVar2, o0.j jVar) {
        this.f72053b = bVar;
        this.f72052a = bVar2;
        g0.a aVarA = jVar.a().a();
        this.f72054c = aVarA;
        aVarA.a(this);
        bVar2.j(aVarA);
        d dVarA = jVar.d().a();
        this.f72055d = dVarA;
        dVarA.a(this);
        bVar2.j(dVarA);
        d dVarA2 = jVar.b().a();
        this.f72056e = dVarA2;
        dVarA2.a(this);
        bVar2.j(dVarA2);
        d dVarA3 = jVar.c().a();
        this.f72057f = dVarA3;
        dVarA3.a(this);
        bVar2.j(dVarA3);
        d dVarA4 = jVar.e().a();
        this.f72058g = dVarA4;
        dVarA4.a(this);
        bVar2.j(dVarA4);
    }

    public q0.d a(Matrix matrix, int i10) {
        float fR = this.f72056e.r() * 0.017453292f;
        float fFloatValue = ((Float) this.f72057f.h()).floatValue();
        double d10 = fR;
        float fSin = ((float) Math.sin(d10)) * fFloatValue;
        float fCos = ((float) Math.cos(d10 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f72058g.h()).floatValue();
        int iIntValue = ((Integer) this.f72054c.h()).intValue();
        q0.d dVar = new q0.d(fFloatValue2 * 0.33f, fSin, fCos, Color.argb(Math.round((((Float) this.f72055d.h()).floatValue() * i10) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        dVar.k(matrix);
        if (this.f72059h == null) {
            this.f72059h = new Matrix();
        }
        this.f72052a.f94342x.f().invert(this.f72059h);
        dVar.k(this.f72059h);
        return dVar;
    }

    public void b(r0.c cVar) {
        this.f72054c.o(cVar);
    }

    public void c(r0.c cVar) {
        this.f72056e.o(cVar);
    }

    public void d(r0.c cVar) {
        this.f72057f.o(cVar);
    }

    public void e(r0.c cVar) {
        if (cVar == null) {
            this.f72055d.o(null);
        } else {
            this.f72055d.o(new a(this, cVar));
        }
    }

    @Override // g0.a.b
    public void f() {
        this.f72053b.f();
    }

    public void g(r0.c cVar) {
        this.f72058g.o(cVar);
    }
}
