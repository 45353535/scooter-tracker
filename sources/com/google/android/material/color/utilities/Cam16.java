package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Cam16 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final double[][] f26108k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final double[][] f26109l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f26110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f26111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f26112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f26113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f26114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f26115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f26116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f26117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f26118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double[] f26119j = {0.0d, 0.0d, 0.0d};

    private Cam16(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f26110a = d10;
        this.f26111b = d11;
        this.f26112c = d12;
        this.f26113d = d13;
        this.f26114e = d14;
        this.f26115f = d15;
        this.f26116g = d16;
        this.f26117h = d17;
        this.f26118i = d18;
    }

    static Cam16 a(int i10, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i10) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i10) >> 8);
        double dLinearized3 = ColorUtils.linearized(i10 & 255);
        return c((0.41233895d * dLinearized) + (0.35762064d * dLinearized2) + (0.18051042d * dLinearized3), (0.2126d * dLinearized) + (0.7152d * dLinearized2) + (0.0722d * dLinearized3), (dLinearized * 0.01932141d) + (dLinearized2 * 0.11916382d) + (dLinearized3 * 0.95034478d), viewingConditions);
    }

    private static Cam16 b(double d10, double d11, double d12, ViewingConditions viewingConditions) {
        double d13 = d10 / 100.0d;
        double dA = (4.0d / viewingConditions.a()) * Math.sqrt(d13) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d11 * viewingConditions.getFlRoot();
        double dSqrt = Math.sqrt(((d11 / Math.sqrt(d13)) * viewingConditions.a()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d12);
        double d14 = (1.7000000000000002d * d10) / ((0.007d * d10) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot) * 43.859649122807014d;
        return new Cam16(d12, d11, d10, dA, flRoot, dSqrt, d14, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    static Cam16 c(double d10, double d11, double d12, ViewingConditions viewingConditions) {
        double[][] dArr = f26108k;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        double d15 = (dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12);
        double d16 = viewingConditions.getRgbD()[0] * d13;
        double d17 = viewingConditions.getRgbD()[1] * d14;
        double d18 = viewingConditions.getRgbD()[2] * d15;
        double dPow = Math.pow((viewingConditions.b() * Math.abs(d16)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((viewingConditions.b() * Math.abs(d17)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((viewingConditions.b() * Math.abs(d18)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d16) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d17) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d18) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d19 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d20 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d21 = dSignum2 * 20.0d;
        double d22 = (((dSignum * 20.0d) + d21) + (21.0d * dSignum3)) / 20.0d;
        double d23 = (((dSignum * 40.0d) + d21) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d20, d19));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d24 = degrees;
        double radians = Math.toRadians(d24);
        double dPow4 = Math.pow((d23 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.a() * viewingConditions.e()) * 100.0d;
        double d25 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (4.0d / viewingConditions.a()) * Math.sqrt(d25) * (viewingConditions.getAw() + 4.0d);
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d24 < 20.14d ? d24 + 360.0d : d24) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.c()) * viewingConditions.d()) * Math.hypot(d19, d20)) / (d22 + 0.305d), 0.9d);
        double dSqrt = dPow5 * Math.sqrt(d25);
        double flRoot2 = dSqrt * viewingConditions.getFlRoot();
        double dSqrt2 = Math.sqrt((dPow5 * viewingConditions.a()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d26 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d24, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d26, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public static Cam16 fromInt(int i10) {
        return a(i10, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcs(double d10, double d11, double d12) {
        return fromUcsInViewingConditions(d10, d11, d12, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d10, double d11, double d12, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d11, d12) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d12, d11) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return b(d10 / (1.0d - ((d10 - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    int d(ViewingConditions viewingConditions) {
        double[] dArrE = e(viewingConditions, this.f26119j);
        return ColorUtils.argbFromXyz(dArrE[0], dArrE[1], dArrE[2]);
    }

    public double distance(@NonNull Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    double[] e(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.a()) / viewingConditions.e());
        double dC = dCos * 3846.153846153846d * viewingConditions.c() * viewingConditions.d();
        double nbb = aw / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d10 = (((0.305d + nbb) * 23.0d) * dPow) / (((dC * 23.0d) + ((11.0d * dPow) * dCos2)) + ((108.0d * dPow) * dSin));
        double d11 = dCos2 * d10;
        double d12 = d10 * dSin;
        double d13 = nbb * 460.0d;
        double d14 = (((451.0d * d11) + d13) + (288.0d * d12)) / 1403.0d;
        double d15 = ((d13 - (891.0d * d11)) - (261.0d * d12)) / 1403.0d;
        double d16 = ((d13 - (d11 * 220.0d)) - (d12 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d14) * (100.0d / viewingConditions.b()) * Math.pow(Math.max(0.0d, (Math.abs(d14) * 27.13d) / (400.0d - Math.abs(d14))), 2.380952380952381d);
        double dSignum2 = Math.signum(d15) * (100.0d / viewingConditions.b()) * Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d);
        double dSignum3 = Math.signum(d16) * (100.0d / viewingConditions.b()) * Math.pow(Math.max(0.0d, (Math.abs(d16) * 27.13d) / (400.0d - Math.abs(d16))), 2.380952380952381d);
        double d17 = dSignum / viewingConditions.getRgbD()[0];
        double d18 = dSignum2 / viewingConditions.getRgbD()[1];
        double d19 = dSignum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = f26109l;
        double[] dArr3 = dArr2[0];
        double d20 = (dArr3[0] * d17) + (dArr3[1] * d18) + (dArr3[2] * d19);
        double[] dArr4 = dArr2[1];
        double d21 = (dArr4[0] * d17) + (dArr4[1] * d18) + (dArr4[2] * d19);
        double[] dArr5 = dArr2[2];
        double d22 = (d17 * dArr5[0]) + (d18 * dArr5[1]) + (d19 * dArr5[2]);
        if (dArr == null) {
            return new double[]{d20, d21, d22};
        }
        dArr[0] = d20;
        dArr[1] = d21;
        dArr[2] = d22;
        return dArr;
    }

    public double getAstar() {
        return this.f26117h;
    }

    public double getBstar() {
        return this.f26118i;
    }

    public double getChroma() {
        return this.f26111b;
    }

    public double getHue() {
        return this.f26110a;
    }

    public double getJ() {
        return this.f26112c;
    }

    public double getJstar() {
        return this.f26116g;
    }

    public double getM() {
        return this.f26114e;
    }

    public double getQ() {
        return this.f26113d;
    }

    public double getS() {
        return this.f26115f;
    }

    public int toInt() {
        return d(ViewingConditions.DEFAULT);
    }
}
