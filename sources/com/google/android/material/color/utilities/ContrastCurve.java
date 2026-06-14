package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ContrastCurve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f26125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f26126d;

    public ContrastCurve(double d10, double d11, double d12, double d13) {
        this.f26123a = d10;
        this.f26124b = d11;
        this.f26125c = d12;
        this.f26126d = d13;
    }

    public double get(double d10) {
        return d10 <= -1.0d ? this.f26123a : d10 < 0.0d ? MathUtils.lerp(this.f26123a, this.f26124b, (d10 - (-1.0d)) / 1.0d) : d10 < 0.5d ? MathUtils.lerp(this.f26124b, this.f26125c, (d10 - 0.0d) / 0.5d) : d10 < 1.0d ? MathUtils.lerp(this.f26125c, this.f26126d, (d10 - 0.5d) / 0.5d) : this.f26126d;
    }
}
