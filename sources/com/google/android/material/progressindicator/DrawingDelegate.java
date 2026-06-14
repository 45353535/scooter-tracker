package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    BaseProgressIndicatorSpec f27210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Path f27211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Path f27212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final PathMeasure f27213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Matrix f27214e;

    protected static class ActiveIndicator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f27215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f27216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f27219e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f27220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f27221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f27222h;

        protected ActiveIndicator() {
        }
    }

    public DrawingDelegate(S s10) {
        Path path = new Path();
        this.f27211b = path;
        this.f27212c = new Path();
        this.f27213d = new PathMeasure(path, false);
        this.f27210a = s10;
        this.f27214e = new Matrix();
    }

    abstract void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11);

    abstract void b(Canvas canvas, Paint paint, int i10, int i11);

    abstract void c(Canvas canvas, Paint paint, ActiveIndicator activeIndicator, int i10);

    abstract void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12);

    abstract int e();

    abstract int f();

    abstract void g();

    void h(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f27210a.c();
        a(canvas, rect, f10, z10, z11);
    }

    float i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    protected class PathPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float[] f27223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float[] f27224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Matrix f27225c;

        public PathPoint() {
            this.f27223a = new float[2];
            this.f27224b = new float[]{1.0f, 0.0f};
            this.f27225c = new Matrix();
        }

        void a(float f10) {
            float[] fArr = this.f27224b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.f27223a;
            double d10 = f10;
            double d11 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d11) * d10));
            float[] fArr3 = this.f27223a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d10 * Math.sin(d11)));
        }

        void b(float f10) {
            float[] fArr = this.f27224b;
            float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
            float[] fArr2 = this.f27223a;
            double d10 = f10;
            double d11 = fAtan2;
            fArr2[0] = (float) (((double) fArr2[0]) + (Math.cos(d11) * d10));
            float[] fArr3 = this.f27223a;
            fArr3[1] = (float) (((double) fArr3[1]) + (d10 * Math.sin(d11)));
        }

        void c(float f10, float f11) {
            float[] fArr = this.f27223a;
            fArr[0] = fArr[0] * f10;
            fArr[1] = fArr[1] * f11;
            float[] fArr2 = this.f27224b;
            fArr2[0] = fArr2[0] * f10;
            fArr2[1] = fArr2[1] * f11;
        }

        void d(float f10, float f11) {
            float[] fArr = this.f27223a;
            fArr[0] = fArr[0] + f10;
            fArr[1] = fArr[1] + f11;
        }

        public void reset() {
            Arrays.fill(this.f27223a, 0.0f);
            Arrays.fill(this.f27224b, 0.0f);
            this.f27224b[0] = 1.0f;
            this.f27225c.reset();
        }

        public void rotate(float f10) {
            this.f27225c.reset();
            this.f27225c.setRotate(f10);
            this.f27225c.mapPoints(this.f27223a);
            this.f27225c.mapPoints(this.f27224b);
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.f27223a, pathPoint.f27224b);
        }

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.f27223a = fArr3;
            this.f27224b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.f27224b, 0, 2);
            this.f27225c = new Matrix();
        }
    }
}
