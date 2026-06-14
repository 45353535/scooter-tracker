package f0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import d0.y;
import g0.a;
import java.util.List;
import l0.k;
import l0.t;

/* JADX INFO: loaded from: classes5.dex */
public class n implements m, a.b, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.o f69287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k.a f69288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f69289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f69290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g0.a f69291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g0.a f69292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g0.a f69293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g0.a f69294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g0.a f69295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g0.a f69296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g0.a f69297p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f69299r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f69282a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f69283b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PathMeasure f69284c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f69285d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f69298q = new b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69300a;

        static {
            int[] iArr = new int[k.a.values().length];
            f69300a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69300a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.o oVar, m0.b bVar, l0.k kVar) {
        this.f69287f = oVar;
        this.f69286e = kVar.d();
        k.a aVarJ = kVar.j();
        this.f69288g = aVarJ;
        this.f69289h = kVar.k();
        this.f69290i = kVar.l();
        g0.d dVarA = kVar.g().a();
        this.f69291j = dVarA;
        g0.a aVarA = kVar.h().a();
        this.f69292k = aVarA;
        g0.d dVarA2 = kVar.i().a();
        this.f69293l = dVarA2;
        g0.d dVarA3 = kVar.e().a();
        this.f69295n = dVarA3;
        g0.d dVarA4 = kVar.f().a();
        this.f69297p = dVarA4;
        k.a aVar = k.a.STAR;
        if (aVarJ == aVar) {
            this.f69294m = kVar.b().a();
            this.f69296o = kVar.c().a();
        } else {
            this.f69294m = null;
            this.f69296o = null;
        }
        bVar.j(dVarA);
        bVar.j(aVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        bVar.j(dVarA4);
        if (aVarJ == aVar) {
            bVar.j(this.f69294m);
            bVar.j(this.f69296o);
        }
        dVarA.a(this);
        aVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
        dVarA4.a(this);
        if (aVarJ == aVar) {
            this.f69294m.a(this);
            this.f69296o.a(this);
        }
    }

    private void e() {
        double d10;
        float f10;
        float f11;
        float f12;
        int iFloor = (int) Math.floor(((Float) this.f69291j.h()).floatValue());
        double radians = Math.toRadians((this.f69293l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d11 = iFloor;
        float fFloatValue = ((Float) this.f69297p.h()).floatValue() / 100.0f;
        float fFloatValue2 = ((Float) this.f69295n.h()).floatValue();
        double d12 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d12);
        float fSin = (float) (Math.sin(radians) * d12);
        this.f69282a.moveTo(fCos, fSin);
        double d13 = (float) (6.283185307179586d / d11);
        double dCeil = Math.ceil(d11);
        double d14 = radians + d13;
        int i10 = 0;
        while (true) {
            double d15 = i10;
            if (d15 >= dCeil) {
                PointF pointF = (PointF) this.f69292k.h();
                this.f69282a.offset(pointF.x, pointF.y);
                this.f69282a.close();
                return;
            }
            float fCos2 = (float) (d12 * Math.cos(d14));
            float fSin2 = (float) (Math.sin(d14) * d12);
            if (fFloatValue != 0.0f) {
                d10 = dCeil;
                f10 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f13 = fFloatValue2 * f10 * 0.25f;
                float f14 = f13 * fCos3;
                float f15 = f13 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan22)) * f13;
                float fSin4 = f13 * ((float) Math.sin(dAtan22));
                if (d15 == d10 - 1.0d) {
                    this.f69283b.reset();
                    this.f69283b.moveTo(fCos, fSin);
                    float f16 = fCos - f14;
                    float f17 = fSin - f15;
                    float f18 = fCos2 + fCos4;
                    float f19 = fSin2 + fSin4;
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f69283b.cubicTo(f16, f17, f18, f19, f11, f12);
                    this.f69284c.setPath(this.f69283b, false);
                    PathMeasure pathMeasure = this.f69284c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f69285d, null);
                    Path path = this.f69282a;
                    float[] fArr = this.f69285d;
                    path.cubicTo(f16, f17, f18, f19, fArr[0], fArr[1]);
                } else {
                    f11 = fCos2;
                    f12 = fSin2;
                    this.f69282a.cubicTo(fCos - f14, fSin - f15, f11 + fCos4, f12 + fSin4, f11, f12);
                }
                fCos = f11;
                fSin = f12;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d10 = dCeil;
                f10 = fFloatValue;
                if (d15 == d10 - 1.0d) {
                    i10++;
                    dCeil = d10;
                    fFloatValue = f10;
                } else {
                    this.f69282a.lineTo(fCos, fSin);
                }
            }
            d14 += d13;
            i10++;
            dCeil = d10;
            fFloatValue = f10;
        }
    }

    private void j() {
        float f10;
        float f11;
        int i10;
        float fCos;
        float fSin;
        float f12;
        float f13;
        double d10;
        float f14;
        int i11;
        float f15;
        double d11;
        float f16;
        float f17;
        double d12;
        float f18;
        float f19;
        float fFloatValue = ((Float) this.f69291j.h()).floatValue();
        double radians = Math.toRadians((this.f69293l == null ? 0.0d : ((Float) r2.h()).floatValue()) - 90.0d);
        double d13 = fFloatValue;
        float f20 = (float) (6.283185307179586d / d13);
        if (this.f69290i) {
            f20 *= -1.0f;
        }
        float f21 = f20 / 2.0f;
        float f22 = fFloatValue - ((int) fFloatValue);
        int i12 = (f22 > 0.0f ? 1 : (f22 == 0.0f ? 0 : -1));
        if (i12 != 0) {
            radians += (double) ((1.0f - f22) * f21);
        }
        float fFloatValue2 = ((Float) this.f69295n.h()).floatValue();
        float fFloatValue3 = ((Float) this.f69294m.h()).floatValue();
        g0.a aVar = this.f69296o;
        float fFloatValue4 = aVar != null ? ((Float) aVar.h()).floatValue() / 100.0f : 0.0f;
        g0.a aVar2 = this.f69297p;
        float fFloatValue5 = aVar2 != null ? ((Float) aVar2.h()).floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f14 = ((fFloatValue2 - fFloatValue3) * f22) + fFloatValue3;
            f11 = 0.0f;
            i10 = i12;
            double d14 = f14;
            f10 = 2.0f;
            float fCos2 = (float) (d14 * Math.cos(radians));
            fSin = (float) (d14 * Math.sin(radians));
            this.f69282a.moveTo(fCos2, fSin);
            d10 = radians + ((double) ((f20 * f22) / 2.0f));
            f12 = f22;
            fCos = fCos2;
            f13 = f21;
        } else {
            f10 = 2.0f;
            f11 = 0.0f;
            i10 = i12;
            double d15 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d15);
            fSin = (float) (d15 * Math.sin(radians));
            this.f69282a.moveTo(fCos, fSin);
            f12 = f22;
            f13 = f21;
            d10 = radians + ((double) f13);
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d13) * 2.0d;
        int i13 = 0;
        boolean z10 = false;
        double d16 = d10;
        float f23 = fSin;
        float f24 = fCos;
        double d17 = d16;
        while (true) {
            double d18 = i13;
            if (d18 >= dCeil) {
                PointF pointF = (PointF) this.f69292k.h();
                this.f69282a.offset(pointF.x, pointF.y);
                this.f69282a.close();
                return;
            }
            float f25 = z10 ? fFloatValue2 : fFloatValue3;
            if (f14 == f11 || d18 != dCeil - 2.0d) {
                i11 = i13;
                f15 = f13;
            } else {
                i11 = i13;
                f15 = (f20 * f12) / f10;
            }
            if (f14 == f11 || d18 != dCeil - 1.0d) {
                d11 = d18;
                f16 = f25;
            } else {
                d11 = d18;
                f16 = f14;
            }
            double d19 = f16;
            float fCos3 = (float) (d19 * Math.cos(d17));
            float f26 = f20;
            float fSin2 = (float) (d19 * Math.sin(d17));
            if (fFloatValue4 == f11 && fFloatValue5 == f11) {
                this.f69282a.lineTo(fCos3, fSin2);
                f19 = fCos3;
                f18 = fSin2;
                f17 = f13;
                d12 = d17;
            } else {
                f17 = f13;
                d12 = d17;
                double dAtan2 = (float) (Math.atan2(f23, f24) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f27 = f24;
                float f28 = f23;
                f18 = fSin2;
                double dAtan22 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan22);
                float fSin4 = (float) Math.sin(dAtan22);
                float f29 = z10 ? fFloatValue4 : fFloatValue5;
                float f30 = z10 ? fFloatValue5 : fFloatValue4;
                float f31 = (z10 ? fFloatValue3 : fFloatValue2) * f29 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z10 ? fFloatValue2 : fFloatValue3) * f30 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (i10 != 0) {
                    if (i11 == 0) {
                        f32 *= f12;
                        f33 *= f12;
                    } else if (d11 == dCeil - 1.0d) {
                        f35 *= f12;
                        f36 *= f12;
                    }
                }
                f19 = fCos3;
                this.f69282a.cubicTo(f27 - f32, f28 - f33, fCos3 + f35, f18 + f36, f19, f18);
            }
            d17 = d12 + ((double) f15);
            z10 = !z10;
            i13 = i11 + 1;
            f13 = f17;
            f24 = f19;
            f23 = f18;
            f20 = f26;
        }
    }

    private void k() {
        this.f69299r = false;
        this.f69287f.invalidateSelf();
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        g0.a aVar;
        g0.a aVar2;
        if (obj == y.f68416w) {
            this.f69291j.o(cVar);
            return;
        }
        if (obj == y.f68417x) {
            this.f69293l.o(cVar);
            return;
        }
        if (obj == y.f68407n) {
            this.f69292k.o(cVar);
            return;
        }
        if (obj == y.f68418y && (aVar2 = this.f69294m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (obj == y.f68419z) {
            this.f69295n.o(cVar);
            return;
        }
        if (obj == y.A && (aVar = this.f69296o) != null) {
            aVar.o(cVar);
        } else if (obj == y.B) {
            this.f69297p.o(cVar);
        }
    }

    @Override // g0.a.b
    public void f() {
        k();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f69298q.a(uVar);
                    uVar.b(this);
                }
            }
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69286e;
    }

    @Override // f0.m
    public Path getPath() {
        if (this.f69299r) {
            return this.f69282a;
        }
        this.f69282a.reset();
        if (this.f69289h) {
            this.f69299r = true;
            return this.f69282a;
        }
        int i10 = a.f69300a[this.f69288g.ordinal()];
        if (i10 == 1) {
            j();
        } else if (i10 == 2) {
            e();
        }
        this.f69282a.close();
        this.f69298q.b(this.f69282a);
        this.f69299r = true;
        return this.f69282a;
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
