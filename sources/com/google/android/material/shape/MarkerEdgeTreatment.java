package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f27470b;

    public MarkerEdgeTreatment(float f10) {
        this.f27470b = f10 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean a() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, @NonNull ShapePath shapePath) {
        float fSqrt = (float) ((((double) this.f27470b) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f27470b, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.reset(f11 - fSqrt, ((float) (-((((double) this.f27470b) * Math.sqrt(2.0d)) - ((double) this.f27470b)))) + fSqrt2);
        shapePath.lineTo(f11, (float) (-((((double) this.f27470b) * Math.sqrt(2.0d)) - ((double) this.f27470b))));
        shapePath.lineTo(f11 + fSqrt, ((float) (-((((double) this.f27470b) * Math.sqrt(2.0d)) - ((double) this.f27470b)))) + fSqrt2);
    }
}
