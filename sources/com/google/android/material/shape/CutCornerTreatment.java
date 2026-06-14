package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class CutCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f27462a;

    public CutCornerTreatment() {
        this.f27462a = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        shapePath.reset(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }

    @Deprecated
    public CutCornerTreatment(float f10) {
        this.f27462a = f10;
    }
}
