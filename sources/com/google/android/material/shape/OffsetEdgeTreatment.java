package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EdgeTreatment f27529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f27530c;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f10) {
        this.f27529b = edgeTreatment;
        this.f27530c = f10;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    boolean a() {
        return this.f27529b.a();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, @NonNull ShapePath shapePath) {
        this.f27529b.getEdgePath(f10, f11 - this.f27530c, f12, shapePath);
    }
}
