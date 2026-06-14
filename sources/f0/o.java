package f0;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d0.y;
import g0.a;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class o implements a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f69305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0.a f69306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0.a f69307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0.a f69308h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f69311k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69301a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f69302b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f69309i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0.a f69310j = null;

    public o(com.airbnb.lottie.o oVar, m0.b bVar, l0.l lVar) {
        this.f69303c = lVar.c();
        this.f69304d = lVar.f();
        this.f69305e = oVar;
        g0.a aVarA = lVar.d().a();
        this.f69306f = aVarA;
        g0.a aVarA2 = lVar.e().a();
        this.f69307g = aVarA2;
        g0.d dVarA = lVar.b().a();
        this.f69308h = dVarA;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        bVar.j(dVarA);
        aVarA.a(this);
        aVarA2.a(this);
        dVarA.a(this);
    }

    private void e() {
        this.f69311k = false;
        this.f69305e.invalidateSelf();
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.f68405l) {
            this.f69307g.o(cVar);
        } else if (obj == y.f68407n) {
            this.f69306f.o(cVar);
        } else if (obj == y.f68406m) {
            this.f69308h.o(cVar);
        }
    }

    @Override // g0.a.b
    public void f() {
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // f0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            f0.c r0 = (f0.c) r0
            boolean r1 = r0 instanceof f0.u
            if (r1 == 0) goto L25
            r1 = r0
            f0.u r1 = (f0.u) r1
            l0.t$a r2 = r1.k()
            l0.t$a r3 = l0.t.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            f0.b r0 = r4.f69309i
            r0.a(r1)
            r1.b(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof f0.q
            if (r1 == 0) goto L31
            f0.q r0 = (f0.q) r0
            g0.a r0 = r0.i()
            r4.f69310j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o.g(java.util.List, java.util.List):void");
    }

    @Override // f0.c
    public String getName() {
        return this.f69303c;
    }

    @Override // f0.m
    public Path getPath() {
        g0.a aVar;
        if (this.f69311k) {
            return this.f69301a;
        }
        this.f69301a.reset();
        if (this.f69304d) {
            this.f69311k = true;
            return this.f69301a;
        }
        PointF pointF = (PointF) this.f69307g.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        g0.a aVar2 = this.f69308h;
        float fR = aVar2 == null ? 0.0f : ((g0.d) aVar2).r();
        if (fR == 0.0f && (aVar = this.f69310j) != null) {
            fR = Math.min(((Float) aVar.h()).floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointF2 = (PointF) this.f69306f.h();
        this.f69301a.moveTo(pointF2.x + f10, (pointF2.y - f11) + fR);
        this.f69301a.lineTo(pointF2.x + f10, (pointF2.y + f11) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.f69302b;
            float f12 = pointF2.x;
            float f13 = fR * 2.0f;
            float f14 = pointF2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f69301a.arcTo(this.f69302b, 0.0f, 90.0f, false);
        }
        this.f69301a.lineTo((pointF2.x - f10) + fR, pointF2.y + f11);
        if (fR > 0.0f) {
            RectF rectF2 = this.f69302b;
            float f15 = pointF2.x;
            float f16 = pointF2.y;
            float f17 = fR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f69301a.arcTo(this.f69302b, 90.0f, 90.0f, false);
        }
        this.f69301a.lineTo(pointF2.x - f10, (pointF2.y - f11) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.f69302b;
            float f18 = pointF2.x;
            float f19 = pointF2.y;
            float f20 = fR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f69301a.arcTo(this.f69302b, 180.0f, 90.0f, false);
        }
        this.f69301a.lineTo((pointF2.x + f10) - fR, pointF2.y - f11);
        if (fR > 0.0f) {
            RectF rectF4 = this.f69302b;
            float f21 = pointF2.x;
            float f22 = fR * 2.0f;
            float f23 = pointF2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f69301a.arcTo(this.f69302b, 270.0f, 90.0f, false);
        }
        this.f69301a.close();
        this.f69309i.b(this.f69301a);
        this.f69311k = true;
        return this.f69301a;
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
