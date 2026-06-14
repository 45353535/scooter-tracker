package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f25294a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f25295b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f25296c = new Matrix();

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Matrix evaluate(float f10, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
        matrix.getValues(this.f25294a);
        matrix2.getValues(this.f25295b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f25295b;
            float f11 = fArr[i10];
            float f12 = this.f25294a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f25296c.setValues(this.f25295b);
        return this.f25296c;
    }
}
