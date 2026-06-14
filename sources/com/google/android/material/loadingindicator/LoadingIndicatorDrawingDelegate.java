package com.google.android.material.loadingindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.graphics.shapes.Shapes_androidKt;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shape.MaterialShapes;

/* JADX INFO: loaded from: classes9.dex */
class LoadingIndicatorDrawingDelegate {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final RoundedPolygon[] f26908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Morph[] f26909e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LoadingIndicatorSpec f26910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Path f26911b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Matrix f26912c = new Matrix();

    protected static class IndicatorState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f26914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f26915c;

        protected IndicatorState() {
        }
    }

    static {
        int i10 = 0;
        RoundedPolygon[] roundedPolygonArr = {MaterialShapes.normalize(MaterialShapes.SOFT_BURST, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_9, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PENTAGON, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PILL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.SUNNY, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_4, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.OVAL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
        f26908d = roundedPolygonArr;
        f26909e = new Morph[roundedPolygonArr.length];
        while (true) {
            RoundedPolygon[] roundedPolygonArr2 = f26908d;
            if (i10 >= roundedPolygonArr2.length) {
                return;
            }
            int i11 = i10 + 1;
            f26909e[i10] = new Morph(roundedPolygonArr2[i10], roundedPolygonArr2[i11 % roundedPolygonArr2.length]);
            i10 = i11;
        }
    }

    public LoadingIndicatorDrawingDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f26910a = loadingIndicatorSpec;
    }

    void a(Canvas canvas, Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.f26910a.f26916a) {
            float fMin = Math.min(rect.width() / e(), rect.height() / d());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-e()) / 2.0f, (-d()) / 2.0f, e() / 2.0f, d() / 2.0f);
        canvas.rotate(-90.0f);
    }

    void b(Canvas canvas, Paint paint, int i10, int i11) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26910a;
        float fMin = Math.min(loadingIndicatorSpec.f26918c, loadingIndicatorSpec.f26919d) / 2.0f;
        paint.setColor(MaterialColors.compositeARGBWithAlpha(i10, i11));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.f26910a;
        canvas.drawRoundRect(new RectF((-r2) / 2.0f, (-r9) / 2.0f, loadingIndicatorSpec2.f26918c / 2.0f, loadingIndicatorSpec2.f26919d / 2.0f), fMin, fMin, paint);
    }

    void c(Canvas canvas, Paint paint, IndicatorState indicatorState, int i10) {
        paint.setColor(MaterialColors.compositeARGBWithAlpha(indicatorState.f26913a, i10));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(indicatorState.f26915c);
        this.f26911b.rewind();
        int iFloor = (int) Math.floor(indicatorState.f26914b);
        Morph[] morphArr = f26909e;
        Shapes_androidKt.toPath(morphArr[MathUtils.floorMod(iFloor, morphArr.length)], indicatorState.f26914b - iFloor, this.f26911b);
        Matrix matrix = this.f26912c;
        int i11 = this.f26910a.f26917b;
        matrix.setScale(i11 / 2.0f, i11 / 2.0f);
        this.f26911b.transform(this.f26912c);
        canvas.drawPath(this.f26911b, paint);
        canvas.restore();
    }

    int d() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26910a;
        return Math.max(loadingIndicatorSpec.f26918c, loadingIndicatorSpec.f26917b);
    }

    int e() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.f26910a;
        return Math.max(loadingIndicatorSpec.f26919d, loadingIndicatorSpec.f26917b);
    }
}
