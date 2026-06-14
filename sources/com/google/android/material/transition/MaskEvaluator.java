package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

/* JADX INFO: loaded from: classes9.dex */
class MaskEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f28332a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f28333b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f28334c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ShapeAppearancePathProvider f28335d = ShapeAppearancePathProvider.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ShapeAppearanceModel f28336e;

    MaskEvaluator() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f28332a);
    }

    void b(float f10, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel shapeAppearanceModelO = TransitionUtils.o(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f10);
        this.f28336e = shapeAppearanceModelO;
        this.f28335d.calculatePath(shapeAppearanceModelO, 1.0f, rectF2, this.f28333b);
        this.f28335d.calculatePath(this.f28336e, 1.0f, rectF3, this.f28334c);
        this.f28332a.op(this.f28333b, this.f28334c, Path.Op.UNION);
    }

    ShapeAppearanceModel c() {
        return this.f28336e;
    }

    Path d() {
        return this.f28332a;
    }
}
