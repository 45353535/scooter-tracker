package m0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.o;
import d0.y;
import g0.q;

/* JADX INFO: loaded from: classes5.dex */
public class h extends b {
    private final RectF E;
    private final Paint F;
    private final float[] G;
    private final Path H;
    private final e I;
    private g0.a J;
    private g0.a K;

    h(o oVar, e eVar) {
        super(oVar, eVar);
        this.E = new RectF();
        e0.a aVar = new e0.a();
        this.F = aVar;
        this.G = new float[8];
        this.H = new Path();
        this.I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // m0.b, j0.f
    public void b(Object obj, r0.c cVar) {
        super.b(obj, cVar);
        if (obj == y.K) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new q(cVar);
                return;
            }
        }
        if (obj == y.f68394a) {
            if (cVar != null) {
                this.K = new q(cVar);
            } else {
                this.K = null;
                this.F.setColor(this.I.p());
            }
        }
    }

    @Override // m0.b, f0.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.E.set(0.0f, 0.0f, this.I.r(), this.I.q());
        this.f94333o.mapRect(this.E);
        rectF.set(this.E);
    }

    @Override // m0.b
    public void u(Canvas canvas, Matrix matrix, int i10, q0.d dVar) {
        int iAlpha = Color.alpha(this.I.p());
        if (iAlpha == 0) {
            return;
        }
        g0.a aVar = this.K;
        Integer num = aVar == null ? null : (Integer) aVar.h();
        if (num != null) {
            this.F.setColor(num.intValue());
        } else {
            this.F.setColor(this.I.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f94342x.h() == null ? 100 : ((Integer) this.f94342x.h().h()).intValue())) / 100.0f) * 255.0f);
        this.F.setAlpha(iIntValue);
        if (dVar != null) {
            dVar.a(this.F);
        } else {
            this.F.clearShadowLayer();
        }
        g0.a aVar2 = this.J;
        if (aVar2 != null) {
            this.F.setColorFilter((ColorFilter) aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.I.r();
            float[] fArr2 = this.G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.I.r();
            this.G[5] = this.I.q();
            float[] fArr3 = this.G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.I.q();
            matrix.mapPoints(this.G);
            this.H.reset();
            Path path = this.H;
            float[] fArr4 = this.G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.H;
            float[] fArr5 = this.G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.H;
            float[] fArr6 = this.G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.H;
            float[] fArr7 = this.G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.H;
            float[] fArr8 = this.G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.H.close();
            canvas.drawPath(this.H, this.F);
        }
    }
}
