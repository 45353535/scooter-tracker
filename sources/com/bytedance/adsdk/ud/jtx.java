package com.bytedance.adsdk.ud;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes6.dex */
class jtx implements Interpolator {
    private final float[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final float[] f15993ud;

    jtx(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.qdl = new float[i11];
        this.f15993ud = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.qdl[i12] = fArr[0];
            this.f15993ud[i12] = fArr[1];
        }
    }

    private static Path qdl(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.qdl.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.qdl[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.qdl;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f15993ud[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f15993ud;
        float f15 = fArr2[i10];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    jtx(float f10, float f11, float f12, float f13) {
        this(qdl(f10, f11, f12, f13));
    }
}
