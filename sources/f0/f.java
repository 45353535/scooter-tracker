package f0;

import android.graphics.Path;
import android.graphics.PointF;
import d0.y;
import g0.a;
import java.util.List;
import l0.t;

/* JADX INFO: loaded from: classes5.dex */
public class f implements m, a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f69227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0.a f69228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0.a f69229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l0.b f69230f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f69232h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69225a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f69231g = new b();

    public f(com.airbnb.lottie.o oVar, m0.b bVar, l0.b bVar2) {
        this.f69226b = bVar2.b();
        this.f69227c = oVar;
        g0.a aVarA = bVar2.d().a();
        this.f69228d = aVarA;
        g0.a aVarA2 = bVar2.c().a();
        this.f69229e = aVarA2;
        this.f69230f = bVar2;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    private void e() {
        this.f69232h = false;
        this.f69227c.invalidateSelf();
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.f68404k) {
            this.f69228d.o(cVar);
        } else if (obj == y.f68407n) {
            this.f69229e.o(cVar);
        }
    }

    @Override // g0.a.b
    public void f() {
        e();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f69231g.a(uVar);
                    uVar.b(this);
                }
            }
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69226b;
    }

    @Override // f0.m
    public Path getPath() {
        if (this.f69232h) {
            return this.f69225a;
        }
        this.f69225a.reset();
        if (this.f69230f.e()) {
            this.f69232h = true;
            return this.f69225a;
        }
        PointF pointF = (PointF) this.f69228d.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f69225a.reset();
        if (this.f69230f.f()) {
            float f14 = -f11;
            this.f69225a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f69225a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f69225a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f69225a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f69225a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f69225a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f69225a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f69225a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f69225a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f69225a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f69229e.h();
        this.f69225a.offset(pointF2.x, pointF2.y);
        this.f69225a.close();
        this.f69231g.b(this.f69225a);
        this.f69232h = true;
        return this.f69225a;
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
