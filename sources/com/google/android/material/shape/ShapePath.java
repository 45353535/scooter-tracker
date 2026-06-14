package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ShapePath {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27570a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27571b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27572c;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    static class ArcShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PathArcOperation f27576c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f27576c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i10, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.f27576c.j(), this.f27576c.n(), this.f27576c.k(), this.f27576c.i()), i10, this.f27576c.l(), this.f27576c.m());
        }
    }

    static class InnerCornerShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PathLineOperation f27577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final PathLineOperation f27578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f27579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f27580f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f10, float f11) {
            this.f27577c = pathLineOperation;
            this.f27578d = pathLineOperation2;
            this.f27579e = f10;
            this.f27580f = f11;
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.f27578d.f27592c - this.f27577c.f27592c) / (this.f27578d.f27591b - this.f27577c.f27591b)));
        }

        float b() {
            return (float) Math.toDegrees(Math.atan((this.f27577c.f27592c - this.f27580f) / (this.f27577c.f27591b - this.f27579e)));
        }

        float c() {
            float fA = ((a() - b()) + 360.0f) % 360.0f;
            return fA <= 180.0f ? fA : fA - 360.0f;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i10, Canvas canvas) {
            int i11;
            float fC = c();
            if (fC > 0.0f) {
                return;
            }
            double dHypot = Math.hypot(this.f27577c.f27591b - this.f27579e, this.f27577c.f27592c - this.f27580f);
            double dHypot2 = Math.hypot(this.f27578d.f27591b - this.f27577c.f27591b, this.f27578d.f27592c - this.f27577c.f27592c);
            float fMin = (float) Math.min(i10, Math.min(dHypot, dHypot2));
            double d10 = fMin;
            double dTan = Math.tan(Math.toRadians((-fC) / 2.0f)) * d10;
            if (dHypot > dTan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (dHypot - dTan), 0.0f);
                this.f27595a.set(matrix);
                this.f27595a.preTranslate(this.f27579e, this.f27580f);
                this.f27595a.preRotate(b());
                i11 = i10;
                shadowRenderer.drawEdgeShadow(canvas, this.f27595a, rectF, i11);
            } else {
                i11 = i10;
            }
            float f10 = fMin * 2.0f;
            RectF rectF2 = new RectF(0.0f, 0.0f, f10, f10);
            this.f27595a.set(matrix);
            this.f27595a.preTranslate(this.f27577c.f27591b, this.f27577c.f27592c);
            this.f27595a.preRotate(b());
            this.f27595a.preTranslate((float) ((-dTan) - d10), (-2.0f) * fMin);
            shadowRenderer.drawInnerCornerShadow(canvas, this.f27595a, rectF2, (int) fMin, 450.0f, fC, new float[]{(float) (d10 + dTan), f10});
            if (dHypot2 > dTan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (dHypot2 - dTan), 0.0f);
                this.f27595a.set(matrix);
                this.f27595a.preTranslate(this.f27577c.f27591b, this.f27577c.f27592c);
                this.f27595a.preRotate(a());
                this.f27595a.preTranslate((float) dTan, 0.0f);
                shadowRenderer.drawEdgeShadow(canvas, this.f27595a, rectF3, i11);
            }
        }
    }

    static class LineShadowOperation extends ShadowCompatOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PathLineOperation f27581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f27582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f27583e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f10, float f11) {
            this.f27581c = pathLineOperation;
            this.f27582d = f10;
            this.f27583e = f11;
        }

        float a() {
            return (float) Math.toDegrees(Math.atan((this.f27581c.f27592c - this.f27583e) / (this.f27581c.f27591b - this.f27582d)));
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i10, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f27581c.f27592c - this.f27583e, this.f27581c.f27591b - this.f27582d), 0.0f);
            this.f27595a.set(matrix);
            this.f27595a.preTranslate(this.f27582d, this.f27583e);
            this.f27595a.preRotate(a());
            shadowRenderer.drawEdgeShadow(canvas, this.f27595a, rectF, i10);
        }
    }

    public static class PathArcOperation extends PathOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final RectF f27584b = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        @Deprecated
        public float top;

        public PathArcOperation(float f10, float f11, float f12, float f13) {
            p(f10);
            t(f11);
            q(f12);
            o(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float i() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.top;
        }

        private void o(float f10) {
            this.bottom = f10;
        }

        private void p(float f10) {
            this.left = f10;
        }

        private void q(float f10) {
            this.right = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(float f10) {
            this.startAngle = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.sweepAngle = f10;
        }

        private void t(float f10) {
            this.top = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f27593a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f27584b;
            rectF.set(j(), n(), k(), i());
            path.arcTo(rectF, l(), m(), false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f27587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f27588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f27589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f27590g;

        public PathCubicOperation(float f10, float f11, float f12, float f13, float f14, float f15) {
            a(f10);
            c(f11);
            b(f12);
            d(f13);
            e(f14);
            f(f15);
        }

        private void a(float f10) {
            this.f27585b = f10;
        }

        private void b(float f10) {
            this.f27587d = f10;
        }

        private void c(float f10) {
            this.f27586c = f10;
        }

        private void d(float f10) {
            this.f27588e = f10;
        }

        private void e(float f10) {
            this.f27589f = f10;
        }

        private void f(float f10) {
            this.f27590g = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f27593a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f27585b, this.f27586c, this.f27587d, this.f27588e, this.f27589f, this.f27590g);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27592c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f27593a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f27591b, this.f27592c);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f27593a = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float e() {
            return this.controlX;
        }

        private float f() {
            return this.controlY;
        }

        private float g() {
            return this.endX;
        }

        private float h() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(float f10) {
            this.controlX = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f10) {
            this.controlY = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f10) {
            this.endX = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f10) {
            this.endY = f10;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f27593a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(e(), f(), g(), h());
            path.transform(matrix);
        }
    }

    static abstract class ShadowCompatOperation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f27594b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f27595a = new Matrix();

        ShadowCompatOperation() {
        }

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i10, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i10, Canvas canvas) {
            draw(f27594b, shadowRenderer, i10, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void a(float f10) {
        if (e() == f10) {
            return;
        }
        float fE = ((f10 - e()) + 360.0f) % 360.0f;
        if (fE > 180.0f) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(g(), h(), g(), h());
        pathArcOperation.r(e());
        pathArcOperation.s(fE);
        this.f27571b.add(new ArcShadowOperation(pathArcOperation));
        k(f10);
    }

    private void b(ShadowCompatOperation shadowCompatOperation, float f10, float f11) {
        a(f10);
        this.f27571b.add(shadowCompatOperation);
        k(f11);
    }

    private float e() {
        return this.currentShadowAngle;
    }

    private float f() {
        return this.endShadowAngle;
    }

    private void k(float f10) {
        this.currentShadowAngle = f10;
    }

    private void l(float f10) {
        this.endShadowAngle = f10;
    }

    private void m(float f10) {
        this.endX = f10;
    }

    private void n(float f10) {
        this.endY = f10;
    }

    private void o(float f10) {
        this.startX = f10;
    }

    private void p(float f10) {
        this.startY = f10;
    }

    public void addArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        PathArcOperation pathArcOperation = new PathArcOperation(f10, f11, f12, f13);
        pathArcOperation.r(f14);
        pathArcOperation.s(f15);
        this.f27570a.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        b(arcShadowOperation, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        m(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        n(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.f27570a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((PathOperation) this.f27570a.get(i10)).applyToPath(matrix, path);
        }
    }

    boolean c() {
        return this.f27572c;
    }

    public void cubicToPoint(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f27570a.add(new PathCubicOperation(f10, f11, f12, f13, f14, f15));
        this.f27572c = true;
        m(f14);
        n(f15);
    }

    ShadowCompatOperation d(Matrix matrix) {
        a(f());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.f27571b);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i10, Canvas canvas) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ShadowCompatOperation) it.next()).draw(matrix2, shadowRenderer, i10, canvas);
                }
            }
        };
    }

    float g() {
        return this.endX;
    }

    float h() {
        return this.endY;
    }

    float i() {
        return this.startX;
    }

    float j() {
        return this.startY;
    }

    public void lineTo(float f10, float f11) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f27591b = f10;
        pathLineOperation.f27592c = f11;
        this.f27570a.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, g(), h());
        b(lineShadowOperation, lineShadowOperation.a() + 270.0f, lineShadowOperation.a() + 270.0f);
        m(f10);
        n(f11);
    }

    public void quadToPoint(float f10, float f11, float f12, float f13) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.i(f10);
        pathQuadOperation.j(f11);
        pathQuadOperation.k(f12);
        pathQuadOperation.l(f13);
        this.f27570a.add(pathQuadOperation);
        this.f27572c = true;
        m(f12);
        n(f13);
    }

    public void reset(float f10, float f11) {
        reset(f10, f11, 270.0f, 0.0f);
    }

    public void reset(float f10, float f11, float f12, float f13) {
        o(f10);
        p(f11);
        m(f10);
        n(f11);
        k(f12);
        l((f12 + f13) % 360.0f);
        this.f27570a.clear();
        this.f27571b.clear();
        this.f27572c = false;
    }

    public ShapePath(float f10, float f11) {
        reset(f10, f11);
    }

    public void lineTo(float f10, float f11, float f12, float f13) {
        if ((Math.abs(f10 - g()) < 0.001f && Math.abs(f11 - h()) < 0.001f) || (Math.abs(f10 - f12) < 0.001f && Math.abs(f11 - f13) < 0.001f)) {
            lineTo(f12, f13);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f27591b = f10;
        pathLineOperation.f27592c = f11;
        this.f27570a.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f27591b = f12;
        pathLineOperation2.f27592c = f13;
        this.f27570a.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, g(), h());
        if (innerCornerShadowOperation.c() > 0.0f) {
            lineTo(f10, f11);
            lineTo(f12, f13);
        } else {
            b(innerCornerShadowOperation, innerCornerShadowOperation.b() + 270.0f, innerCornerShadowOperation.a() + 270.0f);
            m(f12);
            n(f13);
        }
    }
}
