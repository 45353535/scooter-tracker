package f0;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d0.y;
import g0.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class h implements e, a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.b f69247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray f69248d = new LongSparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LongSparseArray f69249e = new LongSparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f69250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f69251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f69252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f69253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l0.g f69254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g0.a f69255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g0.a f69256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final g0.a f69257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g0.a f69258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0.a f69259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g0.q f69260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.o f69261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f69262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g0.a f69263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f69264t;

    public h(com.airbnb.lottie.o oVar, d0.i iVar, m0.b bVar, l0.e eVar) {
        Path path = new Path();
        this.f69250f = path;
        this.f69251g = new e0.a(1);
        this.f69252h = new RectF();
        this.f69253i = new ArrayList();
        this.f69264t = 0.0f;
        this.f69247c = bVar;
        this.f69245a = eVar.f();
        this.f69246b = eVar.i();
        this.f69261q = oVar;
        this.f69254j = eVar.e();
        path.setFillType(eVar.c());
        this.f69262r = (int) (iVar.d() / 32.0f);
        g0.a aVarA = eVar.d().a();
        this.f69255k = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        g0.a aVarA2 = eVar.g().a();
        this.f69256l = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        g0.a aVarA3 = eVar.h().a();
        this.f69257m = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
        g0.a aVarA4 = eVar.b().a();
        this.f69258n = aVarA4;
        aVarA4.a(this);
        bVar.j(aVarA4);
        if (bVar.x() != null) {
            g0.d dVarA = bVar.x().a().a();
            this.f69263s = dVarA;
            dVarA.a(this);
            bVar.j(this.f69263s);
        }
    }

    private int[] e(int[] iArr) {
        g0.q qVar = this.f69260p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.f69257m.f() * this.f69262r);
        int iRound2 = Math.round(this.f69258n.f() * this.f69262r);
        int iRound3 = Math.round(this.f69255k.f() * this.f69262r);
        int i10 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        LinearGradient linearGradient = (LinearGradient) this.f69248d.get(j10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f69257m.h();
        PointF pointF2 = (PointF) this.f69258n.h();
        l0.d dVar = (l0.d) this.f69255k.h();
        int[] iArrE = e(dVar.d());
        float[] fArrE = dVar.e();
        if (iArrE.length < 2) {
            iArr = new int[]{iArrE[0], iArrE[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrE;
        }
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f69248d.put(j10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j10 = j();
        RadialGradient radialGradient = (RadialGradient) this.f69249e.get(j10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f69257m.h();
        PointF pointF2 = (PointF) this.f69258n.h();
        l0.d dVar = (l0.d) this.f69255k.h();
        int[] iArrE = e(dVar.d());
        float[] fArrE = dVar.e();
        if (iArrE.length < 2) {
            iArr = new int[]{iArrE[0], iArrE[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrE;
            iArr = iArrE;
        }
        float f10 = pointF.x;
        float f11 = pointF.y;
        float fHypot = (float) Math.hypot(pointF2.x - f10, pointF2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f69249e.put(j10, radialGradient2);
        return radialGradient2;
    }

    @Override // j0.f
    public void b(Object obj, r0.c cVar) {
        if (obj == y.f68397d) {
            this.f69256l.o(cVar);
            return;
        }
        if (obj == y.K) {
            g0.a aVar = this.f69259o;
            if (aVar != null) {
                this.f69247c.H(aVar);
            }
            if (cVar == null) {
                this.f69259o = null;
                return;
            }
            g0.q qVar = new g0.q(cVar);
            this.f69259o = qVar;
            qVar.a(this);
            this.f69247c.j(this.f69259o);
            return;
        }
        if (obj != y.L) {
            if (obj == y.f68403j) {
                g0.a aVar2 = this.f69263s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                g0.q qVar2 = new g0.q(cVar);
                this.f69263s = qVar2;
                qVar2.a(this);
                this.f69247c.j(this.f69263s);
                return;
            }
            return;
        }
        g0.q qVar3 = this.f69260p;
        if (qVar3 != null) {
            this.f69247c.H(qVar3);
        }
        if (cVar == null) {
            this.f69260p = null;
            return;
        }
        this.f69248d.clear();
        this.f69249e.clear();
        g0.q qVar4 = new g0.q(cVar);
        this.f69260p = qVar4;
        qVar4.a(this);
        this.f69247c.j(this.f69260p);
    }

    @Override // f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f69250f.reset();
        for (int i10 = 0; i10 < this.f69253i.size(); i10++) {
            this.f69250f.addPath(((m) this.f69253i.get(i10)).getPath(), matrix);
        }
        this.f69250f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // g0.a.b
    public void f() {
        this.f69261q.invalidateSelf();
    }

    @Override // f0.c
    public void g(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof m) {
                this.f69253i.add((m) cVar);
            }
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69245a;
    }

    @Override // f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (this.f69246b) {
            return;
        }
        if (d0.e.h()) {
            d0.e.b("GradientFillContent#draw");
        }
        this.f69250f.reset();
        for (int i11 = 0; i11 < this.f69253i.size(); i11++) {
            this.f69250f.addPath(((m) this.f69253i.get(i11)).getPath(), matrix);
        }
        this.f69250f.computeBounds(this.f69252h, false);
        Shader shaderK = this.f69254j == l0.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f69251g.setShader(shaderK);
        g0.a aVar = this.f69259o;
        if (aVar != null) {
            this.f69251g.setColorFilter((ColorFilter) aVar.h());
        }
        g0.a aVar2 = this.f69263s;
        if (aVar2 != null) {
            float fFloatValue = ((Float) aVar2.h()).floatValue();
            if (fFloatValue == 0.0f) {
                this.f69251g.setMaskFilter(null);
            } else if (fFloatValue != this.f69264t) {
                this.f69251g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f69264t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f69256l.h()).intValue() / 100.0f;
        this.f69251g.setAlpha(q0.l.c((int) (i10 * fIntValue), 0, 255));
        if (dVar != null) {
            dVar.c((int) (fIntValue * 255.0f), this.f69251g);
        }
        canvas.drawPath(this.f69250f, this.f69251g);
        if (d0.e.h()) {
            d0.e.c("GradientFillContent#draw");
        }
    }

    @Override // j0.f
    public void i(j0.e eVar, int i10, List list, j0.e eVar2) {
        q0.l.k(eVar, i10, list, eVar2, this);
    }
}
