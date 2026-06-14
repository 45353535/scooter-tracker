package g0;

import android.graphics.Matrix;
import android.graphics.PointF;
import d0.y;
import g0.a;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f72090a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f72091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f72092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f72093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f72094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f72095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f72096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f72097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f72098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f72099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f72100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f72101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f72102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f72103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f72104o;

    public p(k0.n nVar) {
        this.f72095f = nVar.c() == null ? null : nVar.c().a();
        this.f72096g = nVar.f() == null ? null : nVar.f().a();
        this.f72097h = nVar.h() == null ? null : nVar.h().a();
        this.f72098i = nVar.g() == null ? null : nVar.g().a();
        this.f72100k = nVar.i() == null ? null : nVar.i().a();
        this.f72104o = nVar.l();
        if (this.f72100k != null) {
            this.f72091b = new Matrix();
            this.f72092c = new Matrix();
            this.f72093d = new Matrix();
            this.f72094e = new float[9];
        } else {
            this.f72091b = null;
            this.f72092c = null;
            this.f72093d = null;
            this.f72094e = null;
        }
        this.f72101l = nVar.j() == null ? null : nVar.j().a();
        if (nVar.e() != null) {
            this.f72099j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f72102m = nVar.k().a();
        } else {
            this.f72102m = null;
        }
        if (nVar.d() != null) {
            this.f72103n = nVar.d().a();
        } else {
            this.f72103n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f72094e[i10] = 0.0f;
        }
    }

    public void a(m0.b bVar) {
        bVar.j(this.f72099j);
        bVar.j(this.f72102m);
        bVar.j(this.f72103n);
        bVar.j(this.f72095f);
        bVar.j(this.f72096g);
        bVar.j(this.f72097h);
        bVar.j(this.f72098i);
        bVar.j(this.f72100k);
        bVar.j(this.f72101l);
    }

    public void b(a.b bVar) {
        a aVar = this.f72099j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a aVar2 = this.f72102m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a aVar3 = this.f72103n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a aVar4 = this.f72095f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a aVar5 = this.f72096g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a aVar6 = this.f72097h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a aVar7 = this.f72098i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f72100k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f72101l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public boolean c(Object obj, r0.c cVar) {
        if (obj == y.f68399f) {
            a aVar = this.f72095f;
            if (aVar == null) {
                this.f72095f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (obj == y.f68400g) {
            a aVar2 = this.f72096g;
            if (aVar2 == null) {
                this.f72096g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (obj == y.f68401h) {
            a aVar3 = this.f72096g;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (obj == y.f68402i) {
            a aVar4 = this.f72096g;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (obj == y.f68408o) {
            a aVar5 = this.f72097h;
            if (aVar5 == null) {
                this.f72097h = new q(cVar, new r0.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (obj == y.f68409p) {
            a aVar6 = this.f72098i;
            if (aVar6 == null) {
                this.f72098i = new q(cVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (obj == y.f68396c) {
            a aVar7 = this.f72099j;
            if (aVar7 == null) {
                this.f72099j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (obj == y.C) {
            a aVar8 = this.f72102m;
            if (aVar8 == null) {
                this.f72102m = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (obj == y.D) {
            a aVar9 = this.f72103n;
            if (aVar9 == null) {
                this.f72103n = new q(cVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (obj == y.f68410q) {
            if (this.f72100k == null) {
                this.f72100k = new d(Collections.singletonList(new r0.a(Float.valueOf(0.0f))));
            }
            this.f72100k.o(cVar);
            return true;
        }
        if (obj != y.f68411r) {
            return false;
        }
        if (this.f72101l == null) {
            this.f72101l = new d(Collections.singletonList(new r0.a(Float.valueOf(0.0f))));
        }
        this.f72101l.o(cVar);
        return true;
    }

    public a e() {
        return this.f72103n;
    }

    public Matrix f() {
        PointF pointF;
        r0.d dVar;
        PointF pointF2;
        this.f72090a.reset();
        a aVar = this.f72096g;
        if (aVar != null && (pointF2 = (PointF) aVar.h()) != null) {
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                this.f72090a.preTranslate(f10, pointF2.y);
            }
        }
        if (!this.f72104o) {
            a aVar2 = this.f72098i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? ((Float) aVar2.h()).floatValue() : ((d) aVar2).r();
                if (fFloatValue != 0.0f) {
                    this.f72090a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF pointF3 = (PointF) aVar.h();
            float f12 = pointF3.x;
            float f13 = pointF3.y;
            aVar.n(1.0E-4f + f11);
            PointF pointF4 = (PointF) aVar.h();
            aVar.n(f11);
            this.f72090a.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f13, pointF4.x - f12)));
        }
        if (this.f72100k != null) {
            float fCos = this.f72101l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.r()) + 90.0f));
            float fSin = this.f72101l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.r()));
            d();
            float[] fArr = this.f72094e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f72091b.setValues(fArr);
            d();
            float[] fArr2 = this.f72094e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f72092c.setValues(fArr2);
            d();
            float[] fArr3 = this.f72094e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f72093d.setValues(fArr3);
            this.f72092c.preConcat(this.f72091b);
            this.f72093d.preConcat(this.f72092c);
            this.f72090a.preConcat(this.f72093d);
        }
        a aVar3 = this.f72097h;
        if (aVar3 != null && (dVar = (r0.d) aVar3.h()) != null && (dVar.b() != 1.0f || dVar.c() != 1.0f)) {
            this.f72090a.preScale(dVar.b(), dVar.c());
        }
        a aVar4 = this.f72095f;
        if (aVar4 != null && (pointF = (PointF) aVar4.h()) != null) {
            float f15 = pointF.x;
            if (f15 != 0.0f || pointF.y != 0.0f) {
                this.f72090a.preTranslate(-f15, -pointF.y);
            }
        }
        return this.f72090a;
    }

    public Matrix g(float f10) {
        a aVar = this.f72096g;
        PointF pointF = aVar == null ? null : (PointF) aVar.h();
        a aVar2 = this.f72097h;
        r0.d dVar = aVar2 == null ? null : (r0.d) aVar2.h();
        this.f72090a.reset();
        if (pointF != null) {
            this.f72090a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (dVar != null) {
            double d10 = f10;
            this.f72090a.preScale((float) Math.pow(dVar.b(), d10), (float) Math.pow(dVar.c(), d10));
        }
        a aVar3 = this.f72098i;
        if (aVar3 != null) {
            float fFloatValue = ((Float) aVar3.h()).floatValue();
            a aVar4 = this.f72095f;
            PointF pointF2 = aVar4 != null ? (PointF) aVar4.h() : null;
            this.f72090a.preRotate(fFloatValue * f10, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.f72090a;
    }

    public a h() {
        return this.f72099j;
    }

    public a i() {
        return this.f72102m;
    }

    public void j(float f10) {
        a aVar = this.f72099j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a aVar2 = this.f72102m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a aVar3 = this.f72103n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a aVar4 = this.f72095f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a aVar5 = this.f72096g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a aVar6 = this.f72097h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a aVar7 = this.f72098i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f72100k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f72101l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
