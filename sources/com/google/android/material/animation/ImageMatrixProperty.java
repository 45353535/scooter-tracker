package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f25293a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f25293a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public Matrix get(@NonNull ImageView imageView) {
        this.f25293a.set(imageView.getImageMatrix());
        return this.f25293a;
    }

    @Override // android.util.Property
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
