package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4094v1 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39724c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f39726e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39722a = 90.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39725d = true;

    public C4094v1(float f10, float f11) {
        this.f39723b = f10;
        this.f39724c = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        float f11 = ((this.f39722a - 0.0f) * f10) + 0.0f;
        float f12 = this.f39723b;
        float f13 = this.f39724c;
        Camera camera = this.f39726e;
        Matrix matrix = t10.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f39725d) {
                camera.translate(0.0f, 0.0f, f10 * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * 0.0f);
            }
            camera.rotateY(f11);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f39726e = new Camera();
    }
}
