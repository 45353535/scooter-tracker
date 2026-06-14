package f0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d0.y;

/* JADX INFO: loaded from: classes5.dex */
public class i extends a {
    private g0.q A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f69265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f69266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LongSparseArray f69267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LongSparseArray f69268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f69269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l0.g f69270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f69271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final g0.a f69272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g0.a f69273y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final g0.a f69274z;

    public i(com.airbnb.lottie.o oVar, m0.b bVar, l0.f fVar) {
        super(oVar, bVar, fVar.b().g(), fVar.g().g(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f69267s = new LongSparseArray();
        this.f69268t = new LongSparseArray();
        this.f69269u = new RectF();
        this.f69265q = fVar.j();
        this.f69270v = fVar.f();
        this.f69266r = fVar.n();
        this.f69271w = (int) (oVar.I().d() / 32.0f);
        g0.a aVarA = fVar.e().a();
        this.f69272x = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        g0.a aVarA2 = fVar.l().a();
        this.f69273y = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        g0.a aVarA3 = fVar.d().a();
        this.f69274z = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
    }

    private int[] k(int[] iArr) {
        g0.q qVar = this.A;
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

    private int l() {
        int iRound = Math.round(this.f69273y.f() * this.f69271w);
        int iRound2 = Math.round(this.f69274z.f() * this.f69271w);
        int iRound3 = Math.round(this.f69272x.f() * this.f69271w);
        int i10 = iRound != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradient = (LinearGradient) this.f69267s.get(jL);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f69273y.h();
        PointF pointF2 = (PointF) this.f69274z.h();
        l0.d dVar = (l0.d) this.f69272x.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, k(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f69267s.put(jL, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradient = (RadialGradient) this.f69268t.get(jL);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f69273y.h();
        PointF pointF2 = (PointF) this.f69274z.h();
        l0.d dVar = (l0.d) this.f69272x.h();
        int[] iArrK = k(dVar.d());
        float[] fArrE = dVar.e();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f69268t.put(jL, radialGradient2);
        return radialGradient2;
    }

    @Override // f0.a, j0.f
    public void b(Object obj, r0.c cVar) {
        super.b(obj, cVar);
        if (obj == y.L) {
            g0.q qVar = this.A;
            if (qVar != null) {
                this.f69199f.H(qVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            g0.q qVar2 = new g0.q(cVar);
            this.A = qVar2;
            qVar2.a(this);
            this.f69199f.j(this.A);
        }
    }

    @Override // f0.c
    public String getName() {
        return this.f69265q;
    }

    @Override // f0.a, f0.e
    public void h(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        if (this.f69266r) {
            return;
        }
        d(this.f69269u, matrix, false);
        this.f69202i.setShader(this.f69270v == l0.g.LINEAR ? m() : n());
        super.h(canvas, matrix, i10, dVar);
    }
}
