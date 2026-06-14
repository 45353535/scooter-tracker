package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27633c;

    public TriangleEdgeTreatment(float f10, boolean z10) {
        this.f27632b = f10;
        this.f27633c = z10;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, @NonNull ShapePath shapePath) {
        if (!this.f27633c) {
            float f13 = this.f27632b;
            shapePath.lineTo(f11 - (f13 * f12), 0.0f, f11, (-f13) * f12);
            shapePath.lineTo(f11 + (this.f27632b * f12), 0.0f, f10, 0.0f);
        } else {
            shapePath.lineTo(f11 - (this.f27632b * f12), 0.0f);
            float f14 = this.f27632b;
            shapePath.lineTo(f11, f14 * f12, (f14 * f12) + f11, 0.0f);
            shapePath.lineTo(f10, 0.0f);
        }
    }
}
