package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.DrawingDelegate;

/* JADX INFO: loaded from: classes9.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f27232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f27234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f27235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f27236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f27237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f27240n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Pair f27241o;

    LinearDrawingDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f27232f = 300.0f;
        this.f27241o = new Pair(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void j(PathMeasure pathMeasure, Path path, Pair pair, float f10, float f11, float f12, float f13) {
        int i10 = this.f27239m ? ((LinearProgressIndicatorSpec) this.f27210a).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.f27210a).wavelengthIndeterminate;
        if (pathMeasure == this.f27213d && i10 != this.f27238l) {
            this.f27238l = i10;
            g();
        }
        path.rewind();
        float f14 = (-this.f27232f) / 2.0f;
        boolean zHasWavyEffect = ((LinearProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27239m);
        if (zHasWavyEffect) {
            float f15 = this.f27232f;
            float f16 = this.f27237k;
            float f17 = f15 / f16;
            float f18 = f13 / f17;
            float f19 = f17 / (f17 + 1.0f);
            f10 = (f10 + f18) * f19;
            f11 = (f11 + f18) * f19;
            f14 -= f13 * f16;
        }
        float length = f10 * pathMeasure.getLength();
        float length2 = f11 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.f27223a, pathPoint.f27224b);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.f27223a, pathPoint2.f27224b);
        this.f27214e.reset();
        this.f27214e.setTranslate(f14, 0.0f);
        pathPoint.d(f14, 0.0f);
        pathPoint2.d(f14, 0.0f);
        if (zHasWavyEffect) {
            float f20 = this.f27236j * f12;
            this.f27214e.postScale(1.0f, f20);
            pathPoint.c(1.0f, f20);
            pathPoint2.c(1.0f, f20);
        }
        path.transform(this.f27214e);
    }

    private void k(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12, float f12, float f13, boolean z10) {
        float f14;
        float fLerp;
        Paint paint2;
        Canvas canvas2;
        float fClamp = MathUtils.clamp(f10, 0.0f, 1.0f);
        float fClamp2 = MathUtils.clamp(f11, 0.0f, 1.0f);
        float fLerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.f27240n, 1.0f, fClamp);
        float fLerp3 = com.google.android.material.math.MathUtils.lerp(1.0f - this.f27240n, 1.0f, fClamp2);
        int iClamp = (int) ((i11 * MathUtils.clamp(fLerp2, 0.0f, 0.01f)) / 0.01f);
        int iClamp2 = (int) ((i12 * (1.0f - MathUtils.clamp(fLerp3, 0.99f, 1.0f))) / 0.01f);
        float f15 = this.f27232f;
        int i13 = (int) ((fLerp2 * f15) + iClamp);
        int i14 = (int) ((fLerp3 * f15) - iClamp2);
        float f16 = this.f27234h;
        float f17 = this.f27235i;
        if (f16 != f17) {
            float fMax = Math.max(f16, f17);
            float f18 = this.f27232f;
            float f19 = fMax / f18;
            float fLerp4 = com.google.android.material.math.MathUtils.lerp(this.f27234h, this.f27235i, MathUtils.clamp(i13 / f18, 0.0f, f19) / f19);
            float f20 = this.f27234h;
            float f21 = this.f27235i;
            float f22 = this.f27232f;
            fLerp = com.google.android.material.math.MathUtils.lerp(f20, f21, MathUtils.clamp((f22 - i14) / f22, 0.0f, f19) / f19);
            f14 = fLerp4;
        } else {
            f14 = f16;
            fLerp = f14;
        }
        float f23 = (-this.f27232f) / 2.0f;
        boolean z11 = ((LinearProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27239m) && z10 && f12 > 0.0f;
        if (i13 <= i14) {
            float f24 = i13 + f14;
            float f25 = i14 - fLerp;
            float f26 = f14 * 2.0f;
            float f27 = 2.0f * fLerp;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f27233g);
            ((DrawingDelegate.PathPoint) this.f27241o.first).reset();
            ((DrawingDelegate.PathPoint) this.f27241o.second).reset();
            ((DrawingDelegate.PathPoint) this.f27241o.first).d(f24 + f23, 0.0f);
            ((DrawingDelegate.PathPoint) this.f27241o.second).d(f23 + f25, 0.0f);
            if (i13 == 0 && f25 + fLerp < f24 + f14) {
                Pair pair = this.f27241o;
                DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f28 = this.f27233g;
                m(canvas, paint, pathPoint, f26, f28, f14, (DrawingDelegate.PathPoint) pair.second, f27, f28, fLerp, true);
                return;
            }
            if (f24 - f14 > f25 - fLerp) {
                Pair pair2 = this.f27241o;
                DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f29 = this.f27233g;
                m(canvas, paint, pathPoint2, f27, f29, fLerp, (DrawingDelegate.PathPoint) pair2.first, f26, f29, f14, false);
                return;
            }
            float f30 = fLerp;
            float f31 = f14;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(((LinearProgressIndicatorSpec) this.f27210a).useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z11) {
                paint2 = paint;
                PathMeasure pathMeasure = this.f27213d;
                Path path = this.f27212c;
                Pair pair3 = this.f27241o;
                float f32 = this.f27232f;
                j(pathMeasure, path, pair3, f24 / f32, f25 / f32, f12, f13);
                canvas2 = canvas;
                canvas2.drawPath(this.f27212c, paint2);
            } else {
                Pair pair4 = this.f27241o;
                Object obj = pair4.first;
                float f33 = ((DrawingDelegate.PathPoint) obj).f27223a[0];
                float f34 = ((DrawingDelegate.PathPoint) obj).f27223a[1];
                Object obj2 = pair4.second;
                canvas.drawLine(f33, f34, ((DrawingDelegate.PathPoint) obj2).f27223a[0], ((DrawingDelegate.PathPoint) obj2).f27223a[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            }
            if (((LinearProgressIndicatorSpec) this.f27210a).useStrokeCap()) {
                return;
            }
            if (f24 > 0.0f && f31 > 0.0f) {
                l(canvas2, paint2, (DrawingDelegate.PathPoint) this.f27241o.first, f26, this.f27233g, f31);
            }
            if (f25 >= this.f27232f || f30 <= 0.0f) {
                return;
            }
            l(canvas, paint, (DrawingDelegate.PathPoint) this.f27241o.second, f27, this.f27233g, f30);
        }
    }

    private void l(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f10, float f11, float f12) {
        m(canvas, paint, pathPoint, f10, f11, f12, null, 0.0f, 0.0f, 0.0f, false);
    }

    private void m(Canvas canvas, Paint paint, DrawingDelegate.PathPoint pathPoint, float f10, float f11, float f12, DrawingDelegate.PathPoint pathPoint2, float f13, float f14, float f15, boolean z10) {
        char c10;
        float f16;
        float f17;
        float fMin = Math.min(f11, this.f27233g);
        float f18 = (-f10) / 2.0f;
        float f19 = (-fMin) / 2.0f;
        float f20 = f10 / 2.0f;
        float f21 = fMin / 2.0f;
        RectF rectF = new RectF(f18, f19, f20, f21);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float fMin2 = Math.min(f14, this.f27233g);
            float fMin3 = Math.min(f13 / 2.0f, (f15 * fMin2) / this.f27233g);
            RectF rectF2 = new RectF();
            if (z10) {
                c10 = 0;
                float f22 = (pathPoint2.f27223a[0] - fMin3) - (pathPoint.f27223a[0] - f12);
                if (f22 > 0.0f) {
                    pathPoint2.d((-f22) / 2.0f, 0.0f);
                    f17 = f13 + f22;
                } else {
                    f17 = f13;
                }
                rectF2.set(0.0f, f19, f20, f21);
            } else {
                c10 = 0;
                float f23 = (pathPoint2.f27223a[0] + fMin3) - (pathPoint.f27223a[0] + f12);
                if (f23 < 0.0f) {
                    pathPoint2.d((-f23) / 2.0f, 0.0f);
                    f16 = f13 - f23;
                } else {
                    f16 = f13;
                }
                rectF2.set(f18, f19, 0.0f, f21);
                f17 = f16;
            }
            RectF rectF3 = new RectF((-f17) / 2.0f, (-fMin2) / 2.0f, f17 / 2.0f, fMin2 / 2.0f);
            float[] fArr = pathPoint2.f27223a;
            canvas.translate(fArr[c10], fArr[1]);
            canvas.rotate(i(pathPoint2.f27224b));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(pathPoint2.f27224b));
            float[] fArr2 = pathPoint2.f27223a;
            canvas.translate(-fArr2[c10], -fArr2[1]);
            float[] fArr3 = pathPoint.f27223a;
            canvas.translate(fArr3[c10], fArr3[1]);
            canvas.rotate(i(pathPoint.f27224b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f12, f12, paint);
        } else {
            float[] fArr4 = pathPoint.f27223a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(pathPoint.f27224b));
            canvas.drawRoundRect(rectF, f12, f12, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        if (this.f27232f != rect.width()) {
            this.f27232f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - fE) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f27210a).f27263a) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f11 = this.f27232f / 2.0f;
        float f12 = fE / 2.0f;
        canvas.clipRect(-f11, -f12, f11, f12);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27210a;
        this.f27233g = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness * f10;
        this.f27234h = Math.min(((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness / 2, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).getTrackCornerRadiusInPx()) * f10;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f27210a;
        this.f27236j = ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).waveAmplitude * f10;
        this.f27235i = Math.min(((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).getTrackInnerCornerRadiusInPx()) * f10;
        if (z10 || z11) {
            if ((z10 && ((LinearProgressIndicatorSpec) this.f27210a).showAnimationBehavior == 2) || (z11 && ((LinearProgressIndicatorSpec) this.f27210a).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((LinearProgressIndicatorSpec) this.f27210a).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f27210a).trackThickness * (1.0f - f10)) / 2.0f);
            }
        }
        if (z11 && ((LinearProgressIndicatorSpec) this.f27210a).hideAnimationBehavior == 3) {
            this.f27240n = f10;
        } else {
            this.f27240n = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void b(Canvas canvas, Paint paint, int i10, int i11) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i10, i11);
        this.f27239m = false;
        if (((LinearProgressIndicatorSpec) this.f27210a).trackStopIndicatorSize <= 0 || iCompositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iCompositeARGBWithAlpha);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27210a;
        DrawingDelegate.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.f27232f / 2.0f) - (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorPadding != null ? ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorPadding.floatValue() + (((LinearProgressIndicatorSpec) this.f27210a).trackStopIndicatorSize / 2.0f) : this.f27233g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        BaseProgressIndicatorSpec baseProgressIndicatorSpec2 = this.f27210a;
        l(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).trackStopIndicatorSize, (this.f27234h * ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec2).trackStopIndicatorSize) / this.f27233g);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void c(Canvas canvas, Paint paint, DrawingDelegate.ActiveIndicator activeIndicator, int i10) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.f27217c, i10);
        this.f27239m = activeIndicator.f27222h;
        float f10 = activeIndicator.f27215a;
        float f11 = activeIndicator.f27216b;
        int i11 = activeIndicator.f27218d;
        k(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i11, i11, activeIndicator.f27219e, activeIndicator.f27220f, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        int iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i10, i11);
        this.f27239m = false;
        k(canvas, paint, f10, f11, iCompositeARGBWithAlpha, i12, i12, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int e() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f27210a;
        return ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness + (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).waveAmplitude * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int f() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void g() {
        this.f27211b.rewind();
        if (((LinearProgressIndicatorSpec) this.f27210a).hasWavyEffect(this.f27239m)) {
            int i10 = this.f27239m ? ((LinearProgressIndicatorSpec) this.f27210a).wavelengthDeterminate : ((LinearProgressIndicatorSpec) this.f27210a).wavelengthIndeterminate;
            float f10 = this.f27232f;
            int i11 = (int) (f10 / i10);
            this.f27237k = f10 / i11;
            for (int i12 = 0; i12 <= i11; i12++) {
                int i13 = i12 * 2;
                float f11 = i13 + 1;
                this.f27211b.cubicTo(i13 + 0.48f, 0.0f, f11 - 0.48f, 1.0f, f11, 1.0f);
                float f12 = i13 + 2;
                this.f27211b.cubicTo(f11 + 0.48f, 1.0f, f12 - 0.48f, 0.0f, f12, 0.0f);
            }
            this.f27214e.reset();
            this.f27214e.setScale(this.f27237k / 2.0f, -2.0f);
            this.f27214e.postTranslate(0.0f, 1.0f);
            this.f27211b.transform(this.f27214e);
        } else {
            this.f27211b.lineTo(this.f27232f, 0.0f);
        }
        this.f27213d.setPath(this.f27211b, false);
    }
}
