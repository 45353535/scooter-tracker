package f0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import d0.y;
import g0.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.o f69198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final m0.b f69199f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f69201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Paint f69202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g0.a f69203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g0.a f69204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f69205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g0.a f69206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g0.a f69207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0.a f69208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f69209p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f69194a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f69195b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f69196c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f69197d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f69200g = new ArrayList();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f69210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f69211b;

        private b(u uVar) {
            this.f69210a = new ArrayList();
            this.f69211b = uVar;
        }
    }

    a(com.airbnb.lottie.o oVar, m0.b bVar, Paint.Cap cap, Paint.Join join, float f10, k0.d dVar, k0.b bVar2, List list, k0.b bVar3) {
        e0.a aVar = new e0.a(1);
        this.f69202i = aVar;
        this.f69209p = 0.0f;
        this.f69198e = oVar;
        this.f69199f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f69204k = dVar.a();
        this.f69203j = bVar2.a();
        if (bVar3 == null) {
            this.f69206m = null;
        } else {
            this.f69206m = bVar3.a();
        }
        this.f69205l = new ArrayList(list.size());
        this.f69201h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f69205l.add(((k0.b) list.get(i10)).a());
        }
        bVar.j(this.f69204k);
        bVar.j(this.f69203j);
        for (int i11 = 0; i11 < this.f69205l.size(); i11++) {
            bVar.j((g0.a) this.f69205l.get(i11));
        }
        g0.a aVar2 = this.f69206m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f69204k.a(this);
        this.f69203j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((g0.a) this.f69205l.get(i12)).a(this);
        }
        g0.a aVar3 = this.f69206m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            g0.d dVarA = bVar.x().a().a();
            this.f69208o = dVarA;
            dVarA.a(this);
            bVar.j(this.f69208o);
        }
    }

    private void e() {
        if (d0.e.h()) {
            d0.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f69205l.isEmpty()) {
            if (d0.e.h()) {
                d0.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f69205l.size(); i10++) {
            this.f69201h[i10] = ((Float) ((g0.a) this.f69205l.get(i10)).h()).floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f69201h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f69201h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        g0.a aVar = this.f69206m;
        this.f69202i.setPathEffect(new DashPathEffect(this.f69201h, aVar == null ? 0.0f : ((Float) aVar.h()).floatValue()));
        if (d0.e.h()) {
            d0.e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(android.graphics.Canvas r14, f0.a.b r15) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.j(android.graphics.Canvas, f0.a$b):void");
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.f68397d) {
            this.f69204k.o(cVar);
            return;
        }
        if (obj == y.f68412s) {
            this.f69203j.o(cVar);
            return;
        }
        if (obj == y.K) {
            g0.a aVar = this.f69207n;
            if (aVar != null) {
                this.f69199f.H(aVar);
            }
            if (cVar == null) {
                this.f69207n = null;
                return;
            }
            g0.q qVar = new g0.q(cVar);
            this.f69207n = qVar;
            qVar.a(this);
            this.f69199f.j(this.f69207n);
            return;
        }
        if (obj == y.f68403j) {
            g0.a aVar2 = this.f69208o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            g0.q qVar2 = new g0.q(cVar);
            this.f69208o = qVar2;
            qVar2.a(this);
            this.f69199f.j(this.f69208o);
        }
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        if (d0.e.h()) {
            d0.e.b("StrokeContent#getBounds");
        }
        this.f69195b.reset();
        for (int i10 = 0; i10 < this.f69200g.size(); i10++) {
            b bVar = (b) this.f69200g.get(i10);
            for (int i11 = 0; i11 < bVar.f69210a.size(); i11++) {
                this.f69195b.addPath(((m) bVar.f69210a.get(i11)).getPath(), matrix);
            }
        }
        this.f69195b.computeBounds(this.f69197d, false);
        float fR = ((g0.d) this.f69203j).r();
        RectF rectF2 = this.f69197d;
        float f10 = fR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f69197d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (d0.e.h()) {
            d0.e.c("StrokeContent#getBounds");
        }
    }

    @Override // g0.a.b
    public void f() {
        this.f69198e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // f0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            f0.c r3 = (f0.c) r3
            boolean r4 = r3 instanceof f0.u
            if (r4 == 0) goto L1f
            f0.u r3 = (f0.u) r3
            l0.t$a r4 = r3.k()
            l0.t$a r5 = l0.t.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.b(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            f0.c r3 = (f0.c) r3
            boolean r4 = r3 instanceof f0.u
            if (r4 == 0) goto L55
            r4 = r3
            f0.u r4 = (f0.u) r4
            l0.t$a r5 = r4.k()
            l0.t$a r6 = l0.t.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List r3 = r7.f69200g
            r3.add(r0)
        L4c:
            f0.a$b r0 = new f0.a$b
            r0.<init>(r4)
            r4.b(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof f0.m
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            f0.a$b r0 = new f0.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = f0.a.b.a(r0)
            f0.m r3 = (f0.m) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List r8 = r7.f69200g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.a.g(java.util.List, java.util.List):void");
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (d0.e.h()) {
            d0.e.b("StrokeContent#draw");
        }
        if (q0.p.h(matrix)) {
            if (d0.e.h()) {
                d0.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = ((Integer) this.f69204k.h()).intValue() / 100.0f;
        this.f69202i.setAlpha(q0.l.c((int) (i10 * fIntValue), 0, 255));
        this.f69202i.setStrokeWidth(((g0.d) this.f69203j).r());
        if (this.f69202i.getStrokeWidth() <= 0.0f) {
            if (d0.e.h()) {
                d0.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        e();
        g0.a aVar = this.f69207n;
        if (aVar != null) {
            this.f69202i.setColorFilter((ColorFilter) aVar.h());
        }
        g0.a aVar2 = this.f69208o;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f69202i.setMaskFilter(null);
            } else if (fFloatValue != this.f69209p) {
                this.f69202i.setMaskFilter(this.f69199f.y(fFloatValue));
            }
            this.f69209p = fFloatValue;
        }
        if (dVar != null) {
            dVar.c((int) (fIntValue * 255.0f), this.f69202i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f69200g.size(); i11++) {
            b bVar = (b) this.f69200g.get(i11);
            if (bVar.f69211b != null) {
                j(canvas, bVar);
            } else {
                if (d0.e.h()) {
                    d0.e.b("StrokeContent#buildPath");
                }
                this.f69195b.reset();
                for (int size = bVar.f69210a.size() - 1; size >= 0; size--) {
                    this.f69195b.addPath(((m) bVar.f69210a.get(size)).getPath());
                }
                if (d0.e.h()) {
                    d0.e.c("StrokeContent#buildPath");
                    d0.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f69195b, this.f69202i);
                if (d0.e.h()) {
                    d0.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (d0.e.h()) {
            d0.e.c("StrokeContent#draw");
        }
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
