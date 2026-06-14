package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes9.dex */
public class ShapeAppearancePathProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ShapePath[] f27557a = new ShapePath[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f27558b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f27559c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f27560d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f27561e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f27562f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ShapePath f27563g = new ShapePath();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f27564h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f27565i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f27566j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f27567k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27568l = true;

    private static class Lazy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final ShapeAppearancePathProvider f27569a = new ShapeAppearancePathProvider();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i10);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i10);
    }

    static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;

        @Nullable
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f10;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f27557a[i10] = new ShapePath();
            this.f27558b[i10] = new Matrix();
            this.f27559c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10) {
        this.f27564h[0] = this.f27557a[i10].i();
        this.f27564h[1] = this.f27557a[i10].j();
        this.f27558b[i10].mapPoints(this.f27564h);
        if (i10 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.f27564h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.f27564h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f27557a[i10].applyToPath(this.f27558b[i10], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.f27557a[i10], this.f27558b[i10], i10);
        }
    }

    private void c(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f27564h[0] = this.f27557a[i10].g();
        this.f27564h[1] = this.f27557a[i10].h();
        this.f27558b[i10].mapPoints(this.f27564h);
        this.f27565i[0] = this.f27557a[i11].i();
        this.f27565i[1] = this.f27557a[i11].j();
        this.f27558b[i11].mapPoints(this.f27565i);
        float f10 = this.f27564h[0];
        float[] fArr = this.f27565i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fG = g(shapeAppearancePathSpec.bounds, i10);
        this.f27563g.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentH = h(i10, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentH.getEdgePath(fMax, fG, shapeAppearancePathSpec.interpolation, this.f27563g);
        this.f27566j.reset();
        this.f27563g.applyToPath(this.f27559c[i10], this.f27566j);
        if (this.f27568l && (edgeTreatmentH.a() || i(this.f27566j, i10) || i(this.f27566j, i11))) {
            Path path = this.f27566j;
            path.op(path, this.f27562f, Path.Op.DIFFERENCE);
            this.f27564h[0] = this.f27563g.i();
            this.f27564h[1] = this.f27563g.j();
            this.f27559c[i10].mapPoints(this.f27564h);
            Path path2 = this.f27561e;
            float[] fArr2 = this.f27564h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f27563g.applyToPath(this.f27559c[i10], this.f27561e);
        } else {
            this.f27563g.applyToPath(this.f27559c[i10], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.f27563g, this.f27559c[i10], i10);
        }
    }

    private void d(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerTreatment f(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float g(RectF rectF, int i10) {
        float[] fArr = this.f27564h;
        ShapePath shapePath = this.f27557a[i10];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.f27558b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f27564h[0]) : Math.abs(rectF.centerY() - this.f27564h[1]);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.f27569a;
    }

    private EdgeTreatment h(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    private boolean i(Path path, int i10) {
        this.f27567k.reset();
        this.f27557a[i10].applyToPath(this.f27558b[i10], this.f27567k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f27567k.computeBounds(rectF, true);
        path.op(this.f27567k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void j(ShapeAppearancePathSpec shapeAppearancePathSpec, int i10, float[] fArr) {
        f(i10, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.f27557a[i10], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, fArr == null ? e(i10, shapeAppearancePathSpec.shapeAppearanceModel) : new ClampedCornerSize(fArr[i10]));
        float fA = a(i10);
        this.f27558b[i10].reset();
        d(i10, shapeAppearancePathSpec.bounds, this.f27560d);
        Matrix matrix = this.f27558b[i10];
        PointF pointF = this.f27560d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f27558b[i10].preRotate(fA);
    }

    private void l(int i10) {
        this.f27564h[0] = this.f27557a[i10].g();
        this.f27564h[1] = this.f27557a[i10].h();
        this.f27558b[i10].mapPoints(this.f27564h);
        float fA = a(i10);
        this.f27559c[i10].reset();
        Matrix matrix = this.f27559c[i10];
        float[] fArr = this.f27564h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f27559c[i10].preRotate(fA);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f10, rectF, null, path);
    }

    CornerSize e(int i10, ShapeAppearanceModel shapeAppearanceModel) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    void k(boolean z10) {
        this.f27568l = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f10, RectF rectF, PathListener pathListener, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, null, f10, rectF, pathListener, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, float f10, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.f27561e.rewind();
        this.f27562f.rewind();
        this.f27562f.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f10, rectF, pathListener, path);
        for (int i10 = 0; i10 < 4; i10++) {
            j(shapeAppearancePathSpec, i10, fArr);
            l(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(shapeAppearancePathSpec, i11);
            c(shapeAppearancePathSpec, i11);
        }
        path.close();
        this.f27561e.close();
        if (this.f27561e.isEmpty()) {
            return;
        }
        path.op(this.f27561e, Path.Op.UNION);
    }
}
