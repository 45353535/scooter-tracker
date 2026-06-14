package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes9.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f25589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f25590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f25591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f25592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f25593g = -1.0f;

    public BottomAppBarTopEdgeTreatment(float f10, float f11, float f12) {
        this.f25589c = f10;
        this.f25588b = f11;
        k(f12);
        this.f25592f = 0.0f;
    }

    float e() {
        return this.f25591e;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, @NonNull ShapePath shapePath) {
        float f13;
        float f14;
        float f15 = this.f25590d;
        if (f15 == 0.0f) {
            shapePath.lineTo(f10, 0.0f);
            return;
        }
        float f16 = ((this.f25589c * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f25588b;
        float f18 = f11 + this.f25592f;
        float f19 = (this.f25591e * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            shapePath.lineTo(f10, 0.0f);
            return;
        }
        float f20 = this.f25593g;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        shapePath.lineTo(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        shapePath.addArc(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            shapePath.addArc(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f25589c;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            shapePath.addArc(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f25589c;
            shapePath.lineTo(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f25589c;
            shapePath.addArc(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        shapePath.addArc(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        shapePath.lineTo(f10, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f25593g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.f25590d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.f25592f;
    }

    float i() {
        return this.f25589c;
    }

    float j() {
        return this.f25588b;
    }

    void k(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f25591e = f10;
    }

    void l(float f10) {
        this.f25589c = f10;
    }

    void n(float f10) {
        this.f25588b = f10;
    }

    void o(float f10) {
        this.f25592f = f10;
    }

    public void setFabCornerSize(float f10) {
        this.f25593g = f10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f10) {
        this.f25590d = f10;
    }
}
