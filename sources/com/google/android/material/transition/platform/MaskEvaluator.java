package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
class MaskEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f28470a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f28471b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f28472c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ShapeAppearancePathProvider f28473d = ShapeAppearancePathProvider.getInstance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ShapeAppearanceModel f28474e;

    MaskEvaluator() {
    }

    void a(Canvas canvas) {
        canvas.clipPath(this.f28470a);
    }

    void b(float f10, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel shapeAppearanceModelP = TransitionUtils.p(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f10);
        this.f28474e = shapeAppearanceModelP;
        this.f28473d.calculatePath(shapeAppearanceModelP, 1.0f, rectF2, this.f28471b);
        this.f28473d.calculatePath(this.f28474e, 1.0f, rectF3, this.f28472c);
        this.f28470a.op(this.f28471b, this.f28472c, Path.Op.UNION);
    }

    ShapeAppearanceModel c() {
        return this.f28474e;
    }

    Path d() {
        return this.f28470a;
    }
}
