package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f26217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f26218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double[] f26219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f26220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f26221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f26222j;

    private ViewingConditions(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f26218f = d10;
        this.f26213a = d11;
        this.f26214b = d12;
        this.f26215c = d13;
        this.f26216d = d14;
        this.f26217e = d15;
        this.f26219g = dArr;
        this.f26220h = d16;
        this.f26221i = d17;
        this.f26222j = d18;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d10) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d10, double d11, double d12, boolean z10) {
        double d13;
        double dExp;
        double dMax = Math.max(0.1d, d11);
        double[][] dArr2 = Cam16.f26108k;
        double d14 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d15 = dArr3[0] * d14;
        double d16 = dArr[1];
        double d17 = d15 + (dArr3[1] * d16);
        double d18 = dArr[2];
        double d19 = d17 + (dArr3[2] * d18);
        double[] dArr4 = dArr2[1];
        double d20 = (dArr4[0] * d14) + (dArr4[1] * d16) + (dArr4[2] * d18);
        double[] dArr5 = dArr2[2];
        double d21 = (d14 * dArr5[0]) + (d16 * dArr5[1]) + (d18 * dArr5[2]);
        double d22 = (d12 / 10.0d) + 0.8d;
        double dLerp = d22 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d22 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d22 - 0.8d) * 10.0d);
        if (z10) {
            d13 = 0.1d;
            dExp = 1.0d;
        } else {
            d13 = 0.1d;
            dExp = (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d22;
        }
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, dExp);
        double[] dArr6 = {(((100.0d / d19) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d20) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d21) * dClampDouble) + 1.0d) - dClampDouble};
        double d23 = 5.0d * d10;
        double d24 = 1.0d / (d23 + 1.0d);
        double d25 = d24 * d24 * d24 * d24;
        double d26 = 1.0d - d25;
        double dCbrt = (d25 * d10) + (d26 * d13 * d26 * Math.cbrt(d23));
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d20) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d21) / 100.0d, 0.42d)};
        double d27 = dArr7[0];
        double d28 = (d27 * 400.0d) / (d27 + 27.13d);
        double d29 = dArr7[1];
        double d30 = (d29 * 400.0d) / (d29 + 27.13d);
        double d31 = dArr7[2];
        double[] dArr8 = {d28, d30, (400.0d * d31) / (d31 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d22, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    double a() {
        return this.f26216d;
    }

    double b() {
        return this.f26220h;
    }

    double c() {
        return this.f26217e;
    }

    double d() {
        return this.f26215c;
    }

    double e() {
        return this.f26222j;
    }

    public double getAw() {
        return this.f26213a;
    }

    public double getFlRoot() {
        return this.f26221i;
    }

    public double getN() {
        return this.f26218f;
    }

    public double getNbb() {
        return this.f26214b;
    }

    public double[] getRgbD() {
        return this.f26219g;
    }
}
