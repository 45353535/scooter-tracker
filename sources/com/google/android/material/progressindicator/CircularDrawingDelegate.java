package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f27145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f27146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f27148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f27149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f27150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f27151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Pair f27152q;

    CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f27151p = new RectF();
        this.f27152q = new Pair(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void j(Path path, DrawingDelegate.PathPoint pathPoint, DrawingDelegate.PathPoint pathPoint2) {
        float f10 = (this.f27145j / 2.0f) * 0.48f;
        DrawingDelegate.PathPoint pathPoint3 = new DrawingDelegate.PathPoint(this, pathPoint);
        DrawingDelegate.PathPoint pathPoint4 = new DrawingDelegate.PathPoint(this, pathPoint2);
        pathPoint3.b(f10);
        pathPoint4.b(-f10);
        float[] fArr = pathPoint3.f27223a;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float[] fArr2 = pathPoint4.f27223a;
        float f13 = fArr2[0];
        float f14 = fArr2[1];
        float[] fArr3 = pathPoint2.f27223a;
        path.cubicTo(f11, f12, f13, f14, fArr3[0], fArr3[1]);
    }

    private void k(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        float f14 = this.f27143h * f12;
        int i10 = this.f27149n ? ((CircularProgressIndicatorSpec) this.f27210a).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.f27210a).wavelengthIndeterminate;
        float f15 = this.f27144i;
        if (f15 != this.f27148m || (pathMeasure == this.f27213d && (f14 != this.f27146k || i10 != this.f27147l))) {
            this.f27146k = f14;
            this.f27147l = i10;
            this.f27148m = f15;
            g();
        }
        path.rewind();
        float f16 = 0.0f;
        float fClamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        if (((CircularProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27149n)) {
            float f17 = f13 / ((float) ((((double) this.f27144i) * 6.283185307179586d) / ((double) this.f27145j)));
            f10 += f17;
            f16 = 0.0f - (f17 * 360.0f);
        }
        float f18 = f10 % 1.0f;
        float length = (pathMeasure.getLength() * f18) / 2.0f;
        float length2 = ((f18 + fClamp) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.f27223a, pathPoint.f27224b);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.f27223a, pathPoint2.f27224b);
        this.f27214e.reset();
        this.f27214e.setRotate(f16);
        pathPoint.rotate(f16);
        pathPoint2.rotate(f16);
        path.transform(this.f27214e);
    }

    private void l(PathMeasure pathMeasure, Path path, float f10) {
        path.rewind();
        float length = pathMeasure.getLength();
        int iMax = Math.max(3, (int) ((length / (this.f27149n ? ((CircularProgressIndicatorSpec) this.f27210a).wavelengthDeterminate : ((CircularProgressIndicatorSpec) this.f27210a).wavelengthIndeterminate)) / 2.0f)) * 2;
        this.f27145j = length / iMax;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iMax; i10++) {
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            float f11 = i10;
            pathMeasure.getPosTan(this.f27145j * f11, pathPoint.f27223a, pathPoint.f27224b);
            DrawingDelegate.PathPoint pathPoint2 = new DrawingDelegate.PathPoint();
            float f12 = this.f27145j;
            pathMeasure.getPosTan((f11 * f12) + (f12 / 2.0f), pathPoint2.f27223a, pathPoint2.f27224b);
            arrayList.add(pathPoint);
            pathPoint2.a(f10 * 2.0f);
            arrayList.add(pathPoint2);
        }
        arrayList.add((DrawingDelegate.PathPoint) arrayList.get(0));
        DrawingDelegate.PathPoint pathPoint3 = (DrawingDelegate.PathPoint) arrayList.get(0);
        float[] fArr = pathPoint3.f27223a;
        int i11 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i11 < arrayList.size()) {
            DrawingDelegate.PathPoint pathPoint4 = (DrawingDelegate.PathPoint) arrayList.get(i11);
            j(path, pathPoint3, pathPoint4);
            i11++;
            pathPoint3 = pathPoint4;
        }
    }

    private void m(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f15 = f10 % 1.0f;
        if (f15 < 0.0f) {
            f15 += 1.0f;
        }
        if (this.f27150o < 1.0f) {
            float f16 = f15 + f14;
            if (f16 > 1.0f) {
                m(canvas, paint, f15, 1.0f, i10, i11, 0, f12, f13, z10);
                m(canvas, paint, 1.0f, f16, i10, 0, i12, f12, f13, z10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f27142g / this.f27144i);
        float f17 = f14 - 0.99f;
        if (f17 >= 0.0f) {
            float f18 = ((f17 * degrees) / 180.0f) / 0.01f;
            f14 += f18;
            if (!z10) {
                f15 -= f18 / 2.0f;
            }
        }
        float fLerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.f27150o, 1.0f, f15);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(0.0f, this.f27150o, f14);
        float degrees2 = (float) Math.toDegrees(i11 / this.f27144i);
        float degrees3 = ((fLerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f27144i));
        float f19 = (fLerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z11 = ((CircularProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27149n) && z10 && f12 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f27141f);
        float f20 = this.f27142g * 2.0f;
        float f21 = degrees * 2.0f;
        if (degrees3 < f21) {
            float f22 = degrees3 / f21;
            float f23 = f19 + (degrees * f22);
            DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint();
            if (z11) {
                float length = ((f23 / 360.0f) * this.f27213d.getLength()) / 2.0f;
                float f24 = this.f27143h * f12;
                float f25 = this.f27144i;
                if (f25 != this.f27148m || f24 != this.f27146k) {
                    this.f27146k = f24;
                    this.f27148m = f25;
                    g();
                }
                this.f27213d.getPosTan(length, pathPoint.f27223a, pathPoint.f27224b);
            } else {
                pathPoint.rotate(f23 + 90.0f);
                pathPoint.a(-this.f27144i);
            }
            paint.setStyle(Paint.Style.FILL);
            o(canvas, paint, pathPoint, f20, this.f27141f, f22);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(((CircularProgressIndicatorSpec) this.f27210a).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f26 = f19 + degrees;
        float f27 = degrees3 - f21;
        ((DrawingDelegate.PathPoint) this.f27152q.first).reset();
        ((DrawingDelegate.PathPoint) this.f27152q.second).reset();
        if (z11) {
            k(this.f27213d, this.f27212c, this.f27152q, f26 / 360.0f, f27 / 360.0f, f12, f13);
            canvas.drawPath(this.f27212c, paint);
        } else {
            ((DrawingDelegate.PathPoint) this.f27152q.first).rotate(f26 + 90.0f);
            ((DrawingDelegate.PathPoint) this.f27152q.first).a(-this.f27144i);
            ((DrawingDelegate.PathPoint) this.f27152q.second).rotate(f26 + f27 + 90.0f);
            ((DrawingDelegate.PathPoint) this.f27152q.second).a(-this.f27144i);
            RectF rectF = this.f27151p;
            float f28 = this.f27144i;
            rectF.set(-f28, -f28, f28, f28);
            canvas.drawArc(this.f27151p, f26, f27, false, paint);
        }
        if (((CircularProgressIndicatorSpec) this.f27210a).useStrokeCap() || this.f27142g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        n(canvas, paint, (DrawingDelegate.PathPoint) this.f27152q.first, f20, this.f27141f);
        n(canvas, paint, (DrawingDelegate.PathPoint) this.f27152q.second, f20, this.f27141f);
    }

    private void n(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f10, float f11) {
        o(canvas, paint, pathPoint, f10, f11, 1.0f);
    }

    private void o(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f10, float f11, float f12) {
        float fMin = Math.min(f11, this.f27141f);
        float f13 = f10 / 2.0f;
        float fMin2 = Math.min(f13, (this.f27142g * fMin) / this.f27141f);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f13, fMin / 2.0f);
        canvas.save();
        float[] fArr = pathPoint.f27223a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i(pathPoint.f27224b));
        canvas.scale(f12, f12);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int p() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27210a;
        return ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize + (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27210a;
        float f11 = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((CircularProgressIndicatorSpec) this.f27210a).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f27210a;
        this.f27141f = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).trackThickness * f10;
        this.f27142g = Math.min(((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).trackThickness / 2, ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec2).getTrackCornerRadiusInPx()) * f10;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec3 = this.f27210a;
        this.f27143h = ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).waveAmplitude * f10;
        float f13 = (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).indicatorSize - ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).trackThickness) / 2.0f;
        this.f27144i = f13;
        if (z10 || z11) {
            float f14 = ((1.0f - f10) * ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).trackThickness) / 2.0f;
            if ((z10 && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).showAnimationBehavior == 2) || (z11 && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).hideAnimationBehavior == 1)) {
                this.f27144i = f13 + f14;
            } else if ((z10 && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).showAnimationBehavior == 1) || (z11 && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).hideAnimationBehavior == 2)) {
                this.f27144i = f13 - f14;
            }
        }
        if (z11 && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec3).hideAnimationBehavior == 3) {
            this.f27150o = f10;
        } else {
            this.f27150o = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void b(Canvas canvas, Paint paint, int i10, int i11) {
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void c(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.f27217c, i10);
        canvas.save();
        canvas.rotate(activeIndicator.f27221g);
        this.f27149n = activeIndicator.f27222h;
        float f10 = activeIndicator.f27215a;
        float f11 = activeIndicator.f27216b;
        int i11 = activeIndicator.f27218d;
        m(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11, activeIndicator.f27219e, activeIndicator.f27220f, true);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i10, i11);
        this.f27149n = false;
        m(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int e() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int f() {
        return p();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void g() {
        this.f27211b.rewind();
        this.f27211b.moveTo(1.0f, 0.0f);
        for (int i10 = 0; i10 < 2; i10++) {
            this.f27211b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.f27211b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.f27211b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.f27211b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.f27214e.reset();
        Matrix matrix = this.f27214e;
        float f10 = this.f27144i;
        matrix.setScale(f10, f10);
        this.f27211b.transform(this.f27214e);
        if (((CircularProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27149n)) {
            this.f27213d.setPath(this.f27211b, false);
            l(this.f27213d, this.f27211b, this.f27146k);
        }
        this.f27213d.setPath(this.f27211b, false);
    }
}
